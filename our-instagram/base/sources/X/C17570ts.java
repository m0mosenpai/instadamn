package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0ts, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17570ts implements InterfaceC13050lr {
    public final UserSession A01;
    public final InterfaceC14020nS A02;
    public final InterfaceC17670u3 A03;
    public final InterfaceC17710u8 A04;
    public final InterfaceC17700u7 A06;
    public final Map A05 = new HashMap();
    public volatile boolean A08 = false;
    public final Object A07 = new Object();
    public Map A00 = new LinkedHashMap<String, Long>() { // from class: X.0u6
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
            if (size() <= 200) {
                return false;
            }
            return true;
        }
    };

    public final synchronized C17530to A01(String str) {
        A04();
        return (C17530to) this.A05.get(str);
    }

    public final synchronized Boolean A02(String str) {
        Boolean bool;
        C17640tz c17640tz;
        A04();
        C17530to A01 = A01(str);
        Long l = (Long) this.A00.get(str);
        boolean z = true;
        if (A01 != null && (c17640tz = A01.A02) != null) {
            if (c17640tz.A01() < 250) {
                z = false;
            }
            bool = Boolean.valueOf(z);
        } else if (l != null) {
            if (l.longValue() < 250) {
                z = false;
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = null;
        }
        return bool;
    }

    public final synchronized HashSet A03() {
        A04();
        return new HashSet(this.A05.values());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if (r0.A01() < r9) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if (r0.intValue() > X.C18U.A01(X.C06090Tz.A05, r13.A01, 36599069894708656L)) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A05(X.C17530to r14) {
        /*
            r13 = this;
            monitor-enter(r13)
            r13.A04()     // Catch: java.lang.Throwable -> L9e
            java.util.Map r1 = r13.A05     // Catch: java.lang.Throwable -> L9e
            java.lang.String r0 = r14.A05     // Catch: java.lang.Throwable -> L9e
            r1.put(r0, r14)     // Catch: java.lang.Throwable -> L9e
            X.0u8 r0 = r13.A04     // Catch: java.lang.Throwable -> L9e
            r0.EIx()     // Catch: java.lang.Throwable -> L9e
            java.lang.Integer r0 = r14.A03     // Catch: java.lang.Throwable -> L9e
            r12 = 1
            if (r0 == 0) goto L2c
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L9e
            long r3 = (long) r0     // Catch: java.lang.Throwable -> L9e
            com.instagram.common.session.UserSession r5 = r13.A01     // Catch: java.lang.Throwable -> L9e
            X.0Tz r2 = X.C06090Tz.A05     // Catch: java.lang.Throwable -> L9e
            r0 = 36599069894708656(0x8206a9002f0db0, double:3.2087374018147144E-306)
            long r1 = X.C18U.A01(r2, r5, r0)     // Catch: java.lang.Throwable -> L9e
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r11 = 1
            if (r0 <= 0) goto L2d
        L2c:
            r11 = 0
        L2d:
            com.instagram.common.session.UserSession r4 = r13.A01     // Catch: java.lang.Throwable -> L9e
            X.0Tz r3 = X.C06090Tz.A05     // Catch: java.lang.Throwable -> L9e
            r0 = 36599069894643119(0x8206a9002e0daf, double:3.2087374017732685E-306)
            long r9 = X.C18U.A01(r3, r4, r0)     // Catch: java.lang.Throwable -> L9e
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L4d
            X.0tz r0 = r14.A02     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L4d
            long r1 = r0.A01()     // Catch: java.lang.Throwable -> L9e
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            r8 = 1
            if (r0 >= 0) goto L4e
        L4d:
            r8 = 0
        L4e:
            java.util.Map r7 = r13.A00     // Catch: java.lang.Throwable -> L9e
            java.lang.String r0 = r14.A05     // Catch: java.lang.Throwable -> L9e
            boolean r0 = r7.containsKey(r0)     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L70
            java.lang.String r0 = r14.A05     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r0 = r7.get(r0)     // Catch: java.lang.Throwable -> L9e
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L9e
            long r5 = r0.longValue()     // Catch: java.lang.Throwable -> L9e
            long r5 = r5 + r9
            X.0tz r0 = r14.A02     // Catch: java.lang.Throwable -> L9e
            long r1 = r0.A01()     // Catch: java.lang.Throwable -> L9e
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L70
            goto L71
        L70:
            r12 = 0
        L71:
            if (r11 == 0) goto L9c
            if (r8 == 0) goto L9c
            if (r12 != 0) goto L9c
            java.lang.String r2 = r14.A05     // Catch: java.lang.Throwable -> L9e
            X.0tz r0 = r14.A02     // Catch: java.lang.Throwable -> L9e
            long r0 = r0.A01()     // Catch: java.lang.Throwable -> L9e
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L9e
            r7.put(r2, r0)     // Catch: java.lang.Throwable -> L9e
            X.0u7 r2 = r13.A06     // Catch: java.lang.Throwable -> L9e
            r0 = 36599069895232947(0x8206a900370db3, double:3.208737402146278E-306)
            long r0 = X.C18U.A01(r3, r4, r0)     // Catch: java.lang.Throwable -> L9e
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L9e
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L9e
            r2.E28(r0)     // Catch: java.lang.Throwable -> L9e
        L9c:
            monitor-exit(r13)
            return
        L9e:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17570ts.A05(X.0to):void");
    }

    public static C17570ts A00(final UserSession userSession) {
        return (C17570ts) userSession.A01(C17570ts.class, new InterfaceC16820sZ() { // from class: X.0Z3
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                InterfaceC17710u8 c17830uL;
                InterfaceC17670u3 c17840uM;
                final UserSession userSession2 = UserSession.this;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession2, 36328057456507988L)) {
                    c17830uL = new C17810uJ(Math.max(100L, C18U.A01(c06090Tz, userSession2, 36609532433274774L)));
                } else {
                    c17830uL = new C17830uL();
                }
                InterfaceC17710u8 interfaceC17710u8 = c17830uL;
                Context context = AbstractC12290kX.A00;
                InterfaceC14020nS A00 = C14120nc.A00();
                if (C18U.A06(c06090Tz, userSession2, 36328057456704598L)) {
                    final boolean A06 = C18U.A06(c06090Tz, userSession2, 36328057458080871L);
                    c17840uM = new InterfaceC17670u3(userSession2, A06) { // from class: X.0uG
                        public final UserSession A00;
                        public final boolean A01;

                        {
                            C14360o3.A0B(userSession2, 1);
                            this.A01 = A06;
                            this.A00 = userSession2;
                        }

                        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.0rY] */
                        @Override // X.InterfaceC17670u3
                        public final void FEL(java.util.Set set) {
                            String A0P;
                            String str;
                            C14360o3.A0B(set, 0);
                            boolean z = this.A01;
                            if (z) {
                                StringWriter stringWriter = new StringWriter();
                                C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                                ArrayList arrayList = new ArrayList(set);
                                ?? obj = new Object();
                                obj.A00 = arrayList;
                                AbstractC16290ra.A00(A0A, obj);
                                A0A.close();
                                A0P = stringWriter.toString();
                            } else {
                                A0P = AbstractC001800i.A0P("/", "", "", set, new C02Z(this));
                            }
                            C14360o3.A0A(A0P);
                            InterfaceC19610xo ARD = C1AT.A01(this.A00).A03(C1AV.A0t).ARD();
                            if (z) {
                                str = "seen_state_default_parser";
                            } else {
                                str = "seen_state";
                            }
                            ARD.E7K(str, A0P);
                            ARD.commit();
                        }

                        /* JADX WARN: Type inference failed for: r10v1, types: [X.0to, java.lang.Object] */
                        @Override // X.InterfaceC17670u3
                        public final java.util.Set E7s() {
                            Integer valueOf;
                            String str;
                            String str2;
                            List list;
                            boolean z = this.A01;
                            InterfaceC19630xq A03 = C1AT.A01(this.A00).A03(C1AV.A0t);
                            if (z) {
                                String string = A03.getString("seen_state_default_parser", null);
                                if (string != null) {
                                    C16270rY parseFromJson = AbstractC16290ra.parseFromJson(C16V.A00(string));
                                    if (parseFromJson != null && (list = parseFromJson.A00) != null) {
                                        return AbstractC001800i.A0k(list);
                                    }
                                    AbstractC12120kG.A07("SharedPreferencesStoreAdapter", AnonymousClass001.A0O("Error In Default Deserialization. SharedPreference read string of length ", string.length()), null);
                                }
                            } else {
                                String string2 = A03.getString("seen_state", null);
                                if (string2 != null) {
                                    List A0R = AbstractC001900j.A0R(string2, new String[]{"/"}, 0);
                                    int size = A0R.size();
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it = A0R.iterator();
                                    while (it.hasNext()) {
                                        List A0R2 = AbstractC001900j.A0R((String) it.next(), new String[]{"|"}, 0);
                                        if (!A0R2.isEmpty() && A0R2.size() == 11) {
                                            String str3 = (String) A0R2.get(0);
                                            int parseInt = Integer.parseInt((String) A0R2.get(1));
                                            float parseFloat = Float.parseFloat((String) A0R2.get(2));
                                            long parseLong = Long.parseLong((String) A0R2.get(3));
                                            long parseLong2 = Long.parseLong((String) A0R2.get(4));
                                            long parseLong3 = Long.parseLong((String) A0R2.get(5));
                                            long parseLong4 = Long.parseLong((String) A0R2.get(6));
                                            boolean parseBoolean = Boolean.parseBoolean((String) A0R2.get(7));
                                            if (C14360o3.A0K(A0R2.get(8), "^")) {
                                                valueOf = null;
                                            } else {
                                                valueOf = Integer.valueOf(Integer.parseInt((String) A0R2.get(8)));
                                            }
                                            if (C14360o3.A0K(A0R2.get(9), "^")) {
                                                str = null;
                                            } else {
                                                str = (String) A0R2.get(9);
                                            }
                                            if (C14360o3.A0K(A0R2.get(10), "^")) {
                                                str2 = null;
                                            } else {
                                                str2 = (String) A0R2.get(10);
                                            }
                                            ?? obj = new Object();
                                            obj.A01 = 24;
                                            obj.A02 = new C17640tz();
                                            obj.A08 = false;
                                            obj.A03 = null;
                                            obj.A07 = false;
                                            obj.A05 = str3;
                                            obj.A01 = parseInt;
                                            obj.A00 = parseFloat;
                                            C17640tz c17640tz = new C17640tz();
                                            c17640tz.A00 = parseLong;
                                            c17640tz.A01 = parseLong2;
                                            c17640tz.A02 = parseLong3;
                                            c17640tz.A03 = parseLong4;
                                            obj.A02 = c17640tz;
                                            obj.A08 = parseBoolean;
                                            obj.A03 = valueOf;
                                            obj.A04 = str;
                                            obj.A06 = str2;
                                            arrayList.add(obj);
                                        } else {
                                            AbstractC12120kG.A07("SharedPreferencesStoreAdapter", AnonymousClass001.A0n("Error In Deserialization. ", " found. This item only had ", " fields", size, A0R2.size()), null);
                                        }
                                    }
                                    return AbstractC001800i.A0k(arrayList);
                                }
                            }
                            return C16910sj.A00;
                        }
                    };
                } else {
                    c17840uM = new C17840uM(context, userSession2, A00);
                }
                return new C17570ts(userSession2, C14120nc.A00(), c17840uM, interfaceC17710u8);
            }
        });
    }

    public final void A04() {
        if (!this.A08) {
            synchronized (this.A07) {
                if (!this.A08) {
                    for (C17530to c17530to : this.A03.E7s()) {
                        this.A05.put(c17530to.A05, c17530to);
                        C17640tz c17640tz = c17530to.A02;
                        if (c17640tz != null) {
                            this.A00.put(c17530to.A05, Long.valueOf(c17640tz.A01()));
                        }
                    }
                    this.A08 = true;
                }
            }
        }
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        InterfaceC17710u8 interfaceC17710u8 = this.A04;
        interfaceC17710u8.AWP();
        interfaceC17710u8.EfQ(null);
    }

    public C17570ts(UserSession userSession, InterfaceC14020nS interfaceC14020nS, InterfaceC17670u3 interfaceC17670u3, InterfaceC17710u8 interfaceC17710u8) {
        C17760uE c17760uE = new C17760uE(this);
        this.A06 = c17760uE;
        interfaceC17710u8.EfQ(c17760uE);
        this.A04 = interfaceC17710u8;
        this.A03 = interfaceC17670u3;
        this.A02 = interfaceC14020nS;
        this.A01 = userSession;
    }
}
