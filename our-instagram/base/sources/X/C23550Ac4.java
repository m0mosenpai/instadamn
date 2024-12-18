package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Ac4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23550Ac4 implements C2JL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C3VI A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C23550Ac4(C3VI c3vi, String str, String str2, int i) {
        this.A01 = c3vi;
        this.A02 = str;
        this.A00 = i;
        this.A03 = str2;
    }

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        C3VI c3vi = this.A01;
        String str = this.A02;
        synchronized (c3vi) {
            if (str.equals(c3vi.A02)) {
                c3vi.A00 = null;
            }
        }
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        UserSession userSession;
        C202098wp c202098wp = (C202098wp) obj;
        C3VI c3vi = this.A01;
        String str = this.A02;
        synchronized (c3vi) {
            if (str.equals(c3vi.A02)) {
                c3vi.A00 = null;
            }
        }
        boolean z = false;
        if (c202098wp != null && (c202098wp.A02 != null || c202098wp.A0N != null || c202098wp.A03 != null || c202098wp.A0I != null)) {
            z = true;
        }
        int i = this.A00 + 1;
        if (z) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(c202098wp);
            C127625pm A00 = C127625pm.A00(true, null, c3vi.A04, c3vi.A05, arrayList, null);
            if (A00 != null && (userSession = c3vi.A01) != null) {
                C907542o c907542o = new C907542o(userSession);
                c907542o.A09(A00);
                C1ON A07 = c907542o.A07(C05F.A00);
                A07.A00 = new C207879Ht(c3vi, 11);
                C1GJ.A03(A07);
            }
        }
        C3VI.A01(c3vi, str, this.A03, i);
    }
}
