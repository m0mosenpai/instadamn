package X;

import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.VQn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68431VQn {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C4NV c4nv;
        C69244VkC c69244VkC = (C69244VkC) C6BQ.A0F(c6fq, C69244VkC.class, R.id.bloks_action_listener);
        if (c69244VkC != null && c6fw.A00.size() > 0) {
            Integer A00 = AbstractC68570VVx.A00(AbstractC31177DnL.A0e(c6fw, 0));
            C14360o3.A0B(A00, 0);
            AbstractC55352ga abstractC55352ga = (AbstractC55352ga) c69244VkC.A02;
            C4NJ c4nj = (C4NJ) c69244VkC.A01;
            UserSession userSession = abstractC55352ga.A07;
            if (C18U.A06(C06090Tz.A05, userSession, 36326914993961158L)) {
                int intValue = A00.intValue();
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue == 3) {
                            c4nv = c4nj.A08.A00;
                        } else {
                            return null;
                        }
                    } else {
                        c4nv = c4nj.A08.A02;
                    }
                } else {
                    c4nv = c4nj.A08.A01;
                }
                A00 = c4nv != null ? c4nv.A02 : null;
            } else {
                Integer num = C05F.A01;
                C4NM c4nm = c4nj.A08;
                if (A00 != num && c4nm.A02 == null) {
                    return null;
                }
            }
            abstractC55352ga.A01(userSession, c4nj, A00);
            return null;
        }
        return null;
    }
}
