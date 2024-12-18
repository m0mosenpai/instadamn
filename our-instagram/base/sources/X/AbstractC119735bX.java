package X;

/* renamed from: X.5bX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC119735bX {
    public static final AbstractC119735bX A00 = C119745bY.A00;
    public static final AbstractC119735bX A02 = C119755bZ.A00;
    public static final AbstractC119735bX A01 = C119765ba.A00;

    public final int A00(C59W c59w, AnonymousClass583 anonymousClass583, int i, int i2) {
        if (this instanceof C119805be) {
            return ((C119805be) this).A00.AB4(0, i);
        }
        if (this instanceof C119725bW) {
            return ((C119725bW) this).A00.AB8(anonymousClass583, 0, i);
        }
        if (this instanceof C119755bZ) {
            if (anonymousClass583 != AnonymousClass583.Ltr) {
                return i;
            }
            return 0;
        }
        if (this instanceof C119765ba) {
            if (anonymousClass583 != AnonymousClass583.Ltr) {
                return 0;
            }
            return i;
        }
        if (this instanceof C119745bY) {
            return i / 2;
        }
        int AX8 = c59w.AX8(((BZX) ((C119785bc) this).A00).A00);
        if (AX8 == Integer.MIN_VALUE) {
            return 0;
        }
        int i3 = i2 - AX8;
        if (anonymousClass583 != AnonymousClass583.Rtl) {
            return i3;
        }
        return i - i3;
    }
}
