package X;

/* loaded from: classes9.dex */
public final class OQW {
    public static final void A00(Throwable th) {
        if (th != null) {
            C0w9 c0w9 = C0w9.A01;
            String message = th.getMessage();
            if (message == null) {
                message = "null_message";
            }
            c0w9.EmT("ig_media_creation_broadcast_trace", message, 1, th);
        }
    }
}
