package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;

/* loaded from: classes12.dex */
public final class YI6 implements Runnable {
    public final /* synthetic */ Y6y A00;
    public final /* synthetic */ GRF A01;
    public final /* synthetic */ C72719Xlr[] A02;

    public YI6(Y6y y6y, GRF grf, C72719Xlr[] c72719XlrArr) {
        this.A00 = y6y;
        this.A02 = c72719XlrArr;
        this.A01 = grf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Y6y y6y = this.A00;
        Y6y.A05(y6y);
        C72719Xlr[] c72719XlrArr = this.A02;
        Object[] objArr = new Object[210];
        int i = 0;
        do {
            int i2 = c72719XlrArr[i].A00;
            Object obj = y6y.A04.get();
            obj.getClass();
            PackageManager packageManager = y6y.A01;
            SharedPreferences sharedPreferences = y6y.A00;
            sharedPreferences.getClass();
            objArr[i] = Y6y.A04((Context) obj, sharedPreferences, packageManager, i2);
            i++;
        } while (i < 210);
        GRF grf = this.A01;
        grf.A00 = objArr;
        y6y.A02.post(grf);
    }
}
