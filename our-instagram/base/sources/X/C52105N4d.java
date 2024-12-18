package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.ArrayDeque;

/* renamed from: X.N4d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52105N4d extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "SupportiveNudgeFragment";
    public InterfaceC58132Ppv A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A03;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "supportive_nudge_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC58132Ppv interfaceC58132Ppv = this.A00;
        if (interfaceC58132Ppv != null) {
            interfaceC58132Ppv.BNo().D0D();
        }
        InterfaceC09390do interfaceC09390do = this.A03;
        C50942MfB c50942MfB = (C50942MfB) interfaceC09390do.getValue();
        C18920wW c18920wW = c50942MfB.A00;
        if (c18920wW != null) {
            boolean z = c50942MfB.A05;
            boolean z2 = true;
            C1YH c1yh = c50942MfB.A01;
            if (z) {
                if (c1yh != null) {
                    if (c50942MfB.A02 != EnumC168447fe.A03) {
                        z2 = false;
                    }
                    C1YH.A03(c18920wW, C05F.A01, z2);
                }
            } else if (c1yh != null) {
                C1YH.A04(c18920wW, C05F.A01, true);
            }
        }
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57168PZm(viewLifecycleOwner, c07s, this, (InterfaceC23621Ds) null, 32), C07Y.A00(viewLifecycleOwner));
        IgdsHeadline igdsHeadline = (IgdsHeadline) view.findViewById(R.id.media_creation_headline);
        Resources resources = igdsHeadline.getResources();
        igdsHeadline.setHeadline(resources.getString(2131972491));
        int i = 2131974707;
        if (((C50942MfB) interfaceC09390do.getValue()).A05) {
            i = 2131966068;
        }
        igdsHeadline.setBody(resources.getString(i));
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) view.findViewById(R.id.media_creation_bottom_button);
        igdsBottomButtonLayout.setPrimaryAction(igdsBottomButtonLayout.getResources().getString(2131972487), new ViewOnClickListenerC55463OkI(this, 17));
        C57511Pfl c57511Pfl = new C57511Pfl(this, 32);
        getResources();
        SpannableStringBuilder A01 = AbstractC37300Gc1.A01();
        ArrayDeque arrayDeque = new ArrayDeque();
        A01.append((CharSequence) getString(2131966070));
        AbstractC31423DrT.A00(A01, getString(2131956545), "[[community_guidelines]]", arrayDeque, new Object[]{new NY0(c57511Pfl, AbstractC25233BEq.A04(this), 27)}, 33);
        igdsBottomButtonLayout.setFooterText(new SpannableString(A01));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    public C52105N4d() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A01 = AbstractC09440dt.A00(enumC09460dv, new C57511Pfl(this, 31));
        C57511Pfl c57511Pfl = new C57511Pfl(this, 36);
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C57511Pfl(new C57511Pfl(this, 33), 34));
        this.A03 = AbstractC25225BEi.A0a(new C57511Pfl(A00, 35), c57511Pfl, new C29895DGj(4, null, A00), AbstractC25225BEi.A1D(C50942MfB.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1672087378);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_supportive_nudge_bottom_sheet, false);
        C0f9.A09(1679998693, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-352693768);
        super.onDestroy();
        InterfaceC58132Ppv interfaceC58132Ppv = this.A00;
        if (interfaceC58132Ppv != null) {
            interfaceC58132Ppv.BNo().Czu();
        }
        C0f9.A09(1549512650, A02);
    }
}
