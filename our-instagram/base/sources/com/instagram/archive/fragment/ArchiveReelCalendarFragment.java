package com.instagram.archive.fragment;

import X.AbstractC10360h2;
import X.AbstractC13880nE;
import X.AbstractC1571873x;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC31172DnG;
import X.AbstractC31179DnN;
import X.AbstractC37301Gc2;
import X.AbstractC43592JPx;
import X.AbstractC51171MjF;
import X.AbstractC82003lM;
import X.C05F;
import X.C06090Tz;
import X.C0f9;
import X.C18U;
import X.C1OG;
import X.C1ON;
import X.C1OU;
import X.C23601Acv;
import X.C25821No;
import X.C38C;
import X.C38E;
import X.C38H;
import X.C3AY;
import X.C3G2;
import X.C3M4;
import X.C41181vS;
import X.C50583MUt;
import X.C51198Mji;
import X.C51378Mmd;
import X.C51665Mrw;
import X.C51752Mtb;
import X.C52375NFr;
import X.C53Z;
import X.C54387O1t;
import X.C54588O9p;
import X.C54589O9q;
import X.C6X4;
import X.C82013lN;
import X.EnumC53169NfQ;
import X.InterfaceC56362iU;
import X.InterfaceC60072op;
import X.InterfaceC60122ou;
import X.InterfaceC63982vJ;
import X.MSW;
import X.MSX;
import X.NAD;
import X.NS8;
import X.O7D;
import X.OT8;
import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.calendar.CalendarRecyclerView;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

/* loaded from: classes9.dex */
public class ArchiveReelCalendarFragment extends C53Z implements InterfaceC60072op, InterfaceC60122ou, InterfaceC63982vJ {
    public C52375NFr A00;
    public C82013lN A01;
    public Long A02;
    public Runnable A03;
    public String A04;
    public Date A05;
    public boolean A07;
    public boolean A08;
    public RectF A09;
    public C38E A0A;
    public String A0B;
    public boolean A0C;
    public CalendarRecyclerView mCalendar;
    public C51378Mmd mLaunchingHolder;
    public View mLoadingSpinner;
    public final Set A0E = AbstractC166987dD.A1H();
    public final Set A0F = AbstractC166987dD.A1H();
    public final Handler A0D = AbstractC167007dF.A0J();
    public Map A06 = Collections.emptyMap();

