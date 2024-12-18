package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.organic.model.LeadGenConsumerFormData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.NNs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52572NNs extends N6B {
    public static final String __redex_internal_original_name = "LeadGenConsumerFragment";
    public View A00;
    public C3I9 A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC60152ox A05 = new C56177Owk(this, 7);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "organic_lead_gen_consumer";
    }

    @Override // X.N6B, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = view.requireViewById(R.id.main_container);
        C3I8 A01 = C3I7.A01(this, false, false);
        this.A01 = A01;
        A01.A9e(this.A05);
        NP0 np0 = (NP0) this.A04.getValue();
        LeadGenConsumerFormData leadGenConsumerFormData = np0.A05;
        if (leadGenConsumerFormData != null) {
            String str = leadGenConsumerFormData.A09;
            C14360o3.A0B(str, 0);
            ((AbstractC51031Mge) np0).A00 = str;
            np0.A00 = leadGenConsumerFormData.A0D;
            C05A c05a = np0.A0F;
            AbstractC166997dE.A1Y(c05a, leadGenConsumerFormData.A0C);
            if (!AbstractC31176DnK.A1b(c05a)) {
                P4W.A01(np0.A04, "consumer_question_screen_impression", "impression", ((AbstractC51031Mge) np0).A00, np0.A00);
            }
            List list = leadGenConsumerFormData.A0B;
            ArrayList A1E = AbstractC166987dD.A1E();
            boolean z = false;
            for (Object obj : list) {
                LeadGenFormBaseQuestion leadGenFormBaseQuestion = (LeadGenFormBaseQuestion) obj;
                if (np0.A05() && !z && leadGenFormBaseQuestion.A03 == VEF.A06 && AbstractC166987dD.A1b(leadGenFormBaseQuestion.A0D)) {
                    z = true;
                } else if (leadGenFormBaseQuestion.A03 == VEF.A06) {
                    A1E.add(obj);
                }
            }
            C05A c05a2 = np0.A0D;
            ArrayList A1E2 = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC50523MSb.A1O(A1E2, it);
            }
            c05a2.Egh(A1E2);
            np0.A0C.Egh(A1E);
            C05A c05a3 = np0.A0G;
            String str2 = leadGenConsumerFormData.A07;
            ImageUrl imageUrl = leadGenConsumerFormData.A03;
            int i = leadGenConsumerFormData.A01;
            int size = A1E.size();
            ImageUrl imageUrl2 = leadGenConsumerFormData.A04;
            boolean A1Z = AbstractC25229BEm.A1Z(imageUrl2);
            String str3 = leadGenConsumerFormData.A0A;
            c05a3.Egh(new C51633MrQ(C55205OeH.A01(str3), imageUrl, imageUrl2, C05F.A00, str2, C16930sl.A00, i, size, A1Z));
            if (!A1Z) {
                if (str3 != null) {
                    P4W.A01(np0.A04, "consumer_welcome_message_impression", "impression", ((AbstractC51031Mge) np0).A00, np0.A00);
                }
                if (imageUrl2 != null) {
                    P4W.A01(np0.A04, "consumer_header_image_impression", "impression", ((AbstractC51031Mge) np0).A00, np0.A00);
                }
            }
            np0.A0I.Egh(leadGenConsumerFormData.A05);
            np0.A0E.Egh(new C51761Mtk((C5QE) null, (Integer) null, 2));
        }
    }

    public C52572NNs() {
        C57544PgI A01 = C57544PgI.A01(this, 12);
        C57544PgI A012 = C57544PgI.A01(this, 4);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = C57544PgI.A00(A012, enumC09460dv, 5);
        this.A04 = AbstractC25225BEi.A0a(C57544PgI.A01(A00, 6), A01, C57534Pg8.A00(A00, null, 23), AbstractC25225BEi.A1D(NP0.class));
        C57544PgI A013 = C57544PgI.A01(this, 10);
        InterfaceC09390do A002 = C57544PgI.A00(C57544PgI.A01(this, 7), enumC09460dv, 8);
        this.A02 = AbstractC25225BEi.A0a(C57544PgI.A01(A002, 9), A013, C57534Pg8.A00(A002, null, 24), AbstractC25225BEi.A1D(C52580NOa.class));
        C57544PgI A014 = C57544PgI.A01(this, 11);
        InterfaceC09390do A003 = C57544PgI.A00(C57544PgI.A01(this, 1), enumC09460dv, 2);
        this.A03 = AbstractC25225BEi.A0a(C57544PgI.A01(A003, 3), A014, C57534Pg8.A00(A003, null, 22), AbstractC25225BEi.A1D(C50992Mfz.class));
    }

    public static final void A02(C52572NNs c52572NNs, boolean z) {
        if (c52572NNs.getParentFragmentManager().A0Q("lead_gen_consumer_initialization") != null && (!((AbstractC51031Mge) c52572NNs.A04.getValue()).A05() || z)) {
            AbstractC25231BEo.A0c(c52572NNs.requireActivity(), c52572NNs.A0G).A0G("lead_gen_consumer_initialization", 1);
        } else {
            AbstractC25231BEo.A0c(c52572NNs.requireActivity(), c52572NNs.A0G).A06();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-862754401);
        super.onCreate(bundle);
        EVO.A01(this);
        C0f9.A09(-484963767, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-872626769);
        super.onDestroy();
        C3I9 c3i9 = this.A01;
        if (c3i9 != null) {
            c3i9.onDestroy();
        }
        C0f9.A09(122612703, A02);
    }

    @Override // X.N6B, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1322244343);
        super.onDestroyView();
        this.A00 = null;
        C3I9 c3i9 = this.A01;
        if (c3i9 != null) {
            c3i9.EFx(this.A05);
        }
        C0f9.A09(-1880485576, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-786911747);
        super.onPause();
        AbstractC13880nE.A0O(this.mView);
        C0f9.A09(-1338315381, A02);
    }

    @Override // X.N6B, androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1007486574);
        super.onStart();
        C3I9 c3i9 = this.A01;
        if (c3i9 != null) {
            MSX.A16(this, c3i9);
        }
        C0f9.A09(-242663868, A02);
    }

    @Override // X.N6B, androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1765815970);
        super.onStop();
        C3I9 c3i9 = this.A01;
        if (c3i9 != null) {
            c3i9.onStop();
        }
        C0f9.A09(1059348750, A02);
    }
}
