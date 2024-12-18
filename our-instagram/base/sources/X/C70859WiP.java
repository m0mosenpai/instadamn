package X;

import android.content.Context;
import android.view.View;
import android.view.Window;
import java.util.List;

/* renamed from: X.WiP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70859WiP implements InterfaceC1818984z {
    public final View A00;
    public final View A01;
    public final Window A02;
    public final C70854WiK A03;
    public final C71035Wmq A04;

    @Override // X.InterfaceC1818984z
    public final void Eki() {
        A00(true, -16777216);
    }

    @Override // X.InterfaceC1818984z
    public final void Elu() {
        A00(true, -1291845632);
    }

    private final void A00(boolean z, int i) {
        Window window = this.A02;
        C14360o3.A0B(window, 0);
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility() & (-3);
        int i2 = systemUiVisibility | 16;
        if (z) {
            i2 = systemUiVisibility & (-17);
        }
        window.getDecorView().setSystemUiVisibility(i2);
        View view = this.A01;
        view.setBackgroundColor(i);
        view.setVisibility(0);
        this.A00.setVisibility(8);
    }

    @Override // X.InterfaceC1818984z
    public final AnonymousClass851 B9R() {
        return this.A03;
    }

    @Override // X.InterfaceC1818984z
    public final InterfaceC1810781j C0C() {
        return this.A04;
    }

    @Override // X.InterfaceC1818984z
    public final void CMm() {
        Window window = this.A02;
        C14360o3.A0B(window, 0);
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 2);
        this.A01.setVisibility(8);
        this.A00.setVisibility(0);
    }

    @Override // X.InterfaceC1818984z
    public final void CMw() {
        this.A00.setVisibility(8);
    }

    @Override // X.InterfaceC1818984z
    public final void Ela() {
        this.A00.setVisibility(0);
    }

    public C70859WiP(View view, View view2, Window window, List list, int i) {
        if (i > 0) {
            this.A02 = window;
            this.A01 = view;
            this.A00 = view2;
            this.A03 = new C70854WiK(list, i);
            this.A04 = new C71035Wmq(this);
            AbstractC13880nE.A0W(view, i);
            AbstractC13880nE.A0W(view2, i);
            return;
        }
        throw AbstractC31172DnG.A0u();
    }

    @Override // X.InterfaceC1818984z
    public final void Elf(Context context) {
        boolean A00 = AbstractC72723Nt.A00(context);
        int i = -1;
        if (A00) {
            i = -16777216;
        }
        A00(A00, i);
    }
}
