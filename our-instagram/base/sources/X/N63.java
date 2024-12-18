package X;

import android.os.Bundle;
import android.view.View;
import java.util.AbstractCollection;

/* loaded from: classes9.dex */
public final class N63 extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PartnerProgramWelcomeFragment";
    public C51043Mgu A00;
    public final InterfaceC09390do A02 = C57526Pg0.A00(this, 17);
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A03 = C57509Pfj.A00(this, 24);
    public final InterfaceC09390do A01 = C57509Pfj.A00(this, 23);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(A01().A03());
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return true;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        PZF.A02(this, AbstractC25235BEs.A0S(this), 33);
    }

    public static void A00(CharSequence charSequence, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new C34936FaM(charSequence, i));
    }

    public final C51043Mgu A01() {
        C51043Mgu c51043Mgu = this.A00;
        if (c51043Mgu != null) {
            return c51043Mgu;
        }
        C14360o3.A0F("productOnboardingViewModel");
        throw C00O.createAndThrow();
    }

    public final void A02(String str, String str2, String str3) {
        ((C56136Ovw) this.A02.getValue()).A01(AbstractC35078Fcp.A01(A01().A04()), AbstractC35078Fcp.A02(A01().A04()), str, str2, __redex_internal_original_name, A01().A05(), str3);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-690850485);
        super.onCreate(bundle);
        C51043Mgu A00 = C52332NDw.A00(requireActivity(), this.A04);
        C14360o3.A0B(A00, 0);
        this.A00 = A00;
        C0f9.A09(-2097010678, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x01b7, code lost:
    
        if (r2 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00bd, code lost:
    
        if (r2 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00bf, code lost:
    
        r2.setSecondaryAction(r3, new X.Ok6(r3, r18, 7));
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r19, android.view.ViewGroup r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N63.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
