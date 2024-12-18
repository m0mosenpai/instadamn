package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes6.dex */
public final class FQC {
    public boolean A00;
    public final int A01;
    public final AbstractC35127FeU A02;
    public final View A03;
    public final /* synthetic */ AbstractC31781Dxr A04;

    /* JADX WARN: Multi-variable type inference failed */
    public FQC(AbstractC31781Dxr abstractC31781Dxr, int i) {
        View contentView;
        int i2;
        List list;
        IgTextView igTextView;
        C32878EdK c32878EdK;
        this.A04 = abstractC31781Dxr;
        this.A01 = i;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        this.A03 = abstractC31781Dxr.getContentView().findViewById(R.id.avatar_image_view_3);
                        contentView = abstractC31781Dxr.getContentView();
                        i2 = R.id.avatar_label_text_3;
                    } else {
                        throw AbstractC166987dD.A14("rank higher than MAX_AVATAR_COUNT");
                    }
                } else {
                    this.A03 = abstractC31781Dxr.getContentView().findViewById(R.id.avatar_image_view_2);
                    contentView = abstractC31781Dxr.getContentView();
                    i2 = R.id.avatar_label_text_2;
                }
            } else {
                this.A03 = abstractC31781Dxr.getContentView().findViewById(R.id.avatar_image_view_1);
                contentView = abstractC31781Dxr.getContentView();
                i2 = R.id.avatar_label_text_1;
            }
        } else {
            this.A03 = abstractC31781Dxr.getContentView().findViewById(R.id.avatar_image_view_0);
            contentView = abstractC31781Dxr.getContentView();
            i2 = R.id.avatar_label_text_0;
        }
        IgTextView A0Y = AbstractC31172DnG.A0Y(contentView, i2);
        boolean z = abstractC31781Dxr instanceof C32880EdM;
        if (z) {
            list = ((C32880EdM) abstractC31781Dxr).A01;
        } else {
            list = ((C32881EdN) abstractC31781Dxr).A01;
        }
        int i3 = new int[]{list.size(), 4}[0];
        int i4 = AbstractC34190F6o.A00(abstractC31781Dxr.A0P) ? (4 < i3 ? 4 : i3) - i : i - 1;
        View view = this.A03;
        if (z) {
            C32880EdM c32880EdM = (C32880EdM) abstractC31781Dxr;
            AbstractC167017dG.A1P(view, A0Y);
            C32879EdL c32879EdL = new C32879EdL(c32880EdM.A0G, c32880EdM.A0L, c32880EdM.A0M, A0Y, (DirectShareTarget) c32880EdM.A01.get(i4), (GradientSpinnerAvatarView) view, i, c32880EdM.A08);
            DirectShareTarget directShareTarget = c32879EdL.A02;
            C08730cb c08730cb = C17060sy.A01;
            UserSession userSession = c32879EdL.A01;
            User A01 = c08730cb.A01(userSession);
            List A18 = AbstractC31172DnG.A18(directShareTarget);
            directShareTarget.A0R();
            C3AY A02 = AbstractC81683kd.A02(null, A01, null, A18);
            boolean A0M = directShareTarget.A0M();
            GradientSpinnerAvatarView gradientSpinnerAvatarView = c32879EdL.A03;
            if (A0M) {
                AbstractC31175DnJ.A0w(A02, c32879EdL.A08, gradientSpinnerAvatarView, A02.A00);
            } else {
                gradientSpinnerAvatarView.A0F(null, c32879EdL.A08, (ImageUrl) A02.A00);
            }
            igTextView = c32879EdL.A09;
            igTextView.setText(AbstractC13670mt.A04(AbstractC31172DnG.A14(directShareTarget), c32879EdL.A00));
            if (c32879EdL.A04) {
                boolean A1V = AbstractC31174DnI.A1V(userSession);
                C41951wl A00 = C41951wl.A00(userSession);
                C41891wf A012 = C41891wf.A01(userSession);
                C14360o3.A07(A012);
                if (A1V && A012.A0A(directShareTarget, A00)) {
                    Context context = c32879EdL.A06;
                    gradientSpinnerAvatarView.setBottomBadgeDrawable(context.getDrawable(AbstractC53242c7.A0H(context, R.attr.presenceBadgeMedium)));
                }
            }
            gradientSpinnerAvatarView.A05();
            gradientSpinnerAvatarView.setVisibility(0);
            c32878EdK = c32879EdL;
        } else {
            C32881EdN c32881EdN = (C32881EdN) abstractC31781Dxr;
            AbstractC167017dG.A1P(view, A0Y);
            C32878EdK c32878EdK2 = new C32878EdK(c32881EdN.A0G, c32881EdN.A0L, (IgSimpleImageView) view, A0Y, (AbstractC35044FcH) c32881EdN.A01.get(i4));
            IgSimpleImageView igSimpleImageView = c32878EdK2.A00;
            AbstractC35044FcH abstractC35044FcH = c32878EdK2.A01;
            igSimpleImageView.setImageResource(abstractC35044FcH.A04);
            igTextView = c32878EdK2.A09;
            igTextView.setText(abstractC35044FcH.A00);
            c32878EdK = c32878EdK2;
        }
        igTextView.setTextSize(0.0f);
        this.A02 = c32878EdK;
    }

    public final Object A00() {
        C32879EdL c32879EdL;
        AbstractC35127FeU abstractC35127FeU = this.A02;
        if ((abstractC35127FeU instanceof C32879EdL) && (c32879EdL = (C32879EdL) abstractC35127FeU) != null) {
            return c32879EdL.A02;
        }
        C14360o3.A0C(abstractC35127FeU, "null cannot be cast to non-null type com.instagram.direct.share.ui.quicksend.QuickSendExternalPog");
        return ((C32878EdK) abstractC35127FeU).A01;
    }
}
