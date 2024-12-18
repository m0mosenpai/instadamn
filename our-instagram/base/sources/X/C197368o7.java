package X;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;

/* renamed from: X.8o7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197368o7 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public FilterModel A04;
    public InterfaceC185788Ly A05;
    public C179427xs A06;
    public InterfaceC179437xt A07;
    public InterfaceC1809280u A08;
    public boolean A09;
    public final C178747wm A0A;
    public final InterfaceC178407wE A0B;
    public final C179067xI A0C;
    public final C197398oA A0D;
    public final C197418oC A0E;
    public final C197418oC A0F;
    public final C199518rz A0G;
    public volatile boolean A0K;
    public final C199438rk A0I = new Object();
    public final InterfaceC1809280u A0H = new InterfaceC1809280u() { // from class: X.8o8
        @Override // X.InterfaceC1809280u
        public final void DIE() {
            C197368o7 c197368o7 = C197368o7.this;
            if (c197368o7.A0K) {
                c197368o7.A0C.A02(null, true);
            }
        }
    };
    public final Runnable A0J = new Runnable() { // from class: X.8o9
        @Override // java.lang.Runnable
        public final void run() {
            C197368o7 c197368o7 = C197368o7.this;
            C197398oA c197398oA = c197368o7.A0D;
            InterfaceC197408oB interfaceC197408oB = c197398oA.A03;
            if (interfaceC197408oB != null) {
                if (c197398oA.A00) {
                    if (!c197398oA.A02) {
                        c197398oA.A02 = true;
                        interfaceC197408oB.CNl(c197398oA.A04);
                    }
                    if (!c197398oA.A01) {
                        c197398oA.A01 = true;
                    }
                    interfaceC197408oB.EGX(c197398oA.A04);
                    return;
                }
                return;
            }
            C179067xI.A00(c197368o7.A0C, null);
        }
    };

    public final Bitmap A00() {
        C179427xs c179427xs = this.A06;
        Bitmap bitmap = null;
        if (c179427xs != null) {
            Exception Cmh = c179427xs.Cmh();
            if (Cmh != null) {
                A0D("Failed ot make current", "FilterRendererSessionImpl", Cmh);
            } else {
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.A01 * this.A00 * 4);
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                GLES20.glFinish();
                GLES20.glReadPixels(0, 0, this.A01, this.A00, 6408, 5121, allocateDirect);
                allocateDirect.rewind();
                bitmap = Bitmap.createBitmap(this.A01, this.A00, Bitmap.Config.ARGB_8888);
                bitmap.copyPixelsFromBuffer(allocateDirect);
                InterfaceC180227zC interfaceC180227zC = ((C179027xE) this.A0C.A00).A05.A0E;
                if (interfaceC180227zC != null) {
                    interfaceC180227zC.makeCurrent();
                    return bitmap;
                }
            }
        }
        return bitmap;
    }

    public final void A02() {
        Runnable runnableC24567AuO;
        C197418oC c197418oC = this.A0F;
        InterfaceC179037xF interfaceC179037xF = this.A0C.A00;
        c197418oC.A02(interfaceC179037xF);
        this.A0E.A02(interfaceC179037xF);
        InterfaceC185788Ly interfaceC185788Ly = this.A05;
        if (interfaceC185788Ly != null) {
            this.A05 = interfaceC185788Ly;
            runnableC24567AuO = new RunnableC197598oW(interfaceC185788Ly, this);
        } else {
            InterfaceC179437xt interfaceC179437xt = this.A07;
            if (interfaceC179437xt != null) {
                this.A07 = interfaceC179437xt;
                runnableC24567AuO = new RunnableC24567AuO(interfaceC179437xt, this);
            } else {
                if (this.A09) {
                    A09(this.A08, this.A01, this.A00);
                    A05(this.A03, this.A02);
                }
                ((C179027xE) interfaceC179037xF).A05.A03(this.A0D);
                interfaceC179037xF.EWA(this.A0I, 1011);
            }
        }
        A0C(runnableC24567AuO);
        A05(this.A03, this.A02);
        ((C179027xE) interfaceC179037xF).A05.A03(this.A0D);
        interfaceC179037xF.EWA(this.A0I, 1011);
    }

    public final void A03() {
        SparseArray sparseArray;
        C197418oC c197418oC = this.A0F;
        InterfaceC179037xF interfaceC179037xF = this.A0C.A00;
        interfaceC179037xF.EWA(null, c197418oC.A09);
        c197418oC.A02 = null;
        C197418oC c197418oC2 = this.A0E;
        interfaceC179037xF.EWA(null, c197418oC2.A09);
        c197418oC2.A02 = null;
        C179027xE c179027xE = (C179027xE) interfaceC179037xF;
        C178907x2 c178907x2 = c179027xE.A05;
        c178907x2.A04(this.A0D);
        interfaceC179037xF.EWA(null, 1011);
        C179047xG c179047xG = c179027xE.A06;
        int i = 0;
        while (true) {
            sparseArray = c179047xG.A00;
            if (i >= sparseArray.size()) {
                break;
            }
            Object valueAt = sparseArray.valueAt(i);
            if (valueAt instanceof InterfaceC179087xK) {
                c178907x2.A04((InterfaceC179087xK) valueAt);
            }
            i++;
        }
        sparseArray.clear();
        C179057xH c179057xH = c179027xE.A07;
        int i2 = 0;
        while (true) {
            SparseArray sparseArray2 = c179057xH.A00;
            if (i2 < sparseArray2.size()) {
                C179377xn c179377xn = (C179377xn) sparseArray2.valueAt(i2);
                if (c179377xn != null) {
                    if (c178907x2.A07.A00.contains(c179377xn)) {
                        c178907x2.A04(c179377xn);
                    }
                    for (Object obj : c179377xn.A06.A00) {
                        if (obj instanceof InterfaceC179087xK) {
                            c178907x2.A04((InterfaceC179087xK) obj);
                        }
                    }
                }
                i2++;
            } else {
                sparseArray2.clear();
                this.A05 = null;
                this.A07 = null;
                this.A06 = null;
                return;
            }
        }
    }

    public final void A04() {
        if (this.A0K) {
            if (Build.VERSION.SDK_INT >= 29 && ((C179027xE) this.A0C.A00).A05.A00.hasCallbacks(this.A0J)) {
                return;
            }
            A0C(this.A0J);
        }
    }

    public final void A05(int i, int i2) {
        this.A03 = i;
        this.A02 = i2;
        A0C(new RunnableC197588oV(this));
        HashMap hashMap = new HashMap(1);
        InterfaceC185788Ly interfaceC185788Ly = this.A05;
        if (interfaceC185788Ly != null) {
            hashMap.put(interfaceC185788Ly.BOj(), AnonymousClass001.A0P("x", i, i2));
        }
        if (this.A07 != null) {
            hashMap.put("GlOutput", AnonymousClass001.A0P("x", i, i2));
        }
        this.A0B.AkA().ESf(hashMap);
    }

    public final void A06(int i, int i2, int i3, boolean z, boolean z2) {
        StringBuilder sb;
        this.A0F.A00(i, i2, i3, z, z2);
        A0C(new RunnableC197588oV(this));
        InterfaceC178477wL AkA = this.A0B.AkA();
        if (i3 % 180 != 0) {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("x");
            sb.append(i);
        } else {
            sb = new StringBuilder();
            sb.append(i);
            sb.append("x");
            sb.append(i2);
        }
        AkA.ESd(sb.toString());
    }

    public final void A07(FilterModel filterModel) {
        if (this.A04 != filterModel) {
            this.A04 = filterModel;
            this.A0I.A00 = this.A0G.A00(filterModel);
        }
    }

    public final void A08(InterfaceC199678sJ interfaceC199678sJ) {
        C197418oC c197418oC = this.A0F;
        c197418oC.A01(interfaceC199678sJ, this.A0C.A00);
        InterfaceC1809280u interfaceC1809280u = this.A0H;
        C197788op c197788op = c197418oC.A02;
        if (c197788op != null) {
            c197788op.A05 = interfaceC1809280u;
        }
        this.A0B.AkA().ESc(interfaceC199678sJ.BOj());
    }

    public final void A09(final InterfaceC1809280u interfaceC1809280u, final int i, final int i2) {
        A0C(new Runnable() { // from class: X.Ayn
            @Override // java.lang.Runnable
            public final void run() {
                C197368o7 c197368o7 = this;
                int i3 = i;
                int i4 = i2;
                InterfaceC1809280u interfaceC1809280u2 = interfaceC1809280u;
                synchronized (c197368o7) {
                    c197368o7.A01 = i3;
                    c197368o7.A00 = i4;
                    c197368o7.A08 = interfaceC1809280u2;
                    c197368o7.A09 = true;
                    C179427xs c179427xs = c197368o7.A06;
                    if (c179427xs == null) {
                        c179427xs = new C179427xs(c197368o7.A0A, new C179387xo(), new C179417xr(), false);
                        c197368o7.A06 = c179427xs;
                    }
                    c179427xs.A03(i3, i4, 0);
                    if (interfaceC1809280u2 != null) {
                        c179427xs.A0E = interfaceC1809280u2;
                    }
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("OutputFrameBuffer", AnonymousClass001.A0P("x", i3, i4));
                    c197368o7.A0B.AkA().ESf(hashMap);
                    c197368o7.A0C.A00.A8h(c179427xs, 0);
                }
            }
        });
    }

    public final void A0A(InterfaceC1809480w interfaceC1809480w) {
        this.A0C.A00.EWA(interfaceC1809480w, this.A0E.A09);
    }

    public final void A0B(InterfaceC1809480w interfaceC1809480w) {
        C197418oC c197418oC = this.A0F;
        this.A0C.A00.EWA(interfaceC1809480w, c197418oC.A09);
        InterfaceC1809280u interfaceC1809280u = this.A0H;
        C197788op c197788op = c197418oC.A02;
        if (c197788op != null) {
            c197788op.A05 = interfaceC1809280u;
        }
        this.A0B.AkA().ESc("MediaGraphInput");
    }

    public final void A0D(String str, String str2, Throwable th) {
        this.A0B.CkW(new AbstractC223559ty(str, th, 31000), "media_pipeline_error", "FilterRendererSessionImpl", "high", str2, null, hashCode());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.8rk, java.lang.Object] */
    public C197368o7(C199518rz c199518rz, C178747wm c178747wm, InterfaceC178407wE interfaceC178407wE, C179067xI c179067xI, InterfaceC197408oB interfaceC197408oB) {
        this.A0C = c179067xI;
        this.A0G = c199518rz;
        this.A0A = c178747wm;
        this.A0B = interfaceC178407wE;
        this.A0D = new C197398oA(interfaceC197408oB, this);
        this.A0F = new C197418oC(c178747wm, 0);
        this.A0E = new C197418oC(c178747wm, 1012);
    }

    public final Exception A01() {
        boolean z = false;
        if (Looper.myLooper() == ((C179027xE) this.A0C.A00).A05.A00.getLooper()) {
            z = true;
        }
        C02R.A05(z);
        C179427xs c179427xs = this.A06;
        if (c179427xs == null) {
            return new IllegalStateException("Output Frame Buffer is not set");
        }
        return c179427xs.Cmh();
    }

    public final void A0C(Runnable runnable) {
        Looper myLooper = Looper.myLooper();
        Handler handler = ((C179027xE) this.A0C.A00).A05.A00;
        if (myLooper == handler.getLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }
}
