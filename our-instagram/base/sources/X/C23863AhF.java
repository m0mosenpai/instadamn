package X;

import com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel;

/* renamed from: X.AhF, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23863AhF implements InterfaceC25186BCj {
    public final /* synthetic */ StoryDraftsCreationViewModel A00;
    public final /* synthetic */ InterfaceC16660sJ A01;
    public final /* synthetic */ InterfaceC24901Jp A02;

    @Override // X.InterfaceC25186BCj
    public final void Dps(C203238yg c203238yg) {
        StoryDraftsCreationViewModel storyDraftsCreationViewModel = this.A00;
        storyDraftsCreationViewModel.A08.Egh(new C9B5(false, 1));
        storyDraftsCreationViewModel.A06.F8s(new C219379ml(c203238yg));
        storyDraftsCreationViewModel.A05.F8s(new C219379ml(c203238yg));
        this.A02.resumeWith(true);
        InterfaceC16660sJ interfaceC16660sJ = this.A01;
        if (interfaceC16660sJ != null) {
            String str = c203238yg.A07;
            if (str == null) {
                str = "";
            }
            interfaceC16660sJ.invoke(str);
        }
        C198438ps A00 = AbstractC198428pr.A00(storyDraftsCreationViewModel.A03);
        A00.A01 = A00.A04.A02(518927515, A00.A01);
    }

    @Override // X.InterfaceC25186BCj
    public final void onError(String str) {
        C14360o3.A0B(str, 0);
        StoryDraftsCreationViewModel storyDraftsCreationViewModel = this.A00;
        storyDraftsCreationViewModel.A08.Egh(new C9B5(false, 1));
        storyDraftsCreationViewModel.A06.F8s(C219389mm.A00);
        this.A02.resumeWith(false);
        C198438ps A00 = AbstractC198428pr.A00(storyDraftsCreationViewModel.A03);
        A00.A01 = A00.A04.A07(str, "", 518927515, A00.A01);
    }

    public C23863AhF(StoryDraftsCreationViewModel storyDraftsCreationViewModel, InterfaceC16660sJ interfaceC16660sJ, InterfaceC24901Jp interfaceC24901Jp) {
        this.A00 = storyDraftsCreationViewModel;
        this.A02 = interfaceC24901Jp;
        this.A01 = interfaceC16660sJ;
    }
}
