package X;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.ui.swipenavigation.PositionConfig;

/* renamed from: X.Aap, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23476Aap implements InterfaceC55932he {
    public Bitmap A00;
    public C34666FPb A01;
    public final RectF A02;
    public final RectF A03;
    public final ViewGroup A04;
    public final ImageView A05;
    public final C55982hj A06;
    public final C23767Afe A07;

    public C23476Aap(ViewGroup viewGroup, C23767Afe c23767Afe) {
        C14360o3.A0B(viewGroup, 1);
        this.A04 = viewGroup;
        this.A07 = c23767Afe;
        ImageView imageView = new ImageView(viewGroup.getContext());
        this.A05 = imageView;
        this.A03 = AbstractC166987dD.A0X();
        this.A02 = AbstractC166987dD.A0X();
        imageView.setVisibility(8);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        viewGroup.addView(imageView);
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A06 = true;
        A0R.A09(C55942hf.A01());
        this.A06 = A0R;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0097, code lost:
    
        if (r1.equals(r0) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a2, code lost:
    
        r2.Cqz(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a0, code lost:
    
        if (r1.equals("action_story_share_threads") != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(android.graphics.Bitmap r10, com.instagram.common.session.UserSession r11, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r12, java.util.List r13) {
        /*
            r9 = this;
            r8 = 0
            r0 = 1
            X.C14360o3.A0B(r12, r0)
            android.widget.ImageView r6 = r9.A05
            android.view.ViewParent r0 = r6.getParent()
            if (r0 != 0) goto L12
            android.view.ViewGroup r0 = r9.A04
            r0.addView(r6)
        L12:
            if (r10 == 0) goto L23
            android.view.ViewGroup r0 = r9.A04
            android.content.res.Resources r0 = r0.getResources()
            X.C14360o3.A07(r0)
            android.graphics.Bitmap r0 = X.AbstractC226369yt.A00(r0, r10)
            r9.A00 = r0
        L23:
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r12 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r12
            X.82f r0 = r12.A0K
            int r7 = r0.getWidth()
            int r5 = r0.getHeight()
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r7, r5)
            int r1 = r12.A01
            int r0 = r12.A05
            r2.setMargins(r1, r0, r8, r8)
            r6.setLayoutParams(r2)
            android.graphics.RectF r4 = r9.A02
            float r3 = (float) r1
            float r2 = (float) r0
            int r1 = r1 + r7
            float r1 = (float) r1
            int r0 = r0 + r5
            float r0 = (float) r0
            r4.set(r3, r2, r1, r0)
            r6.setVisibility(r8)
            r0 = 0
            r6.setTranslationX(r0)
            r6.setTranslationY(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r6.setScaleX(r0)
            r6.setScaleY(r0)
            r6.setImageBitmap(r10)
            X.Afe r2 = r9.A07
            if (r2 == 0) goto L6d
            X.2fg r0 = r2.A02
            java.lang.String r1 = r0.A02
            int r0 = r1.hashCode()
            switch(r0) {
                case -2075285002: goto L9a;
                case -811302394: goto L7a;
                case -471528113: goto L7d;
                case -104996226: goto L80;
                case 179250025: goto L87;
                case 1364086253: goto L8e;
                case 1965399843: goto L91;
                default: goto L6d;
            }
        L6d:
            X.1My r1 = X.AbstractC25651Mw.A00(r11)
            X.3HU r0 = new X.3HU
            r0.<init>(r13)
            r1.E4s(r0)
            return
        L7a:
            java.lang.String r0 = "story_share_intent"
            goto L93
        L7d:
            java.lang.String r0 = "camera_tab_bar"
            goto L93
        L80:
            r0 = 99
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            goto L93
        L87:
            r0 = 190(0xbe, float:2.66E-43)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            goto L93
        L8e:
            java.lang.String r0 = "third_party_intent"
            goto L93
        L91:
            java.lang.String r0 = "profile_picture_tap_on_self_profile"
        L93:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto La2
            goto L6d
        L9a:
            java.lang.String r0 = "action_story_share_threads"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6d
        La2:
            r2.Cqz(r1)
            goto L6d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23476Aap.A00(android.graphics.Bitmap, com.instagram.common.session.UserSession, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, java.util.List):void");
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        double d = (float) c55982hj.A09.A00;
        float A03 = (float) AbstractC70163Da.A03(d, 1.0d, 0.05d);
        float centerX = this.A03.centerX();
        RectF rectF = this.A02;
        float A01 = (float) AbstractC70163Da.A01(d, centerX - rectF.centerX());
        float A012 = (float) AbstractC70163Da.A01(d, r3.centerY() - rectF.centerY());
        ImageView imageView = this.A05;
        imageView.setVisibility(0);
        imageView.setTranslationX(A01);
        imageView.setTranslationY(A012);
        imageView.setScaleX(A03);
        imageView.setScaleY(A03);
    }

    public final void A01(RectF rectF, C34666FPb c34666FPb) {
        this.A03.set(rectF);
        this.A01 = c34666FPb;
        C55982hj c55982hj = this.A06;
        c55982hj.A08(0.0d, true);
        c55982hj.A0A(this);
        c55982hj.A03();
    }

    public final void A02(String str) {
        ViewGroup viewGroup = this.A04;
        ImageView imageView = this.A05;
        viewGroup.removeView(imageView);
        imageView.setVisibility(8);
        imageView.setImageBitmap(null);
        A03(!str.equals(AbstractC111324zv.A00(99)), str);
    }

    public final void A03(boolean z, String str) {
        String str2;
        if (str.equals(AbstractC111324zv.A00(99))) {
            str2 = "story_posted_from_organic_insights";
        } else {
            str2 = "story_posted_from_camera";
        }
        C23767Afe c23767Afe = this.A07;
        if (c23767Afe != null && !str2.equals("story_posted_from_organic_insights")) {
            c23767Afe.A01.FBp(new PositionConfig(null, null, null, str2, null, null, null, null, null, null, null, null, null, 0.0f, 0, z));
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        ViewGroup viewGroup = this.A04;
        ImageView imageView = this.A05;
        viewGroup.removeView(imageView);
        imageView.setVisibility(8);
        imageView.setImageBitmap(null);
        C34666FPb c34666FPb = this.A01;
        if (c34666FPb != null) {
            c34666FPb.A00(this.A00);
        }
        this.A01 = null;
        this.A00 = null;
        this.A06.A0B(this);
    }
}
