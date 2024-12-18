package X;

/* renamed from: X.MCk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C50136MCk extends C03E implements InterfaceC16660sJ {
    public C50136MCk(Object obj) {
        super(1, obj, C1579977j.class, "logTranscriptionTextExpand", "logTranscriptionTextExpand(Ljava/lang/CharSequence;)V", 0);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        C14360o3.A0B(charSequence, 0);
        C7DM c7dm = ((C1579977j) this.receiver).A05;
        long size = AbstractC167007dF.A0m(charSequence, " ", 0).size();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c7dm.A00, "audio_clips_transcription_expand_click");
        if (A0f.isSampled()) {
            A0f.A9K("word_count", Long.valueOf(size));
            A0f.Cht();
        }
        return C0eB.A00;
    }
}
