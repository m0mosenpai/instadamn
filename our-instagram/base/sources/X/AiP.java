package X;

import com.instagram.crossposting.setting.manager.FbAutoCrossPostingSettingManager;

/* loaded from: classes4.dex */
public final class AiP implements InterfaceC196248mG {
    public final /* synthetic */ InterfaceC196248mG A00;
    public final /* synthetic */ InterfaceC25194BCr A01;
    public final /* synthetic */ FbAutoCrossPostingSettingManager A02;
    public final /* synthetic */ String A03;

    public AiP(InterfaceC196248mG interfaceC196248mG, InterfaceC25194BCr interfaceC25194BCr, FbAutoCrossPostingSettingManager fbAutoCrossPostingSettingManager, String str) {
        this.A00 = interfaceC196248mG;
        this.A02 = fbAutoCrossPostingSettingManager;
        this.A03 = str;
        this.A01 = interfaceC25194BCr;
    }

    @Override // X.InterfaceC196248mG
    public final void DG4(String str) {
        C196228mD logger;
        logger = this.A02.getLogger();
        String str2 = this.A03;
        String identifier = this.A01.getIdentifier();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) logger.A01.getValue(), "cxp_ig_client_sourced_creation");
        EnumC222416a A0I = C17060sy.A01.A01(logger.A00).A0I();
        if (A0I == null) {
            A0I = EnumC222416a.A08;
        }
        A0f.AAP(AbstractC50635MWw.A01(), str2);
        A0f.AAP("event_name", "xposting_setting_mutate_failure");
        A0f.AAP("data_source", identifier);
        A0f.AAP("source_account_type", A0I.A01);
        A0f.Cht();
        InterfaceC196248mG interfaceC196248mG = this.A00;
        if (interfaceC196248mG != null) {
            interfaceC196248mG.DG4(str);
        }
    }
}
