package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class NTV extends AbstractC55206OeJ {
    public String A00;
    public String A01;
    public final Context A02;
    public final UserSession A03;
    public final OI6 A04;
    public final PCL A05;
    public final C55177Odh A06;
    public final OJ2 A07;
    public final OE2 A08;

    public static final InterfaceC57860PlQ A01(EnumC53248Ngm enumC53248Ngm, NTV ntv) {
        String A0p;
        Map map;
        boolean z;
        List A12;
        InterfaceC57860PlQ c51911Mwt;
        int ordinal;
        List list;
        if (enumC53248Ngm != null && (ordinal = enumC53248Ngm.ordinal()) != -1) {
            if (ordinal != 28) {
                if (ordinal != 0) {
                    OE2 oe2 = ntv.A08;
                    boolean A06 = C18U.A06(C06090Tz.A05, oe2.A04, 36315606345059776L);
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 4) {
                                c51911Mwt = C56693PEl.A00;
                            } else {
                                list = oe2.A01;
                                if (list == null) {
                                    list = AbstractC16960so.A1Q(EnumC53248Ngm.A0I, EnumC53248Ngm.A0H, EnumC53248Ngm.A0K, EnumC53248Ngm.A0L, EnumC53248Ngm.A0F, EnumC53248Ngm.A0G, EnumC53248Ngm.A0E, EnumC53248Ngm.A0J);
                                    oe2.A01 = list;
                                    if (A06) {
                                        list = C0eM.A1H(list);
                                        oe2.A01 = list;
                                    }
                                }
                            }
                        } else {
                            list = oe2.A02;
                            if (list == null) {
                                list = AbstractC16960so.A1Q(EnumC53248Ngm.A0P, EnumC53248Ngm.A0R, EnumC53248Ngm.A0T, EnumC53248Ngm.A0O, EnumC53248Ngm.A0S, EnumC53248Ngm.A0U, EnumC53248Ngm.A0V, EnumC53248Ngm.A0Q);
                                oe2.A02 = list;
                                if (A06) {
                                    list = C0eM.A1H(list);
                                    oe2.A02 = list;
                                }
                            }
                        }
                    } else {
                        list = oe2.A00;
                        if (list == null) {
                            list = AbstractC16960so.A1Q(EnumC53248Ngm.A09, EnumC53248Ngm.A08, EnumC53248Ngm.A0B, EnumC53248Ngm.A0A, EnumC53248Ngm.A07, EnumC53248Ngm.A06, EnumC53248Ngm.A04);
                            oe2.A00 = list;
                            if (A06) {
                                list = C0eM.A1H(list);
                                oe2.A00 = list;
                            }
                        }
                    }
                    return new C51911Mwt(AbstractC166997dE.A0p(oe2.A03, 2131954547), AbstractC001800i.A0T(EnumC53248Ngm.A0M, list));
                }
                OE2 oe22 = ntv.A08;
                A0p = AbstractC166997dE.A0p(oe22.A03, 2131954544);
                map = oe22.A05;
                z = true;
                A12 = AbstractC43592JPx.A12(true, map);
                if (A12 == null) {
                    A12 = AbstractC16960so.A1Q(EnumC53248Ngm.A03, EnumC53248Ngm.A0D);
                    map.put(z, A12);
                }
                c51911Mwt = new C51911Mwt(A0p, A12);
            } else {
                c51911Mwt = new C51910Mws(AbstractC166997dE.A0p(ntv.A08.A03, 2131954545));
            }
        } else {
            OE2 oe23 = ntv.A08;
            A0p = AbstractC166997dE.A0p(oe23.A03, 2131954544);
            map = oe23.A05;
            z = false;
            A12 = AbstractC43592JPx.A12(false, map);
            if (A12 == null) {
                List A1Q = AbstractC16960so.A1Q(EnumC53248Ngm.A03, EnumC53248Ngm.A0N);
                if (C18U.A06(C06090Tz.A05, oe23.A04, 36323594984238485L)) {
                    A1Q = C0eM.A1H(A1Q);
                }
                A12 = AbstractC001800i.A0T(EnumC53248Ngm.A0D, A1Q);
                map.put(z, A12);
            }
            c51911Mwt = new C51911Mwt(A0p, A12);
        }
        return c51911Mwt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NTV(Context context, UserSession userSession, OI6 oi6, C55177Odh c55177Odh, OJ2 oj2) {
        super(AbstractC25225BEi.A1D(C56623PBt.class));
        OE2 oe2 = new OE2(context, userSession);
        AbstractC25233BEq.A0x(3, c55177Odh, oi6, oj2);
        this.A02 = context;
        this.A03 = userSession;
        this.A06 = c55177Odh;
        this.A04 = oi6;
        this.A07 = oj2;
        this.A08 = oe2;
        this.A05 = PCL.A00;
    }

    public static final C189448aO A00(NTV ntv) {
        C189448aO A00 = ntv.A07.A00(MSW.A1F(ntv, 63), 1.0f, 1.0f, true, false, false);
        A00.A1I = false;
        A00.A0Z = true;
        A00.A19 = false;
        A00.A0A = AbstractC53242c7.A02(ntv.A02);
        return A00;
    }

    public static final void A02(NTV ntv, String str) {
        String str2;
        String str3 = ntv.A00;
        String str4 = ntv.A01;
        if (C18U.A06(C06090Tz.A05, ntv.A03, 2342156227557066569L)) {
            str2 = AbstractC06300Uv.A02();
        } else {
            str2 = null;
        }
        if (str3 != null && str4 != null) {
            ntv.A04.A00(new PB4(str3, str4, str2, str));
        }
    }
}
