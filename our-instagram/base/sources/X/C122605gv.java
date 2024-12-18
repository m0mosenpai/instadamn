package X;

import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Shader;
import android.text.TextPaint;

/* renamed from: X.5gv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122605gv extends TextPaint {
    public int A00;
    public InterfaceC74963Ym A01;
    public C5YC A02;
    public C6L5 A03;
    public C122215gH A04;
    public C122205gG A05;
    public C5AO A06;
    public AbstractC119825bg A07;

    /* JADX WARN: Type inference failed for: r1v1, types: [X.5AO, X.5AN, java.lang.Object] */
    private final C5AO A00() {
        C5AO c5ao = this.A06;
        if (c5ao == null) {
            ?? obj = new Object();
            obj.A01 = this;
            obj.A00 = 3;
            this.A06 = obj;
            return obj;
        }
        return c5ao;
    }

    public final void A01(int i) {
        if (i != this.A00) {
            A00().EQM(i);
            this.A00 = i;
        }
    }

    public final void A02(long j) {
        if (j != 16) {
            setColor(C5AC.A00(j));
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
            setShader(null);
        }
    }

    public final void A03(C6L5 c6l5, float f, long j) {
        Shader shader;
        C5YC c5yc;
        if (c6l5 == null) {
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
            setShader(null);
            return;
        }
        if (c6l5 instanceof C6L4) {
            long j2 = ((C6L4) c6l5).A00;
            if (!Float.isNaN(f) && f < 1.0f) {
                j2 = C5AC.A02(AbstractC1132459m.A0K[(int) (j2 & 63)], C1132359l.A03(j2), C1132359l.A02(j2), C1132359l.A01(j2), C1132359l.A00(j2) * f);
            }
            A02(j2);
            return;
        }
        if (!(c6l5 instanceof C62Y)) {
            return;
        }
        if ((!C14360o3.A0K(this.A03, c6l5) || (c5yc = this.A02) == null || c5yc.A00 != j) && j != 9205357640488583168L) {
            this.A03 = c6l5;
            this.A02 = new C5YC(j);
            this.A01 = new C113775Bp(null, new C9GY(j, c6l5, 1));
        }
        C5AO A00 = A00();
        InterfaceC74963Ym interfaceC74963Ym = this.A01;
        if (interfaceC74963Ym != null) {
            shader = (Shader) interfaceC74963Ym.getValue();
        } else {
            shader = null;
        }
        C5AN c5an = (C5AN) A00;
        c5an.A02 = shader;
        c5an.A01.setShader(shader);
        VKR.A00(this, f);
    }

    public final void A04(C122215gH c122215gH) {
        if (c122215gH != null && !C14360o3.A0K(this.A04, c122215gH)) {
            this.A04 = c122215gH;
            if (c122215gH.equals(C122215gH.A03)) {
                clearShadowLayer();
                return;
            }
            C122215gH c122215gH2 = this.A04;
            float f = c122215gH2.A00;
            if (f == 0.0f) {
                f = Float.MIN_VALUE;
            }
            long j = c122215gH2.A02;
            setShadowLayer(f, C119365at.A01(j), C119365at.A02(j), C5AC.A00(c122215gH2.A01));
        }
    }

    public final void A05(AbstractC119825bg abstractC119825bg) {
        Paint.Join join;
        PathEffect pathEffect;
        if (abstractC119825bg != null && !C14360o3.A0K(this.A07, abstractC119825bg)) {
            this.A07 = abstractC119825bg;
            if (abstractC119825bg.equals(C119815bf.A00)) {
                setStyle(Paint.Style.FILL);
                return;
            }
            if (!(abstractC119825bg instanceof C62V)) {
                return;
            }
            ((C5AN) A00()).A01.setStyle(Paint.Style.STROKE);
            C5AO A00 = A00();
            C62V c62v = (C62V) abstractC119825bg;
            ((C5AN) A00).A01.setStrokeWidth(c62v.A01);
            C5AO A002 = A00();
            ((C5AN) A002).A01.setStrokeMiter(c62v.A00);
            C5AO A003 = A00();
            int i = c62v.A03;
            Paint paint = ((C5AN) A003).A01;
            if (i == 0) {
                join = Paint.Join.MITER;
            } else {
                join = Paint.Join.ROUND;
            }
            paint.setStrokeJoin(join);
            A00().Ef2(c62v.A02);
            C5AO A004 = A00();
            InterfaceC72011XEz interfaceC72011XEz = c62v.A04;
            C5AN c5an = (C5AN) A004;
            Paint paint2 = c5an.A01;
            C28803CnZ c28803CnZ = (C28803CnZ) interfaceC72011XEz;
            if (c28803CnZ != null) {
                pathEffect = c28803CnZ.A00;
            } else {
                pathEffect = null;
            }
            paint2.setPathEffect(pathEffect);
            c5an.A04 = interfaceC72011XEz;
        }
    }

    public final void A06(C122205gG c122205gG) {
        if (c122205gG != null && !C14360o3.A0K(this.A05, c122205gG)) {
            this.A05 = c122205gG;
            int i = c122205gG.A00;
            boolean z = false;
            if ((i | 1) == i) {
                z = true;
            }
            setUnderlineText(z);
            int i2 = this.A05.A00;
            boolean z2 = false;
            if ((i2 | 2) == i2) {
                z2 = true;
            }
            setStrikeThruText(z2);
        }
    }
}
