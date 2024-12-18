package com.instagram.creation.capture.quickcapture.sundial.edit;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC23611Dp;
import X.C00O;
import X.C0eB;
import X.C14360o3;
import X.C187358Sd;
import X.InterfaceC16610sE;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment$onViewCreated$40", f = "ClipsStackedTimelineFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class ClipsStackedTimelineFragment$onViewCreated$40 extends AbstractC23611Dp implements InterfaceC16610sE {
    public /* synthetic */ int A00;
    public /* synthetic */ int A01;
    public final /* synthetic */ ClipsStackedTimelineFragment A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipsStackedTimelineFragment$onViewCreated$40(ClipsStackedTimelineFragment clipsStackedTimelineFragment, InterfaceC23621Ds interfaceC23621Ds) {
        super(3, interfaceC23621Ds);
        this.A02 = clipsStackedTimelineFragment;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int A0H = AbstractC166987dD.A0H(obj);
        int A0H2 = AbstractC166987dD.A0H(obj2);
        ClipsStackedTimelineFragment$onViewCreated$40 clipsStackedTimelineFragment$onViewCreated$40 = new ClipsStackedTimelineFragment$onViewCreated$40(this.A02, (InterfaceC23621Ds) obj3);
        clipsStackedTimelineFragment$onViewCreated$40.A00 = A0H;
        clipsStackedTimelineFragment$onViewCreated$40.A01 = A0H2;
        return clipsStackedTimelineFragment$onViewCreated$40.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        String str;
        AbstractC09560e7.A00(obj);
        int i = this.A00;
        int i2 = this.A01;
        ClipsStackedTimelineFragment clipsStackedTimelineFragment = this.A02;
        ClipsStackedTimelineViewController clipsStackedTimelineViewController = clipsStackedTimelineFragment.A0F;
        if (clipsStackedTimelineViewController == null) {
            str = "viewController";
        } else {
            boolean z = true;
            boolean A1O = AbstractC167007dF.A1O(i);
            if (i2 <= 0) {
                z = false;
            }
            C187358Sd c187358Sd = clipsStackedTimelineFragment.A0d;
            if (c187358Sd == null) {
                str = "clipsTimelineEditorViewModel";
            } else {
                clipsStackedTimelineViewController.A0W(c187358Sd.A0E(), A1O, z);
                return C0eB.A00;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
