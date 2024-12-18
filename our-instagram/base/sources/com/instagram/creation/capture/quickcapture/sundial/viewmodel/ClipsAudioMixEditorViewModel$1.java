package com.instagram.creation.capture.quickcapture.sundial.viewmodel;

import X.AbstractC001800i;
import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C0s8;
import X.C51666Mrx;
import X.C54633OBi;
import X.InterfaceC23621Ds;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsAudioMixEditorViewModel$1", f = "ClipsAudioMixEditorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class ClipsAudioMixEditorViewModel$1 extends AbstractC23611Dp implements C0s8 {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ Object A03;
    public /* synthetic */ Object A04;
    public /* synthetic */ Object A05;
    public /* synthetic */ Object A06;

    public ClipsAudioMixEditorViewModel$1(InterfaceC23621Ds interfaceC23621Ds) {
        super(8, interfaceC23621Ds);
    }

    @Override // X.C0s8
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        ClipsAudioMixEditorViewModel$1 clipsAudioMixEditorViewModel$1 = new ClipsAudioMixEditorViewModel$1((InterfaceC23621Ds) obj8);
        clipsAudioMixEditorViewModel$1.A00 = obj;
        clipsAudioMixEditorViewModel$1.A01 = obj2;
        clipsAudioMixEditorViewModel$1.A02 = obj3;
        clipsAudioMixEditorViewModel$1.A03 = obj4;
        clipsAudioMixEditorViewModel$1.A04 = obj5;
        clipsAudioMixEditorViewModel$1.A05 = obj6;
        clipsAudioMixEditorViewModel$1.A06 = obj7;
        return clipsAudioMixEditorViewModel$1.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        Collection collection = (Collection) this.A00;
        Object obj2 = this.A01;
        Iterable iterable = (Iterable) this.A02;
        Object obj3 = this.A03;
        Object obj4 = this.A04;
        C54633OBi c54633OBi = (C54633OBi) this.A05;
        Object obj5 = this.A06;
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.addAll(collection);
        if (obj2 != null) {
            A1E.add(obj2);
        }
        A1E.addAll(AbstractC001800i.A0X(iterable));
        if (obj3 != null) {
            A1E.add(obj3);
        }
        if (obj4 != null) {
            A1E.add(obj4);
        }
        if (obj5 != null) {
            A1E.add(obj5);
        }
        return new C51666Mrx(c54633OBi.A00, A1E, c54633OBi.A03, c54633OBi.A01, c54633OBi.A02);
    }
}
