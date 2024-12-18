package X;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import com.instagram.archive.data.ArchiveStoryRepository;
import com.instagram.direct.prompts.dailyprompts.repository.DirectDailyPromptsResponseListRepository;
import com.instagram.fanclub.settings.repository.FanClubSettingsRepository;
import com.instagram.settings2.core.viewmodel.UiStateKt;
import com.instagram.settings2.extension.customstorage.manuallyapprovetags.ManuallyApproveTagsCustomStorageHandler;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository;
import com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel;
import com.instagram.wellbeing.upsells.fragment.dismissnudge.DismissNudgeRepository;
import com.instagram.wellbeing.upsells.fragment.remixsettings.RemixSettingsRepository;

/* loaded from: classes9.dex */
public final class MUF extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public final int A05;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A05) {
            case 0:
                this.A03 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return TapGestureDetectorKt.A01(null, null, this, false);
            case 1:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((ArchiveStoryRepository) this.A03).A00(null, this, false, false);
            case 2:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((DirectDailyPromptsResponseListRepository) this.A03).A01(null, null, null, this, false, false);
            case 3:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((AbstractC48512Ld9) this.A03).A01(this, false);
            case 4:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((FanClubSettingsRepository) this.A03).A01(this, false);
            case 5:
                this.A03 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return UiStateKt.A04(null, null, this, false);
            case 6:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((ManuallyApproveTagsCustomStorageHandler) this.A03).A00(this, false);
            case 7:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((IgLiveQuestionSubmissionsRepository) this.A03).A00(this, false);
            case 8:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return IgLiveViewerLikesViewModel.A02((IgLiveViewerLikesViewModel) this.A03, this, false);
            case 9:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((DismissNudgeRepository) this.A03).A00(null, this, false);
            default:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((RemixSettingsRepository) this.A03).ELp(null, null, this, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MUF(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A05 = i;
        this.A03 = obj;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof MUF) && ((MUF) obj).A05 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MUF(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A05 = i;
    }
}
