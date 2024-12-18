package X;

/* renamed from: X.5C6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5C6 implements C5C7 {
    public final /* synthetic */ InterfaceC16660sJ A00;
    public final /* synthetic */ InterfaceC16620sF A01;

    public C5C6(InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF) {
        this.A01 = interfaceC16620sF;
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.C5C7
    public final Object EKR(Object obj) {
        return this.A00.invoke(obj);
    }

    @Override // X.C5C7
    public final Object ELY(C6MR c6mr, Object obj) {
        return this.A01.invoke(c6mr, obj);
    }
}
