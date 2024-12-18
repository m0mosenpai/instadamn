package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.DuU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31602DuU {
    public C7NH A00;
    public Map A01;
    public final UserSession A02;

    public final void A01(C3o9 c3o9) {
        String str;
        C3o9 A02;
        C14360o3.A0B(c3o9, 0);
        C7NH A00 = C7NH.A00(this.A02);
        C14360o3.A0B(A00, 0);
        this.A00 = A00;
        ImmutableList A01 = A00.A01();
        C14360o3.A07(A01);
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        Iterator<E> it = A01.iterator();
        while (it.hasNext()) {
            DirectShareTarget A0m = AbstractC31172DnG.A0m(it);
            if (!(AbstractC31171DnF.A0O(A0m) instanceof C23974Ak9) && (A02 = A0m.A02()) != null) {
                A1I.put(A00(A02), A0m);
            }
        }
        this.A01 = A1I;
        String A002 = A00(c3o9);
        Map map = this.A01;
        if (map != null) {
            if (map.containsKey(A002)) {
                Map map2 = this.A01;
                if (map2 != null) {
                    DirectShareTarget directShareTarget = (DirectShareTarget) map2.get(A002);
                    if (directShareTarget != null) {
                        C7NH c7nh = this.A00;
                        if (c7nh != null) {
                            c7nh.A03(directShareTarget);
                            return;
                        } else {
                            str = "recentSearchesCoordinator";
                            C14360o3.A0F(str);
                            throw C00O.createAndThrow();
                        }
                    }
                    return;
                }
            } else {
                return;
            }
        }
        str = "recentResultMap";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public void A02(C3o9 c3o9, Integer num) {
        AbstractC167007dF.A1K(c3o9, num);
        A03(c3o9, num, false);
    }

    public void A03(C3o9 c3o9, Integer num, boolean z) {
        C31605DuX c31605DuX = (C31605DuX) this;
        C14360o3.A0B(num, 2);
        if (JRE.A0A(c3o9)) {
            AbstractC34188F6m.A00(c31605DuX.A00, c31605DuX.A01, new G6X(c31605DuX, c3o9, z), c3o9, num);
            return;
        }
        throw AbstractC31172DnG.A0u();
    }

    public AbstractC31602DuU(UserSession userSession) {
        this.A02 = userSession;
    }

    public static final String A00(C3o9 c3o9) {
        if (JRE.A0A(c3o9)) {
            String A15 = AbstractC31172DnG.A15(c3o9);
            if (A15 == null) {
                return "";
            }
            return A15;
        }
        if (JRE.A04(c3o9) != null) {
            return String.valueOf(AbstractC31179DnN.A03(c3o9));
        }
        throw AbstractC166987dD.A14(AbstractC167017dG.A0n(c3o9, "Unsupported threadKey type: ", AbstractC166987dD.A1C()));
    }
}
