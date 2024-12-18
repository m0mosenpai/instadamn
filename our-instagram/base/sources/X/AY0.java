package X;

import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class AY0 implements InterfaceC48192Ji {
    public final /* synthetic */ C150746qX A00;
    public final /* synthetic */ java.util.Set A01;

    public AY0(C150746qX c150746qX, java.util.Set set) {
        this.A00 = c150746qX;
        this.A01 = set;
    }

    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        ImmutableList immutableList;
        C0Gd c0Gd;
        Integer num;
        String str;
        C2JS c2js;
        if (anonymousClass436 != null && (c2js = (C2JS) anonymousClass436.Bos()) != null) {
            immutableList = c2js.A06(C212709bt.class, "fetch_ar_effects(effect_ids:$effect_ids)", -1006305489);
        } else {
            immutableList = null;
        }
        if (immutableList == null) {
            c0Gd = this.A00.A02;
            num = C05F.A00;
            str = "ArEffectsFlmCapabilityQueryResponse.FetchArEffects is null.";
        } else {
            int size = immutableList.size();
            java.util.Set set = this.A01;
            if (size != set.size()) {
                this.A00.A02.EHD("ArDelivery", C05F.A00, AnonymousClass001.A02(set.size(), immutableList.size(), "# of effects in request = ", " is different from response's fetchArEffects.size = "));
            }
            C150746qX c150746qX = this.A00;
            Iterator<E> it = immutableList.iterator();
            while (it.hasNext()) {
                C2JS optionalTreeField = ((C2JS) it.next()).getOptionalTreeField(0, "effect", C212699bs.class, -495064920);
                if (optionalTreeField == null) {
                    c0Gd = c150746qX.A02;
                    num = C05F.A00;
                    str = "ArEffectsFlmCapabilityQueryResponse.FetchArEffects.Effect is null.";
                } else {
                    String optionalStringField = optionalTreeField.getOptionalStringField(0, "strong_id__");
                    if (optionalStringField == null) {
                        c0Gd = c150746qX.A02;
                        num = C05F.A00;
                        str = "ArEffectsFlmCapabilityQueryResponse.FetchArEffects.Effect has no id.";
                    } else {
                        optionalTreeField.getCoercedBooleanField(1, "uses_flm_capability");
                        if (optionalTreeField.getCoercedBooleanField(1, "uses_flm_capability")) {
                            c150746qX.A00.remove(optionalStringField);
                        }
                    }
                }
            }
            InterfaceC19610xo ARD = c150746qX.A01.A00.ARD();
            ARD.E77("flmEffectsDeleted", true);
            ARD.apply();
            return;
        }
        c0Gd.EHD("ArDelivery", num, str);
    }
}
