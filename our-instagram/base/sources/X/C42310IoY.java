package X;

/* renamed from: X.IoY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42310IoY implements InterfaceC66482zP {
    public final JWd A00;
    public final C40987IDi A01;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "upcoming-event-offsite-link-row-item";
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        JWd jWd;
        C42310IoY c42310IoY = (C42310IoY) obj;
        JWd jWd2 = this.A00;
        if (c42310IoY != null) {
            jWd = c42310IoY.A00;
        } else {
            jWd = null;
        }
        return C14360o3.A0K(jWd2, jWd);
    }

    public C42310IoY(JWd jWd, C40987IDi c40987IDi) {
        this.A00 = jWd;
        this.A01 = c40987IDi;
    }
}
