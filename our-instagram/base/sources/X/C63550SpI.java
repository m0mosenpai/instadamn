package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.SpI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63550SpI implements C1N8 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public C63550SpI(C62962SZf c62962SZf, SXG sxg, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = c62962SZf;
        if (i != 0) {
            this.A04 = str;
            this.A03 = str2;
        } else {
            this.A03 = str;
            this.A04 = str2;
        }
        this.A02 = sxg;
    }

    @Override // X.C1N8
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        int i = this.A00;
        C3AY c3ay = (C3AY) obj;
        C62962SZf c62962SZf = (C62962SZf) this.A01;
        if (i != 0) {
            C62566SGr c62566SGr = c62962SZf.A02;
            C62731SNv c62731SNv = (C62731SNv) c3ay.A01;
            String str = this.A04;
            Object obj2 = c3ay.A00;
            obj2.getClass();
            String str2 = (String) obj2;
            String str3 = this.A03;
            Map unmodifiableMap = Collections.unmodifiableMap(((SXG) this.A02).A08);
            UserSession userSession = c62566SGr.A00;
            if (userSession != null) {
                String str4 = userSession.userId;
                try {
                    C64042SyE c64042SyE = (C64042SyE) AbstractC25234BEr.A0d(SRC.class);
                    Be9 be9 = new Be9();
                    be9.A07(AbstractC166997dE.A0o(), "client_mutation_id");
                    be9.A07(str4, "actor_id");
                    be9.A07(str2, "platform_trust_token");
                    be9.A07(str3, "authentication_ticket_id");
                    be9.A07(str, "payment_type");
                    be9.A07(AbstractC58442PvL.A06(unmodifiableMap), "logging_id");
                    AbstractC58318PtA.A1K(be9, c64042SyE.A00);
                    c64042SyE.A01 = true;
                    C60622REh A00 = C60622REh.A00(c62731SNv, C58443PvM.A00(), c64042SyE.build(), new C58605PyY(16));
                    C14360o3.A0A(A00);
                    return A00;
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    throw AbstractC58318PtA.A0f(e);
                }
            }
            throw AbstractC166987dD.A18("No user session found");
        }
        C62566SGr c62566SGr2 = c62962SZf.A02;
        C62731SNv c62731SNv2 = (C62731SNv) c3ay.A01;
        Object obj3 = c3ay.A00;
        obj3.getClass();
        String str5 = this.A03;
        String str6 = this.A04;
        Collections.unmodifiableMap(((SXG) this.A02).A08);
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        Be9 be92 = new Be9();
        be92.A07(AbstractC166997dE.A0n(), "client_mutation_id");
        C2JO c2jo = new C2JO();
        c2jo.A09(str6, "sensitive_string_value");
        be92.A06(c2jo, "new_pin");
        C2JO c2jo2 = new C2JO();
        c2jo2.A09(str5, "sensitive_string_value");
        be92.A06(c2jo2, "password");
        be92.A07((String) obj3, "platform_trust_token");
        A0b.A00(be92, "input");
        return C60622REh.A00(c62731SNv2, c62566SGr2.A01, new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "IGResetPINWithPasswordMutation", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59534Qh8.class, true, null, 8, "input", "payment_pin_update", AbstractC166987dD.A1E()), C64279T7l.A00);
    }
}
