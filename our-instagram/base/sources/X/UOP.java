package X;

/* loaded from: classes11.dex */
public abstract class UOP extends C3Q9 {
    public final void finalize() {
        if (!isClosed()) {
            C0I2.A09("CloseableImage", "finalize: %s %x still open.", AbstractC25228BEl.A1Z(AbstractC31173DnH.A0q(this), System.identityHashCode(this)));
            close();
        }
    }
}
