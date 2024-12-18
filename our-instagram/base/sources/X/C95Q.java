package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.95Q, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C95Q implements InterfaceC13000lm {
    public static final long A08 = TimeUnit.HOURS.toMillis(24);
    public boolean A00;
    public final C2049995m A01;
    public final C84613qA A02;
    public final AbstractC12990ll A03;
    public final InterfaceC02900Bo A04;
    public final ConcurrentHashMap A05 = new ConcurrentHashMap();
    public final AtomicInteger A06;
    public final String A07;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00 = true;
    }

    public static final void A00(C95Q c95q) {
        JSONObject jSONObject = new JSONObject();
        try {
            C2049995m c2049995m = c95q.A01;
            ConcurrentHashMap concurrentHashMap = c95q.A05;
            Map map = c2049995m.A02;
            map.clear();
            map.putAll(concurrentHashMap);
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                if (entry.getValue() != null) {
                    AccountFamily accountFamily = (AccountFamily) entry.getValue();
                    StringWriter stringWriter = new StringWriter();
                    C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                    A0A.A0d();
                    String str = accountFamily.A02;
                    if (str != null) {
                        A0A.A0S(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
                    }
                    EnumC2050795x enumC2050795x = accountFamily.A00;
                    if (enumC2050795x != null) {
                        A0A.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, enumC2050795x.name().toLowerCase(Locale.US));
                    }
                    if (accountFamily.A01 != null) {
                        A0A.A0r("account");
                        User user = accountFamily.A01;
                        Parcelable.Creator creator = User.CREATOR;
                        AbstractC38851rI.A08(A0A, user);
                    }
                    if (accountFamily.A04 != null) {
                        C16V.A03(A0A, "main_accounts");
                        for (User user2 : accountFamily.A04) {
                            if (user2 != null) {
                                Parcelable.Creator creator2 = User.CREATOR;
                                AbstractC38851rI.A08(A0A, user2);
                            }
                        }
                        A0A.A0Z();
                    }
                    if (accountFamily.A03 != null) {
                        C16V.A03(A0A, "child_accounts");
                        for (User user3 : accountFamily.A03) {
                            if (user3 != null) {
                                Parcelable.Creator creator3 = User.CREATOR;
                                AbstractC38851rI.A08(A0A, user3);
                            }
                        }
                        A0A.A0Z();
                    }
                    A0A.A0a();
                    A0A.close();
                    jSONObject.put((String) entry.getKey(), stringWriter.toString());
                }
            }
            C18720vz c18720vz = AbstractC12960li.A00;
            C19740y2 A00 = AbstractC19730y1.A00(c18720vz);
            String obj = jSONObject.toString();
            C14360o3.A0B(obj, 0);
            InterfaceC19610xo ARD = A00.A00.ARD();
            ARD.E7K("account_linking_family_map_data", obj);
            ARD.apply();
            C19740y2 A002 = AbstractC19730y1.A00(c18720vz);
            long currentTimeMillis = System.currentTimeMillis();
            InterfaceC19610xo ARD2 = A002.A00.ARD();
            ARD2.E7G("account_linking_last_fetch_time", currentTimeMillis);
            ARD2.apply();
        } catch (IOException | NullPointerException | JSONException unused) {
            C0w9.A03("AccountLinkingDataFetcher", "Error parsing family map to the preference");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0Jk, java.lang.Object] */
    public final void A01() {
        if (!this.A00) {
            AtomicInteger atomicInteger = this.A06;
            if (atomicInteger.get() == 0) {
                java.util.Set<String> BOd = this.A04.BOd();
                atomicInteger.set(BOd.size());
                for (final String str : BOd) {
                    if (!C023409i.A0A.A0A(new Object(), null, new C2050195q(new C1P1(this, str) { // from class: X.95p
                        public final String A00;
                        public final /* synthetic */ C95Q A01;

                        {
                            C14360o3.A0B(str, 2);
                            this.A01 = this;
                            this.A00 = str;
                        }

                        @Override // X.C1P1
                        public final void onFail(AbstractC115105If abstractC115105If) {
                            int A03 = C0f9.A03(1162763251);
                            C95Q c95q = this.A01;
                            if (c95q.A06.get() == 0) {
                                C95Q.A00(c95q);
                            }
                            C0f9.A0A(1871898114, A03);
                        }

                        @Override // X.C1P1
                        public final void onFinish() {
                            int A03 = C0f9.A03(1571572908);
                            synchronized (this) {
                                this.A01.A06.decrementAndGet();
                            }
                            C0f9.A0A(834927482, A03);
                        }

                        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, com.instagram.accountlinking.model.AccountFamily] */
                        @Override // X.C1P1
                        public final void onStart() {
                            int A03 = C0f9.A03(-267097235);
                            ConcurrentHashMap concurrentHashMap = this.A01.A05;
                            String str2 = this.A00;
                            if (!concurrentHashMap.containsKey(str2)) {
                                ?? obj = new Object();
                                obj.A02 = str2;
                                obj.A04 = new ArrayList();
                                obj.A03 = new ArrayList();
                                obj.A00 = EnumC2050795x.UNKNOWN;
                                concurrentHashMap.put(str2, obj);
                            }
                            C0f9.A0A(340660648, A03);
                        }

                        @Override // X.C1P1
                        public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                            EnumC2050795x enumC2050795x;
                            int i;
                            int A03 = C0f9.A03(-1482977424);
                            C2050895y c2050895y = (C2050895y) obj;
                            int A032 = C0f9.A03(253111727);
                            C14360o3.A0B(c2050895y, 0);
                            C95Q c95q = this.A01;
                            ConcurrentHashMap concurrentHashMap = c95q.A05;
                            String str2 = this.A00;
                            AccountFamily accountFamily = (AccountFamily) concurrentHashMap.get(str2);
                            if (accountFamily == null) {
                                i = -1130629014;
                            } else {
                                AbstractC12990ll abstractC12990ll = c95q.A03;
                                User user = c2050895y.A00;
                                ArrayList arrayList = new ArrayList(c2050895y.A02.size());
                                Iterator it = c2050895y.A02.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((FIE) it.next()).A01);
                                }
                                ImmutableList copyOf = ImmutableList.copyOf((Collection) arrayList);
                                ArrayList arrayList2 = new ArrayList(c2050895y.A01.size());
                                Iterator it2 = c2050895y.A01.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(((FIE) it2.next()).A01);
                                }
                                ImmutableList copyOf2 = ImmutableList.copyOf((Collection) arrayList2);
                                if (abstractC12990ll instanceof UserSession) {
                                    C1DS.A00((UserSession) abstractC12990ll);
                                }
                                accountFamily.A01 = user;
                                accountFamily.A04.clear();
                                accountFamily.A03.clear();
                                Iterator<E> it3 = copyOf.iterator();
                                while (it3.hasNext()) {
                                    accountFamily.A04.add(it3.next());
                                }
                                Iterator<E> it4 = copyOf2.iterator();
                                while (it4.hasNext()) {
                                    accountFamily.A03.add(it4.next());
                                }
                                if (!accountFamily.A04.isEmpty()) {
                                    enumC2050795x = EnumC2050795x.CHILD_ACCOUNT;
                                } else if (!accountFamily.A03.isEmpty()) {
                                    enumC2050795x = EnumC2050795x.MAIN_ACCOUNT;
                                } else {
                                    enumC2050795x = EnumC2050795x.UNLINKED_ACCOUNT;
                                }
                                accountFamily.A00 = enumC2050795x;
                                AtomicInteger atomicInteger2 = c95q.A06;
                                if (atomicInteger2.get() == 0) {
                                    C95Q.A00(c95q);
                                }
                                if (atomicInteger2.get() <= 0) {
                                    Collection values = concurrentHashMap.values();
                                    C14360o3.A07(values);
                                    if (!values.isEmpty()) {
                                        Iterator it5 = values.iterator();
                                        while (it5.hasNext()) {
                                            if (((AccountFamily) it5.next()).A00 == EnumC2050795x.UNKNOWN) {
                                                break;
                                            }
                                        }
                                    }
                                    C84613qA c84613qA = c95q.A02;
                                    if (c84613qA != null) {
                                        c84613qA.A03();
                                    }
                                }
                                C41451vu.A01.E4s(new C128675ra(str2));
                                i = -497014974;
                            }
                            C0f9.A0A(i, A032);
                            C0f9.A0A(-347701936, A03);
                        }
                    }, this.A07), str)) {
                        C0w9.A03("AccountLinkingDataFetcher", AnonymousClass001.A0R("Failed to add account family fetching operation. want info for user: ", str));
                    }
                }
            }
        }
    }

    public C95Q(AbstractC12990ll abstractC12990ll, String str) {
        this.A03 = abstractC12990ll;
        this.A07 = str;
        C2049995m A01 = C2049995m.A01(abstractC12990ll);
        C14360o3.A07(A01);
        this.A01 = A01;
        this.A04 = C0BQ.A00(abstractC12990ll);
        this.A02 = A01.A00;
        this.A06 = new AtomicInteger(0);
        this.A00 = abstractC12990ll.hasEnded();
        C1GJ.A06(new C11R() { // from class: X.95o
            @Override // X.C11R
            public final int getRunnableId() {
                return 244;
            }

            @Override // X.C11R
            public final void onCancel() {
            }

            @Override // X.C11R
            public final void onFinish() {
            }

            @Override // X.C11R
            public final void onStart() {
            }

            @Override // X.C11R
            public final String getName() {
                return "Account Linking Data Parsing Fetch";
            }

            @Override // X.C11R
            public final void run() {
                C95Q c95q = C95Q.this;
                String string = AbstractC19730y1.A00(AbstractC12960li.A00).A00.getString("account_linking_family_map_data", "");
                C14360o3.A0A(string);
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (c95q.A04.BOd().contains(next)) {
                            Object obj = jSONObject.get(next);
                            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.String");
                            c95q.A05.put(next, AbstractC2050495t.parseFromJson(C16V.A00((String) obj)));
                        }
                    }
                } catch (IOException | JSONException unused) {
                    C0w9.A03("AccountLinkingDataFetcher", "Error parsing saved family map from the preference");
                }
                C2049995m c2049995m = c95q.A01;
                ConcurrentHashMap concurrentHashMap = c95q.A05;
                Map map = c2049995m.A02;
                map.clear();
                map.putAll(concurrentHashMap);
            }
        }, 244, 3, true, true);
    }

    public final void A02() {
        AccountFamily accountFamily;
        long currentTimeMillis = System.currentTimeMillis() - AbstractC19730y1.A00(AbstractC12960li.A00).A00.getLong("account_linking_last_fetch_time", 0L);
        C2049995m c2049995m = this.A01;
        InterfaceC02900Bo interfaceC02900Bo = c2049995m.A01;
        int size = interfaceC02900Bo.BOd().size();
        Map map = c2049995m.A02;
        if (size == map.size()) {
            Iterator it = map.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    String str = (String) it.next();
                    if (!interfaceC02900Bo.CPH(str) || ((accountFamily = (AccountFamily) map.get(str)) != null && accountFamily.A00 == EnumC2050795x.UNKNOWN)) {
                        break;
                    }
                } else if (currentTimeMillis <= A08) {
                    ConcurrentHashMap concurrentHashMap = this.A05;
                    map.clear();
                    map.putAll(concurrentHashMap);
                    return;
                }
            }
        }
        A01();
    }
}
