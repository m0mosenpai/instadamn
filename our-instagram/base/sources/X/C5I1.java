package X;

import android.view.KeyEvent;

/* renamed from: X.5I1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5I1 extends C1KO implements C3JI {
    public final KeyEvent A00;

    @Override // X.C1KO, X.C1KP
    public final String A00() {
        return "key up";
    }

    @Override // X.C3JI
    public final int BKi() {
        return this.A00.getKeyCode();
    }

    @Override // X.C1KO
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(KeyEvent.keyCodeToString(this.A00.getKeyCode()));
        sb.append(" up on ");
        sb.append(this.A01);
        sb.append(" at ");
        sb.append(((C1KP) this).A00);
        return sb.toString();
    }

    public C5I1(KeyEvent keyEvent, String str) {
        super(str, keyEvent.getEventTime(), keyEvent.getDownTime());
        this.A00 = keyEvent;
    }
}
