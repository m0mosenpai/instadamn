package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.actionbar.ActionButton;
import com.instagram.user.model.UpcomingEvent;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class N6R extends AbstractC59962oe implements InterfaceC60072op, InterfaceC58115Ppe {
    public static final String __redex_internal_original_name = "UpcomingEventCreationFragment";
    public OWa A00;
    public C54487O5p A01;
    public C54735OFm A02;
    public C51626MrJ A03;
    public C55009OVr A04;
    public NSO A05;
    public InterfaceC58087PpC A06;
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);
    public static final long A0C = TimeUnit.MINUTES.toMillis(60);
    public static final long A0A = TimeUnit.DAYS.toMillis(90);
    public static final long A0B = TimeUnit.MINUTES.toMillis(5);
    public static final long A09 = TimeUnit.DAYS.toMillis(30);
    public static final long A08 = TimeUnit.MINUTES.toMillis(45);

    @Override // X.InterfaceC58115Ppe
    public final void DB6() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "upcoming_event_creation";
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006e, code lost:
    
        if (r3 == X.EnumC53233NgW.A05) goto L14;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            r10 = this;
            r9 = 0
            X.C14360o3.A0B(r11, r9)
            super.onViewCreated(r11, r12)
            X.OFm r0 = new X.OFm
            r0.<init>(r11)
            r10.A02 = r0
            android.content.Context r2 = r10.requireContext()
            X.0do r0 = r10.A07
            com.instagram.common.session.UserSession r1 = X.AbstractC166987dD.A0r(r0)
            X.OFm r0 = r10.A02
            if (r0 != 0) goto L26
            java.lang.String r0 = "viewHolder"
        L1e:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L26:
            X.OVr r8 = new X.OVr
            r8.<init>(r2, r1, r10, r0)
            r10.A04 = r8
            X.MrJ r7 = r10.A03
            if (r7 != 0) goto L34
            java.lang.String r0 = "viewState"
            goto L1e
        L34:
            X.NgW r3 = r7.A00
            X.OFm r6 = r8.A03
            com.instagram.actionbar.ActionButton r2 = r6.A0D
            r0 = 2131238123(0x7f081ceb, float:1.8092516E38)
            r2.setButtonResource(r0)
            android.content.Context r1 = X.AbstractC166997dE.A0L(r2)
            int r0 = X.C1QI.A04(r1)
            android.graphics.ColorFilter r0 = X.C3DY.A00(r0)
            r2.setColorFilter(r0)
            r0 = 2131961124(0x7f132524, float:1.9558936E38)
            X.AbstractC166997dE.A18(r1, r2, r0)
            r0 = 9
            X.Ok4.A00(r2, r0, r8)
            android.widget.ImageView r1 = r6.A05
            r0 = 10
            X.Ok4.A00(r1, r0, r8)
            android.widget.TextView r2 = r6.A09
            android.content.Context r5 = r8.A01
            X.NgW r0 = X.EnumC53233NgW.A07
            if (r3 == r0) goto L70
            X.NgW r1 = X.EnumC53233NgW.A05
            r0 = 2131972147(0x7f135033, float:1.9581293E38)
            if (r3 != r1) goto L73
        L70:
            r0 = 2131972148(0x7f135034, float:1.9581295E38)
        L73:
            X.AbstractC166987dD.A1P(r5, r2, r0)
            java.lang.String r3 = r7.A02
            android.widget.EditText r2 = r6.A04
            r1 = 3
            X.Oi5 r0 = new X.Oi5
            r0.<init>(r1, r2, r8)
            r8.A00 = r0
            r2.addTextChangedListener(r0)
            r2.setText(r3)
            java.util.Date r4 = r7.A04
            java.util.Date r3 = r7.A03
            android.view.View r2 = r6.A02
            r0 = 11
            X.Ok4.A00(r2, r0, r8)
            android.view.View r1 = r6.A01
            r0 = 12
            X.Ok4.A00(r1, r0, r8)
            r8.A01(r4, r3)
            X.AbstractC56952jT.A01(r2)
            X.AbstractC56952jT.A01(r1)
            com.instagram.user.model.UpcomingEvent r0 = r7.A01
            android.view.View r2 = r6.A00
            if (r0 == 0) goto Lc9
            r2.setVisibility(r9)
            r1 = 20
            X.OkN r0 = new X.OkN
            r0.<init>(r1, r2, r8)
            X.C0fQ.A00(r0, r2)
            X.AbstractC56952jT.A01(r2)
        Lb9:
            boolean r2 = r7.A06
            android.widget.TextView r1 = r6.A0B
            r0 = 2131972144(0x7f135030, float:1.9581287E38)
            if (r2 == 0) goto Lc5
            r0 = 2131972145(0x7f135031, float:1.958129E38)
        Lc5:
            X.AbstractC166987dD.A1P(r5, r1, r0)
            return
        Lc9:
            r0 = 8
            r2.setVisibility(r0)
            goto Lb9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6R.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(ActionButton actionButton, N6R n6r) {
        C51626MrJ c51626MrJ = n6r.A03;
        if (c51626MrJ == null) {
            C14360o3.A0F("viewState");
            throw C00O.createAndThrow();
        }
        boolean z = true;
        if (!(!AbstractC001900j.A0T(c51626MrJ.A02)) || c51626MrJ.A04 == null) {
            z = false;
        }
        actionButton.setEnabled(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.AbstractC115105If r4, X.N6R r5, java.lang.String r6) {
        /*
            boolean r0 = r4 instanceof X.C115095Ie
            java.lang.String r3 = "viewBinder"
            if (r0 != 0) goto L37
            boolean r0 = r4 instanceof X.C115115Ig
            if (r0 == 0) goto L41
            X.5Ig r4 = (X.C115115Ig) r4
            java.lang.Object r0 = r4.A00
            X.1up r0 = (X.InterfaceC40821up) r0
            java.lang.String r2 = r0.getErrorMessage()
            if (r2 == 0) goto L37
            X.OVr r0 = r5.A04
            if (r0 == 0) goto L46
            X.1vu r1 = X.C41451vu.A01
            X.6i8 r0 = X.AbstractC25229BEm.A0j()
            r0.A0H = r6
            r0.A0D = r2
            r0.A06()
            X.AbstractC31178DnM.A1N(r1, r0)
        L2a:
            X.OVr r0 = r5.A04
            if (r0 == 0) goto L46
            X.OFm r0 = r0.A03
            com.instagram.actionbar.ActionButton r1 = r0.A0D
            r0 = 0
            r1.setDisplayedChild(r0)
            return
        L37:
            X.OVr r0 = r5.A04
            if (r0 == 0) goto L46
            android.content.Context r0 = r0.A01
            X.C9GR.A0E(r0, r6)
            goto L2a
        L41:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L46:
            X.C14360o3.A0F(r3)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6R.A01(X.5If, X.N6R, java.lang.String):void");
    }

    public static final void A02(N6R n6r) {
        C51626MrJ c51626MrJ = n6r.A03;
        if (c51626MrJ == null) {
            C14360o3.A0F("viewState");
            throw C00O.createAndThrow();
        }
        EnumC53233NgW enumC53233NgW = c51626MrJ.A00;
        if (enumC53233NgW != EnumC53233NgW.A04 && enumC53233NgW.A00 && n6r.A01 == null) {
            AbstractC43593JPy.A1P(AbstractC166987dD.A0r(n6r.A07));
        } else {
            if (!n6r.isAdded() || !C06P.A01(n6r.getParentFragmentManager())) {
                return;
            }
            AbstractC31177DnL.A12(n6r);
        }
    }

    public final void A03() {
        C51626MrJ c51626MrJ = this.A03;
        String str = "viewState";
        if (c51626MrJ != null) {
            UpcomingEvent upcomingEvent = c51626MrJ.A01;
            EnumC53233NgW enumC53233NgW = c51626MrJ.A00;
            String str2 = c51626MrJ.A02;
            Date date = c51626MrJ.A04;
            Date date2 = c51626MrJ.A03;
            boolean z = c51626MrJ.A06;
            AbstractC167017dG.A1P(enumC53233NgW, str2);
            C51626MrJ c51626MrJ2 = new C51626MrJ(enumC53233NgW, upcomingEvent, str2, date, date2, true, z);
            this.A03 = c51626MrJ2;
            Date date3 = c51626MrJ2.A04;
            if (date3 == null) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(new Date());
                calendar.add(12, 60);
                int i = calendar.get(12) % 5;
                if (i != 0) {
                    calendar.add(12, 5 - i);
                }
                date3 = calendar.getTime();
            }
            OWa oWa = this.A00;
            if (oWa == null) {
                str = "datePickerController";
            } else {
                oWa.A02(true, requireContext().getString(2131952354), date3, null, null, true);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        if (r3 <= r5) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC58115Ppe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D9K(java.util.Date r10) {
        /*
            r9 = this;
            X.MrJ r3 = r9.A03
            r6 = 0
            if (r3 != 0) goto Lf
            java.lang.String r1 = "viewState"
        L7:
            X.C14360o3.A0F(r1)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Lf:
            if (r10 == 0) goto L2a
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            r2.setTime(r10)
            r0 = 14
            r1 = 0
            r2.set(r0, r1)
            r0 = 13
            r2.set(r0, r1)
            java.util.Date r6 = r2.getTime()
            X.C14360o3.A07(r6)
        L2a:
            boolean r0 = r3.A05
            java.lang.String r1 = "datePickerController"
            X.OWa r8 = r9.A00
            if (r0 == 0) goto L5f
            if (r8 == 0) goto L7
            if (r6 == 0) goto L5d
            long r4 = r6.getTime()
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = X.N6R.A0C
            long r2 = r2 + r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L5d
            long r4 = r6.getTime()
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = X.N6R.A0A
            long r2 = r2 + r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L5d
        L54:
            r7 = 1
        L55:
            X.8aR r0 = r8.A00
            if (r0 == 0) goto L5c
            r0.A0Q(r7)
        L5c:
            return
        L5d:
            r7 = 0
            goto L55
        L5f:
            if (r8 == 0) goto L7
            java.util.Date r0 = r3.A04
            r7 = 0
            if (r0 == 0) goto L55
            if (r6 == 0) goto L55
            long r5 = r6.getTime()
            long r0 = r0.getTime()
            long r5 = r5 - r0
            long r3 = X.N6R.A0B
            long r1 = X.N6R.A09
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L55
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L55
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6R.D9K(java.util.Date):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
    
        if (r4 <= r6) goto L16;
     */
    @Override // X.InterfaceC58115Ppe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DBG(java.util.Date r26) {
        /*
            r25 = this;
            r0 = r26
            if (r26 == 0) goto Lcb
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r1.setTime(r0)
            r0 = 14
            r2 = 0
            r1.set(r0, r2)
            r0 = 13
            r1.set(r0, r2)
            java.util.Date r13 = r1.getTime()
            X.C14360o3.A07(r13)
            r3 = r25
            X.MrJ r0 = r3.A03
            java.lang.String r8 = "viewState"
            if (r0 == 0) goto L64
            boolean r15 = r0.A05
            r22 = 0
            com.instagram.user.model.UpcomingEvent r11 = r0.A01
            X.NgW r10 = r0.A00
            java.lang.String r12 = r0.A02
            if (r15 == 0) goto La7
            java.util.Date r14 = r0.A03
            boolean r0 = r0.A06
            X.AbstractC167017dG.A1P(r10, r12)
            X.MrJ r9 = new X.MrJ
            r16 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
        L3f:
            r3.A03 = r9
            java.util.Date r1 = r9.A04
            java.util.Date r0 = r9.A03
            if (r1 == 0) goto L7e
            if (r0 == 0) goto L7e
            long r6 = r0.getTime()
            long r0 = r1.getTime()
            long r6 = r6 - r0
            long r4 = X.N6R.A0B
            long r1 = X.N6R.A09
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L7e
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L7e
        L5e:
            X.OVr r2 = r3.A04
            if (r2 != 0) goto L6c
            java.lang.String r8 = "viewBinder"
        L64:
            X.C14360o3.A0F(r8)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L6c:
            X.MrJ r0 = r3.A03
            if (r0 == 0) goto L64
            java.util.Date r1 = r0.A04
            java.util.Date r0 = r0.A03
            r2.A01(r1, r0)
            X.OFm r0 = r3.A02
            if (r0 != 0) goto Lc3
            java.lang.String r8 = "viewHolder"
            goto L64
        L7e:
            X.MrJ r0 = r3.A03
            if (r0 == 0) goto L64
            com.instagram.user.model.UpcomingEvent r7 = r0.A01
            X.NgW r6 = r0.A00
            java.lang.String r5 = r0.A02
            java.util.Date r4 = r0.A04
            boolean r2 = r0.A05
            boolean r1 = r0.A06
            X.AbstractC167017dG.A1P(r6, r5)
            X.MrJ r0 = new X.MrJ
            r23 = r2
            r24 = r1
            r17 = r0
            r18 = r6
            r19 = r7
            r20 = r5
            r21 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r3.A03 = r0
            goto L5e
        La7:
            java.util.Date r1 = r0.A04
            boolean r0 = r0.A06
            X.AbstractC167017dG.A1P(r10, r12)
            X.MrJ r9 = new X.MrJ
            r14 = r9
            r15 = r10
            r16 = r11
            r17 = r12
            r18 = r1
            r19 = r13
            r20 = r2
            r21 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            goto L3f
        Lc3:
            com.instagram.actionbar.ActionButton r0 = r0.A0D
            A00(r0, r3)
            r3.onBackPressed()
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6R.DBG(java.util.Date):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        FragmentActivity activity;
        C3DO c3do;
        C3DN A00;
        if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(this.A07), 36322431048296688L) && (activity = getActivity()) != null && (A00 = (c3do = C3DN.A00).A00(activity)) != null && ((C3DP) A00).A0h) {
            AbstractC167017dG.A0y(getActivity(), c3do);
            return true;
        }
        C3DN A0m = AbstractC25230BEn.A0m(this);
        if (A0m != null) {
            return A0m.A0Y();
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C51626MrJ c51626MrJ;
        int A02 = C0f9.A02(-1740897333);
        super.onCreate(bundle);
        Context requireContext = requireContext();
        Bundle requireArguments = requireArguments();
        Serializable serializable = requireArguments.getSerializable("prior_surface");
        C14360o3.A0C(serializable, "null cannot be cast to non-null type com.instagram.upcomingevents.creation.enums.UpcomingEventEntryPoint");
        EnumC53233NgW enumC53233NgW = (EnumC53233NgW) serializable;
        UpcomingEvent upcomingEvent = (UpcomingEvent) requireArguments.getParcelable("initial_upcoming_event");
        FragmentActivity requireActivity = requireActivity();
        InterfaceC09390do interfaceC09390do = this.A07;
        this.A00 = new OWa(requireActivity, AbstractC166987dD.A0r(interfaceC09390do), this, AbstractC166997dE.A0p(requireContext, 2131952354), requireContext.getString(2131952353), false, true, false, false);
        this.A05 = new NSO(AbstractC166987dD.A0r(interfaceC09390do));
        boolean A06 = C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36318690131581344L);
        if (upcomingEvent != null) {
            String title = upcomingEvent.getTitle();
            if (title == null) {
                title = "";
            }
            c51626MrJ = new C51626MrJ(enumC53233NgW, upcomingEvent, title, new Date(AbstractC41774Ieq.A02(upcomingEvent)), new Date(AbstractC41774Ieq.A00(upcomingEvent)), false, A06);
        } else {
            c51626MrJ = new C51626MrJ(enumC53233NgW, null, "", null, null, false, A06);
        }
        this.A03 = c51626MrJ;
        C0f9.A09(1659486048, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-221417956);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.create_event, viewGroup, false);
        C0f9.A09(-300911877, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1687064648);
        C55009OVr c55009OVr = this.A04;
        if (c55009OVr == null) {
            C14360o3.A0F("viewBinder");
            throw C00O.createAndThrow();
        }
        C54735OFm c54735OFm = c55009OVr.A03;
        c54735OFm.A0D.setOnClickListener(null);
        c54735OFm.A05.setOnClickListener(null);
        c54735OFm.A02.setOnClickListener(null);
        c54735OFm.A08.setOnClickListener(null);
        c54735OFm.A01.setOnClickListener(null);
        c54735OFm.A06.setOnClickListener(null);
        c54735OFm.A00.setOnClickListener(null);
        c54735OFm.A04.removeTextChangedListener(c55009OVr.A00);
        c55009OVr.A00 = null;
        c54735OFm.A07.setOnClickListener(null);
        super.onDestroyView();
        C0f9.A09(891397228, A02);
    }
}
