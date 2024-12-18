package X;

/* renamed from: X.J1s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43052J1s implements C1M1 {
    public final int A00;
    public final String A01;

    public C43052J1s(int i) {
        this.A00 = i;
        this.A01 = AbstractC167017dG.A0j();
    }

    @Override // X.C1M1
    public final String getSessionId() {
        int i = this.A00;
        String str = this.A01;
        if (2 - i == 0 && str == null) {
            return "";
        }
        return str;
    }

    public C43052J1s(String str) {
        this.A00 = 2;
        this.A01 = str;
    }
}
