package X;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.io.IOException;

/* loaded from: classes11.dex */
public class V13 extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou, InterfaceC81393k9 {
    public static final String __redex_internal_original_name = "QuickPromotionIIGFullscreenBloksFragment";
    public ViewGroup A00;
    public C6T7 A01;
    public QuickPromotionSlot A02;
    public boolean A03;
    public boolean A04;
    public C4NJ A05;
    public C64842wi A06;
    public boolean A07;
    public final InterfaceC09390do A08 = AbstractC60492pY.A02(this);

    /* JADX WARN: Type inference failed for: r2v0, types: [X.2fr, java.lang.Object] */
    public final C64842wi A00() {
        if (this instanceof V9Q) {
            Bundle requireArguments = requireArguments();
            UserSession A06 = C023409i.A0A.A06(requireArguments);
            String string = requireArguments.getString("QuickPromotionIIGFullscreenBaseFragment.KEY_PROMOTION_SLOT");
            if (string == null) {
                string = "MAIN_FEED";
            }
            return new V9N(this, this, A06, QuickPromotionSlot.valueOf(string));
        }
        UserSession userSession = (UserSession) this.A08.getValue();
        QuickPromotionSlot quickPromotionSlot = this.A02;
        if (userSession != null && quickPromotionSlot != null) {
            Handler A0J = AbstractC167007dF.A0J();
            C27961Xa A00 = AbstractC54912fq.A00();
            AbstractC54912fq.A00();
            ?? obj = new Object();
            obj.A08 = new C70973Wlh(2, A0J, this);
            return A00.A02(this, this, userSession, obj.A00(), quickPromotionSlot);
        }
        return null;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.EkF(false);
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "quick promotion";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C4NJ c4nj;
        C62862tP c62862tP;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C64842wi c64842wi = this.A06;
        if (c64842wi != null && (c4nj = this.A05) != null && (c62862tP = (C62862tP) c64842wi.A02.getValue()) != null) {
            c62862tP.A01.put(R.id.bloks_action_listener, new C69244VkC(requireContext(), c62862tP, c64842wi, c4nj, this, null));
        }
    }

    @Override // X.InterfaceC81393k9
    public final void DKx(C6T7 c6t7, C69244VkC c69244VkC) {
        this.A01 = c6t7;
        C4NJ c4nj = this.A05;
        if (c4nj != null) {
            C64842wi A00 = A00();
            if (A00 != null) {
                A00.Dcq(c4nj);
            }
            C126545np c126545np = new C126545np(requireContext());
            C6T7 c6t72 = this.A01;
            if (c6t72 != null) {
                c6t72.A07(c126545np);
            }
            ViewGroup viewGroup = this.A00;
            if (viewGroup != null) {
                viewGroup.addView(c126545np);
            }
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A08.getValue();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C4NJ c4nj;
        C64842wi c64842wi;
        if (this instanceof V9Q) {
            return false;
        }
        if (this.A07 && (c4nj = this.A05) != null && (c64842wi = this.A06) != null) {
            c64842wi.Dcp(c4nj);
        }
        return !this.A07;
    }

    @Override // X.InterfaceC81393k9
    public final void DPm(String str) {
        if (isAdded()) {
            AbstractC25226BEj.A1P(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C4NJ c4nj;
        int A02 = C0f9.A02(1331936430);
        super.onCreate(bundle);
        registerLifecycleListener(new EVO(getActivity()));
        Bundle requireArguments = requireArguments();
        this.A02 = QuickPromotionSlot.valueOf(AbstractC153636vY.A01(requireArguments, "QuickPromotionIIGFullscreenBaseFragment.KEY_PROMOTION_SLOT"));
        UserSession userSession = (UserSession) this.A08.getValue();
        String string = requireArguments.getString("QuickPromotionIIGFullscreenBaseFragment.KEY_QUICK_PROMOTION");
        if (string != null && string.length() != 0) {
            try {
                c4nj = C4NI.parseFromJson(C16V.A00(string));
            } catch (IOException e) {
                AbstractC31546DtW.A00(userSession, C05F.A0N, "Error parsing fullscreen bloks interstitial promotion", e);
            }
            if (c4nj != null) {
                this.A07 = AbstractC167007dF.A1W(c4nj.A08.A00);
                this.A05 = c4nj;
                this.A06 = A00();
                C0f9.A09(-1000319115, A02);
            }
        }
        c4nj = null;
        this.A05 = c4nj;
        this.A06 = A00();
        C0f9.A09(-1000319115, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2121546853);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.bloks_fragment, viewGroup, false);
        if (inflate != null) {
            this.A00 = (ViewGroup) inflate.findViewById(R.id.bloks_container);
        } else {
            inflate = null;
        }
        C0f9.A09(-1305749622, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1807098315);
        C6T7 c6t7 = this.A01;
        if (c6t7 != null) {
            c6t7.A04();
        }
        this.A01 = null;
        this.A00 = null;
        super.onDestroyView();
        C0f9.A09(333408857, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1489650485);
        super.onResume();
        if (this.A05 == null || this.A04) {
            if (isAdded()) {
                AbstractC25226BEj.A1P(this);
            }
            this.A03 = true;
        }
        C0f9.A09(151990368, A02);
    }
}
