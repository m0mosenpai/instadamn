package X;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* renamed from: X.8l2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8l2 {
    public long A00;
    public String A01;
    public final String A02;
    public final String A03;
    public final Calendar A04;

    public final String A00(Date date) {
        SimpleDateFormat simpleDateFormat = AbstractC195798lM.A00;
        long j = this.A00;
        long time = date.getTime();
        if (time < j || time > j + 86400000) {
            Calendar calendar = this.A04;
            calendar.setTimeInMillis(date.getTime());
            Date time2 = calendar.getTime();
            C14360o3.A07(time2);
            AbstractC195798lM.A01(calendar, time2);
            this.A00 = calendar.getTimeInMillis();
            this.A01 = AbstractC195798lM.A00(this.A02, this.A03, calendar, date);
        }
        return this.A01;
    }

    public C8l2(Context context) {
        String string = context.getString(2131975643);
        C14360o3.A07(string);
        this.A02 = string;
        String string2 = context.getString(2131977167);
        C14360o3.A07(string2);
        this.A03 = string2;
        this.A04 = AbstractC195628l3.A00();
        this.A01 = "";
    }
}
