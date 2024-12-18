package com.instagram.video.live.streaming.common;

import X.AbstractC12190kN;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class BroadcastType {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ BroadcastType[] A01;
    public static final BroadcastType A02;
    public static final BroadcastType A03;
    public static final BroadcastType A04;
    public static final BroadcastType A05;
    public static final BroadcastType A06;

    static {
        BroadcastType broadcastType = new BroadcastType("LIVESWAP_RTMP", 0);
        A04 = broadcastType;
        BroadcastType broadcastType2 = new BroadcastType("LIVESWAP_TRANSITION_IG_INFRA", 1);
        A05 = broadcastType2;
        BroadcastType broadcastType3 = new BroadcastType("LIVESWAP_TRANSITION_RSYS_INFRA", 2);
        A06 = broadcastType3;
        BroadcastType broadcastType4 = new BroadcastType("LIVESWAP_RTC_IG_INFRA", 3);
        A02 = broadcastType4;
        BroadcastType broadcastType5 = new BroadcastType("LIVESWAP_RTC_RSYS_INFRA", 4);
        A03 = broadcastType5;
        BroadcastType[] broadcastTypeArr = {broadcastType, broadcastType2, broadcastType3, broadcastType4, broadcastType5};
        A01 = broadcastTypeArr;
        A00 = AbstractC12190kN.A00(broadcastTypeArr);
    }

    public static BroadcastType valueOf(String str) {
        return (BroadcastType) Enum.valueOf(BroadcastType.class, str);
    }

    public static BroadcastType[] values() {
        return (BroadcastType[]) A01.clone();
    }

    public BroadcastType(String str, int i) {
    }
}
