package X;

import android.graphics.RectF;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.recentlydeleted.ReelRecentlyDeletedViewerController;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Eej, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32952Eej extends AbstractC154286wd {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C32952Eej(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj;
        this.A03 = obj2;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N;
        int i;
        if (this.A00 != 0) {
            A0N = C0f9.A03(-242597266);
            AbstractC151876sX.A04(abstractC115105If, ((ReelRecentlyDeletedViewerController) this.A01).A00.getString(2131972429));
            i = 1201687870;
        } else {
            A0N = AbstractC167017dG.A0N(abstractC115105If, 1316566101);
            C14360o3.A07(AbstractC151876sX.A04(abstractC115105If, ((EVW) this.A03).A00.getString(2131972429)));
            i = 1519175410;
        }
        C0f9.A0A(i, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = C0f9.A03(-871489471);
            i = 764810164;
        } else {
            A03 = C0f9.A03(-744185873);
            i = 1224597248;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = C0f9.A03(-474955536);
            i = -1637434120;
        } else {
            A03 = C0f9.A03(1402458703);
            i = -1600813540;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = C0f9.A03(946101362);
            int A032 = C0f9.A03(-2125579034);
            FNK fnk = (FNK) this.A02;
            List list = ((C74293Vk) obj).A06;
            C3G2 c3g2 = (C3G2) this.A03;
            if (!list.isEmpty()) {
                String id = AbstractC25225BEi.A0x(list, 0).getId();
                C38321qM A0x = AbstractC25225BEi.A0x(list, 0);
                UserSession userSession = fnk.A04;
                User A2E = A0x.A2E(userSession);
                A2E.getClass();
                Reel A0J = C1OU.A04(userSession).A0J(new C1N9(A2E), id, list, true);
                C102884kP c102884kP = fnk.A02;
                C6FQ c6fq = fnk.A01;
                View A05 = c102884kP.A05(c6fq.A03);
                int[] iArr = new int[2];
                if (A05 != null) {
                    A05.getLocationOnScreen(iArr);
                }
                C6WE.A00 = new GJ0(fnk);
                ReelRecentlyDeletedViewerController reelRecentlyDeletedViewerController = fnk.A05;
                float f = iArr[0];
                float f2 = iArr[1];
                RectF rectF = new RectF(f, f2, f, f2);
                FragmentActivity fragmentActivity = fnk.A00;
                InterfaceC11380iw A08 = C6BQ.A08(c6fq);
                A0J.A1b = true;
                C3M4 A06 = C1OU.A06(fragmentActivity, userSession);
                ArrayList A1E = AbstractC166987dD.A1E();
                A1E.add(A0J.getId());
                A06.A0U(null, rectF, A08, A0J, c3g2, new GF0(1, c3g2, reelRecentlyDeletedViewerController, fragmentActivity, A1E, userSession, A06, A0J, rectF), 0);
            }
            C0f9.A0A(-416627106, A032);
            i = -1181754395;
        } else {
            A03 = C0f9.A03(-1516927735);
            C74293Vk c74293Vk = (C74293Vk) obj;
            int A0N = AbstractC167017dG.A0N(c74293Vk, 1081460783);
            GXF gxf = (GXF) this.A01;
            List list2 = c74293Vk.A06;
            C14360o3.A07(list2);
            gxf.DgR((C3G2) this.A02, list2);
            C0f9.A0A(-1824598632, A0N);
            i = 1989560900;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = C0f9.A03(-1157795497);
            C0f9.A0A(-1526746364, C0f9.A03(521259693));
            i = 1904869412;
        } else {
            A03 = C0f9.A03(1706225203);
            C0f9.A0A(1211166798, C0f9.A03(591966559));
            i = 81937703;
        }
        C0f9.A0A(i, A03);
    }
}
