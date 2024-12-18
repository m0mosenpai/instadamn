package X;

import com.facebookpay.logging.ClientSuppressionPolicy;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.logging.LoggingPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;

/* renamed from: X.Sbg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63059Sbg {
    /* JADX WARN: Type inference failed for: r3v1, types: [X.Jtm, X.0Zx] */
    public static final C44872Jtm A00(LoggingContext loggingContext) {
        LoggingPolicy loggingPolicy = loggingContext.A01;
        if (loggingPolicy != null) {
            ?? c0Zx = new C0Zx();
            ArrayList arrayList = loggingPolicy.A01;
            ArrayList A0q = AbstractC167017dG.A0q(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ClientSuppressionPolicy clientSuppressionPolicy = (ClientSuppressionPolicy) it.next();
                C0Zx c0Zx2 = new C0Zx();
                String name = clientSuppressionPolicy.A00.name();
                Locale locale = Locale.US;
                C14360o3.A08(locale);
                c0Zx2.A01(RiG.valueOf(AbstractC166997dE.A10(locale, name)), "suppression_mode");
                String str = clientSuppressionPolicy.A02;
                if (str != null) {
                    c0Zx2.A06("event_name", str);
                }
                EnumC72401Xco enumC72401Xco = clientSuppressionPolicy.A01;
                if (enumC72401Xco != null) {
                    c0Zx2.A01(EnumC72426XdW.valueOf(AbstractC166997dE.A10(locale, enumC72401Xco.name())), "payload_field");
                }
                A0q.add(c0Zx2);
            }
            c0Zx.A07("client_suppression_policy", A0q);
            c0Zx.A06("logging_policy_product", loggingPolicy.A00);
            return c0Zx;
        }
        return null;
    }

    public static final LinkedHashSet A01(LoggingPolicy loggingPolicy) {
        String str;
        LinkedHashSet A0l = AbstractC31171DnF.A0l();
        Iterator it = loggingPolicy.A01.iterator();
        while (it.hasNext()) {
            ClientSuppressionPolicy clientSuppressionPolicy = (ClientSuppressionPolicy) it.next();
            if (clientSuppressionPolicy.A00 == EnumC61210RhA.EVENT && (str = clientSuppressionPolicy.A02) != null) {
                A0l.add(str);
            }
        }
        return A0l;
    }

    public static final LinkedHashSet A02(LoggingPolicy loggingPolicy) {
        EnumC72401Xco enumC72401Xco;
        String str;
        LinkedHashSet A0l = AbstractC31171DnF.A0l();
        Iterator it = loggingPolicy.A01.iterator();
        while (it.hasNext()) {
            ClientSuppressionPolicy clientSuppressionPolicy = (ClientSuppressionPolicy) it.next();
            if (clientSuppressionPolicy.A00 == EnumC61210RhA.PAYLOAD_FIELD && (enumC72401Xco = clientSuppressionPolicy.A01) != null) {
                int ordinal = enumC72401Xco.ordinal();
                if (ordinal != 314 && ordinal != 1438 && ordinal != 283) {
                    str = enumC72401Xco.name();
                } else {
                    str = "component_data_id";
                }
                A0l.add(str);
            }
        }
        return A0l;
    }
}
