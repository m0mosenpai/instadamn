package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.List;

/* renamed from: X.KEp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45550KEp extends C1P1 {
    public final C9J0 A00;
    public final /* synthetic */ L2A A01;

    public C45550KEp(C9J0 c9j0, L2A l2a) {
        this.A01 = l2a;
        this.A00 = c9j0;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(661256424);
        C0f5 AEp = C18950wb.A01.AEp("clips_remix_drafts_picker_controller", 817902720);
        AEp.ABW(DialogModule.KEY_MESSAGE, "Failed to fetch media for Remix");
        AEp.report();
        C0f9.A0A(154126148, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(263978639);
        this.A01.A02.A00(this.A00);
        C0f9.A0A(2069469943, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        C0f9.A0A(1303041841, C0f9.A03(-13186166));
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-886221464);
        C74293Vk c74293Vk = (C74293Vk) obj;
        int A032 = C0f9.A03(501018943);
        C14360o3.A0B(c74293Vk, 0);
        List list = c74293Vk.A06;
        C14360o3.A07(list);
        C38321qM c38321qM = (C38321qM) AbstractC001800i.A0O(list, 0);
        if (c38321qM != null) {
            C1DW.A00(this.A01.A00).A03(c38321qM);
        }
        C0f9.A0A(-795394441, A032);
        C0f9.A0A(1711407223, A03);
    }
}
