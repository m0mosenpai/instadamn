package X;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1R6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1R6 {
    public final InterfaceC215913l A00;
    public final AtomicReference A01;

    public C1R6(InterfaceC215913l interfaceC215913l) {
        C14360o3.A0B(interfaceC215913l, 1);
        this.A00 = interfaceC215913l;
        this.A01 = new AtomicReference(false);
    }

    public final boolean A00(Locale locale) {
        C14360o3.A0B(locale, 0);
        Object obj = ((C215813k) this.A00).A01.get();
        if (obj != null) {
            if (((java.util.Set) obj).contains(locale.toString())) {
                Object obj2 = this.A01.get();
                if (obj2 != null) {
                    if (!((Boolean) obj2).booleanValue()) {
                        return true;
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            return false;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
