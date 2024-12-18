package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.igds.components.shimmer.placeholder.SimpleShimmerPlaceholderView;
import com.instagram.user.model.User;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class KCC extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "BarcelonaGoldenTicketFragment";
    public long A00;
    public LF4 A01;
    public L3B A02;
    public C23031Ai A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final InterfaceC09390do A0A = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "barcelona_golden_ticket";
    }

    @Override // X.AbstractC59962oe, X.InterfaceC11390ix
    public final String getModuleNameV2() {
        return "barcelona_golden_ticket";
    }

    /* JADX WARN: Type inference failed for: r3v25, types: [X.65S, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        int i2;
        SimpleDateFormat simpleDateFormat;
        boolean z;
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        FragmentActivity requireActivity = requireActivity();
        Typeface A02 = AbstractC15960qq.A00(requireActivity).A02(EnumC15950qp.A0x);
        Typeface A022 = AbstractC15960qq.A00(requireActivity).A02(EnumC15950qp.A0w);
        long j = requireArguments().getLong("target_user_id", 0L);
        SimpleShimmerPlaceholderView simpleShimmerPlaceholderView = (SimpleShimmerPlaceholderView) AbstractC166997dE.A0S(view, R.id.ticket_number_placeholder);
        IgTextView igTextView = (IgTextView) AbstractC166997dE.A0S(view, R.id.ticket_number);
        AbstractC166987dD.A1Z(new MBb(A02, this, igTextView, simpleShimmerPlaceholderView, null, j), AbstractC25229BEm.A0a(this));
        int color = requireActivity.getColor(R.color.black);
        AbstractC56402iY.A02(requireActivity, color);
        C30D.A04(requireActivity, color);
        view.setBackgroundColor(color);
        Date date = new Date(this.A00);
        InterfaceC09390do interfaceC09390do = this.A0A;
        User A023 = AbstractC31176DnK.A0h(interfaceC09390do).A02(String.valueOf(j));
        if (A023 == null) {
            A023 = AbstractC31176DnK.A0g(C17060sy.A01, interfaceC09390do);
        }
        int color2 = requireActivity.getColor(R.color.grey_6);
        ViewOnClickListenerC48064LPp.A00(AbstractC166997dE.A0S(view, R.id.dismiss_button), 16, this);
        ImageView A0D = AbstractC31176DnK.A0D(view, R.id.countdown_timer);
        if (this.A08) {
            Context requireContext = requireContext();
            i = 0;
            ChoreographerFrameCallbackC45695KKh choreographerFrameCallbackC45695KKh = new ChoreographerFrameCallbackC45695KKh(requireContext, AbstractC166987dD.A0r(interfaceC09390do), color2, color2, requireContext.getColor(R.color.black));
            choreographerFrameCallbackC45695KKh.A03 = true;
            choreographerFrameCallbackC45695KKh.A01 = date;
            Integer num = C05F.A0C;
            choreographerFrameCallbackC45695KKh.A00 = num;
            HashMap hashMap = choreographerFrameCallbackC45695KKh.A0C;
            C23831Eq.A0H(date, hashMap);
            EnumC89613z1 enumC89613z1 = EnumC89613z1.A05;
            Number A0W = AbstractC31171DnF.A0W(enumC89613z1, hashMap);
            if (A0W != null && A0W.intValue() > 0) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(choreographerFrameCallbackC45695KKh.A01);
                calendar.add(12, 1);
                C23831Eq.A0H(calendar.getTime(), hashMap);
                ImmutableMap copyOf = ImmutableMap.copyOf((Map) hashMap);
                ChoreographerFrameCallbackC45695KKh.A02(choreographerFrameCallbackC45695KKh, JQ0.A08(copyOf, enumC89613z1, 0), JQ0.A08(copyOf, EnumC89613z1.A02, 0), JQ0.A08(copyOf, EnumC89613z1.A03, 0), JQ0.A08(copyOf, EnumC89613z1.A04, 0), JQ0.A08(copyOf, EnumC89613z1.A06, 0));
                choreographerFrameCallbackC45695KKh.A09.A00();
                choreographerFrameCallbackC45695KKh.invalidateSelf();
            } else {
                choreographerFrameCallbackC45695KKh.A01 = date;
                choreographerFrameCallbackC45695KKh.A00 = num;
                choreographerFrameCallbackC45695KKh.A02 = false;
                ChoreographerFrameCallbackC45695KKh.A01(choreographerFrameCallbackC45695KKh);
            }
            A0D.setImageDrawable(choreographerFrameCallbackC45695KKh);
        } else {
            i = 8;
        }
        A0D.setVisibility(i);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.eu_countdown_header);
        if (this.A07) {
            A0N.setTextSize(2, 16.0f);
            A0N.setTextColor(color2);
            A0N.setTypeface(A02);
            String str2 = this.A04;
            if (str2 == null) {
                str = "appName";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            i2 = 0;
            A0N.setText(AbstractC31174DnI.A0w(this, str2, 2131953673));
        } else {
            i2 = 8;
        }
        A0N.setVisibility(i2);
        ImageView imageView = (ImageView) AbstractC166997dE.A0S(view, R.id.ticket_background);
        AbstractC12990ll A0k = AbstractC25230BEn.A0k(interfaceC09390do, 0);
        if (C98J.A00(A0k).booleanValue() && C18U.A06(C06090Tz.A05, A0k, 36318857636944466L)) {
            LF4 lf4 = new LF4(AbstractC166997dE.A0R(view, R.id.golden_ticket_main_content), AbstractC166997dE.A0S(view, R.id.ticket_container), AbstractC166997dE.A0S(view, R.id.ticket_container_front), AbstractC166997dE.A0S(view, R.id.ticket_container_back), imageView, (ImageView) AbstractC166997dE.A0S(view, R.id.ticket_eu_stamp_icon), this.A07);
            ImageView imageView2 = lf4.A07;
            imageView2.setImageDrawable(lf4.A0A);
            imageView2.setLayerType(2, null);
            lf4.A08.setLayerType(2, null);
            lf4.A06.setLayerType(2, null);
            lf4.A04.setLayerType(2, null);
            ViewOnTouchListenerC48084LQj.A01(lf4.A03, 7, lf4);
            lf4.A09.A07(0.35d);
            this.A01 = lf4;
        } else {
            Context requireContext2 = requireContext();
            float dimension = AbstractC166997dE.A0N(this).getDimension(R.dimen.account_discovery_bottom_gap);
            float dimension2 = AbstractC166997dE.A0N(this).getDimension(R.dimen.asset_picker_static_sticker_last_row_padding);
            int A03 = AbstractC166997dE.A03(requireContext2);
            C72G c72g = new C72G();
            ?? obj = new Object();
            c72g.A06 = obj;
            c72g.A07 = obj;
            c72g.A05 = obj;
            c72g.A04 = obj;
            c72g.A00(dimension);
            c72g.A0B = new C72M(dimension2);
            c72g.A08 = new C72M(dimension2);
            C65O c65o = new C65O(new C65Q(c72g));
            c65o.setTint(A03);
            imageView.setImageDrawable(c65o);
        }
        View A0S = AbstractC166997dE.A0S(view, R.id.ticket_front_app_icon);
        ImageView A0D2 = AbstractC31176DnK.A0D(view, R.id.ticket_eu_stamp_icon);
        if (this.A07) {
            A0S.setVisibility(8);
            String language = C1Q2.A02().getLanguage();
            C14360o3.A07(language);
            boolean A1a = AbstractC43592JPx.A1a("en", 1, language);
            int i3 = R.drawable.golden_ticket_eu_stamp_international;
            if (A1a) {
                i3 = R.drawable.golden_ticket_eu_stamp;
            }
            A0D2.setImageResource(i3);
            A0D2.setVisibility(0);
        } else {
            A0D2.setVisibility(8);
            A0S.setVisibility(0);
        }
        AbstractC167007dF.A0N(view, R.id.ticket_date_label).setTypeface(A022);
        TextView A0N2 = AbstractC167007dF.A0N(view, R.id.ticket_date);
        A0N2.setTypeface(A02);
        Context requireContext3 = requireContext();
        SimpleDateFormat simpleDateFormat2 = AbstractC195798lM.A01;
        String A0p = AbstractC166997dE.A0p(requireContext3, 2131975643);
        String A0p2 = AbstractC166997dE.A0p(requireContext3, 2131977167);
        Date A01 = AbstractC195798lM.A01(null, new Date());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(A01);
        int i4 = calendar2.get(1);
        int i5 = calendar2.get(2);
        int i6 = calendar2.get(5);
        Date A012 = AbstractC195798lM.A01(null, date);
        calendar2.setTime(A012);
        int i7 = calendar2.get(1);
        int i8 = calendar2.get(2);
        int i9 = calendar2.get(5);
        if (i6 != i9 || i5 != i8 || i4 != i7) {
            if (i9 == i6 - 1 && i8 == i5 && i7 == i4) {
                A0p = A0p2;
            } else {
                if (A01.getTime() - A012.getTime() <= 31536000000L) {
                    simpleDateFormat = AbstractC195798lM.A01;
                } else {
                    simpleDateFormat = AbstractC195798lM.A03;
                }
                A0p = simpleDateFormat.format(A012);
                C14360o3.A0A(A0p);
            }
        }
        A0N2.setText(A0p);
        AbstractC167007dF.A0N(view, R.id.ticket_time_label).setTypeface(A022);
        TextView A0N3 = AbstractC167007dF.A0N(view, R.id.ticket_time);
        A0N3.setTypeface(A02);
        long j2 = this.A00;
        MX0.A02.setTime(new Date(j2));
        String format = new SimpleDateFormat("hh:mm a", MX0.A05()).format(Long.valueOf(j2));
        C14360o3.A07(format);
        A0N3.setText(format);
        AbstractC167007dF.A0N(view, R.id.ticket_username_label).setTypeface(A022);
        TextView A0N4 = AbstractC167007dF.A0N(view, R.id.ticket_username);
        A0N4.setTypeface(A02);
        AbstractC31173DnH.A1F(A0N4, A023);
        AbstractC31173DnH.A1T(this, AbstractC167007dF.A0T(view, R.id.profile_picture), A023);
        TextView A0N5 = AbstractC167007dF.A0N(view, R.id.username);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A023.getUsername());
        if (A023.isVerified()) {
            C85963sQ.A08(requireContext(), A0H, true);
        }
        A0N5.setText(A0H);
        IgdsMediaButton igdsMediaButton = (IgdsMediaButton) AbstractC166997dE.A0R(view, R.id.bottom_button_cta);
        if (!this.A05) {
            if (this.A08) {
                UserSession A0K = AbstractC31175DnJ.A0K(interfaceC09390do, 0);
                if (C98J.A00(A0K).booleanValue() && C151366re.A01(A0K) && C18U.A06(C06090Tz.A05, A0K, 36318857636223559L)) {
                    z = true;
                    if (!this.A09) {
                        A00(this, igdsMediaButton);
                        igdsMediaButton.setVisibility(0);
                        C0fQ.A00(new LPL(0, igdsMediaButton, A023, this, z), igdsMediaButton);
                        return;
                    }
                }
            }
            z = false;
            str = "appName";
            int i10 = 2131953668;
            if (this.A06) {
                i10 = 2131953667;
            }
            String str3 = this.A04;
            if (str3 != null) {
                igdsMediaButton.setLabel(AbstractC31174DnI.A0w(this, str3, i10));
                igdsMediaButton.setVisibility(0);
                C0fQ.A00(new LPL(0, igdsMediaButton, A023, this, z), igdsMediaButton);
                return;
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        igdsMediaButton.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.6cX, java.lang.Object] */
    public static final void A00(KCC kcc, IgdsMediaButton igdsMediaButton) {
        int i;
        if (kcc.A09) {
            Drawable drawable = kcc.requireContext().getDrawable(R.drawable.instagram_alert_check_pano_outline_24);
            if (drawable != null) {
                int A02 = AbstractC31171DnF.A02(AbstractC166997dE.A0N(kcc), R.dimen.action_bar_item_spacing_right);
                drawable.setBounds(0, 0, A02, A02);
                igdsMediaButton.setLabel(null);
                ?? obj = new Object();
                obj.A01 = drawable;
                igdsMediaButton.setStartAddOn(obj, kcc.getString(2131953671));
                return;
            }
            igdsMediaButton.A05();
            i = 2131953671;
        } else {
            igdsMediaButton.A05();
            i = 2131953669;
        }
        igdsMediaButton.setLabel(kcc.getString(i));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC25227BEk.A1B(this);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6, 36318857637534299L) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (X.AbstractC14490oL.A0A(r1) != false) goto L6;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KCC.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1384125091);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_barcelona_golden_ticket, false);
        C0f9.A09(852630508, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1695731716);
        super.onDestroyView();
        LF4 lf4 = this.A01;
        if (lf4 != null) {
            lf4.A09.A00();
        }
        this.A01 = null;
        C0f9.A09(738548175, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(630131959);
        super.onPause();
        LF4 lf4 = this.A01;
        if (lf4 != null) {
            lf4.A09.A01();
        }
        C0f9.A09(-976569944, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1406216159);
        super.onResume();
        LF4 lf4 = this.A01;
        if (lf4 != null) {
            lf4.A09.A07(0.35d);
        }
        C0f9.A09(80382446, A02);
    }
}
