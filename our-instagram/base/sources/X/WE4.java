package X;

import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;

/* loaded from: classes11.dex */
public abstract class WE4 {
    public static void A00(C18920wW c18920wW, C38266GsB c38266GsB) {
        User user = c38266GsB.A0L;
        C41181vS c41181vS = c38266GsB.A0K;
        c41181vS.getClass();
        C38321qM c38321qM = c41181vS.A0b;
        if (user != null && c38321qM != null && c38266GsB.A0M != C05F.A0Y) {
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "reel_viewer_dashboard_message_click");
            A00.AAP("nav_chain", "");
            A00.AAP("radio_type", "");
            A00.A9K("target_id", AbstractC25228BEl.A13(user.getId()));
            String A38 = c38321qM.A38();
            A38.getClass();
            AbstractC25236BEt.A0r(A00, A38);
            A00.A9K(AbstractC111324zv.A00(540), Long.valueOf(user.BJ8()));
            A00.A7v("has_like", Boolean.valueOf(c38266GsB.A0B));
            boolean z = true;
            A00.A7v("has_avatar_reaction", Boolean.valueOf(AbstractC167007dF.A1W(c38266GsB.A01)));
            if (c38266GsB.A00 == null) {
                z = false;
            }
            A00.A7v("has_emoji_reaction", Boolean.valueOf(z));
            A00.Cht();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00fa, code lost:
    
        if (r8.A00 != null) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(com.instagram.common.session.UserSession r10, X.C38266GsB r11, X.C69485Vo8 r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WE4.A01(com.instagram.common.session.UserSession, X.GsB, X.Vo8, boolean):void");
    }

    public static void A02(C38266GsB c38266GsB, InterfaceC71989XEc interfaceC71989XEc, C69485Vo8 c69485Vo8) {
        C57012jc c57012jc = c69485Vo8.A0H;
        c57012jc.A03(0);
        WNP.A00(c57012jc.A01(), 65, interfaceC71989XEc, c38266GsB);
        c69485Vo8.A04.setVisibility(8);
        c69485Vo8.A05.setVisibility(8);
    }

    public static void A03(C38266GsB c38266GsB, GradientSpinnerAvatarView gradientSpinnerAvatarView, float f) {
        if (gradientSpinnerAvatarView.getGradientSpinnerActivated() && !c38266GsB.A0N) {
            for (int i = 0; i < gradientSpinnerAvatarView.getChildCount(); i++) {
                gradientSpinnerAvatarView.getChildAt(i).setAlpha(f);
            }
            return;
        }
        gradientSpinnerAvatarView.setAlpha(f);
    }
}
