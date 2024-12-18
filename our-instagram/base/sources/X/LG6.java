package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.persistence.NotesRoomDb;
import com.instagram.direct.inbox.notes.persistence.NotesRoomDb_Impl;
import com.instagram.roomdb.IgRoomDatabase;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public final class LG6 {
    public final UserSession A00;
    public final C47906LEa A01;
    public final List A02;
    public final Map A03;
    public final ConcurrentHashMap A04;
    public final NotesRoomDb A05;

    public static final void A00(LG6 lg6) {
        try {
            C47906LEa c47906LEa = lg6.A01;
            C1YP c1yp = c47906LEa.A01;
            c1yp.assertNotSuspendingTransaction();
            AbstractC29601bb abstractC29601bb = c47906LEa.A02;
            InterfaceC37561ot acquire = abstractC29601bb.acquire();
            try {
                c1yp.beginTransaction();
                try {
                    acquire.ATb();
                    c1yp.setTransactionSuccessful();
                } finally {
                    c1yp.endTransaction();
                }
            } finally {
                abstractC29601bb.release(acquire);
            }
        } catch (Exception e) {
            AbstractC167017dG.A1J(C18950wb.A01, "deleteAll failed", e, 275919982);
        }
    }

    public final void A01(List list) {
        Object obj;
        C45042JwX c45042JwX;
        LA1 la1;
        Class<?> cls;
        A00(this);
        ConcurrentHashMap concurrentHashMap = this.A04;
        concurrentHashMap.clear();
        try {
            C47906LEa c47906LEa = this.A01;
            List A0X = AbstractC001800i.A0X(list);
            ArrayList A0q = AbstractC167017dG.A0q(A0X);
            int i = 0;
            for (Object obj2 : A0X) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                Iterator it = this.A02.iterator();
                do {
                    obj = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    obj = it.next();
                    cls = obj2.getClass();
                    C14360o3.A0B(cls, 0);
                } while (!C14360o3.A0K(((LA1) obj).A00, cls));
                if ((obj instanceof LA1) && (la1 = (LA1) obj) != null) {
                    String A02 = la1.A02(obj2);
                    int A00 = la1.A00();
                    concurrentHashMap.put(AnonymousClass001.A0G(A02, ':', A00), new C51753Mtc(i, obj2));
                    String A0G = AnonymousClass001.A0G(la1.A02(obj2), ':', A00);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    C17z A0A = AbstractC221915u.A00.A0A(new OutputStreamWriter(byteArrayOutputStream));
                    try {
                        C14360o3.A0A(A0A);
                        la1.A03(A0A, obj2);
                        A0A.close();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        C14360o3.A07(byteArray);
                        c45042JwX = new C45042JwX(A0G, byteArray, i, A00, System.currentTimeMillis());
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            C20I.A00(A0A, th);
                            throw th2;
                        }
                    }
                } else {
                    c45042JwX = null;
                }
                A0q.add(c45042JwX);
                i = i2;
            }
            List A0X2 = AbstractC001800i.A0X(A0q);
            C1YP c1yp = c47906LEa.A01;
            c1yp.assertNotSuspendingTransaction();
            c1yp.beginTransaction();
            try {
                c47906LEa.A00.insert((Iterable) A0X2);
                c1yp.setTransactionSuccessful();
                c1yp.endTransaction();
            } catch (Throwable th3) {
                c1yp.endTransaction();
            }
        } catch (Exception e) {
            AbstractC167017dG.A1J(C18950wb.A01, "refreshStore failed", e, 275919982);
        }
    }

    public LG6(UserSession userSession, List list) {
        C47906LEa c47906LEa;
        this.A00 = userSession;
        this.A02 = list;
        C49579LvY c49579LvY = NotesRoomDb.A00;
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession.A00(NotesRoomDb.class);
        if (igRoomDatabase == null) {
            synchronized (c49579LvY) {
                igRoomDatabase = (IgRoomDatabase) userSession.A00(NotesRoomDb.class);
                if (igRoomDatabase == null) {
                    C1Ye A0K = AbstractC43594JPz.A0K(userSession, c49579LvY, NotesRoomDb.class);
                    AbstractC28241Yh.A00(A0K, 398401248, 1176005792, true);
                    igRoomDatabase = AbstractC43594JPz.A0k(A0K, userSession, NotesRoomDb.class);
                }
            }
        }
        NotesRoomDb notesRoomDb = (NotesRoomDb) igRoomDatabase;
        this.A05 = notesRoomDb;
        NotesRoomDb_Impl notesRoomDb_Impl = (NotesRoomDb_Impl) notesRoomDb;
        if (notesRoomDb_Impl.A00 != null) {
            c47906LEa = notesRoomDb_Impl.A00;
        } else {
            synchronized (notesRoomDb_Impl) {
                if (notesRoomDb_Impl.A00 == null) {
                    notesRoomDb_Impl.A00 = new C47906LEa(notesRoomDb_Impl);
                }
                c47906LEa = notesRoomDb_Impl.A00;
            }
        }
        this.A01 = c47906LEa;
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(AbstractC06950Ym.A1E(list, 10)));
        for (Object obj : list) {
            AbstractC25227BEk.A1O(obj, A18, ((LA1) obj).A00());
        }
        this.A03 = A18;
        this.A04 = new ConcurrentHashMap();
    }
}
