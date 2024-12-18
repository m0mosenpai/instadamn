package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.api.schemas.GrowthFrictionInterventionButton;
import com.instagram.api.schemas.GrowthFrictionInterventionDetail;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IfU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnClickListenerC41814IfU implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public DialogInterfaceOnClickListenerC41814IfU(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.A00 = i;
        this.A01 = obj5;
        this.A02 = obj4;
        this.A03 = obj;
        this.A04 = obj2;
        this.A05 = obj6;
        this.A06 = obj3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                C123675ig c123675ig = (C123675ig) this.A02;
                int position = ((C42664IuL) this.A05).getPosition();
                C5I6.A01((UserSession) this.A06, c123675ig, (InterfaceC60442pS) this.A01, ((C1M1) this.A04).getSessionId(), position);
                C41083IHa c41083IHa = (C41083IHa) this.A03;
                C685736u.A00(c41083IHa.A00, c41083IHa.A01, EnumC114405Eh.A02, c41083IHa.A02);
                return;
            case 1:
                C38321qM c38321qM = (C38321qM) this.A01;
                UserSession userSession = (UserSession) this.A02;
                Context context = (Context) this.A03;
                Fragment fragment = (Fragment) this.A04;
                List list = (List) this.A05;
                C1P1 c1p1 = (C1P1) this.A06;
                CallerContext callerContext = C42089Ikw.A00;
                C08790ch A00 = AbstractC018607g.A00(fragment);
                try {
                    C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
                    AbstractC31173DnH.A1Q(A0M, MSV.A00(226), new Object[]{c38321qM.getId(), c38321qM.BRp()});
                    A0M.A9s("media_id", c38321qM.getId());
                    String A002 = MSV.A00(1113);
                    C14360o3.A0B(list, 1);
                    StringWriter A0O = AbstractC37300Gc1.A0O();
                    C17z A0S = AbstractC167007dF.A0S(A0O);
                    Iterator A0q = AbstractC37301Gc2.A0q(A0S, MSV.A00(1112), list);
                    while (A0q.hasNext()) {
                        AbstractC167017dG.A1F(A0S, A0q);
                    }
                    A0S.A0Z();
                    A0S.A0S("source_app", "IG");
                    A0M.A9s(A002, AbstractC167017dG.A0l(A0S, A0O));
                    A0M.A0S(H9U.class, C41256INx.class);
                    C1ON A0U = AbstractC31172DnG.A0U(A0M, true);
                    if (c1p1 != null) {
                        A0U.A00 = c1p1;
                    }
                    C1GJ.A00(context, A00, A0U);
                } catch (IOException e) {
                    C0f5 AEp = C18950wb.A01.AEp("MediaOptionsOverflowDeleteHandler.getDeepDeleteMediaOnClickListener", 817891209);
                    AEp.ERI(e);
                    AEp.report();
                }
                AbstractC40629Hzn.A00("delete_from_both", userSession, c38321qM);
                return;
            default:
                UserSession userSession2 = (UserSession) this.A06;
                User user = (User) this.A05;
                GrowthFrictionInterventionDetail growthFrictionInterventionDetail = (GrowthFrictionInterventionDetail) this.A03;
                Integer num = (Integer) this.A04;
                C14360o3.A0B(num, 3);
                C41682IdB.A00(growthFrictionInterventionDetail, userSession2, user, num, "user_selected_url_button_on_dialog");
                SimpleWebViewActivity.A02.A02((Context) this.A02, userSession2, new SimpleWebViewConfig(((GrowthFrictionInterventionButton) this.A01).getUrl(), (String) null, (String) null, (String) null, false, false, false, false, true, true, false, true, false, false, false, false));
                return;
        }
    }
}
