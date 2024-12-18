package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;

/* loaded from: classes10.dex */
public final class SWI {
    public static SWI A02;
    public static final SimpleDateFormat A03 = new SimpleDateFormat("dd/MM/yyyy z");
    public final SharedPreferences A00;
    public final SharedPreferences A01;

    public SWI(Context context) {
        this.A01 = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
        this.A00 = context.getSharedPreferences("FirebaseAppHeartBeatStorage", 0);
    }
}
