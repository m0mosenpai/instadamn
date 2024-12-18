package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* renamed from: X.8kN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195218kN implements InterfaceC13050lr {
    public static final C2n2 A09 = new C2n2() { // from class: X.8kO
        @Override // X.C2n2
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            User user = (User) obj;
            if (user != null) {
                return user.getId();
            }
            return null;
        }
    };
    public C1ON A00;
    public final C195298kV A01;
    public final C195298kV A02;
    public final UserSession A03;
    public final C195248kQ A04;
    public final InterfaceC195278kT A05;
    public final InterfaceC195278kT A06;
    public final InterfaceC41501vz A07;
    public final java.util.Set A08;

    public final synchronized void A07(final C2n2 c2n2, String str, final Comparator comparator, List list) {
        A05();
        C127165ou c127165ou = (C127165ou) this.A01.A05.get(str);
        if (c127165ou != null) {
            ImmutableMap.Builder builder = new ImmutableMap.Builder();
            Map map = c127165ou.A03;
            if (map == null) {
                map = Collections.emptyMap();
            }
            for (Map.Entry entry : map.entrySet()) {
                builder.put((String) entry.getKey(), (Double) entry.getValue());
            }
            final ImmutableMap buildOrThrow = builder.buildOrThrow();
            Collections.sort(list, new Comparator() { // from class: X.7gp
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int i;
                    Map map2 = buildOrThrow;
                    C2n2 c2n22 = c2n2;
                    Comparator comparator2 = comparator;
                    Number number = (Number) map2.get(c2n22.apply(obj));
                    Number number2 = (Number) map2.get(c2n22.apply(obj2));
                    if (comparator2 != null) {
                        i = comparator2.compare(obj, obj2);
                    } else {
                        i = -1;
                    }
                    if (number == null) {
                        if (number2 != null) {
                            return 1;
                        }
                    } else if (number2 != null) {
                        double doubleValue = number.doubleValue();
                        double doubleValue2 = number2.doubleValue();
                        if (doubleValue >= doubleValue2) {
                            if (doubleValue > doubleValue2) {
                                return -1;
                            }
                        } else {
                            return 1;
                        }
                    } else {
                        return -1;
                    }
                    return i;
                }
            });
        }
    }

    public final synchronized void A08(InterfaceC28041Xi interfaceC28041Xi, String str, String str2, java.util.Set set) {
        A05();
        Map map = null;
        C127165ou c127165ou = (C127165ou) this.A01.A05.get(str);
        if (c127165ou == null) {
            C0w9.A03("UsersBootstrapService", AnonymousClass001.A0R("Requested missing surface ", str));
        } else {
            map = c127165ou.A03;
            if (map == null) {
                map = Collections.emptyMap();
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            C195248kQ c195248kQ = this.A04;
            if (str2.length() > 0) {
                Collection<User> collection = c195248kQ.A01[Character.toLowerCase(str2.charAt(0)) % 30];
                if (collection != null) {
                    for (User user : collection) {
                        if (AbstractC169157go.A00(user, str2) && !user.CQf() && (map == null || map.containsKey(user.getId()))) {
                            if (interfaceC28041Xi == null || interfaceC28041Xi.apply(user)) {
                                set.add(user);
                            }
                        }
                    }
                }
            }
        } else {
            for (User user2 : this.A02.A05.values()) {
                if (!user2.CQf() && (map == null || map.containsKey(user2.getId()))) {
                    if (interfaceC28041Xi == null || interfaceC28041Xi.apply(user2)) {
                        set.add(user2);
                    }
                }
            }
        }
    }

    public final synchronized void A09(String str, List list) {
        A07(A09, str, null, list);
    }

    static {
        TimeUnit.HOURS.toMillis(1L);
    }

    public static C195218kN A00(final UserSession userSession) {
        return (C195218kN) userSession.A01(C195218kN.class, new InterfaceC16820sZ() { // from class: X.8kP
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C195218kN(UserSession.this);
            }
        });
    }

    public static void A01(C195218kN c195218kN) {
        c195218kN.A01.A01();
        c195218kN.A04.A01();
        c195218kN.A02.A01();
    }

    public static void A03(final C195218kN c195218kN) {
        if (c195218kN.A00 == null) {
            C25621Ms c25621Ms = new C25621Ms(c195218kN.A03);
            c25621Ms.A09(C05F.A0N);
            c25621Ms.A0B("scores/bootstrap/users/");
            c25621Ms.A9s("surfaces", new JSONArray((Collection) c195218kN.A08).toString());
            c25621Ms.A0S(C214469ek.class, C23045AEb.class);
            C1ON A0N = c25621Ms.A0N();
            A0N.A00 = new C1P1() { // from class: X.9gE
                @Override // X.C1P1
                public final void onFailInBackground(AbstractC115105If abstractC115105If) {
                    int A03 = C0f9.A03(89890893);
                    C195218kN c195218kN2 = C195218kN.this;
                    synchronized (c195218kN2) {
                        try {
                            if (c195218kN2.A00 != null) {
                                c195218kN2.A00 = null;
                                C195218kN.A02(c195218kN2);
                            }
                        } catch (Throwable th) {
                            C0f9.A0A(775335359, A03);
                            throw th;
                        }
                    }
                    C0f9.A0A(882725542, A03);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, X.1vN] */
                @Override // X.C1P1
                public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
                    int A03 = C0f9.A03(-1366292016);
                    C214469ek c214469ek = (C214469ek) obj;
                    int A032 = C0f9.A03(-1110474627);
                    C195218kN c195218kN2 = C195218kN.this;
                    synchronized (c195218kN2) {
                        try {
                            if (c195218kN2.A00 != null) {
                                c195218kN2.A00 = null;
                                C195218kN.A01(c195218kN2);
                                C195298kV c195298kV = c195218kN2.A02;
                                c195298kV.A07(c214469ek.A01);
                                Iterator it = c214469ek.A01.iterator();
                                while (it.hasNext()) {
                                    c195218kN2.A04.A02(it.next());
                                }
                                C195298kV c195298kV2 = c195218kN2.A01;
                                c195298kV2.A07(c214469ek.A00);
                                Iterator A16 = AbstractC166997dE.A16(c195298kV2.A05);
                                long j = -1;
                                while (A16.hasNext()) {
                                    long j2 = ((C127165ou) A16.next()).A00;
                                    if (j != -1 && j2 != -1) {
                                        j = Math.min(j, j2);
                                    } else {
                                        j = j2;
                                    }
                                }
                                long j3 = -1;
                                if (j != -1) {
                                    j3 = System.currentTimeMillis() + (j * 1000);
                                }
                                c195298kV.A05(j3);
                                c195298kV2.A05(j3);
                                c195298kV.A04();
                                c195298kV2.A04();
                                AbstractC25651Mw.A00(c195218kN2.A03).E4s(new Object());
                            }
                        } catch (Throwable th) {
                            C0f9.A0A(1154365239, A032);
                            throw th;
                        }
                    }
                    C0f9.A0A(1090676721, A032);
                    C0f9.A0A(-1166865352, A03);
                }
            };
            c195218kN.A00 = A0N;
            C1GJ.A03(A0N);
        }
    }

    public static boolean A04(C195218kN c195218kN) {
        C195298kV c195298kV = c195218kN.A02;
        long j = c195298kV.A00;
        if (j == -1) {
            j = c195298kV.A03.getLong("expiration_timestamp_ms", -1L);
            c195298kV.A00 = j;
        }
        if (j >= System.currentTimeMillis()) {
            Iterator it = c195218kN.A08.iterator();
            while (it.hasNext()) {
                if (c195218kN.A01.A05.get(it.next()) == null) {
                }
            }
            return false;
        }
        return true;
    }

    public final void A05() {
        C195298kV c195298kV = this.A02;
        synchronized (c195298kV) {
            if ((!c195298kV.A02 || !this.A01.A02) && !this.A08.isEmpty()) {
                A02(this);
                if (A04(this)) {
                    A03(this);
                }
            }
        }
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        C1ON c1on = this.A00;
        if (c1on != null) {
            c1on.onCancel();
            this.A00 = null;
        }
        AbstractC25651Mw.A00(this.A03).A02(this.A07, C2AS.class);
        A01(this);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.8kQ, X.2EN] */
    public C195218kN(UserSession userSession) {
        HashSet hashSet = new HashSet(Arrays.asList("autocomplete_user_list", "coefficient_ios_section_test_bootstrap_ranking", "coefficient_rank_recipient_user_suggestion", "coefficient_direct_recipients_ranking_variant_2", "coefficient_besties_list_ranking"));
        this.A08 = hashSet;
        this.A04 = new C2EN();
        C195258kR c195258kR = new C195258kR(this);
        this.A07 = c195258kR;
        InterfaceC195278kT interfaceC195278kT = new InterfaceC195278kT() { // from class: X.8kS
            @Override // X.InterfaceC195278kT
            public final /* bridge */ /* synthetic */ Object AOx(String str) {
                return AnonymousClass170.A00(C07950bF.A04.A01(C195218kN.this.A03, str));
            }

            @Override // X.InterfaceC195278kT
            public final /* bridge */ /* synthetic */ String AhL(Object obj) {
                return ((User) obj).getId();
            }

            @Override // X.InterfaceC195278kT
            public final /* bridge */ /* synthetic */ String EOt(Object obj) {
                return AbstractC225717y.A00((User) obj);
            }
        };
        this.A06 = interfaceC195278kT;
        InterfaceC195278kT interfaceC195278kT2 = new InterfaceC195278kT() { // from class: X.8kU
            @Override // X.InterfaceC195278kT
            public final /* bridge */ /* synthetic */ String AhL(Object obj) {
                return ((C127165ou) obj).A01;
            }

            @Override // X.InterfaceC195278kT
            public final /* bridge */ /* synthetic */ String EOt(Object obj) {
                C127165ou c127165ou = (C127165ou) obj;
                StringWriter stringWriter = new StringWriter();
                C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                A0A.A0d();
                String str = c127165ou.A01;
                if (str != null) {
                    A0A.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
                }
                if (c127165ou.A03 != null) {
                    A0A.A0r("scores");
                    A0A.A0d();
                    for (Map.Entry entry : c127165ou.A03.entrySet()) {
                        if (!C16V.A04(A0A, entry)) {
                            A0A.A0f(((Number) entry.getValue()).doubleValue());
                        }
                    }
                    A0A.A0a();
                }
                String str2 = c127165ou.A02;
                if (str2 != null) {
                    A0A.A0S("rank_token", str2);
                }
                A0A.A0R("ttl_secs", c127165ou.A00);
                A0A.A0a();
                A0A.close();
                return stringWriter.toString();
            }

            @Override // X.InterfaceC195278kT
            public final /* bridge */ /* synthetic */ Object AOx(String str) {
                return AbstractC127155ot.parseFromJson(C16V.A00(str));
            }
        };
        this.A05 = interfaceC195278kT2;
        this.A03 = userSession;
        InterfaceC19630xq A03 = C1AT.A01(userSession).A03(C1AV.A3Y);
        this.A02 = new C195298kV(interfaceC195278kT, A03, "user:", null);
        this.A01 = new C195298kV(interfaceC195278kT2, A03, "surface:", null);
        hashSet.remove("disabled");
        AbstractC25651Mw.A00(userSession).A01(c195258kR, C2AS.class);
    }

    public static void A02(C195218kN c195218kN) {
        A01(c195218kN);
        C195298kV c195298kV = c195218kN.A02;
        c195298kV.A03();
        Iterator it = c195298kV.A05.values().iterator();
        while (it.hasNext()) {
            c195218kN.A04.A02(it.next());
        }
        c195218kN.A01.A03();
    }

    public final void A06() {
        A01(this);
        C195298kV c195298kV = this.A02;
        c195298kV.A01();
        c195298kV.A02();
        c195298kV.A05(System.currentTimeMillis() - 1);
    }
}
