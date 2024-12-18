package com.instagram.debug.devoptions.signalsplayground.view;

import X.AbstractC40750I4e;
import X.AbstractC49521Lua;
import X.HYM;

/* loaded from: classes7.dex */
public final class CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder$createTrackListener$1 extends AbstractC49521Lua {
    public final /* synthetic */ HYM $audioTrackItem;
    public final /* synthetic */ CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder this$0;

    public CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder$createTrackListener$1(CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder, HYM hym) {
        this.this$0 = creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder;
        this.$audioTrackItem = hym;
    }

    private final int getPreviewTrackStartTimeMs(int i) {
        return AbstractC40750I4e.A00(i, 30000, this.$audioTrackItem.A0C);
    }

    @Override // X.AbstractC49521Lua, X.InterfaceC150336ph
    public void onCurrentTrackPlayTimeUpdated(int i) {
        CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder = this.this$0;
        int i2 = CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.PREVIEW_TRACK_DURATION_MS;
        int previewTrackStartTimeMs = getPreviewTrackStartTimeMs(creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.musicPlayer.Azm());
        float min = (i - previewTrackStartTimeMs) / Math.min(30000, this.this$0.musicPlayer.Azm() - previewTrackStartTimeMs);
        if (min >= 1.0f) {
            this.this$0.musicPlayer.EJa(false);
        } else {
            this.this$0.musicPreviewButton.setProgress(min);
        }
    }

    @Override // X.AbstractC49521Lua, X.InterfaceC150336ph
    public void onCurrentTrackStopped() {
        CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder = this.this$0;
        int i = CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.PREVIEW_TRACK_DURATION_MS;
        creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.musicPlayer.AHi();
        creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.bindTrackState(this.$audioTrackItem.A02);
    }

    @Override // X.AbstractC49521Lua, X.InterfaceC150336ph
    public void onCurrentTrackPrepared(int i) {
        int previewTrackStartTimeMs = getPreviewTrackStartTimeMs(i);
        CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder = this.this$0;
        int i2 = CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.PREVIEW_TRACK_DURATION_MS;
        creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.musicPlayer.seekTo(previewTrackStartTimeMs);
        this.this$0.musicPlayer.E4S();
        this.this$0.bindTrackState(this.$audioTrackItem.A02);
    }
}
