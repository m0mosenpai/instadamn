package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9Zk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211739Zk extends C0T6 {
    public Object A00;
    public Object A01;
    public boolean A02;
    public final int A03;
    public final Object A04;
    public final Object A05;

    public C211739Zk(Map map) {
        this.A03 = 2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        this.A03 = 2;
        C14360o3.A0B(map, 5);
        this.A02 = false;
        this.A04 = A1I;
        this.A01 = A1E;
        this.A05 = A1E2;
        this.A00 = map;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C211739Zk) && ((C211739Zk) obj).A03 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A03
            switch(r0) {
                case 0: goto L26;
                case 1: goto L60;
                case 2: goto L64;
                case 3: goto L98;
                default: goto L5;
            }
        L5:
            if (r2 == r3) goto Lcd
            r0 = 4
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto L24
            X.9Zk r3 = (X.C211739Zk) r3
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L24
            java.lang.Object r1 = r2.A05
            java.lang.Object r0 = r3.A05
        L1e:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto Lcd
        L24:
            r0 = 0
            return r0
        L26:
            if (r2 == r3) goto Lcd
            r0 = 0
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto L24
            X.9Zk r3 = (X.C211739Zk) r3
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L24
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L24
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L24
            java.lang.Object r1 = r2.A05
            java.lang.Object r0 = r3.A05
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L24
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 == r0) goto Lcd
            goto L24
        L60:
            if (r2 == r3) goto Lcd
            r0 = 1
            goto L9b
        L64:
            if (r2 == r3) goto Lcd
            r0 = 2
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto L24
            X.9Zk r3 = (X.C211739Zk) r3
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto L24
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L24
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L24
            java.lang.Object r1 = r2.A05
            java.lang.Object r0 = r3.A05
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L24
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            goto L1e
        L98:
            if (r2 == r3) goto Lcd
            r0 = 3
        L9b:
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto L24
            X.9Zk r3 = (X.C211739Zk) r3
            java.lang.Object r1 = r2.A05
            java.lang.Object r0 = r3.A05
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L24
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L24
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto L24
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L24
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            goto L1e
        Lcd:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C211739Zk.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int A0G;
        int i;
        Object obj;
        switch (this.A03) {
            case 0:
                A0G = (((((AbstractC166987dD.A0G(this.A04) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A05)) * 31;
                i = 1237;
                if (this.A02) {
                    i = 1231;
                    break;
                }
                break;
            case 1:
                A0G = AbstractC166997dE.A0J(this.A01, AbstractC167007dF.A0D(this.A02, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0G(this.A05))));
                obj = this.A04;
                i = obj.hashCode();
                break;
            case 2:
                int i2 = 1237;
                if (this.A02) {
                    i2 = 1231;
                }
                A0G = AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A04, i2 * 31)));
                obj = this.A00;
                i = obj.hashCode();
                break;
            case 3:
                i = (AbstractC167007dF.A0D(this.A02, (AbstractC166987dD.A0G(this.A05) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31;
                A0G = AbstractC166997dE.A0I(this.A04);
                break;
            default:
                A0G = AbstractC166987dD.A0G(this.A04);
                i = AbstractC167017dG.A0M(this.A05);
                break;
        }
        return i + A0G;
    }

    public final String toString() {
        if (2 - this.A03 != 0) {
            return super.toString();
        }
        String A0L = AnonymousClass001.A0L("hasView : ", '\n', this.A02);
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("tagsInfo : ");
        A1C.append(this.A04);
        A1C.append('\n');
        String obj = A1C.toString();
        StringBuilder A1C2 = AbstractC166987dD.A1C();
        A1C2.append("updatePercentages : ");
        A1C2.append(this.A01);
        A1C2.append('\n');
        String obj2 = A1C2.toString();
        StringBuilder A1C3 = AbstractC166987dD.A1C();
        A1C3.append("updateTimes : ");
        A1C3.append(this.A05);
        A1C3.append('\n');
        String obj3 = A1C3.toString();
        StringBuilder A1C4 = AbstractC166987dD.A1C();
        A1C4.append("extras : ");
        A1C4.append(this.A00);
        A1C4.append('\n');
        String A11 = AnonymousClass001.A11(A0L, obj, obj2, obj3, A1C4.toString());
        C14360o3.A07(A11);
        return A11;
    }

    public C211739Zk(CharSequence charSequence, Integer num) {
        this.A03 = 4;
        C14360o3.A0B(charSequence, 1);
        this.A04 = charSequence;
        this.A05 = num;
    }

    public C211739Zk(AA2 aa2, C5NL c5nl, C8FC c8fc, C202278x7 c202278x7, int i, boolean z) {
        this.A03 = 0;
        aa2 = (i & 2) != 0 ? null : aa2;
        c8fc = (i & 4) != 0 ? null : c8fc;
        c202278x7 = (i & 8) != 0 ? null : c202278x7;
        this.A03 = 0;
        C14360o3.A0B(c5nl, 1);
        this.A04 = c5nl;
        this.A01 = aa2;
        this.A00 = c8fc;
        this.A05 = c202278x7;
        this.A02 = z;
    }

    public C211739Zk(C38688GzT c38688GzT, C3r3 c3r3, C75113Zb c75113Zb, CharSequence charSequence, boolean z) {
        this.A03 = 1;
        C14360o3.A0B(charSequence, 1);
        this.A05 = charSequence;
        this.A00 = c38688GzT;
        this.A02 = z;
        this.A01 = c3r3;
        this.A04 = c75113Zb;
    }

    public C211739Zk(C5QE c5qe, Integer num, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        this.A03 = 3;
        this.A05 = c5qe;
        this.A00 = num;
        this.A02 = z;
        this.A01 = interfaceC16660sJ;
        this.A04 = interfaceC16820sZ;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C211739Zk(C5QE c5qe) {
        this(c5qe, (Integer) null, (InterfaceC16820sZ) null, (InterfaceC16660sJ) null, false);
        this.A03 = 3;
    }
}
