package com.facebook.businessextension.jscalls;

import X.AbstractC166987dD;
import X.AbstractC31171DnF;
import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes10.dex */
public class RequestAutofillJSBridgeCallData implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(32);
    public final String A00;
    public final LinkedHashSet A01;
    public final LinkedHashSet A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ArrayList A1E;
        ArrayList A1E2;
        parcel.writeString(this.A00);
        LinkedHashSet linkedHashSet = this.A02;
        if (linkedHashSet != null) {
            A1E = AbstractC166987dD.A1F(linkedHashSet);
        } else {
            A1E = AbstractC166987dD.A1E();
        }
        parcel.writeStringList(A1E);
        LinkedHashSet linkedHashSet2 = this.A01;
        if (linkedHashSet2 != null) {
            A1E2 = AbstractC166987dD.A1F(linkedHashSet2);
        } else {
            A1E2 = AbstractC166987dD.A1E();
        }
        parcel.writeStringList(A1E2);
    }

    public RequestAutofillJSBridgeCallData(Parcel parcel) {
        LinkedHashSet A0l;
        LinkedHashSet A0l2;
        this.A00 = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
        if (createStringArrayList != null) {
            A0l = new LinkedHashSet(createStringArrayList);
        } else {
            A0l = AbstractC31171DnF.A0l();
        }
        this.A02 = A0l;
        if (createStringArrayList2 != null) {
            A0l2 = new LinkedHashSet(createStringArrayList2);
        } else {
            A0l2 = AbstractC31171DnF.A0l();
        }
        this.A01 = A0l2;
    }

    public RequestAutofillJSBridgeCallData(String str, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2) {
        this.A00 = str;
        this.A02 = linkedHashSet;
        this.A01 = linkedHashSet2;
    }
}
