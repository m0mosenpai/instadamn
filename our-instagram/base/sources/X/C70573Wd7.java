package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.Wd7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70573Wd7 implements InterfaceC71973XDg {
    public final /* synthetic */ W28 A00;
    public final /* synthetic */ InterfaceC71973XDg A01;
    public final /* synthetic */ InterfaceC71973XDg A02;

    @Override // X.InterfaceC71973XDg
    public final String BxO() {
        return "link_click_virtual_event:link_click:primary:0";
    }

    @Override // X.InterfaceC71973XDg
    public final long C8S() {
        return this.A02.C8S();
    }

    @Override // X.InterfaceC71973XDg
    public final String getStringForKey(String str) {
        C14360o3.A0B(str, 0);
        if (str.equals(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) {
            return "link_click_virtual_event";
        }
        return this.A01.getStringForKey(str);
    }

    public C70573Wd7(W28 w28, InterfaceC71973XDg interfaceC71973XDg) {
        this.A01 = interfaceC71973XDg;
        this.A00 = w28;
        this.A02 = interfaceC71973XDg;
    }

    @Override // X.InterfaceC71973XDg
    public final String getDisplayName() {
        String str = (String) this.A00.A00.A02.get("link_click_virtual_event:link_click:primary:0");
        if (str == null) {
            return "";
        }
        return str;
    }
}
