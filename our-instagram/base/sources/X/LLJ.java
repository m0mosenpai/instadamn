package X;

import android.content.Context;
import android.text.SpannableString;
import com.facebook.R;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes8.dex */
public final class LLJ {
    public static final LLJ A00 = new Object();

    public static final AbstractC1583778x A02(Integer num, Integer num2, Integer num3, Integer num4, Long l, String str) {
        Float f;
        int i;
        int intValue;
        int intValue2;
        Integer num5 = null;
        if (l == null) {
            return null;
        }
        if (num3 != null && num3.intValue() == 1) {
            return null;
        }
        if (num2 != null && num2.intValue() == 1) {
            return null;
        }
        if (num != null && num.intValue() == 1) {
            return C45933KUk.A00;
        }
        String A19 = AbstractC166987dD.A19(LHB.A00(str, null, l.longValue()));
        if (num3 != null && num2 != null && (intValue = num2.intValue()) != 0 && (intValue2 = num3.intValue()) != 0) {
            f = Float.valueOf(intValue / intValue2);
        } else {
            f = null;
        }
        SimpleImageUrl A0t = AbstractC25225BEi.A0t(A19);
        if (num4 != null) {
            int intValue3 = num4.intValue();
            if (intValue3 != 1) {
                if (intValue3 != 2) {
                    if (intValue3 == 3) {
                        i = R.drawable.play_button;
                    }
                } else {
                    i = R.drawable.instagram_reels_pano_filled_24;
                }
            } else {
                i = R.drawable.filled_grid_album_icon;
            }
            num5 = Integer.valueOf(i);
        }
        return new C158737Aj(A0t, AbstractC166997dE.A0a(), f, null, null, null, null, num5, null, null);
    }

    public final C206409Bx A05(Integer num, String str, String str2) {
        int intValue;
        EnumC46175KcD enumC46175KcD;
        if (num == null || (intValue = num.intValue()) == 0 || str2 == null) {
            return null;
        }
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue != 3) {
                    C0w9.A03("XmaContentViewModelHelper_mapXmaGatingTypeToIconRes", "Unsupported gating type");
                    enumC46175KcD = EnumC46175KcD.A02;
                } else {
                    enumC46175KcD = EnumC46175KcD.A05;
                }
            } else {
                enumC46175KcD = EnumC46175KcD.A02;
            }
        } else {
            enumC46175KcD = EnumC46175KcD.A06;
        }
        return new C206409Bx((String) null, new C47790L8w(enumC46175KcD, str, str2, false), 7);
    }

    public final boolean A07(InterfaceC50520MRx interfaceC50520MRx, int i, boolean z) {
        Object CIG;
        Integer CID;
        EnumC1583878y enumC1583878y;
        int ordinal;
        if (z) {
            CIG = interfaceC50520MRx.BnX(i);
            CID = interfaceC50520MRx.BnW(i);
        } else {
            CIG = interfaceC50520MRx.CIG(i);
            CID = interfaceC50520MRx.CID(i);
        }
        if (CID != null && CID.intValue() == 5000 && CIG != null) {
            EnumC46255KdX enumC46255KdX = (EnumC46255KdX) ((AbstractC907342m) CIG).A04("target_type", EnumC46255KdX.A12);
            if (enumC46255KdX != null && (ordinal = enumC46255KdX.ordinal()) != 0 && ordinal == 20) {
                enumC1583878y = EnumC1583878y.A0C;
            } else {
                enumC1583878y = EnumC1583878y.A0f;
            }
            if (enumC1583878y != EnumC1583878y.A0f) {
                return true;
            }
        }
        return false;
    }

    public static final C1579877i A00(Integer num, String str, String str2, String str3) {
        SpannableString A002 = AbstractC1583478u.A00(str, str2);
        if (A002 != null) {
            return new C1579877i(null, null, null, A002, null, null, str3, null, null, null, num, null, null, null, null, 2);
        }
        return null;
    }

    public static final C1583678w A01(Long l, String str, String str2) {
        if (l != null && str != null) {
            return new C1583678w(null, null, str, null, null, null, null, null, null, null, AbstractC166987dD.A1J(AbstractC25225BEi.A0t(AbstractC166987dD.A19(LHB.A00(str2, null, l.longValue())))));
        }
        return null;
    }

    public static final boolean A04(UserSession userSession, EnumC1583878y enumC1583878y) {
        long j;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 2342160187517047634L)) {
            switch (enumC1583878y.ordinal()) {
                case 1:
                case 2:
                case 7:
                    j = 2342160187517178708L;
                    break;
                case 4:
                case 5:
                case 8:
                case Process.SIGTERM /* 15 */:
                    j = 2342160187516982097L;
                    break;
                case 6:
                    j = 2342160187517244245L;
                    break;
                case 10:
                    j = 2342160187517113171L;
                    break;
                case 11:
                    j = 2342160187517309782L;
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    j = 2342160187517375319L;
                    break;
                case 18:
                    j = 2342160187517506392L;
                    break;
            }
            return AbstractC31176DnK.A1a(c06090Tz, userSession, j);
        }
        return false;
    }

    public static final C76K A03(Context context, C7IM c7im, String str, boolean z) {
        int i = z ? 8388613 : 8388611;
        if (str != null) {
            return new C76K(null, str, null, null, null, context.getResources().getDimensionPixelOffset(R.dimen.abc_control_corner_material), i, c7im.A04.A04, c7im.A00);
        }
        return null;
    }

    public final boolean A06(InterfaceC50520MRx interfaceC50520MRx, int i) {
        EnumC1583878y enumC1583878y;
        int ordinal;
        Object CIG = interfaceC50520MRx.CIG(i);
        Integer CID = interfaceC50520MRx.CID(i);
        if (CID != null && CID.intValue() == 5000 && CIG != null) {
            EnumC46255KdX enumC46255KdX = (EnumC46255KdX) ((AbstractC907342m) CIG).A04("target_type", EnumC46255KdX.A12);
            if (enumC46255KdX != null && (ordinal = enumC46255KdX.ordinal()) != 0 && ordinal == 20) {
                enumC1583878y = EnumC1583878y.A0C;
            } else {
                enumC1583878y = EnumC1583878y.A0f;
            }
            if (enumC1583878y == EnumC1583878y.A0f) {
                return true;
            }
        }
        return false;
    }
}
