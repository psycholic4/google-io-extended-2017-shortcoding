package com.rainist.ioextended;typealias L=List<Long>;fun solve(a:L):L =if(a.size<1)a else a.take(1)+solve(a-a[0]-a[0]*4/3)
