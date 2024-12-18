package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.4vM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108974vM extends C0T6 implements InterfaceC108984vN {
    public final boolean A00;

    @Override // X.InterfaceC108984vN
    public final C108974vM Ev1() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C108974vM) && this.A00 == ((C108974vM) obj).A00);
    }

    @Override // X.InterfaceC108984vN
    public final boolean CX2() {
        return this.A00;
    }

    @Override // X.InterfaceC108984vN
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_invite_only_branding_enabled", Boolean.valueOf(this.A00));
        return new TreeUpdaterJNI("XDTIGLiveInviteOnly", AbstractC06930Yk.A0B(linkedHashMap));
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }

    public C108974vM(boolean z) {
        this.A00 = z;
    }
}
