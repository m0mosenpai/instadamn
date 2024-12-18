package X;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: X.5hT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122925hT extends CharacterStyle implements UpdateAppearance {
    public final InterfaceC74953Yl A00;
    public final C62Y A01;
    public final float A02;
    public final InterfaceC74963Ym A03;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        VKR.A00(textPaint, this.A02);
        textPaint.setShader((Shader) this.A03.getValue());
    }

    public C122925hT(C62Y c62y, float f) {
        this.A01 = c62y;
        this.A02 = f;
        C5YC c5yc = new C5YC(9205357640488583168L);
        C74883Yd A00 = AbstractC74873Yc.A00();
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A00 = new ParcelableSnapshotMutableState(A00, c5yc);
        this.A03 = new C113775Bp(null, new C9EV(this, 37));
    }
}
