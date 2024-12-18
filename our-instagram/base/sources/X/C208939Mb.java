package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9Mb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208939Mb {
    public final long A00;
    public final C191258dU A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final boolean A06;

    public C208939Mb(C191258dU c191258dU, String str, String str2, String str3, List list, long j, boolean z) {
        C14360o3.A0B(list, 3);
        this.A02 = str;
        this.A01 = c191258dU;
        this.A05 = list;
        this.A00 = j;
        this.A03 = str2;
        this.A04 = str3;
        this.A06 = z;
    }

    public final ArrayList A00() {
        String str = this.A02;
        List A1J = AbstractC166987dD.A1J(str);
        List list = this.A05;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            if (!C14360o3.A0K(obj, str)) {
                A1E.add(obj);
            }
        }
        return AbstractC001800i.A0S(A1E, A1J);
    }
}
