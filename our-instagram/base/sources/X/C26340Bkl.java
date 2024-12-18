package X;

import android.graphics.Typeface;
import com.facebook.R;

/* renamed from: X.Bkl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26340Bkl extends AbstractC51572Yf {
    public final C37577GgY A00;
    public final C120985dq A01;

    public C26340Bkl(C120985dq c120985dq, C37577GgY c37577GgY) {
        C14360o3.A0B(c37577GgY, 2);
        this.A01 = c120985dq;
        this.A00 = c37577GgY;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C4NJ A08 = this.A01.A08();
        C75933ay c75933ay = C51722Yv.A02;
        Integer num = C05F.A01;
        C51722Yv A0Y = AbstractC25231BEo.A0Y(C9CV.A00(C9CU.A00(C9CU.A00(AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0o(num, "android.widget.Button", 0)), C05F.A06, 0, AbstractC77623dm.A07(c76223bS)), C05F.A0E, 0, AbstractC77623dm.A04(c76223bS)), num, true, 4), DRY.A00(this, A08, 20));
        C2XE c2xe = c76223bS.A05;
        int A03 = AbstractC25232BEp.A03(c2xe.A0C, c76223bS, R.attr.igds_color_secondary_text_on_media);
        long A0D = AbstractC77623dm.A0D(c76223bS, R.dimen.button_text_size);
        Typeface typeface = Typeface.DEFAULT;
        long A0D2 = AbstractC25229BEm.A0D();
        Integer num2 = C05F.A00;
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, "Hide", 0);
        AbstractC25233BEq.A19(c76223bS, A0a, A03, A0D);
        A0a.A0S(1);
        AbstractC25234BEr.A0n(typeface, c76223bS, A0a, A0D2);
        A0a.A0B();
        AbstractC25234BEr.A1J(A0a, num2, false, true);
        C51682Yq A0X = AbstractC25227BEk.A0X(A0Y, A0a);
        return AbstractC76963ci.A0G(AbstractC25232BEp.A11(A0X, c2xe), c76223bS, AbstractC25234BEr.A0H(null, AbstractC25225BEi.A0m(num2, 91.0f, 0), num2));
    }
}
