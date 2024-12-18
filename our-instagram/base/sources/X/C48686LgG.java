package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LgG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48686LgG implements InterfaceC50472MQa {
    public final /* synthetic */ KBQ A00;

    public C48686LgG(KBQ kbq) {
        this.A00 = kbq;
    }

    @Override // X.InterfaceC50472MQa
    public final void CvV() {
        String str;
        KBQ kbq = this.A00;
        UserSession userSession = kbq.A00;
        if (userSession == null) {
            str = "userSession";
        } else {
            C46512KiB c46512KiB = kbq.A01;
            str = "analyticsData";
            if (c46512KiB != null) {
                String str2 = c46512KiB.A01;
                C14360o3.A07(str2);
                C46512KiB c46512KiB2 = kbq.A01;
                if (c46512KiB2 != null) {
                    String str3 = c46512KiB2.A02;
                    C14360o3.A07(str3);
                    AbstractC31173DnH.A1S(C162337Ov.A01(kbq, "list_new_quick_reply_tap", str2, str3), userSession);
                    KBQ.A00(kbq, null);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC50472MQa
    public final boolean DNY(C44178Jfh c44178Jfh) {
        KBQ.A00(this.A00, c44178Jfh);
        return true;
    }

    @Override // X.InterfaceC50472MQa
    public final void DNO(C44178Jfh c44178Jfh) {
        String str;
        String A00 = c44178Jfh.A00();
        if (A00 != null) {
            KBQ kbq = this.A00;
            UserSession userSession = kbq.A00;
            if (userSession == null) {
                str = "userSession";
            } else {
                C46512KiB c46512KiB = kbq.A01;
                str = "analyticsData";
                if (c46512KiB != null) {
                    String str2 = c46512KiB.A01;
                    C14360o3.A07(str2);
                    C46512KiB c46512KiB2 = kbq.A01;
                    if (c46512KiB2 != null) {
                        String str3 = c46512KiB2.A02;
                        C14360o3.A07(str3);
                        C19280xC A01 = C162337Ov.A01(kbq, "list_item_tap", str2, str3);
                        A01.A0C("quick_reply_id", A00);
                        AbstractC31173DnH.A1S(A01, userSession);
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        KBQ kbq2 = this.A00;
        InterfaceC50430MOk interfaceC50430MOk = kbq2.A02;
        if (interfaceC50430MOk != null) {
            interfaceC50430MOk.Dcr(c44178Jfh);
        }
        AbstractC25226BEj.A1Q(kbq2);
    }
}
