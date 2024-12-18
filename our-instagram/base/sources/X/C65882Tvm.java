package X;

import com.instagram.discovery.recyclerview.ui.DiscoveryRecyclerView;

/* renamed from: X.Tvm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65882Tvm implements InterfaceC65252xN {
    public final /* synthetic */ C65823Tug A00;

    public C65882Tvm(C65823Tug c65823Tug) {
        this.A00 = c65823Tug;
    }

    @Override // X.InterfaceC65252xN
    public final void EVk(int i) {
        C65823Tug c65823Tug = this.A00;
        DiscoveryRecyclerView discoveryRecyclerView = c65823Tug.A04;
        if (discoveryRecyclerView != null) {
            discoveryRecyclerView.setPadding(discoveryRecyclerView.getPaddingLeft(), i, discoveryRecyclerView.getPaddingRight(), discoveryRecyclerView.getPaddingBottom());
        }
        InterfaceC70513Em interfaceC70513Em = c65823Tug.A07;
        if (interfaceC70513Em != null) {
            interfaceC70513Em.Eg0(i);
        }
    }
}
