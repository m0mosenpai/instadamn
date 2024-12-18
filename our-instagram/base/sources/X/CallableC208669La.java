package X;

import android.content.Context;
import android.hardware.Camera;
import android.os.Process;
import java.util.concurrent.Callable;

/* renamed from: X.9La, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class CallableC208669La implements Callable {
    public final int A00;
    public final int A01;
    public final Object A02;

    public CallableC208669La(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        ?? r3;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        switch (this.A00) {
            case 0:
                C58725Q5c c58725Q5c = (C58725Q5c) this.A02;
                int i6 = this.A01;
                boolean z = c58725Q5c.A03;
                Context context = c58725Q5c.getContext();
                if (z) {
                    str = AbstractC63385Sj0.A07(context, i6);
                } else {
                    str = null;
                }
                return AbstractC63385Sj0.A00(context, str, i6);
            case 1:
                C208789Lm c208789Lm = (C208789Lm) this.A02;
                int i7 = this.A01;
                c208789Lm.A0F("Can not update preview display rotation");
                c208789Lm.A01 = i7;
                c208789Lm.A0Z.getClass();
                if (c208789Lm.A0b == null) {
                    c208789Lm.A0Z.setDisplayOrientation(C208789Lm.A00(c208789Lm, c208789Lm.A01));
                } else {
                    boolean FE6 = c208789Lm.A0b.FE6();
                    Camera camera = c208789Lm.A0Z;
                    if (FE6) {
                        i2 = 0;
                    } else {
                        i2 = c208789Lm.A01;
                    }
                    camera.setDisplayOrientation(C208789Lm.A00(c208789Lm, i2));
                    InterfaceC175497rP interfaceC175497rP = c208789Lm.A0b;
                    int i8 = c208789Lm.A01;
                    if (i8 != 1) {
                        if (i8 != 2) {
                            i3 = 270;
                            if (i8 != 3) {
                                i3 = 0;
                            }
                        } else {
                            i3 = 180;
                        }
                    } else {
                        i3 = 90;
                    }
                    interfaceC175497rP.D1a(i3);
                }
                AbstractC176797tb Bty = c208789Lm.Bty();
                Object A02 = Bty.A02(AbstractC176797tb.A0q);
                A02.getClass();
                C176877tj c176877tj = (C176877tj) A02;
                C208789Lm.A09(c208789Lm, c176877tj.A02, c176877tj.A01);
                return new C177447ue(c208789Lm.AlU(), null, Bty, c208789Lm.A00, false);
            case 2:
                C208789Lm c208789Lm2 = (C208789Lm) this.A02;
                int i9 = this.A01;
                AbstractC175037qd.A00(30, 0, null);
                C0fE c0fE = C0fE.$redex_init_class;
                Camera open = Camera.open(i9);
                if (C0BU.A04()) {
                    C0BU.A03(open);
                }
                AbstractC175037qd.A00(31, 0, null);
                C176347sr c176347sr = c208789Lm2.A0a;
                if (c176347sr != null) {
                    String A022 = c208789Lm2.A0Q.A02();
                    if (!c176347sr.A00.isEmpty()) {
                        C176567tE.A00(new RunnableC173607oC(c176347sr, A022));
                        return open;
                    }
                    return open;
                }
                return open;
            case 3:
                C208789Lm c208789Lm3 = (C208789Lm) this.A02;
                i = this.A01;
                if (c208789Lm3.isConnected() && c208789Lm3.A0e) {
                    c208789Lm3.A0M.A00(i);
                    break;
                } else {
                    i = 0;
                    break;
                }
                break;
            case 4:
                C9M1 c9m1 = (C9M1) this.A02;
                int i10 = this.A01;
                if (C9M1.A03(c9m1)) {
                    if (i10 != 0) {
                        if (i10 != 1) {
                            r3 = 0;
                        } else {
                            r3 = C9M1.A05;
                        }
                    } else {
                        r3 = C9M1.A04;
                    }
                } else {
                    if (C9M1.A06 == null) {
                        c9m1.A00.A06("Number of cameras must be loaded on background thread.");
                        C9M1.A02(c9m1);
                    }
                    Camera.CameraInfo[] cameraInfoArr = C9M1.A06;
                    i = 0;
                    if (cameraInfoArr != null) {
                        int length = cameraInfoArr.length;
                        r3 = 0;
                        while (i < length) {
                            if (cameraInfoArr[i].facing == i10) {
                                r3++;
                            }
                            i++;
                            r3 = r3;
                        }
                    }
                }
                i = r3;
                break;
            case 5:
                return Boolean.valueOf(((C9M1) this.A02).A08(this.A01));
            default:
                C66045Tyh c66045Tyh = (C66045Tyh) this.A02;
                if (c66045Tyh.A0D) {
                    i4 = -4;
                } else {
                    i4 = this.A01;
                }
                Process.setThreadPriority(i4);
                B52 b52 = c66045Tyh.A06;
                if (b52.A00) {
                    b52.lock();
                }
                while (!c66045Tyh.A0T && !Thread.currentThread().isInterrupted() && (!b52.A00 || !c66045Tyh.A0V)) {
                    try {
                        C66029TyR AOs = c66045Tyh.A0R.AOs(c66045Tyh.A0F);
                        if (AOs != null) {
                            if (!c66045Tyh.A0R.Eju()) {
                                i5 = 0;
                                if (AOs.AjR() != null) {
                                    if (c66045Tyh.A0A) {
                                        C0K8.A0P(AbstractC111324zv.A00(1860), "extractVideoFrame mVideoDemuxer.readSampleData mCancelled: %s", Boolean.valueOf(c66045Tyh.A0T));
                                    }
                                    int E8N = c66045Tyh.A0Q.E8N(AOs.AjR());
                                    long Bq8 = c66045Tyh.A0Q.Bq8() - c66045Tyh.A0P;
                                    if (E8N > 0) {
                                        AOs.EQc(0, E8N, Bq8, c66045Tyh.A0Q.Bq6());
                                        c66045Tyh.A0R.E7a(AOs);
                                        c66045Tyh.A0Q.AAz();
                                    }
                                } else {
                                    C66045Tyh.A07("extractVideoFrame: byteBuffer cannot be null", new Object[0]);
                                    throw AbstractC166987dD.A14("byteBuffer cannot be null");
                                }
                            } else {
                                i5 = 0;
                            }
                            AOs.EQc(i5, i5, 0L, 4);
                            c66045Tyh.A0R.E7a(AOs);
                        }
                    } catch (Throwable th) {
                        try {
                            b52.close();
                            throw th;
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            throw th;
                        }
                    }
                }
                b52.close();
                return null;
        }
        return Integer.valueOf(i);
    }
}
