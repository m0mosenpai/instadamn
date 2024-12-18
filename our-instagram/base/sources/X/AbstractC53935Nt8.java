package X;

/* renamed from: X.Nt8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53935Nt8 {
    public static final void A00(OJY ojy, InterfaceC173987oq interfaceC173987oq, C47Z c47z, boolean z) {
        String id;
        boolean A1b = AbstractC43593JPy.A1b(ojy);
        if (z && interfaceC173987oq != null && (id = interfaceC173987oq.getId()) != null && id.length() != 0 && ojy.A01 == C05F.A00) {
            c47z.A5t = true;
            c47z.A3c = interfaceC173987oq.getId();
            if (ojy.A05) {
                c47z.A4d = AbstractC166987dD.A1J("AUTO_CROSSPOST_SETTING");
            }
        } else {
            c47z.A5t = A1b;
            c47z.A3c = null;
            c47z.A4d = null;
            if (interfaceC173987oq == null) {
                return;
            }
        }
        interfaceC173987oq.getId();
    }
}
