package X;

import android.app.Activity;

/* renamed from: X.Tab, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C64956Tab extends C03E implements InterfaceC16660sJ {
    public static final C64956Tab A00 = new C64956Tab();

    public C64956Tab() {
        super(1, S2L.class, "getClient", "getClient(Landroid/app/Activity;)Lcom/google/android/gms/auth/api/credentials/CredentialsClient;", 0);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.61b] */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Activity activity = (Activity) obj;
        C14360o3.A0B(activity, 0);
        return new C61Q(activity, C60648RFz.A00, SA2.A04, (InterfaceC1335661b) new Object());
    }
}
