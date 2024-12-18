package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.io.StringWriter;
import java.util.Map;

/* renamed from: X.2ke, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57652ke extends AbstractC57542kT {
    public final C25301Lk A00;

    public static C57652ke A00(UserSession userSession) {
        C57502kP A00 = AbstractC57492kO.A00(userSession);
        C57652ke c57652ke = (C57652ke) ((AbstractC57542kT) A00.A04.get(C57652ke.class));
        if (c57652ke == null) {
            C57652ke c57652ke2 = new C57652ke(new C25301Lk(AbstractC12290kX.A00, new InterfaceC25281Li() { // from class: X.2kf
                @Override // X.InterfaceC25281Li
                public final /* bridge */ /* synthetic */ String EOt(Object obj) {
                    C93584Hz c93584Hz = (C93584Hz) obj;
                    StringWriter stringWriter = new StringWriter();
                    C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                    A0A.A0d();
                    if (c93584Hz.A00 != null) {
                        A0A.A0r(AbstractC111324zv.A00(2866));
                        A0A.A0d();
                        for (Map.Entry entry : c93584Hz.A00.entrySet()) {
                            if (!C16V.A04(A0A, entry)) {
                                C64022vN c64022vN = (C64022vN) entry.getValue();
                                A0A.A0d();
                                String str = c64022vN.A02;
                                if (str != null) {
                                    A0A.A0S(TraceFieldType.RequestID, str);
                                }
                                if (c64022vN.A03 != null) {
                                    A0A.A0r(AbstractC111324zv.A00(3056));
                                    A0A.A0d();
                                    for (Map.Entry entry2 : c64022vN.A03.entrySet()) {
                                        if (!C16V.A04(A0A, entry2)) {
                                            AbstractC34846FXe.A00(A0A, (C6XA) entry2.getValue());
                                        }
                                    }
                                    A0A.A0a();
                                }
                                if (c64022vN.A05 != null) {
                                    A0A.A0r(AbstractC111324zv.A00(3113));
                                    A0A.A0d();
                                    for (Map.Entry entry3 : c64022vN.A05.entrySet()) {
                                        if (!C16V.A04(A0A, entry3)) {
                                            AbstractC34846FXe.A00(A0A, (C6XA) entry3.getValue());
                                        }
                                    }
                                    A0A.A0a();
                                }
                                if (c64022vN.A04 != null) {
                                    A0A.A0r(AbstractC111324zv.A00(3057));
                                    A0A.A0d();
                                    for (Map.Entry entry4 : c64022vN.A04.entrySet()) {
                                        if (!C16V.A04(A0A, entry4)) {
                                            A0A.A0u((String) entry4.getValue());
                                        }
                                    }
                                    A0A.A0a();
                                }
                                if (c64022vN.A06 != null) {
                                    A0A.A0r(AbstractC111324zv.A00(3114));
                                    A0A.A0d();
                                    for (Map.Entry entry5 : c64022vN.A06.entrySet()) {
                                        if (!C16V.A04(A0A, entry5)) {
                                            A0A.A0u((String) entry5.getValue());
                                        }
                                    }
                                    A0A.A0a();
                                }
                                if (c64022vN.A07 != null) {
                                    C16V.A03(A0A, "force_seen_story_ids");
                                    for (String str2 : c64022vN.A07) {
                                        if (str2 != null) {
                                            A0A.A0u(str2);
                                        }
                                    }
                                    A0A.A0Z();
                                }
                                String str3 = c64022vN.A01;
                                if (str3 != null) {
                                    A0A.A0S("container_module", str3);
                                }
                                String str4 = c64022vN.A00;
                                if (str4 != null) {
                                    A0A.A0S("notification_type", str4);
                                }
                                A0A.A0a();
                            }
                        }
                        A0A.A0a();
                    }
                    A0A.A0a();
                    A0A.close();
                    return stringWriter.toString();
                }

                @Override // X.InterfaceC25281Li
                public final /* bridge */ /* synthetic */ Object E3T(String str) {
                    return AbstractC34319FBn.parseFromJson(C16V.A00(str));
                }
            }, 630639402), userSession);
            A00.A03(c57652ke2, C57652ke.class);
            return c57652ke2;
        }
        return c57652ke;
    }

    public C57652ke(C25301Lk c25301Lk, UserSession userSession) {
        super(userSession);
        this.A00 = c25301Lk;
    }

    public final void A0L(C64022vN c64022vN) {
        if (!c64022vN.A07()) {
            UserSession userSession = this.A02;
            AbstractC57492kO.A00(userSession).A02(c64022vN.A03(userSession));
        }
    }
}
