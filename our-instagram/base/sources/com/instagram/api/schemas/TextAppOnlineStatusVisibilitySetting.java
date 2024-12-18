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
/* loaded from: classes5.dex */
public final class TextAppOnlineStatusVisibilitySetting implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ TextAppOnlineStatusVisibilitySetting[] A03;
    public static final TextAppOnlineStatusVisibilitySetting A04;
    public static final TextAppOnlineStatusVisibilitySetting A05;
    public static final TextAppOnlineStatusVisibilitySetting A06;
    public static final TextAppOnlineStatusVisibilitySetting A07;
    public static final TextAppOnlineStatusVisibilitySetting A08;
    public static final TextAppOnlineStatusVisibilitySetting A09;
    public static final TextAppOnlineStatusVisibilitySetting A0A;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        TextAppOnlineStatusVisibilitySetting textAppOnlineStatusVisibilitySetting = new TextAppOnlineStatusVisibilitySetting("UNRECOGNIZED", 0, "TextAppOnlineStatusVisibilitySetting_unspecified");
        A0A = textAppOnlineStatusVisibilitySetting;
        TextAppOnlineStatusVisibilitySetting textAppOnlineStatusVisibilitySetting2 = new TextAppOnlineStatusVisibilitySetting("DEFAULT_UNSET", 1, "DEFAULT_UNSET");
        A04 = textAppOnlineStatusVisibilitySetting2;
        TextAppOnlineStatusVisibilitySetting textAppOnlineStatusVisibilitySetting3 = new TextAppOnlineStatusVisibilitySetting("DEPRECATED_FOLLOWERS", 2, "DEPRECATED_FOLLOWERS");
        A05 = textAppOnlineStatusVisibilitySetting3;
        TextAppOnlineStatusVisibilitySetting textAppOnlineStatusVisibilitySetting4 = new TextAppOnlineStatusVisibilitySetting("DEPRECATED_NOBODY", 3, "DEPRECATED_NOBODY");
        A06 = textAppOnlineStatusVisibilitySetting4;
        TextAppOnlineStatusVisibilitySetting textAppOnlineStatusVisibilitySetting5 = new TextAppOnlineStatusVisibilitySetting("EVERYONE", 4, "EVERYONE");
        A07 = textAppOnlineStatusVisibilitySetting5;
        TextAppOnlineStatusVisibilitySetting textAppOnlineStatusVisibilitySetting6 = new TextAppOnlineStatusVisibilitySetting("FOLLOWERS", 5, "FOLLOWERS");
        A08 = textAppOnlineStatusVisibilitySetting6;
        TextAppOnlineStatusVisibilitySetting textAppOnlineStatusVisibilitySetting7 = new TextAppOnlineStatusVisibilitySetting("FOLLOWERS_YOU_FOLLOW", 6, "FOLLOWERS_YOU_FOLLOW");
        A09 = textAppOnlineStatusVisibilitySetting7;
        TextAppOnlineStatusVisibilitySetting[] textAppOnlineStatusVisibilitySettingArr = {textAppOnlineStatusVisibilitySetting, textAppOnlineStatusVisibilitySetting2, textAppOnlineStatusVisibilitySetting3, textAppOnlineStatusVisibilitySetting4, textAppOnlineStatusVisibilitySetting5, textAppOnlineStatusVisibilitySetting6, textAppOnlineStatusVisibilitySetting7, new TextAppOnlineStatusVisibilitySetting("NOBODY", 7, "NOBODY")};
        A03 = textAppOnlineStatusVisibilitySettingArr;
        A02 = AbstractC12190kN.A00(textAppOnlineStatusVisibilitySettingArr);
        TextAppOnlineStatusVisibilitySetting[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (TextAppOnlineStatusVisibilitySetting textAppOnlineStatusVisibilitySetting8 : values) {
            A18.put(textAppOnlineStatusVisibilitySetting8.A00, textAppOnlineStatusVisibilitySetting8);
        }
        A01 = A18;
        CREATOR = new C41857IgB(48);
    }

    public static TextAppOnlineStatusVisibilitySetting valueOf(String str) {
        return (TextAppOnlineStatusVisibilitySetting) Enum.valueOf(TextAppOnlineStatusVisibilitySetting.class, str);
    }

    public static TextAppOnlineStatusVisibilitySetting[] values() {
        return (TextAppOnlineStatusVisibilitySetting[]) A03.clone();
    }

    public TextAppOnlineStatusVisibilitySetting(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
