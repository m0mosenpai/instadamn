package X;

import com.instagram.api.schemas.BudgetRecommendationType;
import java.util.List;

/* loaded from: classes7.dex */
public final class H2T extends C0T6 implements JIR {
    public final BudgetRecommendationType A00;
    public final XFQ A01;
    public final List A02;
    public final JIW A03;
    public final InterfaceC43464JIc A04;

    public H2T(BudgetRecommendationType budgetRecommendationType, JIW jiw, InterfaceC43464JIc interfaceC43464JIc, XFQ xfq, List list) {
        C14360o3.A0B(budgetRecommendationType, 4);
        this.A03 = jiw;
        this.A02 = list;
        this.A04 = interfaceC43464JIc;
        this.A00 = budgetRecommendationType;
        this.A01 = xfq;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H2T) {
                H2T h2t = (H2T) obj;
                if (!C14360o3.A0K(this.A03, h2t.A03) || !C14360o3.A0K(this.A02, h2t.A02) || !C14360o3.A0K(this.A04, h2t.A04) || this.A00 != h2t.A00 || !C14360o3.A0K(this.A01, h2t.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A00, ((((AbstractC167017dG.A0M(this.A03) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC166997dE.A0I(this.A01);
    }
}
