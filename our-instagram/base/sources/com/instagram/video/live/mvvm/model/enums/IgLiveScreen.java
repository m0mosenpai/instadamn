package com.instagram.video.live.mvvm.model.enums;

import X.AbstractC12190kN;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class IgLiveScreen {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ IgLiveScreen[] A01;
    public static final IgLiveScreen A02;
    public static final IgLiveScreen A03;

    static {
        IgLiveScreen igLiveScreen = new IgLiveScreen("PRE_LIVE", 0);
        A03 = igLiveScreen;
        IgLiveScreen igLiveScreen2 = new IgLiveScreen("LIVE", 1);
        A02 = igLiveScreen2;
        IgLiveScreen[] igLiveScreenArr = {igLiveScreen, igLiveScreen2, new IgLiveScreen("POST_LIVE", 2)};
        A01 = igLiveScreenArr;
        A00 = AbstractC12190kN.A00(igLiveScreenArr);
    }

    public static IgLiveScreen valueOf(String str) {
        return (IgLiveScreen) Enum.valueOf(IgLiveScreen.class, str);
    }

    public static IgLiveScreen[] values() {
        return (IgLiveScreen[]) A01.clone();
    }

    public IgLiveScreen(String str, int i) {
    }
}
