package X;

import com.facebook.pando.PandoGraphQLRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes9.dex */
public final class PS1 implements Runnable {
    public final /* synthetic */ C51398Mn5 A00;
    public final /* synthetic */ OLS A01;
    public final /* synthetic */ OJO A02;

    public PS1(C51398Mn5 c51398Mn5, OLS ols, OJO ojo) {
        this.A00 = c51398Mn5;
        this.A01 = ols;
        this.A02 = ojo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        Object obj;
        C51398Mn5 c51398Mn5 = this.A00;
        C47Z c47z = c51398Mn5.A05;
        if (c47z != null) {
            String str = c47z.A3t;
            ArrayList A1E = AbstractC166987dD.A1E();
            ArrayList A1E2 = AbstractC166987dD.A1E();
            OLS ols = this.A01;
            Object obj2 = ols.A00;
            OJO ojo = this.A02;
            if (obj2 instanceof List) {
                Iterator A1J = AbstractC25226BEj.A1J(obj2);
                while (A1J.hasNext()) {
                    Object next = A1J.next();
                    Object obj3 = null;
                    if (next instanceof Map) {
                        map = (Map) next;
                    } else {
                        map = null;
                    }
                    if (map != null) {
                        obj = map.get("language");
                    } else {
                        obj = null;
                    }
                    String valueOf = String.valueOf(obj);
                    if (map != null) {
                        obj3 = map.get("is_lipsync");
                    }
                    boolean A1T = AbstractC167007dF.A1T((Boolean) obj3);
                    A1E2.add(AbstractC25233BEq.A0p("is_lipsync", String.valueOf(A1T), AbstractC166987dD.A1L("language", valueOf)));
                    C2JO c2jo = new C2JO();
                    c2jo.A09(valueOf, "language");
                    c2jo.A08("is_lipsync", Boolean.valueOf(A1T));
                    A1E.add(c2jo);
                }
                OML oml = c51398Mn5.A02;
                if (oml != null) {
                    String iSO3Language = Locale.getDefault().getISO3Language();
                    C14360o3.A07(iSO3Language);
                    C09530e4 A1L = AbstractC166987dD.A1L("input_language", new C51397Mn3(iSO3Language));
                    C73773Sh c73773Sh = AbstractC73763Sg.A03;
                    C3RD c3rd = C3RD.A01;
                    oml.A03(AbstractC25233BEq.A0p("output_languages", new C51397Mn3(c73773Sh.A02(A1E2, new C3SG(new C3RL(c3rd, c3rd)))), A1L));
                }
                C2JO c2jo2 = new C2JO();
                c2jo2.A09(Locale.getDefault().getISO3Language(), "input_language");
                C0CA.A00(c2jo2.A02(), AbstractC25228BEl.A13(str), "upload_id");
                c2jo2.A05("output_languages", A1E);
                C2JM A0b = AbstractC25225BEi.A0b();
                C2JM A0b2 = AbstractC25225BEi.A0b();
                A0b.A00(c2jo2, "data");
                AbstractC40691uc.A01(c51398Mn5.A07).ATV(new C55656Onh(0, ols, ojo), new C55665Onq(0, c51398Mn5, ojo), new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "AutodubCreateQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), QQJ.class, false, null, 0, null, "xdt_autodub_create", AbstractC166987dD.A1E()));
            }
        }
    }
}
