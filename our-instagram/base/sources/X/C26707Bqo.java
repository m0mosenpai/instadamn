package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Bqo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26707Bqo extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "FacebookPlaysAndLikesFragment";
    public final InterfaceC09390do A00 = AbstractC09440dt.A01(new C37057GUn(this, 44));
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "facebook_plays_and_likes";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(60109244);
        C14360o3.A0B(layoutInflater, 0);
        InterfaceC09390do interfaceC09390do = this.A00;
        boolean A4a = AbstractC25226BEj.A0z(interfaceC09390do).A4a();
        View inflate = layoutInflater.inflate(R.layout.facebook_plays_and_likes_layout, viewGroup, false);
        TextView A0N = AbstractC167007dF.A0N(inflate, R.id.text);
        BO2 bo2 = BO2.A00;
        Resources A0N2 = AbstractC166997dE.A0N(this);
        C14360o3.A07(A0N2);
        A0N.setText(bo2.A04(A0N2, "", AbstractC25226BEj.A0z(interfaceC09390do).A0u(), AbstractC25226BEj.A0z(interfaceC09390do).A0v(), A4a));
        TextView A0N3 = AbstractC167007dF.A0N(inflate, R.id.footer_text);
        boolean A4a2 = AbstractC25226BEj.A0z(interfaceC09390do).A4a();
        String A0q = AbstractC166997dE.A0q(AbstractC166997dE.A0N(this), 2131973683);
        int i = 2131973684;
        if (A4a2) {
            i = 2131973685;
        }
        String A0r = AbstractC166997dE.A0r(AbstractC166997dE.A0N(this), A0q, i);
        C14360o3.A07(A0r);
        C50761MbS c50761MbS = new C50761MbS(AbstractC25227BEk.A0B(MSV.A00(49)));
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A0r);
        AnonymousClass773.A03(A0H, c50761MbS, A0q);
        A0N3.setMovementMethod(C6R6.A00);
        A0N3.setClickable(false);
        A0N3.setLongClickable(false);
        A0N3.setText(A0H);
        C0f9.A09(-702820132, A02);
        return inflate;
    }
}
