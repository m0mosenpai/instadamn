package X;

import java.util.List;

/* renamed from: X.7hU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C169547hU extends AbstractC166097bd {
    public final EnumC27402C7f A00;
    public final List A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C169547hU(EnumC27402C7f enumC27402C7f, List list) {
        super(AnonymousClass001.A0R("sort_order_selector_row", AbstractC166107be.A00(enumC27402C7f.A02)));
        C14360o3.A0B(enumC27402C7f, 2);
        this.A01 = list;
        this.A00 = enumC27402C7f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C169547hU) {
                C169547hU c169547hU = (C169547hU) obj;
                if (!C14360o3.A0K(this.A01, c169547hU.A01) || this.A00 != c169547hU.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }
}
