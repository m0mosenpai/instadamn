package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class FBBioLinkSocialContextType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ FBBioLinkSocialContextType[] A03;
    public static final FBBioLinkSocialContextType A04;
    public static final FBBioLinkSocialContextType A05;
    public static final FBBioLinkSocialContextType A06;
    public static final FBBioLinkSocialContextType A07;
    public static final FBBioLinkSocialContextType A08;
    public static final FBBioLinkSocialContextType A09;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(ordinal());
    }

    static {
        FBBioLinkSocialContextType fBBioLinkSocialContextType = new FBBioLinkSocialContextType("UNRECOGNIZED", 0, "FBBioLinkSocialContextType_unspecified");
        A09 = fBBioLinkSocialContextType;
        FBBioLinkSocialContextType fBBioLinkSocialContextType2 = new FBBioLinkSocialContextType("FOLLOWER_COUNT", 1, "follower_count");
        A04 = fBBioLinkSocialContextType2;
        FBBioLinkSocialContextType fBBioLinkSocialContextType3 = new FBBioLinkSocialContextType("MUTUAL_FOLLOWERS", 2, "mutual_followers");
        A05 = fBBioLinkSocialContextType3;
        FBBioLinkSocialContextType fBBioLinkSocialContextType4 = new FBBioLinkSocialContextType("MUTUAL_FRIENDS", 3, "mutual_friends");
        A06 = fBBioLinkSocialContextType4;
        FBBioLinkSocialContextType fBBioLinkSocialContextType5 = new FBBioLinkSocialContextType("NEW_POSTS", 4, "new_posts");
        A07 = fBBioLinkSocialContextType5;
        FBBioLinkSocialContextType fBBioLinkSocialContextType6 = new FBBioLinkSocialContextType(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 5, NetInfoModule.CONNECTION_TYPE_NONE);
        A08 = fBBioLinkSocialContextType6;
        FBBioLinkSocialContextType[] fBBioLinkSocialContextTypeArr = {fBBioLinkSocialContextType, fBBioLinkSocialContextType2, fBBioLinkSocialContextType3, fBBioLinkSocialContextType4, fBBioLinkSocialContextType5, fBBioLinkSocialContextType6, new FBBioLinkSocialContextType("RECENT_POSTS", 6, "recent_posts")};
        A03 = fBBioLinkSocialContextTypeArr;
        A02 = AbstractC12190kN.A00(fBBioLinkSocialContextTypeArr);
        FBBioLinkSocialContextType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (FBBioLinkSocialContextType fBBioLinkSocialContextType7 : values) {
            linkedHashMap.put(fBBioLinkSocialContextType7.A00, fBBioLinkSocialContextType7);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(88);
    }

    public static FBBioLinkSocialContextType valueOf(String str) {
        return (FBBioLinkSocialContextType) Enum.valueOf(FBBioLinkSocialContextType.class, str);
    }

    public static FBBioLinkSocialContextType[] values() {
        return (FBBioLinkSocialContextType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public FBBioLinkSocialContextType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
