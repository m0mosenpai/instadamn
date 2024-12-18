package X;

/* renamed from: X.5Ue, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC117695Ue {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (r0 == false) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.57M] */
    /* JADX WARN: Type inference failed for: r5v7, types: [X.57M] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C5Tl r10, X.C117685Ud r11, X.InterfaceC16620sF r12, int r13) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC117695Ue.A00(X.5Tl, X.5Ud, X.0sF, int):void");
    }

    public static final void A01(C5Tl c5Tl, InterfaceC16620sF interfaceC16620sF, C117685Ud[] c117685UdArr, int i) {
        C59P A05;
        c5Tl.Enr(-1390796515);
        if (C0fH.A02()) {
            C0fH.A01(1906640588, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:377)");
        }
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        C59P A04 = C117505Tk.A04(c117505Tk);
        C117505Tk.A0K(c117505Tk, C5UC.A02, null, 201, 0);
        boolean z = true;
        boolean z2 = false;
        if (c117505Tk.A0K) {
            A05 = C117505Tk.A05(c117505Tk, A04, C5UT.A00(A04, C59O.A00, c117685UdArr));
            c117505Tk.A0Q = true;
        } else {
            C117555Tq c117555Tq = c117505Tk.A0B;
            Object A06 = c117555Tq.A06(c117555Tq.A01, 0);
            C14360o3.A0C(A06, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            C59P c59p = (C59P) A06;
            C117555Tq c117555Tq2 = c117505Tk.A0B;
            Object A062 = c117555Tq2.A06(c117555Tq2.A01, 1);
            C14360o3.A0C(A062, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            C59P c59p2 = (C59P) A062;
            C59O A00 = C5UT.A00(A04, c59p2, c117685UdArr);
            if (c117505Tk.Bxj() && !c117505Tk.A0O && C14360o3.A0K(c59p2, A00)) {
                c117505Tk.A03 += c117505Tk.A0B.A01();
                A05 = c59p;
            } else {
                A05 = C117505Tk.A05(c117505Tk, A04, A00);
                if (!c117505Tk.A0O && C14360o3.A0K(A05, c59p)) {
                    z = false;
                }
                z2 = z;
                if (z && !c117505Tk.A0K) {
                    C128375r6 c128375r6 = c117505Tk.A0I;
                    if (c128375r6 == null) {
                        c128375r6 = new C128375r6();
                        c117505Tk.A0I = c128375r6;
                    }
                    c128375r6.A00.put(c117505Tk.A0B.A01, A05);
                }
            }
        }
        C117525Tn c117525Tn = c117505Tk.A0X;
        c117525Tn.A00(c117505Tk.A0N ? 1 : 0);
        c117505Tk.A0N = z2;
        c117505Tk.A0A = A05;
        C117505Tk.A0K(c117505Tk, C5UC.A00, A05, 202, 0);
        interfaceC16620sF.invoke(c5Tl, Integer.valueOf((i >> 3) & 14));
        boolean z3 = false;
        C117505Tk.A0L(c117505Tk, false);
        C117505Tk.A0L(c117505Tk, false);
        int[] iArr = c117525Tn.A01;
        int i2 = c117525Tn.A00 - 1;
        c117525Tn.A00 = i2;
        if (iArr[i2] != 0) {
            z3 = true;
        }
        c117505Tk.A0N = z3;
        c117505Tk.A0A = null;
        if (C0fH.A02()) {
            C0fH.A00(-682356657);
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30507Dbq(i, 5, c117685UdArr, interfaceC16620sF);
        }
    }
}
