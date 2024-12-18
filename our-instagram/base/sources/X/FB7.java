package X;

import android.os.Bundle;
import java.io.Serializable;

/* loaded from: classes6.dex */
public abstract class FB7 {
    public static final HCZ A00(Bundle bundle) {
        FB6.A00();
        String A01 = AbstractC153636vY.A01(bundle, "IgSessionManager.SESSION_TOKEN_KEY");
        String A012 = AbstractC153636vY.A01(bundle, "prior_module");
        Serializable serializable = bundle.getSerializable("SaveFragment.SAVE_HOME_TAB_MODE", EnumC39551HdN.class);
        AbstractC167017dG.A1O(A01, A012);
        HCZ hcz = new HCZ();
        Bundle A0F = AbstractC31174DnI.A0F("IgSessionManager.SESSION_TOKEN_KEY", A01);
        A0F.putParcelable("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION", null);
        A0F.putString("prior_module", A012);
        if (serializable == null) {
            serializable = EnumC39551HdN.A06;
        }
        A0F.putSerializable("SaveFragment.SAVE_HOME_TAB_MODE", serializable);
        hcz.setArguments(A0F);
        return hcz;
    }
}
