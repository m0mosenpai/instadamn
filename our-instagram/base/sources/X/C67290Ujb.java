package X;

/* renamed from: X.Ujb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67290Ujb extends C2JS implements C2JT {
    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C95124Py c95124Py = C95124Py.A00;
        C4OW c4ow = new C4OW(c95124Py, "allow_media_creation_with_music");
        C94894Ou c94894Ou = C94894Ou.A00;
        C4OW c4ow2 = new C4OW(c94894Ou, "audio_asset_start_time_in_ms");
        C4OK c4ok = new C4OK(C4OO.A00(), C67287UjY.class, "audio_filter_infos", -322618221);
        C4OK c4ok2 = new C4OK(C67288UjZ.class, "audio_muting_info", -59670828);
        C4OW c4ow3 = new C4OW(c95124Py, "contains_lyrics");
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{c4ow, c4ow2, c4ok, c4ok2, c4ow3, new C4OW(c94754Oe, "derived_content_id"), new C4OW(C94754Oe.A00(), "display_labels"), new C4OW(c94754Oe, "formatted_clips_media_count"), new C4OK(C67289Uja.class, "ig_artist", 5082578), new C4OW(c95124Py, "is_bookmarked"), new C4OW(c95124Py, "is_trending_in_clips"), new C4OW(c94894Ou, "overlap_duration_in_ms"), AbstractC65703TsZ.A0J(c94754Oe), new C4OW(c94894Ou, "previous_trend_rank"), new C4OW(c95124Py, "should_allow_music_editing"), AbstractC65703TsZ.A0c(c95124Py), AbstractC65703TsZ.A0b(c94754Oe), new C4OW(c94754Oe, "should_mute_audio_reason_type"), new C4OW(c95124Py, "should_render_soundwave"), new C4OW(c94894Ou, "trend_rank")});
    }

    public C67290Ujb(int i) {
        super(i);
    }

    public C67290Ujb() {
        super(-953831377);
    }
}
