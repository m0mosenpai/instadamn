package X;

import java.util.List;

/* renamed from: X.7hF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C169417hF extends C0T6 implements InterfaceC169427hG {
    public final Integer A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C169417hF) {
                C169417hF c169417hF = (C169417hF) obj;
                if (!C14360o3.A0K(this.A00, c169417hF.A00) || !C14360o3.A0K(this.A01, c169417hF.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A00;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.A01;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public C169417hF(Integer num, List list) {
        this.A00 = num;
        this.A01 = list;
    }

    @Override // X.InterfaceC169427hG
    public final InterfaceC169427hG E8j(C1DY c1dy) {
        return this;
    }
}
