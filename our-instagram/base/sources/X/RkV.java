package X;

/* loaded from: classes10.dex */
public final class RkV extends IllegalStateException {
    public RkV() {
        super("'raise' or 'bind' was leaked outside of its context scope.\nMake sure all calls to 'raise' and 'bind' occur within the lifecycle of nullable { }, either { } or similar builders.\n\nSee Arrow documentation on 'Typed errors' for further information.");
    }
}
