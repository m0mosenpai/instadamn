package X;

/* renamed from: X.C4h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27326C4h extends CA4 {
    public final Integer A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C27326C4h) && this.A00 == ((C27326C4h) obj).A00);
    }

    public final int hashCode() {
        Integer num = this.A00;
        return AbstractC25230BEn.A0C(num, AbstractC28338CeQ.A02(num));
    }

    public final String toString() {
        String str;
        Integer num = this.A00;
        if (num != null) {
            str = AbstractC28338CeQ.A02(num);
        } else {
            str = "null";
        }
        return AbstractC25235BEs.A0r("WriteFeedbackSurface(writeWithAISurface=", str);
    }

    public C27326C4h(Integer num) {
        this.A00 = num;
    }
}
