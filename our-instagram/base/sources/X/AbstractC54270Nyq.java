package X;

/* renamed from: X.Nyq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54270Nyq {
    public static final String A00(AbstractC115105If abstractC115105If) {
        InterfaceC40821up interfaceC40821up;
        if ((abstractC115105If instanceof C115115Ig) && (interfaceC40821up = (InterfaceC40821up) ((C115115Ig) abstractC115105If).A00) != null && interfaceC40821up.getErrorMessage() != null) {
            return interfaceC40821up.getErrorMessage();
        }
        Throwable A01 = abstractC115105If.A01();
        if (A01 == null) {
            return null;
        }
        return A01.getMessage();
    }
}
