package X;

import java.util.List;

/* renamed from: X.GJt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36794GJt implements InterfaceC42241xE {
    public final /* synthetic */ C41761wQ A00;
    public final /* synthetic */ InterfaceC83703oF A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ InterfaceC16660sJ A03;

    public C36794GJt(C41761wQ c41761wQ, InterfaceC83703oF interfaceC83703oF, List list, InterfaceC16660sJ interfaceC16660sJ) {
        this.A02 = list;
        this.A03 = interfaceC16660sJ;
        this.A01 = interfaceC83703oF;
        this.A00 = c41761wQ;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        if (AbstractC166987dD.A1a(obj)) {
            this.A03.invoke(new C23974Ak9(EnumC92794Ds.A04, AbstractC34821FVx.A01(this.A02)));
        } else {
            this.A03.invoke(this.A01);
        }
        this.A00.A01();
    }
}
