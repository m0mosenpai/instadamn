package X;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.Rei, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class EnumC61068Rei {
    public static final EnumC61068Rei A00 = new RTV();
    public static final EnumC61068Rei A01 = new EnumC61068Rei() { // from class: X.RTW
    };

    public final boolean A00() {
        Boolean bool;
        boolean z = this instanceof RTV;
        boolean z2 = C62864SUl.A00.get();
        if (z) {
            return !AbstractC167007dF.A1M(z2 ? 1 : 0);
        }
        if (z2) {
            try {
                bool = (Boolean) AbstractC50523MSb.A0R("isBoringSslFIPSBuild", Class.forName("org.conscrypt.Conscrypt"));
            } catch (Exception unused) {
                C62864SUl.A01.info("Conscrypt is not available or does not support checking for FIPS build.");
                bool = false;
            }
            if (!bool.booleanValue()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public EnumC61068Rei(String $enum$name, int $enum$ordinal) {
    }
}
