package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.instagram.common.session.UserSession;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.6cZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ComponentCallbacks2C142736cZ implements ComponentCallbacks2 {
    public static ComponentCallbacks2C142736cZ A09;
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final C13270mD A05;
    public final Queue A06;
    public final Queue A08 = new LinkedList();
    public final Queue A07 = new LinkedList();

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void A00() {
        this.A08.clear();
        this.A07.clear();
        this.A06.clear();
        this.A00 = false;
        this.A01 = false;
        this.A02 = false;
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i >= 20) {
            A00();
        }
    }

    public ComponentCallbacks2C142736cZ(Context context, UserSession userSession) {
        this.A05 = new C13270mD(context, 0);
        C41051vD c41051vD = C41051vD.A01;
        c41051vD.A00 = userSession;
        UserSession A00 = C1341564a.A00(new C1341564a(c41051vD, 0, false));
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A04 = (int) C18U.A01(c06090Tz, A00, 36592245191213435L);
        this.A06 = new LinkedList();
        this.A03 = (int) C18U.A01(c06090Tz, userSession, 36594195104007825L);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        A00();
    }
}
