package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.6Ey, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6Ey implements InterfaceC136226Ez {
    public final C6Ex A00;

    @Override // X.InterfaceC136226Ez
    public final /* bridge */ /* synthetic */ C6DU BHe(C6FQ c6fq, InterfaceC102844kL interfaceC102844kL, Object obj) {
        final Object obj2;
        Map map = (Map) obj;
        C102834kK c102834kK = (C102834kK) interfaceC102844kL;
        Map map2 = c102834kK.A02;
        final String str = (String) map2.get("key");
        if (str != null) {
            Object obj3 = map2.get(DatePickerDialogModule.ARG_MODE);
            if (map != null) {
                obj2 = map.get(str);
            } else {
                C6Ex c6Ex = this.A00;
                synchronized (c6Ex) {
                    obj2 = c6Ex.A00.get(str);
                }
            }
            final boolean equals = "p".equals(obj3);
            if (equals || obj2 == null) {
                obj2 = C6DS.A00(c6fq, map2);
            }
            final String str2 = c102834kK.A00;
            final Map map3 = (Map) map2.get("debug_metadata");
            final C6Ex c6Ex2 = this.A00;
            return new C6DU(c6Ex2, obj2, str, str2, map3, equals) { // from class: X.6DT
                public final Object A00;
                public final C6Ex A01;
                public final String A02;
                public final String A03;
                public final Map A04;
                public final boolean A05;

                {
                    C14360o3.A0B(str2, 4);
                    C14360o3.A0B(c6Ex2, 6);
                    this.A02 = str;
                    this.A00 = obj2;
                    this.A05 = equals;
                    this.A03 = str2;
                    this.A04 = map3;
                    this.A01 = c6Ex2;
                }

                @Override // X.C6DU
                public final Runnable AIf(C6FG c6fg, AnonymousClass630 anonymousClass630, C63162tt c63162tt) {
                    C6FL c6fl;
                    C14360o3.A0B(c63162tt, 2);
                    boolean z = this.A05;
                    C6Ex c6Ex3 = this.A01;
                    String str3 = this.A02;
                    Object obj4 = this.A00;
                    String str4 = this.A03;
                    synchronized (c6Ex3) {
                        if (z) {
                            c6Ex3.A01(str3, obj4);
                            C6FK A00 = C6Ex.A00(anonymousClass630, c6Ex3);
                            Map map4 = A00.A02;
                            java.util.Set set = (java.util.Set) map4.get(str3);
                            java.util.Set set2 = set;
                            if (set == null) {
                                HashSet hashSet = new HashSet(1);
                                hashSet.add(str4);
                                map4.put(str3, hashSet);
                                set2 = hashSet;
                            }
                            set2.add(str4);
                            c6fl = A00.A00;
                        } else {
                            Object obj5 = c6Ex3.A00.get(str3);
                            if (obj5 == null) {
                                c6Ex3.A01(str3, obj4);
                            } else if (!obj5.equals(obj4)) {
                                anonymousClass630.A0I(c6Ex3.A00, obj5, "gs", str4);
                            }
                            C6FK A002 = C6Ex.A00(anonymousClass630, c6Ex3);
                            Map map5 = A002.A02;
                            java.util.Set set3 = (java.util.Set) map5.get(str3);
                            java.util.Set set4 = set3;
                            if (set3 == null) {
                                HashSet hashSet2 = new HashSet(1);
                                hashSet2.add(str4);
                                map5.put(str3, hashSet2);
                                set4 = hashSet2;
                            }
                            set4.add(str4);
                            c6fl = A002.A00;
                        }
                    }
                    return c6fl;
                }

                @Override // X.C6DU
                public final Object BHk() {
                    return this.A00;
                }
            };
        }
        throw new IllegalStateException("Key not defined in data manifest");
    }

    @Override // X.InterfaceC136226Ez
    public final C6FM By5(C6FG c6fg, AnonymousClass630 anonymousClass630) {
        C6FM c6fm;
        C6Ex c6Ex = this.A00;
        synchronized (c6Ex) {
            C6FK A00 = C6Ex.A00(anonymousClass630, c6Ex);
            c6fm = new C6FM(A00.A00, c6Ex.A00);
        }
        return c6fm;
    }

    public C6Ey(C6Ex c6Ex) {
        this.A00 = c6Ex;
    }
}
