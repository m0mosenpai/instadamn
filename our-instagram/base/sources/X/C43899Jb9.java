package X;

import android.content.Context;
import android.location.Location;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Jb9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43899Jb9 {
    public Location A00;
    public final long A01;
    public final Context A02;
    public final C43898Jb8 A03;

    public C43899Jb9(Context context, UserSession userSession) {
        this.A02 = context;
        C43898Jb8 c43898Jb8 = new C43898Jb8(userSession);
        this.A03 = c43898Jb8;
        this.A01 = TimeUnit.DAYS.toMillis(10L);
        if (c43898Jb8.A00() != null) {
            Location location = new Location((String) null);
            location.setLatitude(AbstractC166987dD.A09(r3.A00));
            location.setLongitude(AbstractC166987dD.A09(r3.A01));
            this.A00 = location;
        }
    }
}
