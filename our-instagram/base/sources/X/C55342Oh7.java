package X;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.facebook.oxygen.preloads.sdk.firstparty.managedappcache.IsManagedAppCacheJobService;

/* renamed from: X.Oh7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55342Oh7 implements Handler.Callback {
    public final int A00;
    public final Object A01;

    public C55342Oh7(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.A00) {
            case 0:
                int i = message.what;
                if (i == 1) {
                    IsManagedAppCacheJobService isManagedAppCacheJobService = (IsManagedAppCacheJobService) this.A01;
                    JobParameters jobParameters = (JobParameters) message.obj;
                    while (!isManagedAppCacheJobService.A01) {
                        try {
                            JobWorkItem dequeueWork = jobParameters.dequeueWork();
                            if (dequeueWork != null) {
                                AbstractC61799Rtt.A00(dequeueWork.getIntent(), isManagedAppCacheJobService);
                                if (!isManagedAppCacheJobService.A01) {
                                    jobParameters.completeWork(dequeueWork);
                                }
                            } else {
                                return true;
                            }
                        } catch (SecurityException unused) {
                            return true;
                        }
                    }
                    return true;
                }
                throw AbstractC25230BEn.A0n("Unknown msg: ", i);
            case 1:
                C14360o3.A0B(message, 0);
                int i2 = message.what;
                if (i2 != 1) {
                    if (i2 == 2) {
                        C55038OZk c55038OZk = (C55038OZk) this.A01;
                        c55038OZk.A07.A00("onScoTimedOut", new Object[0]);
                        c55038OZk.A06.Cnc("sco timeout", AnonymousClass001.A0O("attempts=", c55038OZk.A00));
                        c55038OZk.A03.removeCallbacksAndMessages(null);
                        C55038OZk.A01(c55038OZk, false);
                        return false;
                    }
                    return false;
                }
                C55038OZk c55038OZk2 = (C55038OZk) this.A01;
                c55038OZk2.A05.A04(true);
                int i3 = c55038OZk2.A00 + 1;
                c55038OZk2.A00 = i3;
                c55038OZk2.A07.A00(AnonymousClass001.A0O("startScoAudio attempt #", i3), new Object[0]);
                Handler handler = c55038OZk2.A03;
                handler.removeMessages(2);
                handler.sendEmptyMessageDelayed(2, 4000L);
                return false;
            case 2:
                if (message.what == 1) {
                    Object obj = message.obj;
                    obj.getClass();
                    Object[] objArr = (Object[]) obj;
                    C54386O1s c54386O1s = (C54386O1s) objArr[0];
                    long A0N = AbstractC166987dD.A0N(objArr[2]);
                    InterfaceC58028PoE interfaceC58028PoE = c54386O1s.A00.A06;
                    if (interfaceC58028PoE != null) {
                        interfaceC58028PoE.DZ5(A0N);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                C14360o3.A0B(message, 0);
                int i4 = message.what;
                if (i4 == 5) {
                    AbstractC167007dF.A0x(((NLG) this.A01).A03);
                    return true;
                }
                if (i4 == 6) {
                    View view = ((NLG) this.A01).A03;
                    if (view == null) {
                        return true;
                    }
                    view.setVisibility(0);
                    return true;
                }
                return false;
        }
    }
}
