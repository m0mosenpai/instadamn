package X;

/* renamed from: X.UiI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67209UiI extends C2JS implements C2JT {
    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C95124Py c95124Py = C95124Py.A00;
        C4OW c4ow = new C4OW(c95124Py, "allow_media_creation_with_music");
        C94894Ou c94894Ou = C94894Ou.A00;
        C4OW c4ow2 = new C4OW(c94894Ou, "audio_asset_start_time_in_ms");
        C4OK c4ok = new C4OK(C60059QtJ.class, "ig_artist", 4619093);
        C4OW c4ow3 = new C4OW(c95124Py, "is_bookmarked");
        C4OW c4ow4 = new C4OW(c95124Py, "is_trending_in_clips");
        C4OW c4ow5 = new C4OW(c94894Ou, "overlap_duration_in_ms");
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{c4ow, c4ow2, c4ok, c4ow3, c4ow4, c4ow5, AbstractC65703TsZ.A0J(c94754Oe), new C4OW(c95124Py, "should_allow_music_editing"), AbstractC65703TsZ.A0c(c95124Py), AbstractC65703TsZ.A0b(c94754Oe), new C4OW(c94754Oe, "should_mute_audio_reason_type")});
    }

    public C67209UiI(int i) {
        super(i);
    }

    public C67209UiI() {
        super(2109560496);
    }
}
