package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class AppSwitcherBadgeStatus implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ AppSwitcherBadgeStatus[] A03;
    public static final AppSwitcherBadgeStatus A04;
    public static final AppSwitcherBadgeStatus A05;
    public static final AppSwitcherBadgeStatus A06;
    public static final AppSwitcherBadgeStatus A07;
    public static final AppSwitcherBadgeStatus A08;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        AppSwitcherBadgeStatus appSwitcherBadgeStatus = new AppSwitcherBadgeStatus("UNRECOGNIZED", 0, "AppSwitcherBadgeStatus_unspecified");
        A08 = appSwitcherBadgeStatus;
        AppSwitcherBadgeStatus appSwitcherBadgeStatus2 = new AppSwitcherBadgeStatus("HIDE_TEXT_POST_APP_SWITCHER_BADGE", 1, "hide_text_post_app_switcher_badge");
        A05 = appSwitcherBadgeStatus2;
        AppSwitcherBadgeStatus appSwitcherBadgeStatus3 = new AppSwitcherBadgeStatus("SHOW_TEXT_POST_APP_SWITCHER_BADGE", 2, "show_text_post_app_switcher_badge");
        A07 = appSwitcherBadgeStatus3;
        AppSwitcherBadgeStatus appSwitcherBadgeStatus4 = new AppSwitcherBadgeStatus("HIDE_IG_APP_SWITCHER_BADGE", 3, "hide_ig_app_switcher_badge");
        A04 = appSwitcherBadgeStatus4;
        AppSwitcherBadgeStatus appSwitcherBadgeStatus5 = new AppSwitcherBadgeStatus("SHOW_IG_APP_SWITCHER_BADGE", 4, "show_ig_app_switcher_badge");
        A06 = appSwitcherBadgeStatus5;
        AppSwitcherBadgeStatus[] appSwitcherBadgeStatusArr = {appSwitcherBadgeStatus, appSwitcherBadgeStatus2, appSwitcherBadgeStatus3, appSwitcherBadgeStatus4, appSwitcherBadgeStatus5};
        A03 = appSwitcherBadgeStatusArr;
        A02 = AbstractC12190kN.A00(appSwitcherBadgeStatusArr);
        AppSwitcherBadgeStatus[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (AppSwitcherBadgeStatus appSwitcherBadgeStatus6 : values) {
            A18.put(appSwitcherBadgeStatus6.A00, appSwitcherBadgeStatus6);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(50);
    }

    public static AppSwitcherBadgeStatus valueOf(String str) {
        return (AppSwitcherBadgeStatus) Enum.valueOf(AppSwitcherBadgeStatus.class, str);
    }

    public static AppSwitcherBadgeStatus[] values() {
        return (AppSwitcherBadgeStatus[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public AppSwitcherBadgeStatus(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
