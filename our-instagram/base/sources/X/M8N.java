package X;

import com.instagram.api.schemas.GiphyRequestSurface;

/* loaded from: classes8.dex */
public final class M8N implements InterfaceC08830cm {
    public final /* synthetic */ C8NW A00;

    public M8N(C8NW c8nw) {
        this.A00 = c8nw;
    }

    @Override // X.InterfaceC08830cm
    public final /* bridge */ /* synthetic */ Object get() {
        if (this.A00.A05 instanceof C81V) {
            return GiphyRequestSurface.A04;
        }
        return GiphyRequestSurface.A0A;
    }
}
