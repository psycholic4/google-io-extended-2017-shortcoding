package com.rainist.ioextended;fun solve(a:List<Long>):List<Long> =if(a.size<1)a else a.take(1)+solve(a-a[0]-a[0]*4/3)
