package X;

import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.8Zk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC189168Zk {
    public static final int A00(C84B c84b) {
        C115475Kh c115475Kh;
        C115475Kh c115475Kh2;
        Integer num;
        C14360o3.A0B(c84b, 0);
        ArrayList A05 = c84b.A05();
        C14360o3.A0C(A05, "null cannot be cast to non-null type java.util.ArrayList<com.instagram.creation.capture.quickcapture.video.model.IgClipSegment>");
        int i = 0;
        while (i < A05.size()) {
            Object obj = A05.get(i);
            if ((obj instanceof C115475Kh) && (c115475Kh = (C115475Kh) obj) != null && c115475Kh.A0H != null) {
                Object obj2 = A05.get(i);
                if (!(obj2 instanceof C115475Kh) || (c115475Kh2 = (C115475Kh) obj2) == null || (num = c115475Kh2.A0H) == null || num.intValue() != i) {
                    break;
                }
            }
            i++;
        }
        return i;
    }

    public static final boolean A03(InterfaceC110074xc interfaceC110074xc) {
        C14360o3.A0B(interfaceC110074xc, 0);
        if (interfaceC110074xc.Bp7() != null && interfaceC110074xc.Bp6() != null) {
            Integer Bp7 = interfaceC110074xc.Bp7();
            if (Bp7 != null) {
                if (Bp7.intValue() >= 0) {
                    Integer Bp6 = interfaceC110074xc.Bp6();
                    if (Bp6 != null) {
                        if (Bp6.intValue() > 0) {
                            Integer Bp62 = interfaceC110074xc.Bp6();
                            if (Bp62 != null) {
                                int intValue = Bp62.intValue();
                                Integer Bp72 = interfaceC110074xc.Bp7();
                                if (Bp72 != null) {
                                    if (intValue > Bp72.intValue()) {
                                        return true;
                                    }
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return false;
    }

    public static final C47Z A01(UserSession userSession, C47Z c47z) {
        List list;
        List list2;
        C115595Kt c115595Kt = c47z.A1P;
        if (c115595Kt != null && (list = (List) c115595Kt.A06.getValue()) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C115475Kh) it.next()).A0P) {
                    Map map = ((C23657Ads) userSession.A01(C23657Ads.class, B6T.A00)).A00;
                    StringBuilder sb = new StringBuilder();
                    sb.append(c47z.A35);
                    C115595Kt c115595Kt2 = c47z.A1P;
                    if (c115595Kt2 != null && (list2 = (List) c115595Kt2.A06.getValue()) != null) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            int i = 0;
                            if (((C115475Kh) it2.next()).A0P) {
                                i = 1;
                            }
                            sb.append(i);
                        }
                        String obj = sb.toString();
                        C14360o3.A07(obj);
                        Object obj2 = map.get(obj);
                        if (obj2 != null) {
                            C47Z c47z2 = new C47Z(String.valueOf(System.nanoTime()));
                            c47z2.A0T(EnumC40111tc.A0A);
                            c47z2.A0j(AbstractC16960so.A1Q((C47Z) obj2, c47z));
                            c47z2.A0c(ShareType.A0C);
                            return c47z2;
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
        }
        return c47z;
    }

    public static final C47Z A02(C47Z c47z) {
        EnumC40111tc enumC40111tc = c47z.A1G;
        if (enumC40111tc == EnumC40111tc.A0A) {
            C47Z c47z2 = (C47Z) c47z.A0K().get(1);
            if (c47z2.A0D() == ShareType.A08) {
                return c47z2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("PendingMedia index 1 is not CLIPS: ");
            sb.append(c47z2.A0D());
            throw new IllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(MSV.A00(821));
        sb2.append(enumC40111tc);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static final boolean A04(C84B c84b) {
        ArrayList A05 = c84b.A05();
        C14360o3.A0C(A05, "null cannot be cast to non-null type java.util.ArrayList<com.instagram.creation.capture.quickcapture.video.model.IgClipSegment>");
        if (!(A05 instanceof Collection) || !A05.isEmpty()) {
            Iterator it = A05.iterator();
            while (it.hasNext()) {
                AbstractC115485Ki abstractC115485Ki = (AbstractC115485Ki) it.next();
                if (!(abstractC115485Ki instanceof C115475Kh) || !((C115475Kh) abstractC115485Ki).A0P) {
                    return false;
                }
            }
        }
        return true;
    }
}
