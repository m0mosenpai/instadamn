package X;

import android.view.View;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class U5G implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C6FG A01;
    public final /* synthetic */ C102884kP A02;
    public final /* synthetic */ C102884kP A03;
    public final /* synthetic */ Runnable A04;

    public U5G(View view, C6FG c6fg, C102884kP c102884kP, C102884kP c102884kP2, Runnable runnable) {
        this.A00 = view;
        this.A02 = c102884kP;
        this.A03 = c102884kP2;
        this.A01 = c6fg;
        this.A04 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.setTag(R.id.render_lifecycle_extension_runnable, null);
        C102884kP c102884kP = this.A02;
        InterfaceC103384lE A0A = this.A03.A0A();
        C6FX A0I = AbstractC31179DnN.A0I(c102884kP);
        C6FG c6fg = this.A01;
        A0I.A02(c6fg);
        AbstractC65702TsY.A1Q(c6fg, c102884kP, A0I, A0A);
        Runnable runnable = this.A04;
        if (runnable != null) {
            runnable.run();
        }
    }
}
