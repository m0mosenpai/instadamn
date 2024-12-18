package X;

import android.content.Context;
import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.BrandedContentTag;

/* renamed from: X.N7l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC52176N7l extends AbstractC43842Ja5 {
    public static final String __redex_internal_original_name = "BrandedContentDisclosureBaseFragment";
    public String A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    public static final void A00(GXD gxd, AbstractC52176N7l abstractC52176N7l, BrandedContentDisclosureBaseViewModel brandedContentDisclosureBaseViewModel, String str, String str2) {
        UserSession A0r = AbstractC166987dD.A0r(abstractC52176N7l.A01);
        C14360o3.A0B(A0r, 0);
        C25621Ms A0c = AbstractC167017dG.A0c(A0r);
        A0c.A0B("ads/validate_story_ad_eligibility_existing_media/");
        A0c.A9s("media_id", AbstractC31173DnH.A1b(AbstractC31175DnJ.A0h(str, "_"), 0)[0]);
        A0c.A9s("sponsor_id", str2);
        A0c.A0R(C38864H9m.class, C41290IPf.class);
        if (str2 != null) {
            A0c.A9s("sponsor_id", str2);
        }
        C1ON A0N = A0c.A0N();
        A0N.A00 = new ETS(brandedContentDisclosureBaseViewModel, abstractC52176N7l, gxd, str2, str, 0);
        abstractC52176N7l.schedule(A0N);
    }

    public final boolean A0D(BrandedContentDisclosureBaseViewModel brandedContentDisclosureBaseViewModel, String str, boolean z) {
        int size;
        String str2;
        BrandedContentTag brandedContentTag;
        C14360o3.A0B(brandedContentDisclosureBaseViewModel, 0);
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A01;
        if (!AbstractC55199Oe9.A06(requireContext, this, AbstractC166987dD.A0r(interfaceC09390do)) && (size = brandedContentDisclosureBaseViewModel.A06.size()) > 0 && size <= 2) {
            if (z && C14360o3.A0K(brandedContentDisclosureBaseViewModel.A05, "story") && brandedContentDisclosureBaseViewModel.A0D && brandedContentDisclosureBaseViewModel.A09) {
                if (str != null) {
                    String str3 = ((BrandedContentTag) brandedContentDisclosureBaseViewModel.A06.get(0)).A01;
                    if (str3 != null) {
                        A00(new C55863OrD(brandedContentDisclosureBaseViewModel), this, brandedContentDisclosureBaseViewModel, str, str3);
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                boolean z2 = brandedContentDisclosureBaseViewModel.A0D;
                if (!brandedContentDisclosureBaseViewModel.A06.isEmpty() && (brandedContentTag = (BrandedContentTag) brandedContentDisclosureBaseViewModel.A06.get(0)) != null) {
                    str2 = brandedContentTag.A01;
                } else {
                    str2 = null;
                }
                String str4 = brandedContentDisclosureBaseViewModel.A05;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31172DnG.A0Q(this, A0r, 0), "instagram_bc_update_permission");
                A0f.A7v("is_permission_enabled", AbstractC31173DnH.A0d(A0f, Boolean.valueOf(z2), "is_editing", z));
                A0f.AAP("sponsor_igid", str2);
                AbstractC50523MSb.A10(A0f, str, str4);
                AbstractC37300Gc1.A0n(A0f, getModuleName());
                A0f.Cht();
                return brandedContentDisclosureBaseViewModel.A08(z);
            }
        }
        return false;
    }

    public static final void A01(AbstractC52176N7l abstractC52176N7l, IGI igi, String str, String str2, boolean z) {
        String str3;
        UserSession A0r = AbstractC166987dD.A0r(abstractC52176N7l.A01);
        if (igi != null) {
            str3 = igi.A02;
            if (str3 == null) {
                C14360o3.A0F("errorIdentifier");
                throw C00O.createAndThrow();
            }
        } else {
            str3 = null;
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0L(abstractC52176N7l, A0r), "instagram_bc_story_ad_eligibility_check");
        A0f.A7v("is_request_success", Boolean.valueOf(z));
        if (str3 != null) {
            A0f.AAP("error_identifier", str3);
        }
        if (str2 != null) {
            A0f.AAP("sponsor_igid", str2);
        }
        MSW.A1S(A0f, str);
        A0f.Cht();
    }

    public final UserSession A0C() {
        return AbstractC166987dD.A0r(this.A01);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1633282111);
        super.onDestroyView();
        AbstractC25651Mw.A00(AbstractC166987dD.A0r(this.A01)).A04("branded_content_tag_event_story_edit");
        C0f9.A09(824098802, A02);
    }
}
