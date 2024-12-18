package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.XYh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72213XYh extends VKA {
    public static final ImmutableList A00;

    @Override // X.VKA
    public final void A00(String str) {
    }

    @Override // X.VKA
    public final boolean A01(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return A00.contains(str);
    }

    static {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        builder.add((Object) "AL");
        builder.add((Object) "AK");
        builder.add((Object) "AZ");
        builder.add((Object) "AR");
        builder.add((Object) "CA");
        builder.add((Object) "CO");
        builder.add((Object) "CT");
        builder.add((Object) "DC");
        builder.add((Object) "DE");
        builder.add((Object) "FL");
        builder.add((Object) "GA");
        builder.add((Object) "HI");
        builder.add((Object) "ID");
        builder.add((Object) "IL");
        builder.add((Object) "IN");
        builder.add((Object) "IA");
        builder.add((Object) "KS");
        builder.add((Object) "KY");
        builder.add((Object) "LA");
        builder.add((Object) "ME");
        builder.add((Object) "MD");
        builder.add((Object) "MA");
        builder.add((Object) "MI");
        builder.add((Object) "MN");
        builder.add((Object) "MS");
        builder.add((Object) "MO");
        builder.add((Object) "MT");
        builder.add((Object) "NE");
        builder.add((Object) "NV");
        builder.add((Object) "NH");
        builder.add((Object) "NJ");
        builder.add((Object) "NM");
        builder.add((Object) "NY");
        builder.add((Object) "NC");
        builder.add((Object) "ND");
        builder.add((Object) "OH");
        builder.add((Object) "OK");
        builder.add((Object) "OR");
        builder.add((Object) "PA");
        builder.add((Object) "RI");
        builder.add((Object) "SC");
        builder.add((Object) "SD");
        builder.add((Object) "TN");
        builder.add((Object) "TX");
        builder.add((Object) "UT");
        builder.add((Object) "VT");
        builder.add((Object) "VA");
        builder.add((Object) "WA");
        builder.add((Object) "WV");
        builder.add((Object) "WI");
        builder.add((Object) "WY");
        A00 = builder.build();
    }
}
