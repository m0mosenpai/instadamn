package X;

import java.util.List;

/* renamed from: X.Lxs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49723Lxs implements InterfaceC42241xE {
    public final /* synthetic */ C41761wQ A00;
    public final /* synthetic */ C7YG A01;
    public final /* synthetic */ InterfaceC83703oF A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ InterfaceC16660sJ A04;
    public final /* synthetic */ boolean A05;

    public C49723Lxs(C41761wQ c41761wQ, C7YG c7yg, InterfaceC83703oF interfaceC83703oF, List list, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        this.A01 = c7yg;
        this.A02 = interfaceC83703oF;
        this.A03 = list;
        this.A05 = z;
        this.A04 = interfaceC16660sJ;
        this.A00 = c41761wQ;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Object A03;
        InterfaceC132965zL interfaceC132965zL = (InterfaceC132965zL) obj;
        if (interfaceC132965zL instanceof C132955zK) {
            Object A01 = AbstractC132975zM.A01(interfaceC132965zL);
            C14360o3.A07(A01);
            C46h c46h = (C46h) A01;
            if ((c46h instanceof C4JL) && (A03 = c46h.A03()) != null) {
                this.A04.invoke(A03);
                this.A00.A01();
            }
        }
        C7YG.A00(this.A01, this.A02, this.A03, this.A04, this.A05);
        this.A00.A01();
    }
}
