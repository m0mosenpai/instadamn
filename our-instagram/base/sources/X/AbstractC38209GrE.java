package X;

import android.content.Context;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.discovery.ui.FixedAspectRatioVideoLayout;
import com.instagram.igds.components.imagebutton.IgImageButton;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.GrE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38209GrE {
    public static final void A00(Context context, Fragment fragment, C5qT c5qT, UserSession userSession, C127915qK c127915qK, AbstractC42425IqS abstractC42425IqS, C38213GrI c38213GrI, C37931GmT c37931GmT, InterfaceC60442pS interfaceC60442pS, String str, boolean z) {
        C38214GrJ c38214GrJ;
        float f;
        String BKx;
        float f2;
        ViewOnTouchListenerC42056IkP viewOnTouchListenerC42056IkP;
        AbstractC167017dG.A1R(fragment, interfaceC60442pS);
        C14360o3.A0B(abstractC42425IqS, 5);
        AbstractC167007dF.A1J(userSession, 8, str);
        C38210GrF c38210GrF = new C38210GrF(userSession);
        C38208GrD c38208GrD = new C38208GrD(userSession, c37931GmT);
        ViewOnClickListenerC42030Ijz viewOnClickListenerC42030Ijz = new ViewOnClickListenerC42030Ijz(6, abstractC42425IqS, new C38211GrG(context, fragment, userSession, c38208GrD, interfaceC60442pS, str), c37931GmT, c5qT);
        c38213GrI.A00 = c37931GmT;
        C75113Zb c75113Zb = c37931GmT.A00;
        c75113Zb.A0L(c38213GrI, null, false);
        C3YT A00 = C3YS.A00(userSession);
        C38321qM BQN = c37931GmT.BQN();
        if (A00.A05(BQN)) {
            IZ9.A00(new ViewOnClickListenerC41994IjP(1, abstractC42425IqS, interfaceC60442pS, userSession, c38208GrD, c37931GmT), interfaceC60442pS, BQN, c38213GrI.A05, c5qT.A01, c5qT.A00, false, AbstractC153456vF.A02(userSession));
            c38213GrI.A02.setVisibility(8);
            c38213GrI.A03.setVisibility(8);
            return;
        }
        ExtendedImageUrl A1q = BQN.A1q(context);
        if (A1q != null) {
            if (c127915qK.A02 == 1 && c127915qK.A04 == 2) {
                f2 = 0.495f;
            } else {
                f2 = c127915qK.A00;
            }
            IgImageButton igImageButton = c38213GrI.A05;
            igImageButton.A0F(interfaceC60442pS, A1q, z);
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession, 36329577873686941L)) {
                igImageButton.setOnLongClickListener(new ViewOnLongClickListenerC44303Jhu(2, context, c38210GrF, interfaceC60442pS, c37931GmT));
            }
            ((ConstrainedImageView) igImageButton).A00 = f2;
            C38212GrH c38212GrH = new C38212GrH(abstractC42425IqS, c37931GmT);
            if (C18U.A06(c06090Tz, userSession, 36329577873686941L)) {
                viewOnTouchListenerC42056IkP = new ViewOnTouchListenerC42056IkP(1, c5qT, abstractC42425IqS, c37931GmT);
            } else {
                viewOnTouchListenerC42056IkP = null;
            }
            AbstractC153386v7.A02(viewOnClickListenerC42030Ijz, viewOnTouchListenerC42056IkP, interfaceC60442pS, userSession, BQN, c38212GrH, null, igImageButton, null, null, c127915qK.A00, c5qT.A01, c5qT.A00, 0, false, z, false, false, false);
            igImageButton.setTag(R.id.post_impression_view_tracking_node, EnumC77673dr.A0K);
        } else {
            C0w9.A03("SmallAdsGridViewBinder", "Missing Image");
        }
        InterfaceC39541sb A0F = AbstractC37300Gc1.A0F(BQN);
        if (A0F != null && (BKx = A0F.BKx()) != null) {
            c38213GrI.A02.setText(BKx);
        } else {
            C0w9.A03("SmallAdsGridViewBinder", "Missing Sponsored Label");
        }
        TextView textView = c38213GrI.A02;
        C14360o3.A0B(textView, 1);
        textView.setTag(R.id.post_impression_view_tracking_node, EnumC77673dr.A0S);
        User A14 = AbstractC25226BEj.A14(BQN);
        if (A14 != null) {
            ImageUrl Bhu = A14.Bhu();
            CircularImageView circularImageView = c38213GrI.A03;
            circularImageView.setVisibility(0);
            circularImageView.A0F(interfaceC60442pS, Bhu, z);
        } else {
            C0w9.A03("SmallAdsGridViewBinder", "Missing Profile Pic URL");
        }
        CircularImageView circularImageView2 = c38213GrI.A03;
        C14360o3.A0B(circularImageView2, 1);
        circularImageView2.setTag(R.id.post_impression_view_tracking_node, EnumC77673dr.A0Q);
        if (BQN.Cff() && (c38213GrI instanceof C38218GrN)) {
            FixedAspectRatioVideoLayout fixedAspectRatioVideoLayout = ((C38218GrN) c38213GrI).A00;
            fixedAspectRatioVideoLayout.setVideoSource(BQN, interfaceC60442pS);
            if (c127915qK.A02 == 1 && c127915qK.A04 == 2) {
                f = 0.495f;
            } else {
                f = c127915qK.A00;
            }
            fixedAspectRatioVideoLayout.setAspectRatio(f);
            C0fQ.A00(viewOnClickListenerC42030Ijz, fixedAspectRatioVideoLayout);
            fixedAspectRatioVideoLayout.setOnLongClickListener(new ViewOnLongClickListenerC44303Jhu(3, c38210GrF, interfaceC60442pS, c37931GmT, fixedAspectRatioVideoLayout));
        }
        if ((c38213GrI instanceof C38218GrN) || (c38214GrJ = c38213GrI.A04) == null) {
            return;
        }
        c38214GrJ.A02 = AbstractC86573tV.A00(BQN, abstractC42425IqS.CHG(), c75113Zb);
    }
}
