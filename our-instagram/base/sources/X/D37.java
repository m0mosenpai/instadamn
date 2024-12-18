package X;

/* loaded from: classes5.dex */
public final /* synthetic */ class D37 implements InterfaceC14180ni, InterfaceC60152ox {
    public final /* synthetic */ InterfaceC16620sF A00;

    public D37(InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(interfaceC16620sF, 1);
        this.A00 = interfaceC16620sF;
    }

    @Override // X.InterfaceC60152ox
    public final /* synthetic */ void DOK(int i, boolean z) {
        this.A00.invoke(Integer.valueOf(i), Boolean.valueOf(z));
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC60152ox) || !(obj instanceof InterfaceC14180ni)) {
            return false;
        }
        return AbstractC167007dF.A1Y(obj, this.A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
