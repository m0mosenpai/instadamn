package com.instagram.debug.devoptions.section.xme;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC25225BEi;
import X.C05A;
import X.C0eB;
import X.C19L;
import X.C1JX;
import X.C6Z6;
import X.InterfaceC16620sF;
import X.InterfaceC19960yQ;
import X.InterfaceC23621Ds;
import com.instagram.xme.threed.view.IgGltfSceneLayoutView;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.section.xme.Xme3dViewerFragment$onViewCreated$1", f = "Xme3dViewerFragment.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class Xme3dViewerFragment$onViewCreated$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int label;
    public final /* synthetic */ Xme3dViewerFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xme3dViewerFragment$onViewCreated$1(Xme3dViewerFragment xme3dViewerFragment, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.this$0 = xme3dViewerFragment;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new Xme3dViewerFragment$onViewCreated$1(this.this$0, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16620sF
    public final Object invoke(C19L c19l, InterfaceC23621Ds interfaceC23621Ds) {
        return new Xme3dViewerFragment$onViewCreated$1(this.this$0, interfaceC23621Ds).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Xme3dViewModel viewModel;
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
            C05A c05a = viewModel._sampleUrl;
            final Xme3dViewerFragment xme3dViewerFragment = this.this$0;
            InterfaceC19960yQ interfaceC19960yQ = new InterfaceC19960yQ() { // from class: com.instagram.debug.devoptions.section.xme.Xme3dViewerFragment$onViewCreated$1.1
                @Override // X.InterfaceC19960yQ
                public final Object emit(String str, InterfaceC23621Ds interfaceC23621Ds) {
                    Xme3dViewerFragment xme3dViewerFragment2;
                    IgGltfSceneLayoutView igGltfSceneLayoutView;
                    if (str != null && (igGltfSceneLayoutView = (xme3dViewerFragment2 = Xme3dViewerFragment.this).scene) != null) {
                        igGltfSceneLayoutView.setUrl(str, AbstractC166987dD.A0r(xme3dViewerFragment2.session$delegate), C6Z6.A03);
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
