package X;

import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository;

/* renamed from: X.Ou2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56030Ou2 implements InterfaceC41501vz {
    public final /* synthetic */ IgLiveQuestionSubmissionsRepository A00;

    public C56030Ou2(IgLiveQuestionSubmissionsRepository igLiveQuestionSubmissionsRepository) {
        this.A00 = igLiveQuestionSubmissionsRepository;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-1808405857);
        NYP nyp = (NYP) obj;
        int A032 = C0f9.A03(461400673);
        C14360o3.A0B(nyp, 0);
        IgLiveQuestionSubmissionsRepository igLiveQuestionSubmissionsRepository = this.A00;
        int i = nyp.A00;
        C05A c05a = igLiveQuestionSubmissionsRepository.A05;
        int max = ((C9B7) c05a.getValue()).A00 + Math.max(0, i - igLiveQuestionSubmissionsRepository.A00);
        igLiveQuestionSubmissionsRepository.A00 = i;
        c05a.Egh(new C9B7(nyp.A01, max, 2));
        C0f9.A0A(-1061779587, A032);
        C0f9.A0A(1217591722, A03);
    }
}
