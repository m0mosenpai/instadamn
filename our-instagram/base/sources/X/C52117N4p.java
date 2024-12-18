package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.List;

/* renamed from: X.N4p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52117N4p extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "SuggestedHiddenWordsFragment";
    public final String A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "suggested_hidden_words_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List list;
        Integer num;
        EnumC39589Hdz enumC39589Hdz;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (list = bundle2.getStringArrayList(AbstractC111324zv.A00(4803))) == null) {
            list = C16930sl.A00;
        }
        String str = (String) AbstractC001800i.A0J(list);
        if (str == null) {
            A00(this);
            return;
        }
        InterfaceC09390do interfaceC09390do = this.A06;
        interfaceC09390do.getValue();
        UserSession A0r = AbstractC166987dD.A0r(this.A04);
        List A1J = AbstractC166987dD.A1J(str);
        InterfaceC09390do interfaceC09390do2 = this.A02;
        boolean A1Z = AbstractC167007dF.A1Z(interfaceC09390do2);
        C14360o3.A0B(A0r, 0);
        if (A1Z) {
            num = C05F.A0N;
        } else {
            num = C05F.A0C;
        }
        OVQ.A00.A00(A0r, num, C05F.A01, null, A1J, list);
        interfaceC09390do.getValue();
        OLM olm = (OLM) this.A05.getValue();
        String str2 = this.A00;
        boolean A1Z2 = AbstractC167007dF.A1Z(interfaceC09390do2);
        AbstractC167007dF.A1K(olm, str2);
        if (A1Z2) {
            enumC39589Hdz = EnumC39589Hdz.A0F;
        } else {
            enumC39589Hdz = EnumC39589Hdz.A0E;
        }
        olm.A01("upsell_bottom_sheet", str2, enumC39589Hdz.A00);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AbstractC166987dD.A0c(view, R.id.suggested_hidden_words_upsell);
        int i = 2131974890;
        if (AbstractC167007dF.A1Z(interfaceC09390do2)) {
            i = 2131974891;
        }
        String string = getString(i);
        C14360o3.A0A(string);
        igdsHeadline.setBody(string);
        View findViewById = view.findViewById(R.id.suggested_hidden_words_word_tv);
        TextView textView = (TextView) findViewById;
        Context context = view.getContext();
        textView.setCompoundDrawablePadding(AbstractC167017dG.A0E(context));
        Drawable A01 = AbstractC85953sP.A01(context, R.drawable.instagram_eye_off_pano_outline_24, AbstractC53242c7.A08(getContext()));
        RectF rectF = AbstractC13880nE.A01;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(A01, (Drawable) null, (Drawable) null, (Drawable) null);
        C14360o3.A07(findViewById);
        C0fQ.A00(new Ok6(str, textView, 14), textView);
        Ok6.A00(AbstractC166987dD.A0c(view, R.id.suggested_hidden_words_cta), this, str, 15);
        ViewOnClickListenerC55463OkI.A00(AbstractC166987dD.A0c(view, R.id.suggested_hidden_words_dismiss), 23, this);
    }

    public static final void A00(C52117N4p c52117N4p) {
        C3DN A0l = AbstractC43593JPy.A0l(c52117N4p, C3DN.A00);
        if (AbstractC167007dF.A1Z(c52117N4p.A01)) {
            C189478aR A00 = F86.A00(A0l);
            if (A00 != null) {
                A00.A0T();
                return;
            }
            return;
        }
        if (A0l == null) {
            return;
        }
        A0l.A0B();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    public C52117N4p() {
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, C57529Pg3.A00(C57529Pg3.A00(this, 26), 27));
        C0YZ A1D = AbstractC25225BEi.A1D(C50873Me4.class);
        this.A06 = AbstractC25225BEi.A0a(C57529Pg3.A00(A00, 28), new C29895DGj(11, A00, this), new C29895DGj(10, null, A00), A1D);
        this.A03 = C1XM.A00(C57529Pg3.A00(this, 25));
        this.A01 = AbstractC09440dt.A01(C57529Pg3.A00(this, 23));
        this.A02 = C1XM.A00(C57529Pg3.A00(this, 24));
        this.A05 = C1XM.A00(C57529Pg3.A00(this, 29));
        this.A00 = AbstractC167017dG.A0j();
        this.A04 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1961851838);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.suggested_hidden_words_bottom_sheet, false);
        C0f9.A09(54716387, A02);
        return A0R;
    }
}
