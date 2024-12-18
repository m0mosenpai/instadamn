package X;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.Bom, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26589Bom extends AbstractC51572Yf {
    public final InterfaceC30988Djn A00;
    public final C120985dq A01;
    public final C37644Ghd A02;
    public final UserSession A03;
    public final InterfaceC60442pS A04;
    public final C27910CRv A05;
    public final boolean A06;
    public final String A07;

    public C26589Bom(InterfaceC30988Djn interfaceC30988Djn, C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C27910CRv c27910CRv, String str, boolean z) {
        AbstractC167007dF.A1G(userSession, 1, interfaceC60442pS);
        this.A03 = userSession;
        this.A01 = c120985dq;
        this.A02 = c37644Ghd;
        this.A00 = interfaceC30988Djn;
        this.A04 = interfaceC60442pS;
        this.A06 = z;
        this.A07 = str;
        this.A05 = c27910CRv;
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x07e5, code lost:
    
        if (r10 != 3) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0830, code lost:
    
        if (r0 == null) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0846, code lost:
    
        if (r0 != null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x08bf, code lost:
    
        if (r0 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x08d7, code lost:
    
        if (r0 == null) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x08ff, code lost:
    
        if (r0 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e5, code lost:
    
        if (r6.A2J != false) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x08f2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0424  */
    @Override // X.AbstractC51572Yf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0Y(X.C76223bS r65) {
        /*
            Method dump skipped, instructions count: 2319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26589Bom.A0Y(X.3bS):X.2Vc");
    }

    public static final ShapeDrawable A03(Context context, C40971v4 c40971v4, float f, int i) {
        boolean z;
        int i2;
        Integer num;
        Integer num2;
        C5G3 c5g3 = c40971v4.A0F;
        int i3 = 0;
        if (c5g3 != null) {
            z = AbstractC166997dE.A1Z(c5g3.A06, true);
        } else {
            z = false;
        }
        float[] fArr = new float[8];
        if (z) {
            fArr[0] = f;
            fArr[1] = f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f;
            fArr[7] = f;
        } else {
            int i4 = 0;
            do {
                fArr[i4] = f;
                i4++;
            } while (i4 < 8);
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(i);
        if (c5g3 != null && (num2 = c5g3.A0H) != null) {
            i2 = AbstractC13690mv.A01(context, num2.intValue());
        } else {
            i2 = 0;
        }
        shapeDrawable.setIntrinsicHeight(i2);
        if (c5g3 != null && (num = c5g3.A0H) != null) {
            i3 = AbstractC13690mv.A01(context, num.intValue());
        }
        shapeDrawable.setIntrinsicWidth(i3);
        return shapeDrawable;
    }

    private final AbstractC77583di A04(C2Z1 c2z1, InterfaceC59142nF interfaceC59142nF, C40971v4 c40971v4, C25728BYo c25728BYo, int i) {
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0m(C05F.A0C, 0.0f, 1));
        long A0K = AbstractC25229BEm.A0K(i);
        C51722Yv A00 = C9CU.A00(C9CU.A00(A0h, C05F.A01, 0, A0K), C05F.A00, 0, A0K);
        C120985dq c120985dq = this.A01;
        UserSession userSession = this.A03;
        InterfaceC60442pS interfaceC60442pS = this.A04;
        C51722Yv A16 = AbstractC25232BEp.A16(AbstractC25396BLn.A00(EnumC71343Hv.A0H, A00, new C29091CsI(c40971v4, this, 2), c120985dq, userSession, interfaceC60442pS, null, false, false), C05F.A04, DRT.A00(c25728BYo, 21));
        ExtendedImageUrl A1o = c40971v4.A0K.A1o(i);
        if (A1o == null) {
            return null;
        }
        C5G3 c5g3 = c40971v4.A0F;
        if (c5g3 != null && AbstractC166997dE.A1Z(c5g3.A06, true)) {
            return new C25622BUk(ImageView.ScaleType.CENTER_CROP, A16, interfaceC60442pS, A1o, null, null, interfaceC59142nF, null, 3, false, false);
        }
        return new C26645Bpg(ImageView.ScaleType.CENTER_CROP, A16, interfaceC60442pS, A1o, AbstractC25228BEl.A0A(c2z1, AbstractC77623dm.A06(c2z1)), AbstractC25232BEp.A0o(c2z1, 1.0d), -16777216, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a1, code lost:
    
        if (r4 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
    
        if (r4 != null) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C2WH A05(X.C2Z1 r18, X.C40971v4 r19, X.C25728BYo r20) {
        /*
            r17 = this;
            X.3ay r9 = X.C51722Yv.A02
            r0 = r17
            X.5dq r11 = r0.A01
            com.instagram.common.session.UserSession r12 = r0.A03
            X.2pS r13 = r0.A04
            X.3Hv r8 = X.EnumC71343Hv.A0H
            r4 = 4
            X.CsI r10 = new X.CsI
            r2 = r19
            r10.<init>(r2, r0, r4)
            r14 = 0
            r15 = 0
            r16 = r15
            X.2Yv r3 = X.AbstractC25396BLn.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = 23
            r1 = r20
            X.DRT r1 = X.DRT.A00(r1, r0)
            java.lang.Integer r0 = X.C05F.A04
            X.2Yv r7 = X.C9CV.A00(r3, r0, r1, r4)
            r8 = r18
            X.2Z0 r6 = X.AbstractC25233BEq.A0L(r8)
            java.lang.String r11 = r2.A03(r12)
            X.5G3 r4 = r2.A0F
            if (r4 == 0) goto L8f
            X.Dm8 r0 = r4.A04
            if (r0 == 0) goto L8f
            java.lang.Integer r0 = r0.Bxa()
            if (r0 == 0) goto L8f
            int r0 = r0.intValue()
            float r0 = (float) r0
            long r2 = X.AbstractC25232BEp.A0r(r0)
        L4b:
            X.Dm8 r0 = r4.A04
            if (r0 == 0) goto L96
            java.lang.String r0 = r0.getColor()
            if (r0 == 0) goto L96
            int r13 = android.graphics.Color.parseColor(r0)
        L59:
            X.Dm8 r0 = r4.A04
            if (r0 == 0) goto La4
            com.instagram.api.schemas.OverlayAdsTextStyleEnum r1 = r0.C36()
            if (r1 == 0) goto La4
            com.instagram.api.schemas.OverlayAdsTextStyleEnum r0 = com.instagram.api.schemas.OverlayAdsTextStyleEnum.A04
            boolean r12 = X.AbstractC167007dF.A1X(r0, r1)
        L69:
            android.graphics.Typeface r10 = android.graphics.Typeface.DEFAULT
            long r4 = X.AbstractC25229BEm.A0D()
            java.lang.Integer r9 = X.C05F.A00
            X.2XE r0 = r6.A00
            X.3dw r1 = X.AbstractC25231BEo.A0a(r0, r14, r11, r15)
            X.AbstractC25233BEq.A1B(r6, r1, r13, r2)
            r1.A0S(r12)
            X.AbstractC25234BEr.A0o(r10, r6, r1, r4)
            X.AbstractC25234BEr.A1I(r1, r9, r15)
            r0 = 1
            r1.A0M(r0)
            X.AbstractC25234BEr.A15(r6, r1, r15)
            X.2WH r0 = X.AbstractC76963ci.A0I(r6, r8, r7)
            return r0
        L8f:
            long r2 = X.AbstractC77623dm.A09(r6)
            if (r4 == 0) goto L96
            goto L4b
        L96:
            X.2XE r0 = r6.A00
            android.content.Context r1 = r0.A0C
            r0 = 2130970249(0x7f040689, float:1.7549203E38)
            int r13 = X.AbstractC25228BEl.A06(r1, r6, r0)
            if (r4 == 0) goto La4
            goto L59
        La4:
            r12 = 1
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26589Bom.A05(X.2Z1, X.1v4, X.BYo):X.2WH");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
    
        if (r3 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C51682Yq A06(X.C2Z1 r12, X.C40971v4 r13) {
        /*
            r0 = 2131969285(0x7f134505, float:1.9575489E38)
            java.lang.String r5 = X.AbstractC77623dm.A0F(r12, r0)
            X.5G3 r3 = r13.A0F
            if (r3 == 0) goto L85
            X.Dm8 r0 = r3.A03
            if (r0 == 0) goto L85
            java.lang.Integer r0 = r0.Bxa()
            if (r0 == 0) goto L85
            int r0 = r0.intValue()
            float r0 = (float) r0
            long r1 = X.AbstractC25232BEp.A0r(r0)
        L1e:
            X.Dm8 r0 = r3.A03
            if (r0 == 0) goto L8c
            java.lang.String r0 = r0.getColor()
            if (r0 == 0) goto L8c
            int r11 = android.graphics.Color.parseColor(r0)
        L2c:
            X.Dm8 r0 = r3.A03
            if (r0 == 0) goto L99
            com.instagram.api.schemas.OverlayAdsTextStyleEnum r3 = r0.C36()
            if (r3 == 0) goto L99
            com.instagram.api.schemas.OverlayAdsTextStyleEnum r0 = com.instagram.api.schemas.OverlayAdsTextStyleEnum.A04
            boolean r10 = X.AbstractC167007dF.A1X(r0, r3)
        L3c:
            android.graphics.Typeface r9 = android.graphics.Typeface.DEFAULT
            long r3 = X.AbstractC25229BEm.A0D()
            java.lang.Integer r8 = X.C05F.A00
            X.2XE r0 = r12.ArD()
            r7 = 0
            X.3dw r6 = X.C51682Yq.A03(r0, r7)
            r6.A0W(r5)
            r5 = 0
            r6.A0V(r5)
            r6.A0Q(r11)
            X.2XH r0 = r12.BoZ()
            X.AbstractC25230BEn.A1K(r6, r0, r10, r1)
            r6.A0T(r9)
            r6.A0F()
            int r0 = X.AbstractC25228BEl.A0A(r12, r3)
            X.AbstractC25234BEr.A18(r6, r12, r0, r3)
            int r0 = X.AbstractC25228BEl.A0A(r12, r3)
            float r0 = (float) r0
            r6.A0H(r0)
            X.AbstractC25234BEr.A1I(r6, r8, r7)
            r0 = 1
            r6.A0M(r0)
            X.AbstractC25229BEm.A1F(r6)
            r6.A06(r5)
            X.2Yq r0 = r6.A0A()
            return r0
        L85:
            long r1 = X.AbstractC77623dm.A09(r12)
            if (r3 == 0) goto L8c
            goto L1e
        L8c:
            X.2XE r0 = r12.ArD()
            android.content.Context r0 = r0.A0C
            int r11 = X.AbstractC25229BEm.A07(r0, r12)
            if (r3 == 0) goto L99
            goto L2c
        L99:
            r10 = 0
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26589Bom.A06(X.2Z1, X.1v4):X.2Yq");
    }
}
