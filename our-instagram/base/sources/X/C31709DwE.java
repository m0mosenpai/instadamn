package X;

import androidx.fragment.app.Fragment;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;

/* renamed from: X.DwE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31709DwE implements InterfaceC65576TnA {
    public final /* synthetic */ C83753oK A00;
    public final /* synthetic */ C6FQ A01;
    public final /* synthetic */ InterfaceC103384lE A02;
    public final /* synthetic */ C07270a1 A03;

    public C31709DwE(C83753oK c83753oK, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, C07270a1 c07270a1) {
        this.A03 = c07270a1;
        this.A02 = interfaceC103384lE;
        this.A01 = c6fq;
        this.A00 = c83753oK;
    }

    private final void A00(InterfaceC37129GXq interfaceC37129GXq, String str) {
        String str2;
        String str3;
        String str4;
        String password;
        W4M w4m = new W4M(this.A03);
        C6FX A0s = AbstractC25225BEi.A0s();
        A0s.A01("success");
        A0s.A02(str);
        android.net.Uri uri = null;
        InterfaceC37174GZl BFY = interfaceC37129GXq.BFY();
        if (BFY != null) {
            str2 = BFY.getUsername();
        } else {
            str2 = null;
        }
        A0s.A03(str2, 2);
        if (BFY != null && (password = BFY.getPassword()) != null) {
            str3 = w4m.A00(password);
        } else {
            str3 = null;
        }
        A0s.A03(str3, 3);
        if (BFY != null) {
            str4 = BFY.getUsername();
        } else {
            str4 = null;
        }
        A0s.A03(str4, 4);
        if (BFY != null) {
            uri = BFY.Bht();
        }
        A0s.A03(uri, 5);
        C6FW A00 = A0s.A00();
        AbstractC31710DwF.A01 = "";
        C131845xK.A00(this.A01, A00, this.A02);
    }

    private final void A01(String str, String str2) {
        if (!C14360o3.A0K(str2, "dialog_dismissed") && !C14360o3.A0K(str2, "no_account_selected") && str != null) {
            C83753oK.A00(this.A03, C05F.A00, "login_smartlock_fetch_failed", "login_smart_lock", "smartlock", null, str, null);
        }
        C6FX A0s = AbstractC25225BEi.A0s();
        if (str2 == null) {
            str2 = OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE;
        }
        A0s.A01(str2);
        A0s.A02(null);
        A0s.A03(null, 2);
        A0s.A03(null, 3);
        A0s.A03(null, 4);
        A0s.A03(null, 5);
        C131845xK.A00(this.A01, A0s.A00(), this.A02);
    }

    @Override // X.InterfaceC65576TnA
    public final void CK3(Fragment fragment, InterfaceC60602pj interfaceC60602pj, C07270a1 c07270a1, InterfaceC37129GXq interfaceC37129GXq, EnumC31713DwI enumC31713DwI) {
        InterfaceC37174GZl BFY;
        if (interfaceC37129GXq != null && (BFY = interfaceC37129GXq.BFY()) != null && BFY.getUsername() != null && BFY.getPassword() != null) {
            A00(interfaceC37129GXq, "multiple");
        } else {
            A01(null, null);
        }
    }

    @Override // X.InterfaceC65576TnA
    public final void CKN(Fragment fragment, InterfaceC60602pj interfaceC60602pj, C07270a1 c07270a1, InterfaceC37129GXq interfaceC37129GXq, EnumC31713DwI enumC31713DwI) {
        InterfaceC37174GZl BFY;
        if (interfaceC37129GXq != null && (BFY = interfaceC37129GXq.BFY()) != null && BFY.getUsername() != null && BFY.getPassword() != null) {
            A00(interfaceC37129GXq, "single");
        } else {
            A01(null, null);
        }
    }

    @Override // X.InterfaceC65576TnA
    public final void CKO(String str) {
        A01(str, OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE);
    }

    @Override // X.InterfaceC65576TnA
    public final void Cq0() {
        A01("dialog_dismissed", null);
    }

    @Override // X.InterfaceC65576TnA
    public final void Csz() {
        A01("no_account_selected", null);
    }
}
