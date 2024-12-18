package com.facebook.browser.lite.webview;

import X.AbstractC167007dF;
import X.AbstractC83633o6;
import X.AnonymousClass001;
import X.C0fY;
import X.C58712Q4d;
import X.C58720Q4v;
import X.InterfaceC65480Tkx;
import X.Q4a;
import X.QF6;
import X.R7V;
import X.SIC;
import android.app.Activity;
import android.content.Context;
import android.view.autofill.AutofillManager;
import com.android.webview.chromium.membrane.HeliumWebViewExtensions;

/* loaded from: classes10.dex */
public final class SystemWebView extends QF6 {
    public AutofillManager.AutofillCallback A00;
    public HeliumWebViewExtensions A01;
    public C58712Q4d A02;
    public C58720Q4v A03;
    public final R7V A04;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.SHJ, java.lang.Object] */
    public SystemWebView(Context context) {
        HeliumWebViewExtensions heliumWebViewExtensions;
        super.A01 = -1L;
        this.A08 = -1L;
        this.A07 = -1L;
        super.A04 = -1L;
        this.A05 = -1L;
        this.A06 = -1L;
        super.A00 = -1L;
        this.A09 = -1L;
        super.A03 = -1L;
        super.A02 = -1L;
        this.A0P = true;
        this.A0X = false;
        this.A0U = false;
        this.A0S = false;
        this.A0T = false;
        this.A0V = false;
        this.A0W = false;
        this.A0Y = false;
        this.A0J = false;
        this.A0K = false;
        this.A0B = null;
        this.A0G = new SIC();
        ?? obj = new Object();
        obj.A02 = true;
        obj.A03 = false;
        obj.A00 = context;
        obj.A01 = this;
        this.A0H = obj;
        if (context instanceof Activity) {
            A0D(((Activity) context).getIntent());
        }
        this.A03 = null;
        this.A02 = null;
        C0fY.A01(32L, AnonymousClass001.A1D("Initialized SystemWebView: using Helium ", AbstractC167007dF.A1W(AbstractC83633o6.A01)), -80749814);
        R7V r7v = new R7V(context, this);
        this.A04 = r7v;
        InterfaceC65480Tkx interfaceC65480Tkx = AbstractC83633o6.A01;
        if (interfaceC65480Tkx != null) {
            heliumWebViewExtensions = interfaceC65480Tkx.B3Z(r7v);
        } else {
            heliumWebViewExtensions = null;
        }
        this.A01 = heliumWebViewExtensions;
        C0fY.A00(32L, -47691645);
        if (context.getSystemService(AutofillManager.class) != null) {
            this.A00 = new Q4a(this);
            ((AutofillManager) context.getSystemService(AutofillManager.class)).registerCallback(this.A00);
        }
    }
}
