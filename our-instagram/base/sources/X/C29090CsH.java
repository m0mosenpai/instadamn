package X;

import java.util.Map;

/* renamed from: X.CsH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29090CsH implements InterfaceC30930Dik {
    public final /* synthetic */ C38321qM A00;

    public C29090CsH(C38321qM c38321qM) {
        this.A00 = c38321qM;
    }

    @Override // X.InterfaceC30930Dik
    public final Map B3g() {
        String id = this.A00.getId();
        if (id != null) {
            return AbstractC06930Yk.A07(AbstractC25230BEn.A1b("thumbnailId", id));
        }
        throw AbstractC166997dE.A0g();
    }
}
