package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC09560e7;
import X.AbstractC12430kl;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC71523Is;
import X.C0YY;
import X.C0eB;
import X.C14360o3;
import X.C17280tP;
import X.C1JX;
import X.InterfaceC16620sF;
import X.InterfaceC16820sZ;
import X.InterfaceC19620xp;
import X.InterfaceC19630xq;
import X.InterfaceC23621Ds;
import X.InterfaceC71543Iw;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.SandboxPreferences$observeCurrentSandbox$$inlined$observeDevPreference$1", f = "SandboxPreferences.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
public final class SandboxPreferences$observeCurrentSandbox$$inlined$observeDevPreference$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SandboxPreferences this$0;
    public final /* synthetic */ SandboxPreferences this$0$inline_fun;

    /* renamed from: com.instagram.debug.devoptions.sandboxselector.SandboxPreferences$observeCurrentSandbox$$inlined$observeDevPreference$1$1, reason: invalid class name */
    /* loaded from: classes11.dex */
    public final class AnonymousClass1 extends C0YY implements InterfaceC16820sZ {
        public final /* synthetic */ InterfaceC71543Iw $$this$callbackFlow;
        public final /* synthetic */ SandboxPreferences this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC71543Iw interfaceC71543Iw, SandboxPreferences sandboxPreferences) {
            super(0);
            this.this$0 = sandboxPreferences;
            this.$$this$callbackFlow = interfaceC71543Iw;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m80invoke() {
            this.$$this$callbackFlow.F8s(this.this$0.getCurrentSandbox());
        }

        @Override // X.InterfaceC16820sZ
        public /* bridge */ /* synthetic */ Object invoke() {
            m80invoke();
            return C0eB.A00;
        }
    }

    /* renamed from: com.instagram.debug.devoptions.sandboxselector.SandboxPreferences$observeCurrentSandbox$$inlined$observeDevPreference$1$3, reason: invalid class name */
    /* loaded from: classes11.dex */
    public final class AnonymousClass3 extends C0YY implements InterfaceC16820sZ {
        public final /* synthetic */ InterfaceC19620xp $listener;
        public final /* synthetic */ SandboxPreferences this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(SandboxPreferences sandboxPreferences, InterfaceC19620xp interfaceC19620xp) {
            super(0);
            this.this$0 = sandboxPreferences;
            this.$listener = interfaceC19620xp;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m82invoke() {
            C17280tP c17280tP = this.this$0.devPrefs;
            InterfaceC19620xp interfaceC19620xp = this.$listener;
            C14360o3.A0B(interfaceC19620xp, 0);
            c17280tP.A00.F9e(interfaceC19620xp);
        }

        @Override // X.InterfaceC16820sZ
        public /* bridge */ /* synthetic */ Object invoke() {
            m82invoke();
            return C0eB.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SandboxPreferences$observeCurrentSandbox$$inlined$observeDevPreference$1(SandboxPreferences sandboxPreferences, InterfaceC23621Ds interfaceC23621Ds, SandboxPreferences sandboxPreferences2) {
        super(2, interfaceC23621Ds);
        this.this$0$inline_fun = sandboxPreferences;
        this.this$0 = sandboxPreferences2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        SandboxPreferences$observeCurrentSandbox$$inlined$observeDevPreference$1 sandboxPreferences$observeCurrentSandbox$$inlined$observeDevPreference$1 = new SandboxPreferences$observeCurrentSandbox$$inlined$observeDevPreference$1(this.this$0$inline_fun, interfaceC23621Ds, this.this$0);
        sandboxPreferences$observeCurrentSandbox$$inlined$observeDevPreference$1.L$0 = obj;
        return sandboxPreferences$observeCurrentSandbox$$inlined$observeDevPreference$1;
    }

    @Override // X.InterfaceC16620sF
    public final Object invoke(InterfaceC71543Iw interfaceC71543Iw, InterfaceC23621Ds interfaceC23621Ds) {
        return ((SandboxPreferences$observeCurrentSandbox$$inlined$observeDevPreference$1) create(interfaceC71543Iw, interfaceC23621Ds)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC09560e7.A00(obj);
            } else {
                throw AbstractC166987dD.A13();
            }
        } else {
            AbstractC09560e7.A00(obj);
            final InterfaceC71543Iw interfaceC71543Iw = (InterfaceC71543Iw) this.L$0;
            AbstractC12430kl.A00("SandboxPreferences.kt-observeDevPreference-1", new AnonymousClass1(interfaceC71543Iw, this.this$0));
            final SandboxPreferences sandboxPreferences = this.this$0;
            InterfaceC19620xp interfaceC19620xp = new InterfaceC19620xp() { // from class: com.instagram.debug.devoptions.sandboxselector.SandboxPreferences$observeCurrentSandbox$$inlined$observeDevPreference$1.2

                /* renamed from: com.instagram.debug.devoptions.sandboxselector.SandboxPreferences$observeCurrentSandbox$$inlined$observeDevPreference$1$2$1, reason: invalid class name */
                /* loaded from: classes11.dex */
                public final class AnonymousClass1 extends C0YY implements InterfaceC16820sZ {
                    public final /* synthetic */ InterfaceC71543Iw $$this$callbackFlow;
                    public final /* synthetic */ SandboxPreferences this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(InterfaceC71543Iw interfaceC71543Iw, SandboxPreferences sandboxPreferences) {
                        super(0);
                        this.this$0 = sandboxPreferences;
                        this.$$this$callbackFlow = interfaceC71543Iw;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m81invoke() {
                        this.$$this$callbackFlow.F8s(this.this$0.getCurrentSandbox());
                    }

                    @Override // X.InterfaceC16820sZ
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m81invoke();
                        return C0eB.A00;
                    }
                }

                @Override // X.InterfaceC19620xp
                public final void onChanged(InterfaceC19630xq interfaceC19630xq, String str) {
                    if (C14360o3.A0K(str, "using_dev_server") || C14360o3.A0K(str, "dev_server_name")) {
                        AbstractC12430kl.A00("SandboxPreferences.kt-observeDevPReference-2", new AnonymousClass1(interfaceC71543Iw, sandboxPreferences));
                    }
                }
            };
            this.this$0$inline_fun.devPrefs.A00.EDW(interfaceC19620xp);
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0$inline_fun, interfaceC19620xp);
            this.label = 1;
            if (AbstractC71523Is.A00(this, anonymousClass3, interfaceC71543Iw) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }
}
