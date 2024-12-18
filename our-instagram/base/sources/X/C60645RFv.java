package X;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: X.RFv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60645RFv extends AbstractC63157Se6 {
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    public final void A03(C60645RFv c60645RFv) {
        if (!TextUtils.isEmpty(this.A00)) {
            c60645RFv.A00 = this.A00;
        }
        if (!TextUtils.isEmpty(this.A01)) {
            c60645RFv.A01 = this.A01;
        }
        if (!TextUtils.isEmpty(this.A02)) {
            c60645RFv.A02 = this.A02;
        }
        if (!TextUtils.isEmpty(this.A03)) {
            c60645RFv.A03 = this.A03;
        }
    }

    public final String toString() {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("appName", this.A00);
        A1G.put("appVersion", this.A01);
        A1G.put("appId", this.A02);
        return AbstractC63157Se6.A01("appInstallerId", this.A03, A1G);
    }
}
