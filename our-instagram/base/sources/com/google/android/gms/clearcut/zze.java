package com.google.android.gms.clearcut;

import X.AbstractC128825rw;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C63474SlF;
import X.SSI;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.clearcut.zzr;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(31);
    public zzr A00;
    public boolean A01;
    public byte[] A02;
    public int[] A03;
    public int[] A04;
    public ExperimentTokens[] A05;
    public String[] A06;
    public byte[][] A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zze) {
                zze zzeVar = (zze) obj;
                if (!SSI.A01(this.A00, zzeVar.A00) || !Arrays.equals(this.A02, zzeVar.A02) || !Arrays.equals(this.A03, zzeVar.A03) || !Arrays.equals(this.A06, zzeVar.A06) || !Arrays.equals(this.A04, zzeVar.A04) || !Arrays.deepEquals(this.A07, zzeVar.A07) || !Arrays.equals(this.A05, zzeVar.A05) || this.A01 != zzeVar.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A02, this.A03, this.A06, null, null, null, this.A04, this.A07, this.A05, Boolean.valueOf(this.A01)});
    }

    public final String toString() {
        String str;
        StringBuilder A0s = AbstractC58318PtA.A0s("LogEventParcelable[");
        A0s.append(this.A00);
        A0s.append(", LogEventBytes: ");
        byte[] bArr = this.A02;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        A0s.append(str);
        A0s.append(", TestCodes: ");
        A0s.append(Arrays.toString(this.A03));
        A0s.append(", MendelPackages: ");
        A0s.append(Arrays.toString(this.A06));
        A0s.append(", LogEvent: ");
        A0s.append((Object) null);
        A0s.append(", ExtensionProducer: ");
        A0s.append((Object) null);
        A0s.append(", VeProducer: ");
        A0s.append((Object) null);
        A0s.append(", ExperimentIDs: ");
        A0s.append(Arrays.toString(this.A04));
        A0s.append(", ExperimentTokens: ");
        A0s.append(Arrays.toString(this.A07));
        A0s.append(", ExperimentTokensParcelables: ");
        A0s.append(Arrays.toString(this.A05));
        A0s.append(", AddPhenotypeExperimentTokens: ");
        A0s.append(this.A01);
        return AbstractC58319PtB.A0w(A0s);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0F(parcel, this.A02, 3, AbstractC58322PtE.A1U(parcel, this.A00, i));
        int[] iArr = this.A03;
        if (iArr != null) {
            int A01 = AbstractC128825rw.A01(parcel, 4);
            parcel.writeIntArray(iArr);
            AbstractC128825rw.A06(parcel, A01);
        }
        AbstractC128825rw.A0H(parcel, this.A06, 5);
        int[] iArr2 = this.A04;
        if (iArr2 != null) {
            int A012 = AbstractC128825rw.A01(parcel, 6);
            parcel.writeIntArray(iArr2);
            AbstractC128825rw.A06(parcel, A012);
        }
        AbstractC128825rw.A0I(parcel, this.A07, 7);
        AbstractC128825rw.A09(parcel, 8, this.A01);
        AbstractC128825rw.A0G(parcel, this.A05, 9, i);
        AbstractC128825rw.A06(parcel, A04);
    }
}
