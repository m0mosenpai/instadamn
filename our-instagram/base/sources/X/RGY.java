package X;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* loaded from: classes10.dex */
public final class RGY extends C61Q {
    public static final C61U A01;
    public static final C61S A02;
    public static final C61W A03;
    public static final C62679SLs A04;
    public final Context A00;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.61U, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.61S] */
    static {
        ?? obj = new Object();
        A02 = obj;
        ?? obj2 = new Object();
        A01 = obj2;
        A03 = new C61W(obj2, obj, "GoogleAuthService.API");
        A04 = new C62679SLs("Auth", "GoogleAuthServiceClient");
    }

    public RGY(Context context) {
        super(context, C61X.A00, A03, C61Z.A02);
        this.A00 = context;
    }

    public static /* bridge */ /* synthetic */ void A02(Status status, C58411Pup c58411Pup, Object obj) {
        boolean A022;
        if (status.A00 <= 0) {
            A022 = c58411Pup.A00.A0G(obj);
        } else {
            A022 = c58411Pup.A02(S2O.A00(status));
        }
        if (!A022) {
            A04.A00("The task is already complete.", AbstractC58318PtA.A1b());
        }
    }
}
