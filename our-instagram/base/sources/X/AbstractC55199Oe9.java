package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Oe9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55199Oe9 {
    public static final SpannableStringBuilder A00(Context context, List list) {
        ArrayList A12 = AbstractC166997dE.A12(list, 1);
        for (Object obj : list) {
            if (!((BrandedContentTag) obj).A03) {
                A12.add(obj);
            }
        }
        int size = A12.size();
        if (size != 1) {
            if (size != 2) {
                return AbstractC31175DnJ.A05(context, 2131969312);
            }
            SpannableStringBuilder A0H = AbstractC25225BEi.A0H(AbstractC31174DnI.A0t(context, ((BrandedContentTag) A12.get(0)).A02, ((BrandedContentTag) A12.get(1)).A02, 2131969311));
            AbstractC31174DnI.A1B(A0H, ((BrandedContentTag) A12.get(0)).A02);
            AbstractC31174DnI.A1B(A0H, ((BrandedContentTag) A12.get(1)).A02);
            return A0H;
        }
        SpannableStringBuilder A07 = AbstractC31178DnM.A07(context, ((BrandedContentTag) A12.get(0)).A02, 2131974338);
        AbstractC31174DnI.A1B(A07, ((BrandedContentTag) A12.get(0)).A02);
        return A07;
    }

    public static final SpannableStringBuilder A01(Context context, List list, boolean z) {
        C14360o3.A0B(list, 2);
        if (!z) {
            return new SpannableStringBuilder();
        }
        int size = list.size();
        if (size != 1) {
            if (size != 2) {
                return AbstractC31175DnJ.A05(context, 2131969312);
            }
            SpannableStringBuilder A0H = AbstractC25225BEi.A0H(AbstractC31174DnI.A0t(context, AbstractC31176DnK.A0t(list, 0), AbstractC31176DnK.A0t(list, 1), 2131969311));
            AbstractC31174DnI.A1B(A0H, AbstractC31176DnK.A0t(list, 0));
            AbstractC31174DnI.A1B(A0H, AbstractC31176DnK.A0t(list, 1));
            return A0H;
        }
        SpannableStringBuilder A0H2 = AbstractC25225BEi.A0H(AbstractC31178DnM.A0c(context, (User) list.get(0), 2131974338));
        AbstractC31174DnI.A1B(A0H2, AbstractC31176DnK.A0t(list, 0));
        return A0H2;
    }

    public static final SpannableStringBuilder A02(FragmentActivity fragmentActivity, UserSession userSession, String str, int i) {
        AbstractC167017dG.A1P(userSession, str);
        String A0p = AbstractC166997dE.A0p(fragmentActivity, 2131954194);
        SpannableStringBuilder A07 = AbstractC31178DnM.A07(fragmentActivity, A0p, i);
        AnonymousClass773.A05(A07, new C52790NXz(fragmentActivity, userSession, str, AbstractC31174DnI.A02(fragmentActivity), 0), A0p);
        return A07;
    }

    public static final String A03(Context context, BrandedContentGatingInfo brandedContentGatingInfo) {
        String A0a;
        List list = brandedContentGatingInfo.A04;
        if (list == null) {
            list = C16930sl.A00;
        }
        int size = list.size();
        if (size == 1) {
            A0a = new Locale(Locale.getDefault().getDisplayLanguage(), AbstractC25226BEj.A1I(list, 0)).getDisplayCountry();
        } else {
            A0a = AbstractC31177DnL.A0a(context, size, 2131954188);
        }
        C14360o3.A0A(A0a);
        return A0a;
    }

    public static final void A05(Activity activity, UserSession userSession, C38321qM c38321qM, Class cls, String str) {
        AbstractC167017dG.A1R(c38321qM, str);
        C193328hC A0H = AbstractC31171DnF.A0H(activity);
        A0H.A0A(2131972305);
        A0H.A09(2131972302);
        A0H.A0F(new DialogInterfaceOnClickListenerC35362Fid(activity, cls, c38321qM, userSession, str, 1));
        AbstractC31176DnK.A14(OgG.A00, A0H);
    }

    public static final boolean A06(Context context, Fragment fragment, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        if (!AbstractC166997dE.A0Y(userSession).A2H()) {
            C193328hC A0I = AbstractC31171DnF.A0I(context);
            A0I.A0A(2131952910);
            A0I.A09(2131952908);
            A0I.A0K(new DialogInterfaceOnClickListenerC35450Fk7(3, context, userSession, fragment), 2131952909);
            AbstractC31176DnK.A16(null, A0I, 2131968687);
            return true;
        }
        return false;
    }

    public static final void A04(Activity activity, DialogInterface.OnClickListener onClickListener, UserSession userSession, String str, String str2) {
        AbstractC167027dH.A13(userSession, str, str2);
        C193328hC A0H = AbstractC31171DnF.A0H(activity);
        A0H.A05 = str;
        A0H.A0r(str2);
        DialogInterfaceOnClickListenerC35455FkC.A01(A0H, activity, userSession, 7, 2131965052);
        AbstractC31176DnK.A14(onClickListener, A0H);
    }
}
