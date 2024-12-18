package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.user.model.User;
import java.text.Collator;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.Ob3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55092Ob3 {
    public View A00;
    public View A01;
    public View A02;
    public ViewGroup A03;
    public ViewGroup A04;
    public C55023OWx A05;
    public Runnable A06;
    public Runnable A07;
    public String A08;
    public final double A09;
    public final AbstractC59962oe A0A;
    public final UserSession A0B;
    public final NKE A0C;
    public final Long A0D;
    public final Long A0E;
    public final List A0F = AbstractC166987dD.A1E();
    public final boolean A0G;

    private View A00(View.OnClickListener onClickListener, Integer num, String str) {
        ViewGroup viewGroup = this.A04;
        if (viewGroup == null) {
            return null;
        }
        int i = 0;
        View inflate = AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.suggested_fundraiser_icon_pill, this.A04, false);
        ImageView A0I = AbstractC31173DnH.A0I(inflate, R.id.fundraiser_suggestion_pill_icon);
        TextView A0T = AbstractC166997dE.A0T(inflate, R.id.fundraiser_suggestion_pill_text);
        if (num != null) {
            A0I.setImageResource(num.intValue());
        } else {
            i = 8;
        }
        A0I.setVisibility(i);
        A0T.setText(str);
        C0fQ.A00(onClickListener, inflate);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.CharSequence] */
    private void A01(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, String str, String str2) {
        if (this.A03 != null) {
            AbstractC59962oe abstractC59962oe = this.A0A;
            abstractC59962oe.requireActivity();
            int A01 = AbstractC31177DnL.A01(this.A03, R.id.create_fundraiser_container);
            this.A03.requireViewById(R.id.fundraiser_info_container).setVisibility(0);
            TextView A0T = AbstractC166997dE.A0T(this.A03, R.id.fundraiser_title);
            String str3 = str;
            if (str == null) {
                str3 = abstractC59962oe.getText(2131963006);
            }
            A0T.setText(str3);
            TextView A0T2 = AbstractC166997dE.A0T(this.A03, R.id.fundraiser_subtitle);
            if (str2 != null) {
                A0T2.setText(str2);
                A0T2.setVisibility(0);
            } else {
                A0T2.setVisibility(A01);
            }
            View requireViewById = this.A03.requireViewById(R.id.fundraiser_text_container);
            if (onClickListener != null) {
                C0fQ.A00(onClickListener, requireViewById);
            } else {
                requireViewById.setOnClickListener(null);
            }
            View requireViewById2 = this.A03.requireViewById(R.id.fundraiser_row_cross);
            requireViewById2.setVisibility(0);
            C0fQ.A00(onClickListener2, requireViewById2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c5, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 36318492563085538L) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02() {
        /*
            r8 = this;
            X.NKE r5 = r8.A0C
            com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel r1 = r5.A04
            if (r1 == 0) goto L71
            java.lang.String r0 = r1.A00
            java.lang.String r3 = r1.A01
            if (r0 == 0) goto L6f
            int r2 = r0.length()
            if (r2 == 0) goto L6f
            java.util.ArrayList r1 = X.AbstractC31174DnI.A0z(r0)
            r0 = 30
            if (r2 > r0) goto L1d
            r1.add(r3)
        L1d:
            java.lang.String r0 = " · "
            java.lang.String r0 = X.AbstractC31175DnJ.A0a(r0, r1)
        L23:
            r1 = 5
            X.OkI r2 = new X.OkI
            r2.<init>(r8, r1)
            r1 = 0
            r8.A01(r1, r2, r1, r0)
            com.instagram.common.session.UserSession r7 = r8.A0B
            com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel r0 = r5.A04
            java.lang.String r6 = r0.A03
            java.lang.String r5 = r5.A0E
            X.2oe r2 = r8.A0A
            java.lang.String r4 = "FEED_COMPOSER"
            r1 = 1
            java.util.HashMap r3 = X.AbstractC166987dD.A1G()
            java.lang.String r0 = X.AbstractC50532MSl.A00()
            r3.put(r0, r5)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "pre_attached"
            r3.put(r0, r1)
            X.0wW r1 = X.AbstractC12220kQ.A01(r2, r7)
            java.lang.String r0 = "ig_cg_composer_show_existing_fundraiser"
            X.0Ai r2 = X.AbstractC166987dD.A0f(r1, r0)
            java.lang.Long r1 = X.AbstractC166997dE.A0j(r6)
            java.lang.String r0 = "fundraiser_id"
            r2.A9K(r0, r1)
            java.lang.String r0 = "attributes"
            r2.A9M(r0, r3)
            java.lang.String r0 = "source_name"
            r2.AAP(r0, r4)
            r2.Cht()
            return
        L6f:
            r0 = 0
            goto L23
        L71:
            com.instagram.model.fundraiser.NewFundraiserInfo r0 = r5.A02
            if (r0 == 0) goto L79
            r8.A04(r0)
            return
        L79:
            android.view.ViewGroup r1 = r8.A03
            if (r1 == 0) goto Lcd
            r0 = 2131430954(0x7f0b0e2a, float:1.8483624E38)
            X.MSZ.A14(r1, r0)
            android.view.ViewGroup r1 = r8.A03
            r0 = 2131433297(0x7f0b1751, float:1.8488376E38)
            int r2 = X.AbstractC31177DnL.A01(r1, r0)
            android.view.ViewGroup r1 = r8.A03
            r0 = 2131433310(0x7f0b175e, float:1.8488402E38)
            X.AbstractC31172DnG.A1J(r1, r0, r2)
            android.view.ViewGroup r1 = r8.A03
            r0 = 2131430956(0x7f0b0e2c, float:1.8483628E38)
            android.view.View r1 = r1.requireViewById(r0)
            r0 = 9
            X.ViewOnClickListenerC55463OkI.A00(r1, r0, r8)
            android.view.ViewGroup r1 = r8.A03
            r0 = 2131430955(0x7f0b0e2b, float:1.8483626E38)
            android.widget.TextView r4 = X.AbstractC166997dE.A0T(r1, r0)
            com.instagram.common.session.UserSession r3 = r8.A0B
            com.instagram.user.model.User r0 = X.AbstractC166987dD.A10(r3)
            boolean r0 = r0.A1y()
            if (r0 == 0) goto Lc7
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36318492563085538(0x81077a000018e2, double:3.031299167502024E-306)
            boolean r1 = X.C18U.A06(r2, r3, r0)
            r0 = 2131971487(0x7f134d9f, float:1.9579955E38)
            if (r1 != 0) goto Lca
        Lc7:
            r0 = 2131956949(0x7f1314d5, float:1.9550468E38)
        Lca:
            r4.setText(r0)
        Lcd:
            com.instagram.common.session.UserSession r3 = r8.A0B
            java.lang.String r2 = r5.A0E
            X.2oe r1 = r8.A0A
            java.lang.String r0 = "FEED_COMPOSER"
            X.AbstractC54907OQe.A00(r1, r3, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55092Ob3.A02():void");
    }

    public final void A03() {
        List list;
        InterfaceC81733ki interfaceC81733ki;
        if (this.A02 != null && this.A04 != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            ArrayList A1E2 = AbstractC166987dD.A1E();
            ArrayList A1E3 = AbstractC166987dD.A1E();
            UserSession userSession = this.A0B;
            NKE nke = this.A0C;
            LinkedHashSet linkedHashSet = new LinkedHashSet(nke.A07);
            LinkedHashSet linkedHashSet2 = nke.A08;
            linkedHashSet.addAll(linkedHashSet2);
            ArrayList A00 = AbstractC54909OQg.A00(userSession, linkedHashSet);
            Collections.sort(A00, new C31460Ds4(Collator.getInstance(), 20));
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                User A15 = AbstractC25226BEj.A15(it);
                if (!nke.A06.contains(A15.getUsername())) {
                    View A002 = A00(new ViewOnClickListenerC55468OkN(56, this, A15), null, A15.B8y());
                    if (A002 != null) {
                        A1E.add(A002);
                        AbstractC31173DnH.A1X(A15, A1E2);
                        A1E3.add(A15.getUsername());
                        if (A1E.size() == 5) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (!A1E.isEmpty() && C18U.A06(C06090Tz.A05, userSession, 36317959987140319L)) {
                list = this.A0F;
                if (!A1E3.equals(list)) {
                    list.clear();
                    list.addAll(A1E3);
                    AbstractC55215Oed.A09(this.A0A, userSession, "FEED_COMPOSER", A1E2);
                }
            } else {
                list = this.A0F;
                if (!list.isEmpty() && A1E2.isEmpty()) {
                    list.clear();
                    AbstractC55215Oed.A09(this.A0A, userSession, "FEED_COMPOSER", A1E2);
                }
                A1E = AbstractC166987dD.A1E();
            }
            if (!A1E.isEmpty() && !nke.A0B && this.A06 == null && this.A00 != null) {
                final C23031Ai A003 = AbstractC23021Ah.A00(userSession);
                final int i = A003.A01.getInt("feed_mentioned_tagged_nudge_nux_shown_count", 0);
                if (i < AbstractC31178DnM.A01(C06090Tz.A06, userSession, 36599576697966181L) && !list.isEmpty()) {
                    int i2 = 2131966309;
                    if (linkedHashSet2.contains(list.get(0))) {
                        i2 = 2131975168;
                    }
                    AbstractC59962oe abstractC59962oe = this.A0A;
                    String string = abstractC59962oe.getString(i2);
                    if (string != null && C18U.A06(C06090Tz.A05, userSession, 36317959987599073L)) {
                        C5SU c5su = new C5SU(abstractC59962oe.requireActivity(), new C149686oL(string));
                        c5su.A03(this.A00);
                        c5su.A02();
                        final C5SW A004 = c5su.A00();
                        Runnable runnable = new Runnable() { // from class: X.PTS
                            @Override // java.lang.Runnable
                            public final void run() {
                                C55092Ob3 c55092Ob3 = this;
                                C5SW c5sw = A004;
                                C23031Ai c23031Ai = A003;
                                int i3 = i;
                                c5sw.A07(null);
                                C55023OWx c55023OWx = c55092Ob3.A05;
                                if (c55023OWx != null) {
                                    c55023OWx.A03(c55092Ob3.A06);
                                }
                                InterfaceC19610xo A0w = AbstractC166987dD.A0w(c23031Ai);
                                A0w.E7D("feed_mentioned_tagged_nudge_nux_shown_count", i3 + 1);
                                A0w.apply();
                                c55092Ob3.A0C.A0B = true;
                                c55092Ob3.A06 = null;
                            }
                        };
                        this.A06 = runnable;
                        C55023OWx c55023OWx = this.A05;
                        if (c55023OWx != null) {
                            c55023OWx.A02(runnable);
                        }
                    }
                }
            }
            if (A1E.isEmpty() && (interfaceC81733ki = nke.A00) != null && interfaceC81733ki.C9n() > 0) {
                InterfaceC81733ki interfaceC81733ki2 = nke.A00;
                A1E = AbstractC166987dD.A1E();
                if (interfaceC81733ki2 != null) {
                    ArrayList A1E4 = AbstractC166987dD.A1E();
                    for (InterfaceC43571JMf interfaceC43571JMf : interfaceC81733ki2.B9F()) {
                        View A005 = A00(new ViewOnClickListenerC55468OkN(58, this, interfaceC43571JMf), null, interfaceC43571JMf.getFundraiserTitle());
                        if (A005 != null) {
                            A1E.add(A005);
                            A1E4.add(interfaceC43571JMf.getFundraiserId());
                        }
                        if (A1E.size() == 5) {
                            break;
                        }
                    }
                    AbstractC59962oe abstractC59962oe2 = this.A0A;
                    View A006 = A00(new ViewOnClickListenerC55463OkI(this, 8), Integer.valueOf(R.drawable.search_location_small), abstractC59962oe2.getString(2131962969));
                    if (A006 != null) {
                        A1E.add(A006);
                    }
                    if (!A1E.isEmpty() && !nke.A09.equals(A1E4)) {
                        nke.A09 = A1E4;
                        HashMap A1G = AbstractC166987dD.A1G();
                        A1G.put("suggested_fundraiser_ids", TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, A1E4));
                        AbstractC55215Oed.A07(abstractC59962oe2, userSession, "suggested_fundraiser_pills", "FEED_COMPOSER", null, null, A1G);
                    }
                }
            }
            boolean A1b = AbstractC25226BEj.A1b(A1E);
            this.A02.setVisibility(AbstractC167007dF.A05(A1b ? 1 : 0));
            this.A04.removeAllViews();
            if (A1b) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(0, 0, AbstractC166997dE.A08(this.A04.getResources()), 0);
                if (AbstractC166987dD.A10(userSession).A1y() && C18U.A06(C06090Tz.A05, userSession, 36318492563085538L)) {
                    ViewGroup viewGroup = this.A04;
                    View A007 = A00(new ViewOnClickListenerC55463OkI(this, 4), null, this.A0A.getString(2131961119));
                    A007.getClass();
                    viewGroup.addView(A007, layoutParams);
                }
                Iterator it2 = A1E.iterator();
                while (it2.hasNext()) {
                    this.A04.addView(AbstractC43592JPx.A09(it2), layoutParams);
                }
            }
        }
    }

    public final void A04(NewFundraiserInfo newFundraiserInfo) {
        String str;
        int length;
        String str2 = newFundraiserInfo.A04;
        if (str2 != null) {
            if (str2.equals(FundraiserCampaignTypeEnum.A0E.toString())) {
                NKE nke = this.A0C;
                nke.A02 = newFundraiserInfo;
                nke.A0A = true;
                UserSession userSession = this.A0B;
                AbstractC59962oe abstractC59962oe = this.A0A;
                FragmentActivity requireActivity = abstractC59962oe.requireActivity();
                String str3 = newFundraiserInfo.A01;
                str3.getClass();
                String str4 = newFundraiserInfo.A07;
                Integer valueOf = Integer.valueOf(newFundraiserInfo.A00);
                String str5 = newFundraiserInfo.A05;
                List list = newFundraiserInfo.A08;
                String str6 = newFundraiserInfo.A03;
                String str7 = nke.A0E;
                C14360o3.A0B(userSession, 0);
                AbstractC54282Nz2.A00(AbstractC166987dD.A0O(requireActivity), userSession, "com.instagram.social_impact.fundraiser.nonprofit_creation_details_for_feed.component.view", AbstractC55224Oeq.A00(valueOf, str3, "FEED_COMPOSER", str4, str5, str6, str7, list), 60L);
                String string = abstractC59962oe.getString(2131962970);
                ViewOnClickListenerC55468OkN viewOnClickListenerC55468OkN = new ViewOnClickListenerC55468OkN(57, this, newFundraiserInfo);
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
                currencyInstance.setMaximumFractionDigits(0);
                currencyInstance.setCurrency(Currency.getInstance(str5));
                String format = currencyInstance.format(valueOf);
                C14360o3.A07(format);
                if (str4 != null && (length = str4.length()) != 0) {
                    ArrayList A0z = AbstractC31174DnI.A0z(str4);
                    if (length <= 30) {
                        A0z.add(format);
                    }
                    str = AbstractC31175DnJ.A0a(" · ", A0z);
                } else {
                    str = null;
                }
                A01(viewOnClickListenerC55468OkN, new ViewOnClickListenerC55463OkI(this, 6), string, str);
                return;
            }
            if (!str2.equals(FundraiserCampaignTypeEnum.A0C.toString())) {
                return;
            }
            AbstractC59962oe abstractC59962oe2 = this.A0A;
            A01(null, new ViewOnClickListenerC55463OkI(this, 7), abstractC59962oe2.getString(2131961119), AbstractC31174DnI.A0w(abstractC59962oe2, newFundraiserInfo.A07, 2131961118));
        }
    }

    public C55092Ob3(AbstractC59962oe abstractC59962oe, UserSession userSession, NKE nke) {
        this.A0B = userSession;
        this.A0A = abstractC59962oe;
        this.A0C = nke;
        C06090Tz c06090Tz = C06090Tz.A06;
        this.A09 = C18U.A00(c06090Tz, userSession, 37162384917790944L);
        this.A0G = C18U.A06(c06090Tz, userSession, 36317959987992291L);
        this.A0D = AbstractC166997dE.A0i(c06090Tz, userSession, 36599434964504099L);
        this.A0E = AbstractC166997dE.A0i(c06090Tz, userSession, 36599576698031718L);
    }
}
