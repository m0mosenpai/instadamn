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
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AdvantageAudienceData;
import com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.common.session.UserSession;

/* renamed from: X.6QR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6QR extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PromoteCreateAudienceFragmentV2";
    public Drawable A00;
    public Drawable A01;
    public View A02;
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
    public MOA A0P;
    public FRW A0Q;
    public W5D A0R;
    public final InterfaceC09390do A0T = AbstractC09440dt.A01(new X55(this, 30));
    public final InterfaceC09390do A0U = new C60842q8(new X55(this, 31), new X55(this, 32), new C57253Pbb(27, null, this), new C0YZ(UFT.class));
    public final InterfaceC09390do A0S = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        FRW frw;
        C14360o3.A0B(interfaceC56362iU, 0);
        int i = 2131970524;
        if (A01(this).A04 != null) {
            i = 2131970656;
        }
        interfaceC56362iU.Efu(i);
        C3LO c3lo = new C3LO();
        c3lo.A00();
        interfaceC56362iU.Ehd(new C3LY(c3lo));
        Context context = getContext();
        if (context != null) {
            frw = new FRW(context, interfaceC56362iU);
        } else {
            frw = null;
        }
        this.A0Q = frw;
        if (frw != null) {
            frw.A00(new WLA(this), C05F.A1F);
        }
        FRW frw2 = this.A0Q;
        if (frw2 != null) {
            frw2.A01(true);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_create_audience";
    }

    /* JADX WARN: Code restructure failed: missing block: B:217:0x044b, code lost:
    
        if (X.WG1.A06((com.instagram.common.session.UserSession) r2.getValue()) != false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0466, code lost:
    
        if (r1.A0A != false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x04b6, code lost:
    
        if (r0.isEmpty() == false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0468, code lost:
    
        if (r4 != false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0118, code lost:
    
        if (r1.A0A != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x050d, code lost:
    
        if (r0.isEmpty() == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0184, code lost:
    
        if (r1.A0A != false) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01fa  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 1308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6QR.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final C70399WUb A00(C6QR c6qr) {
        Object value = c6qr.A0T.getValue();
        C14360o3.A07(value);
        return (C70399WUb) value;
    }

    public static final UFT A01(C6QR c6qr) {
        return (UFT) c6qr.A0U.getValue();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A0S.getValue();
    }

    public static final void A02(SpannableStringBuilder spannableStringBuilder, C6QR c6qr, String str, String str2) {
        Context requireContext = c6qr.requireContext();
        AbstractC12990ll abstractC12990ll = (AbstractC12990ll) c6qr.A0S.getValue();
        String A01 = AbstractC63260SgI.A01(c6qr.requireContext(), str2);
        C14360o3.A07(A01);
        AnonymousClass773.A04(spannableStringBuilder, new C33248Eli(requireContext, abstractC12990ll, null, A01, c6qr.requireContext().getColor(AbstractC53242c7.A06(c6qr.getContext()))), str);
    }

    public static final boolean A03(C6QR c6qr) {
        XFBTargetingAutomationAdvantageAudienceStatus xFBTargetingAutomationAdvantageAudienceStatus;
        AdvantageAudienceData advantageAudienceData = A01(c6qr).A05().A02;
        if (advantageAudienceData != null) {
            xFBTargetingAutomationAdvantageAudienceStatus = advantageAudienceData.AaJ();
        } else {
            xFBTargetingAutomationAdvantageAudienceStatus = null;
        }
        if (xFBTargetingAutomationAdvantageAudienceStatus == XFBTargetingAutomationAdvantageAudienceStatus.A05 && !A01(c6qr).A05().A09 && WG1.A06((UserSession) c6qr.A0S.getValue())) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C1ON A01;
        C018307d viewModelStore;
        int A02 = C0f9.A02(-88961408);
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null && (viewModelStore = activity.getViewModelStore()) != null) {
            viewModelStore.A00();
        }
        UFT A012 = A01(this);
        String str = A012.A04;
        if (str != null) {
            UserSession userSession = A012.A03;
            String str2 = C70399WUb.A00(userSession).A03;
            C14360o3.A07(str2);
            A01 = AbstractC70178WFd.A02(userSession, "", str, str2);
        } else {
            UserSession userSession2 = A012.A03;
            String str3 = A012.A05;
            XIGIGBoostDestination xIGIGBoostDestination = A012.A00;
            if (str3 == null) {
                str3 = "";
            }
            ImmutableList of = ImmutableList.of();
            if (xIGIGBoostDestination == null) {
                xIGIGBoostDestination = XIGIGBoostDestination.A0C;
            }
            A01 = WDz.A01(xIGIGBoostDestination, userSession2, "", str3, of);
        }
        AbstractC18560vj.A03(AbstractC141776au.A00(A012), new C15340po(new MC5(A012, null, 39), A01.A03(1391975297)));
        C0f9.A09(-870290361, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1100403154);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_create_audience_view, viewGroup, false);
        C0f9.A09(-1810323074, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-98363383);
        super.onDestroy();
        this.A0P = null;
        C0f9.A09(1319128158, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1639075374);
        super.onDestroyView();
        this.A09 = null;
        W5D w5d = this.A0R;
        if (w5d != null) {
            w5d.A01();
        }
        this.A0R = null;
        this.A01 = null;
        this.A00 = null;
        this.A0B = null;
        this.A0C = null;
        this.A0F = null;
        this.A0M = null;
        this.A0L = null;
        this.A06 = null;
        this.A0J = null;
        this.A0H = null;
        this.A02 = null;
        this.A0E = null;
        this.A0D = null;
        this.A0A = null;
        this.A0O = null;
        this.A0N = null;
        this.A03 = null;
        this.A0G = null;
        this.A05 = null;
        this.A04 = null;
        this.A07 = null;
        this.A0K = null;
        this.A0I = null;
        this.A08 = null;
        C0f9.A09(-688812433, A02);
    }
}
