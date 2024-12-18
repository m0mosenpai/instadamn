package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.PopupWindow;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.onecamera.configurations.AppSpecific;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.meta.foa.session.FoaUserSession;
import com.meta.metaai.components.voice.animation.ui.view.MetaAIListeningIndicatorView;
import go.Seq;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.DGk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29896DGk extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29896DGk(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static C29896DGk A00(Object obj, Object obj2, int i) {
        return new C29896DGk(i, obj, obj2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, X.AWB] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        CA0 ca0;
        MR9 mr9;
        boolean z;
        C25811BbS A00;
        CA0 ca02;
        MR9 mr92;
        C76223bS c76223bS;
        int i;
        AbstractC27448C9q c35;
        boolean z2;
        InterfaceC16660sJ interfaceC16660sJ;
        Object obj;
        InterfaceC16620sF interfaceC16620sF;
        Object obj2;
        Object obj3;
        C25809BbQ c25809BbQ;
        AbstractC27455C9x c27306C3n;
        C09530e4 A1L;
        String str2;
        switch (this.A00) {
            case 0:
                if (((EnumC27353C5i) this.A01).ordinal() == 0) {
                    InterfaceC30923Dia A01 = AbstractC28337CeP.A01((C76223bS) this.A02);
                    Integer num = C05F.A09;
                    C14360o3.A0B(A01, 0);
                    int AKz = AbstractC28379Cfi.A02(A01).AKz(num);
                    if (AbstractC28379Cfi.A02(A01).AVw(C05F.A00)) {
                        long A0A = AbstractC25225BEi.A0A(AKz);
                        c35 = new C36(AbstractC28379Cfi.A01(EnumC72394Xcg.A1q, A01), AbstractC28379Cfi.A01(EnumC72394Xcg.A0T, A01), AbstractC25228BEl.A07(r6, A0A), AbstractC25228BEl.A07(r6, A0A));
                    } else {
                        c35 = new C35(AbstractC25232BEp.A0l(r6, AKz), AbstractC28379Cfi.A01((EnumC72394Xcg) AbstractC28379Cfi.A02(A01).AEB(C05F.A0Y).A01, A01), AbstractC25232BEp.A0l(r6, r4.A00));
                    }
                    return new CV7(c35);
                }
                throw B4Z.A00();
            case 1:
                C26489BnA c26489BnA = (C26489BnA) this.A02;
                C76223bS c76223bS2 = (C76223bS) this.A01;
                boolean z3 = c26489BnA.A03;
                int i2 = c26489BnA.A01;
                long j = c26489BnA.A02;
                Drawable A0E = AbstractC77623dm.A0E(c76223bS2, c26489BnA.A00);
                if (z3) {
                    A0E = A0E.mutate();
                    AbstractC25228BEl.A1H(PorterDuff.Mode.SRC_ATOP, A0E, i2);
                }
                C14360o3.A0A(A0E);
                int A07 = AbstractC25228BEl.A07(c76223bS2, j);
                A0E.setBounds(0, 0, A07, A07);
                return A0E;
            case 2:
                BX7 bx7 = ((C26521Bng) this.A02).A00;
                bx7.A00();
                return Boolean.valueOf(AbstractC001900j.A0T(bx7.A00()));
            case 3:
                BX7 bx72 = ((C26521Bng) this.A02).A00;
                bx72.A00();
                z2 = true;
                if (bx72.A00().length() != 0) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 4:
                return new C29476Cyq((C51762Yz) this.A01, ((C26521Bng) this.A02).A00);
            case 5:
                Activity activity = (Activity) this.A01;
                C14360o3.A0C(activity, AbstractC58317Pt9.A00(7));
                C35256Fgp.A05((IgFragmentActivity) activity, new C19270xB("xav_cds_switcher"), (UserSession) this.A02, AbstractC111324zv.A00(375), "accounts_center_home", false);
                return C0eB.A00;
            case 6:
                C93F c93f = ((C26600Box) this.A02).A00;
                if (c93f != null) {
                    return c93f;
                }
                return C93F.A00(AbstractC25226BEj.A0P(this.A01));
            case 7:
                Canvas canvas = (Canvas) this.A01;
                MetaAIListeningIndicatorView metaAIListeningIndicatorView = (MetaAIListeningIndicatorView) this.A02;
                RadialGradient radialGradient = MetaAIListeningIndicatorView.A0S;
                canvas.scale(1.0f, metaAIListeningIndicatorView.A01, AbstractC166987dD.A02(metaAIListeningIndicatorView.getWidth()), AbstractC166987dD.A08(metaAIListeningIndicatorView));
                metaAIListeningIndicatorView.A0A.setAlpha(metaAIListeningIndicatorView.A05);
                RectF rectF = metaAIListeningIndicatorView.A0G;
                MetaAIListeningIndicatorView.A00(canvas, MetaAIListeningIndicatorView.A0R, metaAIListeningIndicatorView, rectF.centerX(), rectF.centerY(), rectF.width() / 200.0f, metaAIListeningIndicatorView.A02 * (rectF.height() / 200.0f));
                RectF rectF2 = metaAIListeningIndicatorView.A0F;
                MetaAIListeningIndicatorView.A00(canvas, MetaAIListeningIndicatorView.A0Q, metaAIListeningIndicatorView, rectF2.centerX(), rectF2.centerY(), rectF2.width() / 200.0f, (rectF2.height() / 200.0f) * metaAIListeningIndicatorView.A00);
                RectF rectF3 = metaAIListeningIndicatorView.A0H;
                MetaAIListeningIndicatorView.A00(canvas, MetaAIListeningIndicatorView.A0S, metaAIListeningIndicatorView, rectF3.centerX(), rectF3.centerY(), rectF3.width() / 200.0f, metaAIListeningIndicatorView.A03 * (rectF3.height() / 200.0f));
                RectF rectF4 = metaAIListeningIndicatorView.A0B;
                MetaAIListeningIndicatorView.A00(canvas, MetaAIListeningIndicatorView.A0M, metaAIListeningIndicatorView, rectF4.centerX(), rectF4.centerY(), rectF4.width() / 200.0f, rectF4.height() / 200.0f);
                RectF rectF5 = metaAIListeningIndicatorView.A0E;
                MetaAIListeningIndicatorView.A00(canvas, MetaAIListeningIndicatorView.A0P, metaAIListeningIndicatorView, rectF5.centerX(), rectF5.centerY(), rectF5.width() / 200.0f, rectF5.height() / 200.0f);
                RectF rectF6 = metaAIListeningIndicatorView.A0D;
                MetaAIListeningIndicatorView.A00(canvas, MetaAIListeningIndicatorView.A0O, metaAIListeningIndicatorView, rectF6.centerX(), rectF6.centerY(), rectF6.width() / 200.0f, rectF6.height() / 200.0f);
                RectF rectF7 = metaAIListeningIndicatorView.A0C;
                MetaAIListeningIndicatorView.A00(canvas, MetaAIListeningIndicatorView.A0N, metaAIListeningIndicatorView, rectF7.centerX(), rectF7.centerY(), rectF7.width() / 200.0f, rectF7.height() / 200.0f);
                return C0eB.A00;
            case 8:
                Canvas canvas2 = (Canvas) this.A01;
                C25735BYv c25735BYv = (C25735BYv) this.A02;
                int[] iArr = C25735BYv.A0b;
                canvas2.rotate(c25735BYv.A08, 0.0f, 0.0f);
                Paint paint = c25735BYv.A0R;
                paint.setAlpha((int) (c25735BYv.A0D.A05 * 255.0f));
                float max = Math.max(c25735BYv.A07 * 0.02f, 0.0f);
                Matrix matrix = c25735BYv.A0Q;
                float f = max + 2.3f;
                matrix.setScale(f, f, 0.0f, 0.0f);
                matrix.preTranslate(c25735BYv.A04 - 50.0f, -50.0f);
                LinearGradient linearGradient = c25735BYv.A0A;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                canvas2.drawCircle(0.0f, 0.0f, 50.0f, paint);
                return C0eB.A00;
            case 9:
                C25735BYv c25735BYv2 = (C25735BYv) this.A02;
                int[] iArr2 = C25735BYv.A0b;
                Paint paint2 = c25735BYv2.A0R;
                paint2.setShader(c25735BYv2.A0B);
                Canvas canvas3 = (Canvas) this.A01;
                canvas3.drawCircle(0.0f, 0.0f, 50.0f, paint2);
                paint2.setShader(c25735BYv2.A0C);
                canvas3.drawCircle(0.0f, 0.0f, 50.0f, paint2);
                return C0eB.A00;
            case 10:
                C75933ay c75933ay = C51722Yv.A02;
                C51722Yv A17 = AbstractC25232BEp.A17(C05F.A01, AbstractC111324zv.A00(346), 0);
                String A0F = AbstractC77623dm.A0F((C76223bS) this.A01, 2131966560);
                C26570BoT c26570BoT = (C26570BoT) this.A02;
                float[] fArr = C26570BoT.A0L;
                String A0G = AnonymousClass001.A0G(A0F, ' ', c26570BoT.A03 + 1);
                if (A0G != null) {
                    A17 = C9CV.A00(A17, C05F.A0N, A0G, 0);
                }
                return AbstractC25225BEi.A0h(A17, AbstractC25225BEi.A0o(C05F.A0j, 1, 0));
            case 11:
                C76223bS c76223bS3 = (C76223bS) this.A01;
                C75933ay c75933ay2 = C51722Yv.A02;
                C51722Yv A0d = AbstractC25230BEn.A0d(AbstractC25233BEq.A0e(C05F.A01, 100.0f, 0), C05F.A00, 100.0f, 0);
                C26360Bl5 c26360Bl5 = (C26360Bl5) this.A02;
                return CCI.A00(c76223bS3, A0d.A00(c26360Bl5.A00), C30482DbR.A00(c26360Bl5, 42));
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                interfaceC16660sJ = ((C27333C4o) this.A02).A0J;
                OLN oln = ((C53043NdI) ((AbstractC27457C9z) this.A01)).A00;
                if (oln != null) {
                    obj = new C27325C4g(oln);
                    interfaceC16660sJ.invoke(obj);
                    return C0eB.A00;
                }
                throw AbstractC166997dE.A0g();
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C27333C4o c27333C4o = (C27333C4o) this.A02;
                Application A0B = c27333C4o.A0B();
                FoaUserSession foaUserSession = ((AbstractC28375Cfd) c27333C4o).A01;
                EnumC27387C6q enumC27387C6q = (EnumC27387C6q) this.A01;
                CWR cwr = c27333C4o.A0E;
                return new C28895Cp3(A0B, foaUserSession, c27333C4o.A09, cwr.A05, enumC27387C6q, cwr.A02.toString(), C1AD.A06(C06090Tz.A05, 2324156444821175195L), false, false);
            case 14:
                C27333C4o c27333C4o2 = (C27333C4o) this.A02;
                C25812BbT c25812BbT = c27333C4o2.A01;
                if (c25812BbT == null) {
                    C14360o3.A0F("viewModel");
                    throw C00O.createAndThrow();
                }
                z2 = true;
                if (this.A01 == null) {
                    c25812BbT.A0E();
                } else {
                    c27333C4o2.A0L(DQK.A00);
                }
                return Boolean.valueOf(z2);
            case Process.SIGTERM /* 15 */:
                C26491BnC c26491BnC = (C26491BnC) this.A02;
                C27988CVl c27988CVl = c26491BnC.A00;
                if (c27988CVl != null) {
                    CWM cwm = c27988CVl.A02;
                    Object obj4 = this.A01;
                    if (c26491BnC.A05) {
                        c26491BnC.A02.invoke(cwm, obj4);
                    } else {
                        interfaceC16660sJ = c26491BnC.A01;
                        obj = new C3Z(cwm);
                        interfaceC16660sJ.invoke(obj);
                    }
                }
                return C0eB.A00;
            case 16:
                C26491BnC c26491BnC2 = (C26491BnC) this.A02;
                C27988CVl c27988CVl2 = c26491BnC2.A00;
                if (c27988CVl2 != null) {
                    C76223bS c76223bS4 = (C76223bS) this.A01;
                    c26491BnC2.A01.invoke(new C27296C3c(AbstractC167007dF.A1X(c27988CVl2.A02.A01, C05F.A0N), c27988CVl2.A00));
                    return new BitmapDrawable(AbstractC25229BEm.A0O(c76223bS4), c27988CVl2.A01);
                }
                return null;
            case 17:
                C26492BnD c26492BnD = (C26492BnD) this.A02;
                interfaceC16620sF = c26492BnD.A05;
                if (interfaceC16620sF != null) {
                    obj2 = c26492BnD.A01;
                    obj3 = this.A01;
                    interfaceC16620sF.invoke(obj2, obj3);
                }
                return C0eB.A00;
            case 18:
                C76223bS c76223bS5 = (C76223bS) this.A01;
                int A0l = AbstractC167007dF.A0K(AbstractC77363dM.A00(c76223bS5)).widthPixels - AbstractC25232BEp.A0l(c76223bS5, 32.0d);
                C26576BoZ c26576BoZ = (C26576BoZ) this.A02;
                if (c26576BoZ.A03 == EnumC27372C6b.A02 && c26576BoZ.A04 == C7N.A04) {
                    C75933ay c75933ay3 = C51722Yv.A02;
                    return C9CU.A00(null, C05F.A0N, 0, AbstractC25229BEm.A0K(A0l));
                }
                return C51722Yv.A02;
            case Process.SIGSTOP /* 19 */:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                CWM cwm2 = (CWM) this.A02;
                obj = new C27301C3i(cwm2.A07, cwm2.A08);
                interfaceC16660sJ.invoke(obj);
                return C0eB.A00;
            case 20:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A02;
                obj = new C27299C3f((C27990CVn) this.A01, false);
                interfaceC16660sJ.invoke(obj);
                return C0eB.A00;
            case 21:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                obj = new C3W((CWM) this.A02);
                interfaceC16660sJ.invoke(obj);
                return C0eB.A00;
            case 22:
                C26559BoI c26559BoI = (C26559BoI) this.A02;
                CharSequence A002 = c26559BoI.A00.A00();
                String obj5 = A002.toString();
                C28272CdH c28272CdH = c26559BoI.A01;
                String str3 = c28272CdH.A00;
                if (C14360o3.A0K(obj5, str3) && (str2 = c28272CdH.A01) != null) {
                    A1L = AbstractC166987dD.A1L(str2, str3);
                } else {
                    A1L = AbstractC166987dD.A1L(AbstractC001900j.A0B(A002), null);
                }
                CharSequence charSequence = (CharSequence) A1L.A00;
                String str4 = (String) A1L.A01;
                boolean A1Y = AbstractC25225BEi.A1Y(charSequence);
                interfaceC16660sJ = c26559BoI.A03;
                if (A1Y) {
                    obj = new C27304C3l((C28275CdK) this.A01, charSequence, str4);
                } else {
                    obj = new C27300C3g(str4, charSequence);
                }
                interfaceC16660sJ.invoke(obj);
                return C0eB.A00;
            case 23:
                C26559BoI c26559BoI2 = (C26559BoI) this.A02;
                CharSequence A003 = c26559BoI2.A00.A00();
                C14510oO c14510oO = (C14510oO) this.A01;
                if (c14510oO.A00) {
                    c26559BoI2.A03.invoke(new C27300C3g(null, A003));
                }
                c14510oO.A00 = true;
                return C0eB.A00;
            case 24:
                AbstractC27456C9y abstractC27456C9y = ((C26559BoI) this.A02).A02;
                AbstractC27454C9w abstractC27454C9w = null;
                if (abstractC27456C9y instanceof C45) {
                    C45 c45 = (C45) abstractC27456C9y;
                    if (c45 != null) {
                        abstractC27454C9w = c45.A02;
                    }
                    boolean z4 = abstractC27454C9w instanceof C3U;
                    c76223bS = (C76223bS) this.A01;
                    if (z4) {
                        i = 2131966484;
                    } else {
                        i = 2131966485;
                    }
                } else {
                    c76223bS = (C76223bS) this.A01;
                    i = 2131966499;
                }
                return AbstractC77623dm.A0F(c76223bS, i);
            case 25:
            case 26:
            default:
                AbstractC166987dD.A1Y(this.A01);
                ((PopupWindow) this.A02).dismiss();
                return C0eB.A00;
            case 27:
                c25809BbQ = ((C26432BmF) this.A02).A00;
                CWM cwm3 = (CWM) this.A01;
                c27306C3n = new C27301C3i(cwm3.A07, cwm3.A08);
                c25809BbQ.A0E(c27306C3n);
                return C0eB.A00;
            case 28:
                c25809BbQ = ((C26432BmF) this.A02).A00;
                c27306C3n = new C27299C3f((C27990CVn) this.A01, true);
                c25809BbQ.A0E(c27306C3n);
                return C0eB.A00;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                c25809BbQ = ((C26432BmF) this.A02).A00;
                CWM cwm4 = (CWM) this.A01;
                c27306C3n = new C27306C3n(cwm4.A02, cwm4.A01, cwm4.A04, cwm4.A0A, true);
                c25809BbQ.A0E(c27306C3n);
                return C0eB.A00;
            case 30:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A02;
                obj = this.A01;
                interfaceC16660sJ.invoke(obj);
                return C0eB.A00;
            case 31:
                interfaceC16620sF = (InterfaceC16620sF) this.A02;
                obj2 = this.A01;
                obj3 = null;
                interfaceC16620sF.invoke(obj2, obj3);
                return C0eB.A00;
            case 32:
                C26404Bln c26404Bln = (C26404Bln) this.A02;
                interfaceC16620sF = c26404Bln.A03;
                obj2 = c26404Bln.A01;
                obj3 = this.A01;
                interfaceC16620sF.invoke(obj2, obj3);
                return C0eB.A00;
            case 33:
                List list = (List) this.A01;
                C26571BoU c26571BoU = (C26571BoU) this.A02;
                ArrayList A0q = AbstractC167017dG.A0q(list);
                int i3 = 0;
                for (Object obj6 : list) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        AbstractC16960so.A1U();
                        throw C00O.createAndThrow();
                    }
                    C28266CdB c28266CdB = (C28266CdB) obj6;
                    Integer num2 = c28266CdB.A02;
                    C26404Bln c26404Bln2 = null;
                    r2 = null;
                    r2 = null;
                    r2 = null;
                    C30182DRn c30182DRn = null;
                    c26404Bln2 = null;
                    if (num2 == C05F.A01 && c26571BoU.A01 != C05F.A0C) {
                        if (c26571BoU.A04) {
                            CWM cwm5 = c28266CdB.A01;
                            if (c26571BoU.A03 && cwm5 != null && AbstractC25225BEi.A1Y(cwm5.A04)) {
                                c30182DRn = C30182DRn.A01(c26571BoU, 18);
                            }
                        }
                        c26404Bln2 = new C26404Bln(c28266CdB, c30182DRn, new D5Q(c26571BoU, 2), i3);
                    }
                    A0q.add(new C3S(c26404Bln2, c28266CdB, i3, AbstractC167007dF.A1X(num2, C05F.A0C)));
                    i3 = i4;
                }
                return A0q;
            case 34:
                C76223bS c76223bS6 = (C76223bS) this.A01;
                long A02 = AbstractC28406CgC.A02(c76223bS6, C05F.A0X);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                gradientDrawable.setColors(new int[]{AbstractC77623dm.A03(c76223bS6, R.color.fds_transparent), AbstractC77623dm.A03(c76223bS6, R.color.action_bar_transparent_background_pressed_state), AbstractC77623dm.A03(c76223bS6, R.color.suggestion_card_gradient_drawable_end)});
                gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, AbstractC25228BEl.A07(c76223bS6, A02), AbstractC25228BEl.A07(c76223bS6, A02), AbstractC25228BEl.A07(c76223bS6, A02), AbstractC25228BEl.A07(c76223bS6, A02)});
                return gradientDrawable;
            case 35:
                C28002CVz c28002CVz = (C28002CVz) this.A01;
                if (c28002CVz != null) {
                    C25812BbT.A05((C25812BbT) this.A02, null, null, c28002CVz.A01, null);
                }
                return C0eB.A00;
            case 36:
                KKH kkh = ((C27884CQv) this.A01).A00;
                if (kkh != null && (mr92 = kkh.A02) != null) {
                    z = mr92.onBackPressed();
                } else {
                    z = false;
                }
                if (!z) {
                    C27332C4n c27332C4n = (C27332C4n) this.A02;
                    if (c27332C4n.A06.A0A) {
                        A00 = C27332C4n.A00(c27332C4n);
                        ca02 = C4K.A00;
                    } else {
                        c27332C4n.A0L(null);
                        A00 = C27332C4n.A00(c27332C4n);
                        ca02 = C4S.A00;
                    }
                    A00.A0F(ca02);
                }
                return true;
            case 37:
                FoaUserSession foaUserSession2 = (FoaUserSession) this.A01;
                CWL cwl = ((C27332C4n) this.A02).A06;
                String str5 = cwl.A04;
                String str6 = cwl.A03;
                if (str6 == null) {
                    str6 = AbstractC25231BEo.A0p();
                }
                return new C28421CgT(cwl.A00, cwl.A01, foaUserSession2, str5, str6, "0", cwl.A05, cwl.A07);
            case 38:
                C27332C4n c27332C4n2 = (C27332C4n) this.A02;
                Application A0B2 = c27332C4n2.A0B();
                FoaUserSession foaUserSession3 = (FoaUserSession) this.A01;
                C7H c7h = c27332C4n2.A05;
                boolean z5 = c27332C4n2.A0E;
                CWL cwl2 = c27332C4n2.A06;
                return new C25888Bco(A0B2, foaUserSession3, (C28421CgT) c27332C4n2.A0A.getValue(), c7h, cwl2.A05, cwl2.A06, z5, cwl2.A0A);
            case 39:
                KKH kkh2 = ((C27884CQv) this.A01).A00;
                if (kkh2 == null || (mr9 = kkh2.A02) == null || !mr9.onBackPressed()) {
                    C27330C4l c27330C4l = (C27330C4l) this.A02;
                    boolean z6 = c27330C4l.A05.A0A;
                    C25806BbN A004 = C27330C4l.A00(c27330C4l);
                    if (z6) {
                        ca0 = C4K.A00;
                    } else {
                        ca0 = C4U.A00;
                    }
                    A004.A0F(ca0);
                }
                return AbstractC166997dE.A0b();
            case 40:
                FoaUserSession foaUserSession4 = (FoaUserSession) this.A01;
                CWL cwl3 = ((C27330C4l) this.A02).A05;
                String str7 = cwl3.A04;
                String str8 = cwl3.A03;
                if (str8 == null) {
                    str8 = AbstractC25231BEo.A0p();
                }
                return new C28421CgT(cwl3.A00, cwl3.A01, foaUserSession4, str7, str8, AbstractC25231BEo.A0p(), cwl3.A05, cwl3.A07);
            case Seq.NULL_REFNUM /* 41 */:
                C27330C4l c27330C4l2 = (C27330C4l) this.A02;
                return new C25885Bcl(c27330C4l2.A0B(), (FoaUserSession) this.A01, (C28421CgT) c27330C4l2.A07.getValue(), c27330C4l2.A05, c27330C4l2.A0A);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                Context A005 = AbstractC77363dM.A00((C2Z0) this.A01);
                if (!(A005 instanceof Activity) && (A005 = C51362Xj.A00(A005)) == null) {
                    throw AbstractC166987dD.A14("Unable to find activity with context");
                }
                android.net.Uri A0B3 = AbstractC25227BEk.A0B(AnonymousClass001.A0R(AbstractC43591JPw.A00(88), A005.getPackageName()));
                Intent intent = new Intent(AbstractC58317Pt9.A00(18));
                intent.setData(A0B3);
                C0b3.A00().A04().A0G(A005, intent);
                return C0eB.A00;
            case 43:
                C27947CTg c27947CTg = (C27947CTg) this.A01;
                if (c27947CTg.A00 == 0) {
                    interfaceC16660sJ = ((C26550Bo9) this.A02).A01;
                    obj = C4J.A00;
                } else {
                    c27947CTg.A00();
                    interfaceC16660sJ = ((C26550Bo9) this.A02).A01;
                    obj = new C4F(C29499CzD.A00);
                }
                interfaceC16660sJ.invoke(obj);
                return C0eB.A00;
            case 44:
                ((C26405Blo) this.A02).A02.invoke(((C51762Yz) this.A01).A03);
                return null;
            case 45:
                C2Z0 c2z0 = (C2Z0) this.A01;
                AbstractC86593tX.A0T(AbstractC77363dM.A00(c2z0), ((C26405Blo) this.A02).A00, AbstractC77623dm.A0F(c2z0, 2131966198));
                return C0eB.A00;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                interfaceC16660sJ = ((C26405Blo) this.A02).A01;
                obj = new C4I((List) this.A01, false);
                interfaceC16660sJ.invoke(obj);
                return C0eB.A00;
            case 47:
                Context A0P = AbstractC25226BEj.A0P(this.A01);
                C26493BnE c26493BnE = (C26493BnE) this.A02;
                FoaUserSession foaUserSession5 = c26493BnE.A00;
                C30182DRn A012 = C30182DRn.A01(c26493BnE, 46);
                C14360o3.A0B(foaUserSession5, 1);
                UserSession A006 = AbstractC28057CYl.A00(foaUserSession5);
                C23324AVj c23324AVj = new C23324AVj(A0P, EnumC142606cM.A01, A006, "memu_onboarding");
                CAE.A00 = c23324AVj;
                c23324AVj.A08.A07.A01 = new C29103CsU(A012);
                C14360o3.A0B(A006, 1);
                C178017va c178017va = new C178017va("memu_onboarding");
                c178017va.A02(InterfaceC178047vd.A00, A006);
                c178017va.A02(BE1.A01, true);
                C178027vb c178027vb = new C178027vb(c178017va);
                AbstractC177217uH.A02 = true;
                ?? obj7 = new Object();
                C23384AYi A007 = AGW.A00.A00(A0P, c178027vb, new C178177vr(AppSpecific.class), new C23430Aa3(obj7, c23324AVj));
                obj7.A00 = A007;
                C23432Aa5 c23432Aa5 = new C23432Aa5(A007);
                c23432Aa5.A03(1);
                C23432Aa5.A00(c23432Aa5).EbP(921600);
                C23432Aa5.A00(c23432Aa5).Eal(12582912);
                C23432Aa5.A00(c23432Aa5).EeQ(false);
                C23432Aa5.A00(c23432Aa5).ETP(false);
                return c23432Aa5;
            case 48:
                C75933ay c75933ay4 = C51722Yv.A02;
                C51722Yv A0C = AbstractC25234BEr.A0C(null, AbstractC25225BEi.A0m(C05F.A00, 100.0f, 0), 0);
                C26473Bmu c26473Bmu = (C26473Bmu) this.A02;
                C76223bS c76223bS7 = (C76223bS) this.A01;
                InterfaceC16660sJ interfaceC16660sJ2 = c26473Bmu.A04;
                String str9 = c26473Bmu.A01;
                if (str9 != null && (str = c26473Bmu.A02) != null) {
                    C2Z0 A0J = AbstractC25233BEq.A0J(c76223bS7);
                    A0J.A00(new C26601Boy(AbstractC25230BEn.A0e(A0C, C05F.A0Y, C30181DRm.A01(c26473Bmu, 13), null), str9, str));
                    return AbstractC25227BEk.A0W(c26473Bmu.A00, A0J, c76223bS7, A0C);
                }
                if (interfaceC16660sJ2 != null) {
                    return interfaceC16660sJ2.invoke(A0C);
                }
                return new C75723ad();
            case 49:
                interfaceC16660sJ = ((C28276CdL) this.A01).A06;
                obj = ((C26331Bkc) this.A02).A01;
                interfaceC16660sJ.invoke(obj);
                return C0eB.A00;
        }
    }
}
