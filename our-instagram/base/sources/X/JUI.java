package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class JUI implements InterfaceC13000lm {
    public InterfaceC37166GZd A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final C25671My A04;
    public final UserSession A05;
    public final InterfaceC19630xq A06;
    public final Map A07;
    public final AbstractRunnableC14200nk A08;

    public final C44178Jfh A02(String str) {
        C14360o3.A0B(str, 0);
        Object obj = null;
        C11T.A06("This operation must be run on UI thread.");
        if (str.length() == 0) {
            return null;
        }
        String A16 = AbstractC31172DnG.A16(C1Q2.A02(), str);
        Iterator A162 = AbstractC166997dE.A16(this.A07);
        while (true) {
            if (!A162.hasNext()) {
                break;
            }
            Object next = A162.next();
            if (C14360o3.A0K(((C44178Jfh) next).A03, A16)) {
                obj = next;
                break;
            }
        }
        return (C44178Jfh) obj;
    }

    public final ArrayList A03(String str) {
        C44178Jfh c44178Jfh = null;
        C11T.A06("This operation must be run on UI thread.");
        ArrayList A1E = AbstractC166987dD.A1E();
        String A16 = AbstractC31172DnG.A16(C1Q2.A02(), str);
        C11T.A06("This operation must be run on UI thread.");
        if (A02(A16) != null && (c44178Jfh = A02(A16)) != null) {
            A1E.add(c44178Jfh);
        }
        if (A16.length() >= 5) {
            Iterator A162 = AbstractC166997dE.A16(this.A07);
            while (A162.hasNext()) {
                C44178Jfh c44178Jfh2 = (C44178Jfh) A162.next();
                String str2 = c44178Jfh2.A02;
                if (str2 != null && AbstractC001900j.A0a(AbstractC37303Gc4.A0X(str2), A16, false) && !c44178Jfh2.equals(c44178Jfh)) {
                    A1E.add(c44178Jfh2);
                }
            }
        }
        return A1E;
    }

    public static final void A00(JUI jui) {
        ArrayList A1F = AbstractC166987dD.A1F(jui.A07.values());
        String str = jui.A01;
        ArrayList A1F2 = AbstractC166987dD.A1F(A1F);
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0S = AbstractC167007dF.A0S(stringWriter);
            if (str != null) {
                A0S.A0S("modification_token", str);
            }
            C16V.A03(A0S, "quick_replies");
            Iterator it = A1F2.iterator();
            while (it.hasNext()) {
                C44178Jfh c44178Jfh = (C44178Jfh) it.next();
                if (c44178Jfh != null) {
                    A0S.A0d();
                    String str2 = c44178Jfh.A03;
                    if (str2 != null) {
                        A0S.A0S("shortcut", str2);
                    }
                    String str3 = c44178Jfh.A02;
                    if (str3 != null) {
                        A0S.A0S("text", str3);
                    }
                    String str4 = c44178Jfh.A01;
                    if (str4 != null) {
                        A0S.A0S("uuid", str4);
                    }
                    Integer num = c44178Jfh.A00;
                    if (num != null) {
                        A0S.A0Q("label", AbstractC46786Kmh.A00(num));
                    }
                    A0S.A0a();
                }
            }
            A0S.A0Z();
            String A0l = AbstractC167017dG.A0l(A0S, stringWriter);
            InterfaceC19610xo ARD = jui.A06.ARD();
            ARD.E7K("quickRepliesCollection", A0l);
            ARD.apply();
            jui.A04.E4s(new C44192Jfv());
        } catch (IOException e) {
            C0w9.A05("quick_replies_serialization", "failed to serialize", 1, e);
        }
    }

    public static final void A01(JUI jui, List list) {
        Map map = jui.A07;
        map.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C44178Jfh c44178Jfh = (C44178Jfh) it.next();
            String A00 = c44178Jfh.A00();
            if (A00 != null) {
                map.put(A00, c44178Jfh);
            }
        }
    }

    public final List A04() {
        C11T.A06("This operation must be run on UI thread.");
        ArrayList A1F = AbstractC166987dD.A1F(this.A07.values());
        C01T.A1D(A1F, C7OD.A00);
        return AbstractC31172DnG.A19(A1F);
    }

    public final void A05() {
        C11T.A06("This operation must be run on UI thread.");
        C14120nc.A00().ATO(this.A08);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A05.A03(JUI.class);
    }

    public JUI(C25671My c25671My, UserSession userSession, InterfaceC19630xq interfaceC19630xq) {
        AbstractC167017dG.A1P(userSession, c25671My);
        this.A07 = AbstractC166987dD.A1G();
        this.A06 = interfaceC19630xq;
        this.A05 = userSession;
        this.A04 = c25671My;
        this.A01 = "";
        this.A08 = new C44120Jek(this);
    }
}
