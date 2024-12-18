package com.instagram.direct.magicmediaremix.viewmodel;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C43888Jav;
import X.C47365KwG;
import X.C60352pJ;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositorImpl;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixViewModel$generateContentWithLayouts$1", f = "MagicMediaRemixViewModel.kt", i = {0, 1, 1, 1}, l = {238, 245}, m = "invokeSuspend", n = {"$this$channelFlow", "$this$channelFlow", "layoutsByType", "destination$iv$iv"}, s = {"L$0", "L$0", "L$1", "L$9"})
/* loaded from: classes8.dex */
public final class MagicMediaRemixViewModel$generateContentWithLayouts$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public Object A0B;
    public Object A0C;
    public /* synthetic */ Object A0D;
    public final /* synthetic */ int A0E;
    public final /* synthetic */ C43888Jav A0F;
    public final /* synthetic */ MagicMediaRemixContentCompositorImpl A0G;
    public final /* synthetic */ C60352pJ A0H;
    public final /* synthetic */ C47365KwG A0I;
    public final /* synthetic */ MagicMediaRemixViewModel A0J;
    public final /* synthetic */ List A0K;
    public final /* synthetic */ List A0L;
    public final /* synthetic */ List A0M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagicMediaRemixViewModel$generateContentWithLayouts$1(C43888Jav c43888Jav, MagicMediaRemixContentCompositorImpl magicMediaRemixContentCompositorImpl, C60352pJ c60352pJ, C47365KwG c47365KwG, MagicMediaRemixViewModel magicMediaRemixViewModel, List list, List list2, List list3, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A0M = list;
        this.A0L = list2;
        this.A0J = magicMediaRemixViewModel;
        this.A0K = list3;
        this.A0H = c60352pJ;
        this.A0G = magicMediaRemixContentCompositorImpl;
        this.A0F = c43888Jav;
        this.A0E = i;
        this.A0I = c47365KwG;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        List list = this.A0M;
        List list2 = this.A0L;
        MagicMediaRemixViewModel magicMediaRemixViewModel = this.A0J;
        List list3 = this.A0K;
        C60352pJ c60352pJ = this.A0H;
        MagicMediaRemixContentCompositorImpl magicMediaRemixContentCompositorImpl = this.A0G;
        MagicMediaRemixViewModel$generateContentWithLayouts$1 magicMediaRemixViewModel$generateContentWithLayouts$1 = new MagicMediaRemixViewModel$generateContentWithLayouts$1(this.A0F, magicMediaRemixContentCompositorImpl, c60352pJ, this.A0I, magicMediaRemixViewModel, list, list2, list3, interfaceC23621Ds, this.A0E);
        magicMediaRemixViewModel$generateContentWithLayouts$1.A0D = obj;
        return magicMediaRemixViewModel$generateContentWithLayouts$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x004b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0097 -> B:5:0x0042). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixViewModel$generateContentWithLayouts$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MagicMediaRemixViewModel$generateContentWithLayouts$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
