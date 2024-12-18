package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.KJg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45669KJg extends AbstractC66422zJ {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final C47633L1s A02;
    public final C49411Lsl A03;

    public C45669KJg(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C47633L1s c47633L1s, C49411Lsl c49411Lsl) {
        AbstractC167007dF.A1F(userSession, 1, c47633L1s);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A03 = c49411Lsl;
        this.A02 = c47633L1s;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.friend_map_hscroll_presence_item, false);
        UserSession userSession = this.A01;
        return new C44794JsF(A0R, this.A00, userSession, this.A02, this.A03);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String str;
        SpannableString A07;
        String str2;
        List list;
        InterfaceC50424MOe interfaceC50424MOe;
        C6C9 BXJ;
        LZU lzu = (LZU) interfaceC66482zP;
        C44794JsF c44794JsF = (C44794JsF) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, lzu, c44794JsF);
        View A06 = AbstractC31171DnF.A06(c44794JsF);
        C45128JyU c45128JyU = lzu.A01;
        c44794JsF.A00 = c45128JyU;
        CircularImageView circularImageView = c44794JsF.A08;
        User user = c45128JyU.A06;
        circularImageView.setUrl(user.Bhu(), c44794JsF.A02);
        LQ1.A00(circularImageView, 63, c44794JsF, c45128JyU);
        IgTextView igTextView = c44794JsF.A04;
        LQ1.A00(igTextView, 64, c44794JsF, c45128JyU);
        c44794JsF.A06.setText(user.B8y());
        long j = c45128JyU.A02;
        Context A0L = AbstractC166997dE.A0L(A06);
        C09530e4 A072 = AbstractC44198Jg1.A07(A0L, j);
        String str3 = (String) A072.A00;
        boolean A1a = AbstractC166987dD.A1a(A072.A01);
        int i = R.attr.igds_color_secondary_text;
        if (A1a) {
            i = R.attr.igds_color_active_badge;
        }
        int A09 = AbstractC167007dF.A09(A0L, i);
        C4F5 c4f5 = c45128JyU.A05;
        boolean A1W = AbstractC167007dF.A1W(c4f5);
        int i2 = 8;
        TextView textView = c44794JsF.A07;
        if (A1W) {
            textView.setVisibility(0);
            L8P l8p = c44794JsF.A09;
            IgBouncyUfiButtonImageView igBouncyUfiButtonImageView = c44794JsF.A0C;
            String str4 = null;
            l8p.A01(null, igBouncyUfiButtonImageView);
            l8p.A00(new C51688MsJ(c45128JyU.A0F, 9), null, new C48767Lha(c45128JyU, c44794JsF), igBouncyUfiButtonImageView);
            IgTextView igTextView2 = c44794JsF.A05;
            igTextView2.setMaxLines(2);
            if (c45128JyU.A04() && c45128JyU.A07 != C05F.A00) {
                if (c4f5 != null && (list = c4f5.A0J) != null && (interfaceC50424MOe = (InterfaceC50424MOe) AbstractC001800i.A0J(list)) != null && (BXJ = interfaceC50424MOe.BXJ()) != null) {
                    str4 = BXJ.A0J;
                }
                igTextView2.setText(str4);
                AbstractC31177DnL.A0q(A0L, igTextView2, R.attr.igds_color_primary_text);
            } else {
                if (c45128JyU.A07 == C05F.A00) {
                    str2 = A0L.getString(2131962910);
                } else {
                    str2 = c45128JyU.A09;
                }
                igTextView2.setText(str2);
            }
            String A0q = AbstractC166997dE.A0q(A0L.getResources(), 2131962905);
            String A0g = AnonymousClass001.A0g(A0q, " • ", str3);
            A07 = AbstractC43592JPx.A07(A0g);
            A07.setSpan(new ForegroundColorSpan(A09), A0q.length() + 3, A0g.length(), 33);
        } else {
            textView.setVisibility(8);
            c44794JsF.A0C.setVisibility(8);
            textView = c44794JsF.A05;
            textView.setMaxLines(A1R ? 1 : 0);
            AbstractC31177DnL.A0q(A0L, textView, R.attr.igds_color_secondary_text);
            String str5 = c45128JyU.A09;
            if (str5 != null && str5.length() != 0) {
                str = AnonymousClass001.A0g(str3, " • ", str5);
            } else {
                str = str3;
            }
            A07 = AbstractC43592JPx.A07(str);
            A07.setSpan(new ForegroundColorSpan(A09), 0, str3.length(), 33);
        }
        textView.setText(A07);
        boolean z = c45128JyU.A0J;
        igTextView.setVisibility(AbstractC167007dF.A05(!z ? 1 : 0));
        ViewGroup viewGroup = c44794JsF.A01;
        if (!z) {
            UserSession userSession = c44794JsF.A03;
            if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36321722382493464L)) {
                i2 = 0;
            }
        }
        viewGroup.setVisibility(i2);
        C47633L1s c47633L1s = c44794JsF.A0A;
        C45045Jwa c45045Jwa = lzu.A00;
        C57112jm c57112jm = c47633L1s.A00;
        C59072n8 A00 = C59062n7.A00(c45045Jwa, C0eB.A00, c45045Jwa.A04);
        A00.A00(c47633L1s.A01);
        AbstractC25227BEk.A10(A06, A00, c57112jm);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return LZU.class;
    }
}
