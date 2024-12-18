package X;

import java.io.StringWriter;

/* renamed from: X.2kk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57712kk implements InterfaceC25281Li {
    @Override // X.InterfaceC25281Li
    public final /* bridge */ /* synthetic */ String EOt(Object obj) {
        C4JN c4jn = (C4JN) obj;
        StringWriter stringWriter = new StringWriter();
        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
        A0A.A0d();
        if (c4jn.A00 != null) {
            C16V.A03(A0A, "responses");
            for (C41159IJy c41159IJy : c4jn.A00) {
                if (c41159IJy != null) {
                    A0A.A0d();
                    A0A.A0R("timestamp", c41159IJy.A01);
                    String str = c41159IJy.A03;
                    if (str != null) {
                        A0A.A0S("media_id", str);
                    }
                    String str2 = c41159IJy.A04;
                    if (str2 != null) {
                        A0A.A0S("quiz_id", str2);
                    }
                    A0A.A0Q("answer", c41159IJy.A00);
                    String str3 = c41159IJy.A05;
                    if (str3 != null) {
                        A0A.A0S(AbstractC43591JPw.A00(51), str3);
                    }
                    String str4 = c41159IJy.A02;
                    if (str4 != null) {
                        A0A.A0S("media_delivery_class", str4);
                    }
                    String str5 = c41159IJy.A06;
                    if (str5 != null) {
                        A0A.A0S("tray_session_id", str5);
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
        return AbstractC40885I9j.parseFromJson(C16V.A00(str));
    }
}
