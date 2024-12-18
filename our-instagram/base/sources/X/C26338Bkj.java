package X;

import android.graphics.Typeface;
import android.util.TypedValue;
import com.facebook.R;

/* renamed from: X.Bkj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26338Bkj extends AbstractC51572Yf {
    public final InterfaceC16820sZ A00;
    public final String A01;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        TypedValue typedValue = new TypedValue();
        C2XE c2xe = c76223bS.A05;
        c2xe.A0C.getResources().getValue(R.dimen.clips_viewer_social_context_shadow_radius, typedValue, true);
        long A09 = AbstractC77623dm.A09(c76223bS);
        Typeface create = Typeface.create("sans-serif-medium", 0);
        int A04 = AbstractC25236BEt.A04(c76223bS);
        String str = this.A01;
        long A0D = AbstractC25229BEm.A0D();
        Integer num = C05F.A00;
        C77723dw A03 = C51682Yq.A03(c2xe, 0);
        A03.A0W(str);
        A03.A0V(null);
        AbstractC25233BEq.A19(c76223bS, A03, A04, A09);
        A03.A0S(0);
        AbstractC25234BEr.A0n(create, c76223bS, A03, A0D);
        AbstractC25234BEr.A1G(A03, num, false);
        A03.A0M(1);
        A03.A0c(false);
        AbstractC25232BEp.A1N(A03, false);
        C51682Yq A0A = A03.A0A();
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A0d = AbstractC25230BEn.A0d(null, num, 47.0f, 0);
        Integer num2 = C05F.A01;
        C51722Yv A00 = C9CV.A00(AbstractC25230BEn.A0d(A0d, num2, 75.0f, 0), num, AbstractC77623dm.A0E(c76223bS, R.drawable.clips_viewer_footer_button_background), 4);
        long A0J = AbstractC25229BEm.A0J();
        long A0L = AbstractC25230BEn.A0L();
        C51722Yv A0F = AbstractC25234BEr.A0F(A00, AbstractC25227BEk.A0b(A0L), 0, A0J);
        Integer num3 = C05F.A1F;
        return AbstractC76963ci.A0G(AbstractC25232BEp.A11(A0A, c2xe), c76223bS, C9CV.A00(AbstractC25233BEq.A0c(C9CU.A00(AbstractC25234BEr.A0D(A0F, AbstractC25225BEi.A0n(num3, 0, A0L), 0, A0J), C05F.A0A, 0, A0J), num2, true), num3, DRP.A00(this, 21), 4));
    }

    public C26338Bkj(String str, InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = str;
        this.A00 = interfaceC16820sZ;
    }
}
