package com.google.android.gms.common.server.converter;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC58318PtA;
import X.AbstractC58322PtE;
import X.C63474SlF;
import X.InterfaceC65252Tgi;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class StringToIntConverter extends AbstractSafeParcelable implements InterfaceC65252Tgi {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(50);
    public final int A00;
    public final SparseArray A01;
    public final HashMap A02;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = AbstractC58322PtE.A06(parcel, this.A00);
        ArrayList A1E = AbstractC166987dD.A1E();
        HashMap hashMap = this.A02;
        Iterator A0l = AbstractC167007dF.A0l(hashMap);
        while (A0l.hasNext()) {
            String A1B = AbstractC166987dD.A1B(A0l);
            A1E.add(new zac(A1B, AbstractC166987dD.A0H(hashMap.get(A1B))));
        }
        AbstractC58322PtE.A1G(parcel, A1E, 2, A06);
    }

    public StringToIntConverter(int i, ArrayList arrayList) {
        this.A00 = i;
        this.A02 = AbstractC166987dD.A1G();
        this.A01 = AbstractC58318PtA.A0G();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zac zacVar = (zac) arrayList.get(i2);
            String str = zacVar.A02;
            int i3 = zacVar.A01;
            this.A02.put(str, Integer.valueOf(i3));
            this.A01.put(i3, str);
        }
    }

    public StringToIntConverter() {
        this.A00 = 1;
        this.A02 = AbstractC166987dD.A1G();
        this.A01 = AbstractC58318PtA.A0G();
    }
}
