package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.ERu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32468ERu extends AbstractC65632xz {
    public boolean A00;
    public boolean A01;
    public final Context A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final InterfaceC37214GaP A05;
    public final C41951wl A06;
    public final C41891wf A07;
    public final boolean A08;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0036, code lost:
    
        if (r28.A07.A0D(X.C41891wf.A03(r28.A06, java.util.Collections.singletonList(r7.A00.getId()))) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01a3, code lost:
    
        if (r6 != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0220, code lost:
    
        if (r0.CYY() != false) goto L80;
     */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r29, android.view.View r30, java.lang.Object r31, java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32468ERu.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public C32468ERu(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC37214GaP interfaceC37214GaP) {
        this.A02 = context;
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A05 = interfaceC37214GaP;
        this.A08 = AbstractC31174DnI.A1V(userSession);
        this.A06 = C41951wl.A00(userSession);
        C41891wf A01 = C41891wf.A01(userSession);
        C14360o3.A07(A01);
        this.A07 = A01;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 91280115);
        View inflate = LayoutInflater.from(this.A02).inflate(R.layout.direct_user_row, viewGroup, false);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) AbstractC166997dE.A0S(inflate, R.id.row_user_avatar);
        TextView textView = (TextView) AbstractC166997dE.A0S(inflate, R.id.row_user_primary_name);
        TextView textView2 = (TextView) AbstractC166997dE.A0S(inflate, R.id.row_user_secondary_name);
        FollowButton followButton = (FollowButton) AbstractC166997dE.A0S(inflate, R.id.button);
        IgdsButton igdsButton = (IgdsButton) AbstractC166997dE.A0S(inflate, R.id.remove_button);
        FOP fop = new FOP(textView, textView2, (TextView) AbstractC166997dE.A0S(inflate, R.id.row_user_blocked_text), (IgSimpleImageView) AbstractC166997dE.A0S(inflate, R.id.arrow_action_button), (ColorFilterAlphaImageView) AbstractC166997dE.A0S(inflate, R.id.user_admin_tools_button), AbstractC56372iV.A01(inflate.requireViewById(R.id.internal_badge), false, false), igdsButton, (IgdsButton) AbstractC166997dE.A0S(inflate, R.id.message_button), (IgdsButton) AbstractC166997dE.A0S(inflate, R.id.see_channel_button), gradientSpinnerAvatarView, followButton);
        fop.A09.setGradientSpinnerVisible(false);
        inflate.setTag(fop);
        C0f9.A0A(-1917120754, A0G);
        return inflate;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
