package X;

import android.content.Context;
import com.facebook.R;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;

/* loaded from: classes12.dex */
public final class XVc extends AbstractC77583di {
    public static final C79933hi A0C = new Object();
    public final UserSession A00;
    public final InterfaceC80063hv A01;
    public final InterfaceC60442pS A02;
    public final C79723hN A03;
    public final InterfaceC79883hd A04;
    public final C30E A05;
    public final InterfaceC76053bA A06;
    public final CharSequence A07;
    public final boolean A08;
    public final C51722Yv A09;
    public final C79743hP A0A;
    public final C39D A0B;

    public XVc(C51722Yv c51722Yv, UserSession userSession, InterfaceC80063hv interfaceC80063hv, InterfaceC60442pS interfaceC60442pS, C79723hN c79723hN, InterfaceC79883hd interfaceC79883hd, C79743hP c79743hP, C39D c39d, C30E c30e, InterfaceC76053bA interfaceC76053bA, CharSequence charSequence, boolean z) {
        AbstractC25233BEq.A0x(2, c30e, interfaceC79883hd, interfaceC80063hv);
        AbstractC25233BEq.A0y(6, c39d, interfaceC60442pS, userSession);
        C14360o3.A0B(charSequence, 10);
        this.A0A = c79743hP;
        this.A05 = c30e;
        this.A03 = c79723hN;
        this.A04 = interfaceC79883hd;
        this.A01 = interfaceC80063hv;
        this.A0B = c39d;
        this.A06 = interfaceC76053bA;
        this.A02 = interfaceC60442pS;
        this.A00 = userSession;
        this.A07 = charSequence;
        this.A08 = z;
        this.A09 = c51722Yv;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0065, code lost:
    
        if (X.AbstractC86643tc.A01(r4, r15) == false) goto L9;
     */
    @Override // X.AbstractC77583di
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C78053eX A0Y(X.C77993eR r26) {
        /*
            r25 = this;
            r0 = 0
            r2 = r26
            X.C14360o3.A0B(r2, r0)
            r12 = r25
            X.3hN r5 = r12.A03
            X.3c7 r6 = r5.A08
            boolean r4 = X.AbstractC80003hp.A00(r6)
            X.3hL r1 = r5.A0A
            X.0sJ r3 = r1.A0I
            X.2XE r0 = r2.A05
            android.content.Context r0 = r0.A0C
            X.C14360o3.A07(r0)
            java.lang.Object r11 = r3.invoke(r0)
            X.3i3 r11 = (X.C80143i3) r11
            X.0sZ r0 = r1.A03
            java.lang.Object r9 = r0.invoke()
            X.9BD r9 = (X.C9BD) r9
            if (r4 == 0) goto Lcf
            X.0sJ r3 = r1.A0L
            X.39D r0 = r12.A0B
            java.lang.Object r13 = r3.invoke(r0)
            X.3i8 r13 = (X.C80193i8) r13
        L35:
            X.0sZ r0 = r1.A00
            boolean r17 = X.AbstractC25231BEo.A1b(r0)
            X.0sZ r0 = r1.A0D
            boolean r18 = X.AbstractC25231BEo.A1b(r0)
            com.instagram.common.session.UserSession r4 = r12.A00
            X.2xm r14 = X.AbstractC65492xl.A00(r4)
            X.1qM r10 = r6.A01
            boolean r7 = r14.A0Q
            X.0sZ r0 = r1.A04
            java.lang.Object r15 = r0.invoke()
            X.3tb r15 = (X.C86633tb) r15
            X.9Bd r0 = r15.A00
            java.lang.Object r0 = r0.A02
            X.0sZ r0 = (X.InterfaceC16820sZ) r0
            boolean r0 = X.AbstractC25231BEo.A1b(r0)
            if (r0 == 0) goto L67
            boolean r0 = X.AbstractC86643tc.A01(r4, r15)
            r19 = 1
            if (r0 != 0) goto L69
        L67:
            r19 = 0
        L69:
            boolean r0 = r14.A0M
            if (r0 == 0) goto L7a
            java.lang.String r3 = r5.A0J
            com.instagram.common.typedurl.ImageUrl r1 = r11.A02
            X.2pS r0 = r12.A02
            java.lang.String r0 = r0.getModuleName()
            X.AbstractC80203i9.A09(r1, r3, r0)
        L7a:
            java.lang.String r3 = r5.A0J
            com.instagram.common.typedurl.ImageUrl r1 = r11.A02
            X.2pS r0 = r12.A02
            java.lang.String r0 = r0.getModuleName()
            X.9EJ r16 = X.AbstractC80153i4.A00(r2, r4, r1, r3, r0)
            X.3i5 r6 = X.C80163i5.A00
            X.YL4 r21 = X.YL4.A00
            X.YC8 r3 = new X.YC8
            r3.<init>(r12)
            r0 = 4
            r4 = 1
            X.3dk r1 = X.C77603dk.A00
            X.2Yb r5 = new X.2Yb
            r5.<init>(r1, r3, r0, r4)
            X.YLF r8 = new X.YLF
            r20 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            long r23 = r2.A01()
            X.2YP r4 = new X.2YP
            r19 = r4
            r20 = r5
            r22 = r8
            r19.<init>(r20, r21, r22, r23)
            X.2Yv r5 = r12.A09
            X.3dr r1 = X.EnumC77673dr.A0K
            android.util.SparseArray r3 = X.AbstractC77703du.A00(r1)
            java.lang.Integer r1 = X.C05F.A0E
            X.9CV r2 = new X.9CV
            r2.<init>(r1, r3, r0)
            X.3ay r0 = X.C51722Yv.A02
            if (r5 != r0) goto Lc4
            r5 = 0
        Lc4:
            X.2Yv r1 = new X.2Yv
            r1.<init>(r5, r2)
            X.3eX r0 = new X.3eX
            r0.<init>(r1, r6, r4)
            return r0
        Lcf:
            r13 = 0
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XVc.A0Y(X.3eR):X.3eX");
    }

    public static final C72808XnV A03(SimpleZoomableViewContainer simpleZoomableViewContainer, XVc xVc) {
        C72808XnV c72808XnV;
        if (Systrace.A0E(1L)) {
            C0fO.A01("createOrGetPrimitiveHolder", -1119584390);
        }
        try {
            Object tag = simpleZoomableViewContainer.getTag(R.id.litho_playable_media_primitive);
            if (!(tag instanceof C72808XnV) || (c72808XnV = (C72808XnV) tag) == null) {
                Context context = simpleZoomableViewContainer.getContext();
                if (context != null) {
                    c72808XnV = new C72808XnV(context, xVc.A00, simpleZoomableViewContainer);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            simpleZoomableViewContainer.setTag(R.id.litho_playable_media_primitive, c72808XnV);
            if (Systrace.A0E(1L)) {
                C0fO.A00(482362101);
            }
            return c72808XnV;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-183864100);
            }
            throw th;
        }
    }

    public static final C79743hP A04(SimpleZoomableViewContainer simpleZoomableViewContainer, XVc xVc) {
        if (Systrace.A0E(1L)) {
            C0fO.A01("getBoundedLithoMediaViewHolder", 92048413);
        }
        try {
            C72808XnV A03 = A03(simpleZoomableViewContainer, xVc);
            C79743hP c79743hP = xVc.A0A;
            c79743hP.A00 = simpleZoomableViewContainer.getContext();
            c79743hP.A06 = A03.A03;
            c79743hP.A02(A03.A06);
            c79743hP.A08 = A03.A05;
            c79743hP.A01 = A03.A00;
            c79743hP.A02 = A03.A01;
            c79743hP.A07 = A03.A04;
            C3Y1 c3y1 = A03.A02;
            C14360o3.A0B(c3y1, 0);
            c79743hP.A05 = c3y1;
            if (Systrace.A0E(1L)) {
                C0fO.A00(-530236088);
            }
            return c79743hP;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-272787291);
            }
            throw th;
        }
    }
}
