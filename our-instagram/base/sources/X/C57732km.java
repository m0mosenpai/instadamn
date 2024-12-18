package X;

import com.instagram.common.session.UserSession;
import java.io.StringWriter;

/* renamed from: X.2km, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57732km implements InterfaceC25281Li {
    public UserSession A00;

    @Override // X.InterfaceC25281Li
    public final /* bridge */ /* synthetic */ Object E3T(String str) {
        return AbstractC40886I9k.parseFromJson(C07950bF.A04.A01(this.A00, str));
    }

    @Override // X.InterfaceC25281Li
    public final /* bridge */ /* synthetic */ String EOt(Object obj) {
        C4JO c4jo = (C4JO) obj;
        StringWriter stringWriter = new StringWriter();
        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
        A0A.A0d();
        if (c4jo.A00 != null) {
            C16V.A03(A0A, "votes");
            for (C41160IJz c41160IJz : c4jo.A00) {
                if (c41160IJz != null) {
                    A0A.A0d();
                    String str = c41160IJz.A03;
                    if (str != null) {
                        A0A.A0S("media_id", str);
                    }
                    String str2 = c41160IJz.A05;
                    if (str2 != null) {
                        A0A.A0S("slider_id", str2);
                    }
                    if (c41160IJz.A01 != null) {
                        A0A.A0r("vote");
                        AbstractC41344IRp.A00(A0A, c41160IJz.A01);
                    }
                    String str3 = c41160IJz.A04;
                    if (str3 != null) {
                        A0A.A0S(AbstractC43591JPw.A00(51), str3);
                    }
                    String str4 = c41160IJz.A02;
                    if (str4 != null) {
                        A0A.A0S("media_delivery_class", str4);
                    }
                    String str5 = c41160IJz.A06;
                    if (str5 != null) {
                        A0A.A0S("tray_session_id", str5);
                    }
                    A0A.A0Q("tray_position", c41160IJz.A00);
                    A0A.A0a();
                }
            }
            A0A.A0Z();
        }
        A0A.A0a();
        A0A.close();
        return stringWriter.toString();
    }
}
