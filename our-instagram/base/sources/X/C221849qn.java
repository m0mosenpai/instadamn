package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.9qn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221849qn extends JXK {
    public C5TA A00;
    public final Context A01;
    public final UserSession A02;
    public final A6K A03;

    @Override // X.JXK, X.C6C3
    public final void onProgressUpdate(int i, int i2, boolean z) {
        this.A03.A00.A08.Egh(new AiB(i, i2, 0));
    }

    public C221849qn(Context context, UserSession userSession, A6K a6k) {
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = a6k;
    }
}
