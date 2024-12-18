package com.facebook.content;

import X.C00O;
import X.Y4b;
import android.content.Context;
import com.facebook.ultralight.UL;

/* loaded from: classes12.dex */
public abstract class ContentModule {

    /* loaded from: classes10.dex */
    public class ContentModuleSelendroidInjector {
        public final Context A00;

        public SecureContextHelper getSecureContextHelper() {
            return (SecureContextHelper) Y4b.A00(UL.id._UL__ULSEP_com_facebook_content_SecureContextHelper_ULSEP_BINDING_ID);
        }

        public ContentModuleSelendroidInjector(Context context) {
            this.A00 = context;
        }
    }

    public ContentModule() {
        throw C00O.createAndThrow();
    }
}
