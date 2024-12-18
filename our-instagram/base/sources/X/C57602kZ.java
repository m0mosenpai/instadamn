package X;

import com.facebook.common.time.RealtimeSinceBootClock;
import com.instagram.common.session.UserSession;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2kZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57602kZ extends AbstractC57542kT {
    public C25301Lk A00;
    public Map A01;
    public final UserSession A02;

    public static C57602kZ A00(UserSession userSession) {
        C57502kP A00 = AbstractC57492kO.A00(userSession);
        C57602kZ c57602kZ = (C57602kZ) ((AbstractC57542kT) A00.A04.get(C57602kZ.class));
        if (c57602kZ == null) {
            C57602kZ c57602kZ2 = new C57602kZ(new C25301Lk(AbstractC12290kX.A00, new InterfaceC25281Li() { // from class: X.2ka
                @Override // X.InterfaceC25281Li
                public final /* bridge */ /* synthetic */ String EOt(Object obj) {
                    C4CJ c4cj = (C4CJ) obj;
                    StringWriter stringWriter = new StringWriter();
                    C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                    A0A.A0d();
                    if (c4cj.A00 != null) {
                        C16V.A03(A0A, AbstractC111324zv.A00(2867));
                        for (C41151IJq c41151IJq : c4cj.A00) {
                            if (c41151IJq != null) {
                                A0A.A0d();
                                A0A.A0R("creation_time", c41151IJq.A00);
                                String str = c41151IJq.A04;
                                if (str != null) {
                                    A0A.A0S(AbstractC111324zv.A00(3042), str);
                                }
                                String str2 = c41151IJq.A03;
                                if (str2 != null) {
                                    A0A.A0S(AbstractC111324zv.A00(3036), str2);
                                }
                                String str3 = c41151IJq.A02;
                                if (str3 != null) {
                                    A0A.A0S("radio_type", str3);
                                }
                                Integer num = c41151IJq.A01;
                                if (num != null) {
                                    A0A.A0S(AbstractC111324zv.A00(3043), AbstractC40789I5r.A00(num));
                                }
                                if (c41151IJq.A05 != null) {
                                    A0A.A0r("params");
                                    A0A.A0d();
                                    for (Map.Entry entry : c41151IJq.A05.entrySet()) {
                                        if (!C16V.A04(A0A, entry)) {
                                            A0A.A0u((String) entry.getValue());
                                        }
                                    }
                                    A0A.A0a();
                                }
                                A0A.A0a();
                            }
                        }
                        A0A.A0Z();
                    }
                    A0A.A0a();
                    A0A.close();
                    return stringWriter.toString();
                }

                @Override // X.InterfaceC25281Li
                public final /* bridge */ /* synthetic */ Object E3T(String str) {
                    return AbstractC40887I9l.parseFromJson(C16V.A00(str));
                }
            }, 257799610), userSession);
            A00.A03(c57602kZ2, C57602kZ.class);
            return c57602kZ2;
        }
        return c57602kZ;
    }

    @Override // X.AbstractC57542kT
    public final void A0K() {
        List<C41151IJq> list;
        C25301Lk c25301Lk = this.A00;
        UserSession userSession = this.A02;
        C4CJ c4cj = (C4CJ) c25301Lk.A02(AnonymousClass001.A0R("pending_saves_", userSession.userId), true);
        if (c4cj != null && (list = c4cj.A00) != null) {
            HashMap hashMap = new HashMap();
            for (C41151IJq c41151IJq : list) {
                hashMap.put(c41151IJq.A04, c41151IJq);
            }
            A0I(hashMap);
            A0C();
            hashMap.size();
        }
        c25301Lk.A04(AnonymousClass001.A0R("pending_saves_", userSession.userId));
    }

    public final EnumC77213d7 A0L(EnumC77213d7 enumC77213d7, InterfaceC38391qT interfaceC38391qT) {
        if (super.A00 == null) {
            A0B();
        }
        if (A0J(interfaceC38391qT.BqK())) {
            C41151IJq c41151IJq = (C41151IJq) A05(interfaceC38391qT.BqK());
            c41151IJq.getClass();
            String str = c41151IJq.A03;
            EnumC77213d7 enumC77213d72 = EnumC77213d7.A04;
            if (!str.equals(enumC77213d72.toString())) {
                return EnumC77213d7.A03;
            }
            return enumC77213d72;
        }
        EnumC77213d7 enumC77213d73 = (EnumC77213d7) this.A01.get(interfaceC38391qT.BqK());
        if (enumC77213d73 != null) {
            return enumC77213d73;
        }
        return enumC77213d7;
    }

    public final void A0N(C41151IJq c41151IJq, boolean z) {
        if (c41151IJq == A05(c41151IJq.A04)) {
            A0F(c41151IJq.A04);
            if (z) {
                Map map = this.A01;
                String str = c41151IJq.A04;
                String str2 = c41151IJq.A03;
                EnumC77213d7 enumC77213d7 = EnumC77213d7.A04;
                if (!str2.equals(enumC77213d7.toString())) {
                    enumC77213d7 = EnumC77213d7.A03;
                }
                map.put(str, enumC77213d7);
            }
        }
    }

    public C57602kZ(C25301Lk c25301Lk, UserSession userSession) {
        super(userSession);
        this.A01 = new LinkedHashMap<String, EnumC77213d7>() { // from class: X.2kd
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, EnumC77213d7> entry) {
                if (size() <= 10) {
                    return false;
                }
                return true;
            }
        };
        this.A00 = c25301Lk;
        this.A02 = userSession;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.IJq, java.lang.Object] */
    public final C41151IJq A0M(EnumC77213d7 enumC77213d7, InterfaceC38391qT interfaceC38391qT, Map map) {
        String obj = enumC77213d7.toString();
        interfaceC38391qT.BqK();
        String BqK = interfaceC38391qT.BqK();
        Integer BqO = interfaceC38391qT.BqO();
        ?? obj2 = new Object();
        obj2.A00 = RealtimeSinceBootClock.A00.now();
        obj2.A04 = BqK;
        obj2.A03 = obj;
        obj2.A01 = BqO;
        obj2.A05 = (HashMap) map;
        A0H(interfaceC38391qT.BqK(), obj2);
        return obj2;
    }

    public final boolean A0O(InterfaceC38391qT interfaceC38391qT) {
        if (A0L(interfaceC38391qT.BqJ(), interfaceC38391qT) != EnumC77213d7.A04) {
            return false;
        }
        return true;
    }
}
