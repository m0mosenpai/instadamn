package com.instagram.creation.ml;

import X.ACP;
import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC16960so;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C193118gr;
import X.C25091B8n;
import X.C9VD;
import X.C9VE;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.ml.VisualFeatureStore$extractSceneConceptsFromCenterVideoFrame$2", f = "VisualFeatureStore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class VisualFeatureStore$extractSceneConceptsFromCenterVideoFrame$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ long A00;
    public final /* synthetic */ VisualFeatureStore A01;
    public final /* synthetic */ String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VisualFeatureStore$extractSceneConceptsFromCenterVideoFrame$2(VisualFeatureStore visualFeatureStore, String str, InterfaceC23621Ds interfaceC23621Ds, long j) {
        super(2, interfaceC23621Ds);
        this.A01 = visualFeatureStore;
        this.A02 = str;
        this.A00 = j;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new VisualFeatureStore$extractSceneConceptsFromCenterVideoFrame$2(this.A01, this.A02, interfaceC23621Ds, this.A00);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((VisualFeatureStore$extractSceneConceptsFromCenterVideoFrame$2) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        VisualFeatureStore visualFeatureStore = this.A01;
        C193118gr c193118gr = visualFeatureStore.A00;
        if (c193118gr != null || (c193118gr = VisualFeatureStore.A01(visualFeatureStore)) != null) {
            String str = this.A02;
            VisualFeatureStore.A02(c193118gr.A03(new ACP(AbstractC166987dD.A1J("CONCEPT_SCORES")), AbstractC16960so.A1Q(new C9VE(str), new C9VD(this.A00)), C25091B8n.A00), visualFeatureStore, str);
        }
        return C0eB.A00;
    }
}
