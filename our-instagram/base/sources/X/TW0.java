package X;

import android.os.Bundle;
import com.facebook.browser.lite.extensions.autofill.instagram.AutofillController$5;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.common.session.UserSession;

/* loaded from: classes10.dex */
public final class TW0 implements InterfaceC09250da, InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    public TW0(C63380Siu c63380Siu, int i) {
        this.A00 = i;
        switch (i) {
            case 1:
            case 2:
            case 3:
                this.A01 = c63380Siu;
                return;
            default:
                this.A01 = c63380Siu;
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        boolean A0D;
        C63024Sau c63024Sau;
        Bundle A03;
        String str;
        switch (this.A00) {
            case 0:
                A0D = ((C58883QEt) this.A01).A0Y.A04.A0E(true);
                return Boolean.valueOf(A0D);
            case 1:
                C63380Siu c63380Siu = (C63380Siu) this.A01;
                QF6 qf6 = c63380Siu.A06;
                if (qf6 == null) {
                    return null;
                }
                c63380Siu.A0F(null, qf6);
                return null;
            case 2:
                C63380Siu c63380Siu2 = (C63380Siu) this.A01;
                c63024Sau = c63380Siu2.A0Q.A01;
                A03 = c63380Siu2.A03.A03();
                str = "PASSKEY_ASSERTION_NO_PASSKEY";
                c63024Sau.A06(str, A03);
                return null;
            case 3:
                C63380Siu c63380Siu3 = (C63380Siu) this.A01;
                c63024Sau = c63380Siu3.A0Q.A01;
                A03 = c63380Siu3.A03.A03();
                str = "SUCCEEDED_PASSKEY_VERIFICATION";
                c63024Sau.A06(str, A03);
                return null;
            case 4:
                A0D = ((C63380Siu) this.A01).A0Q.A04.A0F(true);
                return Boolean.valueOf(A0D);
            case 5:
                A0D = ((C63380Siu) this.A01).A0Q.A04.A0G(true);
                return Boolean.valueOf(A0D);
            case 6:
                A0D = ((AutofillController$5) this.A01).A01.A0Y.A04.A0D(true);
                return Boolean.valueOf(A0D);
            default:
                return new IgNetworkConsentStorage((UserSession) this.A01);
        }
    }

    public TW0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
