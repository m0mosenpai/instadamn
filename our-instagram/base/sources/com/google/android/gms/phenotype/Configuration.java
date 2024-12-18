package com.google.android.gms.phenotype;

import X.AbstractC128825rw;
import X.AbstractC166997dE;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC62225S2v;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes10.dex */
public class Configuration extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(73);
    public final int A00;
    public final Map A01 = new TreeMap();
    public final zzi[] A02;
    public final String[] A03;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.A00 - ((Configuration) obj).A00;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Configuration)) {
            return false;
        }
        Configuration configuration = (Configuration) obj;
        return this.A00 == configuration.A00 && AbstractC62225S2v.A00(this.A01, configuration.A01) && Arrays.equals(this.A03, configuration.A03);
    }

    public final String toString() {
        StringBuilder A0s = AbstractC58318PtA.A0s("Configuration(");
        A0s.append(this.A00);
        A0s.append(", ");
        A0s.append("(");
        Iterator A16 = AbstractC166997dE.A16(this.A01);
        while (A16.hasNext()) {
            A0s.append(A16.next());
            A0s.append(", ");
        }
        AbstractC58320PtC.A1N(")", ", ", "(", A0s);
        String[] strArr = this.A03;
        if (strArr != null) {
            for (String str : strArr) {
                A0s.append(str);
                A0s.append(", ");
            }
        } else {
            A0s.append("null");
        }
        A0s.append(")");
        return AbstractC166997dE.A0x(")", A0s);
    }

    public Configuration(zzi[] zziVarArr, String[] strArr, int i) {
        this.A00 = i;
        this.A02 = zziVarArr;
        for (zzi zziVar : zziVarArr) {
            this.A01.put(zziVar.A01, zziVar);
        }
        this.A03 = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A07(parcel, 2, this.A00);
        AbstractC128825rw.A0G(parcel, this.A02, 3, i);
        AbstractC128825rw.A0H(parcel, this.A03, 4);
        AbstractC128825rw.A06(parcel, A04);
    }
}
