package X;

/* renamed from: X.Ouw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56079Ouw implements InterfaceC66482zP {
    public final C51675Ms6 A00;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.A05;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C51675Ms6 c51675Ms6;
        C56079Ouw c56079Ouw = (C56079Ouw) obj;
        C51675Ms6 c51675Ms62 = this.A00;
        if (c56079Ouw != null) {
            c51675Ms6 = c56079Ouw.A00;
        } else {
            c51675Ms6 = null;
        }
        return C14360o3.A0K(c51675Ms62, c51675Ms6);
    }

    public C56079Ouw(C51675Ms6 c51675Ms6) {
        this.A00 = c51675Ms6;
    }
}
