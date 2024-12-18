package X;

import android.text.Layout;
import android.text.Spannable;
import android.text.TextPaint;
import com.facebook.react.views.text.ReactTextShadowNode;

/* renamed from: X.WZn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70506WZn implements InterfaceC65378TjB {
    public final /* synthetic */ ReactTextShadowNode A00;

    public C70506WZn(ReactTextShadowNode reactTextShadowNode) {
        this.A00 = reactTextShadowNode;
    }

    @Override // X.InterfaceC65378TjB
    public final float ADG(AbstractC78533fL abstractC78533fL, float f, float f2) {
        ReactTextShadowNode reactTextShadowNode = this.A00;
        TextPaint textPaint = ReactTextShadowNode.A04;
        Spannable spannable = reactTextShadowNode.A00;
        AbstractC05810Sj.A01(spannable, "Spannable element has not been prepared in onBeforeLayout");
        Layout A01 = ReactTextShadowNode.A01(spannable, reactTextShadowNode, EnumC78643fW.EXACTLY, f);
        return A01.getLineBaseline(A01.getLineCount() - 1);
    }
}
