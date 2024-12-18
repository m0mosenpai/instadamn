package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.ENo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32365ENo extends C53Z implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "UnifiedIdentitySettingsFragment";
    public C42221xC A00;
    public C18A A01;
    public final C41761wQ A02 = AbstractC31173DnH.A0S();

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public static C42221xC A00(C32365ENo c32365ENo) {
        UserSession session = c32365ENo.getSession();
        EnumC132075xi enumC132075xi = EnumC132075xi.A0D;
        C14360o3.A0B(session, 0);
        return C6AE.A02(session, enumC132075xi, AbstractC94034Kn.A00(session)).A00();
    }

    public static void A01(IgTextView igTextView, C32365ENo c32365ENo) {
        String string = AbstractC34132F4i.A00(c32365ENo.getSession()).A01.getString("msys_linked_thread_igid", null);
        if (!AbstractC13670mt.A0B(string)) {
            AbstractC31177DnL.A10(igTextView, c32365ENo, string, 2131957772);
        } else {
            igTextView.setText(2131957773);
        }
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.Efu(2131976031);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1957698888);
        super.onCreate(bundle);
        this.A00 = C1334460n.A01(getSession(), __redex_internal_original_name).A02;
        this.A01 = AnonymousClass189.A00(getSession());
        C0f9.A09(1523234590, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x007d, code lost:
    
        if (r0 != null) goto L6;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r10, android.view.ViewGroup r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32365ENo.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1985976517);
        super.onDestroyView();
        this.A02.A01();
        C0f9.A09(-762899052, A02);
    }
}
