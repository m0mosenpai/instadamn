package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* renamed from: X.Sxh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64010Sxh implements InterfaceC48192Ji {
    public final /* synthetic */ LG2 A00;

    public C64010Sxh(LG2 lg2) {
        this.A00 = lg2;
    }

    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        C2JS optionalTreeField;
        String A09;
        String A08;
        C14360o3.A0B(anonymousClass436, 0);
        LG2 lg2 = this.A00;
        ArrayList A1E = AbstractC166987dD.A1E();
        C2JS A0k = AbstractC25225BEi.A0k(anonymousClass436);
        if (A0k != null && (optionalTreeField = A0k.getOptionalTreeField(0, "xig_igd_business_ml_sayt_list_query", QmF.class, 1342940809)) != null) {
            ImmutableList requiredCompactedTreeListField = optionalTreeField.getRequiredCompactedTreeListField(0, "bussiness_sayt_list", QmE.class, 484607813);
            if (requiredCompactedTreeListField != null) {
                int size = requiredCompactedTreeListField.size();
                for (int i = 0; i < size; i++) {
                    C2JS A0N = MSW.A0N(requiredCompactedTreeListField, i);
                    Integer num = C05F.A0C;
                    if (A0N != null && (A09 = A0N.A09("text")) != null && (A08 = A0N.A08(DialogModule.KEY_TITLE)) != null) {
                        A1E.add(new C45038JwT(num, A09, A08, 0.0d, A0N.getCoercedIntField(4, "frequency")));
                    }
                }
            }
        }
        lg2.A00(A1E);
    }
}
