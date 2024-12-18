package com.instagram.creation.capture.quickcapture.sundial.store;

import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C5JI;
import X.InterfaceC16590sC;
import X.InterfaceC23621Ds;
import java.util.HashMap;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.sundial.store.ClipsVirtualVideoStore$audioOverlayVolumeFlow$1", f = "ClipsVirtualVideoStore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class ClipsVirtualVideoStore$audioOverlayVolumeFlow$1 extends AbstractC23611Dp implements InterfaceC16590sC {
    public /* synthetic */ float A00;
    public /* synthetic */ float A01;
    public /* synthetic */ float A02;
    public /* synthetic */ float A03;

    public ClipsVirtualVideoStore$audioOverlayVolumeFlow$1(InterfaceC23621Ds interfaceC23621Ds) {
        super(5, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16590sC
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        float floatValue = ((Number) obj).floatValue();
        float floatValue2 = ((Number) obj2).floatValue();
        float floatValue3 = ((Number) obj3).floatValue();
        float floatValue4 = ((Number) obj4).floatValue();
        ClipsVirtualVideoStore$audioOverlayVolumeFlow$1 clipsVirtualVideoStore$audioOverlayVolumeFlow$1 = new ClipsVirtualVideoStore$audioOverlayVolumeFlow$1((InterfaceC23621Ds) obj5);
        clipsVirtualVideoStore$audioOverlayVolumeFlow$1.A00 = floatValue;
        clipsVirtualVideoStore$audioOverlayVolumeFlow$1.A01 = floatValue2;
        clipsVirtualVideoStore$audioOverlayVolumeFlow$1.A02 = floatValue3;
        clipsVirtualVideoStore$audioOverlayVolumeFlow$1.A03 = floatValue4;
        return clipsVirtualVideoStore$audioOverlayVolumeFlow$1.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.AbJ] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.AbJ] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.AbJ] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.AbJ] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, X.AbJ] */
    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        float f = this.A00;
        float f2 = this.A01;
        float f3 = this.A02;
        float f4 = this.A03;
        HashMap hashMap = new HashMap();
        String str = C5JI.A05.A00;
        ?? obj2 = new Object();
        obj2.A00 = f;
        hashMap.put(str, obj2);
        String str2 = C5JI.A04.A00;
        ?? obj3 = new Object();
        obj3.A00 = f2;
        hashMap.put(str2, obj3);
        String str3 = C5JI.A0A.A00;
        ?? obj4 = new Object();
        obj4.A00 = f3;
        hashMap.put(str3, obj4);
        String str4 = C5JI.A06.A00;
        ?? obj5 = new Object();
        obj5.A00 = f4;
        hashMap.put(str4, obj5);
        String str5 = C5JI.A07.A00;
        ?? obj6 = new Object();
        obj6.A00 = 1.0f;
        hashMap.put(str5, obj6);
        return hashMap;
    }
}
