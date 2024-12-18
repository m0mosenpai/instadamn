package com.instagram.pando.parsing;

import X.AnonymousClass506;
import X.C09170dP;
import X.InterfaceC13050lr;
import com.facebook.jni.HybridClassBase;
import com.facebook.pando.PandoConsistencyServiceJNI;

/* loaded from: classes7.dex */
public class IgPandoServiceJNI extends HybridClassBase implements AnonymousClass506, InterfaceC13050lr {
    public static native IgPandoServiceJNI create(PandoConsistencyServiceJNI pandoConsistencyServiceJNI);

    @Override // X.AnonymousClass506
    public native IgPandoApiFrameworkParserJNI createApiFrameworkParser(boolean z);

    @Override // X.InterfaceC13050lr
    public void onUserSessionWillEnd(@Deprecated boolean z) {
    }

    static {
        C09170dP.A0C("pando-parsing-instagram-jni");
    }
}
