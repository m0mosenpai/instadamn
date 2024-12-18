package X;

/* loaded from: classes10.dex */
public abstract class TIV implements Cloneable {
    public InterfaceC65329TiA A00 = C63882SvG.A01;

    public boolean equals(Object obj) {
        if (obj instanceof TIV) {
            return this.A00.equals(((TIV) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC25235BEs.A06(this.A00);
    }

    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final TIV clone() {
        try {
            return (TIV) super.clone();
        } catch (CloneNotSupportedException e) {
            throw AbstractC58318PtA.A0f(e);
        }
    }
}
