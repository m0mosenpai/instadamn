package X;

/* renamed from: X.6Rk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139036Rk {
    public C1KO A00;
    public final long A01;
    public final Integer A02;

    /* JADX WARN: Multi-variable type inference failed */
    public C139036Rk(C1KO c1ko) {
        Integer num;
        if (c1ko instanceof C3JI) {
            if (((C3JI) c1ko).BKi() == 4) {
                num = C05F.A0C;
            } else {
                num = C05F.A01;
            }
        } else if (!(c1ko instanceof C107944td) && !(c1ko instanceof C49v)) {
            if (c1ko instanceof C919149t) {
                num = C05F.A0N;
            } else {
                num = C05F.A0Y;
            }
        } else {
            num = C05F.A00;
        }
        this.A02 = num;
        this.A01 = c1ko.A00;
    }
}
