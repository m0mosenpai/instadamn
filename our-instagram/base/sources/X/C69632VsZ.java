package X;

import android.content.Context;
import com.facebook.locationsharing.core.models.Location;
import com.instagram.common.session.UserSession;
import java.util.HashSet;

/* renamed from: X.VsZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69632VsZ {
    public boolean A00;
    public boolean A01;
    public final Context A02;
    public final UserSession A03;
    public final C62929SXl A04;
    public final java.util.Set A05;
    public final TFA A06;

    public final Location A00() {
        android.location.Location A00 = this.A06.A00(AnonymousClass001.A0R("DirectLocationFacade:", "LocationSharingPresenter"));
        if (A00 == null) {
            return null;
        }
        return new Location(new HashSet(), A00.getLatitude(), A00.getLongitude(), -1, Integer.MIN_VALUE, -1L);
    }

    public C69632VsZ(Context context, UserSession userSession) {
        AbstractC167017dG.A1P(context, userSession);
        this.A05 = new HashSet();
        this.A02 = context;
        this.A03 = userSession;
        this.A06 = new TFA(context, userSession);
        this.A04 = new C62929SXl();
    }
}
