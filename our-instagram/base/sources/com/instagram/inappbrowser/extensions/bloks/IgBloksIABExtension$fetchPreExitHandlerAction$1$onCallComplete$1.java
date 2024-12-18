package com.instagram.inappbrowser.extensions.bloks;

import X.AbstractC09560e7;
import X.AbstractC192918gX;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C1338462s;
import X.C60961Rcj;
import X.C66246U5q;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.inappbrowser.extensions.bloks.IgBloksIABExtension$fetchPreExitHandlerAction$1$onCallComplete$1", f = "IgBloksIABExtension.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
public final class IgBloksIABExtension$fetchPreExitHandlerAction$1$onCallComplete$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ C60961Rcj A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgBloksIABExtension$fetchPreExitHandlerAction$1$onCallComplete$1(C60961Rcj c60961Rcj, String str, String str2, String str3, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A00 = c60961Rcj;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new IgBloksIABExtension$fetchPreExitHandlerAction$1$onCallComplete$1(this.A00, this.A03, this.A02, this.A01, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((IgBloksIABExtension$fetchPreExitHandlerAction$1$onCallComplete$1) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        C60961Rcj c60961Rcj = this.A00;
        AtomicReference atomicReference = c60961Rcj.A06;
        String str = this.A03;
        C66246U5q c66246U5q = null;
        if (str != null) {
            try {
                C1338462s A00 = AbstractC192918gX.A00(c60961Rcj.A07, str, null);
                if (A00 != null) {
                    c66246U5q = C66246U5q.A00(A00);
                }
            } catch (Exception unused) {
            }
        }
        atomicReference.set(c66246U5q);
        AtomicReference atomicReference2 = c60961Rcj.A05;
        String str2 = this.A02;
        C66246U5q c66246U5q2 = null;
        if (str2 != null) {
            try {
                C1338462s A002 = AbstractC192918gX.A00(c60961Rcj.A07, str2, null);
                if (A002 != null) {
                    c66246U5q2 = C66246U5q.A00(A002);
                }
            } catch (Exception unused2) {
            }
        }
        atomicReference2.set(c66246U5q2);
        AtomicReference atomicReference3 = c60961Rcj.A04;
        String str3 = this.A01;
        C66246U5q c66246U5q3 = null;
        if (str3 != null) {
            try {
                C1338462s A003 = AbstractC192918gX.A00(c60961Rcj.A07, str3, null);
                if (A003 != null) {
                    c66246U5q3 = C66246U5q.A00(A003);
                }
            } catch (Exception unused3) {
            }
        }
        atomicReference3.set(c66246U5q3);
        return C0eB.A00;
    }
}
