package X;

import com.instagram.business.fragment.SupportServicePartnerSelectionFragment;
import java.util.List;

/* loaded from: classes6.dex */
public final class EQ3 extends C2US {
    public List A00;
    public final EQW A01;
    public final SupportServicePartnerSelectionFragment A02;

    public EQ3(SupportServicePartnerSelectionFragment supportServicePartnerSelectionFragment) {
        super(false);
        this.A02 = supportServicePartnerSelectionFragment;
        EQW eqw = new EQW(this);
        this.A01 = eqw;
        this.A00 = AbstractC166987dD.A1E();
        AbstractC31173DnH.A1R(this, eqw);
    }

    @Override // X.C2UT, android.widget.Adapter
    public final boolean isEmpty() {
        List list = this.A00;
        if (list != null && !list.isEmpty()) {
            return false;
        }
        return true;
    }
}
