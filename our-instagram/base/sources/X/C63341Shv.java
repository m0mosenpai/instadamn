package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Shv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63341Shv {
    public static final C63341Shv A03 = new C63341Shv(true);
    public boolean A00;
    public boolean A01;
    public final TZI A02;

    public C63341Shv(boolean z) {
        RYr rYr = new RYr(0);
        this.A02 = rYr;
        if (!this.A01) {
            rYr.A05();
            this.A01 = true;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0024. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(com.google.protobuf.CodedOutputStream r2, X.EnumC61183Rgj r3, java.lang.Object r4, int r5) {
        /*
            X.Rgj r0 = X.EnumC61183Rgj.A07
            if (r3 != r0) goto L16
            X.TEQ r4 = (X.TEQ) r4
            int r1 = r5 << 3
            r0 = r1 | 3
            r2.A07(r0)
            r4.A0F(r2)
            r0 = r1 | 4
        L12:
            r2.A07(r0)
            return
        L16:
            int r1 = r3.A00
            int r0 = r5 << 3
            r0 = r0 | r1
            r2.A07(r0)
            int[] r0 = X.AbstractC62339S7j.A00
            int r0 = X.AbstractC58318PtA.A06(r3, r0)
            switch(r0) {
                case 1: goto L5a;
                case 2: goto L63;
                case 3: goto L28;
                case 4: goto L28;
                case 5: goto L55;
                case 6: goto Lbc;
                case 7: goto Lb4;
                case 8: goto L6c;
                case 9: goto L75;
                case 10: goto L78;
                case 11: goto L85;
                case 12: goto L8f;
                case 13: goto L36;
                case 14: goto Lb4;
                case 15: goto Lbc;
                case 16: goto L3b;
                case 17: goto L2d;
                case 18: goto L44;
                default: goto L27;
            }
        L27:
            return
        L28:
            long r0 = X.AbstractC166987dD.A0N(r4)
            goto L51
        L2d:
            long r0 = X.AbstractC166987dD.A0N(r4)
            long r0 = X.AbstractC58320PtC.A06(r0)
            goto L51
        L36:
            int r0 = X.AbstractC166987dD.A0H(r4)
            goto L12
        L3b:
            int r0 = X.AbstractC166987dD.A0H(r4)
            int r0 = X.AbstractC58318PtA.A01(r0)
            goto L12
        L44:
            boolean r0 = r4 instanceof X.InterfaceC65443TkF
            if (r0 == 0) goto L55
            X.TkF r4 = (X.InterfaceC65443TkF) r4
            int r0 = r4.BY9()
        L4e:
            if (r0 >= 0) goto L12
            long r0 = (long) r0
        L51:
            r2.A0F(r0)
            return
        L55:
            int r0 = X.AbstractC166987dD.A0H(r4)
            goto L4e
        L5a:
            double r0 = X.MSW.A00(r4)
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            goto Lc0
        L63:
            float r0 = X.AbstractC166987dD.A09(r4)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            goto Lb8
        L6c:
            boolean r0 = X.AbstractC166987dD.A1a(r4)
            byte r0 = (byte) r0
            r2.A05(r0)
            return
        L75:
            X.TEQ r4 = (X.TEQ) r4
            goto L81
        L78:
            X.TEQ r4 = (X.TEQ) r4
            int r0 = r4.A0E()
            r2.A07(r0)
        L81:
            r4.A0F(r2)
            return
        L85:
            boolean r0 = r4 instanceof X.AbstractC64538TIu
            if (r0 != 0) goto Lae
            java.lang.String r4 = (java.lang.String) r4
            r2.A0I(r4)
            return
        L8f:
            boolean r0 = r4 instanceof X.AbstractC64538TIu
            if (r0 != 0) goto Lae
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            boolean r0 = r2 instanceof X.RWO
            if (r0 == 0) goto La4
            X.RWO r2 = (X.RWO) r2
            r0 = 0
            r2.A07(r1)
            r2.A0M(r4, r0, r1)
            return
        La4:
            X.RWN r2 = (X.RWN) r2
            r0 = 0
            r2.A07(r1)
            r2.A0K(r4, r0, r1)
            return
        Lae:
            X.TIu r4 = (X.AbstractC64538TIu) r4
            r2.A0H(r4)
            return
        Lb4:
            int r0 = X.AbstractC166987dD.A0H(r4)
        Lb8:
            r2.A06(r0)
            return
        Lbc:
            long r0 = X.AbstractC166987dD.A0N(r4)
        Lc0:
            r2.A0E(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63341Shv.A01(com.google.protobuf.CodedOutputStream, X.Rgj, java.lang.Object, int):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        Iterable entrySet;
        Map.Entry A1K;
        C63341Shv c63341Shv = new C63341Shv();
        TZI tzi = this.A02;
        if (0 < tzi.A00.size()) {
            A1K = (Map.Entry) tzi.A00.get(0);
        } else {
            if (tzi.A01.isEmpty()) {
                entrySet = S96.A00;
            } else {
                entrySet = tzi.A01.entrySet();
            }
            Iterator it = entrySet.iterator();
            if (it.hasNext()) {
                A1K = AbstractC166987dD.A1K(it);
            } else {
                c63341Shv.A00 = this.A00;
                return c63341Shv;
            }
        }
        A1K.getKey();
        A1K.getValue();
        throw AbstractC166987dD.A15("isRepeated");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63341Shv)) {
            return false;
        }
        return this.A02.equals(((C63341Shv) obj).A02);
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0010. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(X.EnumC61183Rgj r3, java.lang.Object r4, int r5) {
        /*
            int r2 = X.AbstractC63073Sbv.A05(r5)
            X.Rgj r0 = X.EnumC61183Rgj.A07
            if (r3 != r0) goto La
            int r2 = r2 * 2
        La:
            int[] r0 = X.AbstractC62339S7j.A00
            int r0 = X.AbstractC58318PtA.A06(r3, r0)
            switch(r0) {
                case 1: goto L51;
                case 2: goto L54;
                case 3: goto L8b;
                case 4: goto L8b;
                case 5: goto L30;
                case 6: goto L51;
                case 7: goto L54;
                case 8: goto L89;
                case 9: goto L82;
                case 10: goto L1a;
                case 11: goto L61;
                case 12: goto L6c;
                case 13: goto L56;
                case 14: goto L54;
                case 15: goto L51;
                case 16: goto L35;
                case 17: goto L44;
                case 18: goto L21;
                default: goto L13;
            }
        L13:
            java.lang.String r0 = "There is no way to get here, but the compiler thinks otherwise."
            java.lang.RuntimeException r0 = X.AbstractC166987dD.A18(r0)
            throw r0
        L1a:
            X.TEQ r4 = (X.TEQ) r4
            int r1 = r4.A0E()
            goto L73
        L21:
            boolean r0 = r4 instanceof X.InterfaceC65443TkF
            if (r0 == 0) goto L30
            X.TkF r4 = (X.InterfaceC65443TkF) r4
            int r1 = r4.BY9()
        L2b:
            if (r1 >= 0) goto L3d
            r0 = 10
            goto L93
        L30:
            int r1 = X.AbstractC166987dD.A0H(r4)
            goto L2b
        L35:
            int r0 = X.AbstractC166987dD.A0H(r4)
            int r1 = X.AbstractC58318PtA.A01(r0)
        L3d:
            boolean r0 = com.google.protobuf.CodedOutputStream.A02
            int r0 = X.AbstractC58321PtD.A06(r1)
            goto L93
        L44:
            long r0 = X.AbstractC166987dD.A0N(r4)
            long r0 = X.AbstractC58320PtC.A06(r0)
            int r0 = com.google.protobuf.CodedOutputStream.A01(r0)
            goto L93
        L51:
            r0 = 8
            goto L93
        L54:
            r0 = 4
            goto L93
        L56:
            int r1 = X.AbstractC166987dD.A0H(r4)
            boolean r0 = com.google.protobuf.CodedOutputStream.A02
            int r0 = X.AbstractC58321PtD.A06(r1)
            goto L93
        L61:
            boolean r0 = r4 instanceof X.AbstractC64538TIu
            if (r0 != 0) goto L7b
            java.lang.String r4 = (java.lang.String) r4
            int r0 = com.google.protobuf.CodedOutputStream.A02(r4)
            goto L93
        L6c:
            boolean r0 = r4 instanceof X.AbstractC64538TIu
            if (r0 != 0) goto L7b
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
        L73:
            boolean r0 = com.google.protobuf.CodedOutputStream.A02
            int r0 = X.AbstractC58321PtD.A06(r1)
            int r0 = r0 + r1
            goto L93
        L7b:
            X.TIu r4 = (X.AbstractC64538TIu) r4
            int r1 = r4.A02()
            goto L73
        L82:
            X.TEQ r4 = (X.TEQ) r4
            int r0 = r4.A0E()
            goto L93
        L89:
            r0 = 1
            goto L93
        L8b:
            long r0 = X.AbstractC166987dD.A0N(r4)
            int r0 = com.google.protobuf.CodedOutputStream.A01(r0)
        L93:
            int r2 = r2 + r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63341Shv.A00(X.Rgj, java.lang.Object, int):int");
    }

    public C63341Shv() {
        this.A02 = new RYr(16);
    }
}
