package X;

import android.app.Application;
import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Owo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56181Owo implements InterfaceC60152ox, InterfaceC25184BCh {
    public ComposeView A00;
    public boolean A01;
    public boolean A02;
    public int A03;
    public String A04;
    public final C25338BJh A05;
    public final UserSession A06;
    public final C3I9 A07;
    public final C25801BbI A08;
    public final InterfaceC16820sZ A09;
    public final InterfaceC16660sJ A0A;

    @Override // X.InterfaceC25184BCh
    public final void DDv(Object obj) {
        C25801BbI c25801BbI = this.A08;
        InterfaceC74953Yl interfaceC74953Yl = c25801BbI.A03;
        String A0p = AbstractC25230BEn.A0p(interfaceC74953Yl);
        this.A04 = A0p;
        C14360o3.A0B(A0p, 0);
        c25801BbI.A00 = new C5C3(A0p, C5C2.A01);
        C22C A01 = AnonymousClass229.A01(this.A06);
        String A0p2 = AbstractC25230BEn.A0p(interfaceC74953Yl);
        String A00 = AbstractC111324zv.A00(116);
        C448524p c448524p = A01.A0D;
        C14360o3.A0B(A0p2, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c448524p.A01, "ig_camera_start_session");
        if (A0f.isSampled()) {
            MSW.A1V(A0f, "IG_CAMERA_START_STICKER_EDIT_SESSION");
            MSW.A1R(A0f, "STICKER_EDIT");
            C22M c22m = c448524p.A04;
            AbstractC166987dD.A1S(A0f, MSX.A0f(c22m));
            AbstractC50522MSa.A16(c22m.A09, A0f, 1);
            AbstractC167017dG.A1B(A0f);
            MSX.A1C(A0f);
            A0f.AAP("sticker_id", A00);
            A0f.AAP("add_yours_prompt", A0p2);
            AbstractC167027dH.A0u(A0f, "nav_chain", AbstractC25225BEi.A14());
        }
    }

    @Override // X.InterfaceC25184BCh
    public final void DEy() {
        String A0p;
        if (this.A01) {
            A0p = this.A04;
        } else {
            A0p = AbstractC25230BEn.A0p(this.A08.A03);
        }
        this.A08.A01 = false;
        C22C A01 = AnonymousClass229.A01(this.A06);
        String A00 = AbstractC111324zv.A00(116);
        C448024k c448024k = A01.A07;
        C14360o3.A0B(A0p, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c448024k.A01, "ig_camera_end_session");
        if (A0f.isSampled()) {
            MSW.A1R(A0f, "STICKER_EDIT");
            MSW.A1V(A0f, "IG_CAMERA_START_STICKER_EDIT_SESSION");
            C22M c22m = c448024k.A04;
            AbstractC166987dD.A1S(A0f, MSX.A0f(c22m));
            AbstractC50522MSa.A16(c22m.A09, A0f, 1);
            AbstractC167017dG.A1B(A0f);
            MSX.A1C(A0f);
            A0f.AAP("sticker_id", A00);
            A0f.AAP("add_yours_prompt", A0p);
            AbstractC37302Gc3.A0t(A0f);
            AbstractC25234BEr.A11(A0f, "device_aspect_ratio_category", AbstractC82663mU.A00);
            A0f.Cht();
        }
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        if (this.A03 > i && !this.A02) {
            this.A05.A00();
            this.A0A.invoke(AnonymousClass001.A0R(AbstractC25230BEn.A0p(this.A08.A03), " me"));
        }
        this.A03 = i;
    }

    public C56181Owo(View view, UserSession userSession, C3I9 c3i9, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        ComposeView composeView;
        this.A06 = userSession;
        this.A07 = c3i9;
        this.A09 = interfaceC16820sZ;
        this.A0A = interfaceC16660sJ;
        Context applicationContext = view.getContext().getApplicationContext();
        C14360o3.A0C(applicationContext, AbstractC111324zv.A00(19));
        this.A08 = new C25801BbI((Application) applicationContext, userSession, " me");
        this.A05 = new C25338BJh();
        this.A04 = "";
        View inflate = AbstractC167007dF.A0M(view, R.id.memu_sticker_edit_screen_stub).inflate();
        if (inflate instanceof ComposeView) {
            composeView = (ComposeView) inflate;
        } else {
            composeView = null;
        }
        this.A00 = composeView;
        if (composeView != null) {
            composeView.setContent(C5UA.A03(new C30481DbQ(this, 15), -1019015936));
        }
        c3i9.A9e(this);
    }
}
