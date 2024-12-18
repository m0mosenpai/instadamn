package com.instagram.creation.capture.quickcapture.ourstory.viewmodel;

import X.AbstractC001900j;
import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AnonymousClass016;
import X.C0eB;
import X.C189438aN;
import X.C206429Bz;
import X.InterfaceC16600sD;
import X.InterfaceC23621Ds;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.ourstory.viewmodel.OurStoryPostCaptureViewModel$viewState$1", f = "OurStoryPostCaptureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class OurStoryPostCaptureViewModel$viewState$1 extends AbstractC23611Dp implements InterfaceC16600sD {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;

    public OurStoryPostCaptureViewModel$viewState$1(InterfaceC23621Ds interfaceC23621Ds) {
        super(4, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        OurStoryPostCaptureViewModel$viewState$1 ourStoryPostCaptureViewModel$viewState$1 = new OurStoryPostCaptureViewModel$viewState$1((InterfaceC23621Ds) obj4);
        ourStoryPostCaptureViewModel$viewState$1.A00 = obj;
        ourStoryPostCaptureViewModel$viewState$1.A01 = obj2;
        ourStoryPostCaptureViewModel$viewState$1.A02 = obj3;
        return ourStoryPostCaptureViewModel$viewState$1.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        String str = (String) this.A00;
        List list = (List) this.A01;
        C206429Bz c206429Bz = (C206429Bz) this.A02;
        int size = list.size();
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass016.A16(((DirectShareTarget) it.next()).A0B(), A1E);
        }
        boolean z = true;
        if (!(!AbstractC001900j.A0T(str)) || list.size() < 1) {
            z = false;
        }
        return new C189438aN(c206429Bz, str, A1E, size, z);
    }
}
