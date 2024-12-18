package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.teensafety.safetyinterventions.data.database.SafetyInterventionsDatabase;
import com.instagram.roomdb.IgRoomDatabase;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.7Xe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164417Xe {
    public final UserSession A00;
    public final C14090nZ A01;
    public final SafetyInterventionsDatabase A02;
    public final ConcurrentHashMap A03;
    public final C19L A04;
    public final C05A A05;
    public final C05A A06;
    public final C05A A07;
    public final C05A A08;
    public final C05A A09;
    public final AnonymousClass139 A0A;

    public final synchronized void A03(String str) {
        Collection<?> collection;
        Object value;
        java.util.Set A0j;
        Map map = (Map) this.A08.getValue();
        if (str == null) {
            collection = AbstractC001800i.A0k(AbstractC06950Ym.A1F(map.values()));
        } else {
            collection = (java.util.Set) map.get(str);
            if (collection == null) {
                collection = C16910sj.A00;
            }
        }
        C05A c05a = this.A09;
        do {
            value = c05a.getValue();
            A0j = AbstractC001800i.A0j((java.util.Set) value);
            A0j.removeAll(collection);
        } while (!c05a.AIi(value, AbstractC001800i.A0k(A0j)));
        A02();
    }

    public final synchronized void A04(List list) {
        Object value;
        C14360o3.A0B(list, 0);
        C05A c05a = this.A09;
        do {
            value = c05a.getValue();
        } while (!c05a.AIi(value, AnonymousClass090.A00(list, (java.util.Set) value)));
        A02();
    }

    public /* synthetic */ C164417Xe(UserSession userSession) {
        C164427Xg c164427Xg = SafetyInterventionsDatabase.A00;
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession.A00(SafetyInterventionsDatabase.class);
        if (igRoomDatabase == null) {
            synchronized (c164427Xg) {
                igRoomDatabase = (IgRoomDatabase) userSession.A00(SafetyInterventionsDatabase.class);
                if (igRoomDatabase == null) {
                    Context context = AbstractC12290kX.A00;
                    C14360o3.A07(context);
                    C1Ye A00 = C1Yc.A00(context, SafetyInterventionsDatabase.class, C1YZ.A00(userSession, c164427Xg));
                    AbstractC28241Yh.A00(A00, 1019772572, 1381699147, false);
                    A00.A01();
                    igRoomDatabase = (IgRoomDatabase) A00.A00();
                    userSession.A04(SafetyInterventionsDatabase.class, igRoomDatabase);
                }
            }
        }
        C12L c12l = C12L.A00;
        this.A00 = userSession;
        this.A02 = (SafetyInterventionsDatabase) igRoomDatabase;
        C14090nZ AOT = c12l.AOT(36726424, 3);
        this.A01 = AOT;
        C19K A02 = AnonymousClass194.A02(AOT);
        this.A04 = A02;
        C16910sj c16910sj = C16910sj.A00;
        this.A09 = C10E.A00(c16910sj);
        this.A08 = C10E.A00(AbstractC06930Yk.A0E());
        this.A05 = C10E.A00(c16910sj);
        this.A07 = C10E.A00(AbstractC06930Yk.A0E());
        this.A06 = C10E.A00(AbstractC06930Yk.A0E());
        this.A0A = new AnonymousClass139();
        this.A03 = new ConcurrentHashMap();
        C9DH c9dh = new C9DH(this, null, 46);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9dh, A02);
    }

    public static final java.util.Set A00(C164417Xe c164417Xe, EnumC44171Jfa enumC44171Jfa, java.util.Set set) {
        if (enumC44171Jfa != null) {
            Iterable iterable = (Iterable) ((Map) c164417Xe.A07.getValue()).get(enumC44171Jfa);
            if (iterable == null) {
                iterable = C16910sj.A00;
            }
            return AbstractC001800i.A0l(set, AbstractC001800i.A0k(iterable));
        }
        return set;
    }

    public static final java.util.Set A01(C164417Xe c164417Xe, EnumC44170JfZ enumC44170JfZ, java.util.Set set) {
        if (enumC44170JfZ != null) {
            Iterable iterable = (Iterable) ((Map) c164417Xe.A06.getValue()).get(enumC44170JfZ);
            if (iterable == null) {
                iterable = C16910sj.A00;
            }
            return AbstractC001800i.A0l(set, AbstractC001800i.A0k(iterable));
        }
        return set;
    }

    private final void A02() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (C66057Tyu c66057Tyu : (Iterable) this.A09.getValue()) {
            for (C44161JfQ c44161JfQ : c66057Tyu.A07) {
                String str = c44161JfQ.A00;
                if (str != null) {
                    Object obj = linkedHashMap.get(str);
                    if (obj == null) {
                        obj = new LinkedHashSet();
                        linkedHashMap.put(str, obj);
                    }
                    ((java.util.Set) obj).add(c66057Tyu);
                } else {
                    linkedHashSet.add(c66057Tyu);
                }
                for (C44160JfP c44160JfP : c44161JfQ.A01) {
                    for (Object obj2 : c44160JfP.A01) {
                        if (obj2 != EnumC44171Jfa.A07) {
                            Object obj3 = linkedHashMap2.get(obj2);
                            if (obj3 == null) {
                                obj3 = new LinkedHashSet();
                                linkedHashMap2.put(obj2, obj3);
                            }
                            ((java.util.Set) obj3).add(c66057Tyu);
                        }
                    }
                    EnumC44170JfZ enumC44170JfZ = c44160JfP.A00;
                    if (enumC44170JfZ != EnumC44170JfZ.A08) {
                        Object obj4 = linkedHashMap3.get(enumC44170JfZ);
                        if (obj4 == null) {
                            obj4 = new LinkedHashSet();
                            linkedHashMap3.put(enumC44170JfZ, obj4);
                        }
                        ((java.util.Set) obj4).add(c66057Tyu);
                    }
                }
            }
        }
        this.A08.Egh(linkedHashMap);
        this.A05.Egh(linkedHashSet);
        this.A07.Egh(linkedHashMap2);
        this.A06.Egh(linkedHashMap3);
    }
}
