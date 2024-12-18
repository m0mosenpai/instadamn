package X;

import java.util.Observable;
import java.util.Observer;

/* renamed from: X.TTl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64777TTl implements Observer {
    public InterfaceC65392TjP A00;

    public final boolean equals(Object obj) {
        if ((obj instanceof C64777TTl) && this.A00.equals(((C64777TTl) obj).A00)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        this.A00.Dx0(obj);
    }
}
