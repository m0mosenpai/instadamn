package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.jobscheduler.bgfetch.IgBgFetchJob;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.DHz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29937DHz extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29937DHz(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        super(1);
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
        this.A04 = obj2;
        this.A05 = obj3;
        this.A03 = obj4;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        switch (this.A00) {
            case 1:
                InterfaceC30986Dji interfaceC30986Dji = (InterfaceC30986Dji) obj;
                C14360o3.A0B(interfaceC30986Dji, 0);
                List list = (List) this.A04;
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A05;
                C26003Ber c26003Ber = (C26003Ber) this.A03;
                C28370CfW c28370CfW = (C28370CfW) this.A02;
                int i = this.A01;
                int i2 = 0;
                for (Object obj3 : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC16960so.A1U();
                        throw C00O.createAndThrow();
                    }
                    C26021BfA c26021BfA = (C26021BfA) obj3;
                    interfaceC30986Dji.CgJ(C28146Cat.A01, c26021BfA.A00.A03(), null, C5UA.A03(new C30548DcV(c26021BfA, c26003Ber, c28370CfW, interfaceC16660sJ, i2, i), 1870628030));
                    i2 = i3;
                }
                break;
            case 2:
                View view = (View) obj;
                C14360o3.A0B(view, 0);
                Object tag = view.getTag();
                C14360o3.A0C(tag, AbstractC43591JPw.A00(183));
                C14360o3.A07(view.getContext());
                UserSession userSession = (UserSession) AbstractC25226BEj.A1B(this.A05);
                C3G4 c3g4 = (C3G4) AbstractC25226BEj.A1C(this.A04);
                int i4 = this.A01;
                AbstractC55158OdM.A03(userSession, c3g4, (C51374MmZ) tag, (InterfaceC64002vL) this.A03, ((InterfaceC11380iw) AbstractC25226BEj.A1B(this.A02)).getModuleName(), C16930sl.A00, i4, false, false);
                break;
            case 3:
                View view2 = (View) obj;
                C14360o3.A0B(view2, 0);
                Object tag2 = view2.getTag();
                C14360o3.A0C(tag2, AbstractC111324zv.A00(2794));
                Context A0L = AbstractC166997dE.A0L(view2);
                UserSession userSession2 = (UserSession) AbstractC25226BEj.A1B(this.A05);
                C3G4 c3g42 = (C3G4) AbstractC25226BEj.A1C(this.A04);
                int i5 = this.A01;
                InterfaceC64002vL interfaceC64002vL = (InterfaceC64002vL) this.A03;
                C16930sl c16930sl = C16930sl.A00;
                C3OU.A01(A0L, (InterfaceC11380iw) AbstractC25226BEj.A1B(this.A02), userSession2, c3g42, null, (C72943Ou) tag2, interfaceC64002vL, c16930sl, i5, false, true, false, true);
                break;
            case 4:
                return new IKD(AbstractC25228BEl.A0L(obj), (InterfaceC43438JHc) this.A02, (C3Y6) this.A03, (C38321qM) this.A04, (C75113Zb) this.A05, this.A01);
            case 5:
                boolean A1a = AbstractC166987dD.A1a(obj);
                Dialog dialog = (Dialog) this.A03;
                if (dialog != null) {
                    dialog.dismiss();
                }
                C79853ha c79853ha = (C79853ha) this.A05;
                if (c79853ha.A00.mView != null) {
                    C79853ha.A00(c79853ha, (C38321qM) this.A02, (C75113Zb) this.A04, this.A01, A1a);
                    break;
                }
                break;
            case 6:
                View view3 = (View) obj;
                C14360o3.A0B(view3, 0);
                CRZ crz = (CRZ) this.A05;
                C71313Hs.A00(crz.A00).A0B(view3, new String[0]);
                User user = (User) this.A04;
                if (user != null) {
                    crz.A01.D3Y((C38321qM) this.A02, (C75113Zb) this.A03, user, this.A01);
                    break;
                }
                break;
            case 7:
                List A1C = AbstractC25228BEl.A1C(obj);
                IgBgFetchJob igBgFetchJob = (IgBgFetchJob) this.A03;
                Iterator it = A1C.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (AbstractC166987dD.A0N(obj2) >= igBgFetchJob.A01) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                Number number = (Number) obj2;
                if (number == null) {
                    ((InterfaceC16660sJ) this.A02).invoke(this.A04);
                    break;
                } else {
                    List<IgBgFetchJob> list2 = (List) this.A04;
                    int i6 = this.A01;
                    ArrayList A0q = AbstractC167017dG.A0q(list2);
                    for (IgBgFetchJob igBgFetchJob2 : list2) {
                        int i7 = igBgFetchJob2.A00;
                        if (i7 == i6) {
                            igBgFetchJob2 = new IgBgFetchJob(i7, number.longValue());
                        }
                        A0q.add(igBgFetchJob2);
                    }
                    AbstractC25225BEi.A1U(this.A02, A0q);
                    break;
                }
            default:
                int action = AbstractC25228BEl.A0k(obj).A00.getAction();
                if (action != 0) {
                    if (action == 1) {
                        ((Drawable) this.A02).setTint(AbstractC77623dm.A03((C76223bS) this.A04, R.color.fds_transparent));
                        C26418Bm1 c26418Bm1 = (C26418Bm1) this.A05;
                        c26418Bm1.A00.A00((C4NJ) this.A03, c26418Bm1.A01);
                    }
                } else {
                    ((Drawable) this.A02).setTint(this.A01);
                }
                return true;
        }
        return C0eB.A00;
    }
}
