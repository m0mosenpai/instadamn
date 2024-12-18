package X;

import android.view.Surface;

/* renamed from: X.8Lw, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8Lw extends AbstractC185778Lx implements InterfaceC185668Ll {
    public EnumC197888oz A00;
    public boolean A01;
    public InterfaceC197958p6 A02;
    public EnumC185798Lz A03;
    public final C81N A04;
    public volatile boolean A05;

    public C8Lw(C81N c81n) {
        C14360o3.A0B(c81n, 1);
        this.A04 = c81n;
        this.A03 = EnumC185798Lz.PREVIEW;
    }

    @Override // X.AbstractC185778Lx, X.InterfaceC185788Ly
    public final synchronized boolean AFZ() {
        boolean z;
        Surface A04;
        z = false;
        if (super.AFZ() && (A04 = this.A04.A04()) != null) {
            if (A04.isValid()) {
                z = true;
            }
        }
        return z;
    }

    @Override // X.InterfaceC185788Ly
    public final String BOj() {
        return "TextureViewOutput";
    }

    @Override // X.InterfaceC185788Ly
    public final synchronized void CNg(InterfaceC197958p6 interfaceC197958p6, InterfaceC197978p8 interfaceC197978p8) {
        C14360o3.A0B(interfaceC197958p6, 0);
        this.A02 = interfaceC197958p6;
        C81N c81n = this.A04;
        c81n.A08(this);
        Surface A04 = c81n.A04();
        if (A04 != null) {
            interfaceC197958p6.EpX(A04, this);
        }
    }

    @Override // X.AbstractC185778Lx, X.InterfaceC185788Ly
    public final synchronized boolean Cmi() {
        boolean Cmi;
        Cmi = super.Cmi();
        if (this.A05) {
            this.A05 = false;
            swapBuffers();
        }
        return Cmi;
    }

    @Override // X.InterfaceC185668Ll
    public final synchronized void Dr3(int i, int i2) {
        this.A05 = true;
    }

    @Override // X.InterfaceC185668Ll
    public final synchronized void Dr6(Surface surface, int i, int i2) {
        InterfaceC197958p6 interfaceC197958p6 = this.A02;
        if (interfaceC197958p6 != null) {
            interfaceC197958p6.EpX(this.A04.A04(), this);
        }
    }

    @Override // X.InterfaceC185668Ll
    public final synchronized void DrA() {
        InterfaceC197958p6 interfaceC197958p6 = this.A02;
        if (interfaceC197958p6 != null) {
            interfaceC197958p6.EpZ(this);
        }
        release();
    }

    @Override // X.InterfaceC185788Ly
    public final synchronized void destroy() {
        release();
        this.A04.A0E.A00.remove(this);
        this.A02 = null;
    }

    @Override // X.AbstractC185778Lx, X.InterfaceC185788Ly
    public final synchronized int getHeight() {
        int height;
        height = super.getHeight();
        if (height <= 0) {
            height = this.A04.A05().getHeight();
        }
        return height;
    }

    @Override // X.AbstractC185778Lx, X.InterfaceC185788Ly
    public final synchronized int getWidth() {
        int width;
        width = super.getWidth();
        if (width <= 0) {
            width = this.A04.A05().getWidth();
        }
        return width;
    }

    @Override // X.InterfaceC185788Ly
    public final EnumC197888oz BI3() {
        return this.A00;
    }

    @Override // X.InterfaceC185788Ly
    public final EnumC185798Lz CFJ() {
        return this.A03;
    }
}
