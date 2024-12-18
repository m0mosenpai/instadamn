package com.instagram.debug.devoptions.avatars;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC25225BEi;
import X.C00O;
import X.C05A;
import X.C07S;
import X.C07T;
import X.C07X;
import X.C0eB;
import X.C14360o3;
import X.C19L;
import X.C1JX;
import X.C3HN;
import X.C55555Olp;
import X.InterfaceC16620sF;
import X.InterfaceC19960yQ;
import X.InterfaceC23621Ds;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerEffectConfigViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment$observeEffectConfigChanges$$inlined$launchAndRepeatWithViewLifecycle$default$1", f = "ImmersiveAvatarViewerDebugFragment.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class ImmersiveAvatarViewerDebugFragment$observeEffectConfigChanges$$inlined$launchAndRepeatWithViewLifecycle$default$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ C07S $minActiveState;
    public final /* synthetic */ C07X $this_launchAndRepeatWithLifecycle;
    public int label;
    public final /* synthetic */ ImmersiveAvatarViewerDebugFragment this$0;

    @DebugMetadata(c = "com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment$observeEffectConfigChanges$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", f = "ImmersiveAvatarViewerDebugFragment.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment$observeEffectConfigChanges$$inlined$launchAndRepeatWithViewLifecycle$default$1$1, reason: invalid class name */
    /* loaded from: classes8.dex */
    public final class AnonymousClass1 extends AbstractC23611Dp implements InterfaceC16620sF {
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ ImmersiveAvatarViewerDebugFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC23621Ds interfaceC23621Ds, ImmersiveAvatarViewerDebugFragment immersiveAvatarViewerDebugFragment) {
            super(2, interfaceC23621Ds);
            this.this$0 = immersiveAvatarViewerDebugFragment;
        }

        @Override // X.C1Dr
        public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC23621Ds, this.this$0);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X.InterfaceC16620sF
        public final Object invoke(C19L c19l, InterfaceC23621Ds interfaceC23621Ds) {
            return ((AnonymousClass1) create(c19l, interfaceC23621Ds)).invokeSuspend(C0eB.A00);
        }

        @Override // X.C1Dr
        public final Object invokeSuspend(Object obj) {
            ImmersiveAvatarViewerEffectConfigViewModel viewModel;
            C1JX c1jx = C1JX.A02;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw AbstractC166987dD.A13();
                }
                AbstractC09560e7.A00(obj);
            } else {
                AbstractC09560e7.A00(obj);
                viewModel = this.this$0.getViewModel();
                C05A c05a = viewModel._effectConfig;
                final ImmersiveAvatarViewerDebugFragment immersiveAvatarViewerDebugFragment = this.this$0;
                InterfaceC19960yQ interfaceC19960yQ = new InterfaceC19960yQ() { // from class: com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment$observeEffectConfigChanges$1$1
                    @Override // X.InterfaceC19960yQ
                    public final Object emit(ImmersiveAvatarViewerEffectConfigViewModel.EffectConfigViewState effectConfigViewState, InterfaceC23621Ds interfaceC23621Ds) {
                        String str;
                        if (effectConfigViewState.isLoaded && (str = effectConfigViewState.effectId) != null) {
                            ImmersiveAvatarViewerDebugFragment immersiveAvatarViewerDebugFragment2 = ImmersiveAvatarViewerDebugFragment.this;
                            C55555Olp c55555Olp = immersiveAvatarViewerDebugFragment2.richAvatarViewHandler;
                            if (c55555Olp == null) {
                                C14360o3.A0F("richAvatarViewHandler");
                                throw C00O.createAndThrow();
                            }
                            c55555Olp.A01(immersiveAvatarViewerDebugFragment2.requireContext(), str);
                        }
                        return C0eB.A00;
                    }
                };
                this.label = 1;
                if (c05a.collect(interfaceC19960yQ, this) == c1jx) {
                    return c1jx;
                }
            }
            throw AbstractC25225BEi.A19();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImmersiveAvatarViewerDebugFragment$observeEffectConfigChanges$$inlined$launchAndRepeatWithViewLifecycle$default$1(C07X c07x, C07S c07s, InterfaceC23621Ds interfaceC23621Ds, ImmersiveAvatarViewerDebugFragment immersiveAvatarViewerDebugFragment) {
        super(2, interfaceC23621Ds);
        this.$this_launchAndRepeatWithLifecycle = c07x;
        this.$minActiveState = c07s;
        this.this$0 = immersiveAvatarViewerDebugFragment;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new ImmersiveAvatarViewerDebugFragment$observeEffectConfigChanges$$inlined$launchAndRepeatWithViewLifecycle$default$1(this.$this_launchAndRepeatWithLifecycle, this.$minActiveState, interfaceC23621Ds, this.this$0);
    }

    @Override // X.InterfaceC16620sF
    public final Object invoke(C19L c19l, InterfaceC23621Ds interfaceC23621Ds) {
        return ((ImmersiveAvatarViewerDebugFragment$observeEffectConfigChanges$$inlined$launchAndRepeatWithViewLifecycle$default$1) create(c19l, interfaceC23621Ds)).invokeSuspend(C0eB.A00);
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
            C07T lifecycle = this.$this_launchAndRepeatWithLifecycle.getLifecycle();
            C07S c07s = this.$minActiveState;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.this$0);
            this.label = 1;
            if (C3HN.A00(c07s, lifecycle, this, anonymousClass1) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }
}
