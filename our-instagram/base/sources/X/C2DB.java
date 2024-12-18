package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.2DB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2DB extends C2DC implements C2DD {
    public static C5G0 A09;
    public static boolean A0A;
    public float A00;
    public C5YV A01;
    public boolean A02;
    public final C6LO A03;
    public final C6LM A04;
    public final C6LJ A05;
    public final InterfaceC11380iw A06;
    public final ImageUrl A07;
    public final C6LI A08;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        if (r7.A01 != true) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2DB(X.InterfaceC11380iw r4, X.C6LI r5, X.C6LM r6, X.C6LJ r7, long r8) {
        /*
            r3 = this;
            r0 = 4
            X.C14360o3.A0B(r4, r0)
            r3.<init>()
            r3.A05 = r7
            r3.A04 = r6
            r3.A06 = r4
            r3.A08 = r5
            X.0do r0 = X.AbstractC74903Yf.A01
            androidx.compose.runtime.ParcelableSnapshotMutableLongState r0 = new androidx.compose.runtime.ParcelableSnapshotMutableLongState
            r0.<init>(r8)
            r3.A03 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.A00 = r0
            if (r7 == 0) goto L38
            com.instagram.common.typedurl.ImageUrl r0 = r7.A08
        L20:
            r3.A07 = r0
            if (r6 == 0) goto L37
            r2 = 1
            if (r7 == 0) goto L2d
            boolean r1 = r7.A01
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r1 == r2) goto L2e
        L2d:
            r0 = 0
        L2e:
            X.3Yl r1 = r6.A01
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.Egh(r0)
        L37:
            return
        L38:
            r0 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2DB.<init>(X.0iw, X.6LI, X.6LM, X.6LJ, long):void");
    }

    @Override // X.C2DC
    public final void A04(InterfaceC1128857w interfaceC1128857w) {
        InterfaceC137546La interfaceC137546La;
        C14360o3.A0B(interfaceC1128857w, 0);
        C6LJ c6lj = this.A05;
        if (c6lj != null && (interfaceC137546La = (InterfaceC137546La) c6lj.A02.getValue()) != null) {
            if (!this.A02) {
                this.A02 = true;
                C6LM c6lm = this.A04;
                if (c6lm != null && ((Number) c6lm.A01.getValue()).floatValue() != 1.0f) {
                    c6lm.A00 = AbstractC23641Du.A04(AnonymousClass191.A00, new MBT(c6lm, null, 34), c6lm.A02);
                }
            }
            float f = this.A00;
            C6LM c6lm2 = this.A04;
            if (c6lm2 != null) {
                f *= ((Number) c6lm2.A01.getValue()).floatValue();
            }
            if (f < 1.0f) {
                A00(interfaceC1128857w);
            }
            long Bxc = interfaceC1128857w.Bxc();
            long A00 = AbstractC119215ad.A00(C1H4.A01(C5YC.A02(Bxc)), C1H4.A01(C5YC.A00(Bxc)));
            C5YV c5yv = this.A01;
            Bitmap bitmap = ((C6LZ) interfaceC137546La).A00;
            interfaceC1128857w.AQk(c5yv, interfaceC137546La, C119815bf.A00, f, 3, 1, 0L, AbstractC119215ad.A00(bitmap.getWidth(), bitmap.getHeight()), 0L, A00);
            C5G0 c5g0 = A09;
            if (c5g0 != null) {
                AnonymousClass586 anonymousClass586 = ((AnonymousClass587) interfaceC1128857w.AzL()).A02.A02;
                Canvas A002 = AnonymousClass597.A00(anonymousClass586.A01);
                long j = anonymousClass586.A00;
                c5g0.drawOverlay(A002, C1H4.A01(C5YC.A02(j)), C1H4.A01(C5YC.A00(j)), c6lj.A00, C62Z.A00(interfaceC137546La));
                return;
            }
            return;
        }
        A00(interfaceC1128857w);
    }

    private final void A00(InterfaceC1128857w interfaceC1128857w) {
        long BPC = this.A03.BPC();
        long j = C1132359l.A01;
        float f = this.A00;
        interfaceC1128857w.AR1(this.A01, C119815bf.A00, f, 3, BPC, 0L, C62U.A00(interfaceC1128857w.Bxc(), 0L));
    }

    @Override // X.C2DC
    public final long A03() {
        InterfaceC137546La interfaceC137546La;
        C6LJ c6lj = this.A05;
        if (c6lj != null && (interfaceC137546La = (InterfaceC137546La) c6lj.A02.getValue()) != null) {
            Bitmap bitmap = ((C6LZ) interfaceC137546La).A00;
            return C5YB.A00(bitmap.getWidth(), bitmap.getHeight());
        }
        return 9205357640488583168L;
    }

    @Override // X.C2DC
    public final boolean A05(float f) {
        this.A00 = f;
        return true;
    }

    @Override // X.C2DC
    public final boolean A06(C5YV c5yv) {
        this.A01 = c5yv;
        return true;
    }

    @Override // X.C2DD
    public final void CuG() {
        AnonymousClass195 anonymousClass195;
        C6LM c6lm = this.A04;
        if (c6lm != null && (anonymousClass195 = c6lm.A00) != null) {
            anonymousClass195.AGH(null);
        }
    }

    @Override // X.C2DD
    public final void DI8() {
        AnonymousClass195 anonymousClass195;
        C6LM c6lm = this.A04;
        if (c6lm != null && (anonymousClass195 = c6lm.A00) != null) {
            anonymousClass195.AGH(null);
        }
        ImageUrl imageUrl = this.A07;
        if (imageUrl != null) {
            if (this.A08 != null) {
                InterfaceC11380iw interfaceC11380iw = this.A06;
                C14360o3.A0B(interfaceC11380iw, 1);
                C1KM.A09.A0F(imageUrl, interfaceC11380iw.getModuleName());
            }
            C43341z4 c43341z4 = AbstractC43541zP.A00;
            if (c43341z4 != null) {
                Context context = AbstractC12290kX.A00;
                C14360o3.A07(context);
                c43341z4.E0b(context, this.A06, imageUrl);
            }
        }
    }

    @Override // X.C2DD
    public final void Deh() {
        ImageUrl imageUrl = this.A07;
        if (imageUrl != null) {
            if (this.A08 != null) {
                Rect rect = new Rect(0, 0, 0, 0);
                InterfaceC11380iw interfaceC11380iw = this.A06;
                C14360o3.A0B(interfaceC11380iw, 3);
                C1KM.A09.A0C(rect, imageUrl, interfaceC11380iw.getModuleName(), null);
            }
            C43341z4 c43341z4 = AbstractC43541zP.A00;
            if (c43341z4 != null) {
                c43341z4.E0Y(new Rect(0, 0, 0, 0), this.A06, imageUrl, null);
            }
        }
    }
}
