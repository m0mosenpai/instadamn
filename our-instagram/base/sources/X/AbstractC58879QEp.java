package X;

import android.os.Build;
import android.os.Bundle;
import com.facebook.browser.lite.extensions.commercecheckout.constant.MetaCheckoutRequest;
import com.facebook.iabadscontext.IABAdsContext;

/* renamed from: X.QEp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58879QEp extends AbstractC63223SfY implements BEG, InterfaceC65639Tq2, InterfaceC65638Tq1 {
    public QF6 A00;
    public QJj A01;
    public String A02;
    public final IABAdsContext A03;

    /* JADX WARN: Code restructure failed: missing block: B:134:0x018a, code lost:
    
        if (r14 != false) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ee  */
    /* JADX WARN: Type inference failed for: r6v6, types: [X.QJl, X.QJj, X.RqH] */
    @Override // X.AbstractC63223SfY, X.InterfaceC65638Tq1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Eit(X.QF6 r26, java.lang.Boolean r27, java.lang.Boolean r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC58879QEp.Eit(X.QF6, java.lang.Boolean, java.lang.Boolean, java.lang.String):boolean");
    }

    public final void A00(Bundle bundle) {
        Object parcelable;
        String str;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = bundle.getParcelable("CommerceCheckoutConstant.request_type", MetaCheckoutRequest.class);
        } else {
            parcelable = bundle.getParcelable("CommerceCheckoutConstant.request_type");
        }
        MetaCheckoutRequest metaCheckoutRequest = (MetaCheckoutRequest) parcelable;
        if (metaCheckoutRequest != null && metaCheckoutRequest.A00.intValue() == 0 && (str = metaCheckoutRequest.A01) != null) {
            STG.A00(new TNL(this, str));
        }
    }

    public AbstractC58879QEp(IABAdsContext iABAdsContext, String str) {
        this.A03 = iABAdsContext;
        this.A02 = str;
        this.A02 = str.length() == 0 ? AbstractC58442PvL.A02() : str;
    }
}
