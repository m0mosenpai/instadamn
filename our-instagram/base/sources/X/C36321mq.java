package X;

import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeProtocol;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.1mq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36321mq implements C0KV {
    public static final C36321mq A00 = new C36321mq();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
        int A03 = C0f9.A03(-1119374447);
        int A032 = C0f9.A03(-1787590859);
        C14360o3.A0B(userSession, 0);
        C4L3 c4l3 = new C4L3(userSession) { // from class: X.4LK
            public final UserSession A00;
            public final C4LL A01;

            @Override // X.C4L3
            public final AbstractC1333760g E6D(C5lP c5lP, C125205lR c125205lR, List list, Map map, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, boolean z) {
                User A02;
                HashMap hashMap;
                HashSet hashSet;
                C14360o3.A0B(map, 0);
                C14360o3.A0B(c125205lR, 2);
                String str = (String) map.get(RealtimeProtocol.USER_ID);
                if (str != null && "replace".equals(c125205lR.A00)) {
                    try {
                        C07880b8 c07880b8 = C07950bF.A04;
                        UserSession userSession2 = this.A00;
                        String str2 = c125205lR.A02;
                        C14360o3.A06(str2);
                        C45116Jxl parseFromJson = F4I.parseFromJson(c07880b8.A01(userSession2, str2));
                        C4LL c4ll = this.A01;
                        UserSession userSession3 = c4ll.A01;
                        if (C18U.A06(C06090Tz.A05, userSession3, 2342153453008060524L) && (A02 = AnonymousClass189.A00(userSession3).A02(str)) != null) {
                            String str3 = "inactive";
                            String str4 = "inactive";
                            if (!C14360o3.A0K(parseFromJson.A00, "inactive")) {
                                str3 = AppStateModule.APP_STATE_ACTIVE;
                            }
                            boolean equals = str4.equals(str3);
                            if (A02.Cey() != equals) {
                                C17P c17p = A02.A03;
                                C17R c17r = new C17R(c17p.B8n());
                                c17r.A0J = Boolean.valueOf(equals);
                                c17p.EUq(c17r.A00());
                                C2DU c2du = (C2DU) c4ll.A02;
                                synchronized (c2du) {
                                    hashMap = new HashMap();
                                    for (Map.Entry entry : c2du.A0F.A08()) {
                                        DirectThreadKey directThreadKey = (DirectThreadKey) entry.getKey();
                                        C4GV c4gv = (C4GV) entry.getValue();
                                        synchronized (c4gv) {
                                            hashSet = null;
                                            for (C83403nh c83403nh : c4gv.A0K) {
                                                if (str.equals(c83403nh.A1u)) {
                                                    if (hashSet == null) {
                                                        hashSet = new HashSet();
                                                    }
                                                    hashSet.add(c83403nh);
                                                }
                                            }
                                        }
                                        if (hashSet != null) {
                                            hashMap.put(directThreadKey, hashSet);
                                        }
                                    }
                                }
                                if (!C14360o3.A0K(parseFromJson.A00, str4)) {
                                    str4 = AppStateModule.APP_STATE_ACTIVE;
                                }
                                Long BTC = A02.BTC();
                                if (BTC == null) {
                                    C4LL.A00(c4ll, str4, hashMap);
                                } else {
                                    c4ll.A03.A01(new ETC(c4ll, str4, hashMap), userSession3, BTC.toString());
                                }
                            }
                        }
                        return C1333660e.A00;
                    } catch (IOException e) {
                        C0w9.A01.EmT("invalid_user_account_status_format", "Invalid DirectUserAccountStatus format", 1, e);
                        return new C1334060j(e, "invalid_user_account_status_format", "Invalid DirectUserAccountStatus format");
                    }
                }
                return C1333860h.A00;
            }

            {
                this.A00 = userSession;
                this.A01 = new C4LL(userSession);
            }
        };
        C0f9.A0A(-544289591, A032);
        C0f9.A0A(-1043578597, A03);
        return c4l3;
    }
}
