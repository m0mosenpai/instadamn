package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.V4m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67972V4m extends AbstractC60592pi implements InterfaceC60602pj {
    public final Map A00 = new HashMap();
    public final int A01;
    public final InterfaceC11380iw A02;
    public final C63702ur A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public static final void A00(C67972V4m c67972V4m, String str, boolean z) {
        Object obj;
        Map map = c67972V4m.A00;
        if (z) {
            obj = map.remove(str);
        } else {
            obj = map.get(str);
        }
        C69352Vly c69352Vly = (C69352Vly) obj;
        if (c69352Vly != null) {
            long currentTimeMillis = System.currentTimeMillis() - c69352Vly.A01;
            String A00 = AbstractC125245lV.A00(c67972V4m.A04);
            String moduleName = c67972V4m.A02.getModuleName();
            AbstractC167017dG.A1R(str, moduleName);
            String str2 = c69352Vly.A04;
            String str3 = c69352Vly.A02;
            String str4 = c69352Vly.A03;
            int i = c69352Vly.A00;
            int i2 = c67972V4m.A01;
            Long valueOf = Long.valueOf(currentTimeMillis);
            String str5 = c67972V4m.A06;
            C63702ur.A01(c67972V4m.A03, null, valueOf, str3, moduleName, null, c67972V4m.A05, str2, str5, null, c67972V4m.A07, str4, str, A00, i, i2);
            return;
        }
        C0w9.A03("SuggestedUsersOnViewableListener", AnonymousClass001.A0g("Tried to get user with userId: ", str, " from the viewable info map but no entry was found"));
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        this.A00.clear();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        Iterator A12 = AbstractC43593JPy.A12(this.A00);
        while (A12.hasNext()) {
            A00(this, (String) A12.next(), false);
        }
    }

    public C67972V4m(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Integer num, String str, String str2, String str3, int i) {
        this.A02 = interfaceC11380iw;
        this.A01 = i;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = num;
        this.A07 = str3;
        this.A03 = new C63702ur(interfaceC11380iw, userSession);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        long currentTimeMillis = System.currentTimeMillis();
        Map map = this.A00;
        Iterator A12 = AbstractC43593JPy.A12(map);
        while (A12.hasNext()) {
            C69352Vly c69352Vly = (C69352Vly) map.get(A12.next());
            if (c69352Vly != null) {
                c69352Vly.A01 = currentTimeMillis;
            }
        }
    }
}
