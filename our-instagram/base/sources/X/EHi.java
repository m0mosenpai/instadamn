package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EHi extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "DataTransparencyBottomSheet";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "profile_data_transparency_bottom_Sheet";
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if (X.C4K3.A00(X.AbstractC166987dD.A0r(r4)) != false) goto L6;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            super.onViewCreated(r7, r8)
            android.content.Context r1 = r6.requireContext()
            r0 = 2131965052(0x7f13347c, float:1.9566903E38)
            java.lang.String r5 = X.AbstractC166997dE.A0p(r1, r0)
            X.0cb r0 = X.C17060sy.A01
            X.0do r4 = r6.A00
            com.instagram.user.model.User r0 = X.AbstractC31176DnK.A0g(r0, r4)
            boolean r0 = X.C2E7.A01(r0)
            if (r0 != 0) goto L2d
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r4)
            boolean r0 = X.C4K3.A00(r0)
            r1 = 2131970115(0x7f134843, float:1.9577172E38)
            if (r0 == 0) goto L30
        L2d:
            r1 = 2131970116(0x7f134844, float:1.9577174E38)
        L30:
            android.content.Context r0 = r6.requireContext()
            java.lang.String r3 = X.AbstractC31177DnL.A0b(r0, r5, r1)
            r0 = 2131428837(0x7f0b05e5, float:1.847933E38)
            android.widget.TextView r2 = X.AbstractC167007dF.A0N(r7, r0)
            int r1 = X.AbstractC31179DnN.A01(r6)
            X.Em1 r0 = new X.Em1
            r0.<init>(r6, r1)
            X.AnonymousClass773.A07(r0, r2, r5, r3)
            java.lang.Integer r1 = X.C05F.A0Y
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r4)
            X.AbstractC151856sV.A00(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EHi.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1943311558);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.edit_profile_transparency_bottom_sheet, viewGroup, false);
        C0f9.A09(1826598053, A02);
        return inflate;
    }
}
