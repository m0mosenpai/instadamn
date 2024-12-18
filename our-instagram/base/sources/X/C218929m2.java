package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.List;
import java.util.Map;

/* renamed from: X.9m2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218929m2 extends C8FA {
    public boolean A00;
    public final int A01;
    public final Drawable A02;
    public final Drawable A03;
    public final Map A04;
    public final int A05;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C218929m2(android.content.Context r15, X.C183688Ct r16, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r17, long r18) {
        /*
            r14 = this;
            r0 = r17
            r9 = 0
            r12 = 0
            r11 = 111(0x6f, float:1.56E-43)
            r7 = r14
            r8 = r16
            r10 = r9
            r13 = r12
            r7.<init>(r8, r9, r10, r11, r12, r13)
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r0 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0
            int r5 = r0.A06
            r14.A05 = r5
            int r0 = r0.A04
            r14.A01 = r0
            r0 = 2131971362(0x7f134d22, float:1.9579701E38)
            java.lang.String r3 = X.AbstractC166997dE.A0p(r15, r0)
            X.0qp r2 = X.EnumC15950qp.A0S
            r0 = 2131165536(0x7f070160, float:1.7945292E38)
            X.6RB r1 = X.AbstractC166987dD.A0z(r15, r5)
            r1.A0M(r3)
            int r0 = X.AMo.A00(r15, r0)
            float r0 = (float) r0
            r1.A0A(r0)
            X.0qs r0 = X.AbstractC15960qq.A00(r15)
            X.AbstractC166987dD.A1U(r2, r0, r1)
            r14.A03 = r1
            java.util.Calendar r6 = java.util.Calendar.getInstance()
            r3 = r18
            r6.setTimeInMillis(r3)
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r0 = "MMMM"
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r0, r2)
            r2 = 2131971361(0x7f134d21, float:1.95797E38)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.lang.String r1 = r1.format(r0)
            r0 = 4
            int r0 = r6.get(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.String r3 = r15.getString(r2, r0)
            X.C14360o3.A07(r3)
            X.0qp r2 = X.EnumC15950qp.A0F
            r0 = 2131165332(0x7f070094, float:1.7944878E38)
            X.6RB r1 = X.AbstractC166987dD.A0z(r15, r5)
            r1.A0M(r3)
            int r0 = X.AMo.A00(r15, r0)
            float r0 = (float) r0
            r1.A0A(r0)
            X.0qs r0 = X.AbstractC15960qq.A00(r15)
            X.AbstractC166987dD.A1U(r2, r0, r1)
            r14.A02 = r1
            X.0sk r0 = X.AbstractC06930Yk.A0E()
            r14.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C218929m2.<init>(android.content.Context, X.8Ct, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, long):void");
    }

    public static final void A01(Drawable drawable, C218929m2 c218929m2, int i) {
        int intrinsicWidth = (c218929m2.A05 - drawable.getIntrinsicWidth()) / 2;
        Rect A0V = AbstractC166987dD.A0V(intrinsicWidth, i, drawable.getIntrinsicWidth() + intrinsicWidth, drawable.getIntrinsicHeight() + i);
        C8FC c8fc = new C8FC((C8D0) new C221619qQ(A0V), (C8FD) null, (C89G) null, C05F.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 0, true, false, true, true, false, false, false, true, true, true, true, true, false, false);
        ((C8FA) c218929m2).A02.A0h(drawable, c218929m2.A02(), c8fc, null, C148276lx.A1K.A01());
    }
}
