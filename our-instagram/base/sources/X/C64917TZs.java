package X;

import java.util.Observable;

/* renamed from: X.TZs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64917TZs extends Observable {
    @Override // java.util.Observable
    public final void notifyObservers(Object obj) {
        super.setChanged();
        super.notifyObservers(obj);
    }
}
