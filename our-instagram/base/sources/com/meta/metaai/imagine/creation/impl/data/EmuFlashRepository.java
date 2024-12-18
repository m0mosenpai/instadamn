package com.meta.metaai.imagine.creation.impl.data;

import X.C28283CdV;
import X.C7N;
import X.ComponentCallbacks2C28531CiP;
import android.app.Application;
import com.meta.metaai.imagine.service.ImagineNetworkService;

/* loaded from: classes5.dex */
public final class EmuFlashRepository {
    public final Application A00;
    public final C28283CdV A01;
    public final ComponentCallbacks2C28531CiP A02;
    public final C7N A03;
    public final ImagineNetworkService A04;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f7, code lost:
    
        if (r1 == r4) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.CVQ r14, X.InterfaceC23621Ds r15) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.creation.impl.data.EmuFlashRepository.A00(X.CVQ, X.1Ds):java.lang.Object");
    }

    public /* synthetic */ EmuFlashRepository(Application application, C28283CdV c28283CdV, C7N c7n, ImagineNetworkService imagineNetworkService) {
        ComponentCallbacks2C28531CiP componentCallbacks2C28531CiP = new ComponentCallbacks2C28531CiP();
        this.A00 = application;
        this.A04 = imagineNetworkService;
        this.A03 = c7n;
        this.A01 = c28283CdV;
        this.A02 = componentCallbacks2C28531CiP;
        application.registerComponentCallbacks(componentCallbacks2C28531CiP);
    }
}
