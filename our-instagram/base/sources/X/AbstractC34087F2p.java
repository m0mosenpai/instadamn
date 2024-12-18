package X;

import android.content.Context;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: X.F2p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34087F2p {
    public static final String A00(Context context, long j) {
        int i;
        Object[] objArr;
        C14360o3.A0B(context, 1);
        Date date = new Date();
        TimeZone timeZone = MX0.A03;
        switch (AbstractC53877Ns9.A00(date, j).intValue()) {
            case 2:
                i = 2131972870;
                objArr = new Object[]{MX0.A01(context, j)};
                break;
            case 3:
                i = 2131972871;
                objArr = new Object[]{MX0.A01(context, j)};
                break;
            default:
                i = 2131972868;
                objArr = new Object[]{MX0.A04("MMM d", j), MX0.A01(context, j)};
                break;
        }
        String string = context.getString(i, objArr);
        C14360o3.A07(string);
        return string;
    }
}
