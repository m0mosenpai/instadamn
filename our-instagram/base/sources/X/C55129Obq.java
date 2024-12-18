package X;

import java.util.List;

/* renamed from: X.Obq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55129Obq {
    public static final EnumC53376NjR A01(Integer num) {
        if (num == null) {
            return null;
        }
        switch (num.intValue()) {
            case 1:
                return EnumC53376NjR.LIKED;
            case 2:
                return EnumC53376NjR.SAVED;
            case 3:
                return EnumC53376NjR.SUGGESTED;
            case 4:
                return EnumC53376NjR.IGTV;
            case 5:
                return EnumC53376NjR.FACEBOOK_WATCH;
            case 6:
                return EnumC53376NjR.REELS;
            case 7:
                return EnumC53376NjR.SUGGESTED_REELS_SUBPAGE;
            case 8:
                return EnumC53376NjR.SUGGESTED_REELS_CAROUSEL;
            default:
                return null;
        }
    }

    public static final String A02(InterfaceC58104PpT interfaceC58104PpT, Integer num) {
        if ((interfaceC58104PpT instanceof C51768MuY) && num != null) {
            int intValue = num.intValue();
            List list = ((C51768MuY) interfaceC58104PpT).A08;
            if (list != null && intValue < list.size() && intValue >= 0) {
                return ((C51768MuY) list.get(intValue)).A05;
            }
        }
        return interfaceC58104PpT.Ar1();
    }

    public final EnumC53369NjK A03(InterfaceC58104PpT interfaceC58104PpT, Integer num) {
        if (interfaceC58104PpT instanceof C51768MuY) {
            C51768MuY c51768MuY = (C51768MuY) interfaceC58104PpT;
            if (c51768MuY.A04 == C05F.A01) {
                return EnumC53369NjK.REELS;
            }
            int intValue = c51768MuY.A03.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue != 3) {
                            return null;
                        }
                        if (num != null) {
                            int intValue2 = num.intValue();
                            List list = c51768MuY.A08;
                            if (list != null && intValue2 < list.size() && intValue2 >= 0) {
                                int intValue3 = ((C51768MuY) list.get(intValue2)).A03.intValue();
                                if (intValue3 != 0) {
                                    if (intValue3 != 1) {
                                        return null;
                                    }
                                    return EnumC53369NjK.CAROUSEL_VIDEO;
                                }
                                return EnumC53369NjK.CAROUSEL_PHOTO;
                            }
                        }
                        return EnumC53369NjK.CAROUSEL;
                    }
                    return EnumC53369NjK.IGTV;
                }
                return EnumC53369NjK.VIDEO;
            }
            return EnumC53369NjK.PHOTO;
        }
        return null;
    }

    public static final EnumC53343Nit A00(Integer num) {
        int intValue = num.intValue();
        if (intValue != 1 && intValue != 3) {
            if (intValue != 2) {
                return null;
            }
            return EnumC53343Nit.FACEBOOK;
        }
        return EnumC53343Nit.INSTAGRAM;
    }
}
