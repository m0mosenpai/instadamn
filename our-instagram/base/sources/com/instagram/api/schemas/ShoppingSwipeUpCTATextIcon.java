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
public final class ShoppingSwipeUpCTATextIcon implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ShoppingSwipeUpCTATextIcon[] A03;
    public static final ShoppingSwipeUpCTATextIcon A04;
    public static final ShoppingSwipeUpCTATextIcon A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ShoppingSwipeUpCTATextIcon shoppingSwipeUpCTATextIcon = new ShoppingSwipeUpCTATextIcon("UNRECOGNIZED", 0, "ShoppingSwipeUpCTATextIcon_unspecified");
        A05 = shoppingSwipeUpCTATextIcon;
        ShoppingSwipeUpCTATextIcon shoppingSwipeUpCTATextIcon2 = new ShoppingSwipeUpCTATextIcon(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 1, NetInfoModule.CONNECTION_TYPE_NONE);
        A04 = shoppingSwipeUpCTATextIcon2;
        ShoppingSwipeUpCTATextIcon[] shoppingSwipeUpCTATextIconArr = {shoppingSwipeUpCTATextIcon, shoppingSwipeUpCTATextIcon2, new ShoppingSwipeUpCTATextIcon("SHOPPING", 2, "shopping")};
        A03 = shoppingSwipeUpCTATextIconArr;
        A02 = AbstractC12190kN.A00(shoppingSwipeUpCTATextIconArr);
        ShoppingSwipeUpCTATextIcon[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ShoppingSwipeUpCTATextIcon shoppingSwipeUpCTATextIcon3 : values) {
            A18.put(shoppingSwipeUpCTATextIcon3.A00, shoppingSwipeUpCTATextIcon3);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(3);
    }

    public static ShoppingSwipeUpCTATextIcon valueOf(String str) {
        return (ShoppingSwipeUpCTATextIcon) Enum.valueOf(ShoppingSwipeUpCTATextIcon.class, str);
    }

    public static ShoppingSwipeUpCTATextIcon[] values() {
        return (ShoppingSwipeUpCTATextIcon[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ShoppingSwipeUpCTATextIcon(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
