package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Xz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164607Xz {
    public boolean A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final String A04;
    public final InterfaceC08830cm A05;
    public final boolean A06;
    public final InterfaceC09390do A08 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.7Y0
        @Override // X.InterfaceC16820sZ
        public final Object invoke() {
            C7TS c7tr;
            C164607Xz c164607Xz = C164607Xz.this;
            Context requireContext = c164607Xz.A01.requireContext();
            UserSession userSession = c164607Xz.A02;
            if (c164607Xz.A06) {
                c7tr = new C49298Lqs(userSession);
            } else {
                C14360o3.A0B(userSession, 0);
                c7tr = new C7TR(userSession);
            }
            return new C31286Dp8(requireContext, c164607Xz.A03, userSession, c7tr);
        }
    });
    public final InterfaceC09390do A07 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.7Y1
        @Override // X.InterfaceC16820sZ
        public final Object invoke() {
            C164607Xz c164607Xz = C164607Xz.this;
            AbstractC59962oe abstractC59962oe = c164607Xz.A01;
            return new C31280Dp2(abstractC59962oe.requireContext(), abstractC59962oe, c164607Xz.A03, c164607Xz.A02);
        }
    });

    public static void A00(C164607Xz c164607Xz) {
        AbstractC59962oe abstractC59962oe = c164607Xz.A01;
        if (abstractC59962oe.isResumed()) {
            FragmentActivity requireActivity = abstractC59962oe.requireActivity();
            C3DN A00 = C3DN.A00.A00(requireActivity);
            if (A00 == null || !((C3DP) A00).A0h) {
                requireActivity.onBackPressed();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f1, code lost:
    
        if (r2.A01 == 3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0048, code lost:
    
        if (r12 == 8) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C164607Xz.A01():void");
    }

    public final boolean A02() {
        if (((C7U0) this.A05.get()).C7r().CVY()) {
            A01();
            return true;
        }
        return false;
    }

    public C164607Xz(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, InterfaceC08830cm interfaceC08830cm, boolean z) {
        this.A02 = userSession;
        this.A01 = abstractC59962oe;
        this.A03 = interfaceC60442pS;
        this.A06 = z;
        this.A04 = str;
        this.A05 = interfaceC08830cm;
    }
}
