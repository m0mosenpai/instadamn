package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.AyI, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24796AyI implements Runnable {
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ C160747Ii A01;
    public final /* synthetic */ InterfaceC16820sZ A02;

    public RunnableC24796AyI(RecyclerView recyclerView, C160747Ii c160747Ii, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = recyclerView;
        this.A01 = c160747Ii;
        this.A02 = interfaceC16820sZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A00.getContext() != null) {
            C160747Ii.A00(this.A01, this.A02);
        }
    }
}
