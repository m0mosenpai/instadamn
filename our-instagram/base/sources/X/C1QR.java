package X;

import java.util.Observable;

/* renamed from: X.1QR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1QR extends Observable implements InterfaceC12870lZ {
    public static C1QR A02;
    public String A00 = "";
    public boolean A01 = true;

    public final void A00(String str) {
        this.A00 = str;
        setChanged();
        notifyObservers();
    }

    public C1QR() {
        C218914p.A05(this);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-1445556409);
        this.A01 = false;
        setChanged();
        notifyObservers();
        C0f9.A0A(-1502119120, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(1369381382);
        this.A01 = true;
        setChanged();
        notifyObservers();
        C0f9.A0A(238425739, A03);
    }
}
