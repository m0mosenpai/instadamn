package X;

/* renamed from: X.C2v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27289C2v extends JXK {
    public final /* synthetic */ C136946Hx A00;

    public C27289C2v(C136946Hx c136946Hx) {
        this.A00 = c136946Hx;
    }

    @Override // X.JXK, X.C6C3
    public final void Dza(C4S7 c4s7) {
        AbstractC25228BEl.A1P(this.A00.A07.getValue());
    }

    @Override // X.JXK, X.C6C3
    public final void onProgressUpdate(int i, int i2, boolean z) {
        AbstractC25227BEk.A18(this.A00.A09, i / i2);
    }

    @Override // X.JXK, X.C6C3
    public final void onVideoPlayerError(C4S7 c4s7, String str) {
        AbstractC25228BEl.A1P(this.A00.A06.getValue());
    }

    @Override // X.JXK, X.C6C3
    public final void onVideoStartedPlaying(C4S7 c4s7) {
        C136946Hx c136946Hx = this.A00;
        AbstractC25227BEk.A1A(c136946Hx.A04, true);
        AbstractC25228BEl.A1P(c136946Hx.A08.getValue());
    }
}
