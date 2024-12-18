package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Br9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26728Br9 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "AiImproveResponseOptionsFragment";
    public C27927CSm A00;
    public String A01;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);
    public final String A04 = "ai_improve_response_options_fragment";
    public final InterfaceC09390do A02 = C1XM.A00(C29907DGv.A01(this, 4));

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C28484Chc A0q = AbstractC25226BEj.A0q(this.A02);
        String str = this.A01;
        C25531Mh A00 = C28484Chc.A00(A0q);
        if (AbstractC25226BEj.A1Z(A00)) {
            A00.A0i(AbstractC25233BEq.A0m(A00, "thread_view_edit_ai_menu_shown", str));
            A00.Cht();
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A04;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(495306963);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30505Dbo(this, 45), 1257004442);
        C0f9.A09(2041758815, A02);
        return A00;
    }
}
