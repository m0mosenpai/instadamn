package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.SNx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62732SNx {
    public InterfaceC08100bW A00;
    public S1I A01;
    public final List A02;
    public final List A03;

    public final Integer A01(String str) {
        String str2;
        String A0u;
        C14360o3.A0B(str, 0);
        InterfaceC08100bW interfaceC08100bW = this.A00;
        android.net.Uri A00 = AbstractC08820cl.A00(interfaceC08100bW, str);
        if (A00 == null) {
            str2 = "WebViewUriHandler";
            A0u = "Uri cannot be parsed so we block it.";
        } else {
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                if (((AbstractC08800ci) it.next()).A01(A00)) {
                    return C05F.A00;
                }
            }
            String scheme = A00.getScheme();
            String authority = A00.getAuthority();
            if (scheme == null) {
                scheme = "cannot parse";
            }
            if (authority == null) {
                authority = "cannot parse";
            }
            str2 = "WebViewUriHandler";
            A0u = AnonymousClass001.A0u("Uri is blocked, scheme: ", scheme, " , authority: ", authority);
        }
        interfaceC08100bW.EHA(str2, A0u, null);
        return C05F.A0C;
    }

    public C62732SNx(InterfaceC08100bW interfaceC08100bW, S1I s1i, List list, List list2) {
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A03 = A1E;
        ArrayList A1E2 = AbstractC166987dD.A1E();
        this.A02 = A1E2;
        A1E2.addAll(list2);
        A1E.addAll(list);
        this.A00 = interfaceC08100bW;
        this.A01 = s1i;
    }

    public final Integer A00(Context context, String str) {
        boolean A1a = AbstractC167017dG.A1a(context, str);
        InterfaceC08100bW interfaceC08100bW = this.A00;
        android.net.Uri A00 = AbstractC08820cl.A00(interfaceC08100bW, str);
        if (A00 == null) {
            interfaceC08100bW.EHA("WebViewUriHandler", "Uri cannot be parsed so we block it.", null);
            return C05F.A0C;
        }
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            C64157T1i c64157T1i = (C64157T1i) ((InterfaceC65234TgQ) it.next());
            String A19 = AbstractC166987dD.A19(A00);
            Rb4 rb4 = c64157T1i.A00;
            if (AbstractC43592JPx.A1a(rb4.A08, A1a ? 1 : 0, A19)) {
                rb4.A00();
                return C05F.A01;
            }
        }
        return A01(str);
    }
}
