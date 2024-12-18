package X;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.business.fragment.SupportServiceEditUrlFragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.leadgen.core.model.LeadGenBaseFormList;
import com.instagram.leadgen.organic.model.LeadGenFormData;
import com.instagram.model.business.Address;
import java.util.List;

/* renamed from: X.FRn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34724FRn {
    public final Fragment A00(Bundle bundle, SparseArray sparseArray, EnumC151596s5 enumC151596s5, UserSession userSession) {
        String str;
        C14360o3.A0B(userSession, 1);
        boolean z = bundle.getBoolean(AbstractC111324zv.A00(584), false);
        boolean A01 = C35792FrU.A01(userSession, true);
        AbstractC35091Fd2.A01(null, userSession, "igwb", "safety_step_entered", null);
        if (A01) {
            boolean A2F = AbstractC166997dE.A0Y(userSession).A2F();
            boolean A1T = AbstractC167007dF.A1T(AbstractC166997dE.A0Y(userSession).A03.CVn());
            String A0Z = AbstractC31171DnF.A0Z(bundle);
            if (A0Z == null) {
                A0Z = "";
            }
            C09530e4 A1L = AbstractC166987dD.A1L("entrypoint", A0Z);
            C09530e4 A1L2 = AbstractC166987dD.A1L("should_show_hide_messages_toggle", String.valueOf(!A2F));
            C09530e4 A1L3 = AbstractC166987dD.A1L("should_show_hide_comments_toggle", String.valueOf(!A1T));
            if (enumC151596s5 == EnumC151596s5.A08) {
                str = "interest_account_conversion";
            } else {
                str = "interest_account_signup";
            }
            C66277U6x A012 = C66277U6x.A01("com.instagram.bullying.pro_account.safety_step", AbstractC06930Yk.A02(A1L, A1L2, A1L3, AbstractC166987dD.A1L("logger_flow", str)));
            A012.A02 = sparseArray;
            IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
            A0C.A0U = "";
            A0C.A0j = z;
            return W6d.A02(A0C, A012);
        }
        EK9 ek9 = new EK9();
        ek9.setArguments(bundle);
        return ek9;
    }

    public final Fragment A04(UserSession userSession, LeadGenFormData leadGenFormData) {
        Fragment c52575NNv;
        Bundle A0E = AbstractC31174DnI.A0E(userSession, 1);
        A0E.putParcelable("args_form_data", leadGenFormData);
        if (AbstractC54050Nv0.A00(userSession)) {
            c52575NNv = new N64();
        } else {
            c52575NNv = new C52575NNv();
        }
        Fragment fragment = c52575NNv;
        fragment.setArguments(A0E);
        return fragment;
    }

    public final SupportServiceEditUrlFragment A06(SMBPartnerType sMBPartnerType, String str, String str2, String str3, String str4, String str5, String str6) {
        AbstractC167007dF.A1G(str, 0, str6);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("APP_ID", str2);
        A0b.putString("PARTNER_NAME", str3);
        A0b.putString("PLACEHOLDER_URL", str4);
        A0b.putString("AUTOFILL_URL", str5);
        AbstractC31176DnK.A19(A0b, str6, str);
        A0b.putSerializable("args_service_type", sMBPartnerType);
        SupportServiceEditUrlFragment supportServiceEditUrlFragment = new SupportServiceEditUrlFragment();
        supportServiceEditUrlFragment.setArguments(A0b);
        return supportServiceEditUrlFragment;
    }

    public final SupportServiceEditUrlFragment A07(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C14360o3.A0B(str, 0);
        AbstractC167017dG.A1T(str6, str7);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("APP_ID", str2);
        A0b.putString("PARTNER_NAME", str3);
        A0b.putString("PLACEHOLDER_URL", str4);
        A0b.putString("AUTOFILL_URL", str5);
        AbstractC31176DnK.A19(A0b, str6, str);
        A0b.putString("args_category_type", str7);
        SupportServiceEditUrlFragment supportServiceEditUrlFragment = new SupportServiceEditUrlFragment();
        supportServiceEditUrlFragment.setArguments(A0b);
        return supportServiceEditUrlFragment;
    }

    public final Fragment A01(UserSession userSession, ImageUrl imageUrl, String str, String str2, List list, boolean z) {
        Fragment c52571NNr;
        Bundle A0b = AbstractC166987dD.A0b();
        if (str != null) {
            A0b.putString(MSV.A00(951), str);
        }
        if (imageUrl != null) {
            A0b.putParcelable("args_cover_photo_media_id", imageUrl);
        }
        A0b.putParcelableArrayList("args_form_data", AbstractC166987dD.A1F(list));
        A0b.putString("args_entry_point", str2);
        A0b.putBoolean(MSV.A00(945), z);
        if (AbstractC54050Nv0.A00(userSession)) {
            c52571NNr = new N5P();
        } else {
            c52571NNr = new C52571NNr();
        }
        Fragment fragment = c52571NNr;
        fragment.setArguments(A0b);
        return fragment;
    }

    public final Fragment A02(UserSession userSession, LeadGenBaseFormList leadGenBaseFormList, LeadGenFormData leadGenFormData, boolean z) {
        Fragment c52565NNl;
        AbstractC167017dG.A1N(leadGenFormData, leadGenBaseFormList);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable("args_form_data", leadGenFormData);
        A0b.putParcelable("args_form_list_data", leadGenBaseFormList);
        A0b.putBoolean(MSV.A00(946), z);
        if (AbstractC54050Nv0.A00(userSession)) {
            c52565NNl = new N65();
        } else {
            c52565NNl = new C52565NNl();
        }
        Fragment fragment = c52565NNl;
        fragment.setArguments(A0b);
        return fragment;
    }

    public final Fragment A03(UserSession userSession, LeadGenBaseFormList leadGenBaseFormList, String str) {
        Fragment n6d;
        AbstractC167017dG.A1O(userSession, leadGenBaseFormList);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("args_entry_point", str);
        A0b.putParcelable("args_form_list_data", leadGenBaseFormList);
        if (AbstractC54050Nv0.A00(userSession)) {
            n6d = new N67();
        } else {
            n6d = new N6D();
        }
        Fragment fragment = n6d;
        fragment.setArguments(A0b);
        return fragment;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.fragment.app.Fragment, X.ELD, X.2oe] */
    public final ELD A05(Address address, Integer num, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Bundle A08 = AbstractC31176DnK.A08(str);
        A08.putParcelable(ELV.A0H, address);
        A08.putString("BusinessLocationFragment.EXTRA_ADDITIONAL_ADDRESS_ID", str2);
        A08.putBoolean("BusinessLocationFragment.EXTRA_SHOULD_SHOW_IN_MODAL", z);
        A08.putBoolean("BusinessLocationFragment.EXTRA_IS_MV4B_VERIFIED", z2);
        if (num != null) {
            A08.putInt("BusinessLocationFragment.NUM_EDITS_LEFT_BEFORE_REACHING_MULTIPLE_ADDRESSES_LIMIT", num.intValue());
        }
        A08.putBoolean("BusinessLocationFragment.EXTRA_IS_REMOVE_LOCKED_FOR_MULTIPLE_ADDRESSES", z3);
        A08.putBoolean("BusinessLocationFragment.EXTRA_IS_ADDING_NEW_ADDRESS", z4);
        A08.putBoolean("BusinessLocationFragment.EXTRA_SHOULD_HIDE_PRIMARY_LOCATION_HEADER", z5);
        ?? abstractC59962oe = new AbstractC59962oe();
        abstractC59962oe.setArguments(A08);
        return abstractC59962oe;
    }
}
