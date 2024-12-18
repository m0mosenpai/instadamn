package X;

import java.util.List;

/* renamed from: X.Mqm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51594Mqm extends C0T6 {
    public final String A00;
    public final String A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51594Mqm) {
                C51594Mqm c51594Mqm = (C51594Mqm) obj;
                if (!C14360o3.A0K(this.A00, c51594Mqm.A00) || !C14360o3.A0K(this.A01, c51594Mqm.A01) || !C14360o3.A0K(this.A02, c51594Mqm.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0J(this.A00)));
    }

    public C51594Mqm(String str, String str2, List list) {
        AbstractC167027dH.A13(str, str2, list);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = list;
    }
}
