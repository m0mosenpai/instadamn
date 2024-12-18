package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC12430kl;
import X.C0YY;
import X.C0eB;
import X.C14360o3;
import X.InterfaceC16820sZ;
import X.InterfaceC19620xp;
import X.InterfaceC19630xq;
import X.InterfaceC71543Iw;

/* loaded from: classes11.dex */
public final class SandboxPreferences$observeDevPreference$1$listener$1 implements InterfaceC19620xp {
    public final /* synthetic */ InterfaceC71543Iw $$this$callbackFlow;
    public final /* synthetic */ InterfaceC16820sZ $selector;

    /* renamed from: com.instagram.debug.devoptions.sandboxselector.SandboxPreferences$observeDevPreference$1$listener$1$1, reason: invalid class name */
    /* loaded from: classes11.dex */
    public final class AnonymousClass1 extends C0YY implements InterfaceC16820sZ {
        public final /* synthetic */ InterfaceC71543Iw $$this$callbackFlow;
        public final /* synthetic */ InterfaceC16820sZ $selector;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC71543Iw interfaceC71543Iw, InterfaceC16820sZ interfaceC16820sZ) {
            super(0);
            this.$$this$callbackFlow = interfaceC71543Iw;
            this.$selector = interfaceC16820sZ;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m88invoke() {
            this.$$this$callbackFlow.F8s(this.$selector.invoke());
        }

        @Override // X.InterfaceC16820sZ
        public /* bridge */ /* synthetic */ Object invoke() {
            m88invoke();
            return C0eB.A00;
        }
    }

    public SandboxPreferences$observeDevPreference$1$listener$1(InterfaceC71543Iw interfaceC71543Iw, InterfaceC16820sZ interfaceC16820sZ) {
        this.$$this$callbackFlow = interfaceC71543Iw;
        this.$selector = interfaceC16820sZ;
    }

    @Override // X.InterfaceC19620xp
    public final void onChanged(InterfaceC19630xq interfaceC19630xq, String str) {
        if (C14360o3.A0K(str, "using_dev_server") || C14360o3.A0K(str, "dev_server_name")) {
            AbstractC12430kl.A00("SandboxPreferences.kt-observeDevPReference-2", new AnonymousClass1(this.$$this$callbackFlow, this.$selector));
        }
    }
}
