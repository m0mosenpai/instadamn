package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final class KKk extends C3PD {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public KKk(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj3;
        this.A04 = obj4;
        this.A02 = obj;
        this.A03 = obj2;
    }

    @Override // X.C3PD, X.C3PE
    public final boolean DsE(View view) {
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                C189448aO A0y = AbstractC25225BEi.A0y((AbstractC12990ll) this.A04);
                A0y.A0k = true;
                A0y.A1O = true;
                A0y.A00().A02((Activity) this.A02, (Fragment) this.A03);
                return true;
            case 1:
                UserSession userSession = ((C41096IHn) this.A04).A03;
                AbstractC31176DnK.A0d((Activity) this.A01, AbstractC31364DqT.A02().A01(userSession, AbstractC31402Dr6.A02(userSession, ((User) this.A03).getUsername(), "clips_comments_question_response_more_options", "comments_question_responses_list").A03()), userSession, ModalActivity.class, "profile").A0C((Context) this.A02);
                return true;
            case 2:
                C38686GzR c38686GzR = ((UPQ) this.A03).A01;
                if (c38686GzR != null && (str2 = c38686GzR.A02) != null) {
                    ((C69681VtR) this.A02).A01(str2, C05F.A00);
                }
                Context context = (Context) this.A01;
                C14360o3.A0A(context);
                UserSession userSession2 = (UserSession) this.A04;
                if (c38686GzR != null) {
                    str = c38686GzR.A02;
                } else {
                    str = null;
                }
                AbstractC31177DnL.A0u(context, userSession2, C2Fb.A49, str);
                return true;
            default:
                C14360o3.A0B(view, 0);
                if (C76493bt.A07(((BNJ) this.A04).A00, (C120985dq) this.A02)) {
                    ((InterfaceC16620sF) this.A03).invoke(this.A01, view);
                    return true;
                }
                return false;
        }
    }
}
