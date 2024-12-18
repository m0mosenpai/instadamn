package com.instagram.preferences.device;

import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.C0K8;
import X.C0eB;
import X.C14360o3;
import X.C16920sk;
import X.C1JX;
import X.InterfaceC16610sE;
import X.InterfaceC19960yQ;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.preferences.device.AppRestartLoggerPrefs$model$2$1", f = "AppRestartLoggerPrefs.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class AppRestartLoggerPrefs$model$2$1 extends AbstractC23611Dp implements InterfaceC16610sE {
    public int A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;

    public AppRestartLoggerPrefs$model$2$1(InterfaceC23621Ds interfaceC23621Ds) {
        super(3, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        AppRestartLoggerPrefs$model$2$1 appRestartLoggerPrefs$model$2$1 = new AppRestartLoggerPrefs$model$2$1((InterfaceC23621Ds) obj3);
        appRestartLoggerPrefs$model$2$1.A01 = obj;
        appRestartLoggerPrefs$model$2$1.A02 = obj2;
        return appRestartLoggerPrefs$model$2$1.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            InterfaceC19960yQ interfaceC19960yQ = (InterfaceC19960yQ) this.A01;
            C0K8.A0F("AppRestartLoggerPrefs", "Error fetching data from DataStore", (Throwable) this.A02);
            C16920sk c16920sk = C16920sk.A00;
            C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
            this.A01 = null;
            this.A00 = 1;
            if (interfaceC19960yQ.emit(c16920sk, this) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }
}
