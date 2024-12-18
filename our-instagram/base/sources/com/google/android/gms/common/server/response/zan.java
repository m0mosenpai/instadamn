package com.google.android.gms.common.server.response;

import X.AbstractC128825rw;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC43593JPy;
import X.AbstractC58319PtB;
import X.C3U5;
import X.C63474SlF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(54);
    public final int A00;
    public final String A01;
    public final HashMap A02;

    public zan(String str, ArrayList arrayList, int i) {
        this.A00 = i;
        HashMap A1G = AbstractC166987dD.A1G();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zalVar = (zal) arrayList.get(i2);
            String str2 = zalVar.A01;
            HashMap A1G2 = AbstractC166987dD.A1G();
            ArrayList arrayList2 = zalVar.A02;
            C3U5.A02(arrayList2);
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zamVar = (zam) zalVar.A02.get(i3);
                A1G2.put(zamVar.A02, zamVar.A01);
            }
            A1G.put(str2, A1G2);
        }
        this.A02 = A1G;
        C3U5.A02(str);
        this.A01 = str;
        Iterator A0l = AbstractC167007dF.A0l(A1G);
        while (A0l.hasNext()) {
            Map map = (Map) A1G.get(A0l.next());
            Iterator A12 = AbstractC43593JPy.A12(map);
            while (A12.hasNext()) {
                ((FastJsonResponse$Field) map.get(A12.next())).A00 = this;
            }
        }
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        HashMap hashMap = this.A02;
        Iterator A0l = AbstractC167007dF.A0l(hashMap);
        while (A0l.hasNext()) {
            String A1B = AbstractC166987dD.A1B(A0l);
            A1C.append(A1B);
            A1C.append(":\n");
            Map map = (Map) hashMap.get(A1B);
            Iterator A12 = AbstractC43593JPy.A12(map);
            while (A12.hasNext()) {
                String A1B2 = AbstractC166987dD.A1B(A12);
                A1C.append("  ");
                A1C.append(A1B2);
                A1C.append(": ");
                A1C.append(map.get(A1B2));
            }
        }
        return A1C.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A05(parcel, this.A00);
        ArrayList A1E = AbstractC166987dD.A1E();
        HashMap hashMap = this.A02;
        Iterator A0l = AbstractC167007dF.A0l(hashMap);
        while (A0l.hasNext()) {
            String A1B = AbstractC166987dD.A1B(A0l);
            A1E.add(new zal(A1B, (Map) hashMap.get(A1B)));
        }
        AbstractC128825rw.A0E(parcel, A1E, 2, false);
        AbstractC128825rw.A0C(parcel, this.A01, 3, false);
        AbstractC128825rw.A06(parcel, A04);
    }
}
