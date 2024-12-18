package com.instagram.business.boost.model;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class AdCreativeAuthorizationCategory implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ AdCreativeAuthorizationCategory[] A03;
    public static final AdCreativeAuthorizationCategory A04;
    public static final AdCreativeAuthorizationCategory A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        AdCreativeAuthorizationCategory adCreativeAuthorizationCategory = new AdCreativeAuthorizationCategory(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0, NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
        A04 = adCreativeAuthorizationCategory;
        AdCreativeAuthorizationCategory adCreativeAuthorizationCategory2 = new AdCreativeAuthorizationCategory("POLITICAL", 1, "POLITICAL");
        A05 = adCreativeAuthorizationCategory2;
        AdCreativeAuthorizationCategory[] adCreativeAuthorizationCategoryArr = {adCreativeAuthorizationCategory, adCreativeAuthorizationCategory2, new AdCreativeAuthorizationCategory("POLITICAL_WITH_DIGITALLY_CREATED_MEDIA", 2, "POLITICAL_WITH_DIGITALLY_CREATED_MEDIA")};
        A03 = adCreativeAuthorizationCategoryArr;
        A02 = AbstractC12190kN.A00(adCreativeAuthorizationCategoryArr);
        AdCreativeAuthorizationCategory[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (AdCreativeAuthorizationCategory adCreativeAuthorizationCategory3 : values) {
            linkedHashMap.put(adCreativeAuthorizationCategory3.A00, adCreativeAuthorizationCategory3);
        }
        A01 = linkedHashMap;
        CREATOR = new C70220WId(29);
    }

    public static AdCreativeAuthorizationCategory valueOf(String str) {
        return (AdCreativeAuthorizationCategory) Enum.valueOf(AdCreativeAuthorizationCategory.class, str);
    }

    public static AdCreativeAuthorizationCategory[] values() {
        return (AdCreativeAuthorizationCategory[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public AdCreativeAuthorizationCategory(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
