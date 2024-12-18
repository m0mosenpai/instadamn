package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.C4u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27339C4u extends CAU {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;
    public final boolean A05;

    public C27339C4u(String str, String str2, String str3, List list, boolean z) {
        C14360o3.A0B(list, 1);
        this.A04 = list;
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A05 = z;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            if (obj instanceof C29529Czh) {
                A1E.add(obj);
            }
        }
        this.A03 = A1E;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27339C4u) {
                C27339C4u c27339C4u = (C27339C4u) obj;
                if (!C14360o3.A0K(this.A04, c27339C4u.A04) || !C14360o3.A0K(this.A00, c27339C4u.A00) || !C14360o3.A0K(this.A01, c27339C4u.A01) || !C14360o3.A0K(this.A02, c27339C4u.A02) || this.A05 != c27339C4u.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A05, (((((AbstractC166987dD.A0G(this.A04) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC25227BEk.A07(this.A02)) * 31);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Active(rows=");
        A1C.append(this.A04);
        A1C.append(", metagenRequestId=");
        A1C.append(this.A00);
        A1C.append(", metagenResponseId=");
        A1C.append(this.A01);
        A1C.append(", trackingToken=");
        A1C.append(this.A02);
        A1C.append(", lockHeightWhileLoading=");
        return AbstractC25236BEt.A0a(A1C, this.A05);
    }
}
