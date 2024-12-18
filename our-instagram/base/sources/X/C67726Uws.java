package X;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.form.view.FormLayout;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.banner.FBPayBanner;
import com.facebookpay.widget.button.FBPayButton;
import java.util.LinkedHashMap;

/* renamed from: X.Uws, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67726Uws extends AbstractC66388UEw implements XCE {
    public ContextThemeWrapper A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public ViewGroup A05;
    public FrameLayout A06;
    public FrameLayout A07;
    public FrameLayout A08;
    public LinearLayout A09;
    public LinearLayout A0A;
    public ProgressBar A0B;
    public TextView A0C;
    public ConstraintLayout A0D;
    public NestedScrollView A0E;
    public C67650Uuf A0F;
    public C67648Uud A0G;
    public ECPHandler A0H;
    public ECPPaymentRequest A0I;
    public VEY A0J;
    public UFU A0K;
    public C67672Uvk A0L;
    public FormLayout A0M;
    public UFM A0N;
    public LoggingContext A0O;
    public FBPayBanner A0P;
    public FBPayButton A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public LayoutInflater A0U;
    public final C2GS A0V = new C2GS();
    public final InterfaceC58362lv A0Z = new C70303WQi(this, 34);
    public final InterfaceC58362lv A0X = new C70303WQi(this, 32);
    public final InterfaceC58362lv A0a = new C70303WQi(this, 36);
    public final InterfaceC16620sF A0c = new C30505Dbo(this, 6);
    public final InterfaceC58362lv A0Y = new C70303WQi(this, 33);
    public final InterfaceC58362lv A0W = new C70303WQi(this, 31);
    public final WOB A0b = new WOB(this, 1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0127  */
    @Override // X.AbstractC66388UEw, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r26, android.os.Bundle r27) {
        /*
            Method dump skipped, instructions count: 1683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67726Uws.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void A02() {
        String str;
        ConstraintLayout constraintLayout = this.A0D;
        if (constraintLayout == null) {
            str = "productDetailsContainer";
        } else {
            constraintLayout.setVisibility(8);
            FrameLayout frameLayout = this.A07;
            str = "orderSummaryContainer";
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                WDM wdm = (WDM) A08().A0T.get(EnumC129485tD.A0C);
                if (wdm != null) {
                    wdm.A02(new X2w(this, 9));
                }
                LoggingContext A09 = A09();
                VG3 vg3 = VG3.A0Q;
                UGL ugl = new UGL(VG3.A0p, A09(), true);
                UGL ugl2 = new UGL(VG3.A0g, A09(), true);
                UGL ugl3 = new UGL(VG3.A0d, A09(), true);
                UGL ugl4 = new UGL(VG3.A0i, A09(), true);
                ContextThemeWrapper contextThemeWrapper = this.A00;
                if (contextThemeWrapper == null) {
                    str = "wrapperContext";
                } else {
                    UuD uuD = new UuD(contextThemeWrapper, A09());
                    ((UGL) uuD).A00 = new WNV(26, uuD, this);
                    LinkedHashMap A06 = AbstractC06930Yk.A06(new C09530e4(ugl.A02, ugl), new C09530e4(ugl2.A02, ugl2), new C09530e4(ugl3.A02, ugl3), new C09530e4(uuD.A02, uuD), new C09530e4(ugl4.A02, ugl4));
                    ECPPaymentRequest eCPPaymentRequest = this.A0I;
                    if (eCPPaymentRequest == null) {
                        str = "ecpPaymentRequest";
                    } else {
                        C67648Uud c67648Uud = new C67648Uud(vg3, A09, A06, new C30505Dbo(this, 7), WGr.A0L(eCPPaymentRequest));
                        this.A0G = c67648Uud;
                        FrameLayout frameLayout2 = this.A07;
                        if (frameLayout2 != null) {
                            C67650Uuf A08 = c67648Uud.A08(frameLayout2);
                            C14360o3.A0C(A08, "null cannot be cast to non-null type com.facebookpay.common.recyclerview.viewbinders.AccordionViewBinder.AccordionViewHolder");
                            this.A0F = A08;
                            FrameLayout frameLayout3 = this.A07;
                            if (frameLayout3 != null) {
                                frameLayout3.addView(A08.itemView);
                                AbstractC43593JPy.A1E(this, A08().A0B, new X58(this, 34), 6);
                                return;
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A03(Bundle bundle, C67726Uws c67726Uws) {
        bundle.putBoolean("ECP_NUX_FLOW", true);
        bundle.putBoolean("IS_ECP_NUX_FORM_SCREEN", false);
        Fragment fragment = c67726Uws.mParentFragment;
        if (fragment != null) {
            WCw.A00(bundle, fragment, "content_bottom_sheet_fragment", true, true);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A04(C67726Uws c67726Uws) {
        ContextThemeWrapper contextThemeWrapper = c67726Uws.A00;
        IBinder iBinder = null;
        if (contextThemeWrapper == null) {
            C14360o3.A0F("wrapperContext");
            throw C00O.createAndThrow();
        }
        InputMethodManager A0A = AbstractC65703TsZ.A0A(contextThemeWrapper);
        View view = c67726Uws.mView;
        if (view != null) {
            iBinder = view.getWindowToken();
        }
        A0A.hideSoftInputFromWindow(iBinder, 0);
        View view2 = c67726Uws.mView;
        if (view2 != null) {
            view2.clearFocus();
        }
    }

    public final UFU A08() {
        UFU ufu = this.A0K;
        if (ufu != null) {
            return ufu;
        }
        C14360o3.A0F("nuxViewModel");
        throw C00O.createAndThrow();
    }

    public final LoggingContext A09() {
        LoggingContext loggingContext = this.A0O;
        if (loggingContext != null) {
            return loggingContext;
        }
        C14360o3.A0F("loggingContext");
        throw C00O.createAndThrow();
    }

    @Override // X.XCE
    public final void ETZ(ECPHandler eCPHandler) {
        this.A0H = eCPHandler;
        if (this.A0K != null) {
            A08().A09(this.A0H);
            A02();
        }
    }

    public static final C63198Sf0 A01(C67726Uws c67726Uws) {
        W5t A0A = C2FP.A0A();
        ContextThemeWrapper contextThemeWrapper = c67726Uws.A00;
        if (contextThemeWrapper != null) {
            Drawable A03 = A0A.A03(contextThemeWrapper);
            ContextThemeWrapper contextThemeWrapper2 = c67726Uws.A00;
            if (contextThemeWrapper2 != null) {
                String A0p = AbstractC166997dE.A0p(contextThemeWrapper2, 2131961424);
                ContextThemeWrapper contextThemeWrapper3 = c67726Uws.A00;
                if (contextThemeWrapper3 != null) {
                    String A0p2 = AbstractC166997dE.A0p(contextThemeWrapper3, 2131961423);
                    ContextThemeWrapper contextThemeWrapper4 = c67726Uws.A00;
                    if (contextThemeWrapper4 != null) {
                        VEJ vej = VEJ.A05;
                        String A0p3 = AbstractC166997dE.A0p(contextThemeWrapper4, 2131961426);
                        return AbstractC69850Vwb.A01(A03, vej.A01, null, new WbP(c67726Uws, 3), new WbQ(c67726Uws), A0p, A0p2, A0p3, null, null, null, true);
                    }
                }
            }
        }
        C14360o3.A0F("wrapperContext");
        throw C00O.createAndThrow();
    }

    public static final void A05(C67726Uws c67726Uws) {
        R1R r1r = (R1R) c67726Uws.A08().A0F.A02();
        EnumC72407Xcu enumC72407Xcu = null;
        if (r1r != null) {
            enumC72407Xcu = WGr.A0D(r1r);
        }
        if (!AbstractC167007dF.A1X(enumC72407Xcu, EnumC72407Xcu.A06) && c67726Uws.A08().A0S.A02 && c67726Uws.A08().A0B()) {
            FrameLayout frameLayout = c67726Uws.A08;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
        } else {
            FrameLayout frameLayout2 = c67726Uws.A08;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
                return;
            }
        }
        C14360o3.A0F("otcOptionContainer");
        throw C00O.createAndThrow();
    }

    public static final void A06(C67726Uws c67726Uws) {
        W6Y.A02(c67726Uws.A08(), "otc_back_button");
        C2FP.A01().A04.A0a(c67726Uws.A09(), "pux_checkout", UFS.A01(c67726Uws.A08().A0S));
        new Bundle(c67726Uws.requireArguments()).putBoolean("IS_ECP_NUX_FORM_SCREEN", false);
        InterfaceC08430c6 interfaceC08430c6 = c67726Uws.mParentFragment;
        C14360o3.A0C(interfaceC08430c6, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.BottomSheetDialogController");
        ((InterfaceC72028XFq) interfaceC08430c6).Cnu();
    }

    public static final void A07(C67726Uws c67726Uws, Integer num) {
        WGJ.A01(c67726Uws);
        c67726Uws.A08().A08(c67726Uws.getViewLifecycleOwner(), c67726Uws.A09(), num);
    }

    @Override // X.XCE
    public final boolean D1o(LoggingContext loggingContext, Integer num) {
        boolean A1a = AbstractC167017dG.A1a(num, loggingContext);
        A08().A08(getViewLifecycleOwner(), loggingContext, num);
        return A1a;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10101) {
            if (i2 == -1 && intent != null) {
                requireContext();
                C2FP.A0I();
                throw new C141786av(AnonymousClass001.A0R("An operation is not implemented: ", AbstractC58317Pt9.A00(215)));
            }
            Wap wap = C2FP.A01().A04;
            Wap.A02(new C25531Mh(MSY.A0H(wap.A00, "user_click_cardscanner_exit"), 392), A09(), UFS.A01(A08().A0S), "card_scanner", 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014a  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r27) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67726Uws.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(370196320);
        ContextThemeWrapper A00 = AbstractC66388UEw.A00(this, layoutInflater);
        this.A00 = A00;
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(A00);
        this.A0U = cloneInContext;
        if (cloneInContext == null) {
            C14360o3.A0F("themeInflater");
            throw C00O.createAndThrow();
        }
        View inflate = cloneInContext.inflate(R.layout.ecp_nux_fragment, viewGroup, false);
        C0f9.A09(1083732930, A02);
        return inflate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (X.AbstractC166997dE.A1Z(r0.A05, true) != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    @Override // X.AbstractC66388UEw, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            r13 = this;
            r0 = -155166310(0xfffffffff6c0599a, float:-1.9506608E33)
            int r1 = X.C0f9.A02(r0)
            r5 = r13
            super.onResume()
            X.UFU r0 = r13.A08()
            boolean r0 = r0.A0A()
            r3 = 1
            java.lang.String r2 = "ecpPaymentRequest"
            if (r0 == 0) goto L5f
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r13.A0I
            if (r0 == 0) goto L2e
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L28
            java.lang.Boolean r0 = r0.A05
            boolean r0 = X.AbstractC166997dE.A1Z(r0, r3)
            if (r0 != 0) goto L5f
        L28:
            android.view.ContextThemeWrapper r4 = r13.A00
            if (r4 != 0) goto L36
            java.lang.String r2 = "wrapperContext"
        L2e:
            X.C14360o3.A0F(r2)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L36:
            X.VEY r6 = r13.A0J
            if (r6 != 0) goto L3d
            java.lang.String r2 = "navBarStyle"
            goto L2e
        L3d:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r13.A0I
            if (r0 == 0) goto L2e
            boolean r12 = X.WGr.A0L(r0)
            r0 = 8
            X.X2w r9 = new X.X2w
            r9.<init>(r13, r0)
            r0 = 5
            X.MDv r10 = new X.MDv
            r10.<init>(r0, r13, r3)
            r7 = 0
            r11 = 1
            r8 = r7
            X.AbstractC68346VNg.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = -802912521(0xffffffffd02486f7, float:-1.1041234E10)
            X.C0f9.A09(r0, r1)
            return
        L5f:
            r3 = 0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67726Uws.onResume():void");
    }
}
