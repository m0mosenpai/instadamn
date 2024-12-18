package com.instagram.creation.capture.quickcapture.sundial.sfx.repository;

import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C9ZT;
import X.InterfaceC16610sE;
import X.InterfaceC23621Ds;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.sundial.sfx.repository.CreationSFXRepository$soundEffectsFlow$1", f = "CreationSFXRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class CreationSFXRepository$soundEffectsFlow$1 extends AbstractC23611Dp implements InterfaceC16610sE {
    public /* synthetic */ int A00;
    public /* synthetic */ Object A01;

    public CreationSFXRepository$soundEffectsFlow$1(InterfaceC23621Ds interfaceC23621Ds) {
        super(3, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        CreationSFXRepository$soundEffectsFlow$1 creationSFXRepository$soundEffectsFlow$1 = new CreationSFXRepository$soundEffectsFlow$1((InterfaceC23621Ds) obj3);
        creationSFXRepository$soundEffectsFlow$1.A01 = obj;
        creationSFXRepository$soundEffectsFlow$1.A00 = intValue;
        return creationSFXRepository$soundEffectsFlow$1.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        List list = (List) this.A01;
        int i = this.A00;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            long j = ((C9ZT) obj2).A01;
            if (0 <= j && j <= i) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