    public static void A02(ArchiveReelCalendarFragment archiveReelCalendarFragment) {
        archiveReelCalendarFragment.A08 = false;
        C51378Mmd c51378Mmd = archiveReelCalendarFragment.mLaunchingHolder;
        if (c51378Mmd != null) {
            ((ViewGroup) c51378Mmd.itemView).setLayoutTransition(new LayoutTransition());
            c51378Mmd.A02.setVisibility(0);
            c51378Mmd.A01.setVisibility(4);
            c51378Mmd.A06.stop();
            archiveReelCalendarFragment.mLaunchingHolder = null;
        }
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void DHC(Reel reel, C6X4 c6x4) {
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void DeI(Reel reel) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "calendar_archive";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    public static void A01(C51378Mmd c51378Mmd, ArchiveReelCalendarFragment archiveReelCalendarFragment, Reel reel) {
        if (archiveReelCalendarFragment.A08 && A05(archiveReelCalendarFragment)) {
            Runnable runnable = archiveReelCalendarFragment.A03;
            if (runnable != null) {
                archiveReelCalendarFragment.A0D.removeCallbacks(runnable);
            }
            archiveReelCalendarFragment.A03 = null;
            if (archiveReelCalendarFragment.A0A == null) {
                archiveReelCalendarFragment.A0A = new C38E(archiveReelCalendarFragment, archiveReelCalendarFragment.getSession(), new C38C(archiveReelCalendarFragment));
            }
            archiveReelCalendarFragment.A09 = AbstractC13880nE.A0G(c51378Mmd.A00);
            C38E c38e = archiveReelCalendarFragment.A0A;
            c38e.A0C = archiveReelCalendarFragment.A0B;
            C38H c38h = new C38H();
            c38h.A06 = false;
            c38e.A03 = new ReelViewerConfig(c38h);
            c38e.A05 = new NS8(archiveReelCalendarFragment.getActivity(), archiveReelCalendarFragment.A00, archiveReelCalendarFragment.mCalendar, archiveReelCalendarFragment);
            c38e.A0D = archiveReelCalendarFragment.getSession().userId;
            List list = archiveReelCalendarFragment.A00.A0B;
            c38e.A07(reel, C3G2.A0O, c51378Mmd, list, list, 0);
            A02(archiveReelCalendarFragment);
        }
    }

    public static void A03(ArchiveReelCalendarFragment archiveReelCalendarFragment) {
        Date date;
        int i;
        int i2;
        int i3;
        ImageUrl imageUrl;
        if (archiveReelCalendarFragment.A07) {
            ArrayList A1E = AbstractC166987dD.A1E();
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            Calendar calendar2 = Calendar.getInstance();
            Iterator A16 = AbstractC166997dE.A16(archiveReelCalendarFragment.A06);
            while (A16.hasNext()) {
                C3AY c3ay = (C3AY) A16.next();
                Object obj = c3ay.A00;
                obj.getClass();
                C51665Mrw c51665Mrw = (C51665Mrw) obj;
                Object obj2 = c3ay.A01;
                obj2.getClass();
                Reel reel = (Reel) obj2;
                if (!reel.A14(archiveReelCalendarFragment.getSession())) {
                    long j = c51665Mrw.A01;
                    if (j != 0) {
                        MSX.A1R(calendar, j * 1000);
                        int i4 = calendar.get(1);
                        int i5 = calendar.get(2);
                        int i6 = calendar.get(5);
                        calendar2.clear();
                        calendar2.set(i4, i5, i6, 0, 0);
                        C51752Mtb c51752Mtb = c51665Mrw.A02;
                        if (c51752Mtb != null) {
                            imageUrl = (ImageUrl) c51752Mtb.A02;
                        } else {
                            imageUrl = null;
                        }
                        A1E.add(new C54588O9p(imageUrl, reel, calendar2.getTime()));
                    }
                }
            }
            C52375NFr c52375NFr = archiveReelCalendarFragment.A00;
            Date date2 = archiveReelCalendarFragment.A05;
            ArrayList A1E2 = AbstractC166987dD.A1E();
            List list = c52375NFr.A0B;
            list.clear();
            Map map = c52375NFr.A0C;
            map.clear();
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                C54588O9p c54588O9p = (C54588O9p) it.next();
                Date date3 = c54588O9p.A02;
                Reel reel2 = c54588O9p.A01;
                A1E2.add(new C54589O9q(c54588O9p.A00, reel2, date3));
                list.add(reel2);
                map.put(reel2.getId(), date3);
            }
            Collections.sort(A1E2, new C50583MUt(2));
            Date date4 = new Date();
            if (!A1E2.isEmpty()) {
                date = ((C54589O9q) A1E2.get(0)).A02;
            } else {
                date = date4;
            }
            if (date2 == null || !date2.before(date)) {
                date2 = date;
            }
            List list2 = ((AbstractC51171MjF) c52375NFr).A02;
            list2.clear();
            Map map2 = ((AbstractC51171MjF) c52375NFr).A03;
            map2.clear();
            Map map3 = ((AbstractC51171MjF) c52375NFr).A04;
            map3.clear();
            Calendar calendar3 = ((AbstractC51171MjF) c52375NFr).A01;
            calendar3.clear();
            calendar3.setTime(date2);
            calendar3.clear();
            calendar3.setTime(date4);
            int i7 = (calendar3.get(1) * 12) + calendar3.get(2);
            for (int i8 = (calendar3.get(1) * 12) + calendar3.get(2); i8 <= i7; i8++) {
                calendar3.clear();
                calendar3.set(1, i8 / 12);
                calendar3.set(2, i8 % 12);
                Date time = calendar3.getTime();
                calendar3.clear();
                calendar3.setTime(time);
                int firstDayOfWeek = calendar3.getFirstDayOfWeek();
                int i9 = AbstractC51171MjF.A05;
                int i10 = (i9 - 1) + firstDayOfWeek;
                if (i10 > i9) {
                    i10 %= i9;
                }
                int i11 = calendar3.get(1);
                int i12 = calendar3.get(2);
                list2.add(new C54387O1t(((AbstractC51171MjF) c52375NFr).A00.format(time)));
                AbstractC37301Gc2.A1T(AbstractC51171MjF.A00(i11, i12, -1), map2, AbstractC31172DnG.A03(list2, 1));
                int i13 = firstDayOfWeek;
                while (true) {
                    i = i9 + firstDayOfWeek;
                    if (i13 >= i) {
                        break;
                    }
                    if (i13 > i9) {
                        i3 = i13 % i9;
                    } else {
                        i3 = i13;
                    }
                    list2.add(new OT8(i3));
                    i13++;
                }
                int i14 = calendar3.get(7);
                while (firstDayOfWeek < i) {
                    if (firstDayOfWeek > i9) {
                        i2 = firstDayOfWeek % i9;
                    } else {
                        i2 = firstDayOfWeek;
                    }
                    if (i2 == i14) {
                        break;
                    }
                    list2.add(new Object());
                    firstDayOfWeek++;
                }
                do {
                    int i15 = calendar3.get(5);
                    list2.add(new O7D(calendar3.getTime()));
                    AbstractC37301Gc2.A1T(AbstractC51171MjF.A00(i11, i12, i15), map2, AbstractC31172DnG.A03(list2, 1));
                    calendar3.add(5, 1);
                } while (calendar3.get(2) == i12);
                calendar3.add(5, -1);
                int i16 = calendar3.get(7);
                if (i16 == i10) {
                }
                do {
                    i16++;
                    if (i16 > i9) {
                        i16 %= i9;
                    }
                    list2.add(new Object());
                } while (i16 != i10);
            }
            Iterator it2 = A1E2.iterator();
            while (it2.hasNext()) {
                C54589O9q c54589O9q = (C54589O9q) it2.next();
                String A01 = c52375NFr.A01(c54589O9q.A02);
                List A12 = AbstractC43592JPx.A12(A01, map3);
                if (A12 == null) {
                    A12 = AbstractC166987dD.A1E();
                    map3.put(A01, A12);
                }
                A12.add(c54589O9q);
            }
            c52375NFr.notifyDataSetChanged();
        }
    }

    public static void A00(C51378Mmd c51378Mmd, ArchiveReelCalendarFragment archiveReelCalendarFragment, Reel reel) {
        ImageUrl A08;
        if (A05(archiveReelCalendarFragment)) {
            Context requireContext = archiveReelCalendarFragment.requireContext();
            C41181vS A09 = reel.A09(archiveReelCalendarFragment.getSession());
            if (A09 != null && A09.A08(requireContext) != null && (A08 = A09.A08(requireContext)) != null) {
                C23601Acv c23601Acv = new C23601Acv(0, archiveReelCalendarFragment, reel, c51378Mmd);
                archiveReelCalendarFragment.A0E.add(c23601Acv);
                C1OG A0J = C25821No.A00().A0J(A08, "calendar_archive");
                A0J.A02(c23601Acv);
                A0J.A01();
                return;
            }
            A01(c51378Mmd, archiveReelCalendarFragment, reel);
        }
    }

    public static void A04(ArchiveReelCalendarFragment archiveReelCalendarFragment, Integer num, String str, List list) {
        C1ON A03 = AbstractC1571873x.A03(archiveReelCalendarFragment.getSession(), C05F.A0Y, str, archiveReelCalendarFragment.A04, false);
        A03.A00 = new NAD(0, archiveReelCalendarFragment, list, num);
        archiveReelCalendarFragment.schedule(A03);
    }

    public static boolean A05(ArchiveReelCalendarFragment archiveReelCalendarFragment) {
        if (archiveReelCalendarFragment.getContext() != null && archiveReelCalendarFragment.isResumed() && archiveReelCalendarFragment.mCalendar != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.Efu(2131954457);
        AbstractC10360h2 abstractC10360h2 = this.mFragmentManager;
        abstractC10360h2.getClass();
        interfaceC56362iU.EkS(AbstractC167007dF.A1O(abstractC10360h2.A0L()));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-727900766);
        super.onCreate(bundle);
        this.A0B = AbstractC166997dE.A0n();
        Typeface typeface = C52375NFr.A0D;
        this.A00 = new C52375NFr(requireContext(), this, this);
        UserSession session = getSession();
        MSW.A1X(session);
        this.A01 = AbstractC82003lM.A00(session);
        boolean A1X = AbstractC167007dF.A1X(requireArguments().get("archive_stories_tab"), EnumC53169NfQ.A02);
        if (!C18U.A06(C06090Tz.A05, getSession(), 36319819707981505L) || A1X) {
            A04(this, null, null, Collections.emptyList());
        }
        C0f9.A09(122313904, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-355874952);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_calendar);
        C0f9.A09(-1156819653, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-2051839251);
        super.onDestroyView();
        this.A0E.clear();
        this.A0F.clear();
        ArchiveReelCalendarFragmentLifecycleUtil.cleanupReferences(this);
        C0f9.A09(2046447060, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(443248475);
        super.onResume();
        if (!this.A00.A0B.isEmpty()) {
            this.mLoadingSpinner.setVisibility(8);
        }
        C3M4 A05 = C1OU.A05(requireActivity());
        if (A05 != null && A05.A0a()) {
            RectF rectF = this.A09;
            A05.A0X(rectF, rectF, this, null);
        }
        A03(this);
        C0f9.A09(168153590, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-1764492549);
        super.onStart();
        AbstractC31179DnN.A1K(this, 8);
        C0f9.A09(-1731453221, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(2084790397);
        super.onStop();
        AbstractC31179DnN.A1K(this, 0);
        C0f9.A09(1709620632, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A02 = Long.valueOf(requireArguments().getLong("reel_item_taken_at_ms"));
        this.A04 = requireArguments().getString("reel_id");
        this.mCalendar = (CalendarRecyclerView) view.requireViewById(R.id.calendar);
        this.mLoadingSpinner = view.requireViewById(R.id.loading_spinner);
        this.mCalendar.setAdapter(this.A00);
        C51198Mji.A00(this.mCalendar, this, 1);
    }

    @Override // androidx.fragment.app.Fragment
    public final void setMenuVisibility(boolean z) {
        super.setMenuVisibility(z);
        if (C18U.A06(C06090Tz.A05, getSession(), 36319819707981505L) && z && !this.A0C) {
            A04(this, null, null, Collections.emptyList());
            this.A0C = true;
        }
    }

    @Override // X.InterfaceC63982vJ
    public final void Ddi(Reel reel) {
        A03(this);
    }
}
