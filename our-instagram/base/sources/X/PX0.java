package X;

import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor;
import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository;
import com.instagram.avatars.suggestions.ContextualSuggestionsStickersRepository;
import com.instagram.comments.mvvm.data.network.MediaHiddenCommentNetworkFetcherKt;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;
import com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository;
import com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel;
import com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaCollectionMessageMutationFactory;
import com.instagram.feed.tifu.TifuViewModel;
import com.instagram.feed.tifu.search.ThreadsSearchHcmViewModel;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.wellbeing.upsells.fragment.directmessage.DirectMessageSettingsRepository;
import com.instagram.wellbeing.upsells.fragment.tagsettings.TagSettingsRepository;
import com.instagram.wonderwall.repository.AggregatedWallFeedRepository;
import com.instagram.wonderwall.repository.WallFeedRepository;

/* loaded from: classes9.dex */
public final class PX0 extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public final int A06;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A06) {
            case 0:
                A00(obj, this);
                return VideoStickerAnythingProcessor.A00(null, (VideoStickerAnythingProcessor) this.A04, this, false);
            case 1:
                A00(obj, this);
                return VideoStickerAnythingProcessorV2.A00(null, (VideoStickerAnythingProcessorV2) this.A04, this, false);
            case 2:
                A00(obj, this);
                return ContextualSuggestionsPerIntentRepository.A02((ContextualSuggestionsPerIntentRepository) this.A04, null, this, false);
            case 3:
                A00(obj, this);
                return ContextualSuggestionsStickersRepository.A00((ContextualSuggestionsStickersRepository) this.A04, null, this, false);
            case 4:
                this.A04 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return MediaHiddenCommentNetworkFetcherKt.A00(null, null, null, this, false);
            case 5:
                A00(obj, this);
                return ((ClipsSharingDraftViewModel) this.A04).A05(this, false);
            case 6:
                A00(obj, this);
                return DirectCardGalleryRepository.A01((DirectCardGalleryRepository) this.A04, null, null, null, null, null, null, this, false);
            case 7:
                A00(obj, this);
                return DirectShareSheetFragmentViewModel.A01((DirectShareSheetFragmentViewModel) this.A04, null, null, this, false, false);
            case 8:
                A00(obj, this);
                return ((DirectConfigureMediaCollectionMessageMutationFactory) this.A04).A02(null, null, this, false);
            case 9:
                A00(obj, this);
                return ((TifuViewModel) this.A04).A03(null, this, false);
            case 10:
                A00(obj, this);
                return ((ThreadsSearchHcmViewModel) this.A04).A01(null, this, false);
            case 11:
                A00(obj, this);
                return ((DirectMessageSettingsRepository) this.A04).ELp(null, null, this, false);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A00(obj, this);
                return ((TagSettingsRepository) this.A04).ELp(null, null, this, false);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A00(obj, this);
                return AggregatedWallFeedRepository.A00((AggregatedWallFeedRepository) this.A04, null, this, false, false);
            default:
                A00(obj, this);
                return WallFeedRepository.A00((WallFeedRepository) this.A04, null, this, false, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PX0(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A06 = i;
        this.A04 = obj;
    }

    public static void A00(Object obj, PX0 px0) {
        px0.A03 = obj;
        px0.A00 |= Integer.MIN_VALUE;
    }

    public static boolean A01(Object obj, int i) {
        if ((obj instanceof PX0) && ((PX0) obj).A06 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PX0(InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A06 = 4;
    }
}
