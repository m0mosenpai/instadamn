package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3om, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84023om extends C0T6 implements InterfaceC84033on {
    public final InterfaceC84013ol A00;
    public final String A01;

    @Override // X.InterfaceC84033on
    public final C84023om F47() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C84023om) {
                C84023om c84023om = (C84023om) obj;
                if (!C14360o3.A0K(this.A01, c84023om.A01) || !C14360o3.A0K(this.A00, c84023om.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A01;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        InterfaceC84013ol interfaceC84013ol = this.A00;
        return hashCode + (interfaceC84013ol != null ? interfaceC84013ol.hashCode() : 0);
    }

    @Override // X.InterfaceC84033on
    public final InterfaceC84013ol Ady() {
        return this.A00;
    }

    @Override // X.InterfaceC84033on
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsAdditionalAudioInfo", AbstractC37363Gd5.A00(this));
    }

    @Override // X.InterfaceC84033on
    public final String getAdditionalAudioUsername() {
        return this.A01;
    }

    public C84023om(InterfaceC84013ol interfaceC84013ol, String str) {
        this.A01 = str;
        this.A00 = interfaceC84013ol;
    }
}
