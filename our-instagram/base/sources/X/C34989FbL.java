package X;

/* renamed from: X.FbL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34989FbL {
    public static final C34989FbL A00 = new Object();

    public final Integer A00() {
        int i = AbstractC19750y3.A01("age_verification_settings_preferences").getInt("age_verification_settings_blocked_state", 0);
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return C05F.A0C;
                }
                throw AbstractC31175DnJ.A0U("Invalid state ", i);
            }
            return C05F.A01;
        }
        return C05F.A00;
    }
}
