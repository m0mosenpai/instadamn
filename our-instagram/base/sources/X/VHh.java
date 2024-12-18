package X;

/* loaded from: classes11.dex */
public enum VHh implements InterfaceC02530Ab {
    START(0),
    THREAD_NAME_CHANGED(1),
    CAMERA(2),
    LIBRARY(3),
    REMOVE(4);

    public final long A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.A00);
    }

    VHh(long j) {
        this.A00 = j;
    }
}
