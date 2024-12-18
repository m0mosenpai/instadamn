package X;

import android.app.Activity;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.8Xk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188708Xk implements InterfaceC188718Xl {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public int A03;
    public Drawable A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final Activity A08;
    public final RectF A09;
    public final RectF A0A;
    public final View A0B;
    public final AbstractC59962oe A0C;
    public final UserSession A0D;
    public final C8XA A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final RectF A0I;
    public final View A0J;
    public final C81J A0K;
    public final InterfaceC08830cm A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r4 != null) goto L19;
     */
    @Override // X.InterfaceC188718Xl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void APf() {
        /*
            r10 = this;
            r6 = r10
            X.81J r5 = r10.A0K
            int r2 = r5.A03
            java.lang.String r3 = "story_visual_reply"
            java.lang.String r7 = "story_selfie_reply"
            java.lang.String r4 = "story_remix_reply"
            r1 = 0
            r0 = 7
            if (r2 != r0) goto L82
            java.lang.String r7 = "permanent_media_send"
        L11:
            r4 = -1
            if (r1 == 0) goto L70
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            r0 = 5281(0x14a1, float:7.4E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r2.putExtra(r0, r1)
            android.app.Activity r0 = r10.A08
            r0.setResult(r4, r2)
        L27:
            boolean r0 = r3.equals(r7)
            if (r0 == 0) goto L5c
            boolean r0 = r10.A02
            if (r0 != 0) goto L58
            r0 = 1
            r10.A02 = r0
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3 = 1065353216(0x3f800000, float:1.0)
            r10.Cz0(r3, r0)
            android.view.View r1 = r10.A0B
            X.2hf r0 = X.C150956qv.A02
            X.5le r2 = X.AbstractC125325le.A00(r1)
            r1 = 1063675494(0x3f666666, float:0.9)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.A0V(r3, r1, r0)
            r2.A0U(r3, r1, r0)
            X.Ama r0 = new X.Ama
            r0.<init>(r10, r7)
            r2.A05 = r0
            r2.A0H()
        L58:
            r0 = 1
            r10.A00 = r0
            return
        L5c:
            android.graphics.RectF r4 = r10.A0I
            if (r4 != 0) goto L65
            android.graphics.RectF r4 = r10.A0A
            r8 = 0
            if (r4 == 0) goto L66
        L65:
            r8 = 1
        L66:
            boolean r0 = r10.A0O
            r9 = r0 ^ 1
            android.view.View r5 = r10.A0B
            A00(r4, r5, r6, r7, r8, r9)
            goto L58
        L70:
            boolean r0 = r5.A3B
            if (r0 == 0) goto L7c
            android.app.Activity r1 = r10.A08
            r0 = 101(0x65, float:1.42E-43)
            r1.setResult(r0)
            goto L27
        L7c:
            android.app.Activity r0 = r10.A08
            r0.setResult(r4)
            goto L27
        L82:
            java.lang.String r2 = r5.A2q
            boolean r0 = r4.equals(r2)
            if (r0 == 0) goto L8c
            r7 = r4
            goto L11
        L8c:
            boolean r0 = r7.equals(r2)
            if (r0 == 0) goto L9c
            X.0cm r0 = r10.A0L
            java.lang.Object r1 = r0.get()
            java.lang.String r1 = (java.lang.String) r1
            goto L11
        L9c:
            boolean r0 = r10.A0M
            if (r0 == 0) goto La3
            r7 = r3
            goto L11
        La3:
            java.lang.String r7 = "story_replied"
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C188708Xk.APf():void");
    }

    @Override // X.InterfaceC188718Xl
    public final void DEv(View view, String str, boolean z) {
        View view2 = view;
        boolean z2 = !this.A0O;
        RectF rectF = this.A0A;
        if (view == null) {
            view2 = this.A0B;
        }
        A00(rectF, view2, this, str, z, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
    
        if (r14 != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(android.graphics.RectF r9, android.view.View r10, final X.C188708Xk r11, java.lang.String r12, boolean r13, boolean r14) {
        /*
            boolean r0 = r11.A02
            if (r0 != 0) goto Le
            X.9Oy r5 = new X.9Oy
            r5.<init>(r11, r12)
            if (r13 != 0) goto Lf
            r5.onFinish()
        Le:
            return
        Lf:
            r7 = 1
            r11.A02 = r7
            java.lang.String r0 = "back"
            boolean r0 = r0.equals(r12)
            if (r9 == 0) goto L23
            if (r0 == 0) goto L20
            boolean r0 = r11.A0N
            if (r0 != 0) goto L23
        L20:
            r8 = 0
            if (r14 == 0) goto L24
        L23:
            r8 = 1
        L24:
            android.view.View r4 = r11.A0B
            android.content.Context r0 = r4.getContext()
            X.C14360o3.A07(r0)
            int r0 = X.AbstractC13880nE.A09(r0)
            float r6 = (float) r0
            r2 = 8
            if (r10 == r4) goto L39
            r4.setVisibility(r2)
        L39:
            X.2hf r0 = X.C150956qv.A02
            r0 = 0
            X.5le r1 = X.AbstractC125325le.A01(r10, r0)
            r1.A0G()
            r3 = 0
            if (r8 == 0) goto L86
            float r0 = r4.getTranslationY()
            float r0 = r0 / r6
        L4b:
            r1.A00 = r0
            if (r8 != 0) goto L50
            r6 = 0
        L50:
            r1.A0K(r6)
            r1.A03 = r2
            X.5le r1 = r1.A0F(r7)
            X.9Pm r0 = new X.9Pm
            r0.<init>()
            r1.A06 = r0
            r1.A05 = r5
            X.2hf r0 = X.AbstractC43599JQf.A00
            X.5le r2 = r1.A0E(r0)
            if (r8 != 0) goto L82
            if (r9 == 0) goto L82
            float r1 = r4.getScaleX()
            float r0 = r9.centerX()
            r2.A0U(r1, r3, r0)
            float r1 = r4.getScaleY()
            float r0 = r9.centerY()
            r2.A0V(r1, r3, r0)
        L82:
            r2.A0H()
            return
        L86:
            r0 = 0
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C188708Xk.A00(android.graphics.RectF, android.view.View, X.8Xk, java.lang.String, boolean, boolean):void");
    }

    @Override // X.InterfaceC188718Xl
    public final void Cz0(float f, int i) {
        Drawable mutate;
        if (this.A04 == null || this.A03 != -16777216) {
            this.A03 = -16777216;
            ColorDrawable colorDrawable = new ColorDrawable(-16777216);
            this.A04 = colorDrawable;
            View view = this.A0J;
            RectF rectF = AbstractC13880nE.A01;
            view.setBackground(colorDrawable);
        }
        Drawable drawable = this.A04;
        if (drawable != null && (mutate = drawable.mutate()) != null) {
            mutate.setAlpha((int) (255.0f * f));
        }
    }

    public C188708Xk(View view, View view2, C81J c81j, C8XA c8xa, InterfaceC08830cm interfaceC08830cm, boolean z) {
        this.A0B = view;
        this.A0E = c8xa;
        this.A0J = view2;
        this.A0K = c81j;
        this.A0M = z;
        this.A0L = interfaceC08830cm;
        this.A0G = c81j.A3H;
        Activity activity = c81j.A05;
        C14360o3.A07(activity);
        this.A08 = activity;
        c81j.A0M.getClass();
        AbstractC59962oe abstractC59962oe = c81j.A0M;
        C14360o3.A07(abstractC59962oe);
        this.A0C = abstractC59962oe;
        UserSession userSession = c81j.A0S;
        C14360o3.A07(userSession);
        this.A0D = userSession;
        this.A09 = c81j.A06;
        this.A0A = c81j.A07;
        this.A0I = c81j.A08;
        this.A06 = AbstractC13880nE.A0A(activity);
        this.A05 = AbstractC13880nE.A09(activity);
        this.A0H = c81j.A3v;
        this.A07 = c81j.A04;
        this.A0N = c81j.A3r;
        boolean z2 = c81j.A33;
        this.A0F = z2;
        this.A0O = !z2;
        this.A03 = -1;
    }
}
