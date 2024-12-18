package X;

/* renamed from: X.Sve, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63903Sve implements InterfaceC65334TiF {
    public final /* synthetic */ C62411SAl A00;
    public final /* synthetic */ C61694RsB A01;

    public C63903Sve(C62411SAl c62411SAl, C61694RsB c61694RsB) {
        this.A01 = c61694RsB;
        this.A00 = c62411SAl;
    }

    @Override // X.InterfaceC65334TiF
    public final void onLog(String str) {
        C62698SMm c62698SMm;
        if (!AbstractC116315Ok.A00(str) && str.startsWith("IXLoadingListenerDomContentLoaded:") && (c62698SMm = this.A00.A00.A00) != null) {
            c62698SMm.A00.execute(new TJY(c62698SMm));
        }
    }
}
