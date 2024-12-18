package X;

/* renamed from: X.Lev, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48619Lev implements InterfaceC186038Mx {
    public final /* synthetic */ C45495KCk A00;

    public C48619Lev(C45495KCk c45495KCk) {
        this.A00 = c45495KCk;
    }

    @Override // X.InterfaceC186038Mx
    public final int CF4() {
        C38321qM c38321qM = this.A00.A01;
        if (c38321qM != null) {
            return (int) c38321qM.A1C();
        }
        C14360o3.A0F("media");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC186038Mx
    public final void E3m() {
        this.A00.A01().E3d("paused_for_music_audio_off");
    }

    @Override // X.InterfaceC186038Mx
    public final void E4Y() {
        this.A00.Eo6();
    }
}
