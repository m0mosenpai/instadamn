package X;

import com.facebook.react.modules.intent.IntentModule;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: X.1Kl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25071Kl extends AbstractC25081Km {
    public static final long A00;
    public static final long A01;
    public static final long A02;
    public static final long A03;
    public static final long A04;
    public static final Unsafe A05;

    @Override // X.AbstractC25081Km
    public final C25141Ks A00(C25141Ks future, AbstractC25011Ke update) {
        C25141Ks c25141Ks;
        do {
            boolean z = AbstractC25011Ke.A02;
            c25141Ks = update.listeners;
            if (future == c25141Ks) {
                break;
            }
        } while (!A04(c25141Ks, future, update));
        return c25141Ks;
    }

    @Override // X.AbstractC25081Km
    public final C25121Kq A01(C25121Kq future, AbstractC25011Ke update) {
        C25121Kq c25121Kq;
        do {
            boolean z = AbstractC25011Ke.A02;
            c25121Kq = update.waiters;
            if (future == c25121Kq) {
                break;
            }
        } while (!A05(c25121Kq, future, update));
        return c25121Kq;
    }

    @Override // X.AbstractC25081Km
    public final void A02(C25121Kq waiter, C25121Kq newValue) {
        A05.putObject(waiter, A03, newValue);
    }

    @Override // X.AbstractC25081Km
    public final void A03(C25121Kq waiter, Thread newValue) {
        A05.putObject(waiter, A04, newValue);
    }

    @Override // X.AbstractC25081Km
    public final boolean A04(C25141Ks future, C25141Ks expect, AbstractC25011Ke update) {
        return C1MN.A00(update, future, expect, A05, A00);
    }

    @Override // X.AbstractC25081Km
    public final boolean A05(C25121Kq future, C25121Kq expect, AbstractC25011Ke update) {
        return C1MN.A00(update, future, expect, A05, A02);
    }

    @Override // X.AbstractC25081Km
    public final boolean A06(AbstractC25011Ke future, Object expect, Object update) {
        return C1MN.A00(future, expect, update, A05, A01);
    }

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                throw new RuntimeException("Could not initialize intrinsics", e.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: X.1Ko
                @Override // java.security.PrivilegedExceptionAction
                public final /* bridge */ /* synthetic */ Object run() {
                    for (Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return Unsafe.class.cast(obj);
                        }
                    }
                    throw new NoSuchFieldError("the Unsafe");
                }
            });
        }
        try {
            A02 = unsafe.objectFieldOffset(AbstractC25011Ke.class.getDeclaredField("waiters"));
            A00 = unsafe.objectFieldOffset(AbstractC25011Ke.class.getDeclaredField("listeners"));
            A01 = unsafe.objectFieldOffset(AbstractC25011Ke.class.getDeclaredField(IntentModule.EXTRA_MAP_KEY_FOR_VALUE));
            A04 = unsafe.objectFieldOffset(C25121Kq.class.getDeclaredField("thread"));
            A03 = unsafe.objectFieldOffset(C25121Kq.class.getDeclaredField("next"));
            A05 = unsafe;
        } catch (NoSuchFieldException e2) {
            throw new RuntimeException(e2);
        }
    }
}
