package com.instagram.analytics.igmconfigs;

import X.C2JS;
import X.C2JT;
import X.C4OK;
import X.C4OM;
import X.C4OU;
import X.C4OW;
import X.C94754Oe;
import X.C95124Py;

/* loaded from: classes2.dex */
public final class IgmConfigSyncQueryResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes2.dex */
    public final class XigViperConfigSync extends C2JS implements C2JT {
        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C95124Py c95124Py = C95124Py.A00;
            return new C4OU(new C4OM[]{new C4OW(c95124Py, "is_ads_enabled"), new C4OW(c95124Py, "is_organic_enabled")});
        }

        public XigViperConfigSync() {
            super(-1634672125);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return new C4OU(new C4OM[]{new C4OW(C94754Oe.A00, "xig_twoMeasurement_platform_config(config_type:$configType)"), new C4OK(XigViperConfigSync.class, "xig_viper_config_sync(config_type:$configType)", -1634672125)});
    }

    public IgmConfigSyncQueryResponseImpl() {
        super(-1358517233);
    }
}
