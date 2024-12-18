package X;

import android.content.Context;
import com.facebook.R;
import java.util.ArrayList;

/* renamed from: X.3rc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85473rc extends AbstractC51572Yf {
    public final InterfaceC16660sJ A00;
    public final InterfaceC16660sJ A01;
    public final InterfaceC16660sJ A02;
    public final InterfaceC16660sJ A03;
    public final int A04 = R.dimen.abc_action_bar_elevation_material;
    public final int A05;
    public final AbstractC50812Vc A06;
    public final C51722Yv A07;
    public final Integer A08;
    public final String A09;
    public final boolean A0A;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C51722Yv c51722Yv;
        C51722Yv c51722Yv2;
        C51722Yv c51722Yv3;
        C51722Yv c51722Yv4;
        long doubleToRawLongBits;
        long j;
        C51722Yv c51722Yv5;
        Integer num;
        C14360o3.A0B(c76223bS, 0);
        String str = this.A09;
        String str2 = str;
        boolean z = true;
        if (str == null || str2.length() == 0 || !this.A0A) {
            z = false;
        }
        C51722Yv c51722Yv6 = this.A07;
        Integer num2 = C05F.A01;
        C9CT c9ct = new C9CT(num2, 100.0f, 0);
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv c51722Yv7 = null;
        if (c51722Yv6 == c75933ay) {
            c51722Yv6 = null;
        }
        C51722Yv c51722Yv8 = new C51722Yv(c51722Yv6, c9ct);
        C3e8 c3e8 = C3e8.CENTER;
        EnumC77683ds enumC77683ds = EnumC77683ds.CENTER;
        C2Z0 c2z0 = new C2Z0(c76223bS.A05, new ArrayList());
        C51722Yv c51722Yv9 = new C51722Yv(null, new C9CT(num2, 100.0f, 0));
        C206849Dp c206849Dp = new C206849Dp(this, 11);
        Integer num3 = C05F.A1F;
        C51722Yv c51722Yv10 = new C51722Yv(new C51722Yv(c51722Yv9, new C9CV(num3, c206849Dp, 4)), new C9CT(C05F.A0C, 0.0f, 1));
        InterfaceC16660sJ interfaceC16660sJ = this.A01;
        if (interfaceC16660sJ != null) {
            c51722Yv = new C51722Yv(null, new C9CV(C05F.A03, new C206849Dp(interfaceC16660sJ, 12), 4));
        } else {
            c51722Yv = null;
        }
        C51722Yv A00 = c51722Yv10.A00(c51722Yv);
        InterfaceC16660sJ interfaceC16660sJ2 = this.A03;
        if (interfaceC16660sJ2 != null) {
            c51722Yv2 = new C51722Yv(null, new C9CV(C05F.A04, new C206849Dp(interfaceC16660sJ2, 13), 4));
        } else {
            c51722Yv2 = null;
        }
        C51722Yv A002 = A00.A00(c51722Yv2);
        boolean z2 = this.A0A;
        if (z2) {
            c51722Yv3 = null;
        } else {
            c51722Yv3 = new C51722Yv(null, new C9CU(C05F.A00, 0, AbstractC77623dm.A0D(c2z0, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size)));
        }
        C51722Yv A003 = A002.A00(c51722Yv3);
        if (z2 && (num = this.A08) != null) {
            c51722Yv4 = new C51722Yv(null, new C9CU(C05F.A00, 2, AbstractC77623dm.A0D(c2z0, num.intValue())));
        } else {
            c51722Yv4 = null;
        }
        C51722Yv A004 = A003.A00(c51722Yv4);
        if (z2) {
            doubleToRawLongBits = AbstractC77623dm.A0D(c2z0, this.A05);
            j = AbstractC77623dm.A0D(c2z0, this.A04);
        } else {
            doubleToRawLongBits = Double.doubleToRawLongBits(0.0d);
            j = doubleToRawLongBits;
        }
        C9CU c9cu = new C9CU(C05F.A0u, 0, doubleToRawLongBits);
        if (A004 == c75933ay) {
            A004 = null;
        }
        C51722Yv c51722Yv11 = new C51722Yv(new C51722Yv(A004, c9cu), new C9CU(num3, 0, j));
        C2Z0 c2z02 = new C2Z0(c2z0.A00, new ArrayList());
        c2z02.A00(this.A06);
        c2z0.A00(AbstractC76963ci.A0J(c2z02, c2z0, c51722Yv11, null, null, null, c3e8, null, false));
        if (z) {
            if (str2 == null) {
                str2 = "";
            }
            Context A005 = AbstractC77363dM.A00(c2z0);
            Integer valueOf = Integer.valueOf(A005.getColor(AbstractC53242c7.A0H(A005, R.attr.igds_color_primary_text)));
            C51722Yv c51722Yv12 = new C51722Yv(new C51722Yv(null, new C9CV(num3, new C206849Dp(this, 14), 4)), new C9CT(num2, 100.0f, 0));
            if (interfaceC16660sJ != null) {
                c51722Yv5 = new C51722Yv(null, new C9CV(C05F.A03, new C206849Dp(this, 15), 4));
            } else {
                c51722Yv5 = null;
            }
            C51722Yv A006 = c51722Yv12.A00(c51722Yv5);
            if (interfaceC16660sJ2 != null) {
                c51722Yv7 = new C51722Yv(null, new C9CV(C05F.A04, new C206849Dp(this, 16), 4));
            }
            c2z0.A00(new C78003eS(null, null, A006.A00(c51722Yv7), null, new C51532Yb(C77603dk.A00, C99654di.A00, 3, true), null, str2, null, valueOf, 1, null, 17));
        }
        return AbstractC76963ci.A0J(c2z0, c76223bS, c51722Yv8, null, null, enumC77683ds, c3e8, null, false);
    }

    public C85473rc(AbstractC50812Vc abstractC50812Vc, C51722Yv c51722Yv, Integer num, String str, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, InterfaceC16660sJ interfaceC16660sJ4, int i, boolean z) {
        this.A06 = abstractC50812Vc;
        this.A09 = str;
        this.A05 = i;
        this.A08 = num;
        this.A0A = z;
        this.A00 = interfaceC16660sJ;
        this.A01 = interfaceC16660sJ2;
        this.A03 = interfaceC16660sJ3;
        this.A02 = interfaceC16660sJ4;
        this.A07 = c51722Yv;
    }
}
