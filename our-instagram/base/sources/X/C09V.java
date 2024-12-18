package X;

import android.content.Context;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import com.facebook.acra.anr.multisignal.MultiSignalANRDetector;

/* renamed from: X.09V, reason: invalid class name */
/* loaded from: classes.dex */
public final class C09V {
    public long A00;
    public C09S A01;
    public Integer A02 = C05F.A00;
    public final int A03 = Process.myUid();
    public final Context A04;
    public final String A05;

    public final void A00() {
        C09S c09s;
        synchronized (this) {
            if (this.A02 != C05F.A00 && (c09s = this.A01) != null) {
                Object obj = c09s.A05;
                synchronized (obj) {
                    c09s.A01 = true;
                    obj.notifyAll();
                }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0013. Please report as an issue. */
    public final synchronized void A01(final C11240ig c11240ig, Integer num, final String str, final String str2) {
        Handler handler;
        Runnable runnable;
        C09S c09s = this.A01;
        if (c09s == null || c09s.A03 == this.A00) {
            switch (num.intValue()) {
                case 0:
                    if (c11240ig != null) {
                        C0K8.A0D(c11240ig.A00.A0E, "Started monitoring");
                        break;
                    }
                    break;
                case 1:
                    this.A02 = C05F.A01;
                    if (c11240ig != null) {
                        MultiSignalANRDetector multiSignalANRDetector = c11240ig.A00;
                        C0K8.A0D(multiSignalANRDetector.A0E, "On onErrorCleared");
                        InterfaceC04550Lx interfaceC04550Lx = multiSignalANRDetector.A0W;
                        if (interfaceC04550Lx != null) {
                            interfaceC04550Lx.Db1();
                        }
                        handler = multiSignalANRDetector.A0S;
                        runnable = new Runnable() { // from class: X.099
                            @Override // java.lang.Runnable
                            public final void run() {
                                MultiSignalANRDetector multiSignalANRDetector2 = C11240ig.this.A00;
                                multiSignalANRDetector2.A02(C09M.DIALOG_DISMISSED, false, false);
                                MultiSignalANRDetector.A01(multiSignalANRDetector2);
                            }
                        };
                        handler.post(runnable);
                        break;
                    }
                    break;
                case 2:
                    this.A02 = C05F.A0C;
                    if (c11240ig != null) {
                        MultiSignalANRDetector multiSignalANRDetector2 = c11240ig.A00;
                        C0K8.A0P(multiSignalANRDetector2.A0E, "On error detected %s %s", str, str2);
                        synchronized (multiSignalANRDetector2.A0Y) {
                            if (!multiSignalANRDetector2.A0M) {
                                break;
                            } else {
                                InterfaceC04550Lx interfaceC04550Lx2 = multiSignalANRDetector2.A0W;
                                if (interfaceC04550Lx2 != null) {
                                    interfaceC04550Lx2.Db0();
                                }
                                handler = multiSignalANRDetector2.A0S;
                                runnable = new Runnable() { // from class: X.098
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        MultiSignalANRDetector multiSignalANRDetector3 = C11240ig.this.A00;
                                        C0K8.A0P(multiSignalANRDetector3.A0E, "On error detected waiting for confirmation %b", Boolean.valueOf(multiSignalANRDetector3.A0P));
                                        multiSignalANRDetector3.A0H = str;
                                        multiSignalANRDetector3.A0I = str2;
                                        multiSignalANRDetector3.A0A = SystemClock.uptimeMillis();
                                        C09M c09m = C09M.AM_CONFIRMED;
                                        multiSignalANRDetector3.A02(c09m, false, false);
                                        if (multiSignalANRDetector3.A0P) {
                                            multiSignalANRDetector3.A0S.removeCallbacks(multiSignalANRDetector3.A0Z);
                                            multiSignalANRDetector3.A0P = false;
                                        }
                                        MultiSignalANRDetector.A00(c09m, multiSignalANRDetector3);
                                    }
                                };
                                handler.post(runnable);
                                break;
                            }
                        }
                    }
                    break;
                case 3:
                    this.A02 = C05F.A00;
                    break;
                case 4:
                    this.A02 = C05F.A00;
                    break;
                case 5:
                    this.A02 = C05F.A00;
                    break;
                default:
                    this.A02 = C05F.A00;
                    if (c11240ig != null) {
                        MultiSignalANRDetector multiSignalANRDetector3 = c11240ig.A00;
                        C0K8.A0C(multiSignalANRDetector3.A0E, "onCheckFailed");
                        multiSignalANRDetector3.A05 = SystemClock.uptimeMillis();
                        handler = multiSignalANRDetector3.A0S;
                        runnable = new Runnable() { // from class: X.09A
                            @Override // java.lang.Runnable
                            public final void run() {
                                MultiSignalANRDetector multiSignalANRDetector4 = C11240ig.this.A00;
                                if (multiSignalANRDetector4.A0J) {
                                    C06420Vj c06420Vj = multiSignalANRDetector4.A0X.A03;
                                    c06420Vj.A09 = multiSignalANRDetector4.A05;
                                    c06420Vj.A01 = 3;
                                    C06420Vj.A00(c06420Vj);
                                }
                            }
                        };
                        handler.post(runnable);
                        break;
                    }
                    break;
            }
        }
    }

    public C09V(Context context, String str) {
        this.A04 = context;
        this.A05 = str;
    }
}
