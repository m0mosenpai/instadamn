package X;

import com.instagram.creation.capture.quickcapture.sundial.remix.repository.ClipsRemixOriginalMediaRepository;
import com.instagram.creation.sharesheet.update.trial.TrialUseCase;
import com.instagram.direct.emojipong.data.EmojiPongRepository;
import com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource;
import com.instagram.pendingmedia.service.impl.ShareClipsTemplateHelper;
import com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel;
import com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository;

/* renamed from: X.PWt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57141PWt extends C1Dq {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57141PWt(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A05 = i;
        this.A06 = obj;
    }

    public static void A00(Object obj, C57141PWt c57141PWt) {
        c57141PWt.A04 = obj;
        c57141PWt.A01 |= Integer.MIN_VALUE;
    }

    public static boolean A01(Object obj, int i) {
        if ((obj instanceof C57141PWt) && ((C57141PWt) obj).A05 == i) {
            return true;
        }
        return false;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A05;
        A00(obj, this);
        switch (i) {
            case 0:
                return ((ClipsRemixOriginalMediaRepository.Companion) this.A06).A01(null, this, 0);
            case 1:
                return TrialUseCase.A01(null, (TrialUseCase) this.A06, this);
            case 2:
                return ((EmojiPongRepository) this.A06).A00(null, null, this, 0);
            case 3:
                return ((MainFeedLocalDataSource) this.A06).A03(this);
            case 4:
                return ((ShareClipsTemplateHelper) this.A06).A00(null, this, null);
            case 5:
                return ((IgLiveOptionsDialogViewModel) this.A06).A02(null, null, null, this, false);
            default:
                return ((LimitsPlusRepository) this.A06).A05(this, null);
        }
    }
}
