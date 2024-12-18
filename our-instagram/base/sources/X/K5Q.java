package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.facebook.R;

/* loaded from: classes8.dex */
public abstract class K5Q extends K5J {
    public Button A00;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            r0 = 2131429151(0x7f0b071f, float:1.8479967E38)
            r1 = 2131429151(0x7f0b071f, float:1.8479967E38)
            android.view.View r0 = X.AbstractC47961LGz.A00(r6, r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r5.A00 = r0
            if (r0 != 0) goto L1e
            java.lang.String r0 = "btnCameraAccessAllow"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L1e:
            android.view.View r0 = X.AbstractC47961LGz.A00(r0, r1)
            r4 = 1
            X.LQ0.A02(r0, r4, r5)
            r0 = 2131443365(0x7f0b3ea5, float:1.8508796E38)
            android.widget.TextView r3 = X.AbstractC47961LGz.A02(r6, r0)
            boolean r0 = r5 instanceof X.K5B
            if (r0 == 0) goto L5c
            r0 = 2131974226(0x7f135852, float:1.958551E38)
        L34:
            java.lang.CharSequence r1 = r5.getText(r0)
            X.C14360o3.A07(r1)
        L3b:
            r3.setText(r1)
            r0 = 2131435120(0x7f0b1e70, float:1.8492073E38)
            android.view.View r2 = r6.findViewById(r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            if (r2 == 0) goto L5b
            android.content.Context r1 = r5.requireContext()
            X.MRQ r0 = r5.A00
            if (r0 == 0) goto L57
            r0 = 2131237967(0x7f081c4f, float:1.80922E38)
            X.AbstractC166997dE.A19(r1, r2, r0)
        L57:
            r0 = 2
            X.LQ0.A02(r2, r0, r5)
        L5b:
            return
        L5c:
            boolean r0 = r5 instanceof X.K5C
            if (r0 == 0) goto L64
            r0 = 2131972839(0x7f1352e7, float:1.9582697E38)
            goto L34
        L64:
            android.content.Context r0 = r5.requireContext()
            r2 = 2130970102(0x7f0405f6, float:1.7548905E38)
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            r0.resolveAttribute(r2, r1, r4)
            java.lang.CharSequence r1 = r1.string
            if (r1 == 0) goto L82
            int r0 = r1.length()
            if (r0 <= 0) goto L82
            goto L3b
        L82:
            r0 = 2131951723(0x7f13006b, float:1.9539869E38)
            java.lang.CharSequence r1 = r5.getText(r0)
            X.C14360o3.A0A(r1)
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K5Q.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(161117750);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.default_permissions_fragment, viewGroup, false);
        C0f9.A09(-543807253, A02);
        return inflate;
    }
}
