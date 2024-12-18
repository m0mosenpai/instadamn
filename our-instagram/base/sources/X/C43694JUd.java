package X;

/* renamed from: X.JUd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C43694JUd extends C03E implements InterfaceC16820sZ {
    public C43694JUd(Object obj) {
        super(0, obj, C1579977j.class, "onPlaybackSpeedClick", "onPlaybackSpeedClick()Lcom/instagram/direct/messagethread/voice/VoiceMessagePlaybackSpeed;", 0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        EnumC43692JUb enumC43692JUb;
        EnumC46287KeJ enumC46287KeJ;
        C1579977j c1579977j = (C1579977j) this.receiver;
        int ordinal = AbstractC43693JUc.A00(c1579977j.A06.A01()).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                enumC43692JUb = EnumC43692JUb.A05;
            } else {
                enumC43692JUb = EnumC43692JUb.A07;
            }
        } else {
            enumC43692JUb = EnumC43692JUb.A06;
        }
        C7DM c7dm = c1579977j.A05;
        int ordinal2 = enumC43692JUb.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                enumC46287KeJ = EnumC46287KeJ.SPEED_2X;
            } else {
                enumC46287KeJ = EnumC46287KeJ.SPEED_1_5X;
            }
        } else {
            enumC46287KeJ = EnumC46287KeJ.SPEED_1X;
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c7dm.A00, "audio_clips_playback_speed_click");
        if (A0f.isSampled()) {
            A0f.A8R(enumC46287KeJ, "playback_speed");
            A0f.Cht();
        }
        C1579977j.A03(c1579977j, enumC43692JUb);
        return enumC43692JUb;
    }
}
