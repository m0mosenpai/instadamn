package X;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.BrV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26748BrV extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "AchievementDetailsFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A01 = C1XM.A00(new C50161MDo(this, 34));
    public final InterfaceC09390do A03 = C1XM.A00(new C50161MDo(this, 36));
    public final InterfaceC09390do A02 = C1XM.A00(new C50161MDo(this, 35));

    public static final void A01(C26748BrV c26748BrV, C38321qM c38321qM, String str, String str2, String str3) {
        FragmentActivity requireActivity = c26748BrV.requireActivity();
        if (!requireActivity.isFinishing() && !requireActivity.isDestroyed() && str2 != null) {
            InterfaceC09390do interfaceC09390do = c26748BrV.A04;
            AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
            if (C18U.A06(AbstractC25225BEi.A0j(A0o, 0), A0o, 36322993689865039L)) {
                AbstractC167017dG.A0y(requireActivity, C3DN.A00);
            }
            if (!c38321qM.A5b() && !c38321qM.A5O()) {
                if (!c38321qM.A6F() && str == null) {
                    if (c38321qM.A5P()) {
                        C77453dV.A02(requireActivity, c26748BrV, C22P.A0k, AbstractC166987dD.A0r(interfaceC09390do), null, c38321qM, str3, false);
                        return;
                    }
                    return;
                }
                AbstractC34836FWt.A01(requireActivity, c26748BrV, AbstractC166987dD.A0r(interfaceC09390do), c38321qM, "achievements", str3, false);
                return;
            }
            RectF rectF = new RectF(0.0f, 0.0f, AbstractC13890nF.A01(c26748BrV.requireContext()), AbstractC13890nF.A00(c26748BrV.requireContext()));
            AbstractC35183Ffa.A02(requireActivity, rectF, rectF, AbstractC166987dD.A0r(interfaceC09390do), null, c38321qM, "ig_achievements", str3, 0, false);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "achievement_details_fragment";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    public C26748BrV() {
        C50161MDo c50161MDo = new C50161MDo(this, 33);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50161MDo(new C50161MDo(this, 37), 38));
        this.A00 = AbstractC25225BEi.A0a(new C50161MDo(A00, 39), c50161MDo, new ME0(49, A00, null), AbstractC25225BEi.A1D(C25871BcS.class));
        this.A04 = AbstractC60492pY.A02(this);
    }

    public static final void A00(C26748BrV c26748BrV, C38321qM c38321qM, String str, String str2) {
        C6XJ A01;
        FragmentActivity requireActivity = c26748BrV.requireActivity();
        if (!requireActivity.isFinishing() && !requireActivity.isDestroyed()) {
            if (!c38321qM.A5b() && !c38321qM.A5O()) {
                if (c38321qM.A5P()) {
                    UserSession A0r = AbstractC166987dD.A0r(c26748BrV.A04);
                    AbstractC167017dG.A1P(A0r, str);
                    String str3 = A0r.userId;
                    C14360o3.A0B(str3, 1);
                    String A0T = AnonymousClass001.A0T(str, str3, '_');
                    C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A04, A0r);
                    c116875Qr.A1D = A0T;
                    ClipsViewerConfig A00 = c116875Qr.A00();
                    Bundle A0b = AbstractC166987dD.A0b();
                    A0b.putParcelable(AbstractC111324zv.A00(299), A00);
                    A01 = new C6XJ(requireActivity, A0b, A0r, TransparentModalActivity.class, AbstractC111324zv.A00(4106));
                    A01.A0H = !C18U.A06(C06090Tz.A05, A0r, 36317534785705304L);
                } else {
                    if (!c38321qM.A6F() || str2 == null) {
                        return;
                    }
                    UserSession A0r2 = AbstractC166987dD.A0r(c26748BrV.A04);
                    String A2u = c38321qM.A2u();
                    if (A2u != null) {
                        C14360o3.A0B(A0r2, 1);
                        A01 = C6XJ.A01(requireActivity, C35227FgK.A00(requireActivity, A0r2, str2, A2u).A00(), A0r2);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
                A01.A07();
                A01.A0C(requireActivity);
                return;
            }
            C35227FgK.A02(requireActivity, AbstractC166987dD.A0r(c26748BrV.A04), str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C141796aw A00;
        InterfaceC16620sF pzz;
        int A02 = C0f9.A02(1932482345);
        super.onCreate(bundle);
        C25871BcS c25871BcS = (C25871BcS) this.A00.getValue();
        String A15 = AbstractC25225BEi.A15(this.A03);
        C141796aw A002 = AbstractC141776au.A00(c25871BcS);
        D4z A022 = D4z.A02(c25871BcS, null, 13);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, A022, A002);
        if (!C18U.A06(C06090Tz.A05, c25871BcS.A00, 36322993690782557L)) {
            String str = c25871BcS.A02;
            String str2 = c25871BcS.A03;
            A00 = AbstractC25235BEs.A0W(c25871BcS, anonymousClass191, new C50116MAp(c25871BcS, A15, str, str2, null, 1), AbstractC141776au.A00(c25871BcS));
            pzz = D4z.A02(c25871BcS, null, 14);
        } else {
            A00 = AbstractC141776au.A00(c25871BcS);
            pzz = new PZZ(c25871BcS, null, 47);
        }
        AbstractC23641Du.A05(anonymousClass191, pzz, A00);
        C0f9.A09(2039399933, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-410732896);
        ComposeView A00 = AbstractC25319BIo.A00(this, C30481DbQ.A00(this, 22), 1077206085);
        C0f9.A09(2072907248, A02);
        return A00;
    }
}
