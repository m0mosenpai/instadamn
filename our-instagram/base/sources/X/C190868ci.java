package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import com.instagram.ui.text.TextColors;
import com.instagram.ui.text.TextShadow;

/* renamed from: X.8ci, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190868ci extends CharacterStyle implements C6S2, InterfaceC190878cj {
    public float A00;
    public float A01;
    public TextColors A02;
    public Integer A03;
    public boolean A04;
    public final int A05;
    public final Context A06;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C190868ci(Context context, InterfaceC190908cm interfaceC190908cm, int i) {
        this(context, interfaceC190908cm.ALM(i));
        C14360o3.A0B(interfaceC190908cm, 2);
    }

    public final void A00(TextColors textColors) {
        C14360o3.A0B(textColors, 0);
        this.A02 = textColors;
        TextShadow textShadow = textColors.A01;
        if (textShadow != null) {
            Context context = this.A06;
            this.A00 = textShadow.A00(context);
            this.A01 = textShadow.A01(context);
        }
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        if (this.A04) {
            textPaint.setColor(this.A02.A00);
            TextShadow textShadow = this.A02.A01;
            if (textShadow != null) {
                textPaint.setShadowLayer(this.A01, 0.0f, this.A00, textShadow.A00);
            }
            Integer num = this.A03;
            if (num != null) {
                textPaint.setAlpha(num.intValue());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.XCW, java.lang.Object, X.Ai1] */
    @Override // X.C6S2
    public final XCW Bz1() {
        TextColors textColors = this.A02;
        int i = this.A05;
        C14360o3.A0B(textColors, 1);
        ?? obj = new Object();
        obj.A01 = textColors;
        obj.A00 = i;
        return obj;
    }

    public C190868ci(Context context, TextColors textColors) {
        this.A06 = context;
        this.A02 = textColors;
        this.A05 = textColors.A00;
        this.A04 = true;
        A00(textColors);
    }
}
