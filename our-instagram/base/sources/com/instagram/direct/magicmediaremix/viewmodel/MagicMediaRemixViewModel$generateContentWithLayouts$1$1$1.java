package com.instagram.direct.magicmediaremix.viewmodel;

import X.AbstractC06950Ym;
import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC23641Du;
import X.AnonymousClass191;
import X.C09530e4;
import X.C0eB;
import X.C12L;
import X.C12T;
import X.C19L;
import X.C1JX;
import X.C43888Jav;
import X.C47365KwG;
import X.C50112Sa;
import X.C60352pJ;
import X.C9ZK;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.InterfaceC71543Iw;
import X.MBl;
import X.MC6;
import com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositorImpl;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixViewModel$generateContentWithLayouts$1$1$1", f = "MagicMediaRemixViewModel.kt", i = {}, l = {274, 277}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class MagicMediaRemixViewModel$generateContentWithLayouts$1$1$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C43888Jav A03;
    public final /* synthetic */ MagicMediaRemixContentCompositorImpl A04;
    public final /* synthetic */ C60352pJ A05;
    public final /* synthetic */ C47365KwG A06;
    public final /* synthetic */ MagicMediaRemixViewModel A07;
    public final /* synthetic */ C9ZK A08;
    public final /* synthetic */ List A09;
    public final /* synthetic */ List A0A;
    public final /* synthetic */ Map A0B;
    public final /* synthetic */ InterfaceC71543Iw A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagicMediaRemixViewModel$generateContentWithLayouts$1$1$1(C43888Jav c43888Jav, MagicMediaRemixContentCompositorImpl magicMediaRemixContentCompositorImpl, C60352pJ c60352pJ, C47365KwG c47365KwG, MagicMediaRemixViewModel magicMediaRemixViewModel, C9ZK c9zk, List list, List list2, Map map, InterfaceC23621Ds interfaceC23621Ds, InterfaceC71543Iw interfaceC71543Iw, int i) {
        super(2, interfaceC23621Ds);
        this.A09 = list;
        this.A07 = magicMediaRemixViewModel;
        this.A08 = c9zk;
        this.A0A = list2;
        this.A05 = c60352pJ;
        this.A0B = map;
        this.A04 = magicMediaRemixContentCompositorImpl;
        this.A03 = c43888Jav;
        this.A02 = i;
        this.A06 = c47365KwG;
        this.A0C = interfaceC71543Iw;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        List list = this.A09;
        MagicMediaRemixViewModel magicMediaRemixViewModel = this.A07;
        C9ZK c9zk = this.A08;
        List list2 = this.A0A;
        C60352pJ c60352pJ = this.A05;
        Map map = this.A0B;
        MagicMediaRemixContentCompositorImpl magicMediaRemixContentCompositorImpl = this.A04;
        MagicMediaRemixViewModel$generateContentWithLayouts$1$1$1 magicMediaRemixViewModel$generateContentWithLayouts$1$1$1 = new MagicMediaRemixViewModel$generateContentWithLayouts$1$1$1(this.A03, magicMediaRemixContentCompositorImpl, c60352pJ, this.A06, magicMediaRemixViewModel, c9zk, list, list2, map, interfaceC23621Ds, this.A0C, this.A02);
        magicMediaRemixViewModel$generateContentWithLayouts$1$1$1.A01 = obj;
        return magicMediaRemixViewModel$generateContentWithLayouts$1$1$1;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Object obj2 = obj;
        C1JX c1jx = C1JX.A02;
        int i = this.A00;
        if (i != 0) {
            if (i != 1) {
                Object obj3 = this.A01;
                AbstractC09560e7.A00(obj2);
                return obj3;
            }
            AbstractC09560e7.A00(obj2);
        } else {
            AbstractC09560e7.A00(obj2);
            C19L c19l = (C19L) this.A01;
            List list = this.A09;
            MagicMediaRemixViewModel magicMediaRemixViewModel = this.A07;
            C9ZK c9zk = this.A08;
            List list2 = this.A0A;
            C60352pJ c60352pJ = this.A05;
            Map map = this.A0B;
            MagicMediaRemixContentCompositorImpl magicMediaRemixContentCompositorImpl = this.A04;
            C50112Sa A02 = AbstractC23641Du.A02(AnonymousClass191.A00, new MBl(this.A03, magicMediaRemixContentCompositorImpl, c60352pJ, this.A06, magicMediaRemixViewModel, c9zk, list, list2, map, null, this.A02), c19l);
            this.A00 = 1;
            obj2 = A02.A0E(this);
            if (obj2 == c1jx) {
                return c1jx;
            }
        }
        InterfaceC71543Iw interfaceC71543Iw = this.A0C;
        C09530e4 A1G = AbstractC06950Ym.A1G((Iterable) obj2);
        C12T c12t = C12L.A00.A03;
        MC6 mc6 = new MC6(A1G, interfaceC71543Iw, (InterfaceC23621Ds) null, 27);
        this.A01 = obj2;
        this.A00 = 2;
        if (AbstractC23641Du.A00(this, c12t, mc6) == c1jx) {
            return c1jx;
        }
        return obj2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MagicMediaRemixViewModel$generateContentWithLayouts$1$1$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
