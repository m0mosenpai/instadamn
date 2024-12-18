package X;

/* renamed from: X.2ha, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C55912ha {
    public final int A00;
    public final int A01;
    public final long A02;

    public C55912ha(String str, String str2) {
        C14360o3.A0B(str2, 2);
        String[] strArr = (String[]) AbstractC001900j.A0R(str, new String[]{"|"}, 0).toArray(new String[0]);
        if (strArr.length == 4) {
            Integer A0j = AbstractC003100w.A0j(strArr[1], 16);
            if (A0j != null) {
                this.A01 = A0j.intValue();
                Integer A0j2 = AbstractC003100w.A0j(strArr[2], 16);
                if (A0j2 != null) {
                    this.A00 = A0j2.intValue();
                    Long A0k = AbstractC003100w.A0k(16, strArr[3]);
                    if (A0k != null) {
                        this.A02 = A0k.longValue();
                        return;
                    }
                    throw new RuntimeException(AnonymousClass001.A0u("Unable to cast token ", str, " expected CRC to long for resourceID ", str2));
                }
                throw new RuntimeException(AnonymousClass001.A0u("Unable to cast token ", str, " length to int for resourceID ", str2));
            }
            throw new RuntimeException(AnonymousClass001.A0u("Unable to cast token ", str, " position to int for resourceID ", str2));
        }
        throw new RuntimeException(AnonymousClass001.A0u("Bad bundled layout token ", str, " for resourceID ", str2));
    }
}
