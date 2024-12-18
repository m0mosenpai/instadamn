package X;

import android.graphics.Point;
import android.util.SparseArray;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.8qH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC198678qH implements InterfaceC179077xJ, InterfaceC179087xK {
    public C81D A00;
    public final C178747wm A01;

    private C81D A00(InterfaceC180227zC interfaceC180227zC, C178907x2 c178907x2) {
        InterfaceC1809680y interfaceC1809680y;
        boolean z = this instanceof C198658qF;
        if (z) {
            interfaceC1809680y = ((C198658qF) this).A07;
        } else if (this instanceof C199748sQ) {
            interfaceC1809680y = ((C199748sQ) this).A04;
        } else if (this instanceof C212469bF) {
            interfaceC1809680y = ((C212469bF) this).A06;
        } else {
            interfaceC1809680y = ((C212459bE) this).A00;
        }
        C180307zK Bmp = interfaceC180227zC.Bmp();
        if ((!z || ((C198658qF) this).A0B) && Bmp.A00()) {
            C1809780z BKW = interfaceC1809680y.BKW();
            C14360o3.A0B(BKW, 0);
            if (Bmp.A00()) {
                if (Bmp.A00 != null) {
                    HashMap hashMap = Bmp.A04;
                    C81D c81d = (C81D) hashMap.get(BKW);
                    if (c81d == null) {
                        C81D AMv = interfaceC1809680y.AMv();
                        AMv.CNk(Bmp.A02);
                        AMv.ACv(Bmp.A00);
                        hashMap.put(BKW, AMv);
                        return AMv;
                    }
                    return c81d;
                }
                throw new IllegalStateException("GlContext is not available");
            }
            throw new UnsupportedOperationException("getRenderer() is not enabled");
        }
        if (this.A00 == null) {
            C81D AMv2 = interfaceC1809680y.AMv();
            this.A00 = AMv2;
            AMv2.CNk(c178907x2);
            this.A00.ACv(interfaceC180227zC);
        }
        return this.A00;
    }

    @Override // X.InterfaceC179087xK
    public final void ACv(InterfaceC180227zC interfaceC180227zC) {
    }

    @Override // X.InterfaceC179077xJ
    public final int AlT() {
        return 0;
    }

    @Override // X.InterfaceC179077xJ
    public final boolean CLu() {
        return true;
    }

    @Override // X.InterfaceC179087xK
    public final void CNk(C178907x2 c178907x2) {
    }

    @Override // X.InterfaceC179077xJ
    public final void FDL(int i, Object obj) {
    }

    @Override // X.InterfaceC179087xK
    public final void release() {
    }

    @Override // X.InterfaceC179077xJ
    public final /* synthetic */ int AwF() {
        int i;
        if (this instanceof C198658qF) {
            C198658qF c198658qF = (C198658qF) this;
            if (c198658qF.A08 != null && (i = c198658qF.A00) > -1) {
                return i;
            }
            return 0;
        }
        if (this instanceof C199748sQ) {
            ArrayList arrayList = ((C199748sQ) this).A05;
            if (!arrayList.isEmpty()) {
                return ((Number) arrayList.get(0)).intValue();
            }
            return 0;
        }
        return 0;
    }

    @Override // X.InterfaceC179077xJ
    public final /* synthetic */ boolean Cbr() {
        if (!(this instanceof C198658qF) && !(this instanceof C199748sQ) && !(this instanceof C212459bE)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC179077xJ
    public final InterfaceC179467xw EGc(InterfaceC179467xw interfaceC179467xw, InterfaceC179437xt interfaceC179437xt, InterfaceC179037xF interfaceC179037xF, Long l) {
        C224209v4 c224209v4;
        int ApO;
        InterfaceC179467xw interfaceC179467xw2 = interfaceC179467xw;
        C178907x2 c178907x2 = ((C179027xE) interfaceC179037xF).A05;
        InterfaceC180227zC interfaceC180227zC = c178907x2.A0E;
        if (interfaceC180227zC != null) {
            C81D A00 = A00(interfaceC180227zC, c178907x2);
            if (this instanceof C198658qF) {
                C198658qF c198658qF = (C198658qF) this;
                return ((C199728sO) A00).A04(c198658qF.A03, interfaceC179467xw2, interfaceC179437xt, c198658qF.A08, interfaceC179037xF, l, c198658qF.A09, c198658qF.A02, c198658qF.A01, c198658qF.A04, c198658qF.A0A);
            }
            if (this instanceof C212469bF) {
                C212469bF c212469bF = (C212469bF) this;
                C199728sO c199728sO = (C199728sO) A00;
                C14360o3.A0B(c199728sO, 0);
                C14360o3.A0B(interfaceC179467xw2, 1);
                C14360o3.A0B(interfaceC179037xF, 3);
                FilterModel filterModel = c212469bF.A04;
                if (filterModel == null || c212469bF.A01 >= c212469bF.A03 || c212469bF.A00 >= c212469bF.A02) {
                    return interfaceC179467xw2;
                }
                InterfaceC199548s4 interfaceC199548s4 = c212469bF.A05;
                if (interfaceC199548s4 == null) {
                    interfaceC199548s4 = new C199518rz(false).A00(filterModel);
                    c212469bF.A05 = interfaceC199548s4;
                }
                if (interfaceC199548s4 != null) {
                    InterfaceC179467xw A04 = c199728sO.A04(interfaceC199548s4, interfaceC179467xw2, interfaceC179437xt, null, interfaceC179037xF, l, null, c212469bF.A03, c212469bF.A02, false, false);
                    C14360o3.A07(A04);
                    return A04;
                }
                throw new IllegalStateException("Required value was null.");
            }
            if (this instanceof C212459bE) {
                C212419bA c212419bA = (C212419bA) A00;
                boolean z = ((C212459bE) this).A01;
                if (interfaceC179437xt != null) {
                    if (c212419bA.A01 == null) {
                        c212419bA.A01 = new C179417xr();
                    }
                    C81F A02 = c212419bA.A02();
                    InterfaceC180227zC interfaceC180227zC2 = ((C81E) c212419bA).A00;
                    interfaceC180227zC2.getClass();
                    A02.A01(interfaceC180227zC2, interfaceC179467xw2, interfaceC179437xt, c212419bA.A01, true, true, false);
                    return interfaceC179467xw2;
                }
                if (!z && ((ApO = interfaceC179467xw2.ApO()) == 0 || ApO == 3)) {
                    C179407xq CGV = interfaceC179467xw2.CGV();
                    if (CGV == null) {
                        return interfaceC179467xw2;
                    }
                    if (CGV.A01 <= 1920 && CGV.A00 <= 1920) {
                        return interfaceC179467xw2;
                    }
                }
                C179407xq CGV2 = interfaceC179467xw2.CGV();
                if (CGV2 == null) {
                    return interfaceC179467xw2;
                }
                int i = CGV2.A01;
                int i2 = CGV2.A00;
                if (i > 1920 || i2 > 1920) {
                    if (i > i2) {
                        i2 = Math.round((i2 / 1920.0f) * 1920.0f);
                        i = 1920;
                    } else {
                        i = Math.round((i / i2) * 1920.0f);
                        i2 = 1920;
                    }
                }
                C179427xs c179427xs = c212419bA.A00;
                if (c179427xs == null) {
                    c212419bA.A00 = new C179427xs(c212419bA.A04, new C179387xo(), new C179417xr(), false);
                    ((C81E) c212419bA).A01.getClass();
                    c212419bA.A00.A03(i, i2, 0);
                    C179427xs c179427xs2 = c212419bA.A00;
                    InterfaceC180227zC interfaceC180227zC3 = ((C81E) c212419bA).A00;
                    interfaceC180227zC3.getClass();
                    c179427xs2.ACv(interfaceC180227zC3);
                } else {
                    c179427xs.A03(i, i2, 0);
                }
                C179427xs c179427xs3 = c212419bA.A00;
                C81F A022 = c212419bA.A02();
                InterfaceC180227zC interfaceC180227zC4 = ((C81E) c212419bA).A00;
                interfaceC180227zC4.getClass();
                A022.A00(interfaceC180227zC4, interfaceC179467xw2, c179427xs3);
                return c179427xs3.A0A;
            }
            C199748sQ c199748sQ = (C199748sQ) this;
            C212429bB c212429bB = (C212429bB) A00;
            C22909A8f c22909A8f = (C22909A8f) c199748sQ.A02.get(c199748sQ.AwF());
            int i3 = c199748sQ.A01;
            int i4 = c199748sQ.A00;
            synchronized (c212429bB) {
                try {
                    AbstractC1808580n.A03("LayoutMediaGraph.onRender");
                    C212449bD c212449bD = c212429bB.A01;
                    if (c212449bD == null) {
                        c212449bD = new C212449bD();
                        c212429bB.A01 = c212449bD;
                    }
                    if (c22909A8f != null && (c224209v4 = c22909A8f.A00) != null) {
                        c212449bD.A0B(c224209v4.A00, c224209v4.A03, c224209v4.A02, c224209v4.A01);
                    } else {
                        c212449bD.A0B(0.0f, 0.0f, 1.0f, 0.0f);
                    }
                    if (interfaceC179437xt != null) {
                        C81F A023 = c212429bB.A02();
                        InterfaceC180227zC interfaceC180227zC5 = ((C81E) c212429bB).A00;
                        interfaceC180227zC5.getClass();
                        A023.A01(interfaceC180227zC5, interfaceC179467xw2, interfaceC179437xt, c212429bB.A01, true, true, false);
                    } else {
                        C179427xs A002 = C212429bB.A00(c212449bD, c212429bB, i3, i4);
                        C81F A024 = c212429bB.A02();
                        InterfaceC180227zC interfaceC180227zC6 = ((C81E) c212429bB).A00;
                        interfaceC180227zC6.getClass();
                        A024.A01(interfaceC180227zC6, interfaceC179467xw2, A002, c212429bB.A01, true, true, false);
                        interfaceC179467xw2 = A002.A0A;
                    }
                } finally {
                    AbstractC1808580n.A01();
                }
            }
            return interfaceC179467xw2;
        }
        return interfaceC179467xw2;
    }

    @Override // X.InterfaceC179077xJ
    public final void EGd(InterfaceC179037xF interfaceC179037xF, Long l) {
        AbstractC179397xp abstractC179397xp;
        InterfaceC179037xF interfaceC179037xF2;
        List list;
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        C199728sO c199728sO;
        InterfaceC199548s4 interfaceC199548s4;
        InterfaceC179467xw interfaceC179467xw;
        C179407xq CGV;
        float f;
        C179027xE c179027xE = (C179027xE) interfaceC179037xF;
        C178907x2 c178907x2 = c179027xE.A05;
        InterfaceC180227zC interfaceC180227zC = c178907x2.A0E;
        if (interfaceC180227zC != null) {
            C81D A00 = A00(interfaceC180227zC, c178907x2);
            if (this instanceof C198658qF) {
                C198658qF c198658qF = (C198658qF) this;
                List list2 = c198658qF.A09;
                InterfaceC199548s4 interfaceC199548s42 = c198658qF.A03;
                int i4 = c198658qF.A02;
                int i5 = c198658qF.A01;
                boolean z3 = c198658qF.A04;
                AbstractC179397xp abstractC179397xp2 = c198658qF.A08;
                boolean z4 = c198658qF.A0A;
                i3 = c198658qF.AwF();
                abstractC179397xp = abstractC179397xp2;
                interfaceC179037xF2 = interfaceC179037xF;
                list = list2;
                i = i4;
                i2 = i5;
                z = z3;
                z2 = z4;
                c199728sO = (C199728sO) A00;
                interfaceC199548s4 = interfaceC199548s42;
            } else {
                if (this instanceof C199748sQ) {
                    C199748sQ c199748sQ = (C199748sQ) this;
                    C212429bB c212429bB = (C212429bB) A00;
                    SparseArray sparseArray = c199748sQ.A02;
                    int i6 = c199748sQ.A01;
                    int i7 = c199748sQ.A00;
                    synchronized (c212429bB) {
                        if (c212429bB.A03()) {
                            InterfaceC180227zC interfaceC180227zC2 = ((C81E) c212429bB).A00;
                            interfaceC180227zC2.getClass();
                            try {
                                if (interfaceC180227zC2.Bmp().A02()) {
                                    AbstractC1808580n.A03("LayoutMediaGraph.renderSingleInput");
                                    boolean z5 = true;
                                    if (interfaceC179037xF.B9y(0) != 1) {
                                        z5 = false;
                                    }
                                    C0J8.A07(z5);
                                    List B9z = interfaceC179037xF.B9z(0);
                                    synchronized (B9z) {
                                        try {
                                            if (!B9z.isEmpty()) {
                                                InterfaceC179437xt interfaceC179437xt = (InterfaceC179437xt) B9z.get(0);
                                                if (interfaceC179437xt != null) {
                                                    if (c212429bB.A01 == null) {
                                                        c212429bB.A01 = new C212449bD();
                                                    }
                                                    int size = c179027xE.A06.A00.size();
                                                    for (int i8 = 0; i8 < size; i8++) {
                                                        if (interfaceC179037xF.CWg(i8) && ((C22909A8f) sparseArray.get(i8)) != null) {
                                                            InterfaceC179467xw interfaceC179467xw2 = (InterfaceC179467xw) interfaceC179037xF.BHy(i8);
                                                            if (interfaceC179467xw2 != null) {
                                                                C81F A02 = c212429bB.A02();
                                                                InterfaceC180227zC interfaceC180227zC3 = ((C81E) c212429bB).A00;
                                                                interfaceC180227zC3.getClass();
                                                                A02.A01(interfaceC180227zC3, interfaceC179467xw2, interfaceC179437xt, c212429bB.A01, true, true, false);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                } else {
                                    AbstractC1808580n.A03("LayoutMediaGraph.renderMultipleInput");
                                    C212439bC c212439bC = c212429bB.A02;
                                    if (c212439bC == null) {
                                        c212439bC = new C212439bC();
                                        c212429bB.A02 = c212439bC;
                                    }
                                    C179427xs A002 = C212429bB.A00(c212439bC, c212429bB, i6, i7);
                                    int size2 = c179027xE.A06.A00.size();
                                    boolean z6 = true;
                                    for (int i9 = 0; i9 < size2; i9++) {
                                        if (interfaceC179037xF.CWg(i9)) {
                                            try {
                                                AbstractC1808580n.A03(AnonymousClass001.A0O("render ", i9));
                                                C22909A8f c22909A8f = (C22909A8f) sparseArray.get(i9);
                                                if (c22909A8f != null && (CGV = (interfaceC179467xw = (InterfaceC179467xw) interfaceC179037xF.BHy(i9)).CGV()) != null) {
                                                    c22909A8f.A03.A00 = interfaceC179467xw;
                                                    int round = Math.round(c22909A8f.A01.width() * CGV.A01);
                                                    int round2 = Math.round(c22909A8f.A01.height() * CGV.A00);
                                                    float f2 = 0.0f;
                                                    if (c22909A8f.A00 != null) {
                                                        int i10 = CGV.A01;
                                                        int i11 = CGV.A00;
                                                        C0J8.A02(Integer.valueOf(round), 0, Integer.valueOf(i10));
                                                        C0J8.A02(Integer.valueOf(round2), 0, Integer.valueOf(i11));
                                                        int i12 = (i10 - round) / 2;
                                                        int i13 = (i11 - round2) / 2;
                                                        C224209v4 c224209v4 = c22909A8f.A00;
                                                        if (c224209v4 != null) {
                                                            C197818os c197818os = c22909A8f.A03;
                                                            float f3 = c224209v4.A02;
                                                            c197818os.A00(f3 * 1.0f, f3, c224209v4.A01, i12, i13, round, round2);
                                                            f2 = c224209v4.A00;
                                                            f = c224209v4.A03;
                                                        } else {
                                                            throw new IllegalArgumentException("Crop properties should not be null");
                                                        }
                                                    } else {
                                                        c22909A8f.A03.A00(1.0f, 1.0f, 0.0f, Math.round(c22909A8f.A01.left * CGV.A01), Math.round(c22909A8f.A01.top * CGV.A00), round, round2);
                                                        f = 0.0f;
                                                    }
                                                    float f4 = i6;
                                                    int round3 = Math.round((f2 + c22909A8f.A02.left) * f4);
                                                    float f5 = i7;
                                                    int round4 = Math.round((f + c22909A8f.A02.top) * f5);
                                                    int round5 = Math.round(c22909A8f.A02.width() * f4);
                                                    int round6 = Math.round(c22909A8f.A02.height() * f5);
                                                    C212439bC c212439bC2 = c212429bB.A02;
                                                    if (c212439bC2.A02 != round3 || c212439bC2.A03 != round4 || c212439bC2.A01 != round5 || c212439bC2.A00 != round6) {
                                                        c212439bC2.A02 = round3;
                                                        c212439bC2.A03 = round4;
                                                        c212439bC2.A01 = round5;
                                                        c212439bC2.A00 = round6;
                                                        ((AbstractC179397xp) c212439bC2).A01 = true;
                                                    }
                                                    C81F A022 = c212429bB.A02();
                                                    InterfaceC180227zC interfaceC180227zC4 = ((C81E) c212429bB).A00;
                                                    interfaceC180227zC4.getClass();
                                                    A022.A01(interfaceC180227zC4, c22909A8f.A03, A002, null, z6, true, true);
                                                    z6 = false;
                                                }
                                                AbstractC1808580n.A01();
                                            } catch (Throwable th2) {
                                                AbstractC1808580n.A01();
                                                throw th2;
                                            }
                                        }
                                    }
                                    c179027xE.A07.A01(A002.A0A, null);
                                }
                                AbstractC1808580n.A01();
                            } catch (Throwable th3) {
                                AbstractC1808580n.A01();
                                throw th3;
                            }
                        }
                    }
                    return;
                }
                if (this instanceof C212469bF) {
                    C212469bF c212469bF = (C212469bF) this;
                    C199728sO c199728sO2 = (C199728sO) A00;
                    C14360o3.A0B(c199728sO2, 0);
                    C14360o3.A0B(interfaceC179037xF, 1);
                    FilterModel filterModel = c212469bF.A04;
                    if (filterModel == null || c212469bF.A01 >= c212469bF.A03 || c212469bF.A00 >= c212469bF.A02) {
                        return;
                    }
                    InterfaceC199548s4 interfaceC199548s43 = c212469bF.A05;
                    if (interfaceC199548s43 == null) {
                        interfaceC199548s43 = new C199518rz(false).A00(filterModel);
                        c212469bF.A05 = interfaceC199548s43;
                    }
                    abstractC179397xp = null;
                    if (interfaceC199548s43 != null) {
                        interfaceC179037xF2 = interfaceC179037xF;
                        list = null;
                        i = c212469bF.A03;
                        i2 = c212469bF.A02;
                        i3 = 0;
                        z = false;
                        z2 = false;
                        c199728sO = c199728sO2;
                        interfaceC199548s4 = interfaceC199548s43;
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new UnsupportedOperationException("onRender() API deprecated!");
                }
            }
            c199728sO.A06(interfaceC199548s4, abstractC179397xp, interfaceC179037xF2, l, list, i, i2, i3, z, z2);
        }
    }

    @Override // X.InterfaceC179077xJ
    public final void FBm(int i, int i2, int i3, boolean z, int i4, int i5) {
        if (this instanceof C198658qF) {
            C198658qF c198658qF = (C198658qF) this;
            c198658qF.A02 = i4;
            c198658qF.A01 = i5;
            return;
        }
        if (this instanceof C199748sQ) {
            C199748sQ c199748sQ = (C199748sQ) this;
            c199748sQ.A01 = i4;
            c199748sQ.A00 = i5;
            return;
        }
        if (!(this instanceof C212469bF)) {
            return;
        }
        C212469bF c212469bF = (C212469bF) this;
        c212469bF.A01 = i2;
        c212469bF.A00 = i3;
        float f = i2 / i3;
        int i6 = (int) (i4 / f);
        if (i6 <= i5) {
            i5 = i6;
        } else {
            i4 = (int) (i5 * f);
        }
        c212469bF.A03 = new int[]{i4, i5}[0];
        c212469bF.A02 = i5;
        if (c212469bF.A07.intValue() != 2) {
            return;
        }
        FilterModel filterModel = c212469bF.A04;
        if (!(filterModel instanceof FilterChain)) {
            return;
        }
        C14360o3.A0C(filterModel, "null cannot be cast to non-null type com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain");
        int i7 = c212469bF.A01 * 2;
        int i8 = c212469bF.A00 * 2;
        SparseArray sparseArray = ((FilterChain) filterModel).A02;
        sparseArray.put(0, new Point(i7, i8));
        sparseArray.put(1, new Point(c212469bF.A03, c212469bF.A02));
    }

    @Override // X.InterfaceC179087xK
    public final void detach() {
        C81D c81d = this.A00;
        if (c81d != null) {
            c81d.detach();
            this.A00.release();
            this.A00 = null;
        }
    }

    public AbstractC198678qH(C178747wm c178747wm) {
        this.A01 = c178747wm;
    }
}
