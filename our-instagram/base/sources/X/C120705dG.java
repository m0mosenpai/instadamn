package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.5dG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C120705dG extends AbstractC51572Yf {
    public final boolean A00;
    public final C62862tP A01;
    public final UserSession A02;
    public final C39G A03;
    public final C4FY A04;
    public final InterfaceC75403a7 A05;
    public final InterfaceC60442pS A06;
    public final InterfaceC75453aC A07;
    public final InterfaceC76043b9 A08;
    public final InterfaceC76323bc A09;
    public final C39D A0A;
    public final C30E A0B;
    public final InterfaceC60682pr A0C;
    public final String A0D;
    public final String A0E;
    public final InterfaceC16820sZ A0F;
    public final boolean A0G;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C51722Yv c51722Yv;
        C14360o3.A0B(c76223bS, 0);
        C97404Za c97404Za = (C97404Za) this.A0F.invoke();
        UserSession userSession = this.A02;
        C57462kL A00 = AbstractC65512xn.A00(userSession);
        Object invoke = ((InterfaceC16610sE) c97404Za.A03.A03).invoke(AbstractC77363dM.A00(c76223bS), c97404Za.A06, c97404Za.A05);
        long A02 = this.A04.A02(AbstractC77363dM.A00(c76223bS), c97404Za.A04, c97404Za.A00, c97404Za.A01, c97404Za.A09, c97404Za.A0B) | 9221401712017801216L;
        Integer num = c97404Za.A08;
        if (num != null) {
            int intValue = num.intValue();
            C75933ay c75933ay = C51722Yv.A02;
            c51722Yv = new C51722Yv(null, new C9CV(C05F.A00, new ColorDrawable(intValue), 4));
        } else {
            c51722Yv = C51722Yv.A02;
        }
        C2Z0 c2z0 = new C2Z0(c76223bS.A05, new ArrayList());
        InterfaceC76323bc interfaceC76323bc = this.A09;
        InterfaceC76043b9 interfaceC76043b9 = this.A08;
        InterfaceC60442pS interfaceC60442pS = this.A06;
        boolean z = this.A0G;
        C39G c39g = this.A03;
        C39D c39d = this.A0A;
        boolean z2 = !c97404Za.A0A;
        c2z0.A00(new C76343be(new C9BW(this.A05, EnumC65592xv.A0j), new C2Z3(A02), this.A01, userSession, c39g, interfaceC60442pS, interfaceC76043b9, interfaceC76323bc, c39d, this.A0B, this.A0C, new C206939Dy(invoke, 17), z, z2));
        if (!A00.A04()) {
            Integer num2 = C05F.A00;
            C51722Yv c51722Yv2 = new C51722Yv(new C51722Yv(new C51722Yv(null, new C9CT(num2, 100.0f, 0)), new C9CU(C05F.A01, 0, AbstractC77623dm.A0D(c2z0, R.dimen.clips_netego_card_width))), new C9CU(C05F.A0N, 1, 9221401712017801216L));
            EnumC77933eL enumC77933eL = EnumC77933eL.ABSOLUTE;
            Integer num3 = C05F.A0Y;
            C51722Yv c51722Yv3 = new C51722Yv(c51722Yv2, new C9CV(num3, enumC77933eL, 3));
            Drawable A0E = AbstractC77623dm.A0E(c2z0, R.drawable.bg_legibility_gradient_top);
            ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
            C80403iV A03 = C80393iU.A03(c2z0.A00);
            A03.A0D(A0E);
            A03.A0E(scaleType);
            A03.A0C();
            AbstractC77743dy.A00(A03, c51722Yv3);
            c2z0.A00(A03.A0A());
            c2z0.A00(new C76943cg(new C51722Yv(new C51722Yv(null, new C9CT(num2, 100.0f, 0)), new C9CV(num3, enumC77933eL, 3)), userSession, null, interfaceC60442pS, this.A07, this.A0D, this.A0E, new C9FJ(38, c97404Za, this, c2z0), new C206939Dy(c97404Za, 18), z));
        }
        return AbstractC76963ci.A06(c2z0, c76223bS, c51722Yv, null, null, null, false);
    }

    public C120705dG(C62862tP c62862tP, UserSession userSession, C39G c39g, C4FY c4fy, InterfaceC75403a7 interfaceC75403a7, InterfaceC60442pS interfaceC60442pS, InterfaceC75453aC interfaceC75453aC, InterfaceC76043b9 interfaceC76043b9, InterfaceC76323bc interfaceC76323bc, C39D c39d, C30E c30e, InterfaceC60682pr interfaceC60682pr, String str, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 3);
        C14360o3.A0B(interfaceC60442pS, 4);
        C14360o3.A0B(interfaceC76043b9, 6);
        C14360o3.A0B(interfaceC75453aC, 7);
        C14360o3.A0B(c39d, 8);
        C14360o3.A0B(interfaceC75403a7, 9);
        C14360o3.A0B(c39g, 13);
        C14360o3.A0B(c4fy, 14);
        C14360o3.A0B(c30e, 15);
        C14360o3.A0B(interfaceC60682pr, 17);
        this.A0F = interfaceC16820sZ;
        this.A09 = interfaceC76323bc;
        this.A02 = userSession;
        this.A06 = interfaceC60442pS;
        this.A00 = z;
        this.A08 = interfaceC76043b9;
        this.A07 = interfaceC75453aC;
        this.A0A = c39d;
        this.A05 = interfaceC75403a7;
        this.A0G = z2;
        this.A0D = str;
        this.A0E = "";
        this.A03 = c39g;
        this.A04 = c4fy;
        this.A0B = c30e;
        this.A01 = c62862tP;
        this.A0C = interfaceC60682pr;
    }
}
