package X;

import java.util.ArrayList;

/* renamed from: X.LaM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48346LaM implements C6D2 {
    public final /* synthetic */ LG2 A00;

    public C48346LaM(LG2 lg2) {
        this.A00 = lg2;
    }

    @Override // X.C6D2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        AbstractC1351869s abstractC1351869s = (AbstractC1351869s) obj;
        C14360o3.A0B(abstractC1351869s, 0);
        LG2 lg2 = this.A00;
        int A02 = AbstractC43592JPx.A02(abstractC1351869s);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (int i = 0; i < A02; i++) {
            Integer num = C05F.A0C;
            String string = abstractC1351869s.mResultSet.getString(i, 2);
            C14360o3.A07(string);
            A1E.add(new C45038JwT(num, string, abstractC1351869s.mResultSet.getString(i, 1), 0.0d, (int) abstractC1351869s.mResultSet.getLong(i, 4)));
        }
        lg2.A00(A1E);
        return C0eB.A00;
    }
}
