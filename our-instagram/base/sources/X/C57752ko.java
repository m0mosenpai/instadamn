package X;

import java.io.StringWriter;

/* renamed from: X.2ko, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57752ko implements InterfaceC25281Li {
    @Override // X.InterfaceC25281Li
    public final /* bridge */ /* synthetic */ String EOt(Object obj) {
        C4JP c4jp = (C4JP) obj;
        StringWriter stringWriter = new StringWriter();
        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
        A0A.A0d();
        if (c4jp.A00 != null) {
            C16V.A03(A0A, "follow_requests");
            for (FLC flc : c4jp.A00) {
                if (flc != null) {
                    A0A.A0d();
                    String str = flc.A01;
                    if (str != null) {
                        A0A.A0S(AbstractC111324zv.A00(2199), str);
                    }
                    String str2 = flc.A02;
                    if (str2 != null) {
                        A0A.A0S("source_media_id", str2);
                    }
                    Boolean bool = flc.A00;
                    if (bool != null) {
                        A0A.A0T(MSV.A00(217), bool.booleanValue());
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
        return AbstractC34318FBm.parseFromJson(C16V.A00(str));
    }
}
