package X;

import android.os.Bundle;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.List;

/* renamed from: X.OdC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55149OdC {
    public static Bundle A00(BrandedContentGatingInfoIntf brandedContentGatingInfoIntf, BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf, String str, String str2, List list, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(list, 2);
        return AbstractC61636Rr0.A00(AbstractC166987dD.A1L("argument_create_ad_code", Boolean.valueOf(z)), AbstractC166987dD.A1L(AbstractC43591JPw.A00(771), Boolean.valueOf(z2)), AbstractC166987dD.A1L("argument_bc_tag_list", AbstractC166987dD.A1F(list)), AbstractC166987dD.A1L("argument_bc_project_metadata", brandedContentProjectMetadataIntf), AbstractC166987dD.A1L("argument_bc_gating_info", brandedContentGatingInfoIntf), AbstractC166987dD.A1L("argument_is_paid_partnership_label", Boolean.valueOf(z3)), AbstractC166987dD.A1L(AbstractC43591JPw.A00(770), str), AbstractC166987dD.A1L("media_id", str2));
    }

    public static N8C A03(BrandedContentGatingInfoIntf brandedContentGatingInfoIntf, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        AbstractC167007dF.A1G(list, 0, str);
        N8C n8c = new N8C();
        AbstractC25227BEk.A1C(n8c, new C09530e4[]{AbstractC166987dD.A1L("brand_partners", AbstractC166987dD.A1F(list)), AbstractC166987dD.A1L("BRANDED_CONTENT_GATING_INFO", brandedContentGatingInfoIntf), AbstractC166987dD.A1L("disclosure_fragment_entered_from_brand_search", Boolean.valueOf(z)), AbstractC166987dD.A1L("disclosure_fragment_is_edit_flow", Boolean.valueOf(z2)), AbstractC166987dD.A1L("disclosure_fragment_is_paid_partnership_on", Boolean.valueOf(z3)), AbstractC166987dD.A1L("ARGUMENT_MEDIA_ID", str2), AbstractC166987dD.A1L("ARGUMENT_MEDIA_TYPE", str), AbstractC166987dD.A1L("has_interactive_elements_for_story", Boolean.valueOf(z4)), AbstractC166987dD.A1L("includes_suspected_sponsor", Boolean.valueOf(z5))});
        return n8c;
    }

    public static N8B A04(BrandedContentGatingInfoIntf brandedContentGatingInfoIntf, BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        C14360o3.A0B(list, 0);
        N8B n8b = new N8B();
        AbstractC25227BEk.A1C(n8b, new C09530e4[]{AbstractC166987dD.A1L("brand_partners", AbstractC166987dD.A1F(list)), AbstractC166987dD.A1L("project_metadata", brandedContentProjectMetadataIntf), AbstractC166987dD.A1L("BRANDED_CONTENT_GATING_INFO", brandedContentGatingInfoIntf), AbstractC166987dD.A1L("disclosure_fragment_entered_from_brand_search", Boolean.valueOf(z)), AbstractC166987dD.A1L("disclosure_fragment_is_edit_flow", Boolean.valueOf(z2)), AbstractC166987dD.A1L("disclosure_fragment_is_paid_partnership_on", Boolean.valueOf(z3)), AbstractC166987dD.A1L("ARGUMENT_MEDIA_TYPE", str), AbstractC166987dD.A1L("ARGUMENT_MEDIA_ID", str2), AbstractC166987dD.A1L("ARGUMENT_HAS_INTERACTIVE_ELEMENTS", Boolean.valueOf(z4)), AbstractC166987dD.A1L("includes_suspected_sponsor", Boolean.valueOf(z5)), AbstractC166987dD.A1L("is_from_consolidated", Boolean.valueOf(z6)), AbstractC166987dD.A1L(AbstractC43591JPw.A00(1111), Boolean.valueOf(z7)), AbstractC166987dD.A1L("argument_create_ad_code", Boolean.valueOf(z8))});
        return n8b;
    }

    public static C52178N7n A01(BrandedContentGatingInfo brandedContentGatingInfo, String str, boolean z, boolean z2) {
        C52178N7n c52178N7n = new C52178N7n();
        c52178N7n.setArguments(AbstractC167027dH.A09("entered_from_disclosure_menu", Boolean.valueOf(z2), AbstractC166987dD.A1L("BRANDED_CONTENT_GATING_INFO", brandedContentGatingInfo), AbstractC166987dD.A1L("ARGUMENT_MEDIA_TYPE", str), AbstractC166987dD.A1L("ARGUMENT_IS_EDITING", Boolean.valueOf(z))));
        return c52178N7n;
    }

    public static N6K A02(String str, String str2, String str3, String str4) {
        N6K n6k = new N6K();
        n6k.setArguments(AbstractC167027dH.A09(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str4, AbstractC166987dD.A1L("ARGUMENT_BRANDED_CONTENT_USER_ID", str2), AbstractC166987dD.A1L(AbstractC31581Du9.A01(), str), AbstractC166987dD.A1L("ARGUMENT_MEDIA_ID", str3)));
        return n6k;
    }
}
