package X;

import com.instagram.api.schemas.BizUserInboxState;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: X.1n6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36471n6 implements C0KV {
    public static final C36471n6 A00 = new C36471n6();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
        int A03 = C0f9.A03(-1844667995);
        int A032 = C0f9.A03(500616485);
        C14360o3.A0B(userSession, 0);
        C4L3 c4l3 = new C4L3(userSession) { // from class: X.4Lc
            public final UserSession A00;
            public final C28811aJ A01;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10, types: [X.LY2, java.lang.Object, X.1vN] */
            @Override // X.C4L3
            public final AbstractC1333760g E6D(C5lP c5lP, C125205lR c125205lR, List list, Map map, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, boolean z) {
                BizUserInboxState bizUserInboxState;
                C14360o3.A0B(c125205lR, 2);
                try {
                    BizUserInboxState bizUserInboxState2 = F45.parseFromJson(C16V.A00(c125205lR.A02)).A00;
                    if (bizUserInboxState2 != null && (bizUserInboxState2 != (bizUserInboxState = BizUserInboxState.A06) || AbstractC159067Bs.A00(this.A00))) {
                        UserSession userSession2 = this.A00;
                        C2056398n A002 = AbstractC2056298m.A00(userSession2);
                        A002.A0S.Egi(A002, Integer.valueOf(Integer.parseInt(bizUserInboxState2.A00)), C2056398n.A0d[9]);
                        C25671My A003 = AbstractC25651Mw.A00(userSession2);
                        ?? obj = new Object();
                        obj.A00 = bizUserInboxState2;
                        A003.E4s(obj);
                        if (bizUserInboxState2 == bizUserInboxState) {
                            this.A01.A09();
                        }
                    }
                    return C1333660e.A00;
                } catch (IOException e) {
                    C0w9.A01.EmP("invalid_biz_user_inbox_state", "General folder state is missing", e);
                    return new C1334060j(e, "invalid_biz_user_inbox_state", "General folder state is missing");
                }
            }

            {
                this.A00 = userSession;
                C28811aJ A002 = C28811aJ.A00(userSession);
                C14360o3.A07(A002);
                this.A01 = A002;
            }
        };
        C0f9.A0A(1589558581, A032);
        C0f9.A0A(1802569474, A03);
        return c4l3;
    }
}
