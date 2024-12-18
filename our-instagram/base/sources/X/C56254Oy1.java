package X;

/* renamed from: X.Oy1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56254Oy1 implements MOU {
    public final /* synthetic */ C52778NXk A00;

    public C56254Oy1(C52778NXk c52778NXk) {
        this.A00 = c52778NXk;
    }

    @Override // X.MOU
    public final void DSp() {
        C52778NXk c52778NXk = this.A00;
        C56255Oy2 c56255Oy2 = c52778NXk.A00;
        if (c56255Oy2 == null) {
            C14360o3.A0F("settingsController");
            throw C00O.createAndThrow();
        }
        c52778NXk.setItems(c56255Oy2.A0G);
    }
}
