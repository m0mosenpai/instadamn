package com.instagram.creation.capture.quickcapture.save;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C1JX;
import X.C73461YEe;
import X.InterfaceC16620sF;
import X.InterfaceC16820sZ;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.save.CachingVideoSaver$renderInternal$2", f = "CachingVideoSaver.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class CachingVideoSaver$renderInternal$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ CachingVideoSaver A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ InterfaceC16820sZ A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachingVideoSaver$renderInternal$2(CachingVideoSaver cachingVideoSaver, String str, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ, int i) {
        super(2, interfaceC23621Ds);
        this.A02 = cachingVideoSaver;
        this.A04 = interfaceC16820sZ;
        this.A03 = str;
        this.A01 = i;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new CachingVideoSaver$renderInternal$2(this.A02, this.A03, interfaceC23621Ds, this.A04, this.A01);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            CachingVideoSaver cachingVideoSaver = this.A02;
            InterfaceC16820sZ interfaceC16820sZ = this.A04;
            C73461YEe c73461YEe = new C73461YEe(cachingVideoSaver, this.A03, this.A01);
            this.A00 = 1;
            if (CachingVideoSaver.A00(cachingVideoSaver, c73461YEe, this, interfaceC16820sZ) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CachingVideoSaver$renderInternal$2) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
