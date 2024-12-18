package X;

import java.util.ArrayList;

/* renamed from: X.2i5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C56162i5 implements InterfaceC56172i6 {
    public InterfaceC56232iC A01;
    public C56152i4 A02 = null;
    public float A00 = 0.0f;
    public ArrayList A03 = new ArrayList();
    public boolean A04 = false;

    public final void A05(C56152i4 c56152i4, C56152i4 c56152i42, C56152i4 c56152i43, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            }
            this.A00 = i;
        }
        InterfaceC56232iC interfaceC56232iC = this.A01;
        if (!z) {
            interfaceC56232iC.E6w(c56152i4, -1.0f);
            interfaceC56232iC.E6w(c56152i42, 1.0f);
            interfaceC56232iC.E6w(c56152i43, 1.0f);
        } else {
            interfaceC56232iC.E6w(c56152i4, 1.0f);
            interfaceC56232iC.E6w(c56152i42, -1.0f);
            interfaceC56232iC.E6w(c56152i43, -1.0f);
        }
    }

    public final void A06(C56152i4 c56152i4, C56152i4 c56152i42, C56152i4 c56152i43, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            }
            this.A00 = i;
        }
        InterfaceC56232iC interfaceC56232iC = this.A01;
        if (!z) {
            interfaceC56232iC.E6w(c56152i4, -1.0f);
            interfaceC56232iC.E6w(c56152i42, 1.0f);
            interfaceC56232iC.E6w(c56152i43, -1.0f);
        } else {
            interfaceC56232iC.E6w(c56152i4, 1.0f);
            interfaceC56232iC.E6w(c56152i42, -1.0f);
            interfaceC56232iC.E6w(c56152i43, 1.0f);
        }
    }

    @Override // X.InterfaceC56172i6
    public C56152i4 BdO(C56142i3 c56142i3, boolean[] zArr) {
        return A00(this, null, zArr);
    }

    public static C56152i4 A00(C56162i5 c56162i5, C56152i4 c56152i4, boolean[] zArr) {
        Integer num;
        InterfaceC56232iC interfaceC56232iC = c56162i5.A01;
        int i = ((C56222iB) interfaceC56232iC).A00;
        C56152i4 c56152i42 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            float CEd = interfaceC56232iC.CEd(i2);
            if (CEd < 0.0f) {
                C56152i4 CEc = interfaceC56232iC.CEc(i2);
                if ((zArr == null || !zArr[CEc.A02]) && CEc != c56152i4 && (((num = CEc.A06) == C05F.A0C || num == C05F.A0N) && CEd < f)) {
                    f = CEd;
                    c56152i42 = CEc;
                }
            }
        }
        return c56152i42;
    }

    public final void A03(C56142i3 c56142i3, C56152i4 c56152i4, boolean z) {
        if (c56152i4.A08) {
            InterfaceC56232iC interfaceC56232iC = this.A01;
            this.A00 += c56152i4.A00 * interfaceC56232iC.AX5(c56152i4);
            interfaceC56232iC.EEd(c56152i4, z);
            if (z) {
                c56152i4.A02(this);
            }
            if (((C56222iB) interfaceC56232iC).A00 == 0) {
                this.A04 = true;
                c56142i3.A04 = true;
            }
        }
    }

    public final void A04(C56152i4 c56152i4) {
        C56152i4 c56152i42 = this.A02;
        if (c56152i42 != null) {
            this.A01.E6w(c56152i42, -1.0f);
            this.A02.A01 = -1;
            this.A02 = null;
        }
        InterfaceC56232iC interfaceC56232iC = this.A01;
        float EEd = interfaceC56232iC.EEd(c56152i4, true) * (-1.0f);
        this.A02 = c56152i4;
        if (EEd != 1.0f) {
            this.A00 /= EEd;
            C56222iB c56222iB = (C56222iB) interfaceC56232iC;
            int i = c56222iB.A01;
            for (int i2 = 0; i != -1 && i2 < c56222iB.A00; i2++) {
                float[] fArr = c56222iB.A02;
                fArr[i] = fArr[i] / EEd;
                i = c56222iB.A04[i];
            }
        }
    }

    public void A07(C56162i5 c56162i5, C56142i3 c56142i3, boolean z) {
        C56222iB c56222iB = (C56222iB) this.A01;
        C56152i4 c56152i4 = c56162i5.A02;
        float AX5 = c56222iB.AX5(c56152i4);
        c56222iB.EEd(c56152i4, z);
        InterfaceC56232iC interfaceC56232iC = c56162i5.A01;
        int i = ((C56222iB) interfaceC56232iC).A00;
        for (int i2 = 0; i2 < i; i2++) {
            C56152i4 CEc = interfaceC56232iC.CEc(i2);
            c56222iB.A7c(CEc, interfaceC56232iC.AX5(CEc) * AX5, z);
        }
        this.A00 += c56162i5.A00 * AX5;
        if (z) {
            c56162i5.A02.A02(this);
        }
        if (this.A02 != null && c56222iB.A00 == 0) {
            this.A04 = true;
            c56142i3.A04 = true;
        }
    }

    @Override // X.InterfaceC56172i6
    public void A8S(C56152i4 c56152i4) {
        int i = c56152i4.A04;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.A01.E6w(c56152i4, f);
    }

    @Override // X.InterfaceC56172i6
    public void clear() {
        this.A01.clear();
        this.A02 = null;
        this.A00 = 0.0f;
    }

    @Override // X.InterfaceC56172i6
    public boolean isEmpty() {
        if (this.A02 == null && this.A00 == 0.0f && ((C56222iB) this.A01).A00 == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r11 = this;
            X.2i4 r2 = r11.A02
            if (r2 != 0) goto L91
            java.lang.String r1 = "0"
        L6:
            java.lang.String r0 = " = "
            java.lang.String r8 = X.AnonymousClass001.A0R(r1, r0)
            float r1 = r11.A00
            r7 = 0
            r10 = 0
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 == 0) goto L8f
            java.lang.String r8 = X.AnonymousClass001.A0N(r8, r1)
            r9 = 1
        L19:
            X.2iC r6 = r11.A01
            r0 = r6
            X.2iB r0 = (X.C56222iB) r0
            int r5 = r0.A00
        L20:
            if (r7 >= r5) goto La4
            X.2i4 r1 = r6.CEc(r7)
            if (r1 == 0) goto L64
            float r4 = r6.CEd(r7)
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 == 0) goto L64
            java.lang.String r3 = r1.toString()
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r9 != 0) goto L73
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 >= 0) goto L4e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r0 = "- "
        L46:
            r1.append(r0)
            java.lang.String r8 = r1.toString()
            float r4 = r4 * r2
        L4e:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            if (r1 != 0) goto L67
            r0.<init>()
        L59:
            r0.append(r8)
            r0.append(r3)
            java.lang.String r8 = r0.toString()
            r9 = 1
        L64:
            int r7 = r7 + 1
            goto L20
        L67:
            r0.<init>()
            r0.append(r8)
            r0.append(r4)
            java.lang.String r8 = " "
            goto L59
        L73:
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r0 <= 0) goto L89
            r1.append(r8)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r8 = X.AnonymousClass001.A0R(r8, r0)
            goto L4e
        L89:
            r1.append(r8)
            java.lang.String r0 = " - "
            goto L46
        L8f:
            r9 = 0
            goto L19
        L91:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = ""
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L6
        La4:
            if (r9 != 0) goto Lac
            java.lang.String r0 = "0.0"
            java.lang.String r8 = X.AnonymousClass001.A0R(r8, r0)
        Lac:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56162i5.toString():java.lang.String");
    }

    public C56162i5(C56182i7 c56182i7) {
        this.A01 = new C56222iB(this, c56182i7);
    }

    public C56162i5() {
    }
}
