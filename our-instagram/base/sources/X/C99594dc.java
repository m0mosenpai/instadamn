package X;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.4dc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99594dc extends ReentrantLock {
    public final String A00() {
        String name;
        Thread owner = getOwner();
        if (owner == null || (name = owner.getName()) == null) {
            return "<none>";
        }
        return name;
    }
}
