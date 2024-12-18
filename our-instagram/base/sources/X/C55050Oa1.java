package X;

import android.content.Context;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: X.Oa1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55050Oa1 {
    public static final C55050Oa1 A00 = new Object();

    public final String A01(Context context, long j) {
        String string;
        DateFormat A01;
        int i;
        C14360o3.A0B(context, 0);
        int intValue = A00(j, System.currentTimeMillis()).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    A01 = MSZ.A0N(context).A03();
                    i = 2131955458;
                } else {
                    A01 = MSZ.A0N(context).A02();
                    i = 2131955460;
                }
            } else {
                A01 = MSZ.A0N(context).A01();
                i = 2131955461;
            }
            string = AbstractC167007dF.A0f(context, AbstractC43593JPy.A10(A01, j), i);
        } else {
            string = context.getString(2131955459);
        }
        C14360o3.A07(string);
        return string;
    }

    public static final Integer A00(long j, long j2) {
        if (j2 - j < StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS) {
            return C05F.A00;
        }
        Locale locale = Locale.ENGLISH;
        Calendar calendar = Calendar.getInstance(locale);
        calendar.setTimeInMillis(j2);
        Calendar calendar2 = Calendar.getInstance(locale);
        calendar2.setTimeInMillis(j);
        if (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
            return C05F.A01;
        }
        if (calendar.get(1) == calendar2.get(1)) {
            return C05F.A0C;
        }
        return C05F.A0N;
    }
}
