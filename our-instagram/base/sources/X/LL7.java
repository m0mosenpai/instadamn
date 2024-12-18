package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public final class LL7 {
    public static Dialog A00;
    public static final LL7 A01 = new Object();
    public static final C11L A02 = new C11L("\\X");

    public static final void A00(Context context, C07T c07t, UserSession userSession, Integer num, String str) {
        C135976Dc A012;
        String str2;
        String str3;
        Integer num2;
        C14360o3.A0B(str, 0);
        AbstractC167017dG.A1R(c07t, userSession);
        Dialog dialog = A00;
        if (dialog != null && dialog.isShowing()) {
            return;
        }
        LL7 ll7 = A01;
        String[] stringArray = context.getResources().getStringArray(R.array.notes_new_year_phrases);
        C14360o3.A07(stringArray);
        List asList = Arrays.asList(stringArray);
        C14360o3.A07(asList);
        if (A03(str, asList)) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36322645796465026L)) {
                A01(context, c07t, C05F.A00);
                if (!C18U.A06(c06090Tz, userSession, 36322645796530563L)) {
                    return;
                }
                A012 = AbstractC135966Db.A01(userSession);
                if (num.intValue() != 0) {
                    str2 = "consumption";
                } else {
                    str2 = "creation";
                }
                str3 = "nye";
                A012.A0T(str2, str3);
            }
        }
        String[] stringArray2 = context.getResources().getStringArray(R.array.notes_valentines_day_phrases);
        C14360o3.A07(stringArray2);
        List asList2 = Arrays.asList(stringArray2);
        C14360o3.A07(asList2);
        if (A03(str, asList2) && C18U.A06(C06090Tz.A05, userSession, 36322645796596100L)) {
            int intValue = num.intValue();
            if (intValue != 0) {
                num2 = C05F.A01;
            } else {
                num2 = C05F.A0C;
            }
            A01(context, c07t, num2);
            A012 = AbstractC135966Db.A01(userSession);
            if (intValue != 0) {
                str2 = "consumption";
            } else {
                str2 = "creation";
            }
            str3 = "vday";
        } else {
            if (!ll7.A04(context, str) || !C18U.A06(C06090Tz.A05, userSession, 36324264999202867L)) {
                return;
            }
            A01(context, c07t, C05F.A0N);
            A012 = AbstractC135966Db.A01(userSession);
            if (num.intValue() != 0) {
                str2 = "consumption";
            } else {
                str2 = "creation";
            }
            str3 = "birthday";
        }
        A012.A0T(str2, str3);
    }

    public final boolean A04(Context context, String str) {
        C14360o3.A0B(str, 0);
        String[] stringArray = context.getResources().getStringArray(R.array.notes_birthday_trigger_words);
        C14360o3.A07(stringArray);
        List asList = Arrays.asList(stringArray);
        C14360o3.A07(asList);
        if (A02(str, asList)) {
            String[] stringArray2 = context.getResources().getStringArray(R.array.notes_birthday_blocked_words);
            C14360o3.A07(stringArray2);
            List asList2 = Arrays.asList(stringArray2);
            C14360o3.A07(asList2);
            if (!A02(str, asList2)) {
                return true;
            }
        }
        return false;
    }

    public static final void A01(Context context, C07T c07t, Integer num) {
        C148086le c148086le = new C148086le(context);
        Dialog dialog = new Dialog(context, android.R.style.Theme.Translucent.NoTitleBar.Fullscreen);
        dialog.setContentView(R.layout.layout_animation_image_view);
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.addFlags(131096);
            window.clearFlags(2);
        }
        C50623MWk c50623MWk = new C50623MWk(dialog, 4);
        c07t.A09(c50623MWk);
        c148086le.A02((ImageView) dialog.findViewById(R.id.animation_image_view), num);
        c148086le.A01(new LLs(dialog, 6));
        dialog.setOnDismissListener(new DialogInterfaceOnDismissListenerC55322Ogk(1, c50623MWk, c07t));
        A00 = dialog;
        C0fJ.A00(dialog);
    }

    public static final boolean A02(String str, List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            AbstractC25228BEl.A1Q(obj, A1E, A02.A08((String) obj) ? 1 : 0);
        }
        ArrayList A1E2 = AbstractC166987dD.A1E();
        for (Object obj2 : list) {
            if (A02.A08((String) obj2)) {
                A1E2.add(obj2);
            }
        }
        String str2 = "";
        String A0P = AbstractC001800i.A0P("|", "", "", A1E, null);
        if (AbstractC166987dD.A1b(A1E2)) {
            str2 = AbstractC25235BEs.A0r("|(", AbstractC001800i.A0P("|", "", "", A1E2, null));
        }
        return new C11L(AnonymousClass001.A0u("\\b(", A0P, ")\\b", str2), EnumC46315Kel.A05).A07(str);
    }

    public static final boolean A03(String str, List list) {
        String A0h = AbstractC167007dF.A0h(str);
        StringBuilder A1C = AbstractC166987dD.A1C();
        int length = A0h.length();
        for (int i = 0; i < length; i++) {
            char charAt = A0h.charAt(i);
            if (Character.isLetterOrDigit(charAt) || C11K.A01(charAt)) {
                A1C.append(charAt);
            }
        }
        String A1A = AbstractC25228BEl.A1A(AbstractC166987dD.A19(A1C));
        if (!list.contains(str) && !list.contains(A1A)) {
            return false;
        }
        return true;
    }
}
