package X;

import com.google.common.collect.ImmutableList;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class AY1 implements InterfaceC48192Ji {
    public final /* synthetic */ C8Y5 A00;
    public final /* synthetic */ InterfaceC16660sJ A01;

    public AY1(C8Y5 c8y5, InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = interfaceC16660sJ;
        this.A00 = c8y5;
    }

    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        C2JS c2js;
        C2JS optionalTreeField;
        C2JS c2js2;
        String A09;
        if (anonymousClass436 != null && (c2js = (C2JS) anonymousClass436.Bos()) != null && (optionalTreeField = c2js.getOptionalTreeField(0, "validate_ig_story_interactive_elements_for_ads_eligibility(input:$input)", C212869c9.class, 1824841834)) != null && !optionalTreeField.getCoercedBooleanField(0, "is_eligible")) {
            ImmutableList requiredCompactedTreeListField = optionalTreeField.getRequiredCompactedTreeListField(1, "error_data", C59108QXo.class, -1947349466);
            C14360o3.A07(requiredCompactedTreeListField);
            if (AbstractC166987dD.A1b(requiredCompactedTreeListField) && (c2js2 = (C2JS) AbstractC001800i.A0O(requiredCompactedTreeListField, 0)) != null && (A09 = c2js2.A09(AbstractC58317Pt9.A00(98))) != null) {
                InterfaceC16660sJ interfaceC16660sJ = this.A01;
                C8Y5 c8y5 = this.A00;
                interfaceC16660sJ.invoke(A09);
                C22C A01 = AnonymousClass229.A01(c8y5.A04);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(((C22F) A01).A01, AbstractC111324zv.A00(991));
                if (A01.A0P() && A0f.isSampled()) {
                    AbstractC167007dF.A10(A0f, A01);
                    C22M c22m = ((C22F) A01).A04;
                    AbstractC166987dD.A1S(A0f, c22m.A0L);
                    AbstractC166997dE.A1N(A0f, "entity_type", 32);
                    AbstractC167017dG.A1B(A0f);
                    A0f.A8R(EnumC50631MWs.A0I, "surface");
                    A0f.AAP("composition_str_id", c22m.A0M);
                    A0f.A8R(c22m.A0A, "composition_media_type");
                    A0f.AAk(AbstractC111324zv.A00(774), Arrays.asList(EnumC172737mj.ADS_MODE_STICKER));
                    AbstractC167017dG.A1C(A0f);
                }
            }
        }
    }
}
