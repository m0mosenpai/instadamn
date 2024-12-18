package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Handler;
import com.facebook.R;

/* renamed from: X.561, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class AnonymousClass561 {
    public static Typeface A00;

    public static C53532cb A00(Context context) {
        C05170Pm A002;
        Runnable runnableC24303Aq8;
        C53532cb c53532cb = new C53532cb("Noto Color Emoji Compat", R.array.com_google_android_gms_fonts_certs);
        final AbstractC2051896j abstractC2051896j = new AbstractC2051896j() { // from class: X.96i
        };
        Handler handler = new Handler(C1CG.A00());
        try {
            A002 = AbstractC53592ch.A00(context, c53532cb);
        } catch (PackageManager.NameNotFoundException unused) {
            handler.post(new RunnableC24300Aq5(abstractC2051896j));
        }
        if (A002.A00 != 0) {
            handler.post(new RunnableC24301Aq6(abstractC2051896j));
            return c53532cb;
        }
        C54162eO[] c54162eOArr = A002.A01;
        if (c54162eOArr != null) {
            int length = c54162eOArr.length;
            if (length == 0) {
                runnableC24303Aq8 = new RunnableC24302Aq7(abstractC2051896j);
            } else {
                int i = 0;
                do {
                    int i2 = c54162eOArr[i].A00;
                    if (i2 != 0) {
                        if (i2 < 0) {
                            runnableC24303Aq8 = new RunnableC24303Aq8(abstractC2051896j);
                        } else {
                            handler.post(new RunnableC24588Auj(abstractC2051896j, i2));
                            return c53532cb;
                        }
                    } else {
                        i++;
                    }
                } while (i < length);
                final Typeface A03 = AbstractC05160Pl.A01.A03(context, null, c54162eOArr, 0);
                if (A03 == null) {
                    handler.post(new RunnableC24304Aq9(abstractC2051896j));
                    return c53532cb;
                }
                handler.post(new Runnable() { // from class: X.96n
                    @Override // java.lang.Runnable
                    public final void run() {
                        abstractC2051896j.A01(A03);
                    }
                });
                return c53532cb;
            }
            handler.post(runnableC24303Aq8);
            return c53532cb;
        }
        return c53532cb;
    }
}
