package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;

/* renamed from: X.6mn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148786mn {
    public Runnable A00;
    public boolean A01;
    public final Activity A02;
    public final Context A03;
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final UserSession A05;
    public final C143436di A06;
    public final InterfaceC1118853a A07;

    public C148786mn(Activity activity, Context context, UserSession userSession, InterfaceC1118853a interfaceC1118853a) {
        this.A02 = activity;
        this.A03 = context;
        this.A05 = userSession;
        this.A07 = interfaceC1118853a;
        this.A06 = AbstractC149676oK.A00(userSession);
    }
}
