package com.instagram.creation.capture.quickcapture.util.phototovideo.saver;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C183978Ee;
import X.C198998qz;
import X.C8MP;
import X.D93;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.InterfaceC25207BDf;
import android.graphics.Bitmap;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.util.phototovideo.saver.PhotoToVideoSaver$savePhoto$1", f = "PhotoToVideoSaver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class PhotoToVideoSaver$savePhoto$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ Bitmap A01;
    public final /* synthetic */ FilterChain A02;
    public final /* synthetic */ C198998qz A03;
    public final /* synthetic */ InterfaceC25207BDf A04;
    public final /* synthetic */ C8MP A05;
    public final /* synthetic */ C183978Ee A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoToVideoSaver$savePhoto$1(Bitmap bitmap, Bitmap bitmap2, FilterChain filterChain, C198998qz c198998qz, InterfaceC25207BDf interfaceC25207BDf, C8MP c8mp, C183978Ee c183978Ee, InterfaceC23621Ds interfaceC23621Ds, boolean z, boolean z2, boolean z3) {
        super(2, interfaceC23621Ds);
        this.A05 = c8mp;
        this.A06 = c183978Ee;
        this.A00 = bitmap;
        this.A01 = bitmap2;
        this.A03 = c198998qz;
        this.A02 = filterChain;
        this.A09 = z;
        this.A08 = z2;
        this.A07 = z3;
        this.A04 = interfaceC25207BDf;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C8MP c8mp = this.A05;
        C183978Ee c183978Ee = this.A06;
        Bitmap bitmap = this.A00;
        Bitmap bitmap2 = this.A01;
        C198998qz c198998qz = this.A03;
        return new PhotoToVideoSaver$savePhoto$1(bitmap, bitmap2, this.A02, c198998qz, this.A04, c8mp, c183978Ee, interfaceC23621Ds, this.A09, this.A08, this.A07);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PhotoToVideoSaver$savePhoto$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        C8MP c8mp = this.A05;
        C183978Ee c183978Ee = this.A06;
        Bitmap bitmap = this.A00;
        Bitmap bitmap2 = this.A01;
        C198998qz c198998qz = this.A03;
        FilterChain filterChain = this.A02;
        boolean z = this.A09;
        boolean z2 = this.A08;
        c8mp.A03.A01(this.A04, c183978Ee.A0h, new D93(bitmap, bitmap2, filterChain, c198998qz, c8mp, c183978Ee, null, 0, z, z2, this.A07), z2, !z2);
        return C0eB.A00;
    }
}
