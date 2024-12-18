package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4k9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102724k9 extends C0T6 implements C46j {
    public final C102704k7 A00;
    public final C102704k7 A01;
    public final C102704k7 A02;

    @Override // X.C46j
    public final C102724k9 Ez3() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C102724k9) {
                C102724k9 c102724k9 = (C102724k9) obj;
                if (!C14360o3.A0K(this.A00, c102724k9.A00) || !C14360o3.A0K(this.A01, c102724k9.A01) || !C14360o3.A0K(this.A02, c102724k9.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C102704k7 c102704k7 = this.A00;
        int hashCode = (c102704k7 == null ? 0 : c102704k7.hashCode()) * 31;
        C102704k7 c102704k72 = this.A01;
        int hashCode2 = (hashCode + (c102704k72 == null ? 0 : c102704k72.hashCode())) * 31;
        C102704k7 c102704k73 = this.A02;
        return hashCode2 + (c102704k73 != null ? c102704k73.hashCode() : 0);
    }

    @Override // X.C46j
    public final /* bridge */ /* synthetic */ InterfaceC102714k8 AhS() {
        return this.A00;
    }

    @Override // X.C46j
    public final /* bridge */ /* synthetic */ InterfaceC102714k8 C5t() {
        return this.A01;
    }

    @Override // X.C46j
    public final /* bridge */ /* synthetic */ InterfaceC102714k8 C9R() {
        return this.A02;
    }

    @Override // X.C46j
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTReelMediaBackground", CDT.A00(this));
    }

    public C102724k9(C102704k7 c102704k7, C102704k7 c102704k72, C102704k7 c102704k73) {
        this.A00 = c102704k7;
        this.A01 = c102704k72;
        this.A02 = c102704k73;
    }
}
