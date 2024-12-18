package X;

/* loaded from: classes10.dex */
public final class T05 implements InterfaceC65352Tig {
    @Override // X.InterfaceC65352Tig
    public final void handleException(Exception exc) {
        if (exc instanceof RuntimeException) {
            throw exc;
        }
        throw AbstractC58318PtA.A0f(exc);
    }
}
