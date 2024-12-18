package com.facebook.papaya.store;

import com.google.common.collect.ImmutableMap;

/* loaded from: classes12.dex */
public final class Record {
    public final long mId;
    public final String mName;
    public final ImmutableMap mPropertyMap;
    public final long mTimestamp;

    public Record(String str, long j, ImmutableMap immutableMap, long j2) {
        this.mName = str;
        this.mId = j;
        this.mPropertyMap = immutableMap;
        this.mTimestamp = j2;
    }
}
