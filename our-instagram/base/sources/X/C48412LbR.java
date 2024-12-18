package X;

import java.util.ArrayList;

/* renamed from: X.LbR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48412LbR implements C6D2 {
    public static final C48412LbR A00 = new C48412LbR();

    @Override // X.C6D2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        AbstractC1351869s abstractC1351869s = (AbstractC1351869s) obj;
        C14360o3.A0A(abstractC1351869s);
        C14360o3.A0B(abstractC1351869s, 0);
        ArrayList A17 = AbstractC25225BEi.A17(AbstractC43592JPx.A02(abstractC1351869s));
        int A02 = AbstractC43592JPx.A02(abstractC1351869s);
        for (int i = 0; i < A02; i++) {
            long j = abstractC1351869s.mResultSet.getLong(i, 0);
            long j2 = abstractC1351869s.mResultSet.getLong(i, 1);
            String string = abstractC1351869s.mResultSet.getString(i, 2);
            C14360o3.A07(string);
            A17.add(new C45070Jwz(abstractC1351869s.mResultSet.getNullableInteger(i, 5), abstractC1351869s.mResultSet.getNullableLong(i, 3), abstractC1351869s.mResultSet.getNullableLong(i, 6), abstractC1351869s.mResultSet.getNullableLong(i, 7), string, abstractC1351869s.mResultSet.getString(i, 4), abstractC1351869s.mResultSet.getString(i, 8), abstractC1351869s.mResultSet.getString(i, 9), abstractC1351869s.mResultSet.getString(i, 10), j, j2));
        }
        return A17;
    }
}
