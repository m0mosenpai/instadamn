package com.instagram.debug.devoptions.signalsplayground.view;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167027dH;
import X.AbstractC31175DnJ;
import X.AbstractC37302Gc3;
import X.C05F;
import X.C0f9;
import X.C0fQ;
import X.C3OO;
import X.C8G5;
import X.C8G6;
import X.HYM;
import X.InterfaceC11380iw;
import X.InterfaceC150336ph;
import X.InterfaceC678133v;
import android.view.View;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.music.common.ui.MusicPreviewButton;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder extends C3OO {
    public static final Companion Companion = new Object();
    public static final int PREVIEW_TRACK_DURATION_MS = 30000;
    public final IgImageView albumArt;
    public HYM audioTrackItem;
    public final IgImageView backgroundImageBlur;
    public final View container;
    public final IgdsMediaButton ctaButton;
    public final Delegate delegate;
    public final InterfaceC678133v musicPlayer;
    public final MusicPreviewButton musicPreviewButton;
    public final IgTextView primaryText;
    public final IgTextView secondaryText;
    public final IgTextView tertiaryText;
    public InterfaceC150336ph trackListener;

    /* loaded from: classes7.dex */
    public interface Delegate {
        void onViewAudioDetailsClick(HYM hym);
    }

    /* loaded from: classes10.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int length = C05F.A00(3).length;
            int[] iArr = new int[length];
            try {
                length = 1;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                length = 2;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[length] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final void bind(final HYM hym, int i, int i2, InterfaceC11380iw interfaceC11380iw) {
        AbstractC167007dF.A1E(hym, 0, interfaceC11380iw);
        this.audioTrackItem = hym;
        this.container.getLayoutParams().width = i;
        this.container.getLayoutParams().height = i2;
        IgImageView igImageView = this.backgroundImageBlur;
        ImageUrl imageUrl = hym.A01;
        igImageView.setUrl(imageUrl, interfaceC11380iw);
        this.albumArt.setUrl(imageUrl, interfaceC11380iw);
        bindTrackState(hym.A02);
        this.trackListener = new CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder$createTrackListener$1(this, hym);
        C0fQ.A00(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.signalsplayground.view.CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder$bind$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder;
                InterfaceC150336ph interfaceC150336ph;
                int A05 = C0f9.A05(-1162757677);
                CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder2 = CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.this;
                int i3 = CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.PREVIEW_TRACK_DURATION_MS;
                Integer CAJ = creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder2.musicPlayer.CAJ(hym.A02);
                CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.this.musicPlayer.EJa(false);
                if (CAJ == C05F.A00 && (interfaceC150336ph = (creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder = CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.this).trackListener) != null) {
                    creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.musicPlayer.ESz(hym.A02, interfaceC150336ph, null, 0, -1, -1, false, false);
                }
                C0f9.A0C(1991143884, A05);
            }
        }, this.musicPreviewButton);
        this.primaryText.setText(hym.A09);
        this.secondaryText.setText(hym.A0A);
        this.tertiaryText.setText(hym.A0B);
        C0fQ.A00(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.signalsplayground.view.CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder$bind$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(911407087);
                CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder = CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.this;
                int i3 = CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.PREVIEW_TRACK_DURATION_MS;
                creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.delegate.onViewAudioDetailsClick(hym);
                C0f9.A0C(-1113682309, A05);
            }
        }, this.ctaButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindTrackState(MusicDataSource musicDataSource) {
        C8G6 c8g6;
        C8G5 c8g5;
        int intValue = this.musicPlayer.CAJ(musicDataSource).intValue();
        if (intValue != 0) {
            MusicPreviewButton musicPreviewButton = this.musicPreviewButton;
            if (intValue != 1) {
                C8G6 c8g62 = musicPreviewButton.A00;
                c8g62.A01(C8G5.A05);
                c8g62.A00(0.0f);
                return;
            }
            c8g6 = musicPreviewButton.A00;
            c8g5 = C8G5.A03;
        } else {
            c8g6 = this.musicPreviewButton.A00;
            c8g5 = C8G5.A04;
        }
        c8g6.A01(c8g5);
    }

    private final InterfaceC150336ph createTrackListener(HYM hym) {
        return new CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder$createTrackListener$1(this, hym);
    }

    public final HYM getAudioTrackItem() {
        return this.audioTrackItem;
    }

    public final IgImageView getBackgroundImageBlur() {
        return this.backgroundImageBlur;
    }

    public final InterfaceC150336ph getTrackListener() {
        return this.trackListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder(View view, Delegate delegate, InterfaceC678133v interfaceC678133v) {
        super(view);
        AbstractC167027dH.A13(view, delegate, interfaceC678133v);
        this.delegate = delegate;
        this.musicPlayer = interfaceC678133v;
        this.backgroundImageBlur = AbstractC37302Gc3.A0K(view, R.id.album_art_background_blur);
        this.container = AbstractC166987dD.A0c(view, R.id.audio_recommendation_item_container);
        this.albumArt = AbstractC37302Gc3.A0K(view, R.id.album_art);
        this.musicPreviewButton = (MusicPreviewButton) AbstractC166987dD.A0c(view, R.id.preview_button);
        this.primaryText = AbstractC31175DnJ.A0L(view, R.id.primary_text);
        this.secondaryText = AbstractC31175DnJ.A0L(view, R.id.secondary_text);
        this.tertiaryText = AbstractC31175DnJ.A0L(view, R.id.tertiary_text);
        this.ctaButton = (IgdsMediaButton) AbstractC166987dD.A0c(view, R.id.cta_button);
    }

    /* loaded from: classes7.dex */
    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public final void setAudioTrackItem(HYM hym) {
        this.audioTrackItem = hym;
    }

    public final void setTrackListener(InterfaceC150336ph interfaceC150336ph) {
        this.trackListener = interfaceC150336ph;
    }
}
