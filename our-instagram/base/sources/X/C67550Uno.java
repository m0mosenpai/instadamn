package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.Uno, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67550Uno extends C2JS implements C2JT {
    public final UWi A0E() {
        return (UWi) A04(UWi.class, "checkout_screen_config", -739000491);
    }

    public final UWk A0F() {
        return (UWk) getOptionalTreeField(4, "ecp_availability", UWk.class, 504900842);
    }

    public final UWp A0G() {
        return (UWp) getOptionalTreeField(5, "logging_policy", UWp.class, 1525441127);
    }

    public final UWq A0H() {
        return (UWq) getOptionalTreeField(3, "payment_config", UWq.class, 710650394);
    }

    public final C67520UnK A0I() {
        return (C67520UnK) A02(C67520UnK.class, "receiver_info", -1133005152);
    }

    public final UWr A0J() {
        return (UWr) getOptionalTreeField(7, "transaction_info", UWr.class, -108555816);
    }

    public final ImmutableList A0K() {
        return getRequiredCompactedTreeListField(11, "ecp_custom_fields", UWl.class, 516679119);
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return new C4OU(new C4OM[]{new C4OW(C94754Oe.A00, "order_id"), new C4OK(C67520UnK.class, "receiver_info", -1133005152), new C4OK(UWi.class, "checkout_screen_config", -739000491), new C4OK(UWq.class, "payment_config", 710650394), new C4OK(UWk.class, "ecp_availability", 504900842), new C4OK(UWp.class, "logging_policy", 1525441127), new C4OK(UWj.class, "confirmation_section", 1314008345), new C4OK(UWr.class, "transaction_info", -108555816), new C4OK(UWo.class, "link_availability", 2014570284), new C4OK(C58934QQw.class, "error", -910544720), new C4OK(UWn.class, "embedded_bloks_apm_buttons", -803301311), new C4OK(C4OO.A02(), UWl.class, "ecp_custom_fields", 516679119)});
    }

    public C67550Uno(int i) {
        super(i);
    }

    public C67550Uno() {
        super(287106875);
    }
}
