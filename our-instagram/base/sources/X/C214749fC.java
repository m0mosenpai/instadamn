package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9fC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214749fC extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "LiveAudienceSelectorFragment";
    public TextView A00;
    public C684436h A01;
    public C57012jc A02;
    public C57012jc A03;
    public C57012jc A04;
    public C57012jc A05;
    public C57012jc A06;
    public C57012jc A07;
    public C57012jc A08;
    public C57012jc A09;
    public InterfaceC171217kD A0A;
    public C99694dm A0B;
    public IgdsBottomButtonLayout A0C;
    public C189478aR A0D;
    public C3PO A0E;
    public boolean A0F;
    public C57012jc A0G;
    public final EnumMap A0I = new EnumMap(C3PO.class);
    public final InterfaceC09390do A0H = AbstractC60492pY.A02(this);

    public static ViewStub A00(View view, int i) {
        View findViewById = view.findViewById(i);
        if (findViewById instanceof ViewStub) {
            return (ViewStub) findViewById;
        }
        return null;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "live_audience_control";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x03fd, code lost:
    
        X.C14360o3.A0F(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0365, code lost:
    
        X.C14360o3.A0F(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0251, code lost:
    
        if (X.C18U.A06(r2, r9, 36320416708436462L) != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0285, code lost:
    
        if (X.C18U.A06(r2, r9, 36320416708436462L) != false) goto L99;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x00d0. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:58:0x034e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0365 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0363 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03de  */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            Method dump skipped, instructions count: 1284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C214749fC.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A01(C214749fC c214749fC) {
        C3DN A01;
        AbstractC10360h2 supportFragmentManager;
        InterfaceC171217kD interfaceC171217kD = c214749fC.A0A;
        if (interfaceC171217kD != null) {
            C3PO c3po = c214749fC.A0E;
            if (c3po != null) {
                interfaceC171217kD.Cxk(c3po);
            }
            C14360o3.A0F("selectedVisibilityMode");
            throw C00O.createAndThrow();
        }
        C3PO c3po2 = c214749fC.A0E;
        if (c3po2 != null) {
            if (c3po2 == C3PO.A04) {
                C23031Ai A00 = AbstractC23021Ah.A00(AbstractC166987dD.A0r(c214749fC.A0H));
                AbstractC167007dF.A1L(A00, A00.A6O, C23031Ai.A8c, 112, true);
            }
            if (c214749fC.A0F) {
                FragmentActivity activity = c214749fC.getActivity();
                if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                    supportFragmentManager.A12();
                    return;
                }
                return;
            }
            Context context = c214749fC.getContext();
            if (context == null || (A01 = C3DN.A00.A01(context)) == null) {
                return;
            }
            A01.A0B();
            return;
        }
        C14360o3.A0F("selectedVisibilityMode");
        throw C00O.createAndThrow();
    }

    public static final void A02(C214749fC c214749fC, C3PO c3po) {
        boolean z;
        String str;
        Iterator A14 = AbstractC166997dE.A14(c214749fC.A0I);
        while (true) {
            z = true;
            if (!A14.hasNext()) {
                break;
            }
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            Object key = A1K.getKey();
            CompoundButton compoundButton = (CompoundButton) A1K.getValue();
            if (key != c3po) {
                z = false;
            }
            compoundButton.setChecked(z);
        }
        c214749fC.A0E = c3po;
        IgdsBottomButtonLayout igdsBottomButtonLayout = c214749fC.A0C;
        if (igdsBottomButtonLayout == null) {
            str = "submitButton";
        } else {
            Integer Afv = AbstractC166987dD.A10(AbstractC166987dD.A0r(c214749fC.A0H)).A03.Afv();
            if (Afv != null && Afv.intValue() == 0) {
                C3PO c3po2 = c214749fC.A0E;
                if (c3po2 == null) {
                    str = "selectedVisibilityMode";
                } else if (c3po2 == C3PO.A04) {
                    z = false;
                }
            }
            igdsBottomButtonLayout.setPrimaryButtonEnabled(z);
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0H);
    }

    public static boolean A03(InterfaceC09390do interfaceC09390do) {
        UserSession userSession = (UserSession) interfaceC09390do.getValue();
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A05, userSession, 36318196210538505L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (r10 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009c, code lost:
    
        if (r0.containsKey(r3) == true) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r1 != true) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            super.onActivityResult(r8, r9, r10)
            r0 = 2002(0x7d2, float:2.805E-42)
            if (r8 != r0) goto Laf
            X.0do r0 = r7.A0H
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r0)
            com.instagram.user.model.User r0 = X.AbstractC166987dD.A10(r0)
            X.17P r0 = r0.A03
            java.lang.Integer r6 = r0.Afv()
            r0 = 250(0xfa, float:3.5E-43)
            java.lang.String r3 = X.MSV.A00(r0)
            r2 = 1
            if (r10 == 0) goto L2d
            android.os.Bundle r0 = r10.getExtras()
            if (r0 == 0) goto L2d
            boolean r1 = r0.containsKey(r3)
            r0 = 1
            if (r1 == r2) goto L2e
        L2d:
            r0 = 0
        L2e:
            r1 = 0
            if (r0 == 0) goto L8a
            if (r10 == 0) goto L88
        L33:
            android.os.Bundle r0 = r10.getExtras()
            if (r0 == 0) goto L88
            int r0 = r0.getInt(r3)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
        L41:
            r5 = 0
            java.lang.String r2 = "closeFriendsActionTextView"
            if (r6 == 0) goto L6b
            int r0 = r6.intValue()
            if (r0 != 0) goto L6b
            android.widget.TextView r1 = r7.A00
            if (r1 == 0) goto L5c
            r0 = 2131964016(0x7f133070, float:1.9564802E38)
            r1.setText(r0)
        L56:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = r7.A0C
            if (r2 != 0) goto L64
            java.lang.String r2 = "submitButton"
        L5c:
            X.C14360o3.A0F(r2)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L64:
            X.3PO r1 = r7.A0E
            if (r1 != 0) goto L9f
            java.lang.String r2 = "selectedVisibilityMode"
            goto L5c
        L6b:
            android.widget.TextView r4 = r7.A00
            if (r4 == 0) goto L5c
            if (r6 == 0) goto L84
            int r3 = r6.intValue()
            android.content.res.Resources r2 = X.AbstractC166997dE.A0N(r7)
            r1 = 2131820762(0x7f1100da, float:1.9274248E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r6}
            java.lang.String r1 = r2.getQuantityString(r1, r3, r0)
        L84:
            r4.setText(r1)
            goto L56
        L88:
            r6 = r1
            goto L41
        L8a:
            r0 = 1035(0x40b, float:1.45E-42)
            java.lang.String r3 = X.MSV.A00(r0)
            if (r10 == 0) goto L41
            android.os.Bundle r0 = r10.getExtras()
            if (r0 == 0) goto L41
            boolean r0 = r0.containsKey(r3)
            if (r0 != r2) goto L41
            goto L33
        L9f:
            X.3PO r0 = X.C3PO.A04
            if (r1 != r0) goto Lab
            if (r6 == 0) goto Lab
            int r0 = r6.intValue()
            if (r0 == 0) goto Lac
        Lab:
            r5 = 1
        Lac:
            r2.setPrimaryButtonEnabled(r5)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C214749fC.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(313147867);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A0H;
        this.A0B = AbstractC99684dl.A00(AbstractC166987dD.A0r(interfaceC09390do));
        this.A01 = new C684436h(requireActivity(), AbstractC166987dD.A0r(interfaceC09390do));
        setModuleNameV2("live_audience_control");
        C0f9.A09(213996474, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewStub viewStub;
        String str;
        int A02 = C0f9.A02(-1243105440);
        C14360o3.A0B(layoutInflater, 0);
        Bundle bundle2 = this.mArguments;
        boolean z = true;
        if (bundle2 == null || !bundle2.getBoolean(MSV.A00(676))) {
            z = false;
        }
        this.A0F = z;
        int i = R.layout.layout_iglive_audience_mode_tool;
        if (z) {
            i = R.layout.layout_iglive_audience_mode_scheduling;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.audience_mode_public);
        ViewStub viewStub2 = null;
        if (findViewById instanceof ViewStub) {
            viewStub = (ViewStub) findViewById;
        } else {
            viewStub = null;
        }
        this.A08 = new C57012jc(viewStub);
        this.A05 = new C57012jc(A00(inflate, R.id.audience_mode_followers_you_follow_back));
        this.A03 = new C57012jc(A00(inflate, R.id.audience_mode_close_friends));
        this.A04 = new C57012jc(A00(inflate, R.id.tooltip_close_friends));
        this.A09 = new C57012jc(A00(inflate, R.id.audience_mode_subscribers));
        this.A07 = new C57012jc(A00(inflate, R.id.audience_mode_private));
        this.A06 = new C57012jc(A00(inflate, R.id.audience_mode_internal));
        this.A0G = new C57012jc(A00(inflate, R.id.subscriptions_reminder));
        View findViewById2 = inflate.findViewById(R.id.audience_mode_channel);
        if (findViewById2 instanceof ViewStub) {
            viewStub2 = (ViewStub) findViewById2;
        }
        this.A02 = new C57012jc(viewStub2);
        if (this.A0E == null) {
            Bundle bundle3 = this.mArguments;
            if (bundle3 == null || (str = bundle3.getString(MSV.A00(310))) == null) {
                str = "public";
            }
            this.A0E = AbstractC109134vd.A01(str);
        }
        C0f9.A09(1195728080, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-2129619264);
        super.onResume();
        C3PO c3po = this.A0E;
        if (c3po == null) {
            C14360o3.A0F("selectedVisibilityMode");
            throw C00O.createAndThrow();
        }
        A02(this, c3po);
        C0f9.A09(-429802538, A02);
    }
}
