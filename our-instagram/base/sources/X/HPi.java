package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class HPi extends C17T implements InterfaceC39391sK {
    @Override // X.InterfaceC39391sK
    public final InterfaceC39371sI AiT() {
        return (InterfaceC39371sI) A05(1752479762, C39217HPa.class);
    }

    @Override // X.InterfaceC39391sK
    public final InterfaceC87603vS Bca() {
        return (InterfaceC87603vS) A05(-1164889950, HQM.class);
    }

    @Override // X.InterfaceC39391sK
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC37399Gdf.A00(this));
    }

    @Override // X.InterfaceC39391sK
    public final C39381sJ Eug() {
        C39361sH c39361sH;
        InterfaceC39371sI AiT = AiT();
        C87593vR c87593vR = null;
        if (AiT != null) {
            c39361sH = AiT.EuV();
        } else {
            c39361sH = null;
        }
        InterfaceC87603vS Bca = Bca();
        if (Bca != null) {
            c87593vR = Bca.EvM();
        }
        return new C39381sJ(c39361sH, c87593vR);
    }
}
