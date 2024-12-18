package X;

import com.instagram.discovery.recyclerview.ui.DiscoveryRecyclerView;

/* renamed from: X.Wsk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71375Wsk implements Runnable {
    public final /* synthetic */ AbstractC67878V0j A00;

    public RunnableC71375Wsk(AbstractC67878V0j abstractC67878V0j) {
        this.A00 = abstractC67878V0j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C65823Tug c65823Tug = this.A00.A06;
        if (c65823Tug == null) {
            C14360o3.A0F("grid");
            throw C00O.createAndThrow();
        }
        DiscoveryRecyclerView discoveryRecyclerView = c65823Tug.A04;
        if (discoveryRecyclerView != null) {
            discoveryRecyclerView.requestLayout();
        }
    }
}
