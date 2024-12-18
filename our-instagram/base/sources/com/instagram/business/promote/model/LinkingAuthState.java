package com.instagram.business.promote.model;

import X.AbstractC12190kN;
import X.C70220WId;
import X.MSZ;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class LinkingAuthState implements Parcelable {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ LinkingAuthState[] A02;
    public static final LinkingAuthState A03;
    public static final LinkingAuthState A04;
    public static final LinkingAuthState A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        LinkingAuthState linkingAuthState = new LinkingAuthState("NEW_AUTH", 0, "new_auth");
        A04 = linkingAuthState;
        LinkingAuthState linkingAuthState2 = new LinkingAuthState("PRO2PRO_NEW_AUTH", 1, "pro2pro_new_auth");
        A05 = linkingAuthState2;
        LinkingAuthState linkingAuthState3 = new LinkingAuthState("BUSINESS_TOKEN_OR_UNKNOWN", 2, "business_token_or_unknown");
        A03 = linkingAuthState3;
        LinkingAuthState[] linkingAuthStateArr = {linkingAuthState, linkingAuthState2, linkingAuthState3};
        A02 = linkingAuthStateArr;
        A01 = AbstractC12190kN.A00(linkingAuthStateArr);
        CREATOR = new C70220WId(57);
    }

    public static LinkingAuthState valueOf(String str) {
        return (LinkingAuthState) Enum.valueOf(LinkingAuthState.class, str);
    }

    public static LinkingAuthState[] values() {
        return (LinkingAuthState[]) A02.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public LinkingAuthState(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MSZ.A12(parcel, this);
    }
}
