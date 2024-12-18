package com.facebook.wellbeing.timeinapp.jnibindings;

import com.google.common.collect.ImmutableList;

/* loaded from: classes11.dex */
public class TimeInAppIntervalList {
    public final ImmutableList.Builder intervals = new ImmutableList.Builder();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.VJA, java.lang.Object] */
    public void add(long j, long j2, long j3, long j4) {
        ImmutableList.Builder builder = this.intervals;
        ?? obj = new Object();
        obj.A01 = j;
        obj.A00 = j3;
        builder.add((Object) obj);
    }
}
