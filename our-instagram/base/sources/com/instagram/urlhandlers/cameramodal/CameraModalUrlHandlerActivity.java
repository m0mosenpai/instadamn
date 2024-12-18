package com.instagram.urlhandlers.cameramodal;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.C128535rM;
import X.C208509Kk;
import X.C55U;
import X.C81S;
import X.C81U;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

/* loaded from: classes6.dex */
public final class CameraModalUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    public static final C55U A00(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 3138974:
                if (!str.equals("feed")) {
                    return null;
                }
                return C128535rM.A00;
            case 3322092:
                if (!str.equals("live")) {
                    return null;
                }
                return C81S.A00;
            case 3496474:
                if (!str.equals("reel")) {
                    return null;
                }
                return C81U.A00;
            case 109770997:
                if (!str.equals("story")) {
                    return null;
                }
                return C208509Kk.A00;
            default:
                return null;
        }
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d6, code lost:
    
        if (X.AbstractC54852fj.A00() != null) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            r0 = -837402942(0xffffffffce163ec2, float:-6.301738E8)
            int r4 = X.C0f9.A00(r0)
            super.onCreate(r12)
            android.os.Bundle r5 = X.AbstractC31176DnK.A07(r11)
            if (r5 == 0) goto Ld8
            java.lang.String r3 = X.AbstractC31171DnF.A0a(r5)
            if (r3 == 0) goto Ld8
            X.09Y r2 = X.C023409i.A0A
            X.0vv r1 = r2.A05(r11)
            boolean r0 = r1 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto Ldc
            X.0vv r6 = r2.A05(r11)
            boolean r0 = r6 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto Ldf
            if (r6 == 0) goto Ldf
            android.net.Uri r8 = X.AbstractC25227BEk.A0B(r3)
            java.lang.String r10 = X.AbstractC31172DnG.A12(r8)
            X.22P[] r9 = X.C22P.values()
            int r7 = r9.length
            r3 = 0
        L38:
            r0 = 0
            if (r3 >= r7) goto L52
            r5 = r9[r3]
            long r1 = r5.A00
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            if (r10 == 0) goto L49
            java.lang.Long r0 = X.AbstractC166997dE.A0j(r10)
        L49:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L54
            int r3 = r3 + 1
            goto L38
        L52:
            X.22P r5 = X.C22P.A5N
        L54:
            java.lang.String r0 = "target_mode"
            java.lang.String r0 = r8.getQueryParameter(r0)
            X.55U r7 = A00(r0)
            java.lang.String r0 = "modes"
            java.lang.String r2 = r8.getQueryParameter(r0)
            if (r2 == 0) goto L8b
            r1 = 0
            java.lang.String r0 = ","
            java.util.List r0 = X.AbstractC167007dF.A0m(r2, r0, r1)
            if (r0 == 0) goto L8b
            java.util.ArrayList r2 = X.AbstractC166987dD.A1E()
            java.util.Iterator r1 = r0.iterator()
        L77:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L8d
            java.lang.String r0 = X.AbstractC166987dD.A1B(r1)
            X.55U r0 = A00(r0)
            if (r0 == 0) goto L77
            r2.add(r0)
            goto L77
        L8b:
            X.0sl r2 = X.C16930sl.A00
        L8d:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto La3
            X.5rM r3 = X.C128535rM.A00
            X.81U r2 = X.C81U.A00
            X.9Kk r1 = X.C208509Kk.A00
            X.81S r0 = X.C81S.A00
            X.55U[] r0 = new X.C55U[]{r3, r2, r1, r0}
            java.util.List r2 = X.AbstractC16960so.A1Q(r0)
        La3:
            X.INH r5 = X.AbstractC86593tX.A0C(r5)
            r3 = 1
            r5.A0m = r3
            r5.A0n = r3
            if (r7 == 0) goto Lb0
            r5.A03 = r7
        Lb0:
            java.util.Iterator r1 = r2.iterator()
        Lb4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lc4
            java.lang.Object r0 = r1.next()
            X.55U r0 = (X.C55U) r0
            r5.A01(r0)
            goto Lb4
        Lc4:
            android.os.Bundle r1 = r5.A00()
            java.lang.String r0 = "modal_dismiss_on_cancel"
            r1.putBoolean(r0, r3)
            java.lang.String r0 = "clips_camera"
            X.AbstractC31176DnK.A0w(r11, r1, r6, r0)
            X.2dB r0 = X.AbstractC54852fj.A00()
            if (r0 == 0) goto Ldf
        Ld8:
            r11.finish()
            goto Ldf
        Ldc:
            X.AbstractC35178FfV.A01(r11, r5, r1)
        Ldf:
            r11.finish()
            r0 = 1489538304(0x58c88d00, float:1.7640633E15)
            X.C0f9.A07(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.cameramodal.CameraModalUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
