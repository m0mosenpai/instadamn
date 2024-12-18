package X;

/* renamed from: X.Blj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26400Blj extends AbstractC51572Yf {
    public final android.net.Uri A00;
    public final CV6 A01;
    public final Integer A02;
    public final Integer A03;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        return new C26357Bl2(this.A00, C51722Yv.A02, new C29466Cyg(null, this.A01, this.A03, this.A02, false));
    }

    public C26400Blj(android.net.Uri uri, CV6 cv6, Integer num, Integer num2) {
        AbstractC167017dG.A1R(num, num2);
        this.A00 = uri;
        this.A03 = num;
        this.A02 = num2;
        this.A01 = cv6;
    }
}
