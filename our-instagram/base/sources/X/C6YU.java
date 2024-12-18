package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.showreel.IgShowreelComposition;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6YU, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6YU {
    public static final ArrayList A00(Context context, final UserSession userSession, C1PY c1py, final String str) {
        C14360o3.A0B(c1py, 0);
        C14360o3.A0B(str, 3);
        ArrayList arrayList = new ArrayList();
        C41051vD c41051vD = C41051vD.A01;
        c41051vD.A00 = userSession;
        C1341564a c1341564a = new C1341564a(c41051vD, 0, false);
        UserSession A00 = C1341564a.A00(c1341564a);
        C06090Tz c06090Tz = C06090Tz.A05;
        int A01 = (int) C18U.A01(c06090Tz, A00, 36592245190754682L);
        if (A01 >= 0) {
            C6YV c6yv = new C6YV(context, userSession, new C6YZ(), A01, (int) C18U.A01(c06090Tz, C1341564a.A00(c1341564a), 36592245191541117L), C18U.A06(c06090Tz, C1341564a.A00(c1341564a), 2342153779428589844L));
            c1py.A05(c6yv);
            arrayList.add(c6yv);
        }
        final int A012 = (int) C18U.A01(c06090Tz, userSession, 36594195103942288L);
        if (A012 >= 0) {
            final int A013 = (int) C18U.A01(c06090Tz, userSession, 36594195105646229L);
            final boolean A06 = C18U.A06(c06090Tz, userSession, 2342155729342563569L);
            C3GT c3gt = new C3GT(userSession, str, A012, A013, A06) { // from class: X.6YW
                public final int A00;
                public final UserSession A01;
                public final String A02;
                public final boolean A03;
                public final int A04;

                @Override // X.C3GT
                public final int BUo() {
                    return this.A04;
                }

                @Override // X.C3GT
                public final /* bridge */ /* synthetic */ void DNj(Object obj, int i) {
                    IgShowreelComposition Bx8;
                    int i2;
                    C41551w4 c41551w4 = (C41551w4) obj;
                    C14360o3.A0B(c41551w4, 0);
                    UserSession userSession2 = this.A01;
                    List A002 = C41551w4.A00(userSession2, c41551w4);
                    int size = A002.size();
                    int i3 = this.A00;
                    if (size > i3) {
                        size = i3;
                    }
                    int i4 = c41551w4.A0H.A00;
                    if (!this.A03 && i4 != 0 && size > (i2 = i4 + 1)) {
                        size = i2;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        C41181vS c41181vS = (C41181vS) A002.get(i5);
                        C38321qM c38321qM = c41181vS.A0b;
                        if (c38321qM != null && AbstractC130925vf.A0e(c41181vS) && (Bx8 = c38321qM.A0C.Bx8()) != null) {
                            C6V4.A00(userSession2).A01(Bx8.Aqq(), this.A02, Bx8.Acz());
                        }
                    }
                }

                {
                    this.A01 = userSession;
                    this.A02 = str;
                    this.A04 = A012;
                    this.A00 = A013;
                    this.A03 = A06;
                }
            };
            c1py.A05(c3gt);
            arrayList.add(c3gt);
        }
        return arrayList;
    }
}
