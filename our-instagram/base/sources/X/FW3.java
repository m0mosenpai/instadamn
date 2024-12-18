package X;

import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FW3 {
    public static final void A00(C35023Fbw c35023Fbw, C34711FQw c34711FQw, FRG frg, UserSession userSession, C57012jc c57012jc, C57012jc c57012jc2, C5HW c5hw, int i) {
        EnumC99704do enumC99704do;
        IgdsButton igdsButton = (IgdsButton) c57012jc.A01().findViewById(i);
        if (AbstractC72723Nt.A00(c57012jc.A01().getContext())) {
            enumC99704do = EnumC99704do.A06;
        } else {
            enumC99704do = EnumC99704do.A05;
        }
        igdsButton.setStyle(enumC99704do);
        if (c34711FQw != null) {
            igdsButton.setVisibility(0);
            igdsButton.setText(c34711FQw.A01);
            C0fQ.A00(new FoY(3, c34711FQw, c35023Fbw, c57012jc2, c57012jc, userSession, c5hw, frg), igdsButton);
            return;
        }
        igdsButton.setVisibility(8);
    }

    public static final void A01(UserSession userSession, C57012jc c57012jc, C57012jc c57012jc2, C5HW c5hw) {
        List unmodifiableList;
        FRG frg;
        List list;
        C34711FQw c34711FQw;
        List unmodifiableList2;
        C14360o3.A0B(userSession, 0);
        AbstractC167017dG.A1P(c57012jc, c57012jc2);
        C35023Fbw c35023Fbw = c5hw.A01;
        if (c35023Fbw != null && !c35023Fbw.A05) {
            List list2 = c35023Fbw.A04;
            if (list2 != null && (unmodifiableList = Collections.unmodifiableList(list2)) != null && (frg = (FRG) AbstractC001800i.A0J(unmodifiableList)) != null) {
                AbstractC166987dD.A0e(c57012jc.A01(), R.id.survey_question_text).setText(frg.A03);
                List list3 = frg.A05;
                if (list3 != null) {
                    list = Collections.unmodifiableList(list3);
                } else {
                    list = null;
                }
                C34711FQw c34711FQw2 = null;
                if (list != null) {
                    c34711FQw = (C34711FQw) AbstractC001800i.A0O(list, 0);
                } else {
                    c34711FQw = null;
                }
                A00(c35023Fbw, c34711FQw, frg, userSession, c57012jc, c57012jc2, c5hw, R.id.survey_answer_button_1);
                List list4 = frg.A05;
                if (list4 != null && (unmodifiableList2 = Collections.unmodifiableList(list4)) != null) {
                    c34711FQw2 = (C34711FQw) AbstractC001800i.A0O(unmodifiableList2, 1);
                }
                A00(c35023Fbw, c34711FQw2, frg, userSession, c57012jc, c57012jc2, c5hw, R.id.survey_answer_button_2);
                C0fQ.A00(new ViewOnClickListenerC35675FpA(5, c5hw, userSession, c57012jc, c35023Fbw, frg), c57012jc.A01().findViewById(R.id.close_survey_button));
                c57012jc.A03(0);
                return;
            }
            return;
        }
        c57012jc.A02();
        c57012jc2.A02();
    }
}
