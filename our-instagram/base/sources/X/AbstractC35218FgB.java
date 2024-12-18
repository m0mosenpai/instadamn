package X;

import android.content.Context;
import android.text.format.DateFormat;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.FgB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35218FgB {
    public static final SimpleDateFormat A02(Context context) {
        String str;
        C14360o3.A0B(context, 0);
        boolean is24HourFormat = DateFormat.is24HourFormat(context);
        Locale A02 = C1Q2.A02();
        if (is24HourFormat) {
            str = "H:mm";
        } else {
            str = "h:mma";
        }
        return new SimpleDateFormat(str, A02);
    }

    public static final long A00() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static final String A01(Context context, long j, boolean z) {
        Locale A02;
        String str;
        long A00 = C123815iv.A00() / 1000;
        if (z && (j / 60) % 60 > 0) {
            boolean is24HourFormat = DateFormat.is24HourFormat(context);
            A02 = C1Q2.A02();
            if (!is24HourFormat) {
                str = "h:mm a";
            }
            str = "H:mm";
        } else {
            boolean is24HourFormat2 = DateFormat.is24HourFormat(context);
            A02 = C1Q2.A02();
            if (!is24HourFormat2) {
                str = "h a";
            }
            str = "H:mm";
        }
        String format = new SimpleDateFormat(str, A02).format(new Date((A00 + j) * 1000));
        C14360o3.A07(format);
        return format;
    }

    public static final SimpleDateFormat A03(Context context, long j) {
        Locale A02;
        String str;
        if (DateFormat.is24HourFormat(context)) {
            A02 = C1Q2.A02();
            str = "H:mm LLL d";
        } else {
            long j2 = (j / 60) % 60;
            A02 = C1Q2.A02();
            if (j2 > 0) {
                str = "h:mm a LLL d";
            } else {
                str = "h a LLL d";
            }
        }
        return new SimpleDateFormat(str, A02);
    }

    public static final void A04(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        AbstractC167017dG.A1N(fragmentActivity, userSession);
        if (C18U.A06(C06090Tz.A05, userSession, 2342161673576257934L)) {
            C140966Yy A0P = AbstractC31173DnH.A0P(fragmentActivity, userSession);
            A0P.A0B(null, FBR.A00(EnumC72365Xc1.A0K, null));
            A0P.A04();
            return;
        }
        AbstractC31178DnM.A0j(fragmentActivity, AbstractC31178DnM.A06("entrypoint", str), userSession, ModalActivity.class, "quiet_mode_settings");
    }
}
