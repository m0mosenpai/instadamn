package X;

import android.content.Context;

/* renamed from: X.S2x, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62226S2x {
    public static InterfaceC57913PmJ A00(Context context) {
        SIV siv;
        synchronized (AbstractC61540RpK.class) {
            siv = AbstractC61540RpK.A00;
            if (siv == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                siv = new SIV(context);
                AbstractC61540RpK.A00 = siv;
            }
        }
        return (InterfaceC57913PmJ) siv.A00.A70();
    }
}
