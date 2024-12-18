package X;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class T43 implements InterfaceC65239TgV {
    public static volatile THN A04;
    public final InterfaceC65241TgX A00;
    public final SJH A01;
    public final InterfaceC65401TjY A02;
    public final InterfaceC65401TjY A03;

    public static T43 A00() {
        THN thn = A04;
        if (thn != null) {
            return (T43) thn.A09.get();
        }
        throw AbstractC166987dD.A14("Not initialized!");
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.TVv, X.0cm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.TVv, X.0cm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.TVv, X.0cm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.TVv, X.0cm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, X.THN] */
    public static void A01(Context context) {
        if (A04 == null) {
            synchronized (T43.class) {
                if (A04 == null) {
                    context.getClass();
                    ?? obj = new Object();
                    TVQ tvq = AbstractC62329S6z.A00;
                    ?? obj2 = new Object();
                    Object obj3 = C64831TVv.A02;
                    obj2.A00 = obj3;
                    obj2.A01 = tvq;
                    obj.A03 = obj2;
                    C64832TVw c64832TVw = new C64832TVw(context);
                    obj.A08 = c64832TVw;
                    TVU tvu = S74.A00;
                    TVV tvv = S75.A00;
                    C64820TVk c64820TVk = new C64820TVk(c64832TVw, tvu, tvv);
                    obj.A01 = c64820TVk;
                    C64817TVh c64817TVh = new C64817TVh(c64832TVw, c64820TVk);
                    ?? obj4 = new Object();
                    obj4.A00 = obj3;
                    obj4.A01 = c64817TVh;
                    obj.A04 = obj4;
                    InterfaceC08830cm interfaceC08830cm = obj.A08;
                    C64821TVl c64821TVl = new C64821TVl(interfaceC08830cm, S71.A00, S72.A00);
                    obj.A07 = c64821TVl;
                    C64814TVd c64814TVd = new C64814TVd(interfaceC08830cm);
                    obj.A05 = c64814TVd;
                    C64828TVs c64828TVs = new C64828TVs(tvu, tvv, S73.A00, c64821TVl, c64814TVd);
                    ?? obj5 = new Object();
                    obj5.A00 = obj3;
                    obj5.A01 = c64828TVs;
                    obj.A06 = obj5;
                    C64813TVc c64813TVc = new C64813TVc(tvu);
                    obj.A00 = c64813TVc;
                    InterfaceC08830cm interfaceC08830cm2 = obj.A08;
                    C64824TVo c64824TVo = new C64824TVo(interfaceC08830cm2, obj5, c64813TVc, tvv);
                    obj.A0C = c64824TVo;
                    InterfaceC08830cm interfaceC08830cm3 = obj.A03;
                    InterfaceC08830cm interfaceC08830cm4 = obj.A04;
                    C64827TVr c64827TVr = new C64827TVr(interfaceC08830cm3, interfaceC08830cm4, c64824TVo, obj5, obj5);
                    obj.A02 = c64827TVr;
                    C64829TVt c64829TVt = new C64829TVt(interfaceC08830cm2, interfaceC08830cm4, obj5, c64824TVo, interfaceC08830cm3, obj5, tvu, tvv, obj5);
                    obj.A0A = c64829TVt;
                    C64825TVp c64825TVp = new C64825TVp(interfaceC08830cm3, obj5, c64824TVo, obj5);
                    obj.A0B = c64825TVp;
                    C64826TVq c64826TVq = new C64826TVq(tvu, tvv, c64827TVr, c64829TVt, c64825TVp);
                    ?? obj6 = new Object();
                    obj6.A00 = obj3;
                    obj6.A01 = c64826TVq;
                    obj.A09 = obj6;
                    A04 = obj;
                }
            }
        }
    }

    public final T40 A02(InterfaceC65238TgU interfaceC65238TgU) {
        java.util.Set singleton;
        byte[] bytes;
        if (interfaceC65238TgU instanceof InterfaceC65660Tqq) {
            singleton = Collections.unmodifiableSet(T42.A03);
        } else {
            singleton = Collections.singleton(new SOM("proto"));
        }
        EnumC61103RfI enumC61103RfI = EnumC61103RfI.DEFAULT;
        String str = ((T42) interfaceC65238TgU).A00;
        if (str == null) {
            bytes = null;
        } else {
            bytes = String.format("%s%s%s%s", "1$", str, "\\", "").getBytes(AbstractC58318PtA.A0u());
        }
        return new T40(S2F.A00(enumC61103RfI, "cct", bytes), this, singleton);
    }

    public T43(InterfaceC65241TgX interfaceC65241TgX, SJH sjh, final C62584SHj c62584SHj, InterfaceC65401TjY interfaceC65401TjY, InterfaceC65401TjY interfaceC65401TjY2) {
        this.A02 = interfaceC65401TjY;
        this.A03 = interfaceC65401TjY2;
        this.A00 = interfaceC65241TgX;
        this.A01 = sjh;
        c62584SHj.A03.execute(new Runnable() { // from class: X.TLF
            @Override // java.lang.Runnable
            public final void run() {
                byte[] decode;
                C62584SHj c62584SHj2 = C62584SHj.this;
                T49 t49 = (T49) c62584SHj2.A02;
                SQLiteDatabase A03 = t49.A03();
                T49.A02(A03, t49);
                try {
                    SQLiteDatabase A032 = ((T49) c62584SHj2.A01).A03();
                    C0fW.A01(A032, -1684447961);
                    try {
                        Cursor rawQuery = A032.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                        try {
                            ArrayList A1E = AbstractC166987dD.A1E();
                            while (rawQuery.moveToNext()) {
                                String string = rawQuery.getString(1);
                                if (string != null) {
                                    int i = rawQuery.getInt(2);
                                    EnumC61103RfI enumC61103RfI = (EnumC61103RfI) AbstractC62859SUg.A00.get(i);
                                    if (enumC61103RfI != null) {
                                        String string2 = rawQuery.getString(3);
                                        if (string2 == null) {
                                            decode = null;
                                        } else {
                                            decode = Base64.decode(string2, 0);
                                        }
                                        A1E.add(S2F.A00(enumC61103RfI, string, decode));
                                    } else {
                                        throw AbstractC25230BEn.A0n("Unknown Priority for value ", i);
                                    }
                                } else {
                                    throw AbstractC166987dD.A15("Null backendName");
                                }
                            }
                            rawQuery.close();
                            A032.setTransactionSuccessful();
                            C0fW.A03(A032, 1571926387);
                            Iterator it = A1E.iterator();
                            while (it.hasNext()) {
                                ((T48) c62584SHj2.A00).EM2((AbstractC61582Rq6) it.next(), 1, false);
                            }
                            A03.setTransactionSuccessful();
                            C0fW.A03(A03, 1896311136);
                        } catch (Throwable th) {
                            rawQuery.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        C0fW.A03(A032, -1029534431);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    C0fW.A03(A03, -274389898);
                    throw th3;
                }
            }
        });
    }
}
