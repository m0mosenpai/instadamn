package X;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import java.util.List;

/* renamed from: X.KJq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45679KJq extends AbstractC66422zJ {
    public final EnumC46271Ke3 A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final MR2 A03;
    public final C47348Kvx A04 = new C47348Kvx(this);
    public final EnumC46186KcO A05;
    public final L8Q A06;
    public final String A07;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C3OO(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_ai_sticker_grid_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        C14360o3.A0B(c3oo, 0);
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) AbstractC166997dE.A0R(c3oo.itemView, R.id.ai_sticker_grid_item);
        roundedCornerImageView.setImageDrawable(null);
        roundedCornerImageView.A04 = null;
        roundedCornerImageView.setVisibility(8);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        Object obj;
        C84743qO c84743qO;
        AbstractC84783qS abstractC84783qS;
        Drawable drawable;
        String A0p;
        C148286ly c148286ly;
        Drawable drawable2;
        C45219Jzz c45219Jzz = (C45219Jzz) interfaceC66482zP;
        boolean A1R = AbstractC167007dF.A1R(0, c45219Jzz, c3oo);
        ImageView A0D = AbstractC31176DnK.A0D(c3oo.itemView, R.id.ai_sticker_grid_item);
        JWd jWd = c45219Jzz.A01;
        if (jWd != null) {
            obj = jWd.A00;
        } else {
            obj = null;
        }
        if (obj != null) {
            C148286ly c148286ly2 = (C148286ly) jWd.A00;
            if (AbstractC001900j.A0a(AbstractC43592JPx.A0w(c148286ly2.A0H), ".webp", false)) {
                drawable2 = new KY8(AbstractC166997dE.A0L(A0D), this.A02, c148286ly2, A1R);
            } else {
                C202588xc c202588xc = new C202588xc(A0D.getContext(), null, this.A02, c148286ly2, EnumC150226pU.A16, null, c148286ly2.A0S);
                c202588xc.A06 = this.A04;
                c202588xc.A04();
                drawable2 = c202588xc;
            }
            drawable = drawable2;
        } else {
            if (this.A00 == EnumC46271Ke3.AI_STICKER) {
                if (C18U.A06(C06090Tz.A05, this.A02, 36317706586691059L)) {
                    C84743qO c84743qO2 = new C84743qO();
                    AbstractC84783qS c84773qR = new C84773qR();
                    c84773qR.A02(0.88f);
                    abstractC84783qS = c84773qR;
                    c84743qO = c84743qO2;
                    abstractC84783qS.A03(1.0f);
                    c84743qO.A03(abstractC84783qS.A01());
                    drawable = c84743qO;
                }
            }
            C84743qO c84743qO3 = new C84743qO();
            C167847ee c167847ee = new C167847ee();
            c167847ee.A02(1.0f);
            c167847ee.A05(AbstractC167007dF.A09(AbstractC31172DnG.A05(c3oo), R.attr.igds_color_elevated_highlight_background));
            c167847ee.A00.A09 = AbstractC167007dF.A09(AbstractC31172DnG.A05(c3oo), R.attr.igds_color_ai_sticker_loading_shimmer);
            abstractC84783qS = c167847ee;
            c84743qO = c84743qO3;
            abstractC84783qS.A03(1.0f);
            c84743qO.A03(abstractC84783qS.A01());
            drawable = c84743qO;
        }
        A0D.setImageDrawable(drawable);
        A0D.setVisibility(0);
        if (jWd == null || (c148286ly = (C148286ly) jWd.A00) == null || (A0p = c148286ly.A0M) == null) {
            A0p = AbstractC166997dE.A0p(A0D.getContext(), 2131958698);
        }
        A0D.setContentDescription(A0p);
        if (jWd != null) {
            boolean A0a = AbstractC001900j.A0a(AbstractC43592JPx.A0w(((C148286ly) jWd.A00).A0H), ".webp", false);
            C3P9 A0s = AbstractC166987dD.A0s(A0D);
            A0s.A04 = new KKl(this, c45219Jzz, A0a);
            UserSession userSession = this.A02;
            AbstractC47848LBr.A01(userSession, A0s);
            if (!jWd.A02) {
                InterfaceC11380iw interfaceC11380iw = this.A01;
                C148286ly c148286ly3 = (C148286ly) jWd.A00;
                String str = c148286ly3.A0U;
                if (str == null) {
                    str = "";
                }
                List A1J = AbstractC166987dD.A1J(c148286ly3.A0S);
                String str2 = jWd.A01;
                EnumC46271Ke3 enumC46271Ke3 = this.A00;
                String str3 = this.A07;
                boolean A0a2 = AbstractC001900j.A0a(AbstractC43592JPx.A0w(c148286ly3.A0H), ".webp", false);
                Long A0V = AbstractC31171DnF.A0V(c45219Jzz.A00);
                LJM.A01(enumC46271Ke3, interfaceC11380iw, userSession, A0V, str, str2, str3, A1J, A0a2);
                String str4 = c148286ly3.A0U;
                if (str4 == null) {
                    str4 = "";
                }
                LJM.A03(EnumC46295KeR.PAIR_AI_GENERATED, interfaceC11380iw, userSession, A0V, str4, str3, AbstractC166987dD.A1J(c148286ly3.A0S), AbstractC001900j.A0a(AbstractC43592JPx.A0w(c148286ly3.A0H), ".webp", false));
                jWd.A02 = A1R;
            }
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45219Jzz.class;
    }

    public C45679KJq(EnumC46271Ke3 enumC46271Ke3, InterfaceC11380iw interfaceC11380iw, UserSession userSession, MR2 mr2, EnumC46186KcO enumC46186KcO, String str) {
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = mr2;
        this.A00 = enumC46271Ke3;
        this.A05 = enumC46186KcO;
        this.A07 = str;
        this.A06 = C50252MHh.A00(userSession);
    }
}
