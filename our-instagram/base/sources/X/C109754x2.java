package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4x2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109754x2 extends C0T6 implements InterfaceC109764x3 {
    public final String A00;
    public final String A01;

    public C109754x2(String str, String str2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // X.InterfaceC109764x3
    public final C109754x2 Ew2() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C109754x2) {
                C109754x2 c109754x2 = (C109754x2) obj;
                if (!C14360o3.A0K(this.A00, c109754x2.A00) || !C14360o3.A0K(this.A01, c109754x2.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    @Override // X.InterfaceC109764x3
    public final String AjA() {
        return this.A00;
    }

    @Override // X.InterfaceC109764x3
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTLiveUserPayPinnedRowConfig", AbstractC53781NqX.A00(this));
    }

    @Override // X.InterfaceC109764x3
    public final String getDescription() {
        return this.A01;
    }
}
