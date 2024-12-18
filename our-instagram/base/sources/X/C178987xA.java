package X;

import android.content.Context;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7xA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178987xA implements Handler.Callback {
    public InterfaceC179077xJ A00;
    public final Handler A01;
    public final SparseArray A02 = new SparseArray();
    public final C178747wm A03;
    public final C178907x2 A04;
    public final InterfaceC178977x9 A05;
    public final boolean A06;

    public static void A00(InterfaceC179077xJ interfaceC179077xJ, C178987xA c178987xA) {
        InterfaceC179077xJ interfaceC179077xJ2 = c178987xA.A00;
        if (interfaceC179077xJ2 != interfaceC179077xJ) {
            if (interfaceC179077xJ2 != null) {
                c178987xA.A04.A04(interfaceC179077xJ2);
            }
            c178987xA.A00 = interfaceC179077xJ;
            if (interfaceC179077xJ != null) {
                c178987xA.A04.A03(interfaceC179077xJ);
            }
            InterfaceC179077xJ interfaceC179077xJ3 = c178987xA.A00;
            if (interfaceC179077xJ3 != null) {
                SparseArray sparseArray = c178987xA.A02;
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int keyAt = sparseArray.keyAt(i);
                    Object valueAt = sparseArray.valueAt(i);
                    valueAt.getClass();
                    AnonymousClass813 anonymousClass813 = (AnonymousClass813) valueAt;
                    interfaceC179077xJ3.FBm(keyAt, anonymousClass813.A01, anonymousClass813.A00, anonymousClass813.A04, anonymousClass813.A03, anonymousClass813.A02);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.RuntimeException, X.B4J] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.RuntimeException, X.B4J] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i;
        int i2 = message.what;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        A00((InterfaceC179077xJ) message.obj, this);
                        return false;
                    }
                    return false;
                }
                InterfaceC178977x9 interfaceC178977x9 = this.A05;
                interfaceC178977x9.DRl(this);
                C178907x2 c178907x2 = this.A04;
                synchronized (c178907x2.A08) {
                    C178907x2.A00(c178907x2);
                    C1814082s c1814082s = c178907x2.A07;
                    List list = c1814082s.A00;
                    c1814082s.A00();
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((InterfaceC179087xK) list.get(i3)).release();
                    }
                }
                this.A00 = null;
                interfaceC178977x9.DRk(this);
                return false;
            }
            this.A05.DRj(this);
            C178907x2 c178907x22 = this.A04;
            if (c178907x22.A0F) {
                c178907x22.A0F = false;
                c178907x22.A02();
            }
            synchronized (c178907x22.A08) {
                if (c178907x22.A0A) {
                    C178907x2.A00(c178907x22);
                }
            }
            return false;
        }
        final C178907x2 c178907x23 = this.A04;
        synchronized (c178907x23.A08) {
            c178907x23.A0D.getClass();
            if (c178907x23.A0E == null) {
                C178907x2 c178907x24 = (C178907x2) C178907x2.A0H.get(c178907x23.A00.getLooper());
                if (c178907x24 != null) {
                    C178907x2.A00(c178907x24);
                }
                c178907x23.A0D.getClass();
                if (c178907x23.A0E == null) {
                    try {
                        final Context context = c178907x23.A02;
                        final C178847ww c178847ww = c178907x23.A05;
                        final InterfaceC178897x1 interfaceC178897x1 = c178907x23.A03;
                        final InterfaceC178897x1 interfaceC178897x12 = c178907x23.A04;
                        C14360o3.A0B(context, 1);
                        C14360o3.A0B(c178847ww, 2);
                        InterfaceC180227zC interfaceC180227zC = new InterfaceC180227zC(context, interfaceC178897x1, interfaceC178897x12, c178847ww, c178907x23) { // from class: X.7zB
                            public InterfaceC178897x1 A00;
                            public boolean A01;
                            public final InterfaceC178897x1 A02;
                            public final AbstractC180277zH A03;
                            public final C179877yd A04;
                            public final C178847ww A05;
                            public final InterfaceC180297zJ A06;
                            public final C180307zK A07;
                            public final C180347zO A08;

                            @Override // X.InterfaceC180227zC
                            public final InterfaceC178897x1 B0A(int i4) {
                                InterfaceC178897x1 interfaceC178897x13 = this.A02;
                                if (0 == (interfaceC178897x13.AqC() & 32)) {
                                    return interfaceC178897x13;
                                }
                                InterfaceC178897x1 interfaceC178897x14 = this.A00;
                                if (interfaceC178897x14 == null) {
                                    C178847ww c178847ww2 = this.A05;
                                    C178857wx c178857wx = C178847ww.A02;
                                    Object obj = C178867wy.A05;
                                    Map map = c178847ww2.A00;
                                    Object obj2 = map.get(c178857wx);
                                    if (obj2 != null) {
                                        obj = obj2;
                                    }
                                    Object obj3 = map.get(C178847ww.A07);
                                    obj3.getClass();
                                    C178927x4 A01 = C178917x3.A01(obj, ((Number) obj3).intValue());
                                    C14360o3.A0C(A01, "null cannot be cast to non-null type com.facebook.gl.EGLCore<android.opengl.EGLContext>");
                                    A01.A0A(interfaceC178897x13, 5);
                                    this.A00 = A01;
                                    return A01;
                                }
                                return interfaceC178897x14;
                            }

                            @Override // X.InterfaceC180227zC
                            public final InterfaceC178897x1 B09() {
                                return this.A02;
                            }

                            @Override // X.InterfaceC180227zC
                            public final C179877yd BiH() {
                                return this.A04;
                            }

                            @Override // X.InterfaceC180227zC
                            public final C180307zK Bmp() {
                                return this.A07;
                            }

                            @Override // X.InterfaceC180227zC
                            public final C180347zO C4K() {
                                return this.A08;
                            }

                            @Override // X.InterfaceC180227zC
                            public final InterfaceC180297zJ C6t() {
                                return this.A06;
                            }

                            @Override // X.InterfaceC180227zC
                            public final void makeCurrent() {
                                if (!this.A01) {
                                    this.A03.A05();
                                }
                            }

                            @Override // X.InterfaceC180227zC
                            public final void release() {
                                if (!this.A01) {
                                    this.A01 = true;
                                    C180307zK c180307zK = this.A07;
                                    C180317zL c180317zL = c180307zK.A03;
                                    if (c180317zL != null) {
                                        c180317zL.A00();
                                    }
                                    HashMap hashMap = c180307zK.A04;
                                    for (Map.Entry entry : hashMap.entrySet()) {
                                        ((InterfaceC179087xK) entry.getValue()).detach();
                                        ((InterfaceC179087xK) entry.getValue()).release();
                                    }
                                    hashMap.clear();
                                    c180307zK.A00 = null;
                                    InterfaceC178897x1 interfaceC178897x13 = this.A02;
                                    interfaceC178897x13.Cml();
                                    this.A03.A02();
                                    interfaceC178897x13.release();
                                    InterfaceC178897x1 interfaceC178897x14 = this.A00;
                                    if (interfaceC178897x14 != null) {
                                        interfaceC178897x14.release();
                                    }
                                }
                            }

                            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.7zJ] */
                            {
                                this.A05 = c178847ww;
                                this.A02 = interfaceC178897x1;
                                Object obj = c178847ww.A00.get(C178847ww.A03);
                                int i4 = ((Boolean) (obj != null ? obj : false)).booleanValue() ? 37 : 5;
                                if (interfaceC178897x12 != null) {
                                    int AqC = interfaceC178897x12.AqC();
                                    i4 = (AqC & 256) != 0 ? i4 | 256 : i4;
                                    if ((AqC & 32) != 0) {
                                        i4 = AbstractC225059wU.A00(interfaceC178897x12, i4 | 32);
                                        if ((AqC & 8192) != 0) {
                                            i4 |= 8192;
                                        }
                                    }
                                    interfaceC178897x1.EhZ(interfaceC178897x12, i4);
                                } else {
                                    interfaceC178897x1.EhY(i4);
                                }
                                this.A04 = new C179877yd(context.getResources());
                                AbstractC180277zH AMg = interfaceC178897x1.AMg(8, 8);
                                this.A03 = AMg;
                                AMg.A05();
                                this.A06 = new Object();
                                C180307zK c180307zK = new C180307zK(c178847ww, c178907x23);
                                this.A07 = c180307zK;
                                this.A08 = new C180347zO(this);
                                c180307zK.A00 = this;
                            }

                            @Override // X.InterfaceC180227zC
                            public final void AVe() {
                                GLES20.glFinish();
                            }

                            @Override // X.InterfaceC180227zC
                            public final void flush() {
                                GLES20.glFlush();
                            }
                        };
                        c178907x23.A0E = interfaceC180227zC;
                        List list2 = c178907x23.A07.A00;
                        int size2 = list2.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            try {
                                ((InterfaceC179087xK) list2.get(i4)).ACv(interfaceC180227zC);
                            } catch (Throwable th) {
                                c178907x23.A05(new RuntimeException("GlHostImpl.attachGlElement() failed.", th));
                            }
                        }
                        int BZA = interfaceC178897x1.BZA();
                        if (c178907x23.A09 && BZA != (i = c178907x23.A01)) {
                            throw new IllegalStateException(AnonymousClass001.A02(i, BZA, "Unsupported OpenGL version. Expected is ", " but got "));
                        }
                    } finally {
                        try {
                            this.A05.DRs(this);
                            return false;
                        } finally {
                        }
                    }
                }
            }
        }
        this.A05.DRs(this);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.7xD, java.lang.Thread$UncaughtExceptionHandler, java.lang.Object] */
    public C178987xA(C178747wm c178747wm, C178907x2 c178907x2, InterfaceC178977x9 interfaceC178977x9, boolean z) {
        Handler handler = new Handler(c178907x2.A00.getLooper(), this);
        this.A01 = handler;
        this.A04 = c178907x2;
        this.A05 = interfaceC178977x9;
        interfaceC178977x9.DRh(this);
        this.A03 = c178747wm;
        this.A06 = z;
        Thread thread = handler.getLooper().getThread();
        WeakReference weakReference = new WeakReference(this);
        ?? obj = new Object();
        obj.A00 = weakReference;
        thread.setUncaughtExceptionHandler(obj);
    }
}
