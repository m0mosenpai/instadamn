package X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.lang.reflect.Field;

/* renamed from: X.1Sy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C27011Sy extends C0R8 {
    public static Field A0C;
    public static final String[] A0D = {"mobileconfig-jni", "bandwidth_estimator_jni", "fb", "graphservice-jni-asset", "mediacodechooks_jni", "igrequeststream-jni", "appstatesyncer_jni", "rs-streamref-jni", "pando-jni"};
    public static final boolean A0E;
    public Boolean A00;
    public final Handler A01;
    public final AbstractC04410Lh A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final Context A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    @Override // X.InterfaceC05710Rv
    public final String getName() {
        return "InstagramStartupOptimizer";
    }

    @Override // X.InterfaceC05710Rv
    public final void CNZ() {
        if (this.A0B) {
            A0B("mEnableXAnalyticsSoLoad");
            this.A01.post(new RunnableC64558TJv(this));
        }
        if (this.A0A) {
            A0B("mEnableQplXplatSoLoad");
            this.A01.post(new RunnableC64559TJw(this));
        }
        if (this.A08) {
            A0B("mEnableNativeLibPreload");
            this.A01.post(new Runnable() { // from class: X.1TV
                @Override // java.lang.Runnable
                public final void run() {
                    C27011Sy c27011Sy = C27011Sy.this;
                    String[] strArr = C27011Sy.A0D;
                    int i = 0;
                    do {
                        try {
                            C09170dP.A0C(strArr[i]);
                        } catch (Throwable th) {
                            c27011Sy.A0C(th);
                        }
                        i++;
                    } while (i < 9);
                }
            });
        }
        if (this.A09) {
            A0B("mEnableQplUserflowSoLoad");
            this.A01.post(new RunnableC64560TJx(this));
        }
        boolean z = this.A04;
        if (z || this.A05 || this.A03) {
            A08();
            C0HU.A03(this.A02);
            if (z) {
                C0HU.A02(this.A06, "package");
            }
            if (this.A05) {
                C0HU.A02(this.A06, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            }
            if (this.A03) {
                C0HU.A02(this.A06, "notification");
            }
            Looper.getMainLooper().getQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: X.1To
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    C27011Sy c27011Sy = C27011Sy.this;
                    boolean z2 = C27011Sy.A0E;
                    C0HU.A00.remove(c27011Sy.A02);
                    c27011Sy.A00 = null;
                    return false;
                }
            });
        }
        if (this.A07) {
            A0B("mEnableEarlyBroadcastExecutor");
            C27161Tp c27161Tp = C27161Tp.A02;
            if (c27161Tp == null) {
                A0A("RefMessageQueue not available.");
                return;
            }
            MessageQueue queue = Looper.getMainLooper().getQueue();
            synchronized (queue) {
                Message message = null;
                try {
                    Field field = c27161Tp.A00;
                    Message message2 = (Message) field.get(queue);
                    loop0: while (true) {
                        Message message3 = message;
                        message = message2;
                        while (message != null) {
                            if (message.what == 113 && message.obj != null && message.getTarget() != null) {
                                if (A0C == null) {
                                    try {
                                        Field declaredField = message.obj.getClass().getDeclaredField("intent");
                                        A0C = declaredField;
                                        declaredField.setAccessible(true);
                                    } catch (Throwable th) {
                                        A0C(th);
                                        A0C = null;
                                    }
                                }
                                Field field2 = A0C;
                                if (field2 != null) {
                                    try {
                                        Intent intent = (Intent) field2.get(message.obj);
                                        if (intent != null && "com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
                                            message.getTarget().handleMessage(message);
                                            try {
                                                message = (Message) c27161Tp.A01.get(message);
                                            } catch (Throwable unused) {
                                                message = null;
                                            }
                                            if (message3 == null) {
                                                try {
                                                    field.set(queue, message);
                                                } catch (Throwable unused2) {
                                                }
                                            } else {
                                                c27161Tp.A01.set(message3, message);
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        A0C(th2);
                                    }
                                }
                            }
                            message2 = (Message) c27161Tp.A01.get(message);
                        }
                        break loop0;
                    }
                } catch (Throwable unused3) {
                }
            }
        }
    }

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT <= 29) {
            z = true;
        }
        A0E = z;
        String str = AbstractC14490oL.A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (r3 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        if (X.C20150ym.A07(X.AbstractC20100yh.A00(36314103109716409L)) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        if (X.C20150ym.A07(X.AbstractC20100yh.A00(36314103113255383L)) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
    
        if (X.C20150ym.A07(X.AbstractC20100yh.A00(36314103109781946L)) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
    
        if (X.C20150ym.A07(X.AbstractC20100yh.A00(36314103108405674L)) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C27011Sy(X.C0Rw r5) {
        /*
            r4 = this;
            r4.<init>(r5)
            X.1Sz r0 = new X.1Sz
            r0.<init>()
            r4.A02 = r0
            r0 = r5
            X.0RK r0 = (X.C0RK) r0
            android.content.Context r0 = r0.A01
            r4.A06 = r0
            java.lang.Class<X.0hA> r0 = X.C10420hA.class
            X.0Rw r3 = r4.A05(r0)
            if (r3 != 0) goto L2f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Fail to cast config object, mConfig="
            r1.append(r0)
            X.0Rw r0 = r4.A01
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.A0A(r0)
        L2f:
            r2 = 1
            if (r3 == 0) goto L42
            r0 = 36314103108405674(0x81037c001d09aa, double:3.0285232586875626E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            boolean r1 = X.C20150ym.A07(r0)
            r0 = 1
            if (r1 != 0) goto L43
        L42:
            r0 = 0
        L43:
            r4.A08 = r0
            r0 = 0
            if (r3 == 0) goto L49
            r0 = 1
        L49:
            r4.A04 = r0
            boolean r0 = X.C27011Sy.A0E
            if (r0 == 0) goto L52
            r0 = 1
            if (r3 != 0) goto L53
        L52:
            r0 = 0
        L53:
            r4.A05 = r0
            r0 = 0
            if (r3 == 0) goto L59
            r0 = 1
        L59:
            r4.A03 = r0
            android.os.Handler r0 = r5.Aex()
            r4.A01 = r0
            if (r3 == 0) goto L73
            r0 = 36314103109716409(0x81037c003109b9, double:3.028523259516477E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            boolean r1 = X.C20150ym.A07(r0)
            r0 = 1
            if (r1 != 0) goto L74
        L73:
            r0 = 0
        L74:
            r4.A0A = r0
            if (r3 == 0) goto L88
            r0 = 36314103113255383(0x81037c006709d7, double:3.028523261754538E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            boolean r1 = X.C20150ym.A07(r0)
            r0 = 1
            if (r1 != 0) goto L89
        L88:
            r0 = 0
        L89:
            r4.A09 = r0
            if (r3 == 0) goto L9d
            r0 = 36314103109781946(0x81037c003209ba, double:3.0285232595579226E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            boolean r1 = X.C20150ym.A07(r0)
            r0 = 1
            if (r1 != 0) goto L9e
        L9d:
            r0 = 0
        L9e:
            r4.A0B = r0
            if (r3 == 0) goto Lb4
            r0 = 36314103111092676(0x81037c004609c4, double:3.0285232603868335E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            boolean r0 = X.C20150ym.A07(r0)
            if (r0 == 0) goto Lb4
        Lb1:
            r4.A07 = r2
            return
        Lb4:
            r2 = 0
            goto Lb1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27011Sy.<init>(X.0Rw):void");
    }
}
