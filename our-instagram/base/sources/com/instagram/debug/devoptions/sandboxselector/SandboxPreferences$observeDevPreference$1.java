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
import X.InterfaceC23621Ds;
import X.InterfaceC71543Iw;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.SandboxPreferences$observeDevPreference$1", f = "SandboxPreferences.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
public final class SandboxPreferences$observeDevPreference$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ InterfaceC16820sZ $selector;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SandboxPreferences this$0;

    /* renamed from: com.instagram.debug.devoptions.sandboxselector.SandboxPreferences$observeDevPreference$1$1, reason: invalid class name */
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
        public final void m86invoke() {
            this.$$this$callbackFlow.F8s(this.$selector.invoke());
        }

        @Override // X.InterfaceC16820sZ
        public /* bridge */ /* synthetic */ Object invoke() {
            m86invoke();
            return C0eB.A00;
        }
    }

    /* renamed from: com.instagram.debug.devoptions.sandboxselector.SandboxPreferences$observeDevPreference$1$2, reason: invalid class name */
    /* loaded from: classes11.dex */
    public final class AnonymousClass2 extends C0YY implements InterfaceC16820sZ {
        public final /* synthetic */ InterfaceC19620xp $listener;
        public final /* synthetic */ SandboxPreferences this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SandboxPreferences sandboxPreferences, InterfaceC19620xp interfaceC19620xp) {
            super(0);
            this.this$0 = sandboxPreferences;
            this.$listener = interfaceC19620xp;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m87invoke() {
            C17280tP c17280tP = this.this$0.devPrefs;
            InterfaceC19620xp interfaceC19620xp = this.$listener;
            C14360o3.A0B(interfaceC19620xp, 0);
            c17280tP.A00.F9e(interfaceC19620xp);
        }

        @Override // X.InterfaceC16820sZ
        public /* bridge */ /* synthetic */ Object invoke() {
            m87invoke();
            return C0eB.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SandboxPreferences$observeDevPreference$1(SandboxPreferences sandboxPreferences, InterfaceC16820sZ interfaceC16820sZ, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.this$0 = sandboxPreferences;
        this.$selector = interfaceC16820sZ;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        SandboxPreferences$observeDevPreference$1 sandboxPreferences$observeDevPreference$1 = new SandboxPreferences$observeDevPreference$1(this.this$0, this.$selector, interfaceC23621Ds);
        sandboxPreferences$observeDevPreference$1.L$0 = obj;
        return sandboxPreferences$observeDevPreference$1;
    }

    @Override // X.InterfaceC16620sF
    public final Object invoke(InterfaceC71543Iw interfaceC71543Iw, InterfaceC23621Ds interfaceC23621Ds) {
        return ((SandboxPreferences$observeDevPreference$1) create(interfaceC71543Iw, interfaceC23621Ds)).invokeSuspend(C0eB.A00);
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
            InterfaceC71543Iw interfaceC71543Iw = (InterfaceC71543Iw) this.L$0;
            AbstractC12430kl.A00("SandboxPreferences.kt-observeDevPreference-1", new AnonymousClass1(interfaceC71543Iw, this.$selector));
            SandboxPreferences$observeDevPreference$1$listener$1 sandboxPreferences$observeDevPreference$1$listener$1 = new SandboxPreferences$observeDevPreference$1$listener$1(interfaceC71543Iw, this.$selector);
            this.this$0.devPrefs.A00.EDW(sandboxPreferences$observeDevPreference$1$listener$1);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, sandboxPreferences$observeDevPreference$1$listener$1);
            this.label = 1;
            if (AbstractC71523Is.A00(this, anonymousClass2, interfaceC71543Iw) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        InterfaceC71543Iw interfaceC71543Iw = (InterfaceC71543Iw) this.L$0;
        AbstractC12430kl.A00("SandboxPreferences.kt-observeDevPreference-1", new AnonymousClass1(interfaceC71543Iw, this.$selector));
        SandboxPreferences$observeDevPreference$1$listener$1 sandboxPreferences$observeDevPreference$1$listener$1 = new SandboxPreferences$observeDevPreference$1$listener$1(interfaceC71543Iw, this.$selector);
        this.this$0.devPrefs.A00.EDW(sandboxPreferences$observeDevPreference$1$listener$1);
        AbstractC71523Is.A00(this, new AnonymousClass2(this.this$0, sandboxPreferences$observeDevPreference$1$listener$1), interfaceC71543Iw);
        return C0eB.A00;
    }
}
