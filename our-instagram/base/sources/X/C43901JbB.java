package X;

import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.gallery.suggestions.database.SuggestionsDBHelper;
import com.instagram.gallery.suggestions.database.SuggestionsDatabase;
import com.instagram.roomdb.IgRoomDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.JbB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43901JbB {
    public final C43898Jb8 A00;
    public final C43902JbC A01;
    public final C43899Jb9 A02;

    public C43901JbB(Context context, UserSession userSession) {
        AbstractC167017dG.A1P(context, userSession);
        this.A02 = new C43899Jb9(context, userSession);
        C43898Jb8 c43898Jb8 = new C43898Jb8(userSession);
        this.A00 = c43898Jb8;
        this.A01 = (C43902JbC) userSession.A01(C43902JbC.class, new C29900DGo(16, context, userSession, c43898Jb8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List, java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    public final List A00(C51755Mte c51755Mte) {
        Integer A0p;
        Boolean valueOf;
        String string;
        if (!C14360o3.A0K(Looper.getMainLooper(), Looper.myLooper())) {
            C43902JbC c43902JbC = this.A01;
            List<EnumC222729sD> list = (List) c51755Mte.A00;
            AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", list, null);
            ArrayList A0i = AbstractC167007dF.A0i(list);
            for (EnumC222729sD enumC222729sD : list) {
                Map map = c43902JbC.A05;
                ?? A12 = AbstractC43592JPx.A12(enumC222729sD, map);
                if (A12 != 0 && !A12.isEmpty()) {
                    A12.size();
                } else {
                    UserSession userSession = c43902JbC.A01;
                    String name = enumC222729sD.name();
                    boolean A1R = AbstractC167007dF.A1R(0, userSession, name);
                    C49580LvZ c49580LvZ = SuggestionsDatabase.A00;
                    IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession.A00(SuggestionsDatabase.class);
                    if (igRoomDatabase == null) {
                        synchronized (c49580LvZ) {
                            igRoomDatabase = (IgRoomDatabase) userSession.A00(SuggestionsDatabase.class);
                            if (igRoomDatabase == null) {
                                C1Ye A0K = AbstractC43594JPz.A0K(userSession, c49580LvZ, SuggestionsDatabase.class);
                                AbstractC28241Yh.A00(A0K, 1771825795, 1771825795, false);
                                igRoomDatabase = AbstractC43594JPz.A0k(A0K, userSession, SuggestionsDatabase.class);
                            }
                        }
                    }
                    C47915LEj A00 = ((SuggestionsDatabase) igRoomDatabase).A00();
                    TreeMap treeMap = C37581ov.A08;
                    C37581ov A002 = AbstractC37591ow.A00("SELECT * FROM suggestions WHERE suggestion_mode = ?", A1R ? 1 : 0);
                    A002.ADp(A1R ? 1 : 0, name);
                    C1YP c1yp = A00.A01;
                    c1yp.assertNotSuspendingTransaction();
                    c1yp.beginTransaction();
                    try {
                        Cursor A003 = C3EP.A00(c1yp, A002, A1R);
                        try {
                            int A01 = AbstractC37601ox.A01(A003, "suggestion_id");
                            int A012 = AbstractC37601ox.A01(A003, DialogModule.KEY_TITLE);
                            int A013 = AbstractC37601ox.A01(A003, "subtitle");
                            int A014 = AbstractC37601ox.A01(A003, "concept");
                            int A015 = AbstractC37601ox.A01(A003, TraceFieldType.StartTime);
                            int A016 = AbstractC37601ox.A01(A003, AbstractC111324zv.A00(914));
                            int A017 = AbstractC37601ox.A01(A003, "suggestion_mode");
                            int A018 = AbstractC37601ox.A01(A003, "trip");
                            int A019 = AbstractC37601ox.A01(A003, "location");
                            HashMap A1G = AbstractC166987dD.A1G();
                            while (A003.moveToNext()) {
                                String string2 = A003.getString(A01);
                                if (!A1G.containsKey(string2)) {
                                    A1G.put(string2, AbstractC166987dD.A1E());
                                }
                            }
                            A003.moveToPosition(-1);
                            C47915LEj.A00(A00, A1G);
                            ArrayList A11 = AbstractC43593JPy.A11(A003);
                            while (A003.moveToNext()) {
                                String string3 = A003.getString(A01);
                                String string4 = A003.getString(A012);
                                String string5 = A003.getString(A013);
                                String string6 = A003.getString(A014);
                                long j = A003.getLong(A015);
                                long j2 = A003.getLong(A016);
                                String string7 = A003.getString(A017);
                                if (!A003.isNull(A018)) {
                                    A0p = AbstractC43593JPy.A0p(A003, A018);
                                } else {
                                    A0p = null;
                                }
                                if (A0p == null) {
                                    valueOf = null;
                                } else {
                                    valueOf = Boolean.valueOf(AbstractC167007dF.A1M(A0p.intValue()));
                                }
                                if (A003.isNull(A019)) {
                                    string = null;
                                } else {
                                    string = A003.getString(A019);
                                }
                                A11.add(new C51761Mtk(new L55(valueOf, string3, string4, string5, string6, string7, string, j, j2), (ArrayList) A1G.get(A003.getString(A01))));
                            }
                            c1yp.setTransactionSuccessful();
                            c1yp.endTransaction();
                            A12 = AbstractC166987dD.A1E();
                            Iterator it = A11.iterator();
                            while (it.hasNext()) {
                                C51761Mtk c51761Mtk = (C51761Mtk) it.next();
                                L55 l55 = (L55) c51761Mtk.A02;
                                Context context = c43902JbC.A00;
                                List list2 = (List) c51761Mtk.A00;
                                ArrayList A0i2 = AbstractC167007dF.A0i(list2);
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    A0i2.add(((C47634L1t) it2.next()).A01);
                                }
                                ArrayList A1F = AbstractC06950Ym.A1F(AbstractC224517h.A02(AbstractC47036Kqt.A00(context, A0i2, 500, 0)));
                                if (A1F.size() != list2.size()) {
                                    SuggestionsDBHelper.A00(userSession, l55.A06);
                                } else {
                                    A12.add(new C45089JxJ(enumC222729sD, EnumC46181KcJ.valueOf(l55.A03), null, l55.A02, l55.A08, l55.A05, l55.A04, A1F, C16930sl.A00, AbstractC167007dF.A0p(Long.valueOf(l55.A01), l55.A00)));
                                }
                            }
                            if (AbstractC166987dD.A1b(A12)) {
                                A12.size();
                                map.put(enumC222729sD, C43902JbC.A00(c43902JbC, A12));
                            } else {
                                A12 = C16930sl.A00;
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        c1yp.endTransaction();
                        throw th;
                    }
                }
                A0i.add(A12);
            }
            ListIterator A14 = AbstractC43592JPx.A14(A0i);
            if (A14.hasPrevious()) {
                Object obj = A14.previous();
                while (A14.hasPrevious()) {
                    obj = AbstractC001800i.A0S((Iterable) obj, (Collection) A14.previous());
                }
                List<C45089JxJ> list3 = (List) obj;
                ArrayList A0i3 = AbstractC167007dF.A0i(list3);
                for (C45089JxJ c45089JxJ : list3) {
                    A0i3.add(new C9ZK(c45089JxJ.A02, c45089JxJ.A00(), c45089JxJ.A06, c45089JxJ.A05, c45089JxJ.A04, c45089JxJ.A07, c45089JxJ.A09, c45089JxJ.A08));
                }
                return A0i3;
            }
            throw AbstractC166987dD.A1D("Empty list can't be reduced.");
        }
        throw AbstractC166987dD.A14("SuggestionsProviderV2.getSuggestions cannot be called on main thread");
    }
}
