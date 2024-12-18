package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;

/* renamed from: X.Aou, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24228Aou implements InterfaceC31002Dk1 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ EnumC27378C6h A02;
    public final /* synthetic */ PromptStickerModel A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ InterfaceC16820sZ A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ C19L A07;

    @Override // X.InterfaceC31002Dk1
    public final void onFailure(Throwable th) {
    }

    public C24228Aou(FragmentActivity fragmentActivity, UserSession userSession, EnumC27378C6h enumC27378C6h, PromptStickerModel promptStickerModel, Integer num, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, C19L c19l) {
        this.A06 = interfaceC16820sZ;
        this.A01 = userSession;
        this.A07 = c19l;
        this.A02 = enumC27378C6h;
        this.A04 = num;
        this.A03 = promptStickerModel;
        this.A00 = fragmentActivity;
        this.A05 = interfaceC16820sZ2;
    }

    @Override // X.InterfaceC31002Dk1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        OLN oln = (OLN) obj;
        C14360o3.A0B(oln, 0);
        C8XE c8xe = (C8XE) AbstractC001800i.A0J(oln.A00);
        if (c8xe != null) {
            InterfaceC16820sZ interfaceC16820sZ = this.A06;
            UserSession userSession = this.A01;
            C19L c19l = this.A07;
            EnumC27378C6h enumC27378C6h = this.A02;
            Integer num = this.A04;
            PromptStickerModel promptStickerModel = this.A03;
            FragmentActivity fragmentActivity = this.A00;
            InterfaceC16820sZ interfaceC16820sZ2 = this.A05;
            interfaceC16820sZ.invoke();
            ((C1808480m) userSession.A01(C1808480m.class, C1808380l.A00)).A00 = c8xe.A07;
            AbstractC166987dD.A1Z(new JWL(promptStickerModel, enumC27378C6h, userSession, fragmentActivity, c19l, interfaceC16820sZ2, num, c8xe, null, 6), c19l);
        }
    }
}
