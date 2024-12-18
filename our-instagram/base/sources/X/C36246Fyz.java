package X;

import java.util.ArrayList;

/* renamed from: X.Fyz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36246Fyz implements C6D2 {
    public static final C36246Fyz A00 = new C36246Fyz();

    @Override // X.C6D2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        AbstractC1351869s abstractC1351869s = (AbstractC1351869s) obj;
        C14360o3.A0A(abstractC1351869s);
        C14360o3.A0B(abstractC1351869s, 0);
        ArrayList A17 = AbstractC25225BEi.A17(abstractC1351869s.mResultSet.getCount());
        int count = abstractC1351869s.mResultSet.getCount();
        for (int i = 0; i < count; i++) {
            long j = abstractC1351869s.mResultSet.getLong(i, 0);
            String string = abstractC1351869s.mResultSet.getString(i, 1);
            C14360o3.A07(string);
            String string2 = abstractC1351869s.mResultSet.getString(i, 2);
            C14360o3.A07(string2);
            long j2 = abstractC1351869s.mResultSet.getLong(i, 3);
            String string3 = abstractC1351869s.mResultSet.getString(i, 6);
            C14360o3.A07(string3);
            int integer = abstractC1351869s.mResultSet.getInteger(i, 7);
            long j3 = abstractC1351869s.mResultSet.getLong(i, 8);
            String string4 = abstractC1351869s.mResultSet.getString(i, 9);
            String string5 = abstractC1351869s.mResultSet.getString(i, 10);
            Integer nullableInteger = abstractC1351869s.mResultSet.getNullableInteger(i, 11);
            Integer nullableInteger2 = abstractC1351869s.mResultSet.getNullableInteger(i, 12);
            Long nullableLong = abstractC1351869s.mResultSet.getNullableLong(i, 13);
            String string6 = abstractC1351869s.mResultSet.getString(i, 16);
            C14360o3.A07(string6);
            Integer nullableInteger3 = abstractC1351869s.mResultSet.getNullableInteger(i, 17);
            Integer nullableInteger4 = abstractC1351869s.mResultSet.getNullableInteger(i, 18);
            String string7 = abstractC1351869s.mResultSet.getString(i, 19);
            Integer nullableInteger5 = abstractC1351869s.mResultSet.getNullableInteger(i, 21);
            Integer nullableInteger6 = abstractC1351869s.mResultSet.getNullableInteger(i, 22);
            boolean z = abstractC1351869s.mResultSet.getBoolean(i, 23);
            Long nullableLong2 = abstractC1351869s.mResultSet.getNullableLong(i, 24);
            Integer nullableInteger7 = abstractC1351869s.mResultSet.getNullableInteger(i, 26);
            Long nullableLong3 = abstractC1351869s.mResultSet.getNullableLong(i, 28);
            String string8 = abstractC1351869s.mResultSet.getString(i, 29);
            String string9 = abstractC1351869s.mResultSet.getString(i, 30);
            Integer nullableInteger8 = abstractC1351869s.mResultSet.getNullableInteger(i, 31);
            String string10 = abstractC1351869s.mResultSet.getString(i, 32);
            String string11 = abstractC1351869s.mResultSet.getString(i, 33);
            String string12 = abstractC1351869s.mResultSet.getString(i, 34);
            String string13 = abstractC1351869s.mResultSet.getString(i, 35);
            Integer nullableInteger9 = abstractC1351869s.mResultSet.getNullableInteger(i, 36);
            Integer nullableInteger10 = abstractC1351869s.mResultSet.getNullableInteger(i, 37);
            Integer nullableInteger11 = abstractC1351869s.mResultSet.getNullableInteger(i, 38);
            String string14 = abstractC1351869s.mResultSet.getString(i, 39);
            String string15 = abstractC1351869s.mResultSet.getString(i, 40);
            boolean z2 = abstractC1351869s.mResultSet.getBoolean(i, 41);
            A17.add(new C32057E6j(nullableInteger, nullableInteger2, nullableInteger3, nullableInteger4, nullableInteger5, nullableInteger6, nullableInteger7, nullableInteger8, nullableInteger9, nullableInteger10, nullableInteger11, abstractC1351869s.mResultSet.getNullableInteger(i, 25), nullableLong, nullableLong2, nullableLong3, string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, abstractC1351869s.mResultSet.getString(i, 42), abstractC1351869s.mResultSet.getString(i, 43), integer, j, j2, j3, z, z2, abstractC1351869s.mResultSet.getBoolean(i, 44), abstractC1351869s.mResultSet.getBoolean(i, 45)));
        }
        return A17;
    }
}
