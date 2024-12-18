package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.fbpay.auth.models.AuthTicketType;
import com.google.gson.Gson;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;

/* renamed from: X.Si1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63345Si1 {
    public static final C1N8 A08 = new C1N8() { // from class: X.SpA
        @Override // X.C1N8
        public final Object apply(Object obj) {
            String str;
            String str2 = ((SPN) obj).A00;
            if ("PIN".equalsIgnoreCase(str2)) {
                str = "VERIFY_PIN_TO_PAY";
            } else if ("BIO".equalsIgnoreCase(str2)) {
                str = "VERIFY_BIO_TO_PAY";
            } else if ("CSC".equalsIgnoreCase(str2)) {
                str = "CONNECT_FROM_CHECKOUT_CVV_VERIFICATION";
            } else {
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
            }
            return new C2GT(C63406Sjd.A04(str));
        }
    };
    public C64190T2z A00;
    public final Fragment A01;
    public final FragmentActivity A02;
    public final C58770Q8c A03;
    public final C58443PvM A04;
    public final List A05 = AbstractC166987dD.A1E();
    public final C1N8 A06;
    public final SQ1 A07;

    public static void A01(C1N8 c1n8, C58252li c58252li, SE2 se2, C63345Si1 c63345Si1, Object obj, String str) {
        Bundle bundle = se2.A01;
        String A00 = AbstractC63243Sfx.A00(bundle, 1);
        if ("VERIFY_BIO_TO_PAY".equalsIgnoreCase(A00)) {
            AbstractC58322PtE.A18(bundle, "AUTH_FLOW_UTIL_AUTH_FLOW", "VERIFY_PIN_TO_PAY", 1);
        }
        if ("VERIFY_BIO_TO_DISABLE_BIO_HUB".equalsIgnoreCase(A00)) {
            AbstractC58322PtE.A18(bundle, "AUTH_FLOW_UTIL_AUTH_FLOW", "VERIFY_PIN_TO_DISABLE_BIO_HUB", 1);
        }
        bundle.putString("AUTH_METHOD_TYPE", "PIN");
        C58770Q8c c58770Q8c = c63345Si1.A03;
        C63167SeR.A01(c58770Q8c.A05, new SO8(null, null, null, new C64189T2y(c1n8, c58252li, se2, c63345Si1, obj, str, 0), se2, c63345Si1.A04.A00.A03));
    }

    public final void A06(C2GS c2gs, SE2 se2, Object obj, String str, Queue queue) {
        Object peek = queue.peek();
        if (peek != null) {
            C2GT c2gt = (C2GT) this.A06.apply(peek);
            if (c2gt != null) {
                C07X c07x = this.A01;
                if (c07x == null) {
                    c07x = this.A02;
                    c07x.getClass();
                }
                C63406Sjd.A09(c07x, c2gt, new C63623SqV(c2gs, se2, queue, this, obj, str, 0));
                return;
            }
            throw AbstractC166987dD.A12("Caller must provide success or fail live data whether DA should proceed or abort the DA");
        }
        throw AbstractC166987dD.A12("Factor Queue can not be empty");
    }

    public static void A00(C1N8 c1n8, C58252li c58252li, SE2 se2, SGB sgb, C63345Si1 c63345Si1, Object obj, String str) {
        java.util.Set emptySet;
        java.util.Set set;
        C58443PvM c58443PvM = c63345Si1.A04;
        C63174SeZ A04 = C2FP.A04();
        C63346Si2 A01 = C63174SeZ.A01();
        if (sgb != null) {
            emptySet = AbstractC58322PtE.A0x(sgb.A01);
        } else {
            emptySet = Collections.emptySet();
        }
        Bundle bundle = se2.A01;
        String string = bundle.getString("PAYMENT_ACCOUNT_ID");
        String string2 = bundle.getString("PAYMENT_OTC_SESSION_ID");
        String string3 = bundle.getString("PAYMENT_OTC_TYPE");
        Map A012 = SSA.A01(bundle);
        AbstractC167017dG.A1P(str, obj);
        C14360o3.A0B(A012, 7);
        C64192T3b c64192T3b = new C64192T3b(A01, 1);
        if (emptySet == null) {
            set = C16910sj.A00;
        } else {
            set = emptySet;
        }
        T3Z A00 = AbstractC63063Sbk.A00(c64192T3b, set);
        if (emptySet == null) {
            emptySet = C16910sj.A00;
        }
        C60623REi A02 = AbstractC63245Sfz.A02(c1n8, A04, c58443PvM, new SXG(A00, obj, str, string, string2, string3, null, null, A012, emptySet));
        AbstractC63144Sdq.A02(A02);
        c58252li.A0E(((AbstractC63144Sdq) A02).A03, C63628Sqa.A00(c58252li, 54));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A02(InterfaceC65507Tlc interfaceC65507Tlc, SE2 se2, C63345Si1 c63345Si1) {
        AbstractC10360h2 childFragmentManager;
        SQ1 sq1 = c63345Si1.A07;
        Bundle bundle = se2.A01;
        C0SG c0sg = (C0SG) sq1.A04.A01(bundle, "AUTH_CONTAINER");
        if (c0sg instanceof InterfaceC65506Tlb) {
            ((InterfaceC65506Tlb) c0sg).EQ3(interfaceC65507Tlc);
        }
        FragmentActivity fragmentActivity = c63345Si1.A02;
        if (fragmentActivity != null) {
            childFragmentManager = fragmentActivity.getSupportFragmentManager();
        } else {
            Fragment fragment = c63345Si1.A01;
            fragment.getClass();
            childFragmentManager = fragment.getChildFragmentManager();
        }
        C14240no c14240no = new C14240no(childFragmentManager);
        String A0j = AbstractC31173DnH.A0j(bundle, "AUTH_METHOD_TYPE");
        if (!"FB_ACCESS_TOKEN".equalsIgnoreCase(A0j) && !"IG_ACCESS_TOKEN".equalsIgnoreCase(A0j)) {
            c0sg.A0C(c14240no, "AUTH_CONTAINER_FRAGMENT_TAG");
        } else {
            c14240no.A0B(c0sg, "AUTH_CONTAINER_FRAGMENT_TAG");
            c14240no.A00();
        }
    }

    public final C58252li A03(final C1N8 c1n8, final C1N8 c1n82, final SE2 se2, final Object obj, final String str) {
        C2GT c2gt;
        C07X c07x;
        InterfaceC58362lv A00;
        Bundle bundle = se2.A01;
        String bool = Boolean.toString(true);
        Bundle bundle2 = bundle.getBundle("AUTH_LOGGING_EXTRA_KEY");
        if (bundle2 == null) {
            bundle2 = AbstractC166987dD.A0b();
        }
        bundle2.putString("is_dynamic_auth_flow", bool);
        bundle.putBundle("AUTH_LOGGING_EXTRA_KEY", bundle2);
        C2GC c2gc = C2FP.A03().A01;
        HashMap A002 = SSA.A00(bundle);
        A002.put("DYNAMIC_AUTH_OPERATION_NAME", str);
        c2gc.Chz("client_load_dynamic_auth_init", Collections.unmodifiableMap(A002));
        final C2GS A0J = AbstractC58318PtA.A0J();
        if (bundle.getBoolean("REUSE_ATS_IN_AUTH_PROMPT_OBJ_SCOPED", false)) {
            this.A00 = new C64190T2z(A0J, this.A03, this, this.A04, obj, str);
        }
        REX rex = se2.A00;
        if (rex != null) {
            Iterator<SP0> it = rex.A00.A01.iterator();
            while (it.hasNext()) {
                if (!it.next().A00.isEmpty()) {
                    c2gt = new C2GT(C63406Sjd.A05(null, se2.A00));
                    c07x = this.A01;
                    if (c07x == null) {
                        c07x = this.A02;
                        c07x.getClass();
                    }
                    A00 = new C63623SqV(A0J, c1n82, se2, this, obj, str, 1);
                    C63406Sjd.A09(c07x, c2gt, A00);
                    C58252li A02 = C75M.A02(A0J, new InterfaceC16660sJ() { // from class: X.TWD
                        @Override // X.InterfaceC16660sJ
                        public final Object invoke(Object obj2) {
                            C63345Si1 c63345Si1 = this;
                            C1N8 c1n83 = c1n8;
                            C2GS c2gs = A0J;
                            String str2 = str;
                            Object obj3 = obj;
                            SE2 se22 = se2;
                            C1N8 c1n84 = c1n82;
                            C63406Sjd c63406Sjd = (C63406Sjd) obj2;
                            if (!C63406Sjd.A0H(c63406Sjd) && !C63406Sjd.A0G(c63406Sjd)) {
                                Object apply = c1n83.apply(C63406Sjd.A08(c63406Sjd));
                                apply.getClass();
                                C2GT c2gt2 = (C2GT) apply;
                                C07X c07x2 = c63345Si1.A01;
                                if (c07x2 == null) {
                                    c07x2 = c63345Si1.A02;
                                    c07x2.getClass();
                                }
                                C63406Sjd.A09(c07x2, c2gt2, new C63623SqV(c2gs, c1n84, se22, c63345Si1, obj3, str2, 1));
                                return c2gt2;
                            }
                            return new C2GT(C63406Sjd.A02(c63406Sjd, null));
                        }
                    });
                    A02.A09(new C63615SqN(se2, this, str, 2));
                    return A02;
                }
            }
        }
        C58443PvM c58443PvM = this.A04;
        C63174SeZ A04 = C2FP.A04();
        C63346Si2 A01 = C63174SeZ.A01();
        HashSet A1H = AbstractC166987dD.A1H();
        Collections.addAll(A1H, new C63152Se0[0]);
        String string = bundle.getString("PAYMENT_ACCOUNT_ID");
        String string2 = bundle.getString("PAYMENT_OTC_SESSION_ID");
        String string3 = bundle.getString("PAYMENT_OTC_TYPE");
        Map A012 = SSA.A01(bundle);
        AbstractC167007dF.A1H(obj, 2, A012);
        C60623REi A03 = AbstractC63245Sfz.A03(A04, c58443PvM, new SXG(AbstractC63063Sbk.A00(new C64192T3b(A01, 1), A1H), obj, str, string, string2, string3, null, null, A012, A1H));
        AbstractC63144Sdq.A02(A03);
        c2gt = ((AbstractC63144Sdq) A03).A03;
        c07x = this.A01;
        if (c07x == null) {
            c07x = this.A02;
            c07x.getClass();
        }
        A00 = C63628Sqa.A00(A0J, 53);
        C63406Sjd.A09(c07x, c2gt, A00);
        C58252li A022 = C75M.A02(A0J, new InterfaceC16660sJ() { // from class: X.TWD
            @Override // X.InterfaceC16660sJ
            public final Object invoke(Object obj2) {
                C63345Si1 c63345Si1 = this;
                C1N8 c1n83 = c1n8;
                C2GS c2gs = A0J;
                String str2 = str;
                Object obj3 = obj;
                SE2 se22 = se2;
                C1N8 c1n84 = c1n82;
                C63406Sjd c63406Sjd = (C63406Sjd) obj2;
                if (!C63406Sjd.A0H(c63406Sjd) && !C63406Sjd.A0G(c63406Sjd)) {
                    Object apply = c1n83.apply(C63406Sjd.A08(c63406Sjd));
                    apply.getClass();
                    C2GT c2gt2 = (C2GT) apply;
                    C07X c07x2 = c63345Si1.A01;
                    if (c07x2 == null) {
                        c07x2 = c63345Si1.A02;
                        c07x2.getClass();
                    }
                    C63406Sjd.A09(c07x2, c2gt2, new C63623SqV(c2gs, c1n84, se22, c63345Si1, obj3, str2, 1));
                    return c2gt2;
                }
                return new C2GT(C63406Sjd.A02(c63406Sjd, null));
            }
        });
        A022.A09(new C63615SqN(se2, this, str, 2));
        return A022;
    }

    public final C58252li A04(SE2 se2, Object obj, String str) {
        C63580Spn c63580Spn = C63580Spn.A00;
        C58252li A0I = AbstractC58318PtA.A0I();
        SGB sgb = null;
        A0I.A0A(C63406Sjd.A03(null));
        Bundle bundle = se2.A01;
        String string = bundle.getString("AUTH_METHOD_TYPE");
        java.util.Set set = AuthTicketType.A00;
        if (string != null) {
            string = string.toUpperCase(Locale.US);
        }
        if (set.contains(string) && ("BIO_OR_PIN".equalsIgnoreCase(AbstractC31173DnH.A0j(bundle, "AUTH_METHOD_TYPE")) || "BIO".equalsIgnoreCase(AbstractC31173DnH.A0j(bundle, "AUTH_METHOD_TYPE")))) {
            C2GT c2gt = this.A03.A02;
            C07X c07x = this.A01;
            if (c07x == null) {
                c07x = this.A02;
                c07x.getClass();
            }
            C63406Sjd.A09(c07x, c2gt, new C63623SqV(c63580Spn, A0I, se2, this, obj, str, 2));
            return A0I;
        }
        String string2 = bundle.getString("AUTH_METHOD_TYPE");
        if (string2 != null) {
            string2 = string2.toUpperCase(Locale.US);
        }
        if (set.contains(string2)) {
            A02(new C64189T2y(c63580Spn, A0I, se2, this, obj, str, 1), se2, this);
            return A0I;
        }
        REX rex = se2.A00;
        if (rex == null || !rex.A00.A01.isEmpty()) {
            REX rex2 = (REX) new Gson().A08(bundle.getString("AUTH_EXCEPTION"), REX.class);
            if (rex2 != null) {
                Iterator<SP0> it = rex2.A00.A01.iterator();
                while (it.hasNext()) {
                    Iterator<SPN> it2 = it.next().A00.iterator();
                    while (it2.hasNext()) {
                        if (it2.next().A00.equals("CSC")) {
                            sgb = A05("CSC");
                        }
                    }
                }
            }
            A0I.A0A(C63406Sjd.A05(null, AbstractC166987dD.A18("Not supported auth type")));
            return A0I;
        }
        A00(c63580Spn, A0I, se2, sgb, this, obj, str);
        return A0I;
    }

    public final SGB A05(String str) {
        Object obj;
        C64190T2z c64190T2z = this.A00;
        if (c64190T2z != null) {
            Map map = c64190T2z.A07;
            Iterator A12 = AbstractC43593JPy.A12(map);
            while (true) {
                if (A12.hasNext()) {
                    obj = A12.next();
                    if (C14360o3.A0K(((SPN) obj).A00, str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return (SGB) map.get(obj);
        }
        return null;
    }

    public C63345Si1(C1N8 c1n8, Fragment fragment, FragmentActivity fragmentActivity, SQ1 sq1, C58443PvM c58443PvM) {
        this.A04 = c58443PvM;
        this.A02 = fragmentActivity;
        this.A07 = sq1;
        this.A01 = fragment;
        this.A06 = c1n8;
        C58770Q8c c58770Q8c = (C58770Q8c) C2FP.A03().A00().create(C58770Q8c.class);
        this.A03 = c58770Q8c;
        C2GS c2gs = c58770Q8c.A05;
        C07X c07x = this.A01;
        if (c07x == null) {
            c07x = this.A02;
            c07x.getClass();
        }
        C63627SqZ.A01(c07x, c2gs, C63628Sqa.A00(this, 52), 44);
    }
}
