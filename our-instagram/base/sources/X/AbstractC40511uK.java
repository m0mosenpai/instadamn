package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1uK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC40511uK {
    public static final ConcurrentHashMap A00 = new ConcurrentHashMap();

    public static InterfaceC40501uJ A00() {
        InterfaceC40501uJ interfaceC40501uJ = (InterfaceC40501uJ) A00.get("ig4a-instagram-schema");
        if (interfaceC40501uJ != null) {
            return interfaceC40501uJ;
        }
        throw new RuntimeException(AnonymousClass001.A0R("No IPersistedQueryProvider has been initialized for ", "ig4a-instagram-schema"));
    }
}
