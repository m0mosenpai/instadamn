package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.List;

/* renamed from: X.KBn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45475KBn extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "OnDeviceNudityDefaultOnNuxFragment";
    public Drawable A00;
    public UserSession A01;
    public C5zZ A02;
    public IgdsBottomButtonLayout A03;
    public IgdsHeadline A04;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "on_device_nudity_default_on_nux";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        UserSession userSession = this.A01;
        if (userSession != null) {
            this.A02 = new C5zZ(userSession);
            this.A04 = (IgdsHeadline) view.requireViewById(R.id.on_device_nudity_nux_headline);
            this.A03 = AbstractC31172DnG.A0j(view, R.id.on_device_nudity_nux_bottom_ctas);
            JQ1.A0Y(this);
            IgdsHeadline igdsHeadline = this.A04;
            str = "headline";
            if (igdsHeadline != null) {
                igdsHeadline.setImageDrawable(this.A00);
                C35228FgL A01 = C35228FgL.A01(requireContext(), true);
                String A0I = JQ1.A0I(this, A01);
                Context requireContext = requireContext();
                String A0p = AbstractC166997dE.A0p(requireContext, 2131965052);
                String A10 = AbstractC43592JPx.A10(requireContext.getString(2131957742), A0p);
                C46067KaO c46067KaO = new C46067KaO(this, AbstractC31174DnI.A02(requireContext));
                SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A10);
                AnonymousClass773.A04(A0H, c46067KaO, A0p);
                A01.A04(A0I, A0H, R.drawable.instagram_settings_pano_outline_24);
                List A03 = A01.A03();
                IgdsBulletCell igdsBulletCell = (IgdsBulletCell) AbstractC001800i.A0L(A03);
                if (igdsBulletCell != null) {
                    igdsBulletCell.setMovementMethod(null, LinkMovementMethod.getInstance());
                }
                IgdsHeadline igdsHeadline2 = this.A04;
                if (igdsHeadline2 != null) {
                    igdsHeadline2.setBulletList(A03);
                    IgdsBottomButtonLayout igdsBottomButtonLayout = this.A03;
                    str = "bottomButton";
                    if (igdsBottomButtonLayout != null) {
                        igdsBottomButtonLayout.setPrimaryActionOnClickListener(ViewOnClickListenerC48074LPz.A00(this, 12));
                        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A03;
                        if (igdsBottomButtonLayout2 != null) {
                            igdsBottomButtonLayout2.setSecondaryActionOnClickListener(ViewOnClickListenerC48074LPz.A00(this, 13));
                            UserSession userSession2 = this.A01;
                            if (userSession2 != null) {
                                AbstractC23021Ah.A00(userSession2).A1e(false);
                                return;
                            }
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        str = "session";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        UserSession userSession = this.A01;
        if (userSession != null) {
            return userSession;
        }
        C14360o3.A0F("session");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(2131968865);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1615416153);
        super.onCreate(bundle);
        this.A01 = AbstractC31176DnK.A0S(this);
        this.A00 = requireContext().getDrawable(R.drawable.ig_illustrations_illo_nudity_detection_refresh);
        C0f9.A09(1915476117, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-202201905);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.on_device_nudity_default_on_nux, false);
        C0f9.A09(16200341, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(2007552915);
        super.onDestroy();
        C5zZ c5zZ = this.A02;
        if (c5zZ == null) {
            C14360o3.A0F("consentManager");
            throw C00O.createAndThrow();
        }
        c5zZ.A00.A01();
        C0f9.A09(1692036860, A02);
    }
}
