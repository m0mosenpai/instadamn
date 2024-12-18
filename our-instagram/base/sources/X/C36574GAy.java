package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;

/* renamed from: X.GAy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36574GAy implements InterfaceC37177GZo {
    public final C6FG A00;
    public final C6FQ A01;
    public final InterfaceC103384lE A02;

    public C36574GAy(C6FG c6fg, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE) {
        C14360o3.A0B(c6fg, 1);
        this.A00 = c6fg;
        this.A01 = c6fq;
        this.A02 = interfaceC103384lE;
    }

    @Override // X.InterfaceC37177GZo
    public final void Dhx(String str) {
        C14360o3.A0B(str, 0);
        InterfaceC103384lE interfaceC103384lE = this.A02;
        C131845xK.A00(this.A01, new C6FW(AbstractC16960so.A1Q(str, "success", this.A00)), interfaceC103384lE);
    }

    @Override // X.InterfaceC37177GZo
    public final void Dhy(String str, boolean z) {
        C14360o3.A0B(str, 0);
        InterfaceC103384lE interfaceC103384lE = this.A02;
        C131845xK.A00(this.A01, new C6FW(AbstractC16960so.A1Q(str, "success", this.A00, Boolean.valueOf(z))), interfaceC103384lE);
    }

    @Override // X.InterfaceC37177GZo
    public final void Dhz(String str) {
        String str2 = PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
        if (!PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT.equals(str)) {
            str2 = OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE;
        }
        InterfaceC103384lE interfaceC103384lE = this.A02;
        C131845xK.A00(this.A01, new C6FW(AbstractC16960so.A1Q(null, str2, this.A00)), interfaceC103384lE);
    }
}
