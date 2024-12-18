package X;

import java.util.List;

/* renamed from: X.OaC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55057OaC {
    public String A00;
    public final String A01;
    public final List A02 = AbstractC166987dD.A1E();

    public final String toString() {
        return this.A01;
    }

    public C55057OaC(String str) {
        this.A01 = str;
    }

    public C55057OaC(String str, List list) {
        this.A01 = str;
        C14360o3.A0B(list, 0);
        List list2 = this.A02;
        list2.clear();
        for (Object obj : list) {
            C14360o3.A0B(obj, 0);
            list2.add(obj);
        }
    }

    public C55057OaC(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
