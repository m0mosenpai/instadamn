package com.instagram.wellbeing.timespent.fragment;

import X.AbstractC14490oL;
import X.AbstractC145016gM;
import X.AbstractC167007dF;
import X.AbstractC18680vv;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC31178DnM;
import X.AbstractC34359FDb;
import X.AbstractC455527p;
import X.AbstractC59962oe;
import X.AbstractC72723Nt;
import X.AnonymousClass001;
import X.AnonymousClass280;
import X.AnonymousClass282;
import X.C006802i;
import X.C05F;
import X.C06090Tz;
import X.C0f9;
import X.C0fQ;
import X.C0w9;
import X.C14360o3;
import X.C2AO;
import X.C2AP;
import X.C455127l;
import X.C461529z;
import X.C5F2;
import X.EnumC33408Epf;
import X.EnumC456327x;
import X.EnumC60772q1;
import X.GNF;
import X.InterfaceC223716s;
import X.InterfaceC60072op;
import X.ViewOnClickListenerC35610Fo1;
import X.ViewOnClickListenerC35672Fp7;
import X.ViewOnClickListenerC35678FpD;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.api.schemas.ScreenTimeScreenType;
import com.instagram.api.schemas.XFBYPRequestStatus;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class TimeSpentReminderFullyBlockingFragment extends AbstractC59962oe implements InterfaceC60072op {
    public View A00;
    public EnumC456327x A02;
    public C2AP A05;
    public int A04 = 0;
    public final Handler A06 = AbstractC167007dF.A0J();
    public EnumC33408Epf A03 = null;
    public UserSession A01;
    public final boolean A08 = AbstractC455527p.A01(this.A01);
    public final Runnable A07 = new GNF(this);

    private void A01(View view) {
        View.OnClickListener viewOnClickListenerC35678FpD;
        if (this.A02 == EnumC456327x.A03) {
            UserSession userSession = this.A01;
            AnonymousClass282 anonymousClass282 = AnonymousClass280.A01;
            if (anonymousClass282.A0C(userSession) && !C461529z.A0A(this.A01)) {
                return;
            }
            View requireViewById = view.requireViewById(R.id.footer_button);
            requireViewById.setVisibility(0);
            if (anonymousClass282.A0C(this.A01) && C461529z.A07(this.A01)) {
                InterfaceC223716s C45 = AbstractC31174DnI.A0m(this.A01).C45();
                if (C45 != null) {
                    C5F2 BMG = C45.BMG();
                    if (BMG != null && BMG.C0J() == XFBYPRequestStatus.A06) {
                        requireViewById.setEnabled(false);
                    } else {
                        requireViewById.setEnabled(true);
                    }
                }
                Context context = getContext();
                if (context == null) {
                    return;
                } else {
                    viewOnClickListenerC35678FpD = new ViewOnClickListenerC35610Fo1(21, this, context, this, requireViewById);
                }
            } else {
                viewOnClickListenerC35678FpD = new ViewOnClickListenerC35678FpD(this, 8);
            }
            C0fQ.A00(viewOnClickListenerC35678FpD, requireViewById);
        }
    }

    private void A03(TextView textView) {
        boolean A1X = AbstractC31178DnM.A1X(C06090Tz.A05, this.A01, 36324904949264977L);
        int i = 2131973348;
        if (A1X) {
            i = 2131957475;
        }
        textView.setText(i);
        textView.setTextColor(A00());
        C0fQ.A00(new ViewOnClickListenerC35672Fp7(21, this, this, A1X), textView);
    }

    private void A04(TextView textView) {
        if (this.A02 == EnumC456327x.A03 && AbstractC14490oL.A0C(requireContext()) && AbstractC31174DnI.A1Z(this) && !C461529z.A0A(this.A01)) {
            textView.setText(2131963402);
            textView.setTextColor(A00());
            ViewOnClickListenerC35678FpD.A00(textView, 5, this);
            return;
        }
        textView.setVisibility(8);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        int ordinal = this.A02.ordinal();
        if (ordinal != 2) {
            if (ordinal != 0) {
                if (ordinal == 7 || ordinal == 6 || ordinal == 8) {
                    return "quiet_mode";
                }
            } else if (!AbstractC31174DnI.A1Z(this)) {
                return "daily_limit";
            }
            return "guardian_daily_limit_reached";
        }
        return "take_a_break";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        EnumC456327x enumC456327x = this.A02;
        switch (enumC456327x.ordinal()) {
            case 0:
                if (!AbstractC31174DnI.A1Z(this) || C461529z.A08(this.A01)) {
                    return true;
                }
                requireActivity().moveTaskToBack(true);
                UserSession userSession = this.A01;
                AbstractC31172DnG.A1S(userSession, C05F.A00, this.A02.A00, AbstractC31176DnK.A03(C455127l.A03(userSession), userSession));
                return true;
            case 1:
            default:
                return false;
            case 2:
            case 6:
            case 7:
                return true;
            case 3:
            case 4:
            case 8:
                C0w9.A03("TimeSpentReminderFullyBlockingFragment_shouldFinishActivityUponResume", AnonymousClass001.A0R("Unrecognized reminder type ", enumC456327x.A00));
                return false;
            case 5:
                requireActivity().moveTaskToBack(true);
                UserSession userSession2 = this.A01;
                AbstractC31172DnG.A1S(userSession2, C05F.A00, this.A02.A00, AbstractC31176DnK.A03(C455127l.A03(userSession2), userSession2));
                return true;
        }
    }

    private int A00() {
        return requireContext().getColor(R.color.design_dark_default_color_on_background);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x034a, code lost:
    
        if (r13.A03 == X.EnumC33408Epf.A0D) goto L108;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x001b. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A02(android.view.View r14) {
        /*
            Method dump skipped, instructions count: 982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment.A02(android.view.View):void");
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A01;
    }

    @Override // X.AbstractC59962oe
    public final EnumC60772q1 getStatusBarType() {
        return EnumC60772q1.A03;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        EnumC33408Epf enumC33408Epf;
        int A02 = C0f9.A02(528221384);
        super.onCreate(bundle);
        AbstractC72723Nt.A00(requireContext());
        Bundle requireArguments = requireArguments();
        this.A01 = AbstractC31176DnK.A0S(this);
        this.A02 = EnumC456327x.valueOf(AbstractC31173DnH.A0j(requireArguments, "reminder_type"));
        this.A05 = C2AO.A00(this.A01);
        if (this.A02.ordinal() == 2) {
            this.A04 = (int) AbstractC31175DnJ.A02(this.A01);
        }
        C461529z.A01.add(this);
        String string = requireArguments.getString("timespent_dashbaord_entrypoint");
        if (string != null) {
            if (string.equalsIgnoreCase("ig_ts_entry_point_take_a_break_first_time_blocking")) {
                enumC33408Epf = EnumC33408Epf.A0D;
            } else if (string.equalsIgnoreCase("ig_ts_entry_point_take_a_break_blocking")) {
                enumC33408Epf = EnumC33408Epf.A0C;
            } else if (string.equalsIgnoreCase("ig_ts_entry_point_daily_limit_blocking")) {
                enumC33408Epf = EnumC33408Epf.A05;
            }
            this.A03 = enumC33408Epf;
        }
        C0f9.A09(-2001930559, A02);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (X.C461529z.A0A(r12.A01) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x013e, code lost:
    
        if (X.C461529z.A0A(r12.A01) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0197, code lost:
    
        if (X.C461529z.A0A(r12.A01) == false) goto L65;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0026. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0246  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r13, android.view.ViewGroup r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1375942213);
        this.A05.A00(AbstractC31174DnI.A07(this.A01));
        super.onDestroy();
        C0f9.A09(-1745216303, A02);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f2, code lost:
    
        if ((!X.AnonymousClass292.A07(r17.A01, r2)) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0111, code lost:
    
        if (new X.C71603Jf(r17.A01).A07(r1) != false) goto L46;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment.onResume():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(1922776769);
        if (this.A02 == EnumC456327x.A03 && AbstractC31174DnI.A1Z(this)) {
            AbstractC34359FDb.A00(ScreenTimeScreenType.A04, this.A01, AbstractC31177DnL.A06());
        }
        this.A06.removeCallbacks(this.A07);
        AbstractC145016gM.A02(requireActivity(), this, this.A01, true, false);
        super.onStop();
        C0f9.A09(701851311, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C2AP c2ap = this.A05;
        EnumC456327x enumC456327x = this.A02;
        C14360o3.A0B(enumC456327x, 0);
        if (C2AP.A06.contains(enumC456327x)) {
            c2ap.A02 = enumC456327x;
            c2ap.A00 = AbstractC31177DnL.A06();
            C006802i c006802i = c2ap.A03;
            c006802i.markerPoint(191636345, "show_blocking_view_controller");
            c006802i.markerAnnotate(191636345, "blocking_type", String.valueOf(c2ap.A02));
        }
    }
}
