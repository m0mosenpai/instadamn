package com.facebook.react.modules.debug;

import X.AbstractC05810Sj;
import X.AbstractC167007dF;
import X.AbstractC58321PtD;
import X.C14360o3;
import X.R3L;
import X.R3M;
import com.facebook.fbreact.specs.NativeSourceCodeSpec;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Map;

@ReactModule(name = NativeSourceCodeSpec.NAME)
/* loaded from: classes10.dex */
public final class SourceCodeModule extends NativeSourceCodeSpec {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourceCodeModule(R3M r3m) {
        super(r3m);
        C14360o3.A0B(r3m, 1);
    }

    @Override // com.facebook.fbreact.specs.NativeSourceCodeSpec
    public Map getTypedExportedConstants() {
        String str;
        CatalystInstance catalystInstance = ((R3L) AbstractC58321PtD.A0b(this)).A00;
        if (catalystInstance == null) {
            str = null;
        } else {
            str = ((CatalystInstanceImpl) catalystInstance).mSourceURL;
        }
        AbstractC05810Sj.A01(str, "No source URL loaded, have you initialised the instance?");
        return AbstractC167007dF.A0n("scriptURL", str);
    }
}
