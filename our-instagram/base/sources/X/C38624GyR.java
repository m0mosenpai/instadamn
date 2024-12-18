package X;

import java.util.List;

/* renamed from: X.GyR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38624GyR extends C0T6 {
    public final long A00;
    public final InterfaceC43470JIi A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final List A05;

    public C38624GyR(InterfaceC43470JIi interfaceC43470JIi, String str, String str2, List list, List list2, long j) {
        C14360o3.A0B(list, 4);
        this.A01 = interfaceC43470JIi;
        this.A02 = str;
        this.A00 = j;
        this.A04 = list;
        this.A05 = list2;
        this.A03 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38624GyR) {
                C38624GyR c38624GyR = (C38624GyR) obj;
                if (!C14360o3.A0K(this.A01, c38624GyR.A01) || !C14360o3.A0K(this.A02, c38624GyR.A02) || this.A00 != c38624GyR.A00 || !C14360o3.A0K(this.A04, c38624GyR.A04) || !C14360o3.A0K(this.A05, c38624GyR.A05) || !C14360o3.A0K(this.A03, c38624GyR.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A04, AbstractC25236BEt.A01(this.A00, ((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31)) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC25227BEk.A07(this.A03);
    }
}
