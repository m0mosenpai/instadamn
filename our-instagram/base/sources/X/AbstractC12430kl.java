package X;

/* renamed from: X.0kl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12430kl {
    public static final void A00(String str, InterfaceC16820sZ interfaceC16820sZ) {
        try {
            interfaceC16820sZ.invoke();
        } catch (Throwable th) {
            C0w9.A05("channel_offer_workaround", AnonymousClass001.A0R("offer on closed channel: ", str), 100, th);
        }
    }
}
