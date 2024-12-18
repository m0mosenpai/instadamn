package com.instagram.crossposting.setting.manager;

import X.AbstractC09440dt;
import X.AbstractC50635MWw;
import X.AiP;
import X.C06090Tz;
import X.C0HM;
import X.C14360o3;
import X.C17060sy;
import X.C18920wW;
import X.C18U;
import X.C196018lq;
import X.C196228mD;
import X.C206959Ea;
import X.C51761Mtk;
import X.EnumC09460dv;
import X.EnumC222416a;
import X.InterfaceC02590Ai;
import X.InterfaceC09390do;
import X.InterfaceC196038lt;
import X.InterfaceC196248mG;
import X.InterfaceC25194BCr;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class FbAutoCrossPostingSettingManager {
    public static final C196018lq Companion = new Object();
    public final InterfaceC09390do accountType$delegate;
    public final InterfaceC09390do bplCrossPostingSettingDataProvider$delegate;
    public final InterfaceC09390do bplCrossPostingSettingMutator$delegate;
    public final InterfaceC09390do logger$delegate;
    public final InterfaceC09390do unifiedConfigCrossPostingSettingDataProvider$delegate;
    public final InterfaceC09390do unifiedConfigCrossPostingSettingMutator$delegate;
    public final UserSession userSession;

    public FbAutoCrossPostingSettingManager(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.userSession = userSession;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.accountType$delegate = AbstractC09440dt.A00(enumC09460dv, new C206959Ea(this, 39));
        this.unifiedConfigCrossPostingSettingDataProvider$delegate = AbstractC09440dt.A00(enumC09460dv, new C206959Ea(this, 43));
        this.bplCrossPostingSettingDataProvider$delegate = AbstractC09440dt.A00(enumC09460dv, new C206959Ea(this, 40));
        this.unifiedConfigCrossPostingSettingMutator$delegate = AbstractC09440dt.A00(enumC09460dv, new C206959Ea(this, 44));
        this.bplCrossPostingSettingMutator$delegate = AbstractC09440dt.A00(enumC09460dv, new C206959Ea(this, 41));
        this.logger$delegate = AbstractC09440dt.A00(enumC09460dv, new C206959Ea(this, 42));
    }

    public static final FbAutoCrossPostingSettingManager getInstance(UserSession userSession) {
        return C196018lq.A00(userSession);
    }

    public void updateAutoCrossPostingSetting(C51761Mtk c51761Mtk, InterfaceC196248mG interfaceC196248mG) {
        C14360o3.A0B(c51761Mtk, 0);
        String obj = C0HM.A00().toString();
        C14360o3.A07(obj);
        InterfaceC25194BCr mutator = getMutator();
        C196228mD logger = getLogger();
        String identifier = mutator.getIdentifier();
        C18920wW c18920wW = (C18920wW) logger.A01.getValue();
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "cxp_ig_client_sourced_creation");
        EnumC222416a A0I = C17060sy.A01.A01(logger.A00).A0I();
        if (A0I == null) {
            A0I = EnumC222416a.A08;
        }
        A00.AAP(AbstractC50635MWw.A01(), obj);
        A00.AAP("event_name", "xposting_setting_mutate_attempt");
        A00.AAP("data_source", identifier);
        A00.AAP("source_account_type", A0I.A01);
        A00.Cht();
        mutator.FAJ(c51761Mtk, new AiP(interfaceC196248mG, mutator, this, obj));
    }

    private final EnumC222416a getAccountType() {
        return (EnumC222416a) this.accountType$delegate.getValue();
    }

    private final InterfaceC196038lt getBplCrossPostingSettingDataProvider() {
        return (InterfaceC196038lt) this.bplCrossPostingSettingDataProvider$delegate.getValue();
    }

    private final InterfaceC25194BCr getBplCrossPostingSettingMutator() {
        return (InterfaceC25194BCr) this.bplCrossPostingSettingMutator$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C196228mD getLogger() {
        return (C196228mD) this.logger$delegate.getValue();
    }

    private final InterfaceC196038lt getUnifiedConfigCrossPostingSettingDataProvider() {
        return (InterfaceC196038lt) this.unifiedConfigCrossPostingSettingDataProvider$delegate.getValue();
    }

    private final InterfaceC25194BCr getUnifiedConfigCrossPostingSettingMutator() {
        return (InterfaceC25194BCr) this.unifiedConfigCrossPostingSettingMutator$delegate.getValue();
    }

    public boolean isCrossPostingSettingsPlatformizationReadEnabled() {
        return Boolean.valueOf(C18U.A06(C06090Tz.A05, this.userSession, 36325871316907472L)).booleanValue();
    }

    public boolean isCrossPostingSettingsPlatformizationWriteEnabled() {
        return Boolean.valueOf(C18U.A06(C06090Tz.A05, this.userSession, 36325871316973009L)).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (X.AbstractC196078lx.A02(r4.userSession) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (X.AbstractC196078lx.A00(r1) == X.C05F.A01) goto L18;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.8lt, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC196038lt getDataProvider() {
        /*
            r4 = this;
            X.16a r0 = r4.getAccountType()
            if (r0 == 0) goto L4a
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L20
            r0 = 1
            if (r1 == r0) goto L45
            r0 = 3
            if (r1 != r0) goto L4a
            com.instagram.common.session.UserSession r0 = r4.userSession
            boolean r0 = X.AbstractC196078lx.A02(r0)
            if (r0 == 0) goto L45
        L1b:
            X.8lt r0 = r4.getBplCrossPostingSettingDataProvider()
            return r0
        L20:
            com.instagram.common.session.UserSession r3 = r4.userSession
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36326721720432689(0x810ef600003831, double:3.036503319744519E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1b
            com.instagram.common.session.UserSession r1 = r4.userSession
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            java.lang.Integer r1 = X.AbstractC196078lx.A00(r1)
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto L1b
        L45:
            X.8lt r0 = r4.getUnifiedConfigCrossPostingSettingDataProvider()
            return r0
        L4a:
            X.AiQ r0 = new X.AiQ
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.crossposting.setting.manager.FbAutoCrossPostingSettingManager.getDataProvider():X.8lt");
    }

    public boolean getFeedAutoCrossPostingSettingOn() {
        return getDataProvider().B5Z();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (X.AbstractC196078lx.A02(r4.userSession) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (X.AbstractC196078lx.A00(r1) == X.C05F.A01) goto L18;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.BCr, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC25194BCr getMutator() {
        /*
            r4 = this;
            X.16a r0 = r4.getAccountType()
            if (r0 == 0) goto L4a
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L20
            r0 = 1
            if (r1 == r0) goto L45
            r0 = 3
            if (r1 != r0) goto L4a
            com.instagram.common.session.UserSession r0 = r4.userSession
            boolean r0 = X.AbstractC196078lx.A02(r0)
            if (r0 == 0) goto L45
        L1b:
            X.BCr r0 = r4.getBplCrossPostingSettingMutator()
            return r0
        L20:
            com.instagram.common.session.UserSession r3 = r4.userSession
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36326721720432689(0x810ef600003831, double:3.036503319744519E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1b
            com.instagram.common.session.UserSession r1 = r4.userSession
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            java.lang.Integer r1 = X.AbstractC196078lx.A00(r1)
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto L1b
        L45:
            X.BCr r0 = r4.getUnifiedConfigCrossPostingSettingMutator()
            return r0
        L4a:
            X.AiR r0 = new X.AiR
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.crossposting.setting.manager.FbAutoCrossPostingSettingManager.getMutator():X.BCr");
    }

    public boolean getReelsAutoCrossPostingSettingOn() {
        return getDataProvider().Blx();
    }

    public boolean getStoryAutoCrossPostingSettingOn() {
        return getDataProvider().C1B();
    }

    public void refreshAutoCrossPostingSettings(final InterfaceC196248mG interfaceC196248mG) {
        final String obj = C0HM.A00().toString();
        C14360o3.A07(obj);
        final InterfaceC196038lt dataProvider = getDataProvider();
        C196228mD logger = getLogger();
        String identifier = dataProvider.getIdentifier();
        C18920wW c18920wW = (C18920wW) logger.A01.getValue();
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "cxp_ig_client_sourced_creation");
        EnumC222416a A0I = C17060sy.A01.A01(logger.A00).A0I();
        if (A0I == null) {
            A0I = EnumC222416a.A08;
        }
        A00.AAP(AbstractC50635MWw.A02(42, 10, 0), obj);
        A00.AAP("event_name", "xposting_setting_fetch_attempt");
        A00.AAP("data_source", identifier);
        A00.AAP("source_account_type", A0I.A01);
        A00.Cht();
        dataProvider.ECq(new InterfaceC196248mG() { // from class: X.8mF
            @Override // X.InterfaceC196248mG
            public final void DG4(String str) {
                C196228mD logger2;
                logger2 = this.getLogger();
                String str2 = obj;
                String identifier2 = dataProvider.getIdentifier();
                C18920wW c18920wW2 = (C18920wW) logger2.A01.getValue();
                InterfaceC02590Ai A002 = c18920wW2.A00(c18920wW2.A00, "cxp_ig_client_sourced_creation");
                EnumC222416a A0I2 = C17060sy.A01.A01(logger2.A00).A0I();
                if (A0I2 == null) {
                    A0I2 = EnumC222416a.A08;
                }
                A002.AAP(AbstractC50635MWw.A02(42, 10, 0), str2);
                A002.AAP("event_name", "xposting_setting_fetch_failure");
                A002.AAP("data_source", identifier2);
                A002.AAP("source_account_type", A0I2.A01);
                A002.Cht();
                InterfaceC196248mG interfaceC196248mG2 = InterfaceC196248mG.this;
                if (interfaceC196248mG2 != null) {
                    interfaceC196248mG2.DG4(str);
                }
            }
        });
    }
}
