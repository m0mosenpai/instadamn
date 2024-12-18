package X;

/* renamed from: X.Spe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63571Spe implements C1N8 {
    public static final C63571Spe A00 = new C63571Spe();

    @Override // X.C1N8
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        R1N r1n;
        R0N A0E;
        C2JS reinterpretIfFulfillsType;
        int i;
        if ((obj instanceof R1N) && (r1n = (R1N) obj) != null && (A0E = r1n.A0E()) != null) {
            if (A0E.A0E() != null) {
                reinterpretIfFulfillsType = A0E.A0E();
                if (reinterpretIfFulfillsType == null) {
                    return null;
                }
                i = 2;
            } else if (A0E.reinterpretIfFulfillsType(3, "PAYPaymentPaypalBillingAgreement", QWM.class, -1188209066) != null) {
                reinterpretIfFulfillsType = A0E.reinterpretIfFulfillsType(3, "PAYPaymentPaypalBillingAgreement", QWM.class, -1188209066);
                if (reinterpretIfFulfillsType == null) {
                    return null;
                }
                i = 0;
            }
            String optionalStringField = reinterpretIfFulfillsType.getOptionalStringField(i, "credential_id");
            if (optionalStringField == null) {
                return null;
            }
            return AbstractC25228BEl.A13(optionalStringField);
        }
        throw AbstractC43592JPx.A11();
    }
}
