package X;

import com.facebook.msys.mci.AuthData;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public abstract class FUZ {
    public static final User A00(AuthData authData, InterfaceC37233Gai interfaceC37233Gai, C18A c18a, int i) {
        User user;
        Integer num;
        Integer num2;
        int intValue;
        FollowStatus followStatus;
        EnumC222416a enumC222416a;
        Boolean bool;
        EnumC222416a enumC222416a2;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Long l;
        ImageUrl imageUrl;
        ImageUrl imageUrl2;
        String str;
        Long l2;
        String BFh = interfaceC37233Gai.BFh(i);
        String Brb = interfaceC37233Gai.Brb(i);
        Integer num3 = null;
        if (BFh != null && Brb != null) {
            if (c18a != null) {
                user = c18a.A02(BFh);
            } else {
                user = null;
            }
            User user2 = new User(BFh, Brb);
            LinkedHashSet A0l = AbstractC31171DnF.A0l();
            Long BTD = interfaceC37233Gai.BTD(i);
            if (BTD != null) {
                user2.A0p(BTD);
                if (user != null) {
                    l2 = user.BTC();
                } else {
                    l2 = null;
                }
                A01(BTD, l2, "messagingUserFbid", A0l);
            }
            user2.A0b(interfaceC37233Gai.BJm(i) ? 1 : 0);
            Integer valueOf = Integer.valueOf(user2.BJ8());
            if (user != null) {
                num = Integer.valueOf(user.BJ8());
            } else {
                num = null;
            }
            A01(valueOf, num, "interopUserType", A0l);
            String name = interfaceC37233Gai.getName(i);
            if (name != null) {
                user2.A0q(name);
                if (user != null) {
                    str = user.getFullName();
                } else {
                    str = null;
                }
                A01(name, str, "fullName", A0l);
            }
            if (authData != null) {
                Long Bi1 = interfaceC37233Gai.Bi1(i);
                String Bi0 = interfaceC37233Gai.Bi0(i);
                String Bhy = interfaceC37233Gai.Bhy(i);
                if (Bi1 != null) {
                    l = Long.valueOf(TimeUnit.SECONDS.toMillis(Bi1.longValue()));
                } else {
                    l = null;
                }
                String A00 = AbstractC34134F4k.A00(authData, l, Bi0, Bhy);
                if (A00 != null) {
                    SimpleImageUrl A0t = AbstractC25225BEi.A0t(A00);
                    if (user == null || (imageUrl = user.A03.Bhu()) == null) {
                        imageUrl = A0t;
                    }
                    user2.A0i(imageUrl);
                    if (user != null) {
                        imageUrl2 = user.Bhu();
                    } else {
                        imageUrl2 = null;
                    }
                    A01(A0t, imageUrl2, "profilePicUrl", A0l);
                }
            }
            Integer CEn = interfaceC37233Gai.CEn(i);
            boolean z = false;
            if (CEn != null) {
                user2.A1C(AbstractC167007dF.A1P(CEn.intValue(), 2));
                Boolean valueOf2 = Boolean.valueOf(user2.isVerified());
                if (user != null) {
                    bool6 = Boolean.valueOf(user.isVerified());
                } else {
                    bool6 = null;
                }
                A01(valueOf2, bool6, "isVerified", A0l);
            }
            Long AlY = interfaceC37233Gai.AlY(i);
            if (AlY != null) {
                user2.A1B(Capabilities.A01.A00(new long[]{0, AlY.longValue()}).A00.get(66));
                Boolean valueOf3 = Boolean.valueOf(user2.isRestricted());
                if (user != null) {
                    bool5 = Boolean.valueOf(user.isRestricted());
                } else {
                    bool5 = null;
                }
                A01(valueOf3, bool5, "isRestricted", A0l);
            }
            if (interfaceC37233Gai.AlW(i) != null) {
                user2.A19(Capabilities.A01.A00(new long[]{r0.intValue()}).A00.get(26));
                Boolean valueOf4 = Boolean.valueOf(user2.CYb());
                if (user != null) {
                    bool4 = Boolean.valueOf(user.CYb());
                } else {
                    bool4 = null;
                }
                A01(valueOf4, bool4, "isMessagingPseudoBlocking", A0l);
            }
            Integer AgK = interfaceC37233Gai.AgK(i);
            if (AgK != null) {
                int intValue2 = AgK.intValue();
                user2.A0v(AbstractC167007dF.A1P(intValue2, 1));
                Boolean valueOf5 = Boolean.valueOf(user2.CQf());
                if (user != null) {
                    bool2 = Boolean.valueOf(user.CQf());
                } else {
                    bool2 = null;
                }
                A01(valueOf5, bool2, "isBlocking", A0l);
                user2.A18(AbstractC167007dF.A1P(intValue2, 2));
                Boolean valueOf6 = Boolean.valueOf(user2.CYY());
                if (user != null) {
                    bool3 = Boolean.valueOf(user.CYY());
                } else {
                    bool3 = null;
                }
                A01(valueOf6, bool3, "isMessagingBlocking", A0l);
            }
            Integer Aqf = interfaceC37233Gai.Aqf(i);
            if (Aqf != null) {
                int intValue3 = Aqf.intValue();
                if (intValue3 == 11) {
                    z = true;
                }
                user2.A03.EQf(Boolean.valueOf(z));
                if (intValue3 != 11) {
                    if (intValue3 != 12) {
                        enumC222416a = EnumC222416a.A07;
                    } else {
                        enumC222416a = EnumC222416a.A06;
                    }
                } else {
                    enumC222416a = EnumC222416a.A05;
                }
                user2.A0l(enumC222416a);
                Boolean valueOf7 = Boolean.valueOf(user2.CQw());
                if (user != null) {
                    bool = Boolean.valueOf(user.CQw());
                } else {
                    bool = null;
                }
                A01(valueOf7, bool, "isBusiness", A0l);
                EnumC222416a A0I = user2.A0I();
                if (user != null) {
                    enumC222416a2 = user.A0I();
                } else {
                    enumC222416a2 = null;
                }
                A01(A0I, enumC222416a2, "accountType", A0l);
            }
            Integer B7O = interfaceC37233Gai.B7O(i);
            if (B7O != null && (intValue = B7O.intValue()) != 0) {
                if (intValue != 3 && intValue != 6 && intValue != 1) {
                    if (intValue != 7 && intValue != 2 && intValue != 4) {
                        if (intValue == 5 || intValue == 8 || intValue == 9) {
                            user2.A0k(FollowStatus.A07);
                        }
                    } else {
                        user2.A0k(FollowStatus.A05);
                    }
                } else {
                    user2.A0k(FollowStatus.A06);
                }
                FollowStatus B7L = user2.B7L();
                if (user != null) {
                    followStatus = user.B7L();
                } else {
                    followStatus = null;
                }
                A01(B7L, followStatus, "followStatus", A0l);
            } else if (user == null && B7O != null && B7O.intValue() == 0) {
                user2.A0k(FollowStatus.A04);
            }
            Integer Aqe = interfaceC37233Gai.Aqe(i);
            if (Aqe != null) {
                user2.A0o(Aqe);
                Integer Bkb = user2.Bkb();
                if (user != null) {
                    num2 = user.Bkb();
                } else {
                    num2 = null;
                }
                A01(Bkb, num2, AbstractC111324zv.A00(5154), A0l);
            }
            Integer BAe = interfaceC37233Gai.BAe(i);
            if (BAe != null) {
                user2.A00 = BAe.intValue();
                if (user != null) {
                    num3 = Integer.valueOf(user.A00);
                }
                A01(BAe, num3, "groupParticipantJoinState", A0l);
            }
            if (A0l.size() > 0) {
                C0w9.A03("MsysUserFactory", AbstractC167017dG.A0n(A0l, "The following user data fields in MSYS conflict with the cached values in UserCache: ", AbstractC166987dD.A1C()));
            }
            if (c18a != null) {
                return c18a.A01(user2, true, false);
            }
            return user2;
        }
        C0w9.A03("MsysUserFactory", "Unable to create a User from MSYS data");
        return null;
    }

    public static final void A01(Object obj, Object obj2, String str, java.util.Set set) {
        if (obj2 != null && !obj2.equals(obj)) {
            set.add(str);
        }
    }
}
