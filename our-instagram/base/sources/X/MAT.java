package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.direct.fragment.channels.xposting.ChannelXpostingRepository;
import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;
import com.instagram.direct.fragment.sharesheet.mvvm.data.DirectShareSheetRecipientRepository;
import com.instagram.direct.fragment.sharesheet.util.DirectShareSheetApi;
import com.instagram.direct.fragment.thread.poll.repository.DirectPollMessageOptionVotersRepository;
import com.instagram.direct.fragment.thread.threaddetail.customization.ThreadDetailCustomGroupNameAndImageRepository;
import com.instagram.direct.fragment.thread.threadmedia.data.SharedLinksDataSource;
import com.instagram.direct.inbox.notes.NotesApi;
import com.instagram.direct.inbox.notes.OptimisticNetworkOperation;
import com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositorImpl;
import com.instagram.direct.prompts.dailyprompts.repository.DirectDailyPromptsResponseListRepository;
import com.instagram.direct.reactions.repository.CollectionItemEmojiReactionsListRepository;
import com.instagram.direct.reactions.repository.DirectEmojiReactionsListRepository;
import com.instagram.direct.reactions.tabbedreaction.repository.DirectTabbedEmojiReactionRepository;
import com.instagram.direct.request.DirectThreadApi;
import com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.dictionary.data.DictionaryRepository;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.impl.HiddenWordsPostsDictionary;
import com.instagram.fanclub.api.FanClubApi;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes8.dex */
public final class MAT extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A03) {
            case 0:
                A01(obj, this);
                return ((ChannelXpostingRepository) this.A02).A01(null, this);
            case 1:
                A01(obj, this);
                return DirectAggregatedMediaViewerController.A0A((DirectAggregatedMediaViewerController) this.A02, this);
            case 2:
                A01(obj, this);
                return ((DirectShareSheetRecipientRepository) this.A02).A00(null, null, null, this);
            case 3:
                A01(obj, this);
                return ((DirectShareSheetRecipientRepository) this.A02).A02(null, this);
            case 4:
                A01(obj, this);
                return ((DirectShareSheetApi) this.A02).A00(null, null, null, null, null, null, null, null, null, this, 0, false);
            case 5:
            case 40:
            case Seq.NULL_REFNUM /* 41 */:
                A02(obj, this);
                return ((C31319Dpf) this.A01).emit(null, this);
            case 6:
            case 18:
                A02(obj, this);
                return ((JRY) this.A01).emit(null, this);
            case 7:
                A02(obj, this);
                return ((C43598JQe) this.A01).emit(null, this);
            case 8:
                A01(obj, this);
                return DirectPollMessageOptionVotersRepository.A00((DirectPollMessageOptionVotersRepository) this.A02, null, null, this);
            case 9:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case Process.SIGTERM /* 15 */:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A02(obj, this);
                return ((C31649DvF) this.A01).emit(null, this);
            case 10:
                A01(obj, this);
                return ((ThreadDetailCustomGroupNameAndImageRepository) this.A02).A00(null, null, this);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A01(obj, this);
                return ((SharedLinksDataSource) this.A02).A00(null, this);
            case 14:
            case 16:
            case Process.SIGSTOP /* 19 */:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                A02(obj, this);
                return ((C31202Dnl) this.A01).emit(null, this);
            case 17:
                A02(obj, this);
                return ((C66184U2z) this.A01).emit(null, this);
            case 20:
                A01(obj, this);
                return ((OptimisticNetworkOperation) this.A02).A03(this);
            case 21:
                A01(obj, this);
                return ((OptimisticNetworkOperation) this.A02).A04(this);
            case 22:
                A01(obj, this);
                return ((NotesApi) this.A02).A05(null, this);
            case 28:
                A01(obj, this);
                return MagicMediaRemixContentCompositorImpl.A00(null, (MagicMediaRemixContentCompositorImpl) this.A02, this);
            case 30:
                A01(obj, this);
                return ((DirectDailyPromptsResponseListRepository) this.A02).A02(null, null, this);
            case 31:
                A01(obj, this);
                return CollectionItemEmojiReactionsListRepository.A00((CollectionItemEmojiReactionsListRepository) this.A02, this, 0);
            case 32:
                A01(obj, this);
                return DirectEmojiReactionsListRepository.A00((DirectEmojiReactionsListRepository) this.A02, this);
            case 33:
                A01(obj, this);
                return DirectTabbedEmojiReactionRepository.A00((DirectTabbedEmojiReactionRepository) this.A02, null, null, null, null, this);
            case 34:
                A02(obj, this);
                return DirectThreadApi.A0I(null, null, this, null);
            case 35:
                A01(obj, this);
                return ((SecurityAlertLocalDataSource) this.A02).A00(this);
            case 36:
                A02(obj, this);
                throw AbstractC166987dD.A15("emit");
            case 37:
                A01(obj, this);
                return ((ContentFilterDictionarySyncManager) this.A02).A02(null, null, null, this);
            case 38:
                A01(obj, this);
                return ((DictionaryRepository) this.A02).A00(this);
            case 39:
                A01(obj, this);
                return ((HiddenWordsPostsDictionary) this.A02).FBh(null, null, this);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A02(obj, this);
                return ((C44071Jdw) this.A01).emit(null, this);
            case 43:
                A02(obj, this);
                throw AbstractC166987dD.A15("emit");
            case 44:
                A02(obj, this);
                throw AbstractC166987dD.A15("emit");
            case 45:
                A02(obj, this);
                throw AbstractC166987dD.A15("emit");
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
            case 47:
            case 48:
                A02(obj, this);
                return ((JRB) this.A01).emit(null, this);
            default:
                A01(obj, this);
                return ((FanClubApi) this.A02).A03(null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAT(InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A03 = 34;
    }

    public static MAT A00(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        return new MAT(obj, interfaceC23621Ds, i, 42);
    }

    public static void A01(Object obj, MAT mat) {
        mat.A01 = obj;
        mat.A00 |= Integer.MIN_VALUE;
    }

    public static void A02(Object obj, MAT mat) {
        mat.A02 = obj;
        mat.A00 |= Integer.MIN_VALUE;
    }

    public static boolean A03(Object obj, int i) {
        if ((obj instanceof MAT) && ((MAT) obj).A03 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAT(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A01 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAT(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A02 = obj;
    }
}
