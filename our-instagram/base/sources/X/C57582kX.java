package X;

import com.facebook.common.time.RealtimeSinceBootClock;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.2kX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57582kX extends AbstractC57542kT {
    public C25301Lk A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.2kX, X.2kT] */
    public static C57582kX A00(UserSession userSession) {
        C57502kP A00 = AbstractC57492kO.A00(userSession);
        C57582kX c57582kX = (C57582kX) ((AbstractC57542kT) A00.A04.get(C57582kX.class));
        if (c57582kX == null) {
            C25301Lk c25301Lk = new C25301Lk(AbstractC12290kX.A00, new InterfaceC25281Li() { // from class: X.2kY
                @Override // X.InterfaceC25281Li
                public final /* bridge */ /* synthetic */ String EOt(Object obj) {
                    C43b c43b = (C43b) obj;
                    StringWriter stringWriter = new StringWriter();
                    C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                    A0A.A0d();
                    if (c43b.A00 != null) {
                        C16V.A03(A0A, AbstractC111324zv.A00(2864));
                        for (C104024mO c104024mO : c43b.A00) {
                            if (c104024mO != null) {
                                A0A.A0d();
                                A0A.A0R("creation_time", c104024mO.A00);
                                String str = c104024mO.A03;
                                if (str != null) {
                                    A0A.A0S(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
                                }
                                String str2 = c104024mO.A02;
                                if (str2 != null) {
                                    A0A.A0S(AbstractC111324zv.A00(3019), str2);
                                }
                                String str3 = c104024mO.A01;
                                if (str3 != null) {
                                    A0A.A0S("radio_type", str3);
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
                    return AbstractC34314FBi.parseFromJson(C16V.A00(str));
                }
            }, 1931339941);
            ?? abstractC57542kT = new AbstractC57542kT(userSession);
            abstractC57542kT.A00 = c25301Lk;
            A00.A03(abstractC57542kT, C57582kX.class);
            return abstractC57542kT;
        }
        return c57582kX;
    }

    @Override // X.AbstractC57542kT
    public final void A0K() {
        List<C104024mO> list;
        C25301Lk c25301Lk = this.A00;
        UserSession userSession = this.A02;
        C43b c43b = (C43b) c25301Lk.A02(AnonymousClass001.A0R("pending_follows_", userSession.userId), true);
        c25301Lk.A04(AnonymousClass001.A0R("pending_follows_", userSession.userId));
        if (c43b != null && (list = c43b.A00) != null) {
            HashMap hashMap = new HashMap();
            for (C104024mO c104024mO : list) {
                c104024mO.A04 = true;
                hashMap.put(c104024mO.A00(), c104024mO);
            }
            A0I(hashMap);
            A0C();
            hashMap.size();
        }
    }

    public final FollowStatus A0M(FollowStatus followStatus, Integer num, String str) {
        if (super.A00 == null) {
            A0B();
        }
        C104024mO c104024mO = (C104024mO) A05(AnonymousClass001.A0R("follow-", str));
        if (c104024mO != null) {
            String str2 = c104024mO.A02;
            if ("create".equals(str2)) {
                if (num == C05F.A0C) {
                    return FollowStatus.A07;
                }
                return FollowStatus.A05;
            }
            if (!"destroy".equals(str2)) {
                return followStatus;
            }
            return FollowStatus.A06;
        }
        return followStatus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.4mO] */
    public final C104024mO A0L(EnumC33402EpZ enumC33402EpZ, User user, String str) {
        user.getId();
        String id = user.getId();
        String str2 = enumC33402EpZ.A00;
        ?? obj = new Object();
        obj.A05 = false;
        obj.A04 = false;
        obj.A00 = RealtimeSinceBootClock.A00.now();
        obj.A03 = id;
        obj.A02 = str2;
        obj.A01 = str;
        A0H(obj.A00(), obj);
        return obj;
    }

    public final FollowStatus A0N(User user) {
        String id = user.getId();
        return A0M(user.B7L(), user.A0M(), id);
    }

    public final void A0O(C104024mO c104024mO) {
        if (c104024mO == A05(c104024mO.A00())) {
            A0F(c104024mO.A00());
        }
    }

    public final void A0P(User user) {
        C104024mO c104024mO = (C104024mO) A05(AnonymousClass001.A0R("follow-", user.getId()));
        if (c104024mO != null && c104024mO.A02.equals("create")) {
            user.getId();
            A0F(c104024mO.A00());
        }
    }

    public final boolean A0Q(User user) {
        if (A0N(user) != FollowStatus.A05) {
            return false;
        }
        return true;
    }
}
