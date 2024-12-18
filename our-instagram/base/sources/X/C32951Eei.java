package X;

import android.accounts.NetworkErrorException;
import android.app.Activity;
import android.graphics.RectF;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Eei, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32951Eei extends AbstractC154286wd {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C32951Eei(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(890906732);
                i = 506553626;
                break;
            case 1:
                A03 = C0f9.A03(-590643066);
                W6j.A02((XDK) this.A01, new NetworkErrorException());
                i = -1198480778;
                break;
            case 2:
                A03 = AbstractC167017dG.A0N(abstractC115105If, 2101097971);
                abstractC115105If.toString();
                i = -175621477;
                break;
            default:
                super.onFail(abstractC115105If);
                return;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1942982652);
                i = 178804860;
                break;
            case 1:
                A03 = C0f9.A03(1203062558);
                i = -714846577;
                break;
            case 2:
                A03 = C0f9.A03(-683639768);
                i = 1339753604;
                break;
            default:
                super.onFinish();
                return;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-1037764176);
                i = -893452074;
                break;
            case 1:
                A03 = C0f9.A03(435443892);
                i = 954847116;
                break;
            case 2:
                A03 = C0f9.A03(-1819057065);
                i = -747762654;
                break;
            default:
                super.onStart();
                return;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-2067262748);
                C74293Vk c74293Vk = (C74293Vk) obj;
                int A0N = AbstractC167017dG.A0N(c74293Vk, -900532627);
                List list = c74293Vk.A06;
                C14360o3.A07(list);
                Object A0J = AbstractC001800i.A0J(list);
                if (A0J != null) {
                    UserSession userSession = (UserSession) this.A02;
                    AbstractC36001Fuz.A01((Activity) this.A01, userSession, C1OU.A04(userSession).A0J(new C1N9(AbstractC166987dD.A10(userSession)), AbstractC166997dE.A0n(), AbstractC166987dD.A1J(A0J), true));
                }
                C0f9.A0A(1926783199, A0N);
                i = 1210231054;
                break;
            case 1:
                A03 = C0f9.A03(847832484);
                C74293Vk c74293Vk2 = (C74293Vk) obj;
                int A032 = C0f9.A03(1025491179);
                C14360o3.A0B(c74293Vk2, 0);
                C38321qM A0x = AbstractC25225BEi.A0x(c74293Vk2.A06, 0);
                C1DX A00 = C1DW.A00(((W56) this.A02).A03);
                C14360o3.A0A(A0x);
                A00.A03(A0x);
                XDK xdk = (XDK) this.A01;
                W6j.A01(xdk, A0x);
                W6j.A00(xdk);
                C0f9.A0A(65614127, A032);
                i = -120333099;
                break;
            case 2:
                A03 = C0f9.A03(1405312758);
                C74293Vk c74293Vk3 = (C74293Vk) obj;
                int A033 = C0f9.A03(-1991315770);
                C14360o3.A0B(c74293Vk3, 0);
                C34576FLl c34576FLl = (C34576FLl) this.A01;
                List list2 = c74293Vk3.A06;
                C14360o3.A07(list2);
                C3G2 c3g2 = (C3G2) this.A02;
                if (!list2.isEmpty()) {
                    String id = AbstractC25225BEi.A0x(list2, 0).getId();
                    C38321qM A0x2 = AbstractC25225BEi.A0x(list2, 0);
                    UserSession userSession2 = c34576FLl.A02;
                    User A2E = A0x2.A2E(userSession2);
                    if (A2E != null) {
                        Reel A0J2 = C1OU.A04(userSession2).A0J(new C1N9(A2E), id, list2, false);
                        C99694dm A002 = AbstractC99684dl.A00(userSession2);
                        long A08 = AbstractC31174DnI.A08(A2E);
                        List list3 = c34576FLl.A03;
                        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A002.A00, "fan_onboarding_view_exclusive_media");
                        AbstractC31178DnM.A1C(A0f, AbstractC111324zv.A00(211), A08);
                        A0f.AAk("media_ids", list3);
                        A0f.Cht();
                        RectF rectF = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
                        FragmentActivity fragmentActivity = c34576FLl.A00;
                        InterfaceC11380iw A082 = C6BQ.A08(c34576FLl.A01);
                        C14360o3.A0B(fragmentActivity, 3);
                        AbstractC167017dG.A1T(c3g2, A082);
                        C3M4 A06 = C1OU.A06(fragmentActivity, userSession2);
                        ArrayList A1E = AbstractC166987dD.A1E();
                        A1E.add(A0J2.getId());
                        A06.A0U(null, rectF, A082, A0J2, c3g2, new C36679GEz(rectF, fragmentActivity, userSession2, A0J2, c3g2, A06, A1E), 0);
                    }
                }
                C0f9.A0A(125023450, A033);
                i = -914341873;
                break;
            default:
                super.onSuccess(obj);
                return;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-2002833829);
                C0f9.A0A(381426338, C0f9.A03(-701447747));
                i = -773144313;
                break;
            case 1:
                A03 = C0f9.A03(1681745128);
                C0f9.A0A(-295410300, C0f9.A03(-1340274899));
                i = 1518819058;
                break;
            case 2:
                A03 = C0f9.A03(-938314290);
                C0f9.A0A(296363913, C0f9.A03(544236992));
                i = -568814097;
                break;
            default:
                super.onSuccessInBackground(obj);
                return;
        }
        C0f9.A0A(i, A03);
    }
}
