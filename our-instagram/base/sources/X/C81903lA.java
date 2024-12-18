package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3lA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81903lA extends C0T6 implements InterfaceC81913lB {
    public final String A00;
    public final String A01;

    public C81903lA(String str, String str2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // X.InterfaceC81913lB
    public final C81903lA Evv() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C81903lA) {
                C81903lA c81903lA = (C81903lA) obj;
                if (!C14360o3.A0K(this.A00, c81903lA.A00) || !C14360o3.A0K(this.A01, c81903lA.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    @Override // X.InterfaceC81913lB
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTLinkedEntityUser", AbstractC31245DoT.A00(this));
    }

    @Override // X.InterfaceC81913lB
    public final String getId() {
        return this.A00;
    }

    @Override // X.InterfaceC81913lB
    public final String getUsername() {
        return this.A01;
    }
}
