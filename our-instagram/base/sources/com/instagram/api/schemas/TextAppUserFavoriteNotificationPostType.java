package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class TextAppUserFavoriteNotificationPostType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ TextAppUserFavoriteNotificationPostType[] A03;
    public static final TextAppUserFavoriteNotificationPostType A04;
    public static final TextAppUserFavoriteNotificationPostType A05;
    public static final TextAppUserFavoriteNotificationPostType A06;
    public static final TextAppUserFavoriteNotificationPostType A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        TextAppUserFavoriteNotificationPostType textAppUserFavoriteNotificationPostType = new TextAppUserFavoriteNotificationPostType("UNRECOGNIZED", 0, "TextAppUserFavoriteNotificationPostType_unspecified");
        A07 = textAppUserFavoriteNotificationPostType;
        TextAppUserFavoriteNotificationPostType textAppUserFavoriteNotificationPostType2 = new TextAppUserFavoriteNotificationPostType(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 1, NetInfoModule.CONNECTION_TYPE_NONE);
        A04 = textAppUserFavoriteNotificationPostType2;
        TextAppUserFavoriteNotificationPostType textAppUserFavoriteNotificationPostType3 = new TextAppUserFavoriteNotificationPostType("POSTS_AND_REPLIES", 2, "posts_and_replies");
        A05 = textAppUserFavoriteNotificationPostType3;
        TextAppUserFavoriteNotificationPostType textAppUserFavoriteNotificationPostType4 = new TextAppUserFavoriteNotificationPostType("POSTS_ONLY", 3, "posts_only");
        A06 = textAppUserFavoriteNotificationPostType4;
        TextAppUserFavoriteNotificationPostType[] textAppUserFavoriteNotificationPostTypeArr = {textAppUserFavoriteNotificationPostType, textAppUserFavoriteNotificationPostType2, textAppUserFavoriteNotificationPostType3, textAppUserFavoriteNotificationPostType4, new TextAppUserFavoriteNotificationPostType("REPLIES_ONLY", 4, "replies_only")};
        A03 = textAppUserFavoriteNotificationPostTypeArr;
        A02 = AbstractC12190kN.A00(textAppUserFavoriteNotificationPostTypeArr);
        TextAppUserFavoriteNotificationPostType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (TextAppUserFavoriteNotificationPostType textAppUserFavoriteNotificationPostType5 : values) {
            A18.put(textAppUserFavoriteNotificationPostType5.A00, textAppUserFavoriteNotificationPostType5);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(54);
    }

    public static TextAppUserFavoriteNotificationPostType valueOf(String str) {
        return (TextAppUserFavoriteNotificationPostType) Enum.valueOf(TextAppUserFavoriteNotificationPostType.class, str);
    }

    public static TextAppUserFavoriteNotificationPostType[] values() {
        return (TextAppUserFavoriteNotificationPostType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public TextAppUserFavoriteNotificationPostType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
