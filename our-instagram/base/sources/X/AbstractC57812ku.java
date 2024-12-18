package X;

import com.instagram.api.schemas.UpcomingEventIDType;
import com.instagram.common.session.UserSession;
import java.io.StringWriter;

/* renamed from: X.2ku, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC57812ku {
    public static final C57822kv A00(UserSession userSession) {
        C57502kP A00 = AbstractC57492kO.A00(userSession);
        C57822kv c57822kv = (C57822kv) ((AbstractC57542kT) A00.A04.get(C57822kv.class));
        if (c57822kv == null) {
            C57822kv c57822kv2 = new C57822kv(new C25301Lk(AbstractC12290kX.A00, new InterfaceC25281Li() { // from class: X.2kw
                @Override // X.InterfaceC25281Li
                public final /* bridge */ /* synthetic */ Object E3T(String str) {
                    C14360o3.A0B(str, 0);
                    C95104Pv parseFromJson = AbstractC40889I9n.parseFromJson(C16V.A00(str));
                    C14360o3.A07(parseFromJson);
                    return parseFromJson;
                }

                @Override // X.InterfaceC25281Li
                public final /* bridge */ /* synthetic */ String EOt(Object obj) {
                    C95104Pv c95104Pv = (C95104Pv) obj;
                    C14360o3.A0B(c95104Pv, 0);
                    StringWriter stringWriter = new StringWriter();
                    C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                    A0A.A0d();
                    if (c95104Pv.A00 != null) {
                        C16V.A03(A0A, AbstractC111324zv.A00(2868));
                        for (INM inm : c95104Pv.A00) {
                            if (inm != null) {
                                A0A.A0d();
                                inm.A02();
                                A0A.A0S("upcoming_event_id", inm.A02());
                                UpcomingEventIDType upcomingEventIDType = inm.A00;
                                if (upcomingEventIDType != null) {
                                    A0A.A0S(AbstractC111324zv.A00(919), upcomingEventIDType.A00);
                                    inm.A01();
                                    A0A.A0S(AbstractC111324zv.A00(3005), inm.A01().A00);
                                    String str = inm.A02;
                                    if (str != null) {
                                        A0A.A0S("media_pk", str);
                                    }
                                    A0A.A0a();
                                } else {
                                    C14360o3.A0F("eventIdType");
                                    throw C00O.createAndThrow();
                                }
                            }
                        }
                        A0A.A0Z();
                    }
                    A0A.A0a();
                    A0A.close();
                    String obj2 = stringWriter.toString();
                    C14360o3.A07(obj2);
                    return obj2;
                }
            }, 26195652), userSession);
            A00.A03(c57822kv2, C57822kv.class);
            return c57822kv2;
        }
        return c57822kv;
    }
}
