package X;

import com.facebook.falco.fabric.FFSingletonJNILogger;

/* renamed from: X.4we, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109524we implements InterfaceC109534wf {
    public static C109524we A00;
    public static final C109544wg A02 = new Object();
    public static C109554wh A01 = new C109554wh(false, 1);

    @Override // X.InterfaceC109534wf
    public final void Chy(String str, String str2, String str3, InterfaceC16820sZ interfaceC16820sZ, long j, boolean z) {
        String str4;
        int i;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(str3, 2);
        String fFDBToken = FFSingletonJNILogger.getFFDBToken();
        C14360o3.A07(fFDBToken);
        boolean z2 = true;
        if (fFDBToken.length() <= 0) {
            z2 = false;
            C109554wh c109554wh = A01;
            if (c109554wh.A01 && ((i = c109554wh.A00) == 0 || AbstractC50712Us.A01.A05(i) != 0)) {
                return;
            }
        }
        if (interfaceC16820sZ != null && z2) {
            str4 = (String) interfaceC16820sZ.invoke();
        } else {
            str4 = "";
        }
        FFSingletonJNILogger.bumpHealthCountersWithDebugInfo(FFSingletonJNILogger.createIdentitiesWithFacebookUser("test_device_id", "test_family_device_id", "", 0L, "1.0.0", "test_bundle_id", "test_session_id", 0, 0L, null, 0L, 0L), str, str2, str3, str4, 1L);
    }

    @Override // X.InterfaceC109534wf
    public final void Ci2(long j, String str, String str2, String str3, boolean z) {
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(str3, 2);
        Chy(str, str2, str3, null, 1L, true);
    }
}
