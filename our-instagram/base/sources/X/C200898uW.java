package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.HashMap;

/* renamed from: X.8uW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200898uW implements InterfaceC200868uT {
    public String A00;
    public final AbstractC12990ll A01;
    public final QuickPerformanceLogger A02 = C006802i.A0p;

    @Override // X.InterfaceC200868uT
    public final void CuT(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(DevServerEntity.COLUMN_DESCRIPTION, String.format(DevServerEntity.COLUMN_DESCRIPTION, str));
        Long l = null;
        try {
            String str2 = this.A00;
            if (str2 != null) {
                l = Long.valueOf(Long.parseLong(str2));
            }
        } catch (NumberFormatException unused) {
        }
        C18920wW A02 = AbstractC12220kQ.A02(this.A01);
        InterfaceC02590Ai A00 = A02.A00(A02.A00, "fx_sso_library");
        A00.AAP("fx_sso_library_event", "auth_token_fetch_failure");
        A00.AAP("fx_sso_library_failure_reason", null);
        A00.A9K(AbstractC111324zv.A00(4664), l);
        A00.A8R(null, AbstractC43591JPw.A00(1083));
        A00.AAP("version_id", "1.0");
        A00.A9M("debug_test_data", hashMap);
        A00.Cht();
    }

    @Override // X.InterfaceC200868uT
    public final void Dno(AbstractC200848uR abstractC200848uR) {
        this.A02.markerPoint(857814189, "CONTENT_PROVIDER_RESOLVED");
    }

    public C200898uW(AbstractC12990ll abstractC12990ll, String str) {
        this.A01 = abstractC12990ll;
        this.A00 = str;
    }
}
