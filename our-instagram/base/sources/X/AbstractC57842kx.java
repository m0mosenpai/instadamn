package X;

import com.instagram.common.session.UserSession;
import java.io.StringWriter;

/* renamed from: X.2kx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC57842kx {
    public static final C57852ky A00(UserSession userSession) {
        C57502kP A00 = AbstractC57492kO.A00(userSession);
        C57852ky c57852ky = (C57852ky) ((AbstractC57542kT) A00.A04.get(C57852ky.class));
        if (c57852ky == null) {
            C57852ky c57852ky2 = new C57852ky(new C25301Lk(AbstractC12290kX.A00, new InterfaceC25281Li() { // from class: X.2kz
                @Override // X.InterfaceC25281Li
                public final /* bridge */ /* synthetic */ Object E3T(String str) {
                    C14360o3.A0B(str, 0);
                    C95114Pw parseFromJson = AbstractC54227Ny6.parseFromJson(C16V.A00(str));
                    if (parseFromJson == null) {
                        return new C95114Pw();
                    }
                    return parseFromJson;
                }

                @Override // X.InterfaceC25281Li
                public final /* bridge */ /* synthetic */ String EOt(Object obj) {
                    String str;
                    C95114Pw c95114Pw = (C95114Pw) obj;
                    C14360o3.A0B(c95114Pw, 0);
                    StringWriter stringWriter = new StringWriter();
                    C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                    A0A.A0d();
                    C16V.A03(A0A, "pending_story_likes");
                    for (C54785OJb c54785OJb : c95114Pw.A00) {
                        if (c54785OJb != null) {
                            A0A.A0d();
                            String str2 = c54785OJb.A04;
                            if (str2 != null) {
                                A0A.A0S("media_id", str2);
                                String str3 = c54785OJb.A01;
                                str = "action";
                                if (str3 != null) {
                                    A0A.A0S("action", str3);
                                    String str4 = c54785OJb.A02;
                                    if (str4 != null) {
                                        A0A.A0S("container_module", str4);
                                        String str5 = c54785OJb.A03;
                                        if (str5 != null) {
                                            A0A.A0S("delivery_class", str5);
                                        }
                                        A0A.A0Q("tray_position", c54785OJb.A00);
                                        String str6 = c54785OJb.A05;
                                        if (str6 != null) {
                                            A0A.A0S("tray_session_id", str6);
                                        }
                                        String str7 = c54785OJb.A06;
                                        if (str7 != null) {
                                            A0A.A0S("viewer_session_id", str7);
                                        }
                                        A0A.A0a();
                                    } else {
                                        str = "containerModule";
                                    }
                                }
                            } else {
                                str = "mediaId";
                            }
                            C14360o3.A0F(str);
                            throw C00O.createAndThrow();
                        }
                    }
                    A0A.A0Z();
                    A0A.A0a();
                    A0A.close();
                    String obj2 = stringWriter.toString();
                    C14360o3.A07(obj2);
                    return obj2;
                }
            }, 1048132585), userSession);
            A00.A03(c57852ky2, C57852ky.class);
            return c57852ky2;
        }
        return c57852ky;
    }
}
