package X;

import android.os.SystemClock;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Ob6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55095Ob6 {
    public OCC A00;
    public OE1 A01;
    public final UserSession A02;
    public final C55133Obx A03;
    public final OI6 A04;

    public static final Integer A01(InterfaceC58104PpT interfaceC58104PpT, Integer num) {
        int intValue;
        if (interfaceC58104PpT instanceof C51767MuX) {
            return C05F.A0u;
        }
        if (interfaceC58104PpT instanceof C51768MuY) {
            C51768MuY c51768MuY = (C51768MuY) interfaceC58104PpT;
            List list = c51768MuY.A08;
            if (list != null && AbstractC166987dD.A1b(list)) {
                if (num != null && (intValue = num.intValue()) < list.size() && intValue >= 0) {
                    int intValue2 = ((C51768MuY) list.get(intValue)).A03.intValue();
                    if (intValue2 != 0) {
                        if (intValue2 != 1) {
                            return C05F.A15;
                        }
                        return C05F.A0Y;
                    }
                    return C05F.A0N;
                }
                return C05F.A0C;
            }
            if (c51768MuY.A04 == C05F.A01) {
                return C05F.A0j;
            }
        }
        boolean Cff = interfaceC58104PpT.Cff();
        if (Cff) {
            return C05F.A01;
        }
        if (!Cff) {
            return C05F.A00;
        }
        throw B4Z.A00();
    }

    public final void A02() {
        boolean z;
        long j;
        long j2;
        OE1 oe1 = this.A01;
        if (oe1 != null) {
            InterfaceC58104PpT interfaceC58104PpT = oe1.A03;
            if (!(interfaceC58104PpT instanceof C51763MuT)) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (!(interfaceC58104PpT instanceof C51765MuV) && !(interfaceC58104PpT instanceof C51764MuU)) {
                    z = false;
                    j = elapsedRealtime - oe1.A02;
                } else {
                    z = true;
                    j = 0;
                }
                Long l = oe1.A01;
                if (l != null) {
                    j2 = elapsedRealtime - l.longValue();
                } else {
                    j2 = 0;
                }
                long j3 = j2 + oe1.A00;
                if (z) {
                    j3 = 0;
                }
                C55129Obq c55129Obq = AbstractC51573MqR.A00;
                Integer num = oe1.A04;
                this.A04.A00(new PAC(A00(interfaceC58104PpT), A01(interfaceC58104PpT, num), C55129Obq.A02(interfaceC58104PpT, num), oe1.A05, j, j3));
                C55133Obx c55133Obx = this.A03;
                EnumC53379NjU enumC53379NjU = EnumC53379NjU.A0D;
                String A02 = C55129Obq.A02(interfaceC58104PpT, num);
                String A0L = AbstractC001900j.A0L(A02, "_", A02);
                EnumC53343Nit A00 = C55129Obq.A00(interfaceC58104PpT.Ar7());
                EnumC53369NjK A03 = c55129Obq.A03(interfaceC58104PpT, num);
                C25531Mh A002 = C55133Obx.A00(c55133Obx);
                if (AbstractC25226BEj.A1Z(A002)) {
                    MSZ.A1C(enumC53379NjU, A002, null);
                    A002.A0R("server_info", C55133Obx.A01(null, A002, c55133Obx));
                    C55133Obx.A02(A00, A03, A002, c55133Obx, A0L);
                }
                this.A01 = null;
            }
        }
    }

    public final void A03() {
        Long l;
        OE1 oe1 = this.A01;
        if (oe1 != null && (l = oe1.A01) != null) {
            oe1.A00 += SystemClock.elapsedRealtime() - l.longValue();
            oe1.A01 = null;
        }
    }

    public final void A04(InterfaceC58104PpT interfaceC58104PpT) {
        OCC occ = this.A00;
        if (occ != null) {
            C55129Obq c55129Obq = AbstractC51573MqR.A00;
            String A02 = C55129Obq.A02(interfaceC58104PpT, occ.A01);
            if (C14360o3.A0K(occ.A02, A02)) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - occ.A00;
                OI6 oi6 = this.A04;
                Integer A00 = A00(interfaceC58104PpT);
                String str = occ.A03;
                oi6.A00(new PA9(A00, A02, str, elapsedRealtime));
                HashMap A022 = AbstractC06930Yk.A02(AbstractC25229BEm.A1b("stack_name", AbstractC54150Nwm.A00(A00(interfaceC58104PpT)), AbstractC166987dD.A1L("load_time_ms", String.valueOf(elapsedRealtime))));
                EnumC53379NjU enumC53379NjU = EnumC53379NjU.A0A;
                Integer num = occ.A01;
                EnumC53376NjR A01 = C55129Obq.A01(AbstractC54149Nwl.A00(str));
                String A023 = C55129Obq.A02(interfaceC58104PpT, num);
                String A0L = AbstractC001900j.A0L(A023, "_", A023);
                EnumC53343Nit A002 = C55129Obq.A00(interfaceC58104PpT.Ar7());
                EnumC53369NjK A03 = c55129Obq.A03(interfaceC58104PpT, num);
                C55133Obx c55133Obx = this.A03;
                C25531Mh A003 = C55133Obx.A00(c55133Obx);
                if (AbstractC25226BEj.A1Z(A003)) {
                    MSZ.A1C(enumC53379NjU, A003, A022);
                    A003.A0R("server_info", C55133Obx.A01(A01, A003, c55133Obx));
                    C55133Obx.A02(A002, A03, A003, c55133Obx, A0L);
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                this.A01 = new OE1(interfaceC58104PpT, num, Long.valueOf(elapsedRealtime2), str, elapsedRealtime2);
                this.A00 = null;
            }
        }
    }

    public /* synthetic */ C55095Ob6(UserSession userSession, OI6 oi6) {
        C55133Obx A00 = AbstractC53884NsG.A00(userSession);
        C14360o3.A0B(A00, 3);
        this.A02 = userSession;
        this.A04 = oi6;
        this.A03 = A00;
    }

    public static final Integer A00(InterfaceC58104PpT interfaceC58104PpT) {
        int intValue = interfaceC58104PpT.Ar7().intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue == 3) {
                        return C05F.A0C;
                    }
                    throw B4Z.A00();
                }
                return C05F.A00;
            }
            return C05F.A01;
        }
        return C05F.A0N;
    }

    public final void A05(String str, int i) {
        this.A03.A03(EnumC53379NjU.A0E, str, AbstractC25232BEp.A1F(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, "success", AbstractC166987dD.A1L("num_results", String.valueOf(i)), AbstractC166987dD.A1L("request_type", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT)));
    }
}
