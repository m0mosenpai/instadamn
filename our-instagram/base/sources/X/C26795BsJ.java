package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.BsJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26795BsJ extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AiKnowledgeFragment";
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);
    public final String A03 = "ai_knowledge_fragment";
    public final InterfaceC09390do A00 = AbstractC09440dt.A01(C29907DGv.A01(this, 9));
    public final InterfaceC09390do A02 = AbstractC25225BEi.A0a(C29907DGv.A01(this, 10), C29907DGv.A01(this, 11), new C29898DGm(39, null, this), AbstractC25235BEs.A0x());

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C28484Chc A0q = AbstractC25226BEj.A0q(this.A00);
        String A02 = C25878Bcd.A02(this.A02);
        C25531Mh A00 = C28484Chc.A00(A0q);
        if (AbstractC25226BEj.A1Z(A00)) {
            A00.A0i(AbstractC25233BEq.A0m(A00, "settings_knowledge_screen_shown", A02));
            A00.Cht();
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C28484Chc A0q = AbstractC25226BEj.A0q(this.A00);
        String A02 = C25878Bcd.A02(this.A02);
        C25531Mh A00 = C28484Chc.A00(A0q);
        if (AbstractC25226BEj.A1Z(A00)) {
            A00.A0i(AbstractC25233BEq.A0m(A00, "settings_knowledge_back_button_clicked", A02));
            A00.Cht();
        }
        AbstractC25226BEj.A1P(this);
        return true;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(2131952793);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A03;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1942701114);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30505Dbo(this, 46), -143949856);
        C0f9.A09(-77325105, A02);
        return A00;
    }
}
