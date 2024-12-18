package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Date;

/* renamed from: X.A6l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22865A6l {
    public final Context A00;
    public final C9ZY A01;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.9ZY] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, X.9ZY] */
    public C22865A6l(Context context) {
        C9ZY c9zy;
        Date date;
        this.A00 = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName(), 0);
        C14360o3.A07(sharedPreferences);
        if (sharedPreferences.contains("APPIRATER_FIRST_USE_DATE")) {
            int i = sharedPreferences.getInt("APPIRATER_USE_COUNT", 0);
            boolean z = sharedPreferences.getBoolean("APPIRATER_RATED_CURRENT_VERSION", false);
            boolean z2 = sharedPreferences.getBoolean("APPIRATER_DECLINED_TO_RATE", false);
            long j = sharedPreferences.getLong("APPIRATER_FIRST_USE_DATE", -1L);
            if (-1 != j) {
                date = new Date(j);
            } else {
                date = null;
            }
            long j2 = sharedPreferences.getLong("APPIRATER_REMINDER_REQUEST_DATE", -1L);
            Date date2 = -1 != j2 ? new Date(j2) : null;
            int i2 = sharedPreferences.getInt("APPIRATER_SIG_EVENT_COUNT", 0);
            int i3 = sharedPreferences.getInt("APPIRATER_CURRENT_VERSION", 0);
            ?? obj = new Object();
            obj.A02 = i;
            obj.A06 = z;
            obj.A05 = z2;
            obj.A03 = date;
            obj.A04 = date2;
            obj.A01 = i2;
            obj.A00 = i3;
            c9zy = obj;
        } else {
            ?? obj2 = new Object();
            obj2.A02 = 0;
            obj2.A06 = false;
            obj2.A05 = false;
            obj2.A03 = null;
            obj2.A04 = null;
            obj2.A01 = 0;
            obj2.A00 = 0;
            c9zy = obj2;
        }
        this.A01 = c9zy;
    }
}
