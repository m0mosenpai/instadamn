package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.PowerManager;
import android.os.RemoteException;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3xQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88643xQ {
    public static C88643xQ A02;
    public static final long A03 = TimeUnit.SECONDS.toMillis(60);
    public final Context A00;
    public final C88653xR A01;

    public final int A02(Intent intent, C5GK c5gk) {
        String str;
        try {
            if (intent != null) {
                Bundle extras = intent.getExtras();
                Context context = this.A00;
                C88633xO A00 = C88633xO.A00(context, extras);
                PowerManager powerManager = (PowerManager) A00.A03.getApplicationContext().getSystemService("power");
                String A07 = AnonymousClass001.A07(A00.A02, "UploadServiceLogic-", intent.getComponent().getShortClassName(), "-service-");
                PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, A07);
                C0BX.A02(newWakeLock, A07);
                A00.A00 = newWakeLock;
                AbstractC09820fg.A02(newWakeLock);
                PowerManager.WakeLock wakeLock = A00.A00;
                long j = A03;
                wakeLock.acquire(j);
                C0BX.A01(wakeLock, j);
                Messenger messenger = A00.A05;
                if (messenger != null) {
                    try {
                        messenger.send(Message.obtain());
                    } catch (RemoteException unused) {
                        C0K8.A0D("UploadServiceLogic", "The peer died unexpectedly, possible wakelock gap detected.");
                    }
                }
                C40401u8 c40401u8 = A00.A06;
                String str2 = c40401u8.A0A;
                if (str2 != null) {
                    C39251s2 A002 = C39251s2.A00(context);
                    C39251s2.A02(A002, str2, A002.A04);
                }
                A01(A00, c5gk, intent.getAction());
                return !c40401u8.A0C ? 3 : 2;
            }
            throw new Exception("Received a null intent in runJobFromService, did you ever return START_STICKY?");
        } catch (C906842g e) {
            e = e;
            str = "Misunderstood service intent: %s";
            C0K8.A0H("UploadServiceLogic", str, e);
            c5gk.A01.stopSelf(c5gk.A00);
            return 2;
        } catch (IllegalArgumentException e2) {
            e = e2;
            str = "Failure in runJobNow";
            C0K8.A0H("UploadServiceLogic", str, e);
            c5gk.A01.stopSelf(c5gk.A00);
            return 2;
        }
    }

    public final void A05(C88633xO c88633xO, String str) {
        A01(c88633xO, null, str);
    }

    public static synchronized C88643xQ A00(Context context) {
        C88643xQ c88643xQ;
        synchronized (C88643xQ.class) {
            c88643xQ = A02;
            if (c88643xQ == null) {
                c88643xQ = new C88643xQ(context);
                A02 = c88643xQ;
            }
        }
        return c88643xQ;
    }

    private void A01(final C88633xO c88633xO, final C5GK c5gk, String str) {
        final C88653xR c88653xR;
        final C88663xS c88663xS;
        C88703xW c88703xW;
        boolean z;
        if ("com.facebook.analytics2.logger.UPLOAD_NOW".equals(str)) {
            c88653xR = this.A01;
            AbstractC05810Sj.A00(c88653xR);
            int i = c88633xO.A02;
            c88663xS = new C88663xS(c88633xO.A06, c88633xO.A08, i);
        } else if (AbstractC58317Pt9.A00(726).equals(str)) {
            Bundle bundle = c88633xO.A04;
            AbstractC05810Sj.A00(bundle);
            bundle.getString(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
            c88653xR = this.A01;
            AbstractC05810Sj.A00(c88653xR);
            int i2 = c88633xO.A02;
            C40401u8 c40401u8 = c88633xO.A06;
            String str2 = c88633xO.A08;
            AbstractC05810Sj.A00(str2);
            c88663xS = new C88663xS(c40401u8, str2, i2);
        } else {
            throw new IllegalArgumentException(AnonymousClass001.A0R("Unknown action=", str));
        }
        final InterfaceC88683xU interfaceC88683xU = c88633xO.A01;
        if (interfaceC88683xU == null) {
            final AbstractC40481uH A00 = AbstractC40481uH.A00(c88633xO.A03);
            interfaceC88683xU = new InterfaceC88683xU(A00, c88633xO) { // from class: X.3xT
                public final AbstractC40481uH A00;
                public final /* synthetic */ C88633xO A01;

                {
                    this.A01 = c88633xO;
                    this.A00 = A00;
                }

                @Override // X.InterfaceC88683xU
                public final void E1W(boolean z2) {
                    C88633xO c88633xO2;
                    C88623xN c88623xN;
                    if (z2 && (c88623xN = (c88633xO2 = this.A01).A07) != null) {
                        this.A00.A02(c88633xO2.A06, c88623xN.A02, c88633xO2.A02, c88623xN.A01, c88623xN.A00);
                    }
                }

                @Override // X.InterfaceC88683xU
                public final void onExit() {
                    PowerManager.WakeLock wakeLock = this.A01.A00;
                    if (wakeLock != null) {
                        AbstractC09820fg.A01(wakeLock);
                    }
                }
            };
            c88633xO.A01 = interfaceC88683xU;
        }
        final InterfaceC88683xU interfaceC88683xU2 = new InterfaceC88683xU(interfaceC88683xU, c5gk) { // from class: X.3xV
            public final InterfaceC88683xU A00;
            public final C5GK A01;

            @Override // X.InterfaceC88683xU
            public final void E1W(boolean z2) {
                this.A00.E1W(z2);
            }

            @Override // X.InterfaceC88683xU
            public final void onExit() {
                this.A00.onExit();
                C5GK c5gk2 = this.A01;
                if (c5gk2 != null) {
                    c5gk2.A01.stopSelf(c5gk2.A00);
                }
            }

            {
                this.A00 = interfaceC88683xU;
                this.A01 = c5gk;
            }
        };
        synchronized (c88653xR) {
            c88703xW = (C88703xW) c88653xR.A01.get(c88663xS.A00);
            synchronized (c88653xR) {
                if (c88703xW != null) {
                    if (c88703xW.A00 != null) {
                        z = false;
                    }
                }
                C88653xR.A00(c88663xS, interfaceC88683xU2, c88653xR);
                z = true;
            }
        }
        if (!z) {
            AbstractC05810Sj.A00(c88703xW);
            Runnable runnable = new Runnable() { // from class: X.42i
                @Override // java.lang.Runnable
                public final void run() {
                    C88653xR.A00(c88663xS, interfaceC88683xU2, c88653xR);
                }
            };
            ArrayDeque arrayDeque = c88703xW.A01;
            if (arrayDeque == null) {
                arrayDeque = new ArrayDeque();
                c88703xW.A01 = arrayDeque;
            }
            arrayDeque.offer(runnable);
        }
    }

    public final void A03(int i) {
        HandlerC88723xY handlerC88723xY;
        C88653xR c88653xR = this.A01;
        AbstractC05810Sj.A00(c88653xR);
        synchronized (c88653xR) {
            C88703xW c88703xW = (C88703xW) c88653xR.A01.get(i);
            if (c88703xW != null && (handlerC88723xY = c88703xW.A00) != null) {
                handlerC88723xY.sendMessageAtFrontOfQueue(handlerC88723xY.obtainMessage(3));
            }
        }
    }

    public final void A04(C40401u8 c40401u8, final InterfaceC107844tT interfaceC107844tT, String str, int i) {
        boolean z;
        String str2 = c40401u8.A0A;
        if (str2 != null) {
            C39251s2 A00 = C39251s2.A00(this.A00);
            C39251s2.A02(A00, str2, A00.A04);
        }
        C88653xR c88653xR = this.A01;
        AbstractC05810Sj.A00(c88653xR);
        C88663xS c88663xS = new C88663xS(c40401u8, str, i);
        InterfaceC88683xU interfaceC88683xU = new InterfaceC88683xU(interfaceC107844tT) { // from class: X.4tU
            public final InterfaceC107844tT A00;

            @Override // X.InterfaceC88683xU
            public final void E1W(boolean z2) {
                this.A00.E1W(z2);
            }

            @Override // X.InterfaceC88683xU
            public final void onExit() {
            }

            {
                this.A00 = interfaceC107844tT;
            }
        };
        synchronized (c88653xR) {
            C88703xW c88703xW = (C88703xW) c88653xR.A01.get(c88663xS.A00);
            if (c88703xW != null) {
                if (c88703xW.A00 != null) {
                    z = false;
                }
            }
            C88653xR.A00(c88663xS, interfaceC88683xU, c88653xR);
            z = true;
        }
        if (!z) {
            interfaceC107844tT.E1W(true);
        }
    }

    public C88643xQ(Context context) {
        this.A00 = context.getApplicationContext();
        this.A01 = new C88653xR(context.getApplicationContext());
    }
}
