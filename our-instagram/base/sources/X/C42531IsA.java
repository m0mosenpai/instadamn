package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.IsA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42531IsA implements JH8 {
    public final /* synthetic */ C42499Ire A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ C75113Zb A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    @Override // X.JH8
    public final void onFail(AbstractC115105If abstractC115105If) {
        String str;
        C14360o3.A0B(abstractC115105If, 0);
        UserSession userSession = this.A00.A01;
        IEY iey = (IEY) userSession.A01(IEY.class, new DGY(userSession, 45));
        String str2 = this.A03;
        C40781ul c40781ul = (C40781ul) abstractC115105If.A00();
        if (c40781ul != null) {
            str = c40781ul.getClientFacingErrorMessage();
        } else {
            str = null;
        }
        ConcurrentHashMap concurrentHashMap = iey.A01;
        Number number = (Number) concurrentHashMap.get(str2);
        if (number != null) {
            long longValue = number.longValue();
            if (str != null && str.length() != 0) {
                iey.A00.flowAnnotate(longValue, "error_message", str);
            }
            iey.A00.flowEndFail(longValue, "like_media_fail", null);
            concurrentHashMap.remove(str2);
        }
    }

    public C42531IsA(C42499Ire c42499Ire, C38321qM c38321qM, C75113Zb c75113Zb, String str, boolean z) {
        this.A04 = z;
        this.A00 = c42499Ire;
        this.A01 = c38321qM;
        this.A02 = c75113Zb;
        this.A03 = str;
    }

    @Override // X.JH8
    public final void Dpz(HAO hao) {
        User A14;
        Context context;
        if (!this.A04) {
            C42499Ire c42499Ire = this.A00;
            EnumC114765Gh enumC114765Gh = c42499Ire.A05;
            if (enumC114765Gh != null) {
                Integer num = C05F.A00;
                UserSession userSession = c42499Ire.A01;
                InterfaceC60442pS interfaceC60442pS = c42499Ire.A02;
                String A2u = this.A01.A2u();
                if (A2u != null) {
                    IT8.A00(interfaceC60442pS, userSession, enumC114765Gh, num, A2u);
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                C38321qM c38321qM = this.A01;
                int ordinal = c38321qM.BRp().ordinal();
                if (ordinal == 0 || ordinal == 1 || ordinal == 4) {
                    Fragment fragment = c42499Ire.A00;
                    if (fragment.isAdded() && !fragment.mRemoving && (context = fragment.getContext()) != null) {
                        InterfaceC37071o5 A00 = C37091o7.A00();
                        UserSession userSession2 = c42499Ire.A01;
                        InterfaceC60442pS interfaceC60442pS2 = c42499Ire.A02;
                        EnumC39589Hdz enumC39589Hdz = EnumC39589Hdz.A0W;
                        String id = c38321qM.getId();
                        if (id != null) {
                            A00.Cot(context, interfaceC60442pS2, userSession2, c38321qM.A2E(userSession2), enumC39589Hdz, id);
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                }
            }
        }
        C42499Ire c42499Ire2 = this.A00;
        C1Y1 c1y1 = c42499Ire2.A04;
        if (c1y1 != null && this.A02.A0o == AnonymousClass341.A0H) {
            c1y1.FA3(C3XH.A01(this.A01));
        }
        C38321qM c38321qM2 = this.A01;
        FragmentActivity activity = c42499Ire2.A00.getActivity();
        if (activity != null && (A14 = AbstractC25226BEj.A14(c38321qM2)) != null) {
            String id2 = A14.getId();
            UserSession userSession3 = c42499Ire2.A01;
            if (!id2.equals(userSession3.userId) && C1VN.A00 != null) {
                C1VN A002 = AbstractC31282Dp4.A00();
                String A38 = c38321qM2.A38();
                if (A38 != null) {
                    A002.A00(activity, userSession3, "355366653495629", AbstractC167017dG.A0r("nua_target_id", A38));
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        }
        UserSession userSession4 = c42499Ire2.A01;
        IEY iey = (IEY) userSession4.A01(IEY.class, new DGY(userSession4, 45));
        String str = this.A03;
        ConcurrentHashMap concurrentHashMap = iey.A01;
        Number number = (Number) concurrentHashMap.get(str);
        if (number != null) {
            iey.A00.flowEndSuccess(number.longValue());
            concurrentHashMap.remove(str);
        }
    }
}
