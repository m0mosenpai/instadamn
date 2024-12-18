package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Ah4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23852Ah4 implements InterfaceC25184BCh, InterfaceC25183BCg {
    public AAH A00;
    public C24015Akt A01;
    public final Activity A02;
    public final Context A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final InterfaceC56392iX A06;
    public final InterfaceC09390do A07;
    public final C8O8 A08;
    public final C8NX A09;

    public C23852Ah4(Activity activity, Context context, View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C8O8 c8o8, C8NX c8nx) {
        AbstractC167007dF.A1H(context, 2, c8o8);
        this.A03 = context;
        this.A09 = c8nx;
        this.A04 = interfaceC11380iw;
        this.A05 = userSession;
        this.A02 = activity;
        this.A08 = c8o8;
        this.A06 = AbstractC166997dE.A0X(view, R.id.reaction_sticker_stub);
        this.A07 = B8S.A00(view, 40);
    }

    @Override // X.InterfaceC25184BCh
    public final void DDv(Object obj) {
        ConstraintLayout constraintLayout;
        IgSimpleImageView igSimpleImageView;
        IgSimpleImageView igSimpleImageView2;
        IgImageView igImageView;
        IgImageView igImageView2;
        IgImageView igImageView3;
        C14360o3.A0B(obj, 0);
        this.A01 = ((C188138Ve) obj).A00;
        this.A08.Dom("reaction_sticker_bundle_id");
        if (this.A00 == null) {
            AAH aah = new AAH(this.A06);
            this.A00 = aah;
            IgImageView igImageView4 = aah.A03;
            if (igImageView4 != null) {
                A00(igImageView4, this, "😍");
            }
            AAH aah2 = this.A00;
            if (aah2 != null && (igImageView3 = aah2.A04) != null) {
                A00(igImageView3, this, "😂");
            }
            AAH aah3 = this.A00;
            if (aah3 != null && (igImageView2 = aah3.A05) != null) {
                A00(igImageView2, this, "😮");
            }
            AAH aah4 = this.A00;
            if (aah4 != null && (igImageView = aah4.A06) != null) {
                A00(igImageView, this, "😢");
            }
            AAH aah5 = this.A00;
            if (aah5 != null && (igSimpleImageView2 = aah5.A01) != null) {
                C0fQ.A00(new ViewOnClickListenerC48063LPo(this, 28), igSimpleImageView2);
            }
        }
        AAH aah6 = this.A00;
        if (aah6 != null && (igSimpleImageView = aah6.A02) != null) {
            igSimpleImageView.setImageDrawable(new C220899pD(this.A03, this.A01, true, false));
        }
        AAH aah7 = this.A00;
        if (aah7 != null && (constraintLayout = aah7.A00) != null) {
            constraintLayout.setVisibility(0);
        }
        AbstractC125325le.A04(null, new View[]{AbstractC166987dD.A0d(this.A07), this.A06.getView()}, !C18U.A06(C06090Tz.A05, this.A05, 36323238501952604L));
    }

    @Override // X.InterfaceC25183BCg
    public final View B0N() {
        AAH aah = this.A00;
        if (aah != null) {
            return aah.A02;
        }
        return null;
    }

    @Override // X.InterfaceC25183BCg
    public final Class C0Y() {
        return C220899pD.class;
    }

    @Override // X.InterfaceC25184BCh
    public final void DEy() {
        if (this.A00 != null) {
            AbstractC166997dE.A1J(AbstractC166987dD.A0d(this.A07), this.A06.getView(), true);
        }
        C24015Akt c24015Akt = this.A01;
        if (c24015Akt == null) {
            new C106074qN("😍", false);
            c24015Akt = new C24015Akt(new C106074qN("😍", false));
        }
        C14360o3.A0C(c24015Akt, "null cannot be cast to non-null type com.instagram.reels.reaction.model.ReactionStickerClientModel");
        C8NX c8nx = this.A09;
        C24015Akt c24015Akt2 = this.A01;
        if (c24015Akt2 == null) {
            new C106074qN("😍", false);
            c24015Akt2 = new C24015Akt(new C106074qN("😍", false));
        }
        c8nx.Dog(c24015Akt2, AnonymousClass001.A0R("emoji_reaction_", c24015Akt.A00.A00));
        this.A08.Doh("reaction_sticker_bundle_id");
    }

    public static void A00(IgImageView igImageView, C23852Ah4 c23852Ah4, String str) {
        igImageView.setUrl(C168157fA.A00(C168157fA.A02(str), str), c23852Ah4.A04);
        C0fQ.A00(new WMS(str, c23852Ah4, 5), igImageView);
    }
}
