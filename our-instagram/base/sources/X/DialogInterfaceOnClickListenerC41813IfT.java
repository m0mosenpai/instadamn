package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.api.schemas.GrowthFrictionInterventionDetail;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.IfT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnClickListenerC41813IfT implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public DialogInterfaceOnClickListenerC41813IfT(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A04 = obj5;
        this.A05 = obj4;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                C38321qM c38321qM = (C38321qM) this.A01;
                UserSession userSession = (UserSession) this.A02;
                Context context = (Context) this.A03;
                Fragment fragment = (Fragment) this.A04;
                C1P1 c1p1 = (C1P1) this.A05;
                CallerContext callerContext = C42089Ikw.A00;
                C42089Ikw.A01(context, AbstractC018607g.A00(fragment), c1p1, userSession, c38321qM);
                AbstractC40629Hzn.A00(AbstractC111324zv.A00(2236), userSession, c38321qM);
                return;
            case 1:
                C55909Os0 c55909Os0 = (C55909Os0) this.A05;
                Context context2 = (Context) this.A01;
                C41181vS c41181vS = (C41181vS) this.A02;
                Object obj = this.A03;
                Object obj2 = this.A04;
                UserSession userSession2 = c55909Os0.A0B;
                C41618Ib8 c41618Ib8 = c41181vS.A0E;
                c41618Ib8.getClass();
                String str = c41618Ib8.A03.A00.A02;
                if (str != null) {
                    C25621Ms A0c = AbstractC167017dG.A0c(userSession2);
                    A0c.A0B("brandx/superlatives/delete_superlatives_card/");
                    A0c.A9s("card_id", str);
                    A0c.A0R(C38829H8d.class, IOH.class);
                    C1ON A0U = AbstractC31172DnG.A0U(A0c, true);
                    C6WQ c6wq = new C6WQ(context2, true);
                    c6wq.A00(context2.getString(2131974956));
                    A0U.A00 = new HGH(2, c41181vS, c55909Os0, obj2, c6wq, obj, context2);
                    C1GJ.A00(context2, c55909Os0.A08, A0U);
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 2:
                C38321qM c38321qM2 = (C38321qM) this.A04;
                String A34 = c38321qM2.A34();
                if (A34 == null) {
                    return;
                }
                String A38 = c38321qM2.A38();
                if (A38 != null) {
                    AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A05;
                    Context context3 = (Context) this.A01;
                    AbstractC018607g abstractC018607g = (AbstractC018607g) this.A03;
                    HG2 hg2 = new HG2(2, context3, this.A02, abstractC12990ll, c38321qM2);
                    C14360o3.A0B(abstractC018607g, 4);
                    C25621Ms A0c2 = AbstractC167017dG.A0c(abstractC12990ll);
                    A0c2.A0B("fundraiser/untag_fundraiser_in_feed_media/");
                    A0c2.A9s("medium_igid", A38);
                    C1ON A0K = AbstractC31178DnM.A0K(A0c2, "fundraiser_id", A34);
                    A0K.A00 = hg2;
                    C1GJ.A00(context3, abstractC018607g, A0K);
                    return;
                }
                throw AbstractC166997dE.A0g();
            default:
                UserSession userSession3 = (UserSession) this.A05;
                User user = (User) this.A04;
                GrowthFrictionInterventionDetail growthFrictionInterventionDetail = (GrowthFrictionInterventionDetail) this.A02;
                Integer num = (Integer) this.A03;
                C14360o3.A0B(num, 3);
                C41682IdB.A00(growthFrictionInterventionDetail, userSession3, user, num, MSV.A00(602));
                dialogInterface.dismiss();
                ((Runnable) this.A01).run();
                return;
        }
    }
}
