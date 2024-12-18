package com.facebook.react.modules.i18nmanager;

import X.AbstractC166987dD;
import X.AbstractC25232BEp;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.AbstractC58323PtF;
import X.C14360o3;
import X.R3M;
import com.facebook.fbreact.specs.NativeI18nManagerSpec;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Locale;
import java.util.Map;

@ReactModule(name = NativeI18nManagerSpec.NAME)
/* loaded from: classes10.dex */
public final class I18nManagerModule extends NativeI18nManagerSpec {
    public I18nManagerModule(R3M r3m) {
        super(r3m);
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public void allowRTL(boolean z) {
        R3M A0b = AbstractC58321PtD.A0b(this);
        C14360o3.A07(A0b);
        AbstractC58323PtF.A12(A0b, "RCTI18nUtil_allowRTL", z);
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public void forceRTL(boolean z) {
        R3M A0b = AbstractC58321PtD.A0b(this);
        C14360o3.A07(A0b);
        AbstractC58323PtF.A12(A0b, "RCTI18nUtil_forceRTL", z);
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public Map getTypedExportedConstants() {
        R3M A0b = AbstractC58321PtD.A0b(this);
        Locale locale = AbstractC58319PtB.A08(A0b).getLocales().get(0);
        I18nUtil i18nUtil = I18nUtil.A00;
        return AbstractC25232BEp.A1F("localeIdentifier", locale.toString(), AbstractC166987dD.A1L("isRTL", Boolean.valueOf(i18nUtil.A01(A0b))), AbstractC166987dD.A1L("doLeftAndRightSwapInRTL", Boolean.valueOf(i18nUtil.A00(A0b))));
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public void swapLeftAndRightInRTL(boolean z) {
        R3M A0b = AbstractC58321PtD.A0b(this);
        C14360o3.A07(A0b);
        AbstractC58323PtF.A12(A0b, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", z);
    }
}
