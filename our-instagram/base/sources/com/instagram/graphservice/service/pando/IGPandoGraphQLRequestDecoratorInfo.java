package com.instagram.graphservice.service.pando;

import X.AbstractC15660qM;
import X.C14360o3;
import X.C3JU;
import X.C3JV;
import X.C4IG;
import X.C4IH;
import X.C4IJ;
import X.InterfaceC16820sZ;

/* loaded from: classes2.dex */
public final class IGPandoGraphQLRequestDecoratorInfo {
    public static final C4IJ Companion = new Object();
    public final C4IH regionHintEligibilityHelper;
    public final C3JV regionHintStore;
    public final InterfaceC16820sZ requestUrlProvider;

    public IGPandoGraphQLRequestDecoratorInfo(C3JV c3jv, C4IH c4ih, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 3);
        this.regionHintStore = c3jv;
        this.regionHintEligibilityHelper = c4ih;
        this.requestUrlProvider = interfaceC16820sZ;
    }

    public final boolean shouldUseRegionHint(String str) {
        C14360o3.A0B(str, 0);
        C4IH c4ih = this.regionHintEligibilityHelper;
        if (c4ih != null) {
            return ((C4IG) c4ih).A00.contains(str);
        }
        return false;
    }

    public final String getRegionHint() {
        String str;
        C3JV c3jv = this.regionHintStore;
        if (c3jv != null) {
            C3JU c3ju = (C3JU) c3jv;
            synchronized (c3ju) {
                str = c3ju.A00;
            }
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    public final String getRequestUrl() {
        return (String) this.requestUrlProvider.invoke();
    }

    public final String getAcceptLanguageHeader() {
        return AbstractC15660qM.A00();
    }
}
