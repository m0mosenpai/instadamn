package X;

import androidx.datastore.core.SingleProcessDataStore;
import androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource;
import com.instagram.creation.drafts.model.clips.ClipsNetworkImportDraftRepository;
import com.instagram.direct.avatar.powerups.repository.AvatarPowerupsRepository;
import com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositorImpl;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender;
import com.instagram.newsfeed.data.ActivityFeedRecommendedUserRepository;
import com.instagram.nme.contextualpromo.ContextualPromoHelper;
import com.instagram.opal.impl.data.OpalRepoUtil;
import com.instagram.pendingmedia.service.impl.ShareAlbumHelper;
import com.instagram.profilecard.data.ProfileCardRepository;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.settings2.core.viewmodel.SettingsScreenViewModel;
import com.instagram.video.live.mvvm.model.domainmodel.IgLiveSponsorKt;
import com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository;

/* loaded from: classes9.dex */
public final class PX7 extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public final int A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PX7(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A08 = i;
        this.A07 = obj;
    }

    public static void A00(Object obj, Object obj2, Object obj3, Object obj4, PX7 px7) {
        px7.A01 = obj;
        px7.A02 = obj2;
        px7.A03 = obj3;
        px7.A04 = obj4;
    }

    public static void A01(Object obj, PX7 px7) {
        px7.A06 = obj;
        px7.A00 |= Integer.MIN_VALUE;
    }

    public static boolean A02(Object obj, int i) {
        if ((obj instanceof PX7) && ((PX7) obj).A08 == i) {
            return true;
        }
        return false;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A08) {
            case 0:
                A01(obj, this);
                return ((SingleProcessDataStore$readAndInit$api$1) this.A07).FAf(this, null);
            case 1:
                A01(obj, this);
                return ((SingleProcessDataStore) this.A07).A07(null, this);
            case 2:
                A01(obj, this);
                return ((AbstractC53628NnZ) this.A07).A00(this, null);
            case 3:
                A01(obj, this);
                return ((AbstractC53628NnZ) this.A07).A01(this, null);
            case 4:
                A01(obj, this);
                return ((InAppPurchaseControllerCoro) this.A07).A0F(null, null, this);
            case 5:
                A01(obj, this);
                return ClipsACRBrowserPagingSource.A01((ClipsACRBrowserPagingSource) this.A07, null, null, null, null, this);
            case 6:
                A01(obj, this);
                return ClipsNetworkImportDraftRepository.A01((ClipsNetworkImportDraftRepository) this.A07, null, null, null, this, null);
            case 7:
                A01(obj, this);
                return ((AvatarPowerupsRepository) this.A07).A00(this);
            case 8:
                A01(obj, this);
                return MagicMediaRemixContentCompositorImpl.A01((MagicMediaRemixContentCompositorImpl) this.A07, null, this);
            case 9:
                A01(obj, this);
                return ((MagicMediaRemixContentCompositorImpl) this.A07).A03(null, null, null, null, null, this);
            case 10:
                A01(obj, this);
                return ArmadilloExpressLinkMessageSender.A01(null, null, (ArmadilloExpressLinkMessageSender) this.A07, null, this);
            case 11:
                A01(obj, this);
                return C2043992v.A01((C2043992v) this.A07, null, null, null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A01(obj, this);
                return ((ActivityFeedRecommendedUserRepository) this.A07).A00(null, null, null, this);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A01(obj, this);
                return ((ContextualPromoHelper) this.A07).A01(null, null, null, null, this);
            case 14:
                A01(obj, this);
                return ((OpalRepoUtil) this.A07).A01(null, null, null, null, this);
            case Process.SIGTERM /* 15 */:
                A01(obj, this);
                return ((ShareAlbumHelper) this.A07).A00(null, this);
            case 16:
                A01(obj, this);
                return ((ProfileCardRepository) this.A07).A00(this);
            case 17:
                A01(obj, this);
                return SettingsScreenViewModel.A00(null, (SettingsScreenViewModel) this.A07, null, null, null, null, this);
            case 18:
                this.A07 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return IgLiveSponsorKt.A00(null, null, this);
            case Process.SIGSTOP /* 19 */:
                A01(obj, this);
                return WriteSuggestionsRepository.A00((WriteSuggestionsRepository) this.A07, null, this);
            case 20:
                A01(obj, this);
                return C55214Oeb.A01(null, null, null, null, (C55214Oeb) this.A07, this);
            case 21:
                A01(obj, this);
                return C55171Oda.A02(null, null, this, (C55171Oda) this.A07);
            case 22:
                A01(obj, this);
                return C55171Oda.A00(null, null, null, null, this, (C55171Oda) this.A07);
            default:
                A01(obj, this);
                return C55171Oda.A01(null, null, null, null, this, (C55171Oda) this.A07);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PX7(InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A08 = 18;
    }
}
