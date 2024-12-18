package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import java.util.Random;

/* renamed from: X.LOu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnClickListenerC48048LOu implements View.OnClickListener {
    public final /* synthetic */ C24018Akw A00;
    public final /* synthetic */ C144226f4 A01;

    public ViewOnClickListenerC48048LOu(C24018Akw c24018Akw, C144226f4 c144226f4) {
        this.A01 = c144226f4;
        this.A00 = c24018Akw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int A05 = C0f9.A05(-1129313568);
        C144226f4 c144226f4 = this.A01;
        C24018Akw c24018Akw = this.A00;
        Random random = c144226f4.A0O;
        float nextFloat = random.nextFloat();
        if (nextFloat < 0.5f) {
            nextFloat = 0.5f;
        }
        float f = nextFloat * 200.0f;
        float f2 = -1.0f;
        if (random.nextBoolean()) {
            f2 = 1.0f;
        }
        float f3 = f * f2;
        IgSimpleImageView igSimpleImageView = c144226f4.A07;
        if (igSimpleImageView == null) {
            str = "stickerView";
        } else {
            float translationX = igSimpleImageView.getTranslationX() + (C144226f4.A00(c144226f4) / 2);
            InterfaceC09390do interfaceC09390do = c144226f4.A0R;
            float A01 = translationX - (AbstractC167027dH.A01(interfaceC09390do) / 2);
            float nextInt = random.nextInt(360);
            IgTextView igTextView = new IgTextView(c144226f4.A0H);
            igTextView.setText(c24018Akw.A00.A03);
            igTextView.setTextSize(0, AbstractC167027dH.A01(interfaceC09390do));
            igTextView.setRotation(nextInt);
            igTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 8388691));
            IgFrameLayout igFrameLayout = c144226f4.A05;
            if (igFrameLayout == null) {
                str = "containerView";
            } else {
                igFrameLayout.addView(igTextView, 0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setDuration(1000L);
                ofFloat.addUpdateListener(new LM5(igTextView, f3, A01, nextInt, 1));
                ofFloat.addListener(new C46073KaU(2, igTextView, c144226f4));
                ofFloat.start();
                C144226f4.A03(c144226f4);
                C0f9.A0C(2101216665, A05);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
