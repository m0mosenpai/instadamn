package X;

import android.os.Bundle;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.common.session.UserSession;

/* renamed from: X.V4z, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67984V4z extends AbstractC61132qb {
    public final Bundle A00;
    public final UserSession A01;
    public final String A02 = "ig_boost_create_audience_screen";

    public C67984V4z(Bundle bundle) {
        this.A00 = bundle;
        this.A01 = C023409i.A0A.A06(bundle);
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        XIGIGBoostDestination xIGIGBoostDestination;
        Bundle bundle = this.A00;
        String A01 = AbstractC153636vY.A01(bundle, "media_id");
        String string = bundle.getString("audience_id");
        String string2 = bundle.getString("destination");
        if (string2 != null) {
            xIGIGBoostDestination = VPS.A00(AbstractC65702TsY.A0g(string2));
        } else {
            xIGIGBoostDestination = null;
        }
        boolean z = bundle.getBoolean(AbstractC111324zv.A00(2596), false);
        return new UFT(xIGIGBoostDestination, new C68957Vev(), this.A01, A01, string, this.A02, z);
    }
}
