package com.facebook.wellbeing.timeinapp.jnibindings;

import X.C116045Nj;
import com.google.common.collect.ImmutableList;

/* loaded from: classes3.dex */
public class TimeInAppIntervalWithEventList {
    public final ImmutableList.Builder intervals = new ImmutableList.Builder();

    public void add(long j, long j2, long j3, long j4, long j5, long j6) {
        this.intervals.add((Object) new C116045Nj(j, j2, j3, j4, j5, j6));
    }
}
