package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.privacy.consent.bloks.instagram.InstagramConsentOpenIABUrlActivity;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.Nr4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53814Nr4 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        O78 o78;
        String A0d = AbstractC31177DnL.A0d(c6fw);
        InterfaceC103384lE A0t = AbstractC25228BEl.A0t(c6fw.A00, 1);
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            Context context = c6fg.A00;
            if (A0t != null) {
                o78 = new O78(c6fq, A0t);
            } else {
                o78 = null;
            }
            Bundle A0b = AbstractC166987dD.A0b();
            AbstractC60492pY.A03(A0b, C6BQ.A0A(C6BQ.A09(c6fq)));
            String A0p = AbstractC25231BEo.A0p();
            Intent A08 = MSW.A08((Context) AbstractC13320mI.A00(context, Activity.class), InstagramConsentOpenIABUrlActivity.class);
            A08.putExtra("redirect_url", A0d);
            A08.putExtra("callback_key", A0p);
            A08.putExtras(A0b);
            if (o78 != null) {
                ReentrantLock reentrantLock = AbstractC54359O0r.A01;
                reentrantLock.lock();
                try {
                    AbstractC54359O0r.A00.put(A0p, o78);
                } finally {
                    reentrantLock.unlock();
                }
            }
            AbstractC07840b2.A02(context, A08);
            return null;
        }
        throw AbstractC166997dE.A0g();
    }
}
