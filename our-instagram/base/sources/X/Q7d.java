package X;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;

/* loaded from: classes10.dex */
public final class Q7d extends AbstractC72483Mv {
    public DialogC58694Q0x A00;
    public String A01;

    @Override // X.C0SG
    public final Dialog A0F(Bundle bundle) {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A00.A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        if (r3 == null) goto L17;
     */
    @Override // X.C0SG, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = 862053173(0x3361e335, float:5.259354E-8)
            int r5 = X.C0f9.A02(r0)
            super.onCreate(r9)
            android.os.Bundle r1 = r8.requireArguments()
            java.lang.String r0 = "arg_session_id"
            java.lang.String r0 = r1.getString(r0)
            r8.A01 = r0
            X.Q0x r0 = r8.A00
            if (r0 != 0) goto La2
            androidx.fragment.app.FragmentActivity r7 = r8.requireActivity()
            android.content.Intent r3 = r7.getIntent()
            java.lang.String r1 = "com.facebook.platform.protocol.PROTOCOL_VERSION"
            r0 = 0
            int r2 = r3.getIntExtra(r1, r0)
            java.util.List r1 = X.SV2.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L7b
            r0 = 20140701(0x133529d, float:3.293638E-38)
            if (r2 < r0) goto L7b
            java.lang.String r0 = "com.facebook.platform.protocol.METHOD_ARGS"
            android.os.Bundle r1 = r3.getBundleExtra(r0)
        L40:
            java.lang.String r0 = "action"
            java.lang.String r6 = r1.getString(r0)
            java.lang.String r0 = "params"
            android.os.Bundle r4 = r1.getBundle(r0)
            boolean r0 = X.AbstractC63349Si6.A05(r6)
            if (r0 == 0) goto L5c
            r7.finish()
            r0 = 1653268638(0x628ae09e, float:1.280918E21)
        L58:
            X.C0f9.A09(r0, r5)
            return
        L5c:
            java.lang.String r1 = r8.A01
            r0 = 0
            X.Sg8 r2 = X.AbstractC63252Sg8.A00(r1)
            boolean r1 = r2 instanceof X.C58823QBg
            if (r1 == 0) goto L74
            r3 = 0
        L68:
            java.lang.String r0 = X.C1L4.A02
            if (r0 != 0) goto L80
            java.lang.String r1 = "Attempted to create a builder without a valid access token or a valid default Application ID."
            X.TXS r0 = new X.TXS
            r0.<init>(r1)
            throw r0
        L74:
            X.QBh r2 = (X.C58824QBh) r2
            com.facebook.AccessToken r3 = r2.A00
            if (r3 != 0) goto L80
            goto L68
        L7b:
            android.os.Bundle r1 = r3.getExtras()
            goto L40
        L80:
            if (r4 != 0) goto L86
            android.os.Bundle r4 = X.AbstractC166987dD.A0b()
        L86:
            X.Syl r2 = new X.Syl
            r2.<init>(r8)
            java.lang.String r1 = "app_id"
            if (r3 == 0) goto La6
            java.lang.String r0 = r3.A01
            r4.putString(r1, r0)
            java.lang.String r1 = r3.A02
            java.lang.String r0 = "access_token"
            r4.putString(r0, r1)
        L9b:
            X.Q0x r0 = new X.Q0x
            r0.<init>(r7, r4, r2, r6)
            r8.A00 = r0
        La2:
            r0 = -205204690(0xfffffffff3c4d32e, float:-3.1188154E31)
            goto L58
        La6:
            r4.putString(r1, r0)
            goto L9b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q7d.onCreate(android.os.Bundle):void");
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-2083391980);
        if (super.A01 != null) {
            C07K.A01(this);
            if (this.mRetainInstance) {
                super.A01.setDismissMessage(null);
            }
        }
        super.onDestroyView();
        C0f9.A09(-634950780, A02);
    }
}
