package X;

import android.widget.Adapter;

/* renamed from: X.LuT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49514LuT implements InterfaceC65242xM {
    public final /* synthetic */ Adapter A00;
    public final /* synthetic */ JWK A01;

    public C49514LuT(Adapter adapter, JWK jwk) {
        this.A01 = jwk;
        this.A00 = adapter;
    }

    @Override // X.InterfaceC65242xM
    public final Object getAdapter() {
        return this.A00;
    }

    @Override // X.InterfaceC65242xM
    public final int getCount() {
        return this.A00.getCount();
    }

    @Override // X.InterfaceC65242xM
    public final Object getItem(int i) {
        return this.A00.getItem(i);
    }
}
