package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.70j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1563970j implements InterfaceC60602pj {
    public ImageView A00;
    public boolean A01;
    public final FragmentActivity A02;
    public final C70U A03;
    public final C70V A04;
    public final C18920wW A05;
    public final C25671My A06;
    public final InterfaceC41501vz A07;
    public final InterfaceC41501vz A08;
    public final UserSession A09;
    public final C70Y A0A;
    public final C1564070k A0B;
    public final C1XJ A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final C41206ILu A0J;

    public C1563970j(FragmentActivity fragmentActivity, C70U c70u, C70V c70v, C18920wW c18920wW, C25671My c25671My, UserSession userSession, C70Y c70y, C41206ILu c41206ILu, C1XJ c1xj, String str, String str2, String str3, String str4, String str5, String str6) {
        C14360o3.A0B(c70u, 3);
        C14360o3.A0B(c25671My, 14);
        this.A02 = fragmentActivity;
        this.A09 = userSession;
        this.A03 = c70u;
        this.A0H = str;
        this.A0F = str2;
        this.A0D = str3;
        this.A0I = str4;
        this.A0E = str5;
        this.A0G = str6;
        this.A04 = c70v;
        this.A05 = c18920wW;
        this.A0C = c1xj;
        this.A06 = c25671My;
        this.A0A = c70y;
        this.A0J = c41206ILu;
        this.A0B = c1xj.A0R(userSession, this, str, str2);
        this.A07 = new InterfaceC41501vz() { // from class: X.70l
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(1417116074);
                C71H c71h = (C71H) obj;
                int A032 = C0f9.A03(-930691298);
                C14360o3.A0B(c71h, 0);
                C1563970j.A00(C1563970j.this, c71h.A01, Integer.valueOf(c71h.A00));
                C0f9.A0A(-1145724075, A032);
                C0f9.A0A(-2115844560, A03);
            }
        };
        this.A08 = new InterfaceC41501vz() { // from class: X.70m
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-1168607813);
                C71I c71i = (C71I) obj;
                int A032 = C0f9.A03(-1737572400);
                C14360o3.A0B(c71i, 0);
                C1563970j c1563970j = C1563970j.this;
                AbstractC41662Ibu.A00(c1563970j.A02, c1563970j.A09, c71i.A04);
                C0f9.A0A(722992696, A032);
                C0f9.A0A(470479168, A03);
            }
        };
        this.A01 = true;
    }

    public final void A01(InterfaceC56362iU interfaceC56362iU) {
        Integer A06 = this.A0A.A06();
        C3LO c3lo = new C3LO();
        c3lo.A05 = 2131973957;
        c3lo.A0G = new ViewOnClickListenerC41917IiA(this, A06);
        FragmentActivity fragmentActivity = this.A02;
        C3LP c3lp = new C3LP(fragmentActivity, R.drawable.instagram_shopping_cart_pano_outline_24);
        c3lp.A01();
        c3lo.A0F = c3lp;
        View AA9 = interfaceC56362iU.AA9(new C3LY(c3lo));
        AA9.setContentDescription(I7T.A00(fragmentActivity, A06));
        this.A00 = (ImageView) AA9;
        A00(this, EnumC46143Kbh.A03, A06);
        C70U c70u = this.A03;
        C42077Ikk c42077Ikk = new C42077Ikk(this);
        C14360o3.A0B(fragmentActivity, 0);
        if (c70u.A01.A00()) {
            c70u.A00.A06(fragmentActivity, new C24996B3s(new C50369MLw(47, c70u, c42077Ikk)));
        }
        C25671My c25671My = this.A06;
        c25671My.A01(this.A07, C71H.class);
        c25671My.A01(this.A08, C71I.class);
        C1XJ c1xj = this.A0C;
        UserSession userSession = this.A09;
        c1xj.A0f(fragmentActivity, userSession, null);
        c1xj.A1I(userSession, A06, this.A0H, this.A0F);
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        C25671My c25671My = this.A06;
        c25671My.A01(this.A07, C71H.class);
        c25671My.A01(this.A08, C71I.class);
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r5, 2342157984198888374L) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C1563970j r15, X.EnumC46143Kbh r16, java.lang.Integer r17) {
        /*
            android.widget.ImageView r3 = r15.A00
            if (r3 == 0) goto L91
            r2 = 0
            r10 = r17
            if (r17 == 0) goto L92
            int r0 = r10.intValue()
        Ld:
            r5 = 1
            r13 = 0
            if (r0 <= 0) goto L12
            r13 = 1
        L12:
            X.ILu r6 = r15.A0J
            r9 = r16
            if (r6 == 0) goto L57
            android.graphics.drawable.Drawable r0 = r3.getDrawable()
            int r11 = r0.getLevel()
            boolean r12 = r3.isActivated()
            boolean r14 = r15.A01
            X.OEe r8 = new X.OEe
            r8.<init>(r9, r10, r11, r12, r13, r14)
            com.facebook.quicklog.reliability.UserFlowLogger r7 = r6.A01
            long r0 = r6.A00
            java.lang.String r4 = "show_nav_bar_cart_count"
            com.facebook.quicklog.PointEditor r7 = r7.markPointWithEditor(r0, r4)
            X.C14360o3.A07(r7)
            java.lang.String r4 = ""
            X.AbstractC54223Ny1.A00(r7, r8, r4)
            r7.markerEditingCompleted()
            int r7 = r8.A01
            java.lang.Integer r4 = r8.A03
            if (r4 == 0) goto L52
            int r4 = r4.intValue()
            if (r7 != r4) goto L52
            if (r4 != 0) goto L57
            boolean r4 = r8.A05
            if (r4 == 0) goto L57
        L52:
            X.JGh r4 = r6.A02
            r4.DVO(r8, r0)
        L57:
            X.C14360o3.A0B(r9, r5)
            X.Kbh r0 = X.EnumC46143Kbh.A02
            if (r9 == r0) goto L7d
            X.70V r0 = r15.A04
            com.instagram.common.session.UserSession r5 = r0.A00
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 2342157984198691763(0x2081044700020bb3, double:4.061325093775586E-152)
            boolean r0 = X.C18U.A06(r4, r5, r0)
            if (r0 != 0) goto L7d
            X.0Tz r4 = X.C06090Tz.A06
            r0 = 2342157984198888374(0x2081044700050bb6, double:4.0613250939422956E-152)
            boolean r1 = X.C18U.A06(r4, r5, r0)
            r0 = 0
            if (r1 == 0) goto L7e
        L7d:
            r0 = 1
        L7e:
            r3.isActivated()
            if (r17 == 0) goto L91
            if (r0 == 0) goto L91
            r3.setActivated(r13)
            int r0 = r10.intValue()
            r3.setImageLevel(r0)
            r15.A01 = r2
        L91:
            return
        L92:
            r0 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1563970j.A00(X.70j, X.Kbh, java.lang.Integer):void");
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroy() {
        C25671My c25671My = this.A06;
        c25671My.A02(this.A07, C71H.class);
        c25671My.A02(this.A08, C71I.class);
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        C25671My c25671My = this.A06;
        c25671My.A02(this.A07, C71H.class);
        c25671My.A02(this.A08, C71I.class);
        this.A00 = null;
    }

    public C1563970j() {
    }
}
