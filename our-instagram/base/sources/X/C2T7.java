package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Iterator;

/* renamed from: X.2T7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2T7 implements C0KV {
    public static final C2T7 A00 = new C2T7();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
        int A03 = C0f9.A03(210994806);
        int A032 = C0f9.A03(-1354452831);
        C14360o3.A0B(userSession, 0);
        InterfaceC93894Jz interfaceC93894Jz = new InterfaceC93894Jz(userSession) { // from class: X.4K2
            public final UserSession A00;

            @Override // X.InterfaceC93894Jz
            public final void DAJ(C83403nh c83403nh, DirectThreadKey directThreadKey, boolean z) {
                if (A00()) {
                    UserSession userSession2 = this.A00;
                    InterfaceC09390do interfaceC09390do = AbstractC43605JQl.A00;
                    if (C18U.A06(C06090Tz.A05, userSession2, 36320326514385264L)) {
                        C43724JVj.A02(userSession2, new C43735JVu(c83403nh, directThreadKey, C05F.A00, userSession2.userId), (C43724JVj) AbstractC43605JQl.A00.getValue(), C05F.A0C);
                    } else {
                        EnumC117355Su enumC117355Su = EnumC117355Su.A08;
                        String A0h = c83403nh.A0h();
                        if (A0h == null) {
                            A0h = "";
                        }
                        S57.A00(userSession2).A02(new C47714L4v(directThreadKey, enumC117355Su, A0h, null, null, c83403nh.A1h, z, false));
                    }
                }
            }

            @Override // X.InterfaceC93894Jz
            public final void DAK(DirectThreadKey directThreadKey, Long l, String str, boolean z) {
                if (A00()) {
                    UserSession userSession2 = this.A00;
                    InterfaceC09390do interfaceC09390do = AbstractC43605JQl.A00;
                    String str2 = null;
                    if (C18U.A06(C06090Tz.A05, userSession2, 36320326514385264L)) {
                        C43724JVj c43724JVj = (C43724JVj) AbstractC43605JQl.A00.getValue();
                        String str3 = userSession2.userId;
                        Integer num = C05F.A00;
                        if (l != null) {
                            str2 = l.toString();
                        }
                        C43724JVj.A02(userSession2, new C43735JVu(directThreadKey, null, null, num, str, str3, null, str2), c43724JVj, C05F.A0C);
                        return;
                    }
                    EnumC117355Su enumC117355Su = EnumC117355Su.A08;
                    if (l != null) {
                        str2 = l.toString();
                    }
                    S57.A00(userSession2).A02(new C47714L4v(directThreadKey, enumC117355Su, str, null, null, str2, z, false));
                }
            }

            @Override // X.InterfaceC93894Jz
            public final void DAL(C83403nh c83403nh, DirectThreadKey directThreadKey, boolean z) {
                Integer num;
                EnumC117355Su enumC117355Su;
                int i;
                C7O9 A0O;
                String str;
                String str2;
                if (A00()) {
                    C7BW c7bw = c83403nh.A0Q;
                    if (c7bw != null) {
                        num = c7bw.A02;
                    } else {
                        num = null;
                    }
                    if (num != C05F.A01 && !c83403nh.A2O) {
                        UserSession userSession2 = this.A00;
                        InterfaceC09390do interfaceC09390do = AbstractC43605JQl.A00;
                        C06090Tz c06090Tz = C06090Tz.A05;
                        if (C18U.A06(c06090Tz, userSession2, 36320326514385264L)) {
                            C83553nw c83553nw = c83403nh.A0N;
                            if (c83553nw != null && c83553nw.A09 && C18U.A06(c06090Tz, userSession2, 36320326514909559L)) {
                                C83553nw c83553nw2 = c83403nh.A0N;
                                Object obj = null;
                                if (c83553nw2 != null) {
                                    str = c83553nw2.A03;
                                } else {
                                    str = null;
                                }
                                String valueOf = String.valueOf(str);
                                if (AbstractC13670mt.A0A(valueOf)) {
                                    Iterator it = AbstractC001900j.A0R(valueOf, new String[]{" "}, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (AbstractC13670mt.A0A((String) next)) {
                                            obj = next;
                                            break;
                                        }
                                    }
                                    str2 = (String) obj;
                                } else {
                                    str2 = "❤️";
                                }
                                C43724JVj c43724JVj = (C43724JVj) AbstractC43605JQl.A00.getValue();
                                String str3 = userSession2.userId;
                                Integer num2 = C05F.A00;
                                C43735JVu c43735JVu = new C43735JVu(c83403nh, directThreadKey, num2, str3);
                                String str4 = c83403nh.A1u;
                                C14360o3.A07(str4);
                                C43724JVj.A03(userSession2, new C47577Kzn(new AnonymousClass441(null, Long.valueOf(c83403nh.C8i()), str4, str2, null), c43735JVu), c43724JVj, num2);
                                return;
                            }
                            C43724JVj c43724JVj2 = (C43724JVj) AbstractC43605JQl.A00.getValue();
                            String str5 = userSession2.userId;
                            Integer num3 = C05F.A00;
                            C43724JVj.A02(userSession2, new C43735JVu(c83403nh, directThreadKey, num3, str5), c43724JVj2, num3);
                            return;
                        }
                        C2EY c2ey = c83403nh.A10;
                        AbstractC47080Krb abstractC47080Krb = AbstractC47080Krb.$redex_init_class;
                        int ordinal = c2ey.ordinal();
                        if (ordinal != 2) {
                            if (ordinal == 22 && (A0O = c83403nh.A0O()) != null && A0O.ordinal() == 5) {
                                enumC117355Su = EnumC117355Su.A05;
                            } else {
                                enumC117355Su = EnumC117355Su.A07;
                            }
                        } else {
                            enumC117355Su = EnumC117355Su.A06;
                        }
                        String A0i = c83403nh.A0i();
                        String str6 = c83403nh.A1u;
                        Context context = AbstractC12290kX.A00;
                        C14360o3.A07(context);
                        AbstractC47079Kra abstractC47079Kra = AbstractC47079Kra.$redex_init_class;
                        int ordinal2 = enumC117355Su.ordinal();
                        String str7 = null;
                        if (ordinal2 != 1) {
                            if (ordinal2 == 4) {
                                Object obj2 = c83403nh.A1T;
                                C14360o3.A0C(obj2, AbstractC111324zv.A00(486));
                                str7 = ((C7QR) obj2).A0A;
                            }
                        } else {
                            if (c83403nh.A2P) {
                                i = 2131959991;
                            } else {
                                int ordinal3 = c83403nh.A10.ordinal();
                                if (ordinal3 != 3) {
                                    if (ordinal3 != 57) {
                                        if (C18U.A06(c06090Tz, userSession2, 36324660136456532L)) {
                                            Py8 py8 = new Py8(context, null, null, null, -1, -1, -1, -1, 1, -1, true, false, false, true, false, false);
                                            Object obj3 = c83403nh.A1T;
                                            C14360o3.A0C(obj3, "null cannot be cast to non-null type kotlin.String");
                                            str7 = py8.A00((String) obj3).toString();
                                        } else {
                                            Object obj4 = c83403nh.A1T;
                                            C14360o3.A0C(obj4, "null cannot be cast to non-null type kotlin.String");
                                            str7 = (String) obj4;
                                        }
                                    }
                                } else {
                                    i = 2131960011;
                                }
                            }
                            str7 = context.getString(i);
                        }
                        S57.A00(userSession2).A02(new C47714L4v(directThreadKey, enumC117355Su, A0i, str6, str7, c83403nh.A1h, z, c83403nh.A2P));
                    }
                }
            }

            @Override // X.InterfaceC93894Jz
            public final void Drg(C5lP c5lP) {
            }

            private final boolean A00() {
                if (AbstractC117345St.A01(this.A00)) {
                    if (System.currentTimeMillis() - AbstractC19750y3.A01("direct_sync_notification_preferences").getLong("account_switch_timestamp", 0L) > StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS) {
                        return true;
                    }
                }
                return false;
            }

            {
                this.A00 = userSession;
            }
        };
        C0f9.A0A(1064566948, A032);
        C0f9.A0A(-745775408, A03);
        return interfaceC93894Jz;
    }
}
