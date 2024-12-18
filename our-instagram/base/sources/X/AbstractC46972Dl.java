package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* renamed from: X.2Dl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC46972Dl {
    public final int A00;
    public final EnumC46982Dm A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final boolean A05;
    public final java.util.Set A06;

    public final boolean A00(UserSession userSession, C2EC c2ec) {
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            if (!((AbstractC47002Do) it.next()).A00(userSession, this, c2ec)) {
                return false;
            }
        }
        return true;
    }

    public AbstractC46972Dl(EnumC46982Dm enumC46982Dm, Integer num, Integer num2, String str, java.util.Set set, int i, boolean z) {
        this.A04 = str;
        this.A01 = enumC46982Dm;
        this.A00 = i;
        this.A03 = num;
        this.A05 = z;
        this.A02 = num2;
        this.A06 = set;
    }
}
