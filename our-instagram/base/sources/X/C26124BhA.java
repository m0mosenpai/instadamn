package X;

import java.util.List;

/* renamed from: X.BhA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26124BhA extends C0T6 implements InterfaceC31087DlV {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public C26124BhA(String str, String str2, String str3, String str4, List list) {
        AbstractC167027dH.A0a(1, str, list, str2, str3);
        C14360o3.A0B(str4, 5);
        this.A00 = str;
        this.A04 = list;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26124BhA) {
                C26124BhA c26124BhA = (C26124BhA) obj;
                if (!C14360o3.A0K(this.A00, c26124BhA.A00) || !C14360o3.A0K(this.A04, c26124BhA.A04) || !C14360o3.A0K(this.A01, c26124BhA.A01) || !C14360o3.A0K(this.A02, c26124BhA.A02) || !C14360o3.A0K(this.A03, c26124BhA.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A03, AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0J(this.A04, AbstractC166987dD.A0J(this.A00)))));
    }
}
