package X;

import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.3iR, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3iR extends AbstractC51572Yf {
    public final UserSession A00;
    public final C9BH A01;
    public final InterfaceC80083hx A02;

    public C3iR(C9BH c9bh, InterfaceC80083hx interfaceC80083hx, UserSession userSession) {
        C14360o3.A0B(c9bh, 1);
        C14360o3.A0B(interfaceC80083hx, 2);
        C14360o3.A0B(userSession, 3);
        this.A01 = c9bh;
        this.A02 = interfaceC80083hx;
        this.A00 = userSession;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        Object A00 = AbstractC77183d4.A00(c76223bS, new C206879Ds(this, 0), new Object[0]);
        C206259Bi c206259Bi = (C206259Bi) this.A01.A00;
        if (!((Boolean) ((InterfaceC16660sJ) c206259Bi.A04).invoke(A00)).booleanValue()) {
            return null;
        }
        String A0F = AbstractC77623dm.A0F(c76223bS, ((Number) ((InterfaceC16820sZ) c206259Bi.A01).invoke()).intValue());
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) ((InterfaceC16600sD) c206259Bi.A02).invoke(this.A02, A0F, AbstractC77623dm.A0G(c76223bS, A0F, ((Number) ((InterfaceC16820sZ) c206259Bi.A03).invoke()).intValue()), AbstractC77363dM.A00(c76223bS));
        C75933ay c75933ay = C51722Yv.A02;
        Integer num = C05F.A00;
        C51722Yv c51722Yv = new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(null, new C9CT(num, 100.0f, 0)), new C9CV(num, EnumC77683ds.FLEX_END, 3)), new C9CV(C05F.A0Y, EnumC77933eL.ABSOLUTE, 3)), new C9CU(C05F.A01, 0, AbstractC77623dm.A0D(c76223bS, R.dimen.account_group_management_title_text_horizontal_padding)));
        C2XE c2xe = c76223bS.A05;
        C51722Yv c51722Yv2 = new C51722Yv(c51722Yv, new C9CV(num, new ColorDrawable(c76223bS.BoZ().A02(AbstractC53242c7.A03(c2xe.A0C))), 4));
        C2Z0 c2z0 = new C2Z0(c2xe, new ArrayList());
        c2z0.A00(new C78003eS(null, LinkMovementMethod.getInstance(), new C51722Yv(null, new C9CU(C05F.A04, 0, Double.doubleToRawLongBits(14.0d))), null, C78003eS.A0C, null, spannableStringBuilder, null, -1, null, null, null));
        return AbstractC76963ci.A0H(c2z0, c76223bS, c51722Yv2);
    }
}
