package com.instagram.creation.capture.assetpicker.cutout.ui;

import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.AbstractC25225BEi;
import X.C0eB;
import X.C119055aN;
import X.C119365at;
import X.C1JX;
import X.C25582BSv;
import X.C28734CmS;
import X.C5XN;
import X.C5XO;
import X.C6KL;
import X.C6KN;
import X.InterfaceC16610sE;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import X.InterfaceC58269PsN;
import android.graphics.PointF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.assetpicker.cutout.ui.CutoutPhotoStickerStylizedImageKt$detectImageTaps$1$1$1", f = "CutoutPhotoStickerStylizedImage.kt", i = {0, 0}, l = {163}, m = "invokeSuspend", n = {"pressInteraction", "offset"}, s = {"L$0", "J$0"})
/* loaded from: classes5.dex */
public final class CutoutPhotoStickerStylizedImageKt$detectImageTaps$1$1$1 extends AbstractC23611Dp implements InterfaceC16610sE {
    public int A00;
    public /* synthetic */ long A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ C5XO A05;
    public final /* synthetic */ C6KN A06;
    public final /* synthetic */ InterfaceC16660sJ A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutoutPhotoStickerStylizedImageKt$detectImageTaps$1$1$1(C5XO c5xo, C6KN c6kn, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        super(3, interfaceC23621Ds);
        this.A05 = c5xo;
        this.A06 = c6kn;
        this.A04 = i;
        this.A03 = i2;
        this.A07 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((C119365at) obj2).A00;
        CutoutPhotoStickerStylizedImageKt$detectImageTaps$1$1$1 cutoutPhotoStickerStylizedImageKt$detectImageTaps$1$1$1 = new CutoutPhotoStickerStylizedImageKt$detectImageTaps$1$1$1(this.A05, this.A06, (InterfaceC23621Ds) obj3, this.A07, this.A04, this.A03);
        cutoutPhotoStickerStylizedImageKt$detectImageTaps$1$1$1.A02 = obj;
        cutoutPhotoStickerStylizedImageKt$detectImageTaps$1$1$1.A01 = j;
        return cutoutPhotoStickerStylizedImageKt$detectImageTaps$1$1$1.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        long j;
        C28734CmS c28734CmS;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            j = this.A01;
            C28734CmS c28734CmS2 = (C28734CmS) this.A02;
            AbstractC09560e7.A00(obj);
            c28734CmS = c28734CmS2;
        } else {
            AbstractC09560e7.A00(obj);
            InterfaceC58269PsN interfaceC58269PsN = (InterfaceC58269PsN) this.A02;
            j = this.A01;
            Object obj2 = new Object();
            ((C5XN) this.A05).A00.F8m(obj2);
            this.A02 = obj2;
            this.A01 = j;
            this.A00 = 1;
            c28734CmS = obj2;
            if (interfaceC58269PsN.F8j(this) == c1jx) {
                return c1jx;
            }
        }
        ((C5XN) this.A05).A00.F8m(new C25582BSv(c28734CmS));
        long j2 = ((C6KL) this.A06).A00;
        int A06 = AbstractC25225BEi.A06(j2);
        int A00 = C119055aN.A00(j2);
        if (A06 != 0 && A00 != 0) {
            float A01 = (C119365at.A01(j) / A06) * this.A04;
            float A02 = (C119365at.A02(j) / A00) * this.A03;
            InterfaceC16660sJ interfaceC16660sJ = this.A07;
            if (interfaceC16660sJ != null) {
                interfaceC16660sJ.invoke(new PointF(A01, A02));
            }
        }
        return C0eB.A00;
    }
}
