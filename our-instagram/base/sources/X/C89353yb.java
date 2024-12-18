package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.3yb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89353yb extends AbstractC51572Yf {
    public final UserSession A00;
    public final InterfaceC686136y A01;
    public final InterfaceC60442pS A02;
    public final InterfaceC16820sZ A03;

    public C89353yb(UserSession userSession, InterfaceC686136y interfaceC686136y, InterfaceC60442pS interfaceC60442pS, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC60442pS, 2);
        C14360o3.A0B(userSession, 3);
        C14360o3.A0B(interfaceC686136y, 4);
        this.A03 = interfaceC16820sZ;
        this.A02 = interfaceC60442pS;
        this.A00 = userSession;
        this.A01 = interfaceC686136y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C51722Yv c51722Yv;
        C206209Bd c206209Bd;
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        C14360o3.A0B(c76223bS, 0);
        C89623z3 c89623z3 = (C89623z3) this.A03.invoke();
        EnumC77683ds enumC77683ds = null;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        C2Z0 c2z0 = new C2Z0(c76223bS.A05, new ArrayList());
        C9C6 c9c6 = c89623z3.A07;
        boolean z = true;
        if (c9c6 == null || !c9c6.A04) {
            z = false;
        }
        if (z) {
            C38321qM c38321qM = ((C76623c7) c9c6.A00).A01;
            Context A00 = AbstractC77363dM.A00(c2z0);
            UserSession userSession = this.A00;
            InterfaceC60442pS interfaceC60442pS = this.A02;
            int A002 = AbstractC86543tS.A00(A00, userSession, c38321qM, interfaceC60442pS.getModuleName(), c9c6.A03);
            C75933ay c75933ay = C51722Yv.A02;
            c51722Yv = new C51722Yv(null, new C9CU(C05F.A08, 0, C2Z3.A03(A002 | 9221401712017801216L)));
            c2z0.A00(new C80323iM(c9c6, new C51722Yv(null, new C9CV(C05F.A00, EnumC77683ds.FLEX_END, 3)), userSession, c38321qM, interfaceC60442pS, (C75113Zb) c9c6.A01));
        } else {
            c51722Yv = null;
        }
        C85233rE c85233rE = c89623z3.A0D;
        if (c85233rE != null) {
            C206889Dt c206889Dt = new C206889Dt(c85233rE, 48);
            InterfaceC60442pS interfaceC60442pS2 = this.A02;
            InterfaceC686136y interfaceC686136y = this.A01;
            c2z0.A00(new C84913qf(c51722Yv, this.A00, interfaceC686136y.Ar3(), interfaceC686136y.BS6(), interfaceC60442pS2, c206889Dt, c89623z3.A0F));
        }
        C87183ub c87183ub = c89623z3.A0C;
        InterfaceC686136y interfaceC686136y2 = this.A01;
        InterfaceC87013uH BQk = interfaceC686136y2.BQk();
        UserSession userSession2 = this.A00;
        InterfaceC60442pS interfaceC60442pS3 = this.A02;
        c2z0.A00(new C89633z4(userSession2, BQk, c87183ub, interfaceC60442pS3));
        C206259Bi c206259Bi = c89623z3.A05;
        if (c206259Bi != null) {
            boolean z2 = c89623z3.A0F;
            C57342k9 c57342k9 = C57332k8.A0m;
            Context context = c2z0.A00.A0C;
            C14360o3.A07(context);
            c2z0.A00(new C26426Bm9(c206259Bi, userSession2, interfaceC60442pS3, c57342k9.A00(context, userSession2), z2));
        }
        c2z0.A00(new C89643z5(c89623z3.A09, userSession2, interfaceC60442pS3));
        c2z0.A00(new C89653z6(userSession2, c89623z3.A0B, interfaceC60442pS3));
        c2z0.A00(new C89663z7(c89623z3.A08, interfaceC60442pS3));
        final boolean z3 = c89623z3.A0G;
        if (!z3) {
            C206249Bh c206249Bh = c89623z3.A04;
            final boolean z4 = c89623z3.A0F;
            c2z0.A00(new C89673z8(c206249Bh, z4));
            if (C3HM.A00.A04(userSession2) && (c206209Bd = c89623z3.A03) != null && c206209Bd.A01 != null) {
                c2z0.A00(new C26448BmV(userSession2, interfaceC686136y2.Ar3(), interfaceC686136y2.BS6(), interfaceC686136y2.B5c(), interfaceC60442pS3, new DGY(c89623z3, 3)));
            }
            C9BW c9bw = c89623z3.A02;
            int i2 = R.dimen.action_bar_item_spacing_right;
            long j = 0;
            c2z0.A00(new C89683z9(c9bw, enumC77683ds, userSession2, objArr8 == true ? 1 : 0, objArr7 == true ? 1 : 0, i, objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0, i2, i2, objArr3 == true ? 1 : 0, 65148, j, j, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0));
            C9C3 c9c3 = c89623z3.A06;
            if (c9c3 != null && !((Boolean) ((InterfaceC16660sJ) ((C206259Bi) c9c3.A00).A01).invoke(interfaceC60442pS3)).booleanValue()) {
                c2z0.A00(new C89693zA(c9c3, userSession2, C17060sy.A01.A01(userSession2).Bhu(), interfaceC60442pS3, z4));
            }
            final C206889Dt c206889Dt2 = new C206889Dt(c89623z3, 49);
            c2z0.A00(new AbstractC51572Yf(z4, c206889Dt2) { // from class: X.3zB
                public final InterfaceC16820sZ A00;
                public final boolean A01;

                @Override // X.AbstractC51572Yf
                public final AbstractC50812Vc A0Y(C76223bS c76223bS2) {
                    long doubleToRawLongBits;
                    C14360o3.A0B(c76223bS2, 0);
                    C9BR c9br = (C9BR) this.A00.invoke();
                    C51722Yv c51722Yv2 = null;
                    if (c9br != null) {
                        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c9br.A01;
                        if (spannableStringBuilder.length() != 0) {
                            C75933ay c75933ay2 = C51722Yv.A02;
                            long A0D = AbstractC77623dm.A0D(c76223bS2, R.dimen.action_bar_item_spacing_right);
                            if (c9br.A02) {
                                doubleToRawLongBits = AbstractC77623dm.A0D(c76223bS2, R.dimen.abc_edit_text_inset_bottom_material);
                            } else {
                                doubleToRawLongBits = Double.doubleToRawLongBits(0.0d);
                            }
                            C51722Yv c51722Yv3 = new C51722Yv(new C51722Yv(null, new C9CU(C05F.A04, 0, A0D)), new C9CU(C05F.A1I, 0, doubleToRawLongBits));
                            if (this.A01) {
                                c51722Yv2 = new C51722Yv(null, new C9CV(C05F.A0j, 4, 0));
                            }
                            C51722Yv A003 = c51722Yv3.A00(c51722Yv2);
                            int A02 = c76223bS2.BoZ().A02(AbstractC53242c7.A0H(c76223bS2.A05.A0C, R.attr.igds_color_secondary_text));
                            long A0D2 = AbstractC77623dm.A0D(c76223bS2, R.dimen.add_payment_bottom_sheet_row_subtitle_size);
                            MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
                            Integer valueOf = Integer.valueOf(A02);
                            return new C78003eS(null, linkMovementMethod, A003, new C2Z3(A0D2), C78003eS.A0C, null, spannableStringBuilder, Float.valueOf(1.33f), valueOf, null, null, null);
                        }
                    }
                    return null;
                }

                {
                    this.A00 = c206889Dt2;
                    this.A01 = z4;
                }
            });
            c2z0.A00(new AbstractC51572Yf(z3) { // from class: X.3zC
                public final boolean A00;

                @Override // X.AbstractC51572Yf
                public final AbstractC50812Vc A0Y(C76223bS c76223bS2) {
                    C14360o3.A0B(c76223bS2, 0);
                    if (!this.A00) {
                        return null;
                    }
                    C3e8 c3e8 = C3e8.CENTER;
                    C2Z0 c2z02 = new C2Z0(c76223bS2.A05, new ArrayList());
                    C75933ay c75933ay2 = C51722Yv.A02;
                    c2z02.A00(new C26596Bot(new C51722Yv(new C51722Yv(null, new C9CU(C05F.A00, 0, AbstractC77623dm.A0D(c2z02, R.dimen.album_preview_add_item_margin))), new C9CU(C05F.A01, 0, AbstractC77623dm.A0D(c2z02, R.dimen.album_preview_add_item_margin))), C3T1.LOADING));
                    return new C2WH(null, null, c3e8, null, null, c2z02.A01, false);
                }

                {
                    this.A00 = z3;
                }
            });
            C75933ay c75933ay2 = C51722Yv.A02;
            c2z0.A00(AbstractC76963ci.A0J(null, c2z0, new C51722Yv(null, new C9CU(C05F.A01, 0, 9221401712017801216L | c89623z3.A00)), null, null, null, null, null, false));
            c2z0.A00(new C89723zD(c89623z3.A0A));
        }
        return new C2WF(null, null, null, c2z0.A01, false);
    }
}
