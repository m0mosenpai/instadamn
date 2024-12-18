package X;

import android.os.Build;
import android.view.View;
import java.util.List;

/* renamed from: X.8wt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC202138wt extends C04N implements Runnable, View.OnAttachStateChangeListener, C03L {
    public C011504d A00;
    public boolean A01;
    public boolean A02;
    public final C28428Cga A03;

    @Override // X.C04N
    public final C04M A01(C04M c04m, C04U c04u) {
        this.A01 = false;
        return c04m;
    }

    @Override // X.C04N
    public final void A03(C04U c04u) {
        this.A01 = true;
        this.A02 = true;
    }

    @Override // X.C04N
    public final void A04(C04U c04u) {
        this.A01 = false;
        this.A02 = false;
        C011504d c011504d = this.A00;
        if (c04u.A00.A07() != 0 && c011504d != null) {
            C28428Cga c28428Cga = this.A03;
            c28428Cga.A03(c011504d);
            C28745Cmd c28745Cmd = c28428Cga.A07;
            c28745Cmd.A00.Egh(AbstractC28287CdZ.A00(c011504d.A00.A05(8)));
            c28428Cga.A02(c011504d);
        }
        this.A00 = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public RunnableC202138wt(C28428Cga c28428Cga) {
        super(!c28428Cga.A0B ? 1 : 0);
        this.A03 = c28428Cga;
    }

    @Override // X.C04N
    public final C011504d A02(C011504d c011504d, List list) {
        C28428Cga c28428Cga = this.A03;
        c28428Cga.A02(c011504d);
        if (c28428Cga.A0B) {
            return C011504d.A01;
        }
        return c011504d;
    }

    @Override // X.C03L
    public final C011504d Cx7(View view, C011504d c011504d) {
        this.A00 = c011504d;
        C28428Cga c28428Cga = this.A03;
        C28745Cmd c28745Cmd = c28428Cga.A07;
        c28745Cmd.A00.Egh(AbstractC28287CdZ.A00(c011504d.A00.A05(8)));
        if (this.A01) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.A02) {
            c28428Cga.A03(c011504d);
            c28428Cga.A02(c011504d);
        }
        if (c28428Cga.A0B) {
            return C011504d.A01;
        }
        return c011504d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A01) {
            this.A01 = false;
            this.A02 = false;
            C011504d c011504d = this.A00;
            if (c011504d != null) {
                C28428Cga c28428Cga = this.A03;
                c28428Cga.A03(c011504d);
                c28428Cga.A02(c011504d);
                this.A00 = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }
}
