package com.instagram.video.live.streaming.common;

import X.AbstractC12190kN;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class BroadcastFailureType {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ BroadcastFailureType[] A01;
    public static final BroadcastFailureType A02;
    public static final BroadcastFailureType A03;
    public static final BroadcastFailureType A04;
    public static final BroadcastFailureType A05;
    public static final BroadcastFailureType A06;
    public static final BroadcastFailureType A07;

    static {
        BroadcastFailureType broadcastFailureType = new BroadcastFailureType("InitFailure", 0);
        A03 = broadcastFailureType;
        BroadcastFailureType broadcastFailureType2 = new BroadcastFailureType("InitFailureWithUserMessage", 1);
        A05 = broadcastFailureType2;
        BroadcastFailureType broadcastFailureType3 = new BroadcastFailureType("InitFailureFeatureBlock", 2);
        A04 = broadcastFailureType3;
        BroadcastFailureType broadcastFailureType4 = new BroadcastFailureType("CameraFailure", 3);
        A02 = broadcastFailureType4;
        BroadcastFailureType broadcastFailureType5 = new BroadcastFailureType("RtcSessionFailure", 4);
        A06 = broadcastFailureType5;
        BroadcastFailureType broadcastFailureType6 = new BroadcastFailureType("RtcSessionUnavailable", 5);
        A07 = broadcastFailureType6;
        BroadcastFailureType[] broadcastFailureTypeArr = {broadcastFailureType, broadcastFailureType2, broadcastFailureType3, broadcastFailureType4, broadcastFailureType5, broadcastFailureType6, new BroadcastFailureType("SpeedTestFailure", 6)};
        A01 = broadcastFailureTypeArr;
        A00 = AbstractC12190kN.A00(broadcastFailureTypeArr);
    }

    public static BroadcastFailureType valueOf(String str) {
        return (BroadcastFailureType) Enum.valueOf(BroadcastFailureType.class, str);
    }

    public static BroadcastFailureType[] values() {
        return (BroadcastFailureType[]) A01.clone();
    }

    public BroadcastFailureType(String str, int i) {
    }
}
