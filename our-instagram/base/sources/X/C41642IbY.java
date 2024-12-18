package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: X.IbY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41642IbY {
    public Map A00;
    public final UserSession A01;

    public C41642IbY(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AbstractC06930Yk.A0E();
    }

    public final synchronized void A01(EnumC39623HeX enumC39623HeX, String str, boolean z) {
        C14360o3.A0B(enumC39623HeX, 0);
        if (z) {
            C37669Gi2 A00 = A00(this, str);
            LinkedHashSet A01 = AnonymousClass090.A01(enumC39623HeX.A00, (java.util.Set) A00.A02);
            C14360o3.A0B(A01, 0);
            A00.A02 = A01;
            if (A01.size() == A00.A00) {
                Iterator it = ((java.util.Set) A00(this, str).A01).iterator();
                while (it.hasNext()) {
                    AbstractC37304Gc5.A0o(AbstractC167007dF.A0B(it));
                }
                Map map = this.A00;
                if (str == null) {
                    str = "mixed_merchant";
                }
                this.A00 = AbstractC06930Yk.A09(str, map);
            }
        }
    }

    public final synchronized void A02(EnumC39623HeX enumC39623HeX, String str, boolean z) {
        C14360o3.A0B(enumC39623HeX, 0);
        if (z) {
            C37669Gi2 A00 = A00(this, str);
            LinkedHashSet A01 = AnonymousClass090.A01(enumC39623HeX.A00, (java.util.Set) A00.A03);
            C14360o3.A0B(A01, 0);
            A00.A03 = A01;
            if (A01.size() == A00.A00) {
                C16910sj c16910sj = C16910sj.A00;
                C14360o3.A0B(c16910sj, 0);
                A00.A02 = c16910sj;
                A00.A03 = c16910sj;
            }
        }
    }

    public final synchronized void A03(String str) {
        try {
            C37669Gi2 A00 = A00(this, str);
            if (((java.util.Set) A00.A01).contains(37370080)) {
                if (AbstractC31171DnF.A1b((java.util.Set) A00.A02)) {
                    C006802i.A0p.markerAnnotate(37370080, "failed_sections", (String[]) ((java.util.Set) A00.A02).toArray(new String[0]));
                }
                C006802i.A0p.markerEnd(37370080, (short) 2);
                Map map = this.A00;
                if (str == null) {
                    str = "mixed_merchant";
                }
                this.A00 = AbstractC06930Yk.A09(str, map);
            }
        } finally {
        }
    }

    public static final C37669Gi2 A00(C41642IbY c41642IbY, String str) {
        String str2;
        Map map = c41642IbY.A00;
        if (str == null) {
            str2 = "mixed_merchant";
        } else {
            str2 = str;
        }
        Object obj = map.get(str2);
        if (obj == null) {
            obj = new C37669Gi2();
            Map map2 = c41642IbY.A00;
            if (str == null) {
                str = "mixed_merchant";
            }
            c41642IbY.A00 = AbstractC06930Yk.A0C(map2, AbstractC166987dD.A1L(str, obj));
        }
        return (C37669Gi2) obj;
    }
}
