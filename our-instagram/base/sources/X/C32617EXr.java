package X;

/* renamed from: X.EXr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32617EXr extends C4F4 {
    public final Integer A00;

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        Integer num;
        C32617EXr c32617EXr = (C32617EXr) obj;
        Integer num2 = this.A00;
        if (c32617EXr != null) {
            num = c32617EXr.A00;
        } else {
            num = null;
        }
        return AbstractC167007dF.A1X(num2, num);
    }

    public C32617EXr(Integer num) {
        this.A00 = num;
    }
}
