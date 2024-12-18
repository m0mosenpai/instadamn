package X;

import android.animation.ValueAnimator;
import com.instagram.reels.prompt.model.PromptStickerModel;

/* loaded from: classes4.dex */
public final class ANU implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C97674a2 A00;
    public final /* synthetic */ C8P8 A01;
    public final /* synthetic */ PromptStickerModel A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public ANU(C97674a2 c97674a2, C8P8 c8p8, PromptStickerModel promptStickerModel, boolean z, boolean z2, boolean z3) {
        this.A03 = z;
        this.A01 = c8p8;
        this.A05 = z2;
        this.A00 = c97674a2;
        this.A04 = z3;
        this.A02 = promptStickerModel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        if (r0 == null) goto L11;
     */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAnimationUpdate(android.animation.ValueAnimator r10) {
        /*
            r9 = this;
            r0 = 0
            X.C14360o3.A0B(r10, r0)
            float r8 = X.AbstractC167017dG.A00(r10)
            boolean r0 = r9.A03
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L19
            X.8P8 r1 = r9.A01
            r0 = 1060320051(0x3f333333, float:0.7)
            float r0 = r0 * r8
            float r0 = r7 - r0
            r1.EU6(r0)
        L19:
            boolean r0 = r9.A05
            if (r0 == 0) goto L72
            double r1 = (double) r8
            r5 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            java.lang.String r4 = "progressViewStubber"
            java.lang.String r3 = "stickerView"
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L40
            r2 = 0
            r1 = 1056964608(0x3f000000, float:0.5)
            r0 = 1067030938(0x3f99999a, float:1.2)
            float r2 = X.AbstractC13600mm.A02(r8, r2, r1, r7, r0)
            X.4a2 r1 = r9.A00
            com.instagram.common.ui.base.IgSimpleImageView r0 = r1.A03
            if (r0 != 0) goto L52
        L38:
            X.C14360o3.A0F(r3)
        L3b:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L40:
            r2 = 1056964608(0x3f000000, float:0.5)
            r1 = -1080452710(0xffffffffbf99999a, float:-1.2)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = X.AbstractC13600mm.A02(r8, r2, r7, r1, r0)
            X.4a2 r1 = r9.A00
            com.instagram.common.ui.base.IgSimpleImageView r0 = r1.A03
            if (r0 == 0) goto L38
            float r2 = -r2
        L52:
            r0.setScaleX(r2)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r1.A03
            if (r0 == 0) goto L38
            r0.setScaleY(r2)
            X.2iX r0 = r1.A05
            if (r0 == 0) goto Laa
            android.view.View r0 = r0.getView()
            r0.setScaleX(r2)
            X.2iX r0 = r1.A05
            if (r0 == 0) goto Laa
            android.view.View r0 = r0.getView()
            r0.setScaleY(r2)
        L72:
            boolean r6 = r9.A04
            if (r6 == 0) goto L91
            X.4a2 r0 = r9.A00
            X.Jix r1 = r0.A02
            if (r1 == 0) goto L91
            double r2 = (double) r8
            double r4 = r1.A01
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L91
            r1.A01 = r2
            X.0do r0 = r1.A0F
            java.lang.Object r1 = r0.getValue()
            X.2hj r1 = (X.C55982hj) r1
            r0 = 1
            r1.A08(r2, r0)
        L91:
            int r0 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r0 != 0) goto La9
            if (r6 == 0) goto La0
            X.4a2 r0 = r9.A00
            X.Jix r0 = r0.A02
            if (r0 == 0) goto La0
            r0.A01()
        La0:
            X.4a2 r0 = r9.A00
            java.util.Set r1 = r0.A0I
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r9.A02
            r1.add(r0)
        La9:
            return
        Laa:
            X.C14360o3.A0F(r4)
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ANU.onAnimationUpdate(android.animation.ValueAnimator):void");
    }
}
