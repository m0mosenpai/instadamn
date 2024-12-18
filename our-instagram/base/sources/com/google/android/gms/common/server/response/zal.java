package com.google.android.gms.common.server.response;

import X.AbstractC128825rw;
import X.AbstractC166987dD;
import X.AbstractC43593JPy;
import X.AbstractC58322PtE;
import X.C63474SlF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(55);
    public final int A00;
    public final String A01;
    public final ArrayList A02;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = AbstractC58322PtE.A06(parcel, this.A00);
        AbstractC128825rw.A0B(parcel, this.A01);
        AbstractC128825rw.A0E(parcel, this.A02, 3, false);
        AbstractC128825rw.A06(parcel, A06);
    }

    public zal(String str, Map map) {
        ArrayList A1E;
        this.A00 = 1;
        this.A01 = str;
        if (map == null) {
            A1E = null;
        } else {
            A1E = AbstractC166987dD.A1E();
            Iterator A12 = AbstractC43593JPy.A12(map);
            while (A12.hasNext()) {
                String A1B = AbstractC166987dD.A1B(A12);
                A1E.add(new zam((FastJsonResponse$Field) map.get(A1B), A1B));
            }
        }
        this.A02 = A1E;
    }

    public zal(String str, ArrayList arrayList, int i) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = arrayList;
    }
}
