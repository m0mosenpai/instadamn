package X;

import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* renamed from: X.Ses, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63190Ses {
    public ConcurrentMap A00 = AbstractC58318PtA.A14();
    public ConcurrentMap A01 = AbstractC58318PtA.A14();
    public static final Logger A03 = AbstractC58319PtB.A17(C63190Ses.class);
    public static final C63190Ses A02 = new C63190Ses();

    public static synchronized InterfaceC65428Tjz A00(C63190Ses c63190Ses, String str) {
        InterfaceC65428Tjz interfaceC65428Tjz;
        synchronized (c63190Ses) {
            ConcurrentMap concurrentMap = c63190Ses.A00;
            if (concurrentMap.containsKey(str)) {
                interfaceC65428Tjz = (InterfaceC65428Tjz) concurrentMap.get(str);
            } else {
                throw AbstractC58318PtA.A0x(AnonymousClass001.A0R("No key manager found for key type ", str));
            }
        }
        return interfaceC65428Tjz;
    }

    public final synchronized void A01(final InterfaceC65428Tjz manager, EnumC61068Rei compatibility, boolean newKeyAllowed) {
        if (compatibility.A00()) {
            try {
                String str = ((C64302T8l) manager).A03;
                if (newKeyAllowed) {
                    ConcurrentMap concurrentMap = this.A01;
                    if (concurrentMap.containsKey(str) && !AbstractC166987dD.A1a(concurrentMap.get(str))) {
                        throw AbstractC58318PtA.A0x(AnonymousClass001.A0R("New keys are already disallowed for key type ", str));
                    }
                }
                ConcurrentMap concurrentMap2 = this.A00;
                InterfaceC65428Tjz interfaceC65428Tjz = (InterfaceC65428Tjz) concurrentMap2.get(str);
                if (interfaceC65428Tjz != null) {
                    Class<?> cls = interfaceC65428Tjz.getClass();
                    Class<?> cls2 = manager.getClass();
                    if (!cls.equals(cls2)) {
                        A03.warning(AnonymousClass001.A0R("Attempted overwrite of a registered key manager for key type ", str));
                        throw AbstractC58319PtB.A0z("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{str, cls.getName(), cls2.getName()});
                    }
                }
                concurrentMap2.putIfAbsent(str, manager);
                AbstractC43592JPx.A1W(str, this.A01, newKeyAllowed);
            } catch (Throwable th) {
            }
        } else {
            throw AbstractC58318PtA.A0x("Cannot register key manager: FIPS compatibility insufficient");
        }
    }

    public final synchronized void A02(final InterfaceC65428Tjz manager, boolean newKeyAllowed) {
        A01(manager, EnumC61068Rei.A00, newKeyAllowed);
    }
}
