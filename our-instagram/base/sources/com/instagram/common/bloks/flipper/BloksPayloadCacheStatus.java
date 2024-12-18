package com.instagram.common.bloks.flipper;

import X.AbstractC12190kN;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class BloksPayloadCacheStatus {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ BloksPayloadCacheStatus[] A01;
    public static final BloksPayloadCacheStatus A02;
    public static final BloksPayloadCacheStatus A03;

    static {
        BloksPayloadCacheStatus bloksPayloadCacheStatus = new BloksPayloadCacheStatus("ResponseUncached", 0);
        A02 = bloksPayloadCacheStatus;
        BloksPayloadCacheStatus bloksPayloadCacheStatus2 = new BloksPayloadCacheStatus("ResponseWrittenToCache", 1);
        A03 = bloksPayloadCacheStatus2;
        BloksPayloadCacheStatus[] bloksPayloadCacheStatusArr = {bloksPayloadCacheStatus, bloksPayloadCacheStatus2, new BloksPayloadCacheStatus("ResponseReadFromCache", 2)};
        A01 = bloksPayloadCacheStatusArr;
        A00 = AbstractC12190kN.A00(bloksPayloadCacheStatusArr);
    }

    public static BloksPayloadCacheStatus valueOf(String str) {
        return (BloksPayloadCacheStatus) Enum.valueOf(BloksPayloadCacheStatus.class, str);
    }

    public static BloksPayloadCacheStatus[] values() {
        return (BloksPayloadCacheStatus[]) A01.clone();
    }

    public BloksPayloadCacheStatus(String str, int i) {
    }
}
