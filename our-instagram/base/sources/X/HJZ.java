package X;

import android.view.View;

/* loaded from: classes7.dex */
public final class HJZ extends AbstractRunnableC14200nk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ BNG A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ C14510oO A06;
    public final /* synthetic */ C15370ps A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;

    @Override // java.lang.Runnable
    public final void run() {
        BNG bng = this.A02;
        C006802i c006802i = bng.A01;
        int i = this.A01;
        c006802i.markerStart(757799646, i);
        c006802i.markerAnnotate(757799646, i, "ad_id", this.A03);
        c006802i.markerAnnotate(757799646, i, "is_eligible_for_captions", this.A09);
        c006802i.markerAnnotate(757799646, i, "is_litho", this.A06.A00);
        c006802i.markerAnnotate(757799646, i, "caption_text", this.A04);
        c006802i.markerAnnotate(757799646, i, "video_subtitles_uri", this.A05);
        c006802i.markerAnnotate(757799646, i, "is_video_subtitles_enabled_for_media", this.A0C);
        c006802i.markerAnnotate(757799646, i, "is_video_subtitles_auto_generated", this.A0B);
        c006802i.markerAnnotate(757799646, i, "is_media_video", this.A0A);
        c006802i.markerAnnotate(757799646, i, "is_audio_enabled", this.A08);
        c006802i.markerAnnotate(757799646, i, "subtitle_view_alpha", String.valueOf(((View) this.A07.A00).getAlpha()));
        c006802i.markerAnnotate(757799646, i, "item_position", this.A00);
        c006802i.markerAnnotate(757799646, i, "session_key", bng.A04);
        c006802i.markerEnd(757799646, i, (short) 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HJZ(BNG bng, String str, String str2, String str3, C14510oO c14510oO, C15370ps c15370ps, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(1499169036, 3, false, false);
        this.A02 = bng;
        this.A01 = i;
        this.A03 = str;
        this.A09 = z;
        this.A06 = c14510oO;
        this.A04 = str2;
        this.A05 = str3;
        this.A0C = z2;
        this.A0B = z3;
        this.A0A = z4;
        this.A08 = z5;
        this.A07 = c15370ps;
        this.A00 = i2;
    }
}
