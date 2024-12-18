package X;

import android.os.Process;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.msys.mca.Mailbox;
import java.util.Map;

/* loaded from: classes8.dex */
public final class JQH extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final int A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JQH(int i, String str, int i2) {
        super(1);
        this.A00 = i2;
        this.A01 = i;
        this.A02 = str;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        switch (this.A00) {
            case 0:
                Map map = (Map) obj;
                C14360o3.A0B(map, 0);
                map.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, this.A02);
                map.put("threadPriority", Integer.valueOf(Process.getThreadPriority(Process.myTid())));
                map.put("waiting-on", Integer.valueOf(this.A01));
                break;
            case 1:
                InterfaceC113515Ao interfaceC113515Ao = (InterfaceC113515Ao) obj;
                C14360o3.A0B(interfaceC113515Ao, 0);
                int i = this.A01;
                if (i > 0) {
                    str = AnonymousClass001.A0G(this.A02, ' ', i);
                } else {
                    str = this.A02;
                }
                AbstractC113575Au.A03(interfaceC113515Ao, str);
                AbstractC113575Au.A02(interfaceC113515Ao, 0);
                break;
            default:
                Mailbox mailbox = (Mailbox) obj;
                C14360o3.A0B(mailbox, 0);
                return C42221xC.A07(new C48446Lbz(mailbox, this.A02, this.A01), AbstractC137146It.A00("insert push path notification"));
        }
        return C0eB.A00;
    }
}
