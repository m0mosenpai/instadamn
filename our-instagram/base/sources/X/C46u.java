package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;

/* renamed from: X.46u, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C46u extends C3A1 {
    public final Context A00;
    public final Fragment A01;
    public final InterfaceC60442pS A02;
    public final InterfaceC09390do A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final UserSession A08;
    public final C3H9 A09;
    public final boolean A0A;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C46u(android.content.Context r5, androidx.fragment.app.Fragment r6, com.instagram.common.session.UserSession r7, X.InterfaceC60442pS r8, boolean r9, boolean r10, boolean r11, boolean r12, boolean r13) {
        /*
            r4 = this;
            r0 = 1
            X.C14360o3.A0B(r5, r0)
            r0 = 9
            X.C14360o3.A0B(r6, r0)
            if (r11 == 0) goto L66
            X.3A2 r0 = X.C3A2.A00
        Ld:
            X.3A3 r0 = (X.C3A3) r0
            r2 = 0
            r4.<init>(r0)
            r4.A00 = r5
            r4.A04 = r9
            r4.A02 = r8
            r4.A08 = r7
            r4.A06 = r10
            r4.A0A = r12
            r4.A05 = r13
            r4.A01 = r6
            r1 = 35
            X.9Dy r0 = new X.9Dy
            r0.<init>(r4, r1)
            X.0sx r0 = X.AbstractC09440dt.A01(r0)
            r4.A03 = r0
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36327065318406422(0x810f4600093916, double:3.036720612486666E-306)
            boolean r0 = X.C18U.A06(r3, r7, r0)
            if (r0 == 0) goto L64
            r0 = 6
            X.9EG r1 = new X.9EG
            r1.<init>(r7, r0)
            java.lang.Class<X.3H9> r0 = X.C3H9.class
            java.lang.Object r0 = r7.A01(r0, r1)
            X.3H9 r0 = (X.C3H9) r0
        L4b:
            r4.A09 = r0
            if (r13 != 0) goto L60
            if (r0 != 0) goto L60
            if (r10 != 0) goto L60
            if (r12 != 0) goto L60
            r0 = 36327065318275348(0x810f4600073914, double:3.036720612403774E-306)
            boolean r0 = X.C18U.A06(r3, r7, r0)
            if (r0 == 0) goto L61
        L60:
            r2 = 1
        L61:
            r4.A07 = r2
            return
        L64:
            r0 = 0
            goto L4b
        L66:
            X.46v r0 = X.C46v.A00
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46u.<init>(android.content.Context, androidx.fragment.app.Fragment, com.instagram.common.session.UserSession, X.2pS, boolean, boolean, boolean, boolean, boolean):void");
    }

    public final void A06(C5Tl c5Tl, C85233rE c85233rE, int i) {
        int i2;
        C14360o3.A0B(c85233rE, 0);
        c5Tl.Enr(-932055365);
        if ((i & 6) == 0) {
            int i3 = 2;
            if (c5Tl.AH6(c85233rE)) {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i4 = 16;
            if (c5Tl.AH6(this)) {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1106409053, "com.instagram.feed.adapter.row.ufi.MediaUfiComposeBinder.UfiRoot (MediaUfiComposeBinder.kt:154)");
            }
            String A0R = AnonymousClass001.A0R("UfiRoot:", c85233rE.A07.A00.getId());
            if (Systrace.A0E(1L)) {
                C0fO.A01(A0R, 1669748721);
            }
            try {
                InterfaceC60442pS interfaceC60442pS = this.A02;
                String moduleName = interfaceC60442pS.getModuleName();
                C5VW.A03(c5Tl, this.A08, moduleName, C5UA.A01(c5Tl, new C207169Ev(5, c85233rE, this), -1577631772), 196608, 4, false, interfaceC60442pS.isOrganicEligible(), interfaceC60442pS.isSponsoredEligible());
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-838741476);
                }
                if (C0fH.A02()) {
                    C0fH.A00(125765537);
                }
            } catch (Throwable th) {
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-1275381967);
                }
                throw th;
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30510Dbt(i, 23, c85233rE, this);
        }
    }

    public final void A05(View view) {
        InterfaceC16620sF interfaceC16620sF;
        if (this.A06) {
            if (Systrace.A0E(1L)) {
                C0fO.A01("deactivate", 1273343754);
            }
            try {
                C57h c57h = (C57h) view;
                AbstractC09790fc.A01("MetaComposeView:deactivate", 1047942157);
                try {
                    if (c57h.A01 && (interfaceC16620sF = (InterfaceC16620sF) c57h.A02.getValue()) != null) {
                        C57h.A00(c57h, interfaceC16620sF, false);
                    }
                    AbstractC09790fc.A00(-2135702424);
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(201275989);
                    }
                } catch (Throwable th) {
                    AbstractC09790fc.A00(-1439313569);
                    throw th;
                }
            } catch (Throwable th2) {
                if (Systrace.A0E(1L)) {
                    C0fO.A00(520409750);
                }
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r3 == null) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.57i] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.ViewGroup A04(android.content.Context r8) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46u.A04(android.content.Context):android.view.ViewGroup");
    }
}
