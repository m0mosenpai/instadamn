package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class G78 implements InterfaceC37210GaL {
    public final /* synthetic */ EnumC1579076z A00;
    public final /* synthetic */ EnumC33464Eqz A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;

    public G78(EnumC1579076z enumC1579076z, EnumC33464Eqz enumC33464Eqz, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A00 = enumC1579076z;
        this.A01 = enumC33464Eqz;
    }

    @Override // X.InterfaceC37210GaL
    public final void D9X() {
        AbstractC31173DnH.A1S(C19280xC.A00(this.A02, "direct_blocked_composer_delete_chat"), this.A03);
    }

    @Override // X.InterfaceC37210GaL
    public final void DOi() {
        UserSession userSession = this.A03;
        C162337Ov.A0A(this.A00, this.A01, this.A02, userSession, "leave");
    }

    @Override // X.InterfaceC37210GaL
    public final void Dm8() {
        UserSession userSession = this.A03;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        EnumC1579076z enumC1579076z = this.A00;
        EnumC33464Eqz enumC33464Eqz = this.A01;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "direct_group_block_warning_dialog_impression");
        A0f.A8R(enumC1579076z, CacheBehaviorLogger.SOURCE);
        A0f.A8R(enumC33464Eqz, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        A0f.Cht();
    }

    @Override // X.InterfaceC37210GaL
    public final void Doc() {
        UserSession userSession = this.A03;
        C162337Ov.A0A(this.A00, this.A01, this.A02, userSession, "stay");
    }

    @Override // X.InterfaceC37210GaL
    public final void onCancel() {
        UserSession userSession = this.A03;
        C162337Ov.A0A(this.A00, this.A01, this.A02, userSession, "cancel");
    }
}
