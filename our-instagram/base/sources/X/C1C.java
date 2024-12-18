package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes5.dex */
public final class C1C extends C17T implements C46j {
    @Override // X.C46j
    public final InterfaceC102714k8 AhS() {
        return (InterfaceC102714k8) A05(-1383228885, C0r.class);
    }

    @Override // X.C46j
    public final InterfaceC102714k8 C5t() {
        return (InterfaceC102714k8) A05(3556653, C0r.class);
    }

    @Override // X.C46j
    public final InterfaceC102714k8 C9R() {
        return (InterfaceC102714k8) A05(115029, C0r.class);
    }

    @Override // X.C46j
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, CDT.A00(this));
    }

    @Override // X.C46j
    public final C102724k9 Ez3() {
        C102704k7 c102704k7;
        C102704k7 c102704k72;
        InterfaceC102714k8 AhS = AhS();
        C102704k7 c102704k73 = null;
        if (AhS != null) {
            c102704k7 = AhS.EwE();
        } else {
            c102704k7 = null;
        }
        InterfaceC102714k8 C5t = C5t();
        if (C5t != null) {
            c102704k72 = C5t.EwE();
        } else {
            c102704k72 = null;
        }
        InterfaceC102714k8 C9R = C9R();
        if (C9R != null) {
            c102704k73 = C9R.EwE();
        }
        return new C102724k9(c102704k7, c102704k72, c102704k73);
    }
}
