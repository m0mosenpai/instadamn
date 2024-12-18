package X;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.SystemClock;
import com.facebook.video.heroplayer.service.HeroKeepAliveService;

/* renamed from: X.2Ud, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50582Ud {
    public final void A00(Context context) {
        C50572Uc c50572Uc;
        ServiceConnection serviceConnection;
        C14360o3.A0B(context, 0);
        if (!C50572Uc.A07) {
            synchronized (HeroKeepAliveService.class) {
                if (!C50572Uc.A07) {
                    C50572Uc.A07 = true;
                    C50572Uc c50572Uc2 = C50572Uc.A05;
                    if (c50572Uc2 == null) {
                        Context applicationContext = context.getApplicationContext();
                        C14360o3.A07(applicationContext);
                        c50572Uc2 = new C50572Uc(applicationContext);
                        C50572Uc.A05 = c50572Uc2;
                    }
                    if (c50572Uc2.A04 == null && (c50572Uc = C50572Uc.A05) != null && (serviceConnection = c50572Uc.A03) != null) {
                        try {
                            c50572Uc.A04 = Boolean.valueOf(c50572Uc.A00.bindService(c50572Uc.A02, serviceConnection, 513));
                            c50572Uc.A01.set(SystemClock.elapsedRealtime());
                            AbstractC459729h.A01("HeroKeepAliveService.Client", "Finished mApplicationContext.bindService, bindResult %b", c50572Uc.A04);
                        } catch (SecurityException e) {
                            AbstractC459729h.A02("HeroKeepAliveService.Client", "SecurityException when bindService", e);
                        } catch (RuntimeException e2) {
                            if (e2.getCause() != null && (e2.getCause() instanceof DeadObjectException)) {
                                AbstractC459729h.A02("HeroKeepAliveService.Client", "DeadObjectException when binding service", new Object[0]);
                            } else {
                                throw e2;
                            }
                        }
                    }
                }
            }
        }
    }
}
