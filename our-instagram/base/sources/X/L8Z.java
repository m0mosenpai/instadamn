package X;

/* loaded from: classes8.dex */
public abstract class L8Z {
    public final Integer A00;
    public final int A01;

    public final int A00() {
        if (this instanceof KNO) {
            return ((KNO) this).A00;
        }
        if (this instanceof KNN) {
            return ((KNN) this).A00;
        }
        return this.A01;
    }

    public final String A01() {
        if (this instanceof KNM) {
            return ((KNM) this).A00;
        }
        if (this instanceof KNL) {
            return ((KNL) this).A00;
        }
        if (this instanceof KNK) {
            return ((KNK) this).A00;
        }
        if (this instanceof KNJ) {
            return ((KNJ) this).A00;
        }
        if (this instanceof KNO) {
            return ((KNO) this).A01;
        }
        return ((KNN) this).A01;
    }

    public L8Z(int i, Integer num) {
        this.A01 = i;
        this.A00 = num;
    }
}
