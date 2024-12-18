package X;

import com.facebook.rsys.avatarcommunication.gen.AvatarCommunicationApi;
import com.facebook.rsys.avatarcommunication.gen.AvatarCommunicationProxy;
import com.instagram.rtc.rsys.models.EngineModel;
import com.instagram.rtc.rsys.models.IgCallModel;

/* renamed from: X.Myn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51998Myn extends AvatarCommunicationProxy {
    public AvatarCommunicationApi A00;
    public final C54453O4h A01;

    @Override // com.facebook.rsys.avatarcommunication.gen.AvatarCommunicationProxy
    public final void fetchAvatarPresetAssets() {
    }

    @Override // com.facebook.rsys.avatarcommunication.gen.AvatarCommunicationProxy
    public final void fetchCodecAvatarSurveyEligibility() {
    }

    @Override // com.facebook.rsys.avatarcommunication.gen.AvatarCommunicationProxy
    public final void setApi(AvatarCommunicationApi avatarCommunicationApi) {
        C14360o3.A0B(avatarCommunicationApi, 0);
        this.A00 = avatarCommunicationApi;
    }

    @Override // com.facebook.rsys.avatarcommunication.gen.AvatarCommunicationProxy
    public final void onAvatarsUsedInCall() {
        String str;
        EngineModel engineModel;
        IgCallModel igCallModel;
        C54698OEa c54698OEa = this.A01.A00.A0O;
        InterfaceC06180Ui interfaceC06180Ui = c54698OEa.A01.A00.A0Z.A0V;
        C14360o3.A0B(interfaceC06180Ui, 0);
        C51759Mti c51759Mti = (C51759Mti) AbstractC001800i.A0J(interfaceC06180Ui.Bn0());
        if (c51759Mti != null && (engineModel = (EngineModel) c51759Mti.A00) != null && (igCallModel = engineModel.callModel) != null) {
            str = igCallModel.localCallId;
        } else {
            str = null;
        }
        InterfaceC19630xq interfaceC19630xq = c54698OEa.A00.A00;
        if (!interfaceC19630xq.getBoolean("has_seen_end_call_avatar_promo_upsell", false) && str != null) {
            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
            ARD.E7K("call_id_end_call_avatar_promo_upsell", str);
            ARD.apply();
        }
    }

    public C51998Myn(C54453O4h c54453O4h) {
        this.A01 = c54453O4h;
    }
}
