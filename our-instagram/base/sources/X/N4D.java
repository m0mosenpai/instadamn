package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.brandedcontent.adseligibility.util.AdsEligibilityErrorDataItem;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class N4D extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ContentIneligibleFragment";
    public final InterfaceC09390do A00 = C1XM.A00(new C50150MDd(this, 29));
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "content_ineligible_screen";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList<String> stringArrayList;
        int i;
        int i2;
        int i3;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        ArrayList arrayList = null;
        if (bundle2 != null) {
            arrayList = bundle2.getParcelableArrayList("error_data_list");
        }
        if (arrayList != null) {
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null && (stringArrayList = bundle3.getStringArrayList("error_data_codes")) != null) {
                Bundle bundle4 = this.mArguments;
                if (bundle4 != null) {
                    boolean z = bundle4.getBoolean("is_ads_mode", false);
                    if (Boolean.valueOf(z) != null) {
                        IgdsHeadline igdsHeadline = (IgdsHeadline) AbstractC166997dE.A0R(view, R.id.headline);
                        InterfaceC09390do interfaceC09390do = this.A00;
                        int ordinal = ((C8Y4) interfaceC09390do.getValue()).ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 2) {
                                if (ordinal == 1) {
                                    i = 2131962477;
                                } else {
                                    throw B4Z.A00();
                                }
                            } else {
                                i = 2131971716;
                            }
                        } else {
                            i = 2131974627;
                            if (z) {
                                i = 2131954062;
                            }
                        }
                        igdsHeadline.setHeadline(i);
                        int ordinal2 = ((C8Y4) interfaceC09390do.getValue()).ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 2) {
                                if (ordinal2 == 1) {
                                    i2 = 2131962430;
                                } else {
                                    throw B4Z.A00();
                                }
                            } else {
                                i2 = 2131971644;
                            }
                        } else {
                            i2 = 2131974561;
                            if (z) {
                                i2 = 2131954058;
                            }
                        }
                        String A0p = AbstractC166997dE.A0p(requireContext(), 2131969366);
                        SpannableStringBuilder A07 = AbstractC31178DnM.A07(requireContext(), A0p, i2);
                        AnonymousClass773.A04(A07, new C39403Han(this, stringArrayList, AbstractC25233BEq.A04(this)), A0p);
                        igdsHeadline.setBody(A07);
                        C35228FgL A01 = C35228FgL.A01(requireContext(), true);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            AdsEligibilityErrorDataItem adsEligibilityErrorDataItem = (AdsEligibilityErrorDataItem) it.next();
                            XNQ A03 = AbstractC65877Tvg.A03(adsEligibilityErrorDataItem.A01);
                            if (A03 == null) {
                                A03 = XNQ.A9T;
                            }
                            Integer A04 = AbstractC65877Tvg.A04(A03, BSV.SIZE_24, BSU.OUTLINE);
                            if (A04 != null) {
                                i3 = A04.intValue();
                            } else {
                                i3 = R.drawable.instagram_warning_pano_outline_24;
                            }
                            A01.A04(adsEligibilityErrorDataItem.A02, adsEligibilityErrorDataItem.A00, i3);
                        }
                        igdsHeadline.setBulletList(A01.A03());
                        return;
                    }
                }
                throw AbstractC166987dD.A12("Required value was null.");
            }
            throw AbstractC166987dD.A12("Required value was null.");
        }
        throw AbstractC166987dD.A12("Required value was null.");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(389976978);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_content_ineligible_screen, viewGroup, false);
        C0f9.A09(977821189, A02);
        return inflate;
    }
}
