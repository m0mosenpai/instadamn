package X;

/* renamed from: X.Tz9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66072Tz9 extends C2JS implements InterfaceC72043XIw {
    @Override // X.InterfaceC72043XIw
    public final int BQH() {
        return getCoercedIntField(0, "maximum_global_impressions");
    }

    @Override // X.InterfaceC72043XIw
    public final int BQI() {
        return getCoercedIntField(1, "maximum_impressions_per_user");
    }

    @Override // X.InterfaceC72043XIw
    public final int BH6() {
        return A00("impression_cooldown_secs");
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C94894Ou c94894Ou = C94894Ou.A00;
        return AbstractC167017dG.A0X(c94894Ou, new C4OW(c94894Ou, "maximum_global_impressions"), new C4OW(c94894Ou, "maximum_impressions_per_user"), "impression_cooldown_secs");
    }

    public C66072Tz9(int i) {
        super(i);
    }

    public C66072Tz9() {
        super(8068514);
    }
}
