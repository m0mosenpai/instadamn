package X;

/* renamed from: X.0wb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18950wb implements C0f6 {
    public static final C18950wb A01 = new Object();
    public static C0f6 A00 = new Object();

    public static final C0f5 A00(String str, int i, boolean z) {
        return A00.AEq(Boolean.valueOf(z), str, i);
    }

    @Override // X.C0f6
    public final C0f5 AEp(String str, int i) {
        return A00.AEp(str, i);
    }

    @Override // X.C0f6
    public final void EH8(int i, String str) {
        A00.EH8(i, str);
    }

    @Override // X.C0f6
    public final /* bridge */ /* synthetic */ C0f5 AEq(Boolean bool, String str, int i) {
        return A00(str, i, bool.booleanValue());
    }

    @Override // X.C0f6
    public final /* bridge */ /* synthetic */ C0f5 AEr(Boolean bool, String str, int i, int i2) {
        return A00.AEr(Boolean.valueOf(bool.booleanValue()), str, i, i2);
    }
}
