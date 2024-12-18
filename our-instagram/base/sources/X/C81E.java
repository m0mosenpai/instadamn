package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.onecamera.components.mediagraph.iglu.nativegraph.IgluFilterNativeGraph;

/* renamed from: X.81E, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C81E implements C81D {
    public InterfaceC180227zC A00;
    public C178907x2 A01;
    public AZ8 A02;
    public C81F A03;
    public final C178747wm A04;

    @Override // X.InterfaceC179087xK
    public final void detach() {
        if (this instanceof C195878lX) {
            C195878lX c195878lX = (C195878lX) this;
            C179427xs c179427xs = c195878lX.A00;
            if (c179427xs != null) {
                c179427xs.detach();
                c195878lX.A00 = null;
            }
            C179427xs c179427xs2 = c195878lX.A01;
            if (c179427xs2 != null) {
                c179427xs2.detach();
                c195878lX.A01 = null;
            }
        } else if (this instanceof C199728sO) {
            C199728sO c199728sO = (C199728sO) this;
            synchronized (this) {
                AZH azh = c199728sO.A02;
                if (azh != null) {
                    azh.detach();
                    c199728sO.A02 = null;
                }
                AZH azh2 = c199728sO.A03;
                if (azh2 != null) {
                    azh2.detach();
                    c199728sO.A03 = null;
                }
                FilterManagerImpl filterManagerImpl = c199728sO.A00;
                if (filterManagerImpl != null) {
                    filterManagerImpl.release();
                }
                InterfaceC198588q7 interfaceC198588q7 = c199728sO.A05;
                if (interfaceC198588q7 != null) {
                    interfaceC198588q7.detach();
                }
                IgluFilterNativeGraph igluFilterNativeGraph = c199728sO.A01;
                if (igluFilterNativeGraph != null) {
                    igluFilterNativeGraph.detach();
                }
            }
        } else if (this instanceof C212429bB) {
            C212429bB c212429bB = (C212429bB) this;
            synchronized (this) {
                C179427xs c179427xs3 = c212429bB.A00;
                if (c179427xs3 != null) {
                    c179427xs3.detach();
                    c212429bB.A00 = null;
                }
                c212429bB.A02 = null;
            }
        } else {
            C212419bA c212419bA = (C212419bA) this;
            C179427xs c179427xs4 = c212419bA.A00;
            if (c179427xs4 != null) {
                c179427xs4.detach();
                c212419bA.A00 = null;
            }
        }
        this.A00 = null;
        C81F c81f = this.A03;
        if (c81f != null) {
            c81f.detach();
            this.A03 = null;
        }
    }

    @Override // X.InterfaceC179087xK
    public final void release() {
        this.A01 = null;
    }

    public final C81F A02() {
        if (this.A03 == null) {
            this.A03 = new C81F(this.A04);
            this.A01.getClass();
            C81F c81f = this.A03;
            InterfaceC180227zC interfaceC180227zC = this.A00;
            interfaceC180227zC.getClass();
            c81f.ACv(interfaceC180227zC);
        }
        return this.A03;
    }

    @Override // X.InterfaceC179087xK
    public final void ACv(InterfaceC180227zC interfaceC180227zC) {
        InterfaceC180227zC interfaceC180227zC2 = this.A00;
        if (interfaceC180227zC2 != null && interfaceC180227zC2 != interfaceC180227zC) {
            this.A04.A00(EnumC200658u8.A02);
        }
        this.A00 = interfaceC180227zC;
    }

    @Override // X.InterfaceC179087xK
    public final void CNk(C178907x2 c178907x2) {
        C178907x2 c178907x22 = this.A01;
        if (c178907x22 != null && c178907x22 != c178907x2) {
            this.A04.A00(EnumC200658u8.A04);
        }
        this.A01 = c178907x2;
    }

    public C81E(C178747wm c178747wm) {
        this.A04 = c178747wm == null ? C178747wm.A01 : c178747wm;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (android.os.Looper.myLooper().getThread() != android.os.Looper.getMainLooper().getThread()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A03() {
        /*
            r3 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 == 0) goto L19
            android.os.Looper r0 = android.os.Looper.myLooper()
            java.lang.Thread r2 = r0.getThread()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r0.getThread()
            r0 = 1
            if (r2 == r1) goto L1a
        L19:
            r0 = 0
        L1a:
            r2 = 0
            if (r0 == 0) goto L25
            X.7wm r1 = r3.A04
            X.8u8 r0 = X.EnumC200658u8.A01
        L21:
            r1.A00(r0)
            return r2
        L25:
            X.7x2 r0 = r3.A01
            if (r0 != 0) goto L2e
            X.7wm r1 = r3.A04
            X.8u8 r0 = X.EnumC200658u8.A05
            goto L21
        L2e:
            X.7zC r0 = r3.A00
            if (r0 != 0) goto L37
            X.7wm r1 = r3.A04
            X.8u8 r0 = X.EnumC200658u8.A08
            goto L21
        L37:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81E.A03():boolean");
    }

    public C81E() {
        this(null);
    }
}
