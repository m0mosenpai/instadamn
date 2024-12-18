package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4y2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110314y2 extends C0T6 implements InterfaceC110324y3 {
    public final String A00;
    public final String A01;

    public C110314y2(String str, String str2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // X.InterfaceC110324y3
    public final C110314y2 Evw() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C110314y2) {
                C110314y2 c110314y2 = (C110314y2) obj;
                if (!C14360o3.A0K(this.A00, c110314y2.A00) || !C14360o3.A0K(this.A01, c110314y2.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    @Override // X.InterfaceC110324y3
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTLinkedFBPage", AbstractC33714Ev2.A00(this));
    }

    @Override // X.InterfaceC110324y3
    public final String getId() {
        return this.A00;
    }

    @Override // X.InterfaceC110324y3
    public final String getName() {
        return this.A01;
    }
}
