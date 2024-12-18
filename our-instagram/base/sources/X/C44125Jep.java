package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.copresence.repository.persistence.RankedUserDatabase;
import com.instagram.roomdb.IgRoomDatabase;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Jep, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44125Jep {
    public AbstractRunnableC14200nk A00;
    public boolean A01;
    public final C2ES A02;
    public final UserSession A03;
    public final InterfaceC14020nS A04;
    public final RankedUserDatabase A05;
    public final C23031Ai A06;
    public final HashMap A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;

    public static final void A01(C44125Jep c44125Jep) {
        String str;
        List A1Q = AbstractC16960so.A1Q(C44131Jew.A00, C44132Jex.A00);
        ArrayList A0q = AbstractC167017dG.A0q(A1Q);
        Iterator it = A1Q.iterator();
        while (it.hasNext()) {
            if (((AbstractC46402KgO) it.next()) instanceof C44131Jew) {
                str = "CALL_RECIPIENTS";
            } else {
                str = "BFF";
            }
            A0q.add(str);
        }
        UserSession userSession = c44125Jep.A03;
        C2JM A0b = AbstractC25225BEi.A0b();
        ImmutableList copyOf = ImmutableList.copyOf((Collection) A0q);
        A0b.A05("views", copyOf);
        C18C.A0E(AbstractC167007dF.A1W(copyOf));
        C907442n c907442n = new C907442n(A0b, C44972JvO.class, "IGCoPresenceRankingModel", false);
        C907542o c907542o = new C907542o(userSession);
        c907542o.A08(c907442n);
        c907542o.A08 = AbstractC111324zv.A00(58);
        C1ON A05 = c907542o.A05();
        C44093JeI.A00(A05, c44125Jep, 4);
        C1GJ.A03(A05);
    }

    public /* synthetic */ C44125Jep(UserSession userSession) {
        InterfaceC14020nS A00 = C14120nc.A00();
        C14360o3.A0B(A00, 3);
        this.A03 = userSession;
        this.A04 = A00;
        C44126Jeq c44126Jeq = RankedUserDatabase.A00;
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession.A00(RankedUserDatabase.class);
        if (igRoomDatabase == null) {
            synchronized (c44126Jeq) {
                igRoomDatabase = (IgRoomDatabase) userSession.A00(RankedUserDatabase.class);
                if (igRoomDatabase == null) {
                    C1Ye A0K = AbstractC43594JPz.A0K(userSession, c44126Jeq, RankedUserDatabase.class);
                    AbstractC28241Yh.A00(A0K, 1953514958, 848202412, true);
                    igRoomDatabase = AbstractC43594JPz.A0k(A0K, userSession, RankedUserDatabase.class);
                }
            }
        }
        this.A05 = (RankedUserDatabase) igRoomDatabase;
        this.A07 = AbstractC166987dD.A1G();
        this.A02 = C2EP.A00();
        this.A06 = AbstractC23021Ah.A00(userSession);
        this.A08 = AbstractC09440dt.A01(C44128Jet.A00);
        this.A09 = AbstractC09440dt.A01(C44129Jeu.A00);
        this.A04.ATO(new C44127Jer(this));
    }

    public static final ArrayList A00(C44125Jep c44125Jep, List list) {
        String str;
        String str2;
        ImageUrl simpleImageUrl;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MQP mqp = (MQP) it.next();
            C18A A00 = AnonymousClass189.A00(c44125Jep.A03);
            String BGJ = mqp.BGJ();
            User A02 = A00.A02(BGJ);
            if (A02 != null) {
                str = A02.getFullName();
            } else {
                str = null;
            }
            if (A02 != null) {
                str2 = A02.getUsername();
                simpleImageUrl = A02.Bhu();
            } else {
                C50679MYx CDs = mqp.CDs();
                str2 = CDs.A01;
                String str3 = CDs.A00;
                if (str3 == null) {
                    str3 = "";
                }
                simpleImageUrl = new SimpleImageUrl(str3);
            }
            if (str2 != null) {
                A1E.add(new C44135Jf0(simpleImageUrl, BGJ, str, str2));
            }
        }
        return A1E;
    }
}
