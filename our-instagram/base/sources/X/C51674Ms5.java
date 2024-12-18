package X;

/* renamed from: X.Ms5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51674Ms5 extends C0T6 {
    public final long A00;
    public final C51624MrH A01;
    public final Integer A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51674Ms5) {
                C51674Ms5 c51674Ms5 = (C51674Ms5) obj;
                if (this.A02 != c51674Ms5.A02 || this.A05 != c51674Ms5.A05 || this.A04 != c51674Ms5.A04 || this.A03 != c51674Ms5.A03 || !C14360o3.A0K(this.A01, c51674Ms5.A01) || this.A00 != c51674Ms5.A00 || this.A07 != c51674Ms5.A07) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0C;
        Integer num = this.A02;
        if (num == null) {
            A0C = 0;
        } else {
            A0C = AbstractC25230BEn.A0C(num, AbstractC53945NtI.A00(num));
        }
        return AbstractC166987dD.A0K(this.A07, AbstractC25236BEt.A01(this.A00, (AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A05, A0C * 31))) + AbstractC166997dE.A0I(this.A01)) * 31));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r7 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51674Ms5(X.C51624MrH r2, java.lang.Integer r3, long r4, boolean r6, boolean r7, boolean r8, boolean r9) {
        /*
            r1 = this;
            r1.<init>()
            r1.A02 = r3
            r1.A05 = r6
            r1.A04 = r7
            r1.A03 = r8
            r1.A01 = r2
            r1.A00 = r4
            r1.A07 = r9
            if (r6 != 0) goto L16
            r0 = 0
            if (r7 == 0) goto L17
        L16:
            r0 = 1
        L17:
            r1.A06 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51674Ms5.<init>(X.MrH, java.lang.Integer, long, boolean, boolean, boolean, boolean):void");
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("UiState(xpostMode=");
        Integer num = this.A02;
        if (num != null) {
            str = AbstractC53945NtI.A00(num);
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", currentReelXAR=");
        A1C.append(this.A05);
        A1C.append(", currentReelCCP=");
        A1C.append(this.A04);
        A1C.append(", ccpWithByPass=");
        A1C.append(this.A03);
        A1C.append(", fbReelsPrivacyInfo=");
        A1C.append(this.A01);
        A1C.append(", fbReelsPrivacyInfoUpdateTime=");
        A1C.append(this.A00);
        A1C.append(", useXpostDesignV2=");
        return AbstractC25236BEt.A0a(A1C, this.A07);
    }
}
