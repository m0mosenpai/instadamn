package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.business.fragment.SupportLinksFragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.FgJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35226FgJ {
    public static final C35226FgJ A00 = new Object();

    public final void A03(FragmentActivity fragmentActivity, XIGIGBoostCallToAction xIGIGBoostCallToAction, UserSession userSession) {
        C14360o3.A0B(xIGIGBoostCallToAction, 1);
        A00(fragmentActivity);
        String A0b = AbstractC31177DnL.A0b(fragmentActivity, fragmentActivity.getString(AbstractC47060KrH.A00(xIGIGBoostCallToAction)), 2131965004);
        String A0p = AbstractC166997dE.A0p(fragmentActivity, AbstractC47060KrH.A00(xIGIGBoostCallToAction));
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A0b);
        AnonymousClass773.A03(A0H, new StyleSpan(1), A0p);
        C146106i8 A0X = AbstractC31173DnH.A0X(A0H);
        AbstractC31175DnJ.A0l(fragmentActivity, A0X, 2131965003);
        A0X.A0A(new C36516G8o(3, xIGIGBoostCallToAction, fragmentActivity, userSession));
        A0X.A0L = true;
        AbstractC25233BEq.A1F(A0X);
    }

    public static final void A00(FragmentActivity fragmentActivity) {
        C12260kU.A0C(fragmentActivity, AbstractC31176DnK.A06(fragmentActivity));
        InterfaceC53722dB A002 = AbstractC54852fj.A00();
        if (A002 != null) {
            A002.E4f();
            A002.EfI(C1QO.A0E);
        }
    }

    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession, EnumC53251Ngp enumC53251Ngp, User user) {
        long j;
        Long A0j;
        AbstractC167017dG.A1P(user, userSession);
        C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
        AbstractC31173DnH.A0u();
        String username = user.getUsername();
        ImageUrl Bhu = user.Bhu();
        int A03 = AbstractC31177DnL.A03(user.A03.B7S());
        String id = user.getId();
        String fbidV2 = user.A03.getFbidV2();
        if (fbidV2 != null && (A0j = AbstractC166997dE.A0j(fbidV2)) != null) {
            j = A0j.longValue();
        } else {
            j = 0;
        }
        String str = enumC53251Ngp.A01.A00;
        Bundle A0E = AbstractC31174DnI.A0E(str, 5);
        N5I n5i = new N5I();
        A0E.putString(MSV.A00(941), username);
        A0E.putParcelable(MSV.A00(940), Bhu);
        A0E.putInt(MSV.A00(938), A03);
        A0E.putString(MSV.A00(939), id);
        A0E.putLong(MSV.A00(937), j);
        A0E.putString("args_entry_point", str);
        n5i.setArguments(A0E);
        String A002 = MSV.A00(1377);
        A0r.A0C = A002;
        A0r.A0A = A002;
        A0r.A0D(n5i);
        A0r.A04();
    }

    public static final boolean A02(FragmentActivity fragmentActivity) {
        AbstractC10360h2 A002 = AbstractC62582sx.A00(fragmentActivity);
        Iterable A0C = C17s.A0C(0, A002.A0L());
        if (!(A0C instanceof Collection) || !((Collection) A0C).isEmpty()) {
            Iterator it = A0C.iterator();
            while (it.hasNext()) {
                if (AbstractC002300n.A0g(((AbstractC016706m) A002.A0S(((AbstractC16880sg) it).A00())).A09, SupportLinksFragment.A06, false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
