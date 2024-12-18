package X;

import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.088, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass088 {
    public final C19740y2 A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;
    public final Map A04;
    public final java.util.Set A05;
    public final Map A06;
    public final java.util.Set A07;

    /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AnonymousClass088(X.C19740y2 r7) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass088.<init>(X.0y2):void");
    }

    private final void A00() {
        String A0P = AbstractC001800i.A0P("|", "", "", C01S.A00(this.A03), C0A6.A00);
        InterfaceC19610xo ARD = this.A00.A00.ARD();
        ARD.E7K("shared_accounts_access_map", A0P);
        ARD.apply();
    }

    public static final void A01(AnonymousClass088 anonymousClass088) {
        try {
            Map map = anonymousClass088.A01;
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            A0A.A0c();
            for (Map.Entry entry : map.entrySet()) {
                User user = (User) entry.getKey();
                long longValue = ((Number) entry.getValue()).longValue();
                C14360o3.A0B(user, 0);
                C16X A00 = AnonymousClass185.A00(user);
                A0A.A0d();
                A0A.A0r("user_info");
                C16W.A00(A0A, A00);
                A0A.A0R("time_accessed", longValue);
                A0A.A0a();
            }
            A0A.A0Z();
            A0A.close();
            String obj = stringWriter.toString();
            C14360o3.A07(obj);
            InterfaceC19610xo ARD = AbstractC19730y1.A00(AbstractC12960li.A00).A00.ARD();
            ARD.E7K("user_access_map", obj);
            ARD.apply();
        } catch (IOException unused) {
        }
    }

    public static final void A02(AnonymousClass088 anonymousClass088) {
        try {
            String A0P = AbstractC001800i.A0P(", ", "", "", anonymousClass088.A05, null);
            InterfaceC19610xo ARD = AbstractC19730y1.A00(AbstractC12960li.A00).A00.ARD();
            ARD.E7K("enforce_inbox_restore_map", A0P);
            ARD.apply();
        } catch (IOException e) {
            C0K8.A0J("AccountDataManager", "Failed to save enforce inbox restore users data", e);
        }
    }

    public final List A03(User user) {
        List A0X = AbstractC001800i.A0X(this.A01.keySet());
        ArrayList arrayList = new ArrayList();
        for (Object obj : A0X) {
            if (!C14360o3.A0K(obj, user)) {
                arrayList.add(obj);
            }
        }
        return AbstractC001800i.A0g(arrayList, new Comparator() { // from class: X.07b
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(Object obj2, Object obj3) {
                Map map = AnonymousClass088.this.A01;
                Number number = (Number) map.get(obj2);
                Number number2 = (Number) map.get(obj3);
                if (number != null && number2 != null) {
                    return C14360o3.A01(number2.longValue(), number.longValue());
                }
                C0w9.A01(EnumC12410kj.A06, "AccountDataManager", "User Access Time is null");
                if (number == null) {
                    if (number2 != null) {
                        return 1;
                    }
                    return 0;
                }
                return -1;
            }
        });
    }

    public final List A04(String str) {
        User user;
        Iterator it = this.A04.entrySet().iterator();
        while (true) {
            user = null;
            String str2 = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            User user2 = (User) entry.getKey();
            if (user2 != null) {
                str2 = user2.getId();
            }
            if (C14360o3.A0K(str2, str) && (user = (User) entry.getKey()) != null) {
                break;
            }
        }
        return A03(user);
    }

    public final void A05(User user) {
        this.A03.remove(user.getId());
        A00();
    }

    public final void A06(User user) {
        java.util.Set set = this.A05;
        if (set.contains(user.getId())) {
            set.remove(user.getId());
            A02(this);
        }
    }

    public final void A07(User user) {
        Map map = this.A02;
        Map map2 = this.A01;
        map.put(user, map2.get(user));
        map2.put(user, Long.valueOf(System.currentTimeMillis()));
        A01(this);
    }

    public final void A08(User user, String str) {
        this.A03.put(user.getId(), str);
        A00();
    }
}
