package X;

/* renamed from: X.MwH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51873MwH extends C0T6 implements InterfaceC57855PlL {
    public final EnumC53174NfV A00;
    public final Integer A01;
    public final java.util.Set A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51873MwH) {
                C51873MwH c51873MwH = (C51873MwH) obj;
                if (this.A00 != c51873MwH.A00 || !C14360o3.A0K(this.A02, c51873MwH.A02) || this.A01 != c51873MwH.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0J = AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A00));
        int intValue = this.A01.intValue();
        if (1 != intValue) {
            str = "UNKNOWN";
        } else {
            str = "CAMERA_OFF";
        }
        return A0J + AbstractC25226BEj.A02(str, intValue);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r3 == X.EnumC53174NfV.A06) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51873MwH(X.EnumC53174NfV r3, java.lang.Integer r4, java.util.Set r5) {
        /*
            r2 = this;
            X.AbstractC167027dH.A13(r3, r5, r4)
            r2.<init>()
            r2.A00 = r3
            r2.A02 = r5
            r2.A01 = r4
            X.NfV r0 = X.EnumC53174NfV.A03
            if (r3 == r0) goto L15
            X.NfV r1 = X.EnumC53174NfV.A06
            r0 = 0
            if (r3 != r1) goto L16
        L15:
            r0 = 1
        L16:
            r2.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51873MwH.<init>(X.NfV, java.lang.Integer, java.util.Set):void");
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcScreenShareStateModel(state=");
        A1C.append(this.A00);
        A1C.append(", peersSharing=");
        A1C.append(this.A02);
        A1C.append(", reasonUnavailable=");
        Integer num = this.A01;
        if (num != null) {
            if (1 - num.intValue() != 0) {
                str = "UNKNOWN";
            } else {
                str = "CAMERA_OFF";
            }
        } else {
            str = "null";
        }
        return AbstractC25236BEt.A0Y(str, A1C);
    }
}
