package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.gallery.suggestions.database.SuggestionsDBHelper;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

/* loaded from: classes8.dex */
public final class LGB {
    public final Context A00;
    public final UserSession A01;
    public final SuggestionsDBHelper A02;
    public final C60322pF A03;
    public final C43900JbA A04;
    public final C43899Jb9 A05;
    public final Map A06;
    public final InterfaceC16620sF A07;

    public final Object A01(EnumC222729sD enumC222729sD, InterfaceC23621Ds interfaceC23621Ds) {
        Object A00;
        Object obj = this.A06.get(enumC222729sD);
        if (obj != null && (A00 = AbstractC23641Du.A00(interfaceC23621Ds, AbstractC43592JPx.A0W(C12L.A00, 281480192), new JWL(this, enumC222729sD, obj, null, 13))) == C1JX.A02) {
            return A00;
        }
        return C0eB.A00;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, com.instagram.gallery.suggestions.database.SuggestionsDBHelper] */
    public /* synthetic */ LGB(Context context, UserSession userSession, C60322pF c60322pF, C43900JbA c43900JbA, C43898Jb8 c43898Jb8, C43899Jb9 c43899Jb9) {
        C47034Kqr c47034Kqr = SuggestionsDBHelper.A00;
        SuggestionsDBHelper suggestionsDBHelper = SuggestionsDBHelper.A01;
        if (suggestionsDBHelper == null) {
            synchronized (c47034Kqr) {
                SuggestionsDBHelper suggestionsDBHelper2 = SuggestionsDBHelper.A01;
                suggestionsDBHelper = suggestionsDBHelper2;
                if (suggestionsDBHelper2 == null) {
                    ?? obj = new Object();
                    SuggestionsDBHelper.A01 = obj;
                    suggestionsDBHelper = obj;
                }
            }
        }
        C14360o3.A0B(suggestionsDBHelper, 8);
        this.A01 = userSession;
        this.A00 = context;
        this.A05 = c43899Jb9;
        this.A03 = c60322pF;
        this.A04 = c43900JbA;
        this.A02 = suggestionsDBHelper;
        C30191DRw c30191DRw = new C30191DRw(this, 34);
        this.A07 = c30191DRw;
        EnumC222729sD enumC222729sD = EnumC222729sD.A02;
        C09530e4 A1L = AbstractC166987dD.A1L(enumC222729sD, AbstractC166987dD.A1J(new C47696L4d(context, userSession, enumC222729sD, c60322pF, c43898Jb8, c43899Jb9, c30191DRw)));
        EnumC222729sD enumC222729sD2 = EnumC222729sD.A05;
        C09530e4 A1L2 = AbstractC166987dD.A1L(enumC222729sD2, AbstractC166987dD.A1J(new C47696L4d(context, userSession, enumC222729sD2, c60322pF, c43898Jb8, c43899Jb9, c30191DRw)));
        EnumC222729sD enumC222729sD3 = EnumC222729sD.A03;
        this.A06 = AbstractC25232BEp.A1F(enumC222729sD3, AbstractC166987dD.A1J(new C47696L4d(context, userSession, enumC222729sD3, c60322pF, c43898Jb8, c43899Jb9, c30191DRw)), A1L, A1L2);
    }

    public static final InterfaceC224417g A00(Context context, LGB lgb, int i) {
        Calendar A00 = AbstractC195628l3.A00();
        A00.setTimeInMillis(System.currentTimeMillis());
        A00.add(5, -i);
        Date time = A00.getTime();
        C14360o3.A07(time);
        int time2 = (int) (((float) AbstractC195798lM.A01(AbstractC195628l3.A00(), time).getTime()) / 1000.0f);
        return AbstractC47036Kqt.A00(context, C16930sl.A00, C60322pF.A00(lgb.A01), time2);
    }
}
