package X;

import android.graphics.Paint;
import android.graphics.PathEffect;
import java.util.List;

/* renamed from: X.580, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass580 implements InterfaceC1128857w {
    public C5AO A00;
    public C5AO A01;
    public final AnonymousClass586 A02;
    public final AnonymousClass588 A03;

    @Override // X.InterfaceC1128857w
    public final void AQZ(C6L5 c6l5, C5YV c5yv, AbstractC119825bg abstractC119825bg, float f, float f2, float f3, int i, long j, long j2, boolean z) {
        AnonymousClass585 anonymousClass585 = this.A02.A01;
        float A01 = C119365at.A01(j);
        float A02 = C119365at.A02(j);
        anonymousClass585.AQY(A00(c6l5, null, abstractC119825bg, 1.0f, 3, 1), A01, A02, A01 + C5YC.A02(j2), A02 + C5YC.A00(j2), f, f2, false);
    }

    @Override // X.InterfaceC1128857w
    public final void AQd(C6L5 c6l5, C5YV c5yv, AbstractC119825bg abstractC119825bg, float f, float f2, int i, long j) {
        this.A02.A01.AQc(A00(c6l5, null, abstractC119825bg, f2, i, 1), f, j);
    }

    @Override // X.InterfaceC1128857w
    public final void AQr(C6L5 c6l5, C5YV c5yv, InterfaceC72011XEz interfaceC72011XEz, float f, float f2, int i, int i2, long j, long j2) {
        this.A02.A01.AQt(A01(c6l5, this, f, f2, 0), j, j2);
    }

    @Override // X.InterfaceC1128857w
    public final void AQs(C5YV c5yv, InterfaceC72011XEz interfaceC72011XEz, float f, float f2, int i, int i2, long j, long j2, long j3) {
        AnonymousClass585 anonymousClass585 = this.A02.A01;
        C5AO c5ao = this.A01;
        C5AO c5ao2 = c5ao;
        if (c5ao == null) {
            C5AN c5an = new C5AN();
            c5an.A01.setStyle(Paint.Style.STROKE);
            this.A01 = c5an;
            c5ao2 = c5an;
        }
        C5AN c5an2 = (C5AN) c5ao2;
        long color = c5an2.A01.getColor() << 32;
        long j4 = C1132359l.A01;
        if (color != j) {
            c5ao2.ERg(j);
        }
        if (c5an2.A02 != null) {
            c5an2.A02 = null;
            c5an2.A01.setShader(null);
        }
        if (!C14360o3.A0K(c5an2.A03, null)) {
            c5ao2.ERj(null);
        }
        if (c5an2.A00 != 3) {
            c5ao2.EQM(3);
        }
        if (c5an2.A01.getStrokeWidth() != f) {
            c5an2.A01.setStrokeWidth(f);
        }
        if (c5an2.A01.getStrokeMiter() != 4.0f) {
            c5an2.A01.setStrokeMiter(4.0f);
        }
        if (c5ao2.C30() != i) {
            c5ao2.Ef2(i);
        }
        if (c5ao2.C32() != 0) {
            c5an2.A01.setStrokeJoin(Paint.Join.MITER);
        }
        if (!C14360o3.A0K(c5an2.A04, null)) {
            c5an2.A01.setPathEffect(null);
            c5an2.A04 = null;
        }
        if (!c5an2.A01.isFilterBitmap()) {
            c5an2.A01.setFilterBitmap(true);
        }
        anonymousClass585.AQt(c5ao2, j2, j3);
    }

    @Override // X.InterfaceC1128857w
    public final void AQv(C6L5 c6l5, C5YV c5yv, C60Y c60y, AbstractC119825bg abstractC119825bg, float f, int i) {
        this.A02.A01.AQu(A00(c6l5, null, abstractC119825bg, f, i, 1), c60y);
    }

    @Override // X.InterfaceC1128857w
    public final void AQx(C6L5 c6l5, C5YV c5yv, InterfaceC72011XEz interfaceC72011XEz, List list, float f, float f2, int i, int i2, int i3) {
        this.A02.A01.AQy(A01(c6l5, this, f, f2, 1), list, i);
    }

    @Override // X.InterfaceC1128857w
    public final void AR0(C6L5 c6l5, C5YV c5yv, AbstractC119825bg abstractC119825bg, float f, int i, long j, long j2) {
        AnonymousClass585 anonymousClass585 = this.A02.A01;
        float A01 = C119365at.A01(j);
        float A02 = C119365at.A02(j);
        anonymousClass585.AQz(A00(c6l5, null, abstractC119825bg, f, i, 1), A01, A02, A01 + C5YC.A02(j2), A02 + C5YC.A00(j2));
    }

    @Override // X.InterfaceC1128857w
    public final void AR1(C5YV c5yv, AbstractC119825bg abstractC119825bg, float f, int i, long j, long j2, long j3) {
        AnonymousClass585 anonymousClass585 = this.A02.A01;
        float A01 = C119365at.A01(j2);
        float A02 = C119365at.A02(j2);
        anonymousClass585.AQz(A02(c5yv, abstractC119825bg, f, i, j), A01, A02, A01 + C5YC.A02(j3), A02 + C5YC.A00(j3));
    }

    @Override // X.InterfaceC1128857w
    public final void AR3(C6L5 c6l5, C5YV c5yv, AbstractC119825bg abstractC119825bg, float f, int i, long j, long j2, long j3) {
        AnonymousClass585 anonymousClass585 = this.A02.A01;
        float A01 = C119365at.A01(j);
        float A02 = C119365at.A02(j);
        float A022 = A01 + C5YC.A02(j2);
        float A00 = A02 + C5YC.A00(j2);
        long j4 = AbstractC137646Lk.A00;
        anonymousClass585.AR2(A00(c6l5, null, abstractC119825bg, f, i, 1), A01, A02, A022, A00, Float.intBitsToFloat((int) (j3 >> 32)), AbstractC137646Lk.A00(j3));
    }

    @Override // X.InterfaceC1128857w
    public final void AR4(C5YV c5yv, AbstractC119825bg abstractC119825bg, float f, int i, long j, long j2, long j3, long j4) {
        AnonymousClass585 anonymousClass585 = this.A02.A01;
        float A01 = C119365at.A01(j2);
        float A02 = C119365at.A02(j2);
        float A022 = A01 + C5YC.A02(j3);
        float A00 = A02 + C5YC.A00(j3);
        long j5 = AbstractC137646Lk.A00;
        anonymousClass585.AR2(A02(null, abstractC119825bg, f, 3, j), A01, A02, A022, A00, Float.intBitsToFloat((int) (j4 >> 32)), AbstractC137646Lk.A00(j4));
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ int EL8(float f) {
        return AbstractC119105aS.A01(this, f);
    }

    @Override // X.C57y
    public final /* synthetic */ float EqG(long j) {
        return AbstractC122655h0.A00(this, j);
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ float EqI(int i) {
        return i / Awk();
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ long EqJ(long j) {
        return AbstractC119105aS.A03(this, j);
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ float EqS(long j) {
        return AbstractC119105aS.A00(this, j);
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ long F7k(long j) {
        return AbstractC119105aS.A04(this, j);
    }

    @Override // X.C57y
    public final /* synthetic */ long F7l(float f) {
        return AbstractC122655h0.A01(this, f);
    }

    public static final C5AO A01(C6L5 c6l5, AnonymousClass580 anonymousClass580, float f, float f2, int i) {
        C5AO c5ao = anonymousClass580.A01;
        C5AO c5ao2 = c5ao;
        if (c5ao == null) {
            C5AN c5an = new C5AN();
            c5an.A01.setStyle(Paint.Style.STROKE);
            anonymousClass580.A01 = c5an;
            c5ao2 = c5an;
        }
        if (c6l5 != null) {
            c6l5.A00(c5ao2, f2, anonymousClass580.Bxc());
        } else if (((C5AN) c5ao2).A01.getAlpha() / 255.0f != f2) {
            c5ao2.EPa(f2);
        }
        C5AN c5an2 = (C5AN) c5ao2;
        if (!C14360o3.A0K(c5an2.A03, null)) {
            c5ao2.ERj(null);
        }
        if (c5an2.A00 != 3) {
            c5ao2.EQM(3);
        }
        if (c5an2.A01.getStrokeWidth() != f) {
            c5an2.A01.setStrokeWidth(f);
        }
        if (c5an2.A01.getStrokeMiter() != 4.0f) {
            c5an2.A01.setStrokeMiter(4.0f);
        }
        if (c5ao2.C30() != i) {
            c5ao2.Ef2(i);
        }
        if (c5ao2.C32() != 0) {
            c5an2.A01.setStrokeJoin(Paint.Join.MITER);
        }
        if (!C14360o3.A0K(c5an2.A04, null)) {
            c5an2.A01.setPathEffect(null);
            c5an2.A04 = null;
        }
        if (!c5an2.A01.isFilterBitmap()) {
            c5an2.A01.setFilterBitmap(true);
        }
        return c5ao2;
    }

    private final C5AO A03(AbstractC119825bg abstractC119825bg) {
        PathEffect pathEffect;
        Paint.Join join;
        if (C14360o3.A0K(abstractC119825bg, C119815bf.A00)) {
            C5AO c5ao = this.A00;
            if (c5ao == null) {
                C5AN c5an = new C5AN();
                c5an.A01.setStyle(Paint.Style.FILL);
                this.A00 = c5an;
                return c5an;
            }
            return c5ao;
        }
        if (abstractC119825bg instanceof C62V) {
            C5AO c5ao2 = this.A01;
            C5AO c5ao3 = c5ao2;
            if (c5ao2 == null) {
                C5AN c5an2 = new C5AN();
                c5an2.A01.setStyle(Paint.Style.STROKE);
                this.A01 = c5an2;
                c5ao3 = c5an2;
            }
            C5AN c5an3 = (C5AN) c5ao3;
            float strokeWidth = c5an3.A01.getStrokeWidth();
            C62V c62v = (C62V) abstractC119825bg;
            float f = c62v.A01;
            if (strokeWidth != f) {
                c5an3.A01.setStrokeWidth(f);
            }
            int C30 = c5ao3.C30();
            int i = c62v.A02;
            if (C30 != i) {
                c5ao3.Ef2(i);
            }
            float strokeMiter = c5an3.A01.getStrokeMiter();
            float f2 = c62v.A00;
            if (strokeMiter != f2) {
                c5an3.A01.setStrokeMiter(f2);
            }
            int C32 = c5ao3.C32();
            int i2 = c62v.A03;
            if (C32 != i2) {
                Paint paint = c5an3.A01;
                if (i2 == 0) {
                    join = Paint.Join.MITER;
                } else {
                    join = Paint.Join.ROUND;
                }
                paint.setStrokeJoin(join);
            }
            InterfaceC72011XEz interfaceC72011XEz = c5an3.A04;
            InterfaceC72011XEz interfaceC72011XEz2 = c62v.A04;
            if (C14360o3.A0K(interfaceC72011XEz, interfaceC72011XEz2)) {
                return c5ao3;
            }
            Paint paint2 = c5an3.A01;
            C28803CnZ c28803CnZ = (C28803CnZ) interfaceC72011XEz2;
            if (c28803CnZ != null) {
                pathEffect = c28803CnZ.A00;
            } else {
                pathEffect = null;
            }
            paint2.setPathEffect(pathEffect);
            c5an3.A04 = interfaceC72011XEz2;
            return c5ao3;
        }
        throw new RuntimeException();
    }

    @Override // X.InterfaceC1128857w
    public final void AQa(C5YV c5yv, AbstractC119825bg abstractC119825bg, float f, float f2, float f3, int i, long j, long j2, long j3, boolean z) {
        AnonymousClass585 anonymousClass585 = this.A02.A01;
        float A01 = C119365at.A01(j2);
        float A02 = C119365at.A02(j2);
        anonymousClass585.AQY(A02(null, abstractC119825bg, 1.0f, 3, j), A01, A02, A01 + C5YC.A02(j3), A02 + C5YC.A00(j3), f, f2, z);
    }

    @Override // X.InterfaceC1128857w
    public final void AQe(C5YV c5yv, AbstractC119825bg abstractC119825bg, float f, float f2, int i, long j, long j2) {
        this.A02.A01.AQc(A02(null, abstractC119825bg, 1.0f, i, j), f, j2);
    }

    @Override // X.InterfaceC1128857w
    public final void AQk(C5YV c5yv, InterfaceC137546La interfaceC137546La, AbstractC119825bg abstractC119825bg, float f, int i, int i2, long j, long j2, long j3, long j4) {
        this.A02.A01.AQn(interfaceC137546La, A00(null, c5yv, abstractC119825bg, f, i, i2), 0L, j2, j3, j4);
    }

    @Override // X.InterfaceC1128857w
    public final void AQm(C5YV c5yv, InterfaceC137546La interfaceC137546La, AbstractC119825bg abstractC119825bg, float f, int i, long j) {
        this.A02.A01.AQl(interfaceC137546La, A00(null, c5yv, abstractC119825bg, 1.0f, 3, 1), 0L);
    }

    @Override // X.InterfaceC1128857w
    public final void AQw(C5YV c5yv, C60Y c60y, AbstractC119825bg abstractC119825bg, float f, int i, long j) {
        this.A02.A01.AQu(A02(null, abstractC119825bg, 1.0f, 3, j), c60y);
    }

    @Override // X.InterfaceC1128857w
    public final /* synthetic */ long Amh() {
        return C5YB.A01(((AnonymousClass587) this.A03).A02.A02.A00);
    }

    @Override // X.InterfaceC1128957x
    public final float Awk() {
        return this.A02.A02.Awk();
    }

    @Override // X.InterfaceC1128857w
    public final AnonymousClass588 AzL() {
        return this.A03;
    }

    @Override // X.C57y
    public final float B7e() {
        return this.A02.A02.B7e();
    }

    @Override // X.InterfaceC1128857w
    public final /* synthetic */ long Bxc() {
        return ((AnonymousClass587) this.A03).A02.A02.A00;
    }

    @Override // X.InterfaceC1128857w
    public final AnonymousClass583 getLayoutDirection() {
        return this.A02.A03;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.586, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.585, java.lang.Object] */
    public AnonymousClass580() {
        InterfaceC1128957x interfaceC1128957x = AnonymousClass581.A00;
        AnonymousClass583 anonymousClass583 = AnonymousClass583.Ltr;
        ?? obj = new Object();
        ?? obj2 = new Object();
        obj2.A02 = interfaceC1128957x;
        obj2.A03 = anonymousClass583;
        obj2.A01 = obj;
        obj2.A00 = 0L;
        this.A02 = obj2;
        this.A03 = new AnonymousClass587(this);
    }

    private final C5AO A00(C6L5 c6l5, C5YV c5yv, AbstractC119825bg abstractC119825bg, float f, int i, int i2) {
        C5AO A03 = A03(abstractC119825bg);
        if (c6l5 != null) {
            c6l5.A00(A03, f, Bxc());
        } else {
            C5AN c5an = (C5AN) A03;
            if (c5an.A02 != null) {
                c5an.A02 = null;
                c5an.A01.setShader(null);
            }
            long color = c5an.A01.getColor() << 32;
            long j = C1132359l.A01;
            if (color != j) {
                A03.ERg(j);
            }
            if (c5an.A01.getAlpha() / 255.0f != f) {
                A03.EPa(f);
            }
        }
        C5AN c5an2 = (C5AN) A03;
        if (!C14360o3.A0K(c5an2.A03, c5yv)) {
            A03.ERj(c5yv);
        }
        if (c5an2.A00 != i) {
            A03.EQM(i);
        }
        int i3 = 1;
        if (!c5an2.A01.isFilterBitmap()) {
            i3 = 0;
        }
        if (i3 != i2) {
            Paint paint = c5an2.A01;
            boolean z = false;
            if (i2 == 0) {
                z = true;
            }
            paint.setFilterBitmap(!z);
        }
        return A03;
    }

    private final C5AO A02(C5YV c5yv, AbstractC119825bg abstractC119825bg, float f, int i, long j) {
        C5AO A03 = A03(abstractC119825bg);
        if (f != 1.0f) {
            j = C5AC.A02(AbstractC1132459m.A0K[(int) (j & 63)], C1132359l.A03(j), C1132359l.A02(j), C1132359l.A01(j), C1132359l.A00(j) * f);
        }
        C5AN c5an = (C5AN) A03;
        long color = c5an.A01.getColor() << 32;
        long j2 = C1132359l.A01;
        if (color != j) {
            A03.ERg(j);
        }
        if (c5an.A02 != null) {
            c5an.A02 = null;
            c5an.A01.setShader(null);
        }
        if (!C14360o3.A0K(c5an.A03, c5yv)) {
            A03.ERj(c5yv);
        }
        if (c5an.A00 != i) {
            A03.EQM(i);
        }
        if (!c5an.A01.isFilterBitmap()) {
            c5an.A01.setFilterBitmap(true);
        }
        return A03;
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ float EqH(float f) {
        return f / Awk();
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ float EqT(float f) {
        return f * Awk();
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ long F7m(float f) {
        return F7l(EqH(f));
    }
}
