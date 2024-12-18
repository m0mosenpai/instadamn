package X;

/* renamed from: X.2qd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC61152qd extends AbstractC52922bZ implements InterfaceC61162qe {
    public final C61182qg A00 = new C61182qg();

    @Override // X.InterfaceC61162qe
    public final C61182qg Bnn() {
        return this.A00;
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        this.A00.close();
    }
}
