package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public abstract class SV1 {
    public static final C003701c A00 = new C003701c(16);
    public static final C005001p A01;
    public static final Object A02;
    public static final ExecutorService A03;

    /* JADX WARN: Type inference failed for: r7v0, types: [X.TV0, java.lang.Object, java.util.concurrent.ThreadFactory] */
    static {
        ?? obj = new Object();
        obj.A01 = "fonts-androidx";
        obj.A00 = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), (ThreadFactory) obj);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        A03 = threadPoolExecutor;
        A02 = AbstractC58318PtA.A0b();
        A01 = new C005001p(0);
    }

    public static C62891SVw A00(Context context, C53532cb c53532cb, String str, int i) {
        int length;
        C003701c c003701c = A00;
        Typeface typeface = (Typeface) c003701c.A02(str);
        if (typeface == null) {
            try {
                C05170Pm A002 = AbstractC53592ch.A00(context, c53532cb);
                int i2 = -3;
                if (A002.A00 == 0) {
                    C54162eO[] c54162eOArr = A002.A01;
                    if (c54162eOArr != null && (length = c54162eOArr.length) != 0) {
                        int i3 = 0;
                        while (true) {
                            int i4 = c54162eOArr[i3].A00;
                            if (i4 == 0) {
                                i3++;
                                if (i3 >= length) {
                                    typeface = AbstractC05160Pl.A01.A03(context, null, c54162eOArr, i);
                                    if (typeface != null) {
                                        c003701c.A05(str, typeface);
                                    }
                                }
                            } else if (i4 >= 0) {
                                i2 = i4;
                            }
                        }
                    } else {
                        i2 = 1;
                    }
                } else {
                    i2 = -2;
                }
                return new C62891SVw(i2);
            } catch (PackageManager.NameNotFoundException unused) {
                return new C62891SVw(-1);
            }
        }
        return new C62891SVw(typeface);
    }
}
