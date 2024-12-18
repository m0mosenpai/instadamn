package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.7Ba, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC158887Ba {
    public static final C910143t A01(C83403nh c83403nh) {
        Object obj = c83403nh.A1T;
        if (!(obj instanceof C910143t)) {
            if (obj instanceof List) {
                C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                if (!((List) obj).isEmpty()) {
                    Object obj2 = c83403nh.A1T;
                    C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    if (((List) obj2).get(0) instanceof C910143t) {
                        Object obj3 = c83403nh.A1T;
                        C14360o3.A0C(obj3, "null cannot be cast to non-null type kotlin.collections.List<*>");
                        obj = ((List) obj3).get(0);
                    }
                }
            }
            C910143t c910143t = c83403nh.A0j;
            if (c910143t != null) {
                return c910143t;
            }
            ImmutableList A0H = c83403nh.A0H();
            if (A0H != null) {
                obj = AbstractC001800i.A0O(A0H, 0);
                return (C910143t) obj;
            }
            return null;
        }
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.GenericFBAttachment");
        return (C910143t) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C910143t A02(AnonymousClass442 anonymousClass442) {
        C910143t c910143t = anonymousClass442.A09;
        if (c910143t == null) {
            ImmutableList A01 = anonymousClass442.A01();
            if (A01 != null && AbstractC001800i.A0O(A01, 0) != null) {
                ImmutableList A012 = anonymousClass442.A01();
                if (A012 != null) {
                    E e = A012.get(0);
                    C14360o3.A0A(e);
                    return (C910143t) e;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("No generic share items");
        }
        return c910143t;
    }

    public static final boolean A03(UserSession userSession, C83403nh c83403nh) {
        C2EY c2ey = c83403nh.A10;
        if ((c2ey == C2EY.A20 || c2ey == C2EY.A1z) && A00(c83403nh).A05() && !C14360o3.A0K(userSession.userId, c83403nh.BtE())) {
            return true;
        }
        return false;
    }

    public static final boolean A04(UserSession userSession, AnonymousClass442 anonymousClass442) {
        C2EY c2ey = anonymousClass442.A0F;
        if ((c2ey == C2EY.A20 || c2ey == C2EY.A1z) && A02(anonymousClass442).A05() && !AbstractC50102Ry.A00(userSession.userId, anonymousClass442.A0U)) {
            return true;
        }
        return false;
    }

    public static final C910143t A00(C83403nh c83403nh) {
        Class<?> cls;
        C910143t A01 = A01(c83403nh);
        if (A01 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected message content object type: ");
            Object obj = c83403nh.A1T;
            C2EY c2ey = null;
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            sb.append(cls);
            sb.append(", message type: ");
            sb.append(c83403nh.A10);
            sb.append(", replied message type: ");
            AnonymousClass442 A0P = c83403nh.A0P();
            if (A0P != null) {
                c2ey = A0P.A0F;
            }
            sb.append(c2ey);
            throw new IllegalStateException(sb.toString());
        }
        return A01;
    }
}
