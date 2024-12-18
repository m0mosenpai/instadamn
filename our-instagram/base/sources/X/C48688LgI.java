package X;

import android.content.Context;
import android.text.Spannable;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.util.Iterator;

/* renamed from: X.LgI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48688LgI implements InterfaceC37193Ga4 {
    public final C38321qM A00;
    public final C41181vS A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final User A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final boolean A0E;

    public C48688LgI(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z) {
        AbstractC25229BEm.A1I(str2, 4, str4);
        this.A03 = userSession;
        this.A0D = str2;
        this.A07 = str;
        this.A02 = interfaceC11380iw;
        User A0k = AbstractC31174DnI.A0k(userSession, str2);
        if (A0k != null) {
            this.A04 = A0k;
            Reel A0M = C1OU.A04(userSession).A0M(str3);
            if (A0M != null) {
                C41181vS c41181vS = null;
                Iterator it = A0M.A0O(userSession).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C41181vS c41181vS2 = (C41181vS) it.next();
                    if (str4.equals(c41181vS2.A0j)) {
                        c41181vS = c41181vS2;
                        break;
                    }
                }
                this.A0B = str8;
                this.A08 = str6;
                if (c41181vS != null) {
                    this.A01 = c41181vS;
                    C38321qM c38321qM = c41181vS.A0b;
                    c38321qM.getClass();
                    this.A00 = c38321qM;
                    this.A0E = z;
                    this.A0C = str5;
                    c38321qM.getId();
                    User A2E = c38321qM.A2E(this.A03);
                    if (A2E != null) {
                        A2E.getId();
                        this.A09 = str7;
                        this.A0A = str9;
                        this.A05 = str10;
                        this.A06 = str11;
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC37193Ga4
    public final void CNX(ViewStub viewStub, ViewStub viewStub2, ViewStub viewStub3) {
        Context context;
        int i;
        int i2;
        C14360o3.A0B(viewStub, 0);
        AbstractC167017dG.A1P(viewStub2, viewStub3);
        View A0E = AbstractC31173DnH.A0E(viewStub, R.layout.fragment_direct_reply_modal_gradient_spinner_circular_profile);
        C14360o3.A0C(A0E, "null cannot be cast to non-null type com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView");
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) A0E;
        ImageUrl Bhu = this.A04.Bhu();
        InterfaceC11380iw interfaceC11380iw = this.A02;
        gradientSpinnerAvatarView.A0F(null, interfaceC11380iw, Bhu);
        gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        if (this.A0E) {
            gradientSpinnerAvatarView.setBottomBadgeDrawable(AER.A00(AbstractC166997dE.A0L(gradientSpinnerAvatarView)));
        } else {
            String str = this.A05;
            if (str != null) {
                context = AbstractC166997dE.A0L(gradientSpinnerAvatarView);
                UserSession userSession = this.A03;
                gradientSpinnerAvatarView.setBottomBadgeDrawable(C74N.A02(context, userSession, str, context.getResources().getDimensionPixelSize(R.dimen.account_group_management_clickable_width), AbstractC166997dE.A04(context, R.dimen.account_group_management_clickable_width), AbstractC47041Kqy.A00(userSession)));
                i = R.dimen.abc_edit_text_inset_top_material;
                i2 = R.dimen.ai_agent_share_profile_sticker_padding;
            } else {
                String str2 = this.A06;
                if (str2 != null) {
                    Spannable spannable = C6RB.A0d;
                    context = gradientSpinnerAvatarView.getContext();
                    C14360o3.A07(context);
                    C6RB c6rb = new C6RB(context, context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material));
                    c6rb.A0M(str2);
                    c6rb.A0A(AbstractC166997dE.A04(context, R.dimen.abc_dialog_padding_top_material));
                    gradientSpinnerAvatarView.setBottomBadgeDrawable(c6rb);
                    i = R.dimen.add_account_icon_circle_radius;
                    i2 = R.dimen.album_preview_add_item_margin;
                } else {
                    gradientSpinnerAvatarView.setBottomBadgeDrawable(null);
                }
            }
            gradientSpinnerAvatarView.A0C(context, i, i2);
        }
        viewStub2.setLayoutResource(R.layout.fragment_direct_reply_modal_subtitle);
        String str3 = this.A0C;
        if (str3 != null) {
            View inflate = viewStub2.inflate();
            C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.base.IgTextView");
            ((TextView) inflate).setText(str3);
        }
        UserSession userSession2 = this.A03;
        String str4 = this.A07;
        C38321qM c38321qM = this.A00;
        String A38 = c38321qM.A38();
        if (A38 == null) {
            A38 = "";
        }
        String name = c38321qM.BRp().name();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31173DnH.A0Q(interfaceC11380iw, userSession2, name, 4), "ig_direct_modal_composer_open");
        AbstractC31171DnF.A1G(A0f, str4);
        A0f.AAP("media_type", name);
        AbstractC37301Gc2.A15(A0f, interfaceC11380iw);
        A0f.AAP("media_id", A38);
        A0f.Cht();
    }

    @Override // X.InterfaceC37193Ga4
    public final /* synthetic */ void DDM(C148336m3 c148336m3) {
    }

    @Override // X.InterfaceC37193Ga4
    public final User CE6() {
        return this.A04;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r18.A03, 36314794596240187L) == false) goto L8;
     */
    @Override // X.InterfaceC37193Ga4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EOe(X.C2EC r19, X.C2DS r20, com.instagram.model.direct.DirectShareTarget r21, java.lang.String r22, boolean r23) {
        /*
            r18 = this;
            r7 = r19
            r8 = r22
            X.AbstractC167017dG.A1O(r8, r7)
            r5 = r18
            java.lang.String r3 = r5.A08
            if (r3 == 0) goto L27
            java.lang.String r0 = r5.A0A
            com.instagram.reels.question.model.responsetype.QuestionResponseType r1 = X.AbstractC201648vt.A00(r0)
            com.instagram.reels.question.model.responsetype.QuestionResponseType r0 = com.instagram.reels.question.model.responsetype.QuestionResponseType.A06
            if (r1 == r0) goto L27
            com.instagram.common.session.UserSession r4 = r5.A03
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36314794596240187(0x81041d00000b3b, double:3.0289605583785067E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            r1 = 1
            if (r0 != 0) goto L28
        L27:
            r1 = 0
        L28:
            java.util.List r0 = r7.BSH()
            java.util.ArrayList r6 = X.C4GO.A01(r0)
            r9 = 4
            X.MHY r4 = new X.MHY
            r10 = r23
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.0sx r0 = X.AbstractC09440dt.A01(r4)
            com.instagram.common.session.UserSession r4 = r5.A03
            if (r1 == 0) goto L81
            java.lang.Object r2 = r0.getValue()
            X.JxM r2 = (X.C45092JxM) r2
            java.lang.String r0 = r5.A0A
            r2.A0C = r0
            java.lang.String r1 = r5.A0D
            java.lang.String r0 = r5.A0B
            r2.A0A = r3
            r2.A08 = r1
            r2.A09 = r0
            java.lang.String r0 = r5.A09
            r2.A0B = r0
            X.Jvr r2 = r2.A00()
            java.lang.String r1 = r5.A07
            com.instagram.model.direct.DirectShareTarget r0 = r2.A01
            X.7TM r0 = X.AbstractC140396Wt.A02(r4, r0)
            r0.EOU(r2, r1)
        L67:
            X.0iw r3 = r5.A02
            java.lang.String r2 = r5.A07
            X.1qM r0 = r5.A00
            java.lang.String r1 = r0.A38()
            if (r1 != 0) goto L75
            java.lang.String r1 = ""
        L75:
            X.1tc r0 = r0.BRp()
            java.lang.String r0 = r0.name()
            X.C162337Ov.A0L(r3, r4, r2, r1, r0)
            return
        L81:
            X.7TG r11 = X.AbstractC165967bO.A00(r4)
            com.instagram.model.direct.DirectThreadKey r13 = r7.BKb()
            r12 = 0
            java.lang.String r15 = "none"
            r14 = r8
            r16 = r12
            r17 = r10
            r11.EOZ(r12, r13, r14, r15, r16, r17)
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48688LgI.EOe(X.2EC, X.2DS, com.instagram.model.direct.DirectShareTarget, java.lang.String, boolean):void");
    }
}
