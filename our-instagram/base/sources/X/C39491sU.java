package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.1sU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39491sU extends C0T6 implements InterfaceC39501sV {
    public final String A00;
    public final List A01;

    @Override // X.InterfaceC39501sV
    public final C39491sU F6d() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39491sU) {
                C39491sU c39491sU = (C39491sU) obj;
                if (!C14360o3.A0K(this.A01, c39491sU.A01) || !C14360o3.A0K(this.A00, c39491sU.A00)) {
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

    @Override // X.InterfaceC39501sV
    public final List Aq7() {
        return this.A01;
    }

    @Override // X.InterfaceC39501sV
    public final String BxF() {
        return this.A00;
    }

    @Override // X.InterfaceC39501sV
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClientInvalidationInstructionDict", AbstractC37391GdX.A00(this));
    }

    public C39491sU(List list, String str) {
        this.A01 = list;
        this.A00 = str;
    }
}
