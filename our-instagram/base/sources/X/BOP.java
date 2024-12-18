package X;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public final class BOP extends AbstractC51572Yf {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final InterfaceC31159Dn3 A02;
    public final AbstractC25398BLp A03;
    public final InterfaceC31066Dl8 A04;
    public final BLE A05;
    public final WeakReference A06;
    public final InterfaceC16660sJ A07;
    public final boolean A08;

    public BOP(UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC31159Dn3 interfaceC31159Dn3, AbstractC25398BLp abstractC25398BLp, InterfaceC31066Dl8 interfaceC31066Dl8, BLE ble, WeakReference weakReference, boolean z) {
        C14360o3.A0B(interfaceC31066Dl8, 2);
        this.A05 = ble;
        this.A04 = interfaceC31066Dl8;
        this.A02 = interfaceC31159Dn3;
        this.A06 = weakReference;
        this.A00 = userSession;
        this.A01 = interfaceC60442pS;
        this.A08 = z;
        this.A03 = abstractC25398BLp;
        this.A07 = DRX.A00(this, 0);
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        float A00;
        float A002;
        float A003;
        C2Z0 A12;
        AbstractC50812Vc abstractC50812Vc;
        C25452BNr c25452BNr;
        C51682Yq c51682Yq;
        BO1 bo1;
        C25453BNs c25453BNs;
        C51682Yq c51682Yq2;
        C26461Bmi c26461Bmi;
        C26442BmP c26442BmP;
        C26248BjH c26248BjH;
        C26619BpG c26619BpG;
        BOE boe;
        Integer num;
        C14360o3.A0B(c76223bS, 0);
        long A0D = AbstractC77623dm.A0D(c76223bS, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        long A0D2 = AbstractC77623dm.A0D(c76223bS, R.dimen.add_account_icon_circle_radius);
        long A0B = AbstractC77623dm.A0B(c76223bS);
        BLE ble = this.A05;
        long A0D3 = AbstractC77623dm.A0D(c76223bS, ble.A00);
        UserSession userSession = this.A00;
        boolean z = ble.A0I;
        C14360o3.A0B(userSession, 0);
        if (z) {
            A00 = 0.0f;
        } else {
            A00 = AbstractC25225BEi.A00(C06090Tz.A05, userSession, 37173457343939164L);
        }
        long A03 = A03(c76223bS, A00, A0B, A0D);
        boolean A1O = AbstractC167007dF.A1O((A00 > 0.0f ? 1 : (A00 == 0.0f ? 0 : -1)));
        if (z) {
            A002 = 0.0f;
        } else {
            A002 = AbstractC25225BEi.A00(C06090Tz.A05, userSession, 37173457343873627L);
        }
        long A032 = A03(c76223bS, A002, A0B, A0D);
        boolean A1O2 = AbstractC167007dF.A1O((A002 > 0.0f ? 1 : (A002 == 0.0f ? 0 : -1)));
        if (z) {
            A003 = 0.0f;
        } else {
            A003 = AbstractC25225BEi.A00(C06090Tz.A05, userSession, 37173457344004701L);
        }
        long A033 = A03(c76223bS, A003, A0B, A0D);
        boolean A1O3 = AbstractC167007dF.A1O((A003 > 0.0f ? 1 : (A003 == 0.0f ? 0 : -1)));
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A0E = AbstractC25234BEr.A0E(AbstractC25225BEi.A0h(null, AbstractC25228BEl.A0o(C05F.A0C, false)), AbstractC25227BEk.A0Z(0, AbstractC77623dm.A0B(c76223bS)), 0, A0D3);
        C120985dq c120985dq = ble.A03;
        if (c120985dq.CdW()) {
            C75113Zb c75113Zb = ble.A04.A0E;
            if (c75113Zb != null) {
                num = c75113Zb.A10;
            } else {
                num = null;
            }
            if (num != C05F.A00) {
                A12 = AbstractC25232BEp.A12(c76223bS);
                abstractC50812Vc = A06(A12, A0D, A0B);
                return AbstractC25227BEk.A0V(abstractC50812Vc, A12, c76223bS, A0E);
            }
        }
        C51762Yz A004 = AbstractC77073ct.A00(c76223bS, BOQ.A00);
        C51762Yz A005 = AbstractC77073ct.A00(c76223bS, BOR.A00);
        C2XI A0j = AbstractC25228BEl.A0j(c76223bS, 0.0f);
        C2XI A0j2 = AbstractC25228BEl.A0j(c76223bS, 1.0f);
        Animator animator = (Animator) AbstractC85353rQ.A00(new BQ4(1, A004, A005), new BF7(10, A0j, A0j2), userSession).A00;
        C51722Yv A006 = AbstractC25231BEo.A0X(A0j2, AbstractC25234BEr.A0A(A0j, null, new C9CV(A0j, C05F.A1F)), C05F.A00).A00(AbstractC25232BEp.A15(null, C05F.A0Y, EnumC77933eL.ABSOLUTE));
        C51762Yz A007 = AbstractC77073ct.A00(c76223bS, BOS.A00);
        EnumC85043qs enumC85043qs = (EnumC85043qs) AbstractC77183d4.A00(c76223bS, new C29893DGh(41, A007, this), new Object[]{A007});
        InterfaceC16660sJ A01 = AbstractC85303rL.A01(c76223bS, DRX.A00(A007, 1));
        boolean A06 = C18U.A06(C06090Tz.A06, userSession, 36324999438676620L);
        A12 = AbstractC25232BEp.A12(c76223bS);
        if (ble.A0L) {
            if (ble.A0J) {
                c25452BNr = new C25452BNr(ble.A04, userSession, this.A01, this.A02, ble.A0D, this.A04, A01, A00, A0D, A03);
            } else {
                c25452BNr = null;
            }
            A12.A00(c25452BNr);
            InterfaceC30880Dht interfaceC30880Dht = ble.A0B;
            if (interfaceC30880Dht instanceof BP1) {
                BP1 bp1 = (BP1) interfaceC30880Dht;
                Integer valueOf = Integer.valueOf(bp1.A00);
                c51682Yq = A04(null, A12, null, AbstractC25234BEr.A0g(A12, valueOf), AbstractC77623dm.A0G(A12, valueOf, 2131976852), "ufi_count", DRY.A00(this, bp1.A01, 15), null, null, A0D, A0B, A1O);
            } else if (interfaceC30880Dht instanceof BQT) {
                c51682Yq = A04(TextUtils.TruncateAt.END, A12, AbstractC25225BEi.A0p(A0D), AbstractC77623dm.A0F(A12, 2131963492), AbstractC77623dm.A0F(A12, 2131976853), "ufi_count", DRY.A00(this, ((BQT) interfaceC30880Dht).A00, 15), null, null, A0D, A0B, A1O);
            } else if (interfaceC30880Dht instanceof BRZ) {
                c51682Yq = null;
            } else {
                throw B4Z.A00();
            }
            A12.A00(c51682Yq);
            InterfaceC30878Dhr interfaceC30878Dhr = ble.A07;
            if (!(interfaceC30878Dhr instanceof BQR) && !(interfaceC30878Dhr instanceof BOE)) {
                if (!(interfaceC30878Dhr instanceof C26248BjH) && !(interfaceC30878Dhr instanceof C25474BOn)) {
                    throw B4Z.A00();
                }
                bo1 = null;
            } else {
                bo1 = new BO1(c120985dq, ble.A04, userSession, this.A03, this.A04, ble.A0C, A002, A0D, A032);
            }
            A12.A00(bo1);
            C51682Yq c51682Yq3 = null;
            if ((interfaceC30878Dhr instanceof BOE) && (boe = (BOE) interfaceC30878Dhr) != null) {
                Integer valueOf2 = Integer.valueOf(boe.A00);
                c51682Yq3 = A04(null, A12, null, AbstractC25234BEr.A0g(A12, valueOf2), AbstractC77623dm.A0G(A12, valueOf2, 2131976837), "ufi_count", DRP.A00(this, 45), null, null, A0D, A0B, A1O2);
            }
            A12.A00(c51682Yq3);
            if (A06) {
                A12.A00(A07(A0D, A0B));
                A12.A00(A05(A12, A0D, A0B));
            }
            C2Z0 A13 = AbstractC25232BEp.A13(A12);
            boolean A1W = AbstractC25229BEm.A1W(A005);
            InterfaceC30878Dhr interfaceC30878Dhr2 = ble.A0A;
            if (!(interfaceC30878Dhr2 instanceof BQR) && !(interfaceC30878Dhr2 instanceof BOE)) {
                if (!(interfaceC30878Dhr2 instanceof C26248BjH) && !(interfaceC30878Dhr2 instanceof C25474BOn)) {
                    throw B4Z.A00();
                }
                c25453BNs = null;
            } else {
                c25453BNs = new C25453BNs(animator, ble.A02, A004, this.A01, userSession, enumC85043qs, this.A03, this.A04, A003, A0D, A033, A1W);
            }
            A13.A00(c25453BNs);
            boolean A1W2 = AbstractC25229BEm.A1W(A004);
            if (A1W2) {
                InterfaceC85193rA interfaceC85193rA = ble.A05;
                C14360o3.A0B(interfaceC85193rA, 0);
                if (interfaceC85193rA instanceof C85183r9) {
                    C85183r9 c85183r9 = (C85183r9) interfaceC85193rA;
                    c26619BpG = new C26619BpG(A006, userSession, new C29212CuH(c85183r9.A00, this), this.A04, c85183r9, this.A01, this.A06, new C29893DGh(40, null, this), DRP.A00(this, 49), A0D);
                } else {
                    c26619BpG = null;
                }
                A13.A00(c26619BpG);
            }
            A12.A00(AbstractC76963ci.A00(A13));
            if (A1W2) {
                c51682Yq2 = A04(null, A12, null, AbstractC77623dm.A0F(A12, 2131956718), AbstractC77623dm.A0F(A12, 2131956718), "ufi_count", DRA.A00, null, null, A0D, A0B, A1O3);
            } else if (interfaceC30878Dhr2 instanceof BOE) {
                Integer valueOf3 = Integer.valueOf(((BOE) interfaceC30878Dhr2).A00);
                c51682Yq2 = A04(null, A12, null, AbstractC25234BEr.A0g(A12, valueOf3), AbstractC77623dm.A0G(A12, valueOf3, 2131976882), "ufi_count", DRP.A00(this, 46), DRP.A00(this, 47), DRP.A00(this, 48), A0D, A0B, A1O3);
            } else {
                c51682Yq2 = null;
            }
            A12.A00(c51682Yq2);
            if (!A06) {
                A12.A00(A07(A0D, A0B));
                A12.A00(A05(A12, A0D, A0B));
            }
            InterfaceC30878Dhr interfaceC30878Dhr3 = ble.A08;
            boolean z2 = interfaceC30878Dhr3 instanceof C26248BjH;
            if (!z2 && !(interfaceC30878Dhr3 instanceof BQR)) {
                if (!(interfaceC30878Dhr3 instanceof BOE) && !(interfaceC30878Dhr3 instanceof C25474BOn)) {
                    throw B4Z.A00();
                }
                c26461Bmi = null;
            } else {
                c26461Bmi = new C26461Bmi(ble.A01, userSession, this.A02, this.A04, A0D, A0B);
            }
            A12.A00(c26461Bmi);
            C51682Yq c51682Yq4 = null;
            if (z2 && (c26248BjH = (C26248BjH) interfaceC30878Dhr3) != null) {
                c51682Yq4 = A04(TextUtils.TruncateAt.END, A12, AbstractC25225BEi.A0p(A0D), BHX.A03(AbstractC77363dM.A00(A12), c26248BjH.A01), BHX.A03(AbstractC77363dM.A00(A12), c26248BjH.A00), "ufi_count", DR9.A00, null, null, A0D, A0B, false);
            }
            A12.A00(c51682Yq4);
            if (ble.A0M) {
                c26442BmP = new C26442BmP(c120985dq, ble.A04, this.A04, ble.A0G, A0B);
            } else {
                c26442BmP = null;
            }
            A12.A00(c26442BmP);
            A12.A00(A06(A12, A0D, A0B));
        }
        InterfaceC30882Dhv interfaceC30882Dhv = ble.A0E;
        AbstractC25460BNz abstractC25460BNz = ble.A06;
        C14360o3.A0B(interfaceC30882Dhv, 0);
        C14360o3.A0B(abstractC25460BNz, 1);
        if (abstractC25460BNz.A00 && (interfaceC30882Dhv instanceof BLB)) {
            abstractC50812Vc = new BOL(userSession, this.A04, (BLB) interfaceC30882Dhv, A0D2, this.A08);
        } else {
            abstractC50812Vc = null;
        }
        return AbstractC25227BEk.A0V(abstractC50812Vc, A12, c76223bS, A0E);
    }

    private final C51682Yq A04(TextUtils.TruncateAt truncateAt, C2Z1 c2z1, C2Z3 c2z3, String str, String str2, String str3, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, long j, long j2, boolean z) {
        long doubleToRawLongBits;
        long floatToRawIntBits;
        int A02;
        long j3;
        long j4 = j2;
        TypedValue typedValue = new TypedValue();
        C2XE ArD = c2z1.ArD();
        Context context = ArD.A0C;
        context.getResources().getValue(R.dimen.clips_viewer_social_context_shadow_radius, typedValue, true);
        long A0D = AbstractC77623dm.A0D(c2z1, R.dimen.clips_viewer_media_info_ufi_button_side_margin);
        C75933ay c75933ay = C51722Yv.A02;
        EnumC77683ds enumC77683ds = EnumC77683ds.CENTER;
        Integer num = C05F.A00;
        C51722Yv c51722Yv = new C51722Yv(null, new C9CV(num, enumC77683ds, 3));
        Integer num2 = C05F.A0C;
        C51722Yv c51722Yv2 = new C51722Yv(c51722Yv, new C9CU(num2, 0, j));
        if (z) {
            doubleToRawLongBits = j4;
        } else {
            doubleToRawLongBits = Double.doubleToRawLongBits(0.0d);
        }
        Integer num3 = C05F.A08;
        C51722Yv c51722Yv3 = new C51722Yv(new C51722Yv(c51722Yv2, new C9CU(num3, 0, A0D)), new C9CU(C05F.A0A, 0, doubleToRawLongBits));
        if (z) {
            j4 = Double.doubleToRawLongBits(0.0d);
        }
        C51722Yv c51722Yv4 = new C51722Yv(c51722Yv3, new C9CU(C05F.A1I, 0, j4));
        if (str2 != null) {
            c51722Yv4 = new C51722Yv(c51722Yv4, new C9CV(C05F.A0N, str2, 0));
        }
        Integer num4 = C05F.A01;
        C51722Yv c51722Yv5 = new C51722Yv(new C51722Yv(new C51722Yv(c51722Yv4, new C9CV(num4, "android.widget.Button", 0)), new C9CV(C05F.A1F, interfaceC16660sJ, 4)), new C9CV(num3, str3, 4));
        if (interfaceC16660sJ2 != null) {
            c51722Yv5 = new C51722Yv(c51722Yv5, new C9CV(C05F.A03, interfaceC16660sJ2, 4));
        }
        if (interfaceC16660sJ3 != null) {
            c51722Yv5 = new C51722Yv(c51722Yv5, new C9CV(C05F.A04, interfaceC16660sJ3, 4));
        }
        if (c2z3 != null) {
            c51722Yv5 = new C51722Yv(c51722Yv5, new C9CU(num, 0, c2z3.A00));
        }
        UserSession userSession = this.A00;
        boolean A01 = BO8.A01(context, userSession);
        int A022 = c2z1.BoZ().A02(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text_on_media));
        if (A01) {
            floatToRawIntBits = BO8.A00(context);
        } else {
            floatToRawIntBits = Float.floatToRawIntBits(12.0f) | 9221683186994511872L;
        }
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36329307291009277L)) {
            A02 = AbstractC25449BNo.A03(userSession, c2z1.BoZ().A02(R.color.black));
        } else {
            A02 = c2z1.BoZ().A02(AbstractC53242c7.A0H(context, R.attr.igds_color_shadow_on_media));
        }
        if (C18U.A06(c06090Tz, userSession, 36329307291009277L)) {
            j3 = Double.doubleToRawLongBits(AbstractC25449BNo.A01(userSession));
        } else {
            j3 = ((int) typedValue.getFloat()) | 9221401712017801216L;
        }
        Typeface create = Typeface.create("sans-serif-medium", 0);
        C14360o3.A07(create);
        Typeface A03 = AbstractC14710oj.A03(context, create, num4);
        long doubleToRawLongBits2 = Double.doubleToRawLongBits(AbstractC25449BNo.A00(userSession));
        Integer A07 = AbstractC25449BNo.A07(userSession, c2z1.BoZ().A02(R.color.black));
        long doubleToRawLongBits3 = Double.doubleToRawLongBits(0.0d);
        C77723dw A032 = C51682Yq.A03(ArD, 0);
        A032.A0W(str);
        A032.A0V(null);
        A032.A0Q(A022);
        A032.A0R(C2Z3.A00(c2z1.BoZ(), floatToRawIntBits));
        A032.A0S(0);
        A032.A0T(A03);
        A032.A0P(A02);
        A032.A0K(C2Z3.A00(c2z1.BoZ(), j3));
        A032.A0I(C2Z3.A00(c2z1.BoZ(), doubleToRawLongBits3));
        A032.A0J(C2Z3.A00(c2z1.BoZ(), doubleToRawLongBits3));
        A032.A0H(C2Z3.A00(c2z1.BoZ(), doubleToRawLongBits2));
        if (A07 != null) {
            A032.A0O(A07.intValue());
        }
        A032.A0X(num2);
        A032.A0C();
        A032.A0Y(num);
        A032.A0L(1.33f);
        A032.A0b(false);
        A032.A0N(0);
        A032.A0M(1);
        A032.A0c(true);
        A032.A0Z(false);
        A032.A0a(true);
        if (truncateAt != null) {
            A032.A0U(truncateAt);
        }
        A032.A06(null);
        AbstractC77743dy.A00(A032, c51722Yv5);
        return A032.A0A();
    }

    private final C51682Yq A05(C2Z1 c2z1, long j, long j2) {
        BOE boe;
        boolean A06 = C18U.A06(C06090Tz.A06, this.A00, 36324999438742157L);
        InterfaceC30878Dhr interfaceC30878Dhr = this.A05.A09;
        if (!(interfaceC30878Dhr instanceof BOE) || (boe = (BOE) interfaceC30878Dhr) == null) {
            return null;
        }
        Integer valueOf = Integer.valueOf(boe.A00);
        String A00 = AbstractC43744JWe.A00(AbstractC25231BEo.A0M(c2z1), valueOf, null, false);
        C14360o3.A07(A00);
        return A04(null, c2z1, null, A00, AbstractC77623dm.A0G(c2z1, valueOf, 2131976885), "save_count", new DHP(40, this, A06), new DHP(41, this, A06), null, j, j2, false);
    }

    private final BNU A06(C2Z1 c2z1, long j, long j2) {
        BLE ble = this.A05;
        if (ble.A0K) {
            long A0D = AbstractC77623dm.A0D(c2z1, R.dimen.clips_viewer_media_info_ufi_button_side_margin);
            C75933ay c75933ay = C51722Yv.A02;
            if (ble.A0A instanceof BOE) {
                A0D = AbstractC25229BEm.A0D();
            }
            if (!ble.A06.A00) {
                j2 = AbstractC25229BEm.A0D();
            }
            Integer num = C05F.A08;
            C51722Yv A00 = C9CV.A00(AbstractC25234BEr.A0E(null, AbstractC25225BEi.A0n(num, 0, A0D), 0, j2), C05F.A0D, "clips_ufi_more_button_component", 4);
            Integer num2 = C05F.A00;
            C51722Yv A002 = C9CU.A00(A00, num2, 0, j);
            Integer num3 = C05F.A01;
            return new BNU(AbstractC77623dm.A0E(c2z1, R.drawable.instagram_more_vertical_outline_44), ImageView.ScaleType.FIT_CENTER, C9CV.A00(AbstractC25233BEq.A0U(C9CV.A00(AbstractC25234BEr.A0H(C9CU.A00(A002, num3, 0, j), AbstractC25231BEo.A0b(c2z1, 2131966888, 0), num2), num, "more_button", 4), AbstractC25225BEi.A0o(C05F.A1F, this.A07, 4), num3, 0), C05F.A0B, Integer.valueOf(R.id.clips_ufi_more_button_component), 4), false);
        }
        return null;
    }

    private final BRP A07(long j, long j2) {
        BLE ble = this.A05;
        InterfaceC30878Dhr interfaceC30878Dhr = ble.A09;
        if (!(interfaceC30878Dhr instanceof BOE) && !(interfaceC30878Dhr instanceof BQR)) {
            if (!(interfaceC30878Dhr instanceof C26248BjH) && !(interfaceC30878Dhr instanceof C25474BOn)) {
                throw B4Z.A00();
            }
            return null;
        }
        return new BRP(ble.A03, ble.A04, ble.A0F, this.A04, j, j2);
    }

    public static final long A03(C2Z1 c2z1, float f, long j, long j2) {
        C14360o3.A07(c2z1.ArD().A0D);
        int A00 = C2Z3.A00(c2z1.BoZ(), j) + C2Z3.A00(c2z1.BoZ(), C2Z3.A02(C2Z3.A01(f, j2)));
        return Double.doubleToRawLongBits(A00 / r4.A01.getDisplayMetrics().density);
    }
}
