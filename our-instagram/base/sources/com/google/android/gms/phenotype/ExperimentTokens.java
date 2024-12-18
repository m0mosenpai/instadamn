package com.google.android.gms.phenotype;

import X.AbstractC128825rw;
import X.AbstractC166997dE;
import X.AbstractC25225BEi;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC62225S2v;
import X.C63471SlC;
import X.MSZ;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public class ExperimentTokens extends AbstractSafeParcelable {
    public static final ExperimentTokens A08;
    public static final byte[][] A09;
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(74);
    public final String A00;
    public final byte[] A01;
    public final int[] A02;
    public final byte[][] A03;
    public final byte[][] A04;
    public final byte[][] A05;
    public final byte[][] A06;
    public final byte[][] A07;

    static {
        byte[][] bArr = new byte[0];
        A09 = bArr;
        A08 = new ExperimentTokens("", null, null, bArr, bArr, bArr, bArr, null);
    }

    public static List A00(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList A17 = AbstractC25225BEi.A17(bArr.length);
        for (byte[] bArr2 : bArr) {
            A17.add(Base64.encodeToString(bArr2, 3));
        }
        Collections.sort(A17);
        return A17;
    }

    public final boolean equals(Object obj) {
        Collection collection;
        Collection collection2;
        if (!(obj instanceof ExperimentTokens)) {
            return false;
        }
        ExperimentTokens experimentTokens = (ExperimentTokens) obj;
        if (!AbstractC62225S2v.A00(this.A00, experimentTokens.A00) || !Arrays.equals(this.A01, experimentTokens.A01) || !AbstractC62225S2v.A00(A00(this.A03), A00(experimentTokens.A03)) || !AbstractC62225S2v.A00(A00(this.A04), A00(experimentTokens.A04)) || !AbstractC62225S2v.A00(A00(this.A05), A00(experimentTokens.A05)) || !AbstractC62225S2v.A00(A00(this.A06), A00(experimentTokens.A06))) {
            return false;
        }
        int[] iArr = this.A02;
        if (iArr == null) {
            collection = Collections.emptyList();
        } else {
            ArrayList A17 = AbstractC25225BEi.A17(iArr.length);
            for (int i : iArr) {
                AbstractC166997dE.A1W(A17, i);
            }
            Collections.sort(A17);
            collection = A17;
        }
        int[] iArr2 = experimentTokens.A02;
        if (iArr2 == null) {
            collection2 = Collections.emptyList();
        } else {
            ArrayList A172 = AbstractC25225BEi.A17(iArr2.length);
            for (int i2 : iArr2) {
                AbstractC166997dE.A1W(A172, i2);
            }
            Collections.sort(A172);
            collection2 = A172;
        }
        if (!AbstractC62225S2v.A00(collection, collection2) || !AbstractC62225S2v.A00(A00(this.A07), A00(experimentTokens.A07))) {
            return false;
        }
        return true;
    }

    public final String toString() {
        String A0u;
        StringBuilder A0s = AbstractC58318PtA.A0s("ExperimentTokens");
        A0s.append("(");
        String str = this.A00;
        if (str == null) {
            A0u = "null";
        } else {
            StringBuilder A0q = AbstractC58318PtA.A0q(AbstractC58319PtB.A05(str) + 2);
            A0q.append("'");
            A0u = MSZ.A0u(str, "'", A0q);
        }
        A0s.append(A0u);
        A0s.append(", ");
        byte[] bArr = this.A01;
        A0s.append(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
        A0s.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
        if (bArr == null) {
            A0s.append("null");
        } else {
            A0s.append("'");
            A0s.append(Base64.encodeToString(bArr, 3));
            A0s.append("'");
        }
        A0s.append(", ");
        A01("GAIA", A0s, this.A03);
        A0s.append(", ");
        A01("PSEUDO", A0s, this.A04);
        A0s.append(", ");
        A01("ALWAYS", A0s, this.A05);
        A0s.append(", ");
        A01("OTHER", A0s, this.A06);
        A0s.append(", ");
        int[] iArr = this.A02;
        A0s.append("weak");
        A0s.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
        if (iArr == null) {
            A0s.append("null");
        } else {
            A0s.append("(");
            int length = iArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                if (!z) {
                    A0s.append(", ");
                }
                A0s.append(i2);
                i++;
                z = false;
            }
            A0s.append(")");
        }
        A0s.append(", ");
        A01("directs", A0s, this.A07);
        return AbstractC166997dE.A0x(")", A0s);
    }

    public ExperimentTokens(String str, byte[] bArr, int[] iArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, byte[][] bArr6) {
        this.A00 = str;
        this.A01 = bArr;
        this.A03 = bArr2;
        this.A04 = bArr3;
        this.A05 = bArr4;
        this.A06 = bArr5;
        this.A02 = iArr;
        this.A07 = bArr6;
    }

    public static void A01(String str, StringBuilder sb, byte[][] bArr) {
        String str2;
        sb.append(str);
        sb.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
        if (bArr == null) {
            str2 = "null";
        } else {
            sb.append("(");
            int length = bArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                byte[] bArr2 = bArr[i];
                if (!z) {
                    AbstractC58318PtA.A1S(sb);
                }
                sb.append("'");
                sb.append(Base64.encodeToString(bArr2, 3));
                sb.append("'");
                i++;
                z = false;
            }
            str2 = ")";
        }
        sb.append(str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0B(parcel, this.A00);
        AbstractC128825rw.A0F(parcel, this.A01, 3, false);
        AbstractC128825rw.A0I(parcel, this.A03, 4);
        AbstractC128825rw.A0I(parcel, this.A04, 5);
        AbstractC128825rw.A0I(parcel, this.A05, 6);
        AbstractC128825rw.A0I(parcel, this.A06, 7);
        int[] iArr = this.A02;
        if (iArr != null) {
            int A01 = AbstractC128825rw.A01(parcel, 8);
            parcel.writeIntArray(iArr);
            AbstractC128825rw.A06(parcel, A01);
        }
        AbstractC128825rw.A0I(parcel, this.A07, 9);
        AbstractC128825rw.A06(parcel, A04);
    }
}
