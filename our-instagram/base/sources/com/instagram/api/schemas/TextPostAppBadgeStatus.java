package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class TextPostAppBadgeStatus implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ TextPostAppBadgeStatus[] A03;
    public static final TextPostAppBadgeStatus A04;
    public static final TextPostAppBadgeStatus A05;
    public static final TextPostAppBadgeStatus A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        TextPostAppBadgeStatus textPostAppBadgeStatus = new TextPostAppBadgeStatus("UNRECOGNIZED", 0, "TextPostAppBadgeStatus_unspecified");
        A06 = textPostAppBadgeStatus;
        TextPostAppBadgeStatus textPostAppBadgeStatus2 = new TextPostAppBadgeStatus("HIDE_TEXT_POST_APP_BADGE", 1, "hide_text_post_app_badge");
        A04 = textPostAppBadgeStatus2;
        TextPostAppBadgeStatus textPostAppBadgeStatus3 = new TextPostAppBadgeStatus("SHOW_TEXT_POST_APP_BADGE", 2, "show_text_post_app_badge");
        A05 = textPostAppBadgeStatus3;
        TextPostAppBadgeStatus[] textPostAppBadgeStatusArr = {textPostAppBadgeStatus, textPostAppBadgeStatus2, textPostAppBadgeStatus3};
        A03 = textPostAppBadgeStatusArr;
        A02 = AbstractC12190kN.A00(textPostAppBadgeStatusArr);
        TextPostAppBadgeStatus[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (TextPostAppBadgeStatus textPostAppBadgeStatus4 : values) {
            A18.put(textPostAppBadgeStatus4.A00, textPostAppBadgeStatus4);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(58);
    }

    public static TextPostAppBadgeStatus valueOf(String str) {
        return (TextPostAppBadgeStatus) Enum.valueOf(TextPostAppBadgeStatus.class, str);
    }

    public static TextPostAppBadgeStatus[] values() {
        return (TextPostAppBadgeStatus[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public TextPostAppBadgeStatus(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
