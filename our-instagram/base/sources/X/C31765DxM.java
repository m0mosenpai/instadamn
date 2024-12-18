package X;

import android.content.Context;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: X.DxM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31765DxM extends BaseAdapter {
    public final ArrayList A00;
    public final Context A01;
    public final C32352EMz A02;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0052, code lost:
    
        if (r0 == false) goto L11;
     */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r10, android.view.View r11, android.view.ViewGroup r12) {
        /*
            r9 = this;
            r3 = 2
            X.C14360o3.A0B(r12, r3)
            if (r11 != 0) goto L1c
            android.content.Context r0 = r9.A01
            r2 = 0
            android.view.LayoutInflater r1 = X.AbstractC31172DnG.A09(r0)
            r0 = 2131629774(0x7f0e16ce, float:1.8886878E38)
            android.view.View r11 = X.AbstractC31173DnH.A0C(r1, r12, r0, r2)
            X.FMu r0 = new X.FMu
            r0.<init>(r11)
            r11.setTag(r0)
        L1c:
            android.content.Context r7 = r9.A01
            java.lang.Object r6 = r11.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.login.twofac.view.TwoFacTrustedDeviceViewBinder.Holder"
            X.C14360o3.A0C(r6, r0)
            X.FMu r6 = (X.C34611FMu) r6
            java.util.ArrayList r0 = r9.A00
            java.lang.Object r5 = X.AbstractC31173DnH.A0i(r0, r10)
            com.instagram.login.twofac.model.TrustedDevice r5 = (com.instagram.login.twofac.model.TrustedDevice) r5
            X.EMz r4 = r9.A02
            X.AbstractC167017dG.A1N(r7, r6)
            X.AbstractC167007dF.A1E(r5, r3, r4)
            java.lang.String r2 = r5.A06
            int r1 = r2.hashCode()
            r0 = -1068855134(0xffffffffc04a90a2, float:-3.1650777)
            if (r1 == r0) goto La9
            r0 = -599163109(0xffffffffdc497f1b, float:-2.268649E17)
            if (r1 != r0) goto L54
            java.lang.String r0 = "computer"
            boolean r0 = r2.equals(r0)
            r8 = 2131238255(0x7f081d6f, float:1.8092784E38)
        L52:
            if (r0 != 0) goto L57
        L54:
            r8 = 2131238256(0x7f081d70, float:1.8092786E38)
        L57:
            boolean r0 = r5.A09
            if (r0 == 0) goto La1
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131975995(0x7f135f3b, float:1.9589098E38)
            java.lang.String r2 = r1.getString(r0)
            android.widget.TextView r1 = r6.A04
            r0 = 2130970334(0x7f0406de, float:1.7549375E38)
            X.AbstractC31177DnL.A0q(r7, r1, r0)
        L6e:
            android.widget.ImageView r0 = r6.A00
            X.AbstractC166997dE.A19(r7, r0, r8)
            android.widget.TextView r1 = r6.A03
            java.lang.String r0 = r5.A05
            r1.setText(r0)
            android.widget.TextView r0 = r6.A04
            r0.setText(r2)
            android.widget.TextView r2 = r6.A02
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131961132(0x7f13252c, float:1.9558952E38)
            java.lang.String r0 = r1.getString(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r5.A07
            r1.append(r0)
            r2.setText(r1)
            android.widget.ImageView r1 = r6.A01
            r0 = 52
            X.ViewOnClickListenerC31591DuJ.A00(r1, r0, r5, r4)
            return r11
        La1:
            long r2 = r5.A02
            double r0 = (double) r2
            java.lang.String r2 = X.C23831Eq.A03(r7, r0)
            goto L6e
        La9:
            java.lang.String r0 = "mobile"
            boolean r0 = r2.equals(r0)
            r8 = 2131238257(0x7f081d71, float:1.8092788E38)
            goto L52
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31765DxM.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A00.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return AbstractC31173DnH.A0i(this.A00, i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return this.A00.get(i).hashCode();
    }

    public C31765DxM(Context context, C32352EMz c32352EMz, ArrayList arrayList) {
        this.A01 = context;
        this.A00 = arrayList;
        this.A02 = c32352EMz;
    }
}
