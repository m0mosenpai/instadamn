package X;

import java.util.List;

/* renamed from: X.MsH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51686MsH extends C0T6 {
    public final List A00;

    public C51686MsH(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C51686MsH) && C14360o3.A0K(this.A00, ((C51686MsH) obj).A00));
    }

    public final int hashCode() {
        return (AbstractC166987dD.A0G(this.A00) * 31) + AbstractC53644Nnp.A00();
    }

    public C51686MsH() {
        this(C16930sl.A00);
    }
}
