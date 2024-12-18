package X;

import android.view.Choreographer;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2tl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63082tl {
    public static final InterfaceC09390do A0B = AbstractC09440dt.A01(C63092tm.A00);
    public long A00;
    public boolean A01;
    public float A02;
    public int A03;
    public final Choreographer.FrameCallback A04;
    public final C63072tk A05;
    public final C0UO A06;
    public final C63102tn A07;
    public final InterfaceC63062tj A08;
    public final C63122tp A09;
    public final boolean A0A;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2tp] */
    public C63082tl(C63102tn c63102tn, InterfaceC63062tj interfaceC63062tj, C63072tk c63072tk, C0UO c0uo, boolean z) {
        C14360o3.A0B(c63102tn, 2);
        this.A05 = c63072tk;
        this.A07 = c63102tn;
        this.A06 = c0uo;
        this.A08 = interfaceC63062tj;
        this.A0A = z;
        this.A04 = new Choreographer.FrameCallback() { // from class: X.2to
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                C63082tl c63082tl = C63082tl.this;
                C63082tl.A00(c63082tl, c63082tl.A00, j);
                if (c63082tl.A01) {
                    C63072tk c63072tk2 = c63082tl.A05;
                    c63072tk2.A00.postFrameCallback(c63082tl.A04);
                }
            }
        };
        this.A09 = new Object() { // from class: X.2tp
        };
    }

    public static final void A00(C63082tl c63082tl, long j, long j2) {
        float f;
        if (j != j2) {
            float nanos = (float) TimeUnit.SECONDS.toNanos(1L);
            C0UO c0uo = c63082tl.A06;
            int A01 = C1H4.A01(((float) (j2 - j)) / (nanos / ((Number) c0uo.getValue()).floatValue())) - 1;
            if (A01 < 0) {
                A01 = 0;
            } else if (A01 > 100) {
                A01 = 100;
            }
            c63082tl.A03 += A01;
            float f2 = c63082tl.A02;
            float f3 = A01;
            if (f3 >= 4.0f) {
                f = f3 / 4.0f;
            } else {
                f = 0.0f;
            }
            c63082tl.A02 = f2 + f;
            c63082tl.A00 = j2;
            long nanos2 = (A01 + 1) * (((float) r1.toNanos(1L)) / ((Number) c0uo.getValue()).floatValue());
            InterfaceC63062tj interfaceC63062tj = c63082tl.A08;
            interfaceC63062tj.DIU(j2, nanos2);
            if (f3 >= 4.0f) {
                interfaceC63062tj.DOQ(j2, A01);
            } else {
                if (A01 <= 0) {
                    return;
                }
                interfaceC63062tj.Dn7(j2);
            }
        }
    }

    public final C63032tg A01() {
        float f;
        int i = 0;
        if (this.A01) {
            this.A01 = false;
            C63072tk c63072tk = this.A05;
            c63072tk.A00.removeFrameCallback(this.A04);
            if (this.A0A) {
                A00(this, this.A00, System.nanoTime());
            }
            i = this.A03;
            f = this.A02;
        } else {
            f = 0.0f;
        }
        return new C63032tg(i, f);
    }

    public final void A02() {
        if (!this.A01) {
            this.A03 = 0;
            this.A02 = 0.0f;
            this.A00 = System.nanoTime();
            this.A01 = true;
            C63072tk c63072tk = this.A05;
            c63072tk.A00.postFrameCallback(this.A04);
        }
    }
}
