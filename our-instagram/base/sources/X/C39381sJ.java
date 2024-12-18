package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.1sJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39381sJ extends C0T6 implements InterfaceC39391sK {
    public final InterfaceC39371sI A00;
    public final InterfaceC87603vS A01;

    @Override // X.InterfaceC39391sK
    public final C39381sJ Eug() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39381sJ) {
                C39381sJ c39381sJ = (C39381sJ) obj;
                if (!C14360o3.A0K(this.A00, c39381sJ.A00) || !C14360o3.A0K(this.A01, c39381sJ.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        InterfaceC39371sI interfaceC39371sI = this.A00;
        int hashCode = (interfaceC39371sI == null ? 0 : interfaceC39371sI.hashCode()) * 31;
        InterfaceC87603vS interfaceC87603vS = this.A01;
        return hashCode + (interfaceC87603vS != null ? interfaceC87603vS.hashCode() : 0);
    }

    @Override // X.InterfaceC39391sK
    public final InterfaceC39371sI AiT() {
        return this.A00;
    }

    @Override // X.InterfaceC39391sK
    public final InterfaceC87603vS Bca() {
        return this.A01;
    }

    @Override // X.InterfaceC39391sK
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGIABInfo", AbstractC37399Gdf.A00(this));
    }

    public C39381sJ(InterfaceC39371sI interfaceC39371sI, InterfaceC87603vS interfaceC87603vS) {
        this.A00 = interfaceC39371sI;
        this.A01 = interfaceC87603vS;
    }
}
