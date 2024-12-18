package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7Ii, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160747Ii implements InterfaceC13640mq {
    public RecyclerView A00;
    public final C2UU A01;

    public C160747Ii(C2UU c2uu) {
        C14360o3.A0B(c2uu, 1);
        this.A01 = c2uu;
    }

    @Override // X.InterfaceC13640mq
    public final void CzH() {
    }

    @Override // X.InterfaceC13640mq
    public final void D2i(int i, int i2) {
        A00(this, new C207099Eo(this, i, i2, 0));
    }

    @Override // X.InterfaceC13640mq
    public final void DDa() {
    }

    @Override // X.InterfaceC13640mq
    public final void DMJ(int i, int i2) {
        A00(this, new C207099Eo(this, i, i2, 1));
    }

    @Override // X.InterfaceC13640mq
    public final void DTy(int i, int i2) {
        A00(this, new C207099Eo(this, i, i2, 2));
    }

    @Override // X.InterfaceC13640mq
    public final void DfC(int i, int i2) {
        A00(this, new C207099Eo(this, i, i2, 3));
    }

    public static final void A00(C160747Ii c160747Ii, InterfaceC16820sZ interfaceC16820sZ) {
        RecyclerView recyclerView = c160747Ii.A00;
        if (recyclerView != null && recyclerView.A1D() && recyclerView.post(new RunnableC24796AyI(recyclerView, c160747Ii, interfaceC16820sZ))) {
            return;
        }
        interfaceC16820sZ.invoke();
    }
}
