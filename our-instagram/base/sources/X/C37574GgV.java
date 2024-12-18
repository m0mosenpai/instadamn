package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.GgV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37574GgV {
    public boolean A00;
    public final C37573GgU A01;
    public final C37560GgG A02;
    public final C37556GgC A03;
    public final Context A04;
    public final UserSession A05;

    public C37574GgV(Context context, UserSession userSession, C37573GgU c37573GgU, C37560GgG c37560GgG, C37556GgC c37556GgC) {
        AbstractC167007dF.A1G(c37560GgG, 3, userSession);
        this.A04 = context;
        this.A03 = c37556GgC;
        this.A02 = c37560GgG;
        this.A01 = c37573GgU;
        this.A05 = userSession;
        c37560GgG.A05 = new C43203J8a(this, 13);
    }
}
