package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.business.promote.model.AudienceGender;
import com.instagram.business.promote.model.PromoteAudienceInfo;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import com.instagram.ui.widget.rangeseekbar.RangeSeekBar;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.V0a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67869V0a extends AbstractC59962oe implements InterfaceC60122ou, XAF {
    public static final String __redex_internal_original_name = "PromoteAgeGenderFragment";
    public C70399WUb A02;
    public PromoteData A03;
    public PromoteState A04;
    public UserSession A05;
    public IgTextView A06;
    public IgTextView A07;
    public IgdsCheckBox A08;
    public IgdsCheckBox A09;
    public XEE A0A;
    public RangeSeekBar A0B;
    public List A0C;
    public W6E A0D;
    public FRW A0E;
    public WDA A0F;
    public int A01 = 13;
    public int A00 = 65;

    @Override // X.XAF
    public final void Dc7(PromoteState promoteState, Integer num) {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131970368);
        AbstractC31179DnN.A1G(interfaceC56362iU);
        FRW frw = new FRW(requireContext(), interfaceC56362iU);
        this.A0E = frw;
        WNT.A01(frw, C05F.A1F, this, 5);
        FRW frw2 = this.A0E;
        if (frw2 == null) {
            C14360o3.A0F("actionBarController");
            throw C00O.createAndThrow();
        }
        frw2.A01(true);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_age_gender";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        String str;
        C14360o3.A0B(context, 0);
        super.onAttach(context);
        this.A03 = ((InterfaceC72021XFj) context).BiY();
        PromoteState Bia = ((XFZ) context).Bia();
        this.A04 = Bia;
        Bia.A0A(this);
        PromoteData promoteData = this.A03;
        if (promoteData == null) {
            str = "promoteData";
        } else {
            UserSession userSession = promoteData.A0y;
            this.A05 = userSession;
            if (userSession != null) {
                this.A0D = new W6E(requireActivity(), this, userSession);
                ((BaseFragmentActivity) context).A0a();
                UserSession userSession2 = this.A05;
                if (userSession2 != null) {
                    this.A02 = C70399WUb.A00(userSession2);
                    return;
                }
            }
            str = "session";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c1, code lost:
    
        if (r1.contains(com.instagram.business.promote.model.AudienceGender.A04) != true) goto L31;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67869V0a.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final ImmutableList A00(C67869V0a c67869V0a) {
        String str;
        ArrayList arrayList = new ArrayList();
        IgdsCheckBox igdsCheckBox = c67869V0a.A09;
        if (igdsCheckBox == null) {
            str = "maleCheckable";
        } else {
            if (igdsCheckBox.isChecked()) {
                arrayList.add(AudienceGender.A04);
            }
            IgdsCheckBox igdsCheckBox2 = c67869V0a.A08;
            if (igdsCheckBox2 == null) {
                str = "femaleCheckable";
            } else {
                if (igdsCheckBox2.isChecked()) {
                    arrayList.add(AudienceGender.A03);
                }
                return AbstractC31173DnH.A0L(arrayList);
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A01(C67869V0a c67869V0a) {
        String str;
        WDA wda = c67869V0a.A0F;
        if (wda == null) {
            str = "audiencePotentialReachController";
        } else {
            PromoteData promoteData = c67869V0a.A03;
            if (promoteData == null) {
                str = "promoteData";
            } else {
                PromoteAudienceInfo promoteAudienceInfo = promoteData.A0q;
                C14360o3.A06(promoteAudienceInfo);
                C69649Vsq A00 = AbstractC68446VRc.A00(promoteAudienceInfo);
                A00.A01 = c67869V0a.A01;
                A00.A00 = c67869V0a.A00;
                A00.A06 = AbstractC001800i.A0U(A00(c67869V0a));
                wda.A02(A00.A00());
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        UserSession userSession = this.A05;
        if (userSession != null) {
            return userSession;
        }
        C14360o3.A0F("session");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1708360662);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_age_gender_main_view, viewGroup, false);
        C0f9.A09(-460178680, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-115834760);
        super.onDestroyView();
        WDA wda = this.A0F;
        if (wda == null) {
            C14360o3.A0F("audiencePotentialReachController");
            throw C00O.createAndThrow();
        }
        wda.A0A.A00();
        wda.A00 = C70121W4x.A01;
        C0f9.A09(359690573, A02);
    }
}
