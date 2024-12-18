package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PendingLocation;
import com.instagram.business.promote.model.PromoteAudienceInfo;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.V0d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67872V0d extends AbstractC59962oe implements InterfaceC60122ou, XAF {
    public static final String __redex_internal_original_name = "PromoteCreateAudienceFragment";
    public Drawable A00;
    public Drawable A01;
    public SpannableStringBuilder A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public EditText A0B;
    public ImageView A0C;
    public TextView A0D;
    public TextView A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public TextView A0I;
    public TextView A0J;
    public TextView A0K;
    public TextView A0L;
    public TextView A0M;
    public TextView A0N;
    public TextView A0O;
    public FRW A0P;
    public WDA A0Q;
    public SpinnerImageView A0R;
    public InterfaceC56392iX A0S;
    public final InterfaceC09390do A0Y = X55.A00(this, 26);
    public final InterfaceC09390do A0a = X55.A00(this, 28);
    public final InterfaceC09390do A0b = AbstractC09440dt.A01(new X55(this, 29));
    public final InterfaceC09390do A0X = X55.A00(this, 25);
    public final InterfaceC09390do A0V = AbstractC09440dt.A01(new X55(this, 23));
    public final InterfaceC09390do A0W = AbstractC09440dt.A01(new X55(this, 24));
    public final InterfaceC09390do A0Z = AbstractC09440dt.A01(new X55(this, 27));
    public final InterfaceC190658cN A0U = new C70950Wkw(this, 3);
    public final InterfaceC190658cN A0T = new C70950Wkw(this, 2);

    @Override // X.XAF
    public final void Dc7(PromoteState promoteState, Integer num) {
        PromoteAudienceInfo promoteAudienceInfo;
        WDA wda;
        C14360o3.A0B(num, 1);
        if (num == C05F.A15) {
            A01(this);
            promoteAudienceInfo = ((PromoteData) AbstractC166987dD.A17(this.A0Y)).A0q;
            if (promoteAudienceInfo == null) {
                throw new IllegalStateException("Required value was null.");
            }
        } else if (num == C05F.A1F) {
            A01(this);
            promoteAudienceInfo = ((PromoteData) AbstractC166987dD.A17(this.A0Y)).A0p;
            if (promoteAudienceInfo == null) {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            return;
        }
        if (promoteAudienceInfo.A00() && (wda = this.A0Q) != null) {
            wda.A02(promoteAudienceInfo);
        }
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        int i = 2131970524;
        if (A04(this)) {
            i = 2131970656;
        }
        interfaceC56362iU.Efu(i);
        AbstractC50523MSb.A1E(interfaceC56362iU);
        FRW frw = new FRW(requireContext(), interfaceC56362iU);
        this.A0P = frw;
        WNT.A01(frw, C05F.A1F, this, 27);
        FRW frw2 = this.A0P;
        if (frw2 == null) {
            C14360o3.A0F("actionBarButtonController");
            throw C00O.createAndThrow();
        }
        frw2.A01(true);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(5126);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C1ON A01;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A0S = AbstractC56372iV.A01(view.findViewById(R.id.main_container_stub), false, false);
        this.A0R = (SpinnerImageView) view.findViewById(R.id.loading_spinner);
        Drawable drawable = requireContext().getDrawable(R.drawable.instagram_error_outline_16);
        if (drawable != null) {
            this.A01 = drawable;
            AbstractC25231BEo.A0x(requireContext(), drawable, AbstractC53242c7.A03(getContext()));
            Drawable drawable2 = requireContext().getDrawable(R.drawable.instagram_circle_check_outline_16);
            if (drawable2 != null) {
                this.A00 = drawable2;
                AbstractC25231BEo.A0x(requireContext(), drawable2, AbstractC53242c7.A0H(getContext(), R.attr.igds_color_success));
                if (C14360o3.A0K(PromoteAudienceInfo.A09, ((PromoteData) AbstractC166987dD.A17(this.A0Y)).A0q)) {
                    if (A04(this)) {
                        str = "ads/promote/audience_edit_screen_v2/";
                    } else {
                        str = "ads/promote/audience_create_screen/";
                    }
                    V26 v26 = new V26(AbstractC65702TsY.A0N(this.A0Z), this, AbstractC25227BEk.A0w(AnonymousClass001.A0R("/api/v1/", str), 0, AbstractC167007dF.A0A(r1) - 1), 9);
                    InterfaceC09390do interfaceC09390do = this.A0V;
                    Object value = interfaceC09390do.getValue();
                    W6E w6e = (W6E) this.A0X.getValue();
                    if (value != null) {
                        A01 = AbstractC70178WFd.A02(w6e.A08, w6e.A03.A1A, (String) interfaceC09390do.getValue(), w6e.A02.A03);
                    } else {
                        UserSession userSession = w6e.A08;
                        PromoteData promoteData = w6e.A03;
                        String str2 = promoteData.A1A;
                        String str3 = promoteData.A1S;
                        ImmutableList A03 = promoteData.A03();
                        XIGIGBoostDestination xIGIGBoostDestination = promoteData.A0i;
                        xIGIGBoostDestination.getClass();
                        A01 = WDz.A01(xIGIGBoostDestination, userSession, str2, str3, A03);
                    }
                    A01.A00 = v26;
                    w6e.A07.schedule(A01);
                } else {
                    A00(this);
                    A01(this);
                }
                ((PromoteState) this.A0a.getValue()).A0A(this);
                AbstractC65702TsY.A1M(AbstractC65702TsY.A0N(this.A0Z), this.A0W.getValue());
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x036f, code lost:
    
        if (X.WG1.A06((com.instagram.common.session.UserSession) X.AbstractC166987dD.A17(r14.A0b)) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0337, code lost:
    
        if (X.WG1.A06((com.instagram.common.session.UserSession) X.AbstractC166987dD.A17(r14.A0b)) == false) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x037f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C67872V0d r14) {
        /*
            Method dump skipped, instructions count: 1276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67872V0d.A00(X.V0d):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (r2.isEmpty() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c3, code lost:
    
        if (X.WG1.A06((com.instagram.common.session.UserSession) X.AbstractC166987dD.A17(r10.A0b)) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0133, code lost:
    
        if (X.WG1.A06((com.instagram.common.session.UserSession) X.AbstractC166987dD.A17(r10.A0b)) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015b, code lost:
    
        if (((com.instagram.business.promote.model.PromoteData) X.AbstractC166987dD.A17(r5)).A2z == false) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C67872V0d r10) {
        /*
            Method dump skipped, instructions count: 946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67872V0d.A01(X.V0d):void");
    }

    private final void A02(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = this.A02;
        if (spannableStringBuilder == null) {
            C14360o3.A0F("interestTargetingBody");
            throw C00O.createAndThrow();
        }
        Context requireContext = requireContext();
        UserSession userSession = (UserSession) AbstractC166987dD.A17(this.A0b);
        String A01 = AbstractC63260SgI.A01(requireContext(), str2);
        C14360o3.A07(A01);
        AnonymousClass773.A02(spannableStringBuilder, new C33248Eli(requireContext, userSession, null, A01, AbstractC25233BEq.A04(this)), str);
        this.A02 = spannableStringBuilder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (r2.A21.contains(com.instagram.business.promote.model.SpecialRequirementCategory.A08) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A03() {
        /*
            r9 = this;
            X.0do r0 = r9.A0Y
            java.lang.Object r2 = X.AbstractC166987dD.A17(r0)
            com.instagram.business.promote.model.PromoteData r2 = (com.instagram.business.promote.model.PromoteData) r2
            boolean r8 = A04(r9)
            r0 = 0
            X.C14360o3.A0B(r2, r0)
            com.instagram.common.session.UserSession r5 = r2.A0y
            X.C14360o3.A06(r5)
            com.instagram.api.schemas.XIGIGBoostDestination r3 = r2.A0i
            boolean r6 = r2.A2W
            boolean r0 = r2.A0C()
            if (r0 != 0) goto L2a
            java.util.List r1 = r2.A21
            com.instagram.business.promote.model.SpecialRequirementCategory r0 = com.instagram.business.promote.model.SpecialRequirementCategory.A08
            boolean r0 = r1.contains(r0)
            r7 = 0
            if (r0 == 0) goto L2b
        L2a:
            r7 = 1
        L2b:
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r2.A0q
            if (r0 == 0) goto L39
            X.UQJ r4 = new X.UQJ
            r4.<init>(r0)
        L34:
            boolean r0 = X.WGs.A0M(r3, r4, r5, r6, r7, r8)
            return r0
        L39:
            r4 = 0
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67872V0d.A03():boolean");
    }

    public static final boolean A04(C67872V0d c67872V0d) {
        return AbstractC167007dF.A1X(c67872V0d.A0W.getValue(), VG4.A0e);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return (UserSession) AbstractC166987dD.A17(this.A0b);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-782613954);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_create_audience_view, viewGroup, false);
        C0f9.A09(313303139, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(2096349025);
        super.onDestroy();
        InterfaceC09390do interfaceC09390do = this.A0Y;
        ((PromoteData) AbstractC166987dD.A17(interfaceC09390do)).A0q = PromoteAudienceInfo.A09;
        ((PromoteData) AbstractC166987dD.A17(interfaceC09390do)).A0r.A00 = new HashMap();
        PendingLocation pendingLocation = ((PromoteData) AbstractC166987dD.A17(interfaceC09390do)).A0o;
        pendingLocation.A05 = new ArrayList();
        pendingLocation.A00 = 5;
        pendingLocation.A01 = null;
        pendingLocation.A02 = null;
        pendingLocation.A03 = null;
        pendingLocation.A04 = new ArrayList();
        C0f9.A09(-1716748294, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-242143617);
        super.onDestroyView();
        ((PromoteState) this.A0a.getValue()).A0B(this);
        WDA wda = this.A0Q;
        if (wda != null) {
            wda.A0A.A00();
            wda.A00 = C70121W4x.A01;
        }
        this.A0A = null;
        this.A0O = null;
        this.A0N = null;
        this.A04 = null;
        this.A0J = null;
        this.A0H = null;
        this.A07 = null;
        this.A08 = null;
        this.A03 = null;
        this.A0F = null;
        this.A06 = null;
        this.A05 = null;
        this.A09 = null;
        C0f9.A09(-600267763, A02);
    }
}
