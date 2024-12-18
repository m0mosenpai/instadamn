package X;

/* renamed from: X.4IQ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4IQ implements C48F {
    public java.util.Set A00;

    @Override // X.C48F
    public final boolean getBoolForContext(String str, String str2, boolean z) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        if (str2.equals("useSecondaryConnection")) {
            return this.A00.contains(str);
        }
        return z;
    }

    @Override // X.C48F
    public final boolean getGlobalBool(String str, boolean z) {
        return z;
    }

    @Override // X.C48F
    public final int getGlobalInt(String str, int i) {
        return i;
    }

    @Override // X.C48F
    public final String getGlobalString(String str, String str2) {
        C14360o3.A0B(str2, 1);
        return str2;
    }

    @Override // X.C48F
    public final String getStringForContext(String str, String str2, String str3) {
        C14360o3.A0B(str3, 2);
        return str3;
    }
}
