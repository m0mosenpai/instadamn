package com.instagram.video.live.mvvm.model.enums;

import X.AbstractC12190kN;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class IgLiveBroadcastType {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ IgLiveBroadcastType[] A01;
    public static final IgLiveBroadcastType A02;
    public static final IgLiveBroadcastType A03;
    public static final IgLiveBroadcastType A04;

    static {
        IgLiveBroadcastType igLiveBroadcastType = new IgLiveBroadcastType("RTC", 0);
        A02 = igLiveBroadcastType;
        IgLiveBroadcastType igLiveBroadcastType2 = new IgLiveBroadcastType("RTMP", 1);
        A03 = igLiveBroadcastType2;
        IgLiveBroadcastType igLiveBroadcastType3 = new IgLiveBroadcastType("RTMP_SWAP_ENABLED", 2);
        A04 = igLiveBroadcastType3;
        IgLiveBroadcastType[] igLiveBroadcastTypeArr = {igLiveBroadcastType, igLiveBroadcastType2, igLiveBroadcastType3};
        A01 = igLiveBroadcastTypeArr;
        A00 = AbstractC12190kN.A00(igLiveBroadcastTypeArr);
    }

    public static IgLiveBroadcastType valueOf(String str) {
        return (IgLiveBroadcastType) Enum.valueOf(IgLiveBroadcastType.class, str);
    }

    public static IgLiveBroadcastType[] values() {
        return (IgLiveBroadcastType[]) A01.clone();
    }

    public IgLiveBroadcastType(String str, int i) {
    }
}
