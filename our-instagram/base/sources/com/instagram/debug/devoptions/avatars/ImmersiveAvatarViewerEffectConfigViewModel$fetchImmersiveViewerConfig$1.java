package com.instagram.debug.devoptions.avatars;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC31171DnF;
import X.AbstractC43593JPy;
import X.B4Z;
import X.C00O;
import X.C05A;
import X.C0eB;
import X.C194848jk;
import X.C19L;
import X.C1JX;
import X.C3NX;
import X.C3NY;
import X.C45007Jvx;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.K7s;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerEffectConfigViewModel;
import go.Seq;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerEffectConfigViewModel$fetchImmersiveViewerConfig$1", f = "ImmersiveAvatarViewerEffectConfigViewModel.kt", i = {}, l = {Seq.RefTracker.REF_OFFSET}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class ImmersiveAvatarViewerEffectConfigViewModel$fetchImmersiveViewerConfig$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int label;
    public final /* synthetic */ ImmersiveAvatarViewerEffectConfigViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImmersiveAvatarViewerEffectConfigViewModel$fetchImmersiveViewerConfig$1(ImmersiveAvatarViewerEffectConfigViewModel immersiveAvatarViewerEffectConfigViewModel, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.this$0 = immersiveAvatarViewerEffectConfigViewModel;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new ImmersiveAvatarViewerEffectConfigViewModel$fetchImmersiveViewerConfig$1(this.this$0, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16620sF
    public final Object invoke(C19L c19l, InterfaceC23621Ds interfaceC23621Ds) {
        return new ImmersiveAvatarViewerEffectConfigViewModel$fetchImmersiveViewerConfig$1(this.this$0, interfaceC23621Ds).invokeSuspend(C0eB.A00);
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
            ImmersiveAvatarViewerEffectConfigViewModel immersiveAvatarViewerEffectConfigViewModel = this.this$0;
            ImmersiveAvatarConfigRepository immersiveAvatarConfigRepository = immersiveAvatarViewerEffectConfigViewModel.repository;
            UserSession userSession = immersiveAvatarViewerEffectConfigViewModel.userSession;
            this.label = 1;
            obj = immersiveAvatarConfigRepository.createImmersiveAvatarHomeConfigRequest(userSession, this);
            if (obj == c1jx) {
                return c1jx;
            }
        }
        Object obj2 = (C3NY) obj;
        ImmersiveAvatarViewerEffectConfigViewModel immersiveAvatarViewerEffectConfigViewModel2 = this.this$0;
        if (obj2 instanceof C3NX) {
            K7s k7s = (K7s) ((C3NX) obj2).A00;
            C05A c05a = immersiveAvatarViewerEffectConfigViewModel2._effectConfig;
            C45007Jvx c45007Jvx = k7s.A00;
            if (c45007Jvx == null) {
                AbstractC31171DnF.A0w();
                throw C00O.createAndThrow();
            }
            obj2 = AbstractC43593JPy.A0m(new ImmersiveAvatarViewerEffectConfigViewModel.EffectConfigViewState(true, c45007Jvx.A00), c05a);
        } else if (!(obj2 instanceof C194848jk)) {
            throw B4Z.A00();
        }
        ImmersiveAvatarViewerEffectConfigViewModel immersiveAvatarViewerEffectConfigViewModel3 = this.this$0;
        if (!(obj2 instanceof C3NX)) {
            if (obj2 instanceof C194848jk) {
                immersiveAvatarViewerEffectConfigViewModel3._effectConfig.Egh(new ImmersiveAvatarViewerEffectConfigViewModel.EffectConfigViewState(true, null));
            } else {
                throw B4Z.A00();
            }
        }
        return C0eB.A00;
    }
}
