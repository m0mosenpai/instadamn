package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes5.dex */
public abstract class CAY {
    public C3OO A00(ViewGroup viewGroup) {
        if (this instanceof C27176Byl) {
            return new C25931BdY(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.value_props_list_item, false));
        }
        if (this instanceof C27175Byk) {
            return new C25935Bdc(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.value_props_product_specific_section, false));
        }
        if (this instanceof C27174Byj) {
            LayoutInflater A0P = AbstractC25228BEl.A0P(viewGroup);
            int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
            return new C25927BdU(AbstractC25226BEj.A0R(A0P, viewGroup, R.layout.value_props_page_header, false));
        }
        if (this instanceof C27173Byi) {
            return new C25926BdT(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.value_props_eligibility_criteria_section, false));
        }
        boolean z = this instanceof C27172Byh;
        LayoutInflater A0O = AbstractC25231BEo.A0O(viewGroup);
        if (z) {
            return new C25925BdS(AbstractC25226BEj.A0R(A0O, viewGroup, R.layout.value_props_criteria_list_item, false));
        }
        return new C25920BdN(AbstractC25226BEj.A0R(A0O, viewGroup, R.layout.value_props_error_row, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019c A[LOOP:0: B:59:0x0196->B:61:0x019c, LOOP_END] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A01(X.C3OO r9, X.InterfaceC11380iw r10, com.instagram.common.session.UserSession r11, java.util.List r12, int r13) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CAY.A01(X.3OO, X.0iw, com.instagram.common.session.UserSession, java.util.List, int):void");
    }
}
