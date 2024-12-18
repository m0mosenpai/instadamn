package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.AudienceMessageEntityRange;
import com.instagram.api.schemas.AudienceValidationResponse;
import com.instagram.api.schemas.BoostedComponentMessageType;
import com.instagram.api.schemas.BoostedPostAudienceOption;
import com.instagram.business.promote.model.PromoteAudience;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.business.promote.model.SpecialRequirementCategory;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Vsw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69655Vsw {
    public boolean A00;
    public boolean A01;
    public final FragmentActivity A02;
    public final C70399WUb A03;
    public final C34594FMd A04;
    public final PromoteData A05;
    public final PromoteState A06;
    public final UserSession A07;
    public final IgRadioGroup A08;
    public final Map A09;
    public final Map A0A;
    public final Map A0B;

    public C69655Vsw(View view, FragmentActivity fragmentActivity, PromoteData promoteData, PromoteState promoteState) {
        AbstractC167017dG.A1R(promoteData, promoteState);
        this.A05 = promoteData;
        this.A06 = promoteState;
        this.A02 = fragmentActivity;
        UserSession userSession = promoteData.A0y;
        C14360o3.A06(userSession);
        this.A07 = userSession;
        this.A08 = (IgRadioGroup) AbstractC166997dE.A0R(view, R.id.audience_group);
        this.A09 = new HashMap();
        this.A0A = new HashMap();
        this.A0B = new HashMap();
        this.A01 = true;
        this.A00 = false;
        this.A04 = new C34594FMd(fragmentActivity, AbstractC018607g.A00(fragmentActivity), userSession, promoteData.A1A, promoteData.A1L);
        this.A03 = C70399WUb.A00(userSession);
    }

    public final void A00() {
        int i;
        String string;
        AudienceValidationResponse A03;
        List<AudienceMessageEntityRange> list;
        Integer BYa;
        String substring;
        IgRadioGroup igRadioGroup = this.A08;
        igRadioGroup.removeAllViews();
        PromoteData promoteData = this.A05;
        List list2 = promoteData.A21;
        this.A01 = list2.isEmpty();
        if (list2.size() == 1 && AbstractC166987dD.A16(list2) == SpecialRequirementCategory.A07) {
            this.A01 = true;
        }
        List<PromoteAudience> list3 = promoteData.A1m;
        C14360o3.A06(list3);
        C66359UCf c66359UCf = null;
        for (PromoteAudience promoteAudience : list3) {
            if (WGs.A0P(promoteAudience)) {
                FragmentActivity fragmentActivity = this.A02;
                c66359UCf = new C66359UCf(fragmentActivity);
                c66359UCf.setTag(BoostedPostAudienceOption.A0K.toString());
                UserSession userSession = this.A07;
                if (WG1.A03(userSession)) {
                    c66359UCf.setPrimaryText(AbstractC166997dE.A0p(fragmentActivity, 2131954067));
                    string = AbstractC166997dE.A0p(fragmentActivity, 2131954065);
                } else {
                    String str = promoteAudience.A07;
                    if (str != null) {
                        c66359UCf.setPrimaryText(str);
                        if (C18U.A06(C06090Tz.A05, userSession, 36310886176194916L)) {
                            c66359UCf.setSecondaryText(WGs.A0B(fragmentActivity, promoteAudience, promoteData));
                            c66359UCf.A9c(new C71078Wna(c66359UCf, 0));
                            igRadioGroup.addView(c66359UCf);
                        } else {
                            int i2 = 2131970398;
                            if (promoteData.A0C()) {
                                i2 = 2131970399;
                            }
                            string = fragmentActivity.getString(i2);
                            C14360o3.A0A(string);
                        }
                    } else {
                        throw new IllegalStateException("Automatic audience name can not be null");
                    }
                }
                c66359UCf.setSecondaryText(string);
                c66359UCf.A04(true);
                igRadioGroup.addView(c66359UCf);
            } else {
                String str2 = promoteAudience.A05;
                if (str2 != null) {
                    FragmentActivity fragmentActivity2 = this.A02;
                    WMS wms = null;
                    C66359UCf c66359UCf2 = new C66359UCf(fragmentActivity2);
                    c66359UCf2.setTag(promoteAudience.A05);
                    String str3 = promoteAudience.A07;
                    if (str3 != null) {
                        c66359UCf2.setPrimaryText(str3);
                        c66359UCf2.setSecondaryText(WGs.A0B(fragmentActivity2, promoteAudience, promoteData));
                        c66359UCf2.setWarningText(WGs.A05(fragmentActivity2, VG4.A0B, promoteAudience, promoteData));
                        WMS wms2 = new WMS(str2, this, 4);
                        if (this.A01) {
                            c66359UCf2.setActionLabel(AbstractC166997dE.A0p(fragmentActivity2, 2131970654), promoteData.A0y, wms2);
                        }
                        if (this.A01) {
                            wms = wms2;
                        }
                        c66359UCf2.setSubtitleContainerOnClickListener(wms);
                        c66359UCf2.A9c(new C71081Wnd(this, promoteAudience, c66359UCf2, str2));
                        c66359UCf2.setOnLongClickListener(new ViewOnLongClickListenerC70245WNp(this, c66359UCf2, str2));
                        igRadioGroup.addView(c66359UCf2);
                        if (promoteAudience.A0D) {
                            if (C18U.A06(C06090Tz.A05, this.A07, 36326786144942197L)) {
                                View inflate = LayoutInflater.from(fragmentActivity2).inflate(R.layout.promote_row_with_subtitle_text, (ViewGroup) igRadioGroup, false);
                                TextView A0N = AbstractC167007dF.A0N(inflate, R.id.primary_text);
                                TextView A0N2 = AbstractC167007dF.A0N(inflate, R.id.secondary_text);
                                AbstractC166987dD.A1P(fragmentActivity2, A0N, 2131970997);
                                String A0q = AbstractC166997dE.A0q(fragmentActivity2.getResources(), 2131965052);
                                String A0r = AbstractC166997dE.A0r(fragmentActivity2.getResources(), A0q, 2131970996);
                                C14360o3.A07(A0r);
                                AnonymousClass773.A07(new VB6(this, fragmentActivity2.getColor(AbstractC53242c7.A06(fragmentActivity2))), A0N2, A0q, A0r);
                                inflate.setVisibility(8);
                                this.A09.put(promoteAudience.A05, inflate);
                                View inflate2 = LayoutInflater.from(fragmentActivity2).inflate(R.layout.promote_toggle_row, (ViewGroup) igRadioGroup, false);
                                AbstractC166987dD.A1P(fragmentActivity2, (TextView) inflate2.requireViewById(R.id.toggle_row_title), 2131970999);
                                AbstractC166987dD.A1P(fragmentActivity2, (TextView) inflate2.requireViewById(R.id.toggle_row_subtitle), 2131970998);
                                int A0E = AbstractC167017dG.A0E(fragmentActivity2);
                                View A0S = AbstractC166997dE.A0S(inflate2, R.id.promote_toggle_row_container);
                                AbstractC13880nE.A0a(A0S, A0E);
                                AbstractC13880nE.A0c(A0S, A0E);
                                inflate2.setVisibility(8);
                                this.A0A.put(promoteAudience.A05, inflate2);
                                igRadioGroup.addView(inflate);
                                igRadioGroup.addView(inflate2);
                            }
                        }
                        if ((!promoteAudience.A0B.isEmpty()) && ((AudienceValidationResponse) promoteAudience.A0B.get(0)).A02 != null && ((AudienceValidationResponse) promoteAudience.A0B.get(0)).A01 == BoostedComponentMessageType.A07 && AbstractC69923Vxo.A01(promoteAudience) && (A03 = WGs.A03(promoteAudience)) != null) {
                            View inflate3 = LayoutInflater.from(fragmentActivity2).inflate(R.layout.promote_disclaimer_row, (ViewGroup) igRadioGroup, false);
                            TextView A0N3 = AbstractC167007dF.A0N(inflate3, R.id.promote_disclaimer_description_title);
                            TextView A0N4 = AbstractC167007dF.A0N(inflate3, R.id.promote_disclaimer_description);
                            TextView A0N5 = AbstractC167007dF.A0N(inflate3, R.id.promote_disclaimer_cta);
                            String str4 = A03.A03;
                            String A0H = WGs.A0H(A03);
                            String A0G = WGs.A0G(A03);
                            if (str4 != null) {
                                A0N3.setText(str4);
                            }
                            if (A0H != null && A0G != null) {
                                String str5 = A03.A02;
                                A0N4.setText(str5);
                                A0N5.setText(A0G);
                                if (AbstractC69923Vxo.A01(promoteData.A07()) && (list = A03.A05) != null) {
                                    for (AudienceMessageEntityRange audienceMessageEntityRange : list) {
                                        Integer BYa2 = audienceMessageEntityRange.BYa();
                                        Integer BN2 = audienceMessageEntityRange.BN2();
                                        String url = audienceMessageEntityRange.getUrl();
                                        if (BYa2 != null && BN2 != null && url != null && (BYa = audienceMessageEntityRange.BYa()) != null) {
                                            C17u c17u = new C17u(BYa.intValue(), (BYa2.intValue() + BN2.intValue()) - 1);
                                            C14360o3.A0B(str5, 0);
                                            if (c17u.isEmpty()) {
                                                substring = "";
                                            } else {
                                                substring = str5.substring(c17u.A00, c17u.A01 + 1);
                                                C14360o3.A07(substring);
                                            }
                                            AnonymousClass773.A07(new VB4(audienceMessageEntityRange, this, AbstractC167007dF.A09(fragmentActivity2, R.attr.igds_color_secondary_selectable_text)), A0N4, substring, str5);
                                        }
                                    }
                                }
                                AnonymousClass773.A07(new VB5(this, A0H, fragmentActivity2.getColor(AbstractC53242c7.A06(fragmentActivity2))), A0N5, A0G, A0G);
                                inflate3.setVisibility(8);
                                this.A0B.put(promoteAudience.A05, inflate3);
                                igRadioGroup.addView(inflate3);
                            }
                        }
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    throw new IllegalStateException("Audience Id can not be null to create custom audience button row");
                }
            }
        }
        igRadioGroup.A02 = new C71085Wnh(this, 1);
        if (this.A06.A02 && igRadioGroup.findViewWithTag(promoteData.A1Z) != null) {
            View findViewWithTag = igRadioGroup.findViewWithTag(promoteData.A1Z);
            C14360o3.A07(findViewWithTag);
            i = findViewWithTag.getId();
        } else {
            i = -1;
        }
        igRadioGroup.A02(i);
        if (igRadioGroup.A00 == -1 && c66359UCf != null) {
            igRadioGroup.A02(c66359UCf.getId());
        }
    }
}
