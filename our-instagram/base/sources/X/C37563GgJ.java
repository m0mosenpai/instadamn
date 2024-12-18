package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.GgJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37563GgJ {
    public final AbstractC59962oe A00;
    public final C59952od A01;
    public final C37546Gg2 A02;
    public final C37624GhJ A03;
    public final C37540Gfw A04;

    public C37563GgJ(AbstractC59962oe abstractC59962oe, C59952od c59952od, C37540Gfw c37540Gfw, C37546Gg2 c37546Gg2, C37624GhJ c37624GhJ) {
        C14360o3.A0B(c37624GhJ, 3);
        this.A00 = abstractC59962oe;
        this.A01 = c59952od;
        this.A03 = c37624GhJ;
        this.A02 = c37546Gg2;
        this.A04 = c37540Gfw;
    }

    public final C37644Ghd A01(C120985dq c120985dq) {
        C14360o3.A0B(c120985dq, 0);
        return this.A02.A0A.C09(c120985dq);
    }

    public final int A00() {
        return this.A01.A0N().A03();
    }

    public final C25370BKn A02(int i) {
        Object obj;
        C37658Ghr c37658Ghr;
        List A01;
        C38321qM c38321qM;
        String id;
        View A07 = this.A01.A0N().A07(i);
        if (A07 != null) {
            obj = A07.getTag();
        } else {
            obj = null;
        }
        if (!(obj instanceof C37658Ghr) || (c37658Ghr = (C37658Ghr) obj) == null) {
            return null;
        }
        C120985dq A03 = this.A03.A03(i);
        if (A03 != null) {
            C37540Gfw c37540Gfw = this.A04;
            C37644Ghd C09 = this.A02.A0A.C09(A03);
            C14360o3.A0B(C09, 1);
            Integer num = C09.A0H;
            Integer num2 = null;
            Object obj2 = null;
            num2 = null;
            if (num != null) {
                int intValue = num.intValue();
                List A012 = AbstractC37655Gho.A01(A03);
                if (A012 != null) {
                    List list = A03.A0R;
                    if (list != null) {
                        obj2 = list.get(intValue);
                    }
                    num2 = Integer.valueOf(A012.indexOf(obj2));
                }
            }
            UserSession userSession = c37540Gfw.A0Y;
            boolean z = !AbstractC37655Gho.A05(A03, userSession);
            C14360o3.A0B(userSession, 0);
            if ((C18U.A06(C06090Tz.A05, userSession, 36326927878863049L) || C903540u.A00.A01(userSession, A03.A02)) && AbstractC37655Gho.A05(A03, userSession) && !A03.CdW()) {
                z = false;
                if (num2 != null) {
                    z = true;
                }
            }
            if (AbstractC37655Gho.A02(A03) && z) {
                HashMap hashMap = c37658Ghr.A0A;
                if (num2 == null || (A01 = AbstractC37655Gho.A01(A03)) == null || (c38321qM = (C38321qM) AbstractC001800i.A0O(A01, num2.intValue())) == null || (id = c38321qM.getId()) == null) {
                    return null;
                }
                return (C25370BKn) hashMap.get(id);
            }
        }
        return c37658Ghr.A07;
    }
}
