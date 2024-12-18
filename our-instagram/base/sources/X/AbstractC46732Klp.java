package X;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import com.instagram.common.session.UserSession;

/* renamed from: X.Klp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46732Klp {
    public static final LAF A00(Context context, UserSession userSession, Integer num) {
        AbstractC167027dH.A12(userSession, context, num);
        C1336661v c1336661v = new C1336661v(C61O.A00(context));
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.A00;
        C14360o3.A07(googleApiAvailability);
        JSW jsw = new JSW(googleApiAvailability);
        C006802i c006802i = C006802i.A0p;
        KPR kpr = new KPR(c006802i, C6CE.A00(userSession), AbstractC43592JPx.A0m(userSession, c006802i));
        return new LAF(context, c1336661v, jsw, AbstractC47843LBl.A00(userSession, "BlockStoreBackupRepository"), userSession, AbstractC46737Klu.A00(userSession), kpr, num);
    }
}
