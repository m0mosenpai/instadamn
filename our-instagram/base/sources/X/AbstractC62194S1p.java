package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.S1p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62194S1p {
    public static final SPK A00(QSA qsa) {
        String obj;
        String obj2;
        C14360o3.A0B(qsa, 0);
        String optionalStringField = qsa.getOptionalStringField(0, "strong_id__");
        if (optionalStringField != null) {
            Enum optionalEnumField = qsa.getOptionalEnumField(2, "auth_ticket_status", EnumC46222Kcy.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            if (optionalEnumField != null && (obj = optionalEnumField.toString()) != null) {
                Enum optionalEnumField2 = qsa.getOptionalEnumField(1, "auth_ticket_type", EnumC61191Rgr.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                if (optionalEnumField2 != null && (obj2 = optionalEnumField2.toString()) != null) {
                    String A0A = qsa.A0A("fingerprint");
                    if (A0A != null) {
                        int coercedIntField = qsa.getCoercedIntField(4, "ttl");
                        String A0C = qsa.A0C("associated_credential_id");
                        ImmutableList A0D = MSX.A0D(qsa, QS9.class, "auth_ticket_capabilities", 6, -1213122889);
                        ArrayList A0q = AbstractC167017dG.A0q(A0D);
                        Iterator<E> it = A0D.iterator();
                        while (it.hasNext()) {
                            C2JS A0l = AbstractC25225BEi.A0l(it);
                            String optionalStringField2 = A0l.getOptionalStringField(0, "cap_name");
                            if (optionalStringField2 != null) {
                                A0q.add(new C62737SOd(optionalStringField2, A0l.getCoercedIntField(1, "ttl")));
                            } else {
                                throw AbstractC166987dD.A14("capability null , expected nonnull");
                            }
                        }
                        return new SPK(optionalStringField, obj, obj2, A0A, A0q, coercedIntField, A0C);
                    }
                    throw AbstractC166987dD.A14("finger print is null expected non null");
                }
                throw AbstractC166987dD.A14("authTicketType is null expected non null");
            }
            throw AbstractC166987dD.A14("status is null expected not null");
        }
        throw AbstractC166987dD.A14("id is null");
    }
}
