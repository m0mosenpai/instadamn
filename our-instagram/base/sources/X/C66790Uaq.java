package X;

/* renamed from: X.Uaq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66790Uaq extends C2JS implements C2JT {
    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C95124Py c95124Py = C95124Py.A00;
        C4OW c4ow = new C4OW(c95124Py, "allow_media_creation_with_music");
        C94894Ou c94894Ou = C94894Ou.A00;
        C4OW c4ow2 = new C4OW(c94894Ou, "audio_asset_start_time_in_ms");
        C4OK c4ok = new C4OK(C4OO.A00(), C66789Uap.class, "audio_filter_infos", 1982881778);
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{c4ow, c4ow2, c4ok, new C4OW(c94754Oe, "derived_content_id"), new C4OK(QYZ.class, "ig_artist", 1072033595), new C4OW(c95124Py, "is_bookmarked"), new C4OW(c95124Py, "is_trending_in_clips"), new C4OW(c94894Ou, "overlap_duration_in_ms"), AbstractC65703TsZ.A0J(c94754Oe), new C4OW(c95124Py, "should_allow_music_editing"), AbstractC65703TsZ.A0c(c95124Py), AbstractC65703TsZ.A0b(c94754Oe), new C4OW(c94754Oe, "should_mute_audio_reason_type"), new C4OW(c94894Ou, "trend_rank")});
    }

    public C66790Uaq(int i) {
        super(i);
    }

    public C66790Uaq() {
        super(1004093456);
    }
}
