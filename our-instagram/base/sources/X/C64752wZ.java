package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;

/* renamed from: X.2wZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64752wZ {
    public final void A00(Activity activity, UserSession userSession, C4NL c4nl, QuickPromotionSlot quickPromotionSlot, InterfaceC16820sZ interfaceC16820sZ) {
        C4NJ c4nj;
        String str;
        C14360o3.A0B(c4nl, 0);
        C14360o3.A0B(quickPromotionSlot, 1);
        C14360o3.A0B(userSession, 3);
        C14360o3.A0B(activity, 4);
        if ((c4nl instanceof C4NJ) && (c4nj = (C4NJ) c4nl) != null) {
            try {
                StringWriter stringWriter = new StringWriter();
                C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                C4NI.A00(A0A, c4nj);
                A0A.close();
                str = stringWriter.toString();
            } catch (IOException e) {
                String format = String.format("Error parsing QuickPromotion for bottomsheet: %s", Arrays.copyOf(new Object[]{c4nj.A0D}, 1));
                C14360o3.A07(format);
                C0K8.A0F("QPBottomsheetController", format, e);
                str = null;
            }
            V1C v1c = new V1C();
            Bundle bundle = new Bundle();
            bundle.putString(AbstractC111324zv.A00(2930), quickPromotionSlot.name());
            bundle.putString("quick_promotion", str);
            v1c.setArguments(bundle);
            C36722GGr c36722GGr = new C36722GGr(interfaceC16820sZ);
            if (activity instanceof FragmentActivity) {
                AbstractC10360h2 supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
                C14360o3.A07(supportFragmentManager);
                if (supportFragmentManager.A0Q("BottomSheetConstants.FRAGMENT_TAG") != null) {
                    C3DO c3do = C3DN.A00;
                    C3DN A00 = c3do.A00(activity);
                    if (A00 != null) {
                        ((C3DP) A00).A0H = new GHD(activity, userSession, c36722GGr, this, v1c);
                    }
                    C3DN A002 = c3do.A00(activity);
                    if (A002 != null) {
                        A002.A0B();
                        return;
                    }
                    return;
                }
            }
            C189448aO c189448aO = new C189448aO(userSession);
            c189448aO.A0U = c36722GGr;
            c189448aO.A00().A02(activity, v1c);
        }
    }
}
