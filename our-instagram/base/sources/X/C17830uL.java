package X;

import android.app.Activity;

/* renamed from: X.0uL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17830uL implements InterfaceC17710u8 {
    public InterfaceC17700u7 A00;
    public boolean A01 = false;
    public final InterfaceC12850lX A02 = new AbstractC18730w0() { // from class: X.0ZC
        @Override // X.AbstractC18730w0, X.InterfaceC12850lX
        public final void Cv0(Activity activity) {
            InterfaceC17700u7 interfaceC17700u7;
            C17830uL c17830uL = C17830uL.this;
            if (c17830uL.A01 && (interfaceC17700u7 = c17830uL.A00) != null) {
                interfaceC17700u7.E28(3);
            }
            c17830uL.A01 = false;
        }
    };

    @Override // X.InterfaceC17710u8
    public final void EIx() {
        this.A01 = true;
    }

    @Override // X.InterfaceC17710u8
    public final void AWP() {
        InterfaceC17700u7 interfaceC17700u7 = this.A00;
        if (interfaceC17700u7 != null) {
            interfaceC17700u7.E28(3);
        }
        this.A01 = false;
    }

    @Override // X.InterfaceC17710u8
    public final void EfQ(InterfaceC17700u7 interfaceC17700u7) {
        InterfaceC12850lX interfaceC12850lX = this.A02;
        if (interfaceC17700u7 != null) {
            AbstractC12860lY.A07(interfaceC12850lX);
        } else {
            AbstractC12860lY.A08(interfaceC12850lX);
        }
        this.A00 = interfaceC17700u7;
    }
}
