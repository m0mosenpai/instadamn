package com.instagram.creation.capture.quickcapture.util.phototovideo.saver;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC24481Hr;
import X.C0eB;
import X.C183978Ee;
import X.C198998qz;
import X.C8MP;
import X.D93;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.InterfaceC25207BDf;
import X.LH2;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.util.phototovideo.saver.PhotoToVideoSaver$savePhoto$2", f = "PhotoToVideoSaver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class PhotoToVideoSaver$savePhoto$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ FilterChain A00;
    public final /* synthetic */ AbstractC24481Hr A01;
    public final /* synthetic */ C198998qz A02;
    public final /* synthetic */ InterfaceC25207BDf A03;
    public final /* synthetic */ C8MP A04;
    public final /* synthetic */ C183978Ee A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoToVideoSaver$savePhoto$2(FilterChain filterChain, AbstractC24481Hr abstractC24481Hr, C198998qz c198998qz, InterfaceC25207BDf interfaceC25207BDf, C8MP c8mp, C183978Ee c183978Ee, InterfaceC23621Ds interfaceC23621Ds, boolean z, boolean z2, boolean z3) {
        super(2, interfaceC23621Ds);
        this.A01 = abstractC24481Hr;
        this.A04 = c8mp;
        this.A05 = c183978Ee;
        this.A02 = c198998qz;
        this.A00 = filterChain;
        this.A08 = z;
        this.A07 = z2;
        this.A06 = z3;
        this.A03 = interfaceC25207BDf;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        AbstractC24481Hr abstractC24481Hr = this.A01;
        C8MP c8mp = this.A04;
        C183978Ee c183978Ee = this.A05;
        C198998qz c198998qz = this.A02;
        return new PhotoToVideoSaver$savePhoto$2(this.A00, abstractC24481Hr, c198998qz, this.A03, c8mp, c183978Ee, interfaceC23621Ds, this.A08, this.A07, this.A06);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PhotoToVideoSaver$savePhoto$2) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        AbstractC24481Hr abstractC24481Hr = this.A01;
        String str = null;
        if (abstractC24481Hr != null) {
            try {
                File file = (File) LH2.A01(abstractC24481Hr);
                if (file != null) {
                    str = file.getCanonicalPath();
                }
            } catch (Exception unused) {
            }
        }
        C8MP c8mp = this.A04;
        C183978Ee c183978Ee = this.A05;
        C198998qz c198998qz = this.A02;
        FilterChain filterChain = this.A00;
        boolean z = this.A08;
        boolean z2 = this.A07;
        c8mp.A03.A01(this.A03, c183978Ee.A0h, new D93(null, null, filterChain, c198998qz, c8mp, c183978Ee, str, 0, z, z2, this.A06), z2, !z2);
        return C0eB.A00;
    }
}
