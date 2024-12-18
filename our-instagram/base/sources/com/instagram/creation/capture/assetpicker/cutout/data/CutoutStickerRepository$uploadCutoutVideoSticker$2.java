package com.instagram.creation.capture.assetpicker.cutout.data;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.InterfaceC16620sF;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import com.instagram.common.gallery.Medium;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository$uploadCutoutVideoSticker$2", f = "CutoutStickerRepository.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class CutoutStickerRepository$uploadCutoutVideoSticker$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ Medium A03;
    public final /* synthetic */ CutoutStickerRepository A04;
    public final /* synthetic */ InterfaceC16660sJ A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutoutStickerRepository$uploadCutoutVideoSticker$2(Medium medium, CutoutStickerRepository cutoutStickerRepository, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, long j, long j2, boolean z) {
        super(2, interfaceC23621Ds);
        this.A04 = cutoutStickerRepository;
        this.A03 = medium;
        this.A02 = j;
        this.A01 = j2;
        this.A06 = z;
        this.A05 = interfaceC16660sJ;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        CutoutStickerRepository cutoutStickerRepository = this.A04;
        return new CutoutStickerRepository$uploadCutoutVideoSticker$2(this.A03, cutoutStickerRepository, interfaceC23621Ds, this.A05, this.A02, this.A01, this.A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x01e3, code lost:
    
        if (X.C14360o3.A0K(r10, "270") != false) goto L34;
     */
    /* JADX WARN: Type inference failed for: r35v1, types: [java.lang.Object, X.Po5] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.PpU, X.WZ3, java.lang.Object] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r60) {
        /*
            Method dump skipped, instructions count: 719
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository$uploadCutoutVideoSticker$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CutoutStickerRepository$uploadCutoutVideoSticker$2) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
