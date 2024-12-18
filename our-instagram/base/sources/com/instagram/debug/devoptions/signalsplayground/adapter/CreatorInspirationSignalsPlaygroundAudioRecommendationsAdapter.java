package com.instagram.debug.devoptions.signalsplayground.adapter;

import X.AbstractC166987dD;
import X.AbstractC25226BEj;
import X.AbstractC25228BEl;
import X.AbstractC25233BEq;
import X.C0f9;
import X.C14360o3;
import X.C2UU;
import X.HYM;
import X.InterfaceC11380iw;
import X.InterfaceC59142nF;
import X.InterfaceC678133v;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.debug.devoptions.signalsplayground.view.CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class CreatorInspirationSignalsPlaygroundAudioRecommendationsAdapter extends C2UU {
    public static final int ALPHA = 200;
    public static final int BLUR_RADIUS = 6;
    public static final Companion Companion = new Object();
    public static final float SCALE_RATIO = 0.25f;
    public final InterfaceC11380iw analyticsModule;
    public final ArrayList audioTrackItems;
    public final CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.Delegate delegate;
    public final int itemHeight;
    public final int itemWidth;
    public final InterfaceC678133v musicPlayer;

    public CreatorInspirationSignalsPlaygroundAudioRecommendationsAdapter(int i, int i2, InterfaceC678133v interfaceC678133v, InterfaceC11380iw interfaceC11380iw, CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.Delegate delegate) {
        AbstractC25233BEq.A0x(3, interfaceC678133v, interfaceC11380iw, delegate);
        this.itemWidth = i;
        this.itemHeight = i2;
        this.musicPlayer = interfaceC678133v;
        this.analyticsModule = interfaceC11380iw;
        this.delegate = delegate;
        this.audioTrackItems = AbstractC166987dD.A1E();
    }

    @Override // X.C2UU
    public void onBindViewHolder(CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder, int i) {
        C14360o3.A0B(creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder, 0);
        creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.backgroundImageBlur.A0I = new InterfaceC59142nF() { // from class: com.instagram.debug.devoptions.signalsplayground.adapter.CreatorInspirationSignalsPlaygroundAudioRecommendationsAdapter$onBindViewHolder$1$1
            @Override // X.InterfaceC59142nF
            public final Bitmap renderImage(Bitmap bitmap) {
                C14360o3.A0B(bitmap, 0);
                return BlurUtil.blurWithAlpha(bitmap, 0.25f, 6, 200);
            }
        };
        Object obj = this.audioTrackItems.get(i);
        C14360o3.A07(obj);
        creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.bind((HYM) obj, this.itemWidth, this.itemHeight, this.analyticsModule);
    }

    @Override // X.C2UU
    public CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        int i2 = CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.PREVIEW_TRACK_DURATION_MS;
        return new CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.creator_inspiration_signals_playground_audio_recommendation_item, false), this.delegate, this.musicPlayer);
    }

    public final void setAudioTrackItems(List list) {
        C14360o3.A0B(list, 0);
        ArrayList arrayList = this.audioTrackItems;
        arrayList.clear();
        arrayList.addAll(list);
        notifyItemRangeChanged(0, list.size());
    }

    @Override // X.C2UU
    public int getItemCount() {
        int A03 = C0f9.A03(-277329341);
        int size = this.audioTrackItems.size();
        C0f9.A0A(-1171356266, A03);
        return size;
    }

    /* loaded from: classes7.dex */
    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}
