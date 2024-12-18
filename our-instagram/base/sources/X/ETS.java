package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel;
import com.instagram.urlhandlers.smbeditpartner.SmbEditPartnerUrlHandlerActivity;
import java.util.List;

/* loaded from: classes6.dex */
public final class ETS extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    public ETS(Object obj, Object obj2, Object obj3, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj;
        this.A03 = obj2;
        this.A05 = str;
        this.A04 = str2;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-162822597);
                AbstractC52176N7l.A01((AbstractC52176N7l) this.A03, null, this.A04, this.A05, false);
                ((BrandedContentDisclosureBaseViewModel) this.A02).A08(true);
                i = 1445547883;
                break;
            case 1:
                A03 = C0f9.A03(1798599925);
                String A00 = AbstractC43591JPw.A00(540);
                String A002 = AbstractC43591JPw.A00(623);
                C0K8.A0D(A00, A002);
                C47911LEf.A00(null, this.A04, String.valueOf(((L5O) this.A02).A00), AnonymousClass001.A0R(this.A05, A002));
                AbstractC25225BEi.A1U(this.A01, null);
                i = -2016276995;
                break;
            default:
                A03 = C0f9.A03(-390937172);
                super.onFail(abstractC115105If);
                ((Activity) this.A02).finish();
                i = -1843483781;
                break;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        String str;
        int i2;
        C83403nh c83403nh;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1231737365);
                C38864H9m c38864H9m = (C38864H9m) obj;
                int A0N = AbstractC167017dG.A0N(c38864H9m, -1371116915);
                AbstractC52176N7l abstractC52176N7l = (AbstractC52176N7l) this.A03;
                AbstractC52176N7l.A01(abstractC52176N7l, c38864H9m.A00, this.A04, this.A05, true);
                if (c38864H9m.A00 != null) {
                    Context requireContext = abstractC52176N7l.requireContext();
                    IGI igi = c38864H9m.A00;
                    if (igi != null) {
                        C193328hC A0I = AbstractC31171DnF.A0I(requireContext);
                        String str2 = igi.A01;
                        if (str2 != null) {
                            A0I.A05 = str2;
                            String str3 = igi.A00;
                            if (str3 != null) {
                                A0I.A0r(str3);
                                AbstractC31176DnK.A15(DialogInterfaceOnClickListenerC35387Fj2.A00, A0I);
                            } else {
                                str = "displayMessage";
                            }
                        } else {
                            str = "displayTitle";
                        }
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    IllegalStateException A0g = AbstractC166997dE.A0g();
                    C0f9.A0A(-1590159893, A0N);
                    throw A0g;
                }
                ((GXD) this.A01).DyW();
                C0f9.A0A(1363125453, A0N);
                i = 1462664157;
                C0f9.A0A(i, A03);
                return;
            case 1:
                A03 = C0f9.A03(962190578);
                C7BA c7ba = (C7BA) obj;
                int A0N2 = AbstractC167017dG.A0N(c7ba, -999906247);
                List list = c7ba.A00;
                if (list != null) {
                    list.size();
                }
                List list2 = c7ba.A00;
                if (list2 != null && (c83403nh = (C83403nh) AbstractC001800i.A0J(list2)) != null) {
                    C47911LEf.A00(c83403nh, this.A04, String.valueOf(((L5O) this.A02).A00), null);
                    AbstractC25225BEi.A1U(this.A01, c83403nh);
                    i2 = -1991396153;
                } else {
                    C47911LEf.A00(null, this.A04, String.valueOf(((L5O) this.A02).A00), AnonymousClass001.A0R(this.A05, "Fetch supplemental message from EB finish with success but no message returns!"));
                    AbstractC25225BEi.A1U(this.A01, null);
                    i2 = -85150811;
                }
                C0f9.A0A(i2, A0N2);
                i = -786938785;
                C0f9.A0A(i, A03);
                return;
            default:
                A03 = C0f9.A03(34030080);
                EBI ebi = (EBI) obj;
                int A032 = C0f9.A03(2054543433);
                super.onSuccess(ebi);
                if (!ebi.A00.isEmpty()) {
                    FKE fke = (FKE) ebi.A00.get(0);
                    SmbEditPartnerUrlHandlerActivity smbEditPartnerUrlHandlerActivity = (SmbEditPartnerUrlHandlerActivity) this.A01;
                    AbstractC18680vv abstractC18680vv = smbEditPartnerUrlHandlerActivity.A00;
                    abstractC18680vv.getClass();
                    FragmentActivity fragmentActivity = (FragmentActivity) this.A02;
                    SMBPartnerType sMBPartnerType = (SMBPartnerType) this.A03;
                    String str4 = this.A05;
                    String str5 = fke.A00;
                    String str6 = fke.A01;
                    String A033 = AbstractC1566171j.A03(fke);
                    String str7 = this.A04;
                    str7.getClass();
                    C14360o3.A0B(str4, 3);
                    AbstractC31180DnO.A1C(AbstractC31174DnI.A0P().A06(sMBPartnerType, str4, str5, str6, A033, null, str7), fragmentActivity, abstractC18680vv);
                    smbEditPartnerUrlHandlerActivity.A0a();
                } else {
                    ((Activity) this.A02).finish();
                }
                C0f9.A0A(-1059986163, A032);
                i = -754641294;
                C0f9.A0A(i, A03);
                return;
        }
    }
}
