package X;

import android.content.Context;
import android.util.Pair;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.93q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2045693q extends C1P1 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C2045093j A01;
    public final /* synthetic */ boolean A02;

    public C2045693q(Context context, C2045093j c2045093j, boolean z) {
        this.A00 = context;
        this.A02 = z;
        this.A01 = c2045093j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.1vV, X.5mT, X.3ZN] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Integer num;
        String str;
        ?? r9;
        int A03 = C0f9.A03(1496254993);
        C123645id c123645id = (C123645id) obj;
        int A032 = C0f9.A03(385954075);
        C14360o3.A0B(c123645id, 0);
        Context context = this.A00;
        if (this.A02) {
            num = C05F.A0u;
        } else {
            num = C05F.A0j;
        }
        if (5 - num.intValue() != 0) {
            str = "self_profile";
        } else {
            str = "profile";
        }
        UserSession userSession = this.A01.A00;
        List list = c123645id.A03;
        if (list != null) {
            r9 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C38321qM c38321qM = ((C38748H4o) it.next()).A01;
                if (c38321qM != null) {
                    r9.add(c38321qM);
                }
            }
        } else {
            r9 = c123645id.A06;
            C14360o3.A07(r9);
        }
        C14360o3.A0B(r9, 0);
        ArrayList arrayList = new ArrayList();
        EnumC125765mR enumC125765mR = EnumC125765mR.A09;
        int size = r9.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C38321qM c38321qM2 = (C38321qM) r9.get(i2);
            if (i >= 3) {
                i = 0;
            }
            int i3 = i2 / 3;
            C3ZM A05 = C3ZH.A05(context, userSession, c38321qM2, str, false);
            Pair pair = new Pair(Integer.valueOf(i3), Integer.valueOf(i));
            Integer num2 = enumC125765mR.A01;
            C14360o3.A0B(num2, 2);
            ?? c3zn = new C3ZN(pair, C05F.A00);
            c3zn.A01 = num2;
            c3zn.A00 = enumC125765mR;
            c3zn.A02 = "profile_media_grid";
            arrayList.add(new C9BP(new C43121yf(A05, c3zn), i3, i));
            i++;
        }
        AbstractC42951yN.A00(userSession).A06(str, arrayList);
        C0f9.A0A(-1768914712, A032);
        C0f9.A0A(-640906303, A03);
    }
}
