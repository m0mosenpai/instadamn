package X;

import android.animation.ValueAnimator;
import android.view.View;
import com.instagram.reels.prompt.model.PromptStickerModel;

/* loaded from: classes4.dex */
public final class ANR implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C97674a2 A00;
    public final /* synthetic */ C8P8 A01;
    public final /* synthetic */ PromptStickerModel A02;

    public ANR(C97674a2 c97674a2, C8P8 c8p8, PromptStickerModel promptStickerModel) {
        this.A01 = c8p8;
        this.A00 = c97674a2;
        this.A02 = promptStickerModel;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C14360o3.A0B(valueAnimator, 0);
        float A00 = AbstractC167017dG.A00(valueAnimator);
        this.A01.EU6(1.0f - (0.7f * A00));
        C97674a2 c97674a2 = this.A00;
        PromptStickerModel promptStickerModel = this.A02;
        String str = "primaryCardView";
        if (C97674a2.A03(promptStickerModel)) {
            InterfaceC56392iX interfaceC56392iX = c97674a2.A06;
            if (interfaceC56392iX == null) {
                str = "secondaryCardViewStubber";
            } else {
                View view = interfaceC56392iX.getView();
                View view2 = c97674a2.A00;
                if (view2 != null) {
                    view.setRotation(view2.getRotation() + ((-5.0f) * A00));
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        if (C97674a2.A04(promptStickerModel)) {
            InterfaceC56392iX interfaceC56392iX2 = c97674a2.A07;
            if (interfaceC56392iX2 == null) {
                str = "tertiaryCardViewStubber";
            } else {
                View view3 = interfaceC56392iX2.getView();
                View view4 = c97674a2.A00;
                if (view4 != null) {
                    view3.setRotation(view4.getRotation() + (7.0f * A00));
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        if (A00 == 1.0f) {
            c97674a2.A0I.add(promptStickerModel);
        }
    }
}
