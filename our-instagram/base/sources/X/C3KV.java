package X;

import android.content.Intent;
import android.net.Uri;
import java.util.regex.Pattern;

/* renamed from: X.3KV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3KV implements InterfaceC07800ax {
    public A97 A00;
    public final C55782hJ A01;

    public C3KV(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 1);
        this.A01 = C55772hI.A00(abstractC12990ll);
    }

    @Override // X.InterfaceC07800ax
    public final synchronized void DOS(Intent intent) {
        C14360o3.A0B(intent, 0);
        android.net.Uri data = intent.getData();
        if (data != null) {
            Uri.Builder scheme = new Uri.Builder().scheme(data.getScheme());
            String host = data.getHost();
            if (host == null) {
                host = "";
            }
            if (AbstractC002300n.A0h(host, "www.", false)) {
                host = host.substring(4);
                C14360o3.A07(host);
            }
            String obj = scheme.authority(host).path(data.getPath()).build().toString();
            if (obj != null) {
                C55782hJ c55782hJ = this.A01;
                String A03 = c55782hJ.A03();
                String str = c55782hJ.A0B;
                if (str == null) {
                    str = "";
                }
                String str2 = c55782hJ.A05;
                Pattern pattern = AbstractC13670mt.A03;
                if (str2 == null) {
                    str2 = "";
                }
                this.A00 = new A97(obj, A03, str, str2);
            }
        }
    }
}
