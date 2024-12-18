package X;

/* renamed from: X.Vio, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69159Vio {
    public boolean A00 = true;
    public final String A01;
    public final boolean A02;

    public C69159Vio(String str) {
        this.A01 = str;
        this.A02 = new C11L("^\\s+$").A08(str);
    }
}
