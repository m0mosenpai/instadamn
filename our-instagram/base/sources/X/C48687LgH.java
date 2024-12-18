package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LgH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48687LgH implements InterfaceC50472MQa {
    public final /* synthetic */ KCJ A00;

    @Override // X.InterfaceC50472MQa
    public final boolean DNY(C44178Jfh c44178Jfh) {
        return false;
    }

    public C48687LgH(KCJ kcj) {
        this.A00 = kcj;
    }

    @Override // X.InterfaceC50472MQa
    public final void CvV() {
        String str;
        KCJ kcj = this.A00;
        UserSession userSession = kcj.A00;
        if (userSession == null) {
            str = "userSession";
        } else {
            C46512KiB c46512KiB = kcj.A01;
            str = "analyticsData";
            if (c46512KiB != null) {
                String str2 = c46512KiB.A01;
                C14360o3.A07(str2);
                C46512KiB c46512KiB2 = kcj.A01;
                if (c46512KiB2 != null) {
                    String str3 = c46512KiB2.A02;
                    C14360o3.A07(str3);
                    AbstractC31173DnH.A1S(C162337Ov.A01(kcj, "list_new_quick_reply_tap", str2, str3), userSession);
                    KCJ.A00(kcj, null);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC50472MQa
    public final void DNO(C44178Jfh c44178Jfh) {
        String str;
        String A00 = c44178Jfh.A00();
        if (A00 != null) {
            KCJ kcj = this.A00;
            UserSession userSession = kcj.A00;
            if (userSession == null) {
                str = "userSession";
            } else {
                C46512KiB c46512KiB = kcj.A01;
                str = "analyticsData";
                if (c46512KiB != null) {
                    String str2 = c46512KiB.A01;
                    C14360o3.A07(str2);
                    C46512KiB c46512KiB2 = kcj.A01;
                    if (c46512KiB2 != null) {
                        String str3 = c46512KiB2.A02;
                        C14360o3.A07(str3);
                        C19280xC A01 = C162337Ov.A01(kcj, "list_item_tap", str2, str3);
                        A01.A0C("quick_reply_id", A00);
                        AbstractC31173DnH.A1S(A01, userSession);
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        KCJ.A00(this.A00, c44178Jfh.A00());
    }
}
