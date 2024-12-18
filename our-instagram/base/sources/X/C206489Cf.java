package X;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.DragGestureNode;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.camera.effect.mq.effectmetadata.EffectTrayService$withSelectedEffect$$inlined$map$1$2;
import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository;
import com.instagram.creation.capture.quickcapture.save.CachingVideoSaver;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource;
import com.instagram.direct.store.ReplaceDirectMessageLoader;
import com.instagram.igsignalsproducts.clips.tab.IgSignalsClipsOpenTabTracker;
import com.instagram.nme.contextualpromo.ClipsUploadPromoHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.wellbeing.respectfulcommentnudge.data.RepositoryImpl;

/* renamed from: X.9Cf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206489Cf extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206489Cf(InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A06 = 0;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A06) {
            case 0:
                this.A05 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return SuspendAnimationKt.A01(null, null, this, null, 0L);
            case 1:
                this.A04 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return DragGestureNode.A00(null, (DragGestureNode) this.A05, this);
            case 2:
                this.A04 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((LazyListState) this.A05).EMA(null, this, null);
            case 3:
                this.A04 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((AndroidComposeViewAccessibilityDelegateCompat) this.A05).A0a(this);
            case 4:
                this.A04 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return EffectCollectionService.A02((EffectCollectionService) this.A05, null, this);
            case 5:
                this.A04 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return EffectCollectionService.A05((EffectCollectionService) this.A05, null, null, this);
            case 6:
                this.A04 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((EffectTrayService$withSelectedEffect$$inlined$map$1$2) this.A05).emit(null, this);
            case 7:
                this.A04 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return MediaCommentListRepository.A09((MediaCommentListRepository) this.A05, this, null);
            case 8:
                this.A04 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return InspirationHubRepository.A00((InspirationHubRepository) this.A05, null, null, this);
            case 9:
                this.A04 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return InspirationHubRepository.A01((InspirationHubRepository) this.A05, null, this);
            case 10:
                this.A04 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return CachingVideoSaver.A00((CachingVideoSaver) this.A05, null, this, null);
            case 11:
                this.A04 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ClipsCreationDraftViewModel.A04((ClipsCreationDraftViewModel) this.A05, null, null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                this.A04 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((ClipsDraftLocalDataSource) this.A05).A02(null, this);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                this.A04 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ReplaceDirectMessageLoader.A00(null, null, (ReplaceDirectMessageLoader) this.A05, null, null, null, this);
            case 14:
                this.A04 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((IgSignalsClipsOpenTabTracker) this.A05).A00(this, null);
            case Process.SIGTERM /* 15 */:
                this.A04 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ClipsUploadPromoHelper.A00((ClipsUploadPromoHelper) this.A05, null, null, this);
            default:
                this.A04 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((RepositoryImpl) this.A05).A00(null, null, null, null, null, this, false);
        }
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C206489Cf) && ((C206489Cf) obj).A06 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206489Cf(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A06 = i;
        this.A05 = obj;
    }
}
