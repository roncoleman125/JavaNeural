# sunspots.awk
# This script extracts the sunspot results from the output of MultiSunspot.java.
# It uses the file, multi-sunspots-1960-1979.txt, which was manually cleaned up.
# author: Ron.Coleman, 19 Aug 2022
{
  predict[$1]=$2
  actual[$1]=$3
}
END {
  print "year actual predicted"
  for(year=1960; year <= 1979; year++) {
    print year,actual[year],predict[year]
  }
}
