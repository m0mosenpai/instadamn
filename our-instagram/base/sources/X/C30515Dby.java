package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* renamed from: X.Dby, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30515Dby extends C0YY implements InterfaceC16610sE {
    public final float A00;
    public final int A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30515Dby(float f, int i) {
        super(3);
        this.A01 = i;
        this.A00 = f;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.A01 != 0) {
            C5Tl A0S = AbstractC25226BEj.A0S(obj2, obj3);
            if (AbstractC25227BEk.A1U(A0S, 1696281411)) {
                C0fH.A01(217117845, "com.instagram.creation.genai.common.ui.legacyKeyboardBottomPadding.<anonymous> (ImeUtils.kt:35)");
            }
            Modifier A0H = AbstractC25227BEk.A0H(Modifier.A00, this.A00);
            if (C0fH.A02()) {
                C0fH.A00(-260330446);
            }
            AbstractC25225BEi.A1T(A0S);
            return A0H;
        }
        C5Tl c5Tl = (C5Tl) obj2;
        if (AbstractC25228BEl.A0D(obj3) == 16 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1732205217, "com.instagram.barcelona.feed.post.ui.QuotePostCaption.<anonymous> (PostPreview.kt:605)");
            }
            C5YS.A06(c5Tl, AbstractC118185Wd.A0C(Modifier.A00, this.A00), AbstractC25227BEk.A0P(c5Tl, R.drawable.barcelona_quote_filled_14), AbstractC25226BEj.A0M(c5Tl));
            if (C0fH.A02()) {
                C0fH.A00(-1318870117);
            }
        }
        return C0eB.A00;
    }
}
