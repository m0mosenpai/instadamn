package X;

import android.graphics.RectF;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Eek, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32953Eek extends AbstractC154286wd {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C6FQ A01;
    public final /* synthetic */ InterfaceC103384lE A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public C32953Eek(FragmentActivity fragmentActivity, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, UserSession userSession, String str, String str2) {
        this.A02 = interfaceC103384lE;
        this.A03 = userSession;
        this.A01 = c6fq;
        this.A00 = fragmentActivity;
        this.A05 = str;
        this.A04 = str2;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        Object obj2;
        C3G2 c3g2;
        int i;
        int A03 = C0f9.A03(-238972183);
        C74293Vk c74293Vk = (C74293Vk) obj;
        int A032 = C0f9.A03(1866384607);
        C14360o3.A0B(c74293Vk, 0);
        List list = c74293Vk.A06;
        C14360o3.A07(list);
        int i2 = 0;
        if (list.isEmpty()) {
            InterfaceC103384lE interfaceC103384lE = this.A02;
            if (interfaceC103384lE != null) {
                C6FQ c6fq = this.A01;
                C6FX A0s = AbstractC25225BEi.A0s();
                A0s.A01(false);
                AbstractC25227BEk.A1M(c6fq, A0s, interfaceC103384lE);
            }
            i = 1054581116;
        } else {
            String str2 = this.A05;
            Iterator it = list.iterator();
            while (true) {
                str = null;
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (C14360o3.A0K(((C38321qM) obj2).getId(), str2)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            C38321qM c38321qM = (C38321qM) obj2;
            if (c38321qM == null) {
                c38321qM = (C38321qM) list.get(0);
            }
            UserSession userSession = this.A03;
            User A2E = c38321qM.A2E(userSession);
            if (A2E == null) {
                InterfaceC103384lE interfaceC103384lE2 = this.A02;
                if (interfaceC103384lE2 != null) {
                    C6FQ c6fq2 = this.A01;
                    C6FX A0s2 = AbstractC25225BEi.A0s();
                    A0s2.A01(false);
                    AbstractC25227BEk.A1M(c6fq2, A0s2, interfaceC103384lE2);
                }
                i = 1295884334;
            } else {
                ReelStore A04 = C1OU.A04(userSession);
                String id = c38321qM.getId();
                if (id == null) {
                    id = "";
                }
                Reel A0J = A04.A0J(new C1N9(A2E), id, list, AbstractC31171DnF.A1W(userSession, A2E.getId()));
                C6FQ c6fq3 = this.A01;
                C38E c38e = new C38E(C6BQ.A08(c6fq3), userSession, new C38C(C6BQ.A01(c6fq3)));
                RectF rectF = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
                C31559Dtj c31559Dtj = new C31559Dtj(this.A00, rectF, new GF2(0));
                C56553P8z c56553P8z = new C56553P8z(rectF, 2);
                C3G2[] values = C3G2.values();
                String str3 = this.A04;
                int length = values.length;
                while (true) {
                    if (i2 < length) {
                        c3g2 = values[i2];
                        if (C14360o3.A0K(c3g2.A00, str3)) {
                            break;
                        } else {
                            i2++;
                        }
                    } else {
                        c3g2 = C3G2.A0J;
                        break;
                    }
                }
                C6FG c6fg = c6fq3.A03;
                if (c6fg != null) {
                    str = (String) c6fg.A00(R.id.bloks_reel_tray_session_id);
                }
                c38e.A0C = str;
                c38e.A05 = c31559Dtj;
                c38e.A07(A0J, c3g2, c56553P8z, AbstractC166987dD.A1J(A0J), AbstractC166987dD.A1J(A0J), 0);
                InterfaceC103384lE interfaceC103384lE3 = this.A02;
                if (interfaceC103384lE3 != null) {
                    C6FX A0s3 = AbstractC25225BEi.A0s();
                    A0s3.A01(true);
                    AbstractC25227BEk.A1M(c6fq3, A0s3, interfaceC103384lE3);
                }
                i = 778943875;
            }
        }
        C0f9.A0A(i, A032);
        C0f9.A0A(353797424, A03);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1262693708);
        InterfaceC103384lE interfaceC103384lE = this.A02;
        if (interfaceC103384lE != null) {
            C6FQ c6fq = this.A01;
            C6FX A0s = AbstractC25225BEi.A0s();
            A0s.A01(false);
            AbstractC25227BEk.A1M(c6fq, A0s, interfaceC103384lE);
        }
        C0f9.A0A(-1675191344, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        C0f9.A0A(1069254502, C0f9.A03(1049529997));
    }

    @Override // X.C1P1
    public final void onStart() {
        C0f9.A0A(-53822262, C0f9.A03(-12885989));
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(951313239);
        C0f9.A0A(-460281080, C0f9.A03(88027728));
        C0f9.A0A(-325910661, A03);
    }
}
