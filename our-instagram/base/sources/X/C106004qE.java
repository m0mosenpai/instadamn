package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.4qE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106004qE extends C0T6 implements InterfaceC104904o2 {
    public final String A00;
    public final List A01;

    @Override // X.InterfaceC104904o2
    public final C106004qE Evb() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C106004qE) {
                C106004qE c106004qE = (C106004qE) obj;
                if (!C14360o3.A0K(this.A01, c106004qE.A01) || !C14360o3.A0K(this.A00, c106004qE.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A01;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.A00;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // X.InterfaceC104904o2
    public final List AyF() {
        return this.A01;
    }

    @Override // X.InterfaceC104904o2
    public final String B9b() {
        return this.A00;
    }

    @Override // X.InterfaceC104904o2
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGTransparencyAndControlDisclaimerData", CDJ.A00(this));
    }

    public C106004qE(List list, String str) {
        this.A01 = list;
        this.A00 = str;
    }
}
