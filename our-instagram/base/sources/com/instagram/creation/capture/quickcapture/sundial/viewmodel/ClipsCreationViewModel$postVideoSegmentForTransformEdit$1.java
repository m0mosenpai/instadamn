package com.instagram.creation.capture.quickcapture.sundial.viewmodel;

import X.AbstractC09560e7;
import X.AbstractC115485Ki;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C115475Kh;
import X.C1816984b;
import X.C1JX;
import X.C206169Az;
import X.C52435NIf;
import X.C84B;
import X.C84S;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel$postVideoSegmentForTransformEdit$1", f = "ClipsCreationViewModel.kt", i = {}, l = {844}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class ClipsCreationViewModel$postVideoSegmentForTransformEdit$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ ClipsCreationViewModel A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipsCreationViewModel$postVideoSegmentForTransformEdit$1(ClipsCreationViewModel clipsCreationViewModel, InterfaceC23621Ds interfaceC23621Ds, float f) {
        super(2, interfaceC23621Ds);
        this.A02 = clipsCreationViewModel;
        this.A01 = f;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new ClipsCreationViewModel$postVideoSegmentForTransformEdit$1(this.A02, interfaceC23621Ds, this.A01);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            C1816984b c1816984b = this.A02.A0P;
            float f = this.A01;
            this.A00 = 1;
            C84S c84s = c1816984b.A02;
            C84B c84b = (C84B) c84s.A03.A03.getValue();
            ArrayList A05 = c84b.A05();
            ArrayList A0q = AbstractC167017dG.A0q(A05);
            Iterator it = A05.iterator();
            while (it.hasNext()) {
                AbstractC115485Ki A06 = ((AbstractC115485Ki) it.next()).A06();
                if (A06 instanceof C115475Kh) {
                    C115475Kh c115475Kh = (C115475Kh) A06;
                    c115475Kh.A0A = new C206169Az(3, 1.0f / f, 0.0f, 0.0f, 0.0f);
                    c115475Kh.A0M = null;
                    c115475Kh.A0N = null;
                } else if (A06 instanceof C52435NIf) {
                    ((C52435NIf) A06).A01 = new C206169Az(3, 1.0f / f, 0.0f, 0.0f, 0.0f);
                }
                A0q.add(A06);
            }
            if (c84s.A05.emit(new C84B(A0q, c84b.A03), this) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ClipsCreationViewModel$postVideoSegmentForTransformEdit$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
