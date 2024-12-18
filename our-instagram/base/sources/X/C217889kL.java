package X;

import com.instagram.user.model.User;

/* renamed from: X.9kL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217889kL extends C6RO {
    public float A00;
    public int A01;
    public QJ0 A02;
    public User A03;
    public String A04;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C217889kL(QJ0 qj0, User user, String str, float f, int i) {
        this();
        C14360o3.A0B(str, 1);
        this.A04 = str;
        this.A00 = f;
        this.A01 = i;
        this.A03 = user;
        this.A02 = qj0;
    }

    @Override // X.C5NL
    public final Integer CBq() {
        return C05F.A0D;
    }

    @Override // X.C5NL
    public final C5NG BlQ() {
        C5NG A0V = AbstractC167007dF.A0V();
        AbstractC166987dD.A1V(C148276lx.A19, A0V);
        A0V.A01(super.A00);
        return A0V;
    }

    public C217889kL() {
        this.A04 = "";
    }
}
