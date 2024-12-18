package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7eU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167747eU extends AbstractC51572Yf {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final InterfaceC16660sJ A02;
    public final int A03;
    public final List A04;

    public C167747eU(InterfaceC11380iw interfaceC11380iw, UserSession userSession, List list, InterfaceC16660sJ interfaceC16660sJ, int i) {
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(interfaceC11380iw, 3);
        C14360o3.A0B(interfaceC16660sJ, 5);
        this.A04 = list;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A03 = i;
        this.A02 = interfaceC16660sJ;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        int intValue = ((Number) AbstractC77183d4.A00(c76223bS, new C206879Ds(c76223bS, 36), new Object[0])).intValue();
        int min = Math.min(this.A03 / intValue, 8);
        List<C148336m3> list = this.A04;
        if (list.size() > min) {
            list = list.subList(0, min - 1);
        }
        if (!(!list.isEmpty())) {
            return null;
        }
        C3e8 c3e8 = C3e8.SPACE_EVENLY;
        C75933ay c75933ay = C51722Yv.A02;
        C2XE c2xe = c76223bS.A05;
        Context context = c2xe.A0C;
        int color = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_elevated_background));
        Integer num = C05F.A00;
        C51722Yv c51722Yv = new C51722Yv(new C51722Yv(new C51722Yv(null, new C9CV(num, new ColorDrawable(color), 4)), new C9CT(num, 100.0f, 0)), new C9CU(C05F.A15, 0, Double.doubleToRawLongBits(6.0d)));
        C2Z0 c2z0 = new C2Z0(c2xe, new ArrayList());
        for (C148336m3 c148336m3 : list) {
            String str = c148336m3.A02;
            C167757eV c167757eV = new C167757eV(this.A00, this.A01, c148336m3, this.A02, intValue);
            AbstractC107374si.A01(c167757eV, str);
            c2z0.A00(c167757eV);
        }
        return AbstractC76963ci.A0J(c2z0, c76223bS, c51722Yv, null, null, null, c3e8, null, false);
    }
}
