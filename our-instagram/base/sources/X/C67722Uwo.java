package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebookpay.form.fragment.model.FormParams;
import com.facebookpay.form.view.FormLayout;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.button.FBPayButton;
import com.facebookpay.widget.listcell.ListCell;

/* renamed from: X.Uwo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67722Uwo extends AbstractC66388UEw {
    public ContextThemeWrapper A00;
    public View A01;
    public View A02;
    public FrameLayout A03;
    public ImageView A04;
    public ProgressBar A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public UFX A09;
    public C67672Uvk A0A;
    public FormParams A0B;
    public UFR A0C;
    public FormLayout A0D;
    public FBPayButton A0E;
    public ListCell A0F;
    public Boolean A0G;
    public String A0H;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public InterfaceC16660sJ A0I = C71800X5b.A00;
    public final InterfaceC16820sZ A0M = new X2w(this, 4);

    /* JADX WARN: Code restructure failed: missing block: B:75:0x01df, code lost:
    
        if (r23.A0L != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r2 != true) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020a  */
    /* JADX WARN: Type inference failed for: r1v38, types: [X.Uvm, X.Uvk] */
    @Override // X.AbstractC66388UEw, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 1568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67722Uwo.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A01(C67722Uwo c67722Uwo) {
        UFR ufr = c67722Uwo.A0C;
        if (ufr == null) {
            C14360o3.A0F("formFragmentViewModel");
            throw C00O.createAndThrow();
        }
        C63406Sjd.A0A(c67722Uwo, C75M.A01(ufr.A0B, C71801X5c.A00), new C70303WQi(c67722Uwo, 30));
    }

    public static final boolean A04(C67722Uwo c67722Uwo) {
        FormParams formParams = c67722Uwo.A0B;
        if (formParams == null) {
            C14360o3.A0F("formParams");
            throw C00O.createAndThrow();
        }
        Integer num = formParams.A0F;
        if (num != null && num.intValue() != 0) {
            return true;
        }
        return false;
    }

    public static final void A02(C67722Uwo c67722Uwo, boolean z) {
        if (A04(c67722Uwo)) {
            if (c67722Uwo.A0J) {
                FBPayButton fBPayButton = c67722Uwo.A0E;
                if (fBPayButton != null) {
                    fBPayButton.setEnabled(true);
                    return;
                }
                return;
            }
            if (!c67722Uwo.A0K && !c67722Uwo.A0L) {
                Fragment fragment = c67722Uwo.mParentFragment;
                C14360o3.A0C(fragment, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
                C67752UxP c67752UxP = (C67752UxP) fragment;
                AbstractC167007dF.A1L(c67752UxP, c67752UxP.A0O, C67752UxP.A0X, 8, z);
                return;
            }
            FBPayButton fBPayButton2 = c67722Uwo.A0E;
            if (fBPayButton2 == null) {
                return;
            }
            fBPayButton2.setEnabled(z);
        }
    }

    public static final void A03(C67722Uwo c67722Uwo, boolean z) {
        ProgressBar progressBar;
        int i;
        if (A04(c67722Uwo)) {
            if (!c67722Uwo.A0K) {
                Fragment fragment = c67722Uwo.mParentFragment;
                C14360o3.A0C(fragment, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
                C67752UxP c67752UxP = (C67752UxP) fragment;
                AbstractC167007dF.A1L(c67752UxP, c67752UxP.A0W, C67752UxP.A0X, 10, z);
                return;
            }
            String str = "progressIcon";
            String str2 = null;
            FBPayButton fBPayButton = c67722Uwo.A0E;
            if (z) {
                if (fBPayButton != null) {
                    fBPayButton.setText((CharSequence) null);
                }
                progressBar = c67722Uwo.A05;
                if (progressBar != null) {
                    i = 0;
                    progressBar.setVisibility(i);
                    return;
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            if (fBPayButton != null) {
                FormParams formParams = c67722Uwo.A0B;
                if (formParams == null) {
                    str = "formParams";
                } else {
                    Integer num = formParams.A0F;
                    if (num != null) {
                        int intValue = num.intValue();
                        Q1y q1y = ((AbstractC66388UEw) c67722Uwo).A00;
                        if (q1y != null) {
                            str2 = q1y.getString(intValue);
                        } else {
                            str = "contextResourcesWrapper";
                        }
                    }
                    fBPayButton.setText(str2);
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            progressBar = c67722Uwo.A05;
            if (progressBar != null) {
                i = 8;
                progressBar.setVisibility(i);
                return;
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10101) {
            String str = "formFragmentViewModel";
            if (-1 == i2 && intent != null) {
                requireContext();
                C2FP.A0I();
                throw new C141786av(AnonymousClass001.A0R("An operation is not implemented: ", AbstractC58317Pt9.A00(215)));
            }
            UFR ufr = this.A0C;
            if (ufr != null) {
                Wap wap = C2FP.A01().A04;
                LoggingContext loggingContext = ufr.A03;
                if (loggingContext == null) {
                    str = "loggingContext";
                } else {
                    Wap.A02(new C25531Mh(MSY.A0H(wap.A00, "user_click_cardscanner_exit"), 392), loggingContext, UFS.A01(ufr.A06()), "card_scanner", 7);
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1390330287);
        this.A00 = AbstractC66388UEw.A00(this, layoutInflater);
        Window window = requireActivity().getWindow();
        if (window != null) {
            window.setSoftInputMode(53);
        }
        ContextThemeWrapper contextThemeWrapper = this.A00;
        if (contextThemeWrapper == null) {
            C14360o3.A0F("viewContext");
            throw C00O.createAndThrow();
        }
        View inflate = layoutInflater.cloneInContext(contextThemeWrapper).inflate(R.layout.fbpay_form_fragment, viewGroup, false);
        C0f9.A09(244903672, A02);
        return inflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    @Override // X.AbstractC66388UEw, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            r14 = this;
            r0 = 1905483893(0x71936075, float:1.459549E30)
            int r4 = X.C0f9.A02(r0)
            r6 = r14
            super.onResume()
            boolean r0 = r14.A0L
            if (r0 != 0) goto L72
            android.view.ContextThemeWrapper r5 = r14.A00
            r8 = 0
            if (r5 != 0) goto L1e
            java.lang.String r0 = "viewContext"
        L16:
            X.C14360o3.A0F(r0)
        L19:
            X.00O r1 = X.C00O.createAndThrow()
            throw r1
        L1e:
            android.os.Bundle r1 = r14.requireArguments()
            java.lang.String r0 = "ECP_FORM_NAV_BAR_STYLE"
            java.lang.Object r7 = r1.get(r0)
            if (r7 == 0) goto La4
            X.VEY r7 = (X.VEY) r7
            r0 = 3
            X.X2w r10 = new X.X2w
            r10.<init>(r14, r0)
            boolean r0 = r14.A0K
            if (r0 == 0) goto L40
            X.X4C r11 = X.X4C.A00
        L38:
            r9 = r8
        L39:
            X.UFX r0 = r14.A09
            if (r0 != 0) goto L5d
            java.lang.String r0 = "ecpViewModel"
            goto L16
        L40:
            X.0sZ r11 = r14.A0M
            com.facebookpay.form.fragment.model.FormParams r0 = r14.A0B
            if (r0 != 0) goto L49
            java.lang.String r0 = "formParams"
            goto L16
        L49:
            java.lang.Integer r0 = r0.A0F
            if (r0 == 0) goto L38
            int r1 = r0.intValue()
            X.Q1y r0 = r14.A00
            if (r0 == 0) goto L5a
            java.lang.String r9 = r0.getString(r1)
            goto L39
        L5a:
            java.lang.String r0 = "contextResourcesWrapper"
            goto L16
        L5d:
            X.2GS r0 = r0.A11
            java.lang.Object r0 = r0.A02()
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            r13 = 1
            if (r0 == 0) goto L9d
            boolean r0 = X.WGr.A0L(r0)
            if (r0 != r13) goto L9d
        L6e:
            r12 = 0
            X.AbstractC68346VNg.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L72:
            X.UFR r0 = r14.A0C
            java.lang.String r5 = "formFragmentViewModel"
            if (r0 == 0) goto L9f
            X.2GS r2 = r0.A0A
            r1 = 23
            X.X58 r0 = new X.X58
            r0.<init>(r14, r1)
            r3 = 31
            X.AbstractC31180DnO.A1F(r14, r2, r0, r3)
            X.UFR r0 = r14.A0C
            if (r0 == 0) goto L9f
            X.2GS r2 = r0.A09
            r1 = 24
            X.X58 r0 = new X.X58
            r0.<init>(r14, r1)
            X.AbstractC31180DnO.A1F(r14, r2, r0, r3)
            r0 = -457716686(0xffffffffe4b7cc32, float:-2.7123744E22)
            X.C0f9.A09(r0, r4)
            return
        L9d:
            r13 = 0
            goto L6e
        L9f:
            X.C14360o3.A0F(r5)
            goto L19
        La4:
            java.lang.IllegalStateException r1 = X.AbstractC166997dE.A0g()
            r0 = -764072099(0xffffffffd2752f5d, float:-2.632654E11)
            X.C0f9.A09(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67722Uwo.onResume():void");
    }
}
