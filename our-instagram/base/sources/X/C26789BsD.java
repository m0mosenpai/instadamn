package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.BsD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26789BsD extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "CreatorAIReadyFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "creator_ai_preparation_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C50122MBw(viewLifecycleOwner, c07s, this, null, 22), C07Y.A00(viewLifecycleOwner));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r0.length() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C26789BsD r5) {
        /*
            X.0do r4 = r5.A01
            java.lang.String r0 = X.AbstractC25225BEi.A15(r4)
            if (r0 == 0) goto Lf
            int r0 = r0.length()
            r2 = 0
            if (r0 != 0) goto L10
        Lf:
            r2 = 1
        L10:
            X.0do r1 = r5.A02
            com.instagram.common.session.UserSession r3 = X.AbstractC166987dD.A0r(r1)
            androidx.fragment.app.FragmentActivity r0 = r5.requireActivity()
            if (r2 == 0) goto L2d
            X.FR2 r2 = new X.FR2
            r2.<init>(r0, r3)
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r1)
            java.lang.String r1 = r0.userId
            X.Cuk r0 = X.C29241Cuk.A00
            r2.A00(r5, r0, r1)
            return
        L2d:
            X.FR2 r1 = new X.FR2
            r1.<init>(r0, r3)
            java.lang.String r0 = X.AbstractC25225BEi.A15(r4)
            r1.A01(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26789BsD.A00(X.BsD):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (((C51688MsJ) ((C26903Bu6) this.A03.getValue()).A03.getValue()).A00) {
            return false;
        }
        A00(this);
        return true;
    }

    public C26789BsD() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A01 = DH6.A01(this, "sandbox_thread_igid", enumC09460dv, 33);
        this.A02 = AbstractC60492pY.A02(this);
        C29760DBe c29760DBe = C29760DBe.A00;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, C29911DGz.A01(C29911DGz.A01(this, 26), 27));
        this.A03 = AbstractC25225BEi.A0a(C29911DGz.A01(A00, 28), c29760DBe, new C29894DGi(22, A00, null), AbstractC25225BEi.A1D(C26903Bu6.class));
        this.A00 = C29911DGz.A00(this, 25);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1084678742);
        ComposeView A00 = AbstractC25319BIo.A00(this, C30481DbQ.A00(this, 31), 326071867);
        C0f9.A09(1367364797, A02);
        return A00;
    }
}
