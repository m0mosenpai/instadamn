package X;

import android.content.DialogInterface;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.Q8e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58772Q8e extends AbstractC52922bZ {
    public DialogInterface.OnClickListener A02;
    public SFC A03;
    public AbstractC61269Rkf A04;
    public C63291Sgr A05;
    public SH3 A06;
    public SFD A07;
    public C2GS A08;
    public C2GS A09;
    public C2GS A0A;
    public C2GS A0B;
    public C2GS A0C;
    public C2GS A0D;
    public C2GS A0E;
    public C2GS A0F;
    public CharSequence A0G;
    public Executor A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0M;
    public boolean A0N;
    public int A00 = 0;
    public boolean A0L = true;
    public int A01 = 0;

    public final int A01() {
        SH3 sh3 = this.A06;
        if (sh3 != null) {
            C63291Sgr c63291Sgr = this.A05;
            int i = sh3.A00;
            if (i == 0) {
                if (c63291Sgr == null) {
                    return 255;
                }
                return 15;
            }
            return i;
        }
        return 0;
    }

    public final void A02(int i) {
        C2GS c2gs = this.A0C;
        if (c2gs == null) {
            c2gs = AbstractC58318PtA.A0J();
            this.A0C = c2gs;
        }
        A00(c2gs, Integer.valueOf(i));
    }

    public final void A03(CharSequence charSequence) {
        C2GS c2gs = this.A0B;
        if (c2gs == null) {
            c2gs = AbstractC58318PtA.A0J();
            this.A0B = c2gs;
        }
        A00(c2gs, charSequence);
    }

    public final void A04(boolean z) {
        C2GS c2gs = this.A0F;
        if (c2gs == null) {
            c2gs = AbstractC58318PtA.A0J();
            this.A0F = c2gs;
        }
        A00(c2gs, Boolean.valueOf(z));
    }

    public static void A00(C2GS c2gs, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            c2gs.A0B(obj);
        } else {
            c2gs.A0A(obj);
        }
    }
}
