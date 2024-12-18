package X;

/* renamed from: X.2Vo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC50922Vo implements Cloneable {
    public abstract void A01(C125975mo c125975mo);

    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final AbstractC50922Vo clone() {
        try {
            Object clone = super.clone();
            C14360o3.A0C(clone, "null cannot be cast to non-null type com.facebook.litho.StateContainer");
            return (AbstractC50922Vo) clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
