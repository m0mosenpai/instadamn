package com.instagram.creation.capture.assetpicker.cutout.viewmodel;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC23641Du;
import X.C0eB;
import X.C1JX;
import X.C4A7;
import X.C50260MHp;
import X.C8OP;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import com.instagram.common.gallery.Medium;
import com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository;
import com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository$uploadCutoutVideoSticker$2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.assetpicker.cutout.viewmodel.CutoutStickerViewModel$uploadTrimmedVideo$1", f = "CutoutStickerViewModel.kt", i = {}, l = {259}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class CutoutStickerViewModel$uploadTrimmedVideo$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ Medium A03;
    public final /* synthetic */ C8OP A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutoutStickerViewModel$uploadTrimmedVideo$1(Medium medium, C8OP c8op, InterfaceC23621Ds interfaceC23621Ds, long j, long j2, boolean z) {
        super(2, interfaceC23621Ds);
        this.A04 = c8op;
        this.A03 = medium;
        this.A02 = j;
        this.A01 = j2;
        this.A05 = z;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new CutoutStickerViewModel$uploadTrimmedVideo$1(this.A03, this.A04, interfaceC23621Ds, this.A02, this.A01, this.A05);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Object obj2 = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            C8OP c8op = this.A04;
            CutoutStickerRepository cutoutStickerRepository = (CutoutStickerRepository) c8op.A0F.getValue();
            Medium medium = this.A03;
            long j = this.A02;
            long j2 = this.A01;
            boolean z = this.A05;
            C50260MHp c50260MHp = new C50260MHp(c8op, 34);
            this.A00 = 1;
            Object A00 = AbstractC23641Du.A00(this, ((C4A7) cutoutStickerRepository).A01.Arv(), new CutoutStickerRepository$uploadCutoutVideoSticker$2(medium, cutoutStickerRepository, null, c50260MHp, j, j2, z));
            if (A00 != obj2) {
                A00 = C0eB.A00;
            }
            if (A00 == obj2) {
                return obj2;
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CutoutStickerViewModel$uploadTrimmedVideo$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
