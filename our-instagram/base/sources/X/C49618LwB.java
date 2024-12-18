package X;

/* renamed from: X.LwB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49618LwB implements InterfaceC1119153d {
    public final /* synthetic */ C7GT A00;

    @Override // X.InterfaceC1119153d
    public final /* synthetic */ void D00() {
    }

    public C49618LwB(C7GT c7gt) {
        this.A00 = c7gt;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        C7GT c7gt = this.A00;
        if (!c7gt.A06) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c7gt.A0B.A00, "audio_clips_recording_preview_dismiss");
            if (A0f.isSampled()) {
                A0f.Cht();
            }
        }
    }
}
