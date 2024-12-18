package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.LGa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47946LGa {
    public int A00;
    public int A01;
    public final String A02;
    public final List A03;
    public final List A04;
    public final boolean A05;

    public C47946LGa(String str, List list, List list2, int i, boolean z) {
        this.A02 = str;
        this.A05 = z;
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A03 = A1E;
        A1E.addAll(list);
        this.A01 = i;
        this.A04 = AbstractC166987dD.A1F(list2);
        this.A00 = 0;
    }

    public final C45093JxN A00() {
        return (C45093JxN) this.A03.get(this.A00);
    }

    public final C45093JxN A01(int i) {
        if (i >= 0) {
            List list = this.A03;
            if (i < list.size()) {
                return (C45093JxN) list.get(i);
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C47946LGa(android.content.Context r7, com.instagram.common.session.UserSession r8, X.C2EC r9, java.util.List r10, int r11, boolean r12) {
        /*
            r6 = this;
            r0 = 4
            X.C14360o3.A0B(r10, r0)
            java.lang.String r1 = X.C4GQ.A07(r7, r8, r9)
            X.C14360o3.A07(r1)
            java.util.ArrayList r2 = X.AbstractC101604hV.A04(r7, r8, r9, r10)
            java.util.List r3 = r9.BSH()
            r0 = r6
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47946LGa.<init>(android.content.Context, com.instagram.common.session.UserSession, X.2EC, java.util.List, int, boolean):void");
    }
}
