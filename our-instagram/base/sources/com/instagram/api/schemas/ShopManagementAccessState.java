package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ShopManagementAccessState implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ShopManagementAccessState[] A03;
    public static final ShopManagementAccessState A04;
    public static final ShopManagementAccessState A05;
    public static final ShopManagementAccessState A06;
    public static final ShopManagementAccessState A07;
    public static final ShopManagementAccessState A08;
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
        ShopManagementAccessState shopManagementAccessState = new ShopManagementAccessState("UNRECOGNIZED", 0, "ShopManagementAccessState_unspecified");
        A08 = shopManagementAccessState;
        ShopManagementAccessState shopManagementAccessState2 = new ShopManagementAccessState("ADD", 1, "add");
        A04 = shopManagementAccessState2;
        ShopManagementAccessState shopManagementAccessState3 = new ShopManagementAccessState("ADD_HIDE", 2, "add_hide");
        A05 = shopManagementAccessState3;
        ShopManagementAccessState shopManagementAccessState4 = new ShopManagementAccessState("ADD_HIDE_UNIFIED_INVENTORY", 3, "add_hide_unified_inventory");
        A06 = shopManagementAccessState4;
        ShopManagementAccessState shopManagementAccessState5 = new ShopManagementAccessState(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 4, NetInfoModule.CONNECTION_TYPE_NONE);
        A07 = shopManagementAccessState5;
        ShopManagementAccessState[] shopManagementAccessStateArr = {shopManagementAccessState, shopManagementAccessState2, shopManagementAccessState3, shopManagementAccessState4, shopManagementAccessState5};
        A03 = shopManagementAccessStateArr;
        A02 = AbstractC12190kN.A00(shopManagementAccessStateArr);
        ShopManagementAccessState[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (ShopManagementAccessState shopManagementAccessState6 : values) {
            linkedHashMap.put(shopManagementAccessState6.A00, shopManagementAccessState6);
        }
        A01 = linkedHashMap;
        CREATOR = new C206139Av(6);
    }

    public static ShopManagementAccessState valueOf(String str) {
        return (ShopManagementAccessState) Enum.valueOf(ShopManagementAccessState.class, str);
    }

    public static ShopManagementAccessState[] values() {
        return (ShopManagementAccessState[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ShopManagementAccessState(String str, int i, String str2) {
        this.A00 = str2;
    }
}
