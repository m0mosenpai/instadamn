package X;

/* renamed from: X.Epq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC33419Epq {
    NONE(false, false, false),
    LOADING(true, false, false),
    LOAD_MORE(false, true, false),
    RETRY(false, false, true);

    public boolean A00;
    public boolean A01;
    public boolean A02;

    EnumC33419Epq(boolean z, boolean z2, boolean z3) {
        this.A01 = z;
        this.A00 = z2;
        this.A02 = z3;
    }
}
