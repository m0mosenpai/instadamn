package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.G3x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36396G3x implements InterfaceC65529Tlz {
    public final int A00;
    public final Object A01;

    public C36396G3x(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC65529Tlz
    public final void onFailure() {
        UserSession A0p;
        String str;
        String str2;
        String str3;
        int i = this.A00;
        C35030Fc3 c35030Fc3 = C35030Fc3.A00;
        if (i != 0) {
            EHQ ehq = (EHQ) this.A01;
            A0p = AbstractC166987dD.A0r(ehq.A06);
            str = ehq.A01;
            if (str == null) {
                str3 = "entryPoint";
            } else {
                str2 = ehq.A02;
                if (str2 == null) {
                    str3 = "threadId";
                }
            }
            C14360o3.A0F(str3);
            throw C00O.createAndThrow();
        }
        A0p = ((JR2) this.A01).A0p();
        str = "inbox";
        str2 = null;
        c35030Fc3.A01(A0p, str, str2);
    }

    @Override // X.InterfaceC65529Tlz
    public final void onSuccess() {
        String str;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            EHQ ehq = (EHQ) obj;
            ehq.A03.invoke();
            ehq.A07();
            C35030Fc3 c35030Fc3 = C35030Fc3.A00;
            UserSession A0r = AbstractC166987dD.A0r(ehq.A06);
            String str2 = ehq.A01;
            if (str2 == null) {
                str = "entryPoint";
            } else {
                String str3 = ehq.A02;
                if (str3 == null) {
                    str = "threadId";
                } else {
                    c35030Fc3.A02(A0r, str2, str3);
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        JR2 jr2 = (JR2) obj;
        C5G2 A00 = AbstractC161117Jw.A00(jr2.A0p());
        A00.A00 = true;
        A00.A01 = false;
        jr2.A0q().A07((C44096JeL) jr2.A2K.getValue(), true, true);
        jr2.A18(null, AbstractC43591JPw.A00(64), true);
        C35030Fc3.A00.A02(jr2.A0p(), "inbox", null);
    }
}
