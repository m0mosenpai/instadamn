package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes9.dex */
public final class P47 implements InterfaceC65530Tm0 {
    public final /* synthetic */ C54796OJo A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public P47(C54796OJo c54796OJo, String str, boolean z) {
        this.A02 = z;
        this.A01 = str;
        this.A00 = c54796OJo;
    }

    @Override // X.InterfaceC65530Tm0
    public final void DqB(Integer num) {
        String str;
        if (this.A02) {
            str = "ENABLED_AUTOFILL";
        } else {
            str = "DISABLED_AUTOFILL";
        }
        String str2 = "CONTACT_AUTOFILL";
        if (!C14360o3.A0K(this.A01, "CONTACT_AUTOFILL")) {
            str2 = AbstractC58317Pt9.A00(15);
        }
        SZ2 sz2 = this.A00.A03;
        if (sz2.A04) {
            C25531Mh A06 = C25531Mh.A06(sz2.A00);
            if (AbstractC25226BEj.A1Z(A06)) {
                A06.A0j(str2);
                A06.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
                A06.Cht();
            }
        }
    }

    @Override // X.InterfaceC65530Tm0
    public final void onFailure(Throwable th) {
        C54796OJo c54796OJo = this.A00;
        InterfaceC16620sF interfaceC16620sF = c54796OJo.A07;
        String str = this.A01;
        boolean z = this.A02;
        interfaceC16620sF.invoke(str, AbstractC31172DnG.A0s(z));
        AbstractC166997dE.A1O(C41451vu.A01, AbstractC31372Dqc.A02(AbstractC166997dE.A0M(c54796OJo.A00), new P3Q(c54796OJo, str, z)));
    }
}
