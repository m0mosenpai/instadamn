package X;

/* renamed from: X.3Q0, reason: invalid class name */
/* loaded from: classes2.dex */
public enum C3Q0 {
    IDLE("idle"),
    PREPARING("preparing"),
    PREPARED("prepared"),
    PLAYING("playing"),
    PAUSED("paused"),
    STOPPING("stopping");

    public final String A00;

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    C3Q0(String str) {
        this.A00 = str;
    }
}
