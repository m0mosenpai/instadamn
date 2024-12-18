package com.facebook.rsys.cowatch.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25226BEj;
import X.AbstractC25228BEl;
import X.AbstractC50523MSb;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class CowatchExternalMediaConfig {
    public final String appSwitchOauthUrl;
    public final String deeplinkUrl;
    public final long hostAppId;

    public static native CowatchExternalMediaConfig createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CowatchExternalMediaConfig)) {
            return false;
        }
        CowatchExternalMediaConfig cowatchExternalMediaConfig = (CowatchExternalMediaConfig) obj;
        return this.hostAppId == cowatchExternalMediaConfig.hostAppId && this.appSwitchOauthUrl.equals(cowatchExternalMediaConfig.appSwitchOauthUrl) && this.deeplinkUrl.equals(cowatchExternalMediaConfig.deeplinkUrl);
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.deeplinkUrl, AbstractC166997dE.A0K(this.appSwitchOauthUrl, JQ0.A01(AbstractC25228BEl.A03(this.hostAppId))));
    }

    public CowatchExternalMediaConfig(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.hostAppId = j;
        this.appSwitchOauthUrl = str;
        this.deeplinkUrl = str2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CowatchExternalMediaConfig{hostAppId=");
        A1C.append(this.hostAppId);
        A1C.append(",appSwitchOauthUrl=");
        A1C.append(this.appSwitchOauthUrl);
        A1C.append(",deeplinkUrl=");
        return AbstractC50523MSb.A0W(this.deeplinkUrl, A1C);
    }
}
