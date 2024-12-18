package com.facebook.gk.sessionless;

import X.C14360o3;
import X.Y3I;
import android.content.Context;
import com.facebook.gk.store.GatekeeperWriter;
import com.facebook.ultralight.UL;

/* loaded from: classes12.dex */
public final class GkSessionlessModule {

    /* loaded from: classes12.dex */
    public final class GkSessionlessModuleSelendroidInjector {
        public final Context A00;

        public GkSessionlessModuleSelendroidInjector(Context context) {
            C14360o3.A0B(context, 1);
            this.A00 = context;
        }

        public final GatekeeperWriter getGatekeeperWriter() {
            return (GatekeeperWriter) Y3I.A00(UL.id._UL__ULSEP_com_facebook_gk_store_GatekeeperWriter_ULSEP_com_facebook_gk_sessionless_Sessionless_ULSEP_BINDING_ID);
        }
    }
}
