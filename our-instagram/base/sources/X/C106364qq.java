package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.4qq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106364qq extends C0T6 implements InterfaceC106374qr {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public C106364qq(String str, String str2, String str3, List list) {
        C14360o3.A0B(list, 1);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(str3, 4);
        this.A03 = list;
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    @Override // X.InterfaceC106374qr
    public final C106364qq Eqe() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C106364qq) {
                C106364qq c106364qq = (C106364qq) obj;
                if (!C14360o3.A0K(this.A03, c106364qq.A03) || !C14360o3.A0K(this.A00, c106364qq.A00) || !C14360o3.A0K(this.A01, c106364qq.A01) || !C14360o3.A0K(this.A02, c106364qq.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A03.hashCode() * 31) + this.A00.hashCode()) * 31;
        String str = this.A01;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.A02.hashCode();
    }

    @Override // X.InterfaceC106374qr
    public final List Ac6() {
        return this.A03;
    }

    @Override // X.InterfaceC106374qr
    public final String BjV() {
        return this.A00;
    }

    @Override // X.InterfaceC106374qr
    public final String C3E() {
        return this.A01;
    }

    @Override // X.InterfaceC106374qr
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAdsFeedbackInterfaceQuestion", AbstractC39731Hk1.A00(this));
    }

    @Override // X.InterfaceC106374qr
    public final String getText() {
        return this.A02;
    }
}
