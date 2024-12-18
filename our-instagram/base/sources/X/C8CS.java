package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.List;

/* renamed from: X.8CS, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8CS extends C193578hc implements C8BD {
    public C183688Ct A00;
    public C8XV A01;
    public AnonymousClass840 A02;
    public InterfaceC143326dX A03;
    public InterfaceC1810081c A04;
    public C28374Cfc A05;
    public PromptStickerModel A06;
    public C183978Ee A07;
    public boolean A08;
    public final UserSession A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;

    public static final void A02(C8CS c8cs, String str) {
        C38687GzS c38687GzS;
        C28224CcU A02 = ((C27270C1s) c8cs.A0B.getValue()).A02();
        if (A02 != null && (c38687GzS = A02.A01) != null) {
            AbstractC23641Du.A05(AnonymousClass191.A00, new MC9(c8cs, c38687GzS, str, (InterfaceC23621Ds) null, 29), AbstractC141776au.A00(c8cs));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8CS(Application application, UserSession userSession) {
        super(application);
        C8CT c8ct = new C8CT(userSession, application);
        C8CW c8cw = new C8CW(userSession);
        C8CX c8cx = new C8CX(application, userSession);
        C14360o3.A0B(application, 1);
        C14360o3.A0B(userSession, 2);
        this.A09 = userSession;
        this.A0A = AbstractC09440dt.A01(new C9F5(25, c8ct, new C8CY(c8ct.A00)));
        this.A0B = AbstractC09440dt.A01(new C9F5(26, c8cw, new C8CY(c8cw.A00)));
        this.A0C = AbstractC09440dt.A01(new C9F5(27, c8cx, new C8CY(c8cx.A00)));
    }

    public static final void A00(C8CS c8cs) {
        C38687GzS c38687GzS;
        C28224CcU A02 = ((C27270C1s) c8cs.A0B.getValue()).A02();
        if (A02 != null && (c38687GzS = A02.A01) != null) {
            AbstractC23641Du.A05(AnonymousClass191.A00, new C57171PZp(c38687GzS, c8cs, (InterfaceC23621Ds) null, 28), AbstractC141776au.A00(c8cs));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c4, code lost:
    
        if (r6 != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C8CS r18, X.C183978Ee r19) {
        /*
            r2 = r19
            X.8Ee r0 = r2.A0M
            if (r0 != 0) goto L7
            r0 = r2
        L7:
            r1 = r18
            r1.A07 = r0
            X.0do r0 = r1.A0B
            java.lang.Object r5 = r0.getValue()
            X.C1s r5 = (X.C27270C1s) r5
            r5.A01 = r2
            X.8Ee r0 = r2.A0M
            if (r0 == 0) goto L1a
            r2 = r0
        L1a:
            java.lang.String r12 = r2.A0h
            java.util.Map r4 = r5.A03
            java.lang.Object r8 = r4.get(r12)
            if (r8 != 0) goto L48
            android.graphics.Bitmap r13 = r2.A0C
            java.lang.String r1 = r2.A06()
            int r7 = r2.A07
            boolean r6 = r2.A14
            if (r13 != 0) goto L4e
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            android.graphics.Bitmap r13 = android.graphics.BitmapFactory.decodeFile(r1, r0)
            if (r13 != 0) goto L4e
        L3b:
            r9 = 0
        L3c:
            X.CcU r8 = new X.CcU
            r10 = 0
            r14 = 0
            r11 = r10
            r13 = r10
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r4.put(r12, r8)
        L48:
            X.05A r0 = r5.A05
            r0.Egh(r8)
            return
        L4e:
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            float r0 = (float) r7
            r3.postRotate(r0)
            r0 = 90
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r7 == r0) goto Lc4
            r0 = 270(0x10e, float:3.78E-43)
            if (r7 == r0) goto Lc4
            if (r6 != 0) goto L67
            r2 = 1065353216(0x3f800000, float:1.0)
        L67:
            r1 = r2
        L68:
            r2 = 1065353216(0x3f800000, float:1.0)
        L6a:
            r3.preScale(r1, r2)
            int r16 = r13.getWidth()
            int r17 = r13.getHeight()
            r14 = 0
            r6 = 1
            X.C0fK.A03(r13)
            r15 = r14
            r18 = r3
            r19 = r6
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r13, r14, r15, r16, r17, r18, r19)
            if (r9 == 0) goto L3b
            int r8 = r9.getWidth()
            int r0 = r9.getHeight()
            int r8 = r8 * r0
            com.instagram.common.session.UserSession r3 = r5.A02
            X.C14360o3.A0B(r3, r14)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36601363405082789(0x8208bf000e10a5, double:3.210187827010541E-306)
            long r0 = X.C18U.A01(r2, r3, r0)
            long r2 = (long) r8
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 < 0) goto L3c
            double r2 = (double) r0
            double r0 = (double) r8
            double r2 = r2 / r0
            double r7 = java.lang.Math.sqrt(r2)
            int r0 = r9.getWidth()
            double r0 = (double) r0
            double r0 = r0 * r7
            int r2 = X.C1H4.A00(r0)
            int r0 = r9.getHeight()
            double r0 = (double) r0
            double r0 = r0 * r7
            int r0 = X.C1H4.A00(r0)
            android.graphics.Bitmap r9 = X.C0fK.A00(r9, r2, r0, r6)
            goto L3c
        Lc4:
            if (r6 == 0) goto L68
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8CS.A01(X.8CS, X.8Ee):void");
    }

    public static final void A03(C8CS c8cs, boolean z) {
        Integer num;
        List A0A;
        String str;
        if (z) {
            num = C05F.A00;
        } else if (((C27270C1s) c8cs.A0B.getValue()).A06()) {
            num = C05F.A0C;
        } else {
            num = C05F.A01;
        }
        C28374Cfc c28374Cfc = c8cs.A05;
        if (c28374Cfc == null) {
            str = "magicModLogger";
        } else {
            C22C A01 = AnonymousClass229.A01(c28374Cfc.A01);
            C26086BgF c26086BgF = c28374Cfc.A00;
            C81X A00 = A0M.A00((EnumC193878i8) c26086BgF.A01);
            String str2 = c26086BgF.A03;
            int intValue = num.intValue();
            int i = 3;
            if (intValue != 0) {
                if (intValue != 1) {
                    i = 2;
                }
            } else {
                i = 1;
            }
            C18920wW c18920wW = ((C22F) A01).A01;
            InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "ig_camera_end_genai_session");
            EnumC114925Hg A0J = A01.A0J();
            C22M c22m = ((C22F) A01).A04;
            String str3 = c22m.A0L;
            if (A002.isSampled() && A0J != null && str3 != null) {
                A002.A8R(A0J, "camera_destination");
                A002.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                A002.A8p("event_type", 2);
                A002.A8R(EnumC50631MWs.A0I, "surface");
                A002.AAP("camera_session_id", str3);
                A002.AAP("module", C22F.A08.getModuleName());
                A002.AAP("nav_chain", C1QM.A00.A02.A00);
                A002.A8p("genai_exit_point", Integer.valueOf(i));
                A002.AAP(AbstractC43591JPw.A00(1152), str2);
                A002.A8R(A00, "camera_tool");
                A002.Cht();
            }
            InterfaceC143326dX interfaceC143326dX = c8cs.A03;
            if (interfaceC143326dX != null) {
                interfaceC143326dX.D5W(c8cs);
            }
            if (z) {
                C183688Ct c183688Ct = c8cs.A00;
                if (c183688Ct == null) {
                    str = "delegate";
                } else {
                    c183688Ct.A1K.DYS();
                    return;
                }
            } else {
                C27270C1s c27270C1s = (C27270C1s) c8cs.A0B.getValue();
                C183978Ee c183978Ee = c27270C1s.A01;
                if ((c183978Ee == null || (A0A = c183978Ee.A0A()) == null || A0A.isEmpty()) && c27270C1s.A00 != null) {
                    C28175CbN A003 = C27270C1s.A00(c27270C1s);
                    A003.A01 = null;
                    A003.A02.Egh(C5HZ.A01);
                    A003.A00 = null;
                    return;
                }
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void A0E(boolean z) {
        if (!z) {
            InterfaceC1810081c interfaceC1810081c = this.A04;
            if (interfaceC1810081c == null) {
                C14360o3.A0F("quickCaptureState");
                throw C00O.createAndThrow();
            }
            interfaceC1810081c.E4u(new Object());
        }
    }

    @Override // X.C8BD
    public final /* synthetic */ boolean onBackPressed() {
        return false;
    }
}
