package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.BsN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26799BsN extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AiEditProfilePictureFragment";
    public InterfaceC56362iU A00;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final String A04 = "ai_edit_profile_picture_fragment";
    public final InterfaceC09390do A03 = AbstractC25225BEi.A0a(C29907DGv.A01(this, 2), C29907DGv.A01(this, 3), new C29898DGm(38, null, this), AbstractC25235BEs.A0x());
    public final InterfaceC09390do A01 = C1XM.A00(C29907DGv.A01(this, 0));

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C28484Chc A0q = AbstractC25226BEj.A0q(this.A01);
        String A02 = C25878Bcd.A02(this.A03);
        C25531Mh A00 = C28484Chc.A00(A0q);
        if (AbstractC25226BEj.A1Z(A00)) {
            A00.A0i(AbstractC25233BEq.A0m(A00, "settings_main_screen_edit_profile_picture_screen_shown", A02));
            A00.Cht();
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (X.C14360o3.A0K(r2, r0) == false) goto L19;
     */
    @Override // X.InterfaceC60072op
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onBackPressed() {
        /*
            r6 = this;
            X.0do r0 = r6.A01
            X.Chc r0 = X.AbstractC25226BEj.A0q(r0)
            X.0do r5 = r6.A03
            java.lang.String r2 = X.C25878Bcd.A02(r5)
            X.1Mh r1 = X.C28484Chc.A00(r0)
            boolean r0 = X.AbstractC25226BEj.A1Z(r1)
            if (r0 == 0) goto L22
            java.lang.String r0 = "settings_main_screen_edit_profile_picture_screen_back_clicked"
            java.lang.Long r0 = X.AbstractC25233BEq.A0m(r1, r0, r2)
            r1.A0i(r0)
            r1.Cht()
        L22:
            X.Bcd r0 = X.AbstractC25226BEj.A0o(r5)
            com.instagram.aistudio.editor.AiSettingsRepository r4 = r0.A00
            X.0UO r0 = r4.A0s
            java.lang.Object r0 = r0.getValue()
            X.BfO r0 = (X.C26035BfO) r0
            if (r0 == 0) goto L75
            X.DgW r3 = r0.A01
            java.lang.String r2 = r0.A02
            X.BgC r1 = com.instagram.aistudio.editor.AiSettingsRepository.A00(r4)
            r0 = 0
            if (r1 == 0) goto L73
            java.lang.String r1 = r1.A06
        L3f:
            boolean r1 = X.C14360o3.A0K(r2, r1)
            if (r1 == 0) goto L5d
            boolean r1 = r3 instanceof X.C26115Bgz
            if (r1 == 0) goto L75
            X.Bgz r3 = (X.C26115Bgz) r3
            com.instagram.common.typedurl.ImageUrl r2 = r3.A00
            X.05A r1 = r4.A08
            X.BgC r1 = X.AbstractC25226BEj.A0s(r1)
            if (r1 == 0) goto L57
            com.instagram.common.typedurl.ImageUrl r0 = r1.A02
        L57:
            boolean r0 = X.C14360o3.A0K(r2, r0)
            if (r0 != 0) goto L75
        L5d:
            android.content.Context r4 = r6.requireContext()
            r3 = 2131952827(0x7f1304bb, float:1.9542108E38)
            r2 = 2131952826(0x7f1304ba, float:1.9542106E38)
            r0 = 1
            X.DGv r1 = X.C29907DGv.A01(r6, r0)
            X.D9z r0 = X.D9z.A00
            X.AbstractC27520CCq.A00(r4, r1, r0, r3, r2)
        L71:
            r0 = 1
            return r0
        L73:
            r1 = r0
            goto L3f
        L75:
            X.Bcd r0 = X.AbstractC25226BEj.A0o(r5)
            com.instagram.aistudio.editor.AiSettingsRepository r2 = r0.A00
            X.195 r0 = r2.A01
            r1 = 0
            if (r0 == 0) goto L83
            r0.AGH(r1)
        L83:
            X.05A r0 = r2.A0V
            r0.Egh(r1)
            X.AbstractC25226BEj.A1P(r6)
            goto L71
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26799BsN.onBackPressed():boolean");
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        boolean A10 = AbstractC25236BEt.A10(interfaceC56362iU);
        interfaceC56362iU.Efu(2131952777);
        ViewOnClickListenerC28667ClF.A03(interfaceC56362iU, this, 7, 2131961124);
        interfaceC56362iU.ARk(A10 ? 1 : 0, ((C26035BfO) AbstractC25226BEj.A0o(this.A03).A0H.getValue()).A01 instanceof C26115Bgz);
        this.A00 = interfaceC56362iU;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A04;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1526066702);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30505Dbo(this, 44), 747818278);
        C0f9.A09(-708814513, A02);
        return A00;
    }
}
