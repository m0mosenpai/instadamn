package X;

import android.app.TimePickerDialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class V0T extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "QuietModeFragmentOld";
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public IgTextView A04;
    public IgTextView A05;
    public IgTextView A06;
    public IgTextView A07;
    public IgTextView A08;
    public IgTextView A09;
    public IgTextView A0A;
    public IgTextView A0B;
    public IgTextView A0C;
    public IgTextView A0D;
    public IgTextView A0E;
    public IgTextView A0F;
    public IgTextView A0G;
    public IgTextView A0H;
    public IgTextView A0I;
    public IgTextView A0J;
    public IgTextView A0K;
    public IgdsSwitch A0L;
    public EnumC206089Ap A0M;
    public boolean A0P;
    public IgTextView A0Q;
    public boolean A0R;
    public final InterfaceC11380iw A0U = new C19270xB("quiet_mode");
    public List A0O = C16930sl.A00;
    public final Map A0V = new LinkedHashMap();
    public String A0N = "settings";
    public final InterfaceC09390do A0a = AbstractC60492pY.A02(this);
    public final InterfaceC41501vz A0W = new C70723Wfo(this, 27);
    public final InterfaceC41501vz A0Y = new C70723Wfo(this, 29);
    public final InterfaceC41501vz A0Z = new C70723Wfo(this, 30);
    public final InterfaceC41501vz A0X = new C70723Wfo(this, 28);
    public final C71162Wox A0S = new C71162Wox(this, 1);
    public final C71162Wox A0T = new C71162Wox(this, 2);

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r0 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0G(X.V0T r7, boolean r8) {
        /*
            r3 = r7
            com.instagram.common.session.UserSession r0 = r7.getSession()
            X.3Jf r4 = new X.3Jf
            r4.<init>(r0)
            if (r8 != 0) goto L17
            com.instagram.common.session.UserSession r0 = r7.getSession()
            boolean r0 = X.AbstractC206099Aq.A08(r0)
            r7 = 1
            if (r0 != 0) goto L18
        L17:
            r7 = 0
        L18:
            X.2k6 r1 = X.AbstractC25235BEs.A0S(r3)
            r5 = 0
            r6 = 9
            X.PZ6 r2 = new X.PZ6
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.191 r0 = X.AnonymousClass191.A00
            X.AbstractC23641Du.A05(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V0T.A0G(X.V0T, boolean):void");
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        int i = 2131971413;
        if (this.A0P) {
            i = 2131974170;
        }
        AbstractC31175DnJ.A1I(interfaceC56362iU, getString(i));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "quiet_mode";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Resources A0N;
        int i;
        String str;
        int i2;
        int i3;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        boolean z = this.A0P;
        int i4 = R.id.quiet_mode_switch_subtitle;
        if (z) {
            i4 = R.id.sleep_mode_switch_subtitle;
        }
        this.A0Q = (IgTextView) view.requireViewById(i4);
        boolean z2 = this.A0P;
        int i5 = R.id.quiet_mode_switch_row;
        if (z2) {
            i5 = R.id.sleep_mode_switch_row;
        }
        View A0R = AbstractC166997dE.A0R(view, i5);
        boolean z3 = this.A0P;
        int i6 = R.id.quiet_mode_switch_footer;
        if (z3) {
            i6 = R.id.sleep_mode_switch_footer;
        }
        TextView A0N2 = AbstractC167007dF.A0N(view, i6);
        UserSession session = getSession();
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, session, 36315980008787817L)) {
            boolean z4 = this.A0P;
            int i7 = R.id.quiet_mode_setup;
            if (z4) {
                i7 = R.id.sleep_mode_setup;
            }
            AbstractC166997dE.A0S(view, i7).setVisibility(8);
        }
        A0N2.setVisibility(8);
        boolean z5 = false;
        A0N2.setVisibility(0);
        if (C18U.A06(c06090Tz, getSession(), 2342168227696030607L)) {
            A0N = AbstractC166997dE.A0N(this);
            i = 2131971385;
            if (this.A0P) {
                i = 2131974146;
            }
        } else {
            boolean A06 = C18U.A06(c06090Tz, getSession(), 36315980008787817L);
            A0N = AbstractC166997dE.A0N(this);
            boolean z6 = this.A0P;
            if (A06) {
                i = 2131971387;
                if (z6) {
                    i = 2131974148;
                }
            } else {
                i = 2131971386;
                if (z6) {
                    i = 2131974147;
                }
            }
        }
        AbstractC31173DnH.A19(A0N, A0N2, i);
        if (AbstractC206099Aq.A08(getSession()) && C18U.A06(c06090Tz, getSession(), 36315980008460135L)) {
            A0A(this);
        } else {
            IgTextView igTextView = this.A0Q;
            if (igTextView == null) {
                str = "quietModeSwitchSubtitleView";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            igTextView.setVisibility(8);
        }
        User A01 = C17060sy.A01.A01(getSession());
        C71603Jf c71603Jf = new C71603Jf(getSession());
        boolean z7 = this.A0P;
        int i8 = R.id.quiet_mode_switch_toggle;
        if (z7) {
            i8 = R.id.sleep_mode_switch_toggle;
        }
        IgdsSwitch igdsSwitch = (IgdsSwitch) view.requireViewById(i8);
        if (A01.A1W() || AbstractC206099Aq.A08(getSession())) {
            z5 = true;
        }
        igdsSwitch.setChecked(z5);
        igdsSwitch.setEnabled(true);
        igdsSwitch.A07 = new C70952Wky(igdsSwitch, A01, c71603Jf, this);
        F89.A00(A0R, igdsSwitch);
        this.A0L = igdsSwitch;
        if (this.A0P) {
            this.A03 = view.requireViewById(R.id.sleep_mode_turn_on_automatically);
            this.A0H = (IgTextView) view.requireViewById(R.id.sleep_mode_time_period);
            this.A00 = view.requireViewById(R.id.sleep_mode_divider);
            this.A01 = view.requireViewById(R.id.sleep_mode_start_interval_row);
            this.A02 = view.requireViewById(R.id.sleep_mode_end_interval_row);
            i2 = R.id.sleep_mode_settings_footer;
        } else {
            this.A03 = view.requireViewById(R.id.quiet_mode_turn_on_automatically);
            this.A0H = (IgTextView) view.requireViewById(R.id.quiet_mode_time_period);
            this.A00 = view.requireViewById(R.id.quiet_mode_divider);
            this.A01 = view.requireViewById(R.id.quiet_mode_start_interval_row);
            this.A02 = view.requireViewById(R.id.quiet_mode_end_interval_row);
            i2 = R.id.quiet_mode_settings_footer;
        }
        this.A0G = (IgTextView) view.requireViewById(i2);
        View view2 = this.A01;
        if (view2 != null) {
            this.A06 = (IgTextView) view2.requireViewById(R.id.title);
            View view3 = this.A01;
            if (view3 != null) {
                this.A05 = (IgTextView) view3.requireViewById(R.id.daily_time_spent_quota);
                View view4 = this.A01;
                if (view4 != null) {
                    this.A04 = (IgTextView) view4.requireViewById(R.id.subtitle);
                    View view5 = this.A02;
                    str = "quietModeToRowView";
                    if (view5 != null) {
                        this.A0K = (IgTextView) view5.requireViewById(R.id.title);
                        View view6 = this.A02;
                        if (view6 != null) {
                            this.A0J = (IgTextView) view6.requireViewById(R.id.daily_time_spent_quota);
                            View view7 = this.A02;
                            if (view7 != null) {
                                this.A0I = (IgTextView) view7.requireViewById(R.id.subtitle);
                                View view8 = this.A01;
                                if (view8 != null) {
                                    AbstractC166997dE.A0S(view8, R.id.chevron_right).setVisibility(8);
                                    View view9 = this.A02;
                                    if (view9 != null) {
                                        AbstractC166997dE.A0S(view9, R.id.chevron_right).setVisibility(8);
                                        A04(A01);
                                        C71603Jf c71603Jf2 = new C71603Jf(getSession());
                                        if (this.A0P) {
                                            this.A07 = (IgTextView) view.requireViewById(R.id.sleep_mode_day_customization_day0);
                                            this.A08 = (IgTextView) view.requireViewById(R.id.sleep_mode_day_customization_day1);
                                            this.A09 = (IgTextView) view.requireViewById(R.id.sleep_mode_day_customization_day2);
                                            this.A0A = (IgTextView) view.requireViewById(R.id.sleep_mode_day_customization_day3);
                                            this.A0B = (IgTextView) view.requireViewById(R.id.sleep_mode_day_customization_day4);
                                            this.A0C = (IgTextView) view.requireViewById(R.id.sleep_mode_day_customization_day5);
                                            this.A0D = (IgTextView) view.requireViewById(R.id.sleep_mode_day_customization_day6);
                                            this.A0F = (IgTextView) view.requireViewById(R.id.sleep_mode_day_customization_header);
                                            i3 = R.id.sleep_mode_day_customization_footer;
                                        } else {
                                            this.A07 = (IgTextView) view.requireViewById(R.id.quiet_mode_day_customization_day0);
                                            this.A08 = (IgTextView) view.requireViewById(R.id.quiet_mode_day_customization_day1);
                                            this.A09 = (IgTextView) view.requireViewById(R.id.quiet_mode_day_customization_day2);
                                            this.A0A = (IgTextView) view.requireViewById(R.id.quiet_mode_day_customization_day3);
                                            this.A0B = (IgTextView) view.requireViewById(R.id.quiet_mode_day_customization_day4);
                                            this.A0C = (IgTextView) view.requireViewById(R.id.quiet_mode_day_customization_day5);
                                            this.A0D = (IgTextView) view.requireViewById(R.id.quiet_mode_day_customization_day6);
                                            this.A0F = (IgTextView) view.requireViewById(R.id.quiet_mode_day_customization_header);
                                            i3 = R.id.quiet_mode_day_customization_footer;
                                        }
                                        this.A0E = (IgTextView) view.requireViewById(i3);
                                        if (C18U.A06(c06090Tz, getSession(), 36321980076599217L)) {
                                            A02(0);
                                            List A04 = c71603Jf2.A04();
                                            ArrayList arrayList = new ArrayList();
                                            Iterator it = A04.iterator();
                                            while (it.hasNext()) {
                                                EnumC206089Ap A00 = AbstractC206079Ao.A00((String) it.next());
                                                if (A00 != null) {
                                                    arrayList.add(A00);
                                                }
                                            }
                                            this.A0O = AbstractC001800i.A0U(arrayList);
                                            Map map = this.A0V;
                                            EnumC206089Ap enumC206089Ap = EnumC206089Ap.A08;
                                            IgTextView igTextView2 = this.A07;
                                            if (igTextView2 != null) {
                                                map.put(enumC206089Ap, igTextView2);
                                                EnumC206089Ap enumC206089Ap2 = EnumC206089Ap.A06;
                                                IgTextView igTextView3 = this.A08;
                                                if (igTextView3 != null) {
                                                    map.put(enumC206089Ap2, igTextView3);
                                                    EnumC206089Ap enumC206089Ap3 = EnumC206089Ap.A0A;
                                                    IgTextView igTextView4 = this.A09;
                                                    if (igTextView4 != null) {
                                                        map.put(enumC206089Ap3, igTextView4);
                                                        EnumC206089Ap enumC206089Ap4 = EnumC206089Ap.A0B;
                                                        IgTextView igTextView5 = this.A0A;
                                                        if (igTextView5 != null) {
                                                            map.put(enumC206089Ap4, igTextView5);
                                                            EnumC206089Ap enumC206089Ap5 = EnumC206089Ap.A09;
                                                            IgTextView igTextView6 = this.A0B;
                                                            if (igTextView6 != null) {
                                                                map.put(enumC206089Ap5, igTextView6);
                                                                EnumC206089Ap enumC206089Ap6 = EnumC206089Ap.A05;
                                                                IgTextView igTextView7 = this.A0C;
                                                                if (igTextView7 != null) {
                                                                    map.put(enumC206089Ap6, igTextView7);
                                                                    EnumC206089Ap enumC206089Ap7 = EnumC206089Ap.A07;
                                                                    IgTextView igTextView8 = this.A0D;
                                                                    String str2 = "quietModeDay6View";
                                                                    if (igTextView8 != null) {
                                                                        map.put(enumC206089Ap7, igTextView8);
                                                                        Iterator it2 = AbstractC206079Ao.A02().iterator();
                                                                        while (it2.hasNext()) {
                                                                            EnumC206089Ap A002 = AbstractC206079Ao.A00((String) it2.next());
                                                                            if (A002 != null) {
                                                                                if (this.A0O.contains(A002)) {
                                                                                    A07(A002);
                                                                                } else {
                                                                                    A06(A002);
                                                                                }
                                                                            }
                                                                        }
                                                                        IgTextView igTextView9 = this.A07;
                                                                        if (igTextView9 != null) {
                                                                            AbstractC31173DnH.A19(AbstractC166997dE.A0N(this), igTextView9, 2131957552);
                                                                            IgTextView igTextView10 = this.A08;
                                                                            if (igTextView10 != null) {
                                                                                AbstractC31173DnH.A19(AbstractC166997dE.A0N(this), igTextView10, 2131957548);
                                                                                IgTextView igTextView11 = this.A09;
                                                                                if (igTextView11 != null) {
                                                                                    AbstractC31173DnH.A19(AbstractC166997dE.A0N(this), igTextView11, 2131957556);
                                                                                    IgTextView igTextView12 = this.A0A;
                                                                                    if (igTextView12 != null) {
                                                                                        AbstractC31173DnH.A19(AbstractC166997dE.A0N(this), igTextView12, 2131957558);
                                                                                        IgTextView igTextView13 = this.A0B;
                                                                                        if (igTextView13 != null) {
                                                                                            AbstractC31173DnH.A19(AbstractC166997dE.A0N(this), igTextView13, 2131957554);
                                                                                            IgTextView igTextView14 = this.A0C;
                                                                                            if (igTextView14 != null) {
                                                                                                AbstractC31173DnH.A19(AbstractC166997dE.A0N(this), igTextView14, 2131957546);
                                                                                                IgTextView igTextView15 = this.A0D;
                                                                                                if (igTextView15 != null) {
                                                                                                    AbstractC31173DnH.A19(AbstractC166997dE.A0N(this), igTextView15, 2131957550);
                                                                                                    IgTextView igTextView16 = this.A0F;
                                                                                                    if (igTextView16 == null) {
                                                                                                        str2 = "quietModeDowHeader";
                                                                                                    } else {
                                                                                                        AbstractC31173DnH.A19(AbstractC166997dE.A0N(this), igTextView16, 2131957572);
                                                                                                        IgTextView igTextView17 = this.A07;
                                                                                                        if (igTextView17 != null) {
                                                                                                            A03(igTextView17, this, enumC206089Ap);
                                                                                                            IgTextView igTextView18 = this.A08;
                                                                                                            if (igTextView18 != null) {
                                                                                                                A03(igTextView18, this, enumC206089Ap2);
                                                                                                                IgTextView igTextView19 = this.A09;
                                                                                                                if (igTextView19 != null) {
                                                                                                                    A03(igTextView19, this, enumC206089Ap3);
                                                                                                                    IgTextView igTextView20 = this.A0A;
                                                                                                                    if (igTextView20 != null) {
                                                                                                                        A03(igTextView20, this, enumC206089Ap4);
                                                                                                                        IgTextView igTextView21 = this.A0B;
                                                                                                                        if (igTextView21 != null) {
                                                                                                                            A03(igTextView21, this, enumC206089Ap5);
                                                                                                                            IgTextView igTextView22 = this.A0C;
                                                                                                                            if (igTextView22 != null) {
                                                                                                                                A03(igTextView22, this, enumC206089Ap6);
                                                                                                                                IgTextView igTextView23 = this.A0D;
                                                                                                                                if (igTextView23 != null) {
                                                                                                                                    A03(igTextView23, this, enumC206089Ap7);
                                                                                                                                    IgTextView igTextView24 = this.A07;
                                                                                                                                    if (igTextView24 != null) {
                                                                                                                                        AbstractC56952jT.A01(igTextView24);
                                                                                                                                        IgTextView igTextView25 = this.A08;
                                                                                                                                        if (igTextView25 != null) {
                                                                                                                                            AbstractC56952jT.A01(igTextView25);
                                                                                                                                            IgTextView igTextView26 = this.A09;
                                                                                                                                            if (igTextView26 != null) {
                                                                                                                                                AbstractC56952jT.A01(igTextView26);
                                                                                                                                                IgTextView igTextView27 = this.A0A;
                                                                                                                                                if (igTextView27 != null) {
                                                                                                                                                    AbstractC56952jT.A01(igTextView27);
                                                                                                                                                    IgTextView igTextView28 = this.A0B;
                                                                                                                                                    if (igTextView28 != null) {
                                                                                                                                                        AbstractC56952jT.A01(igTextView28);
                                                                                                                                                        IgTextView igTextView29 = this.A0C;
                                                                                                                                                        if (igTextView29 != null) {
                                                                                                                                                            AbstractC56952jT.A01(igTextView29);
                                                                                                                                                            IgTextView igTextView30 = this.A0D;
                                                                                                                                                            if (igTextView30 != null) {
                                                                                                                                                                AbstractC56952jT.A01(igTextView30);
                                                                                                                                                                A05(c71603Jf2, false);
                                                                                                                                                                IgTextView igTextView31 = this.A07;
                                                                                                                                                                if (igTextView31 != null) {
                                                                                                                                                                    WNS.A00(igTextView31, 36, this);
                                                                                                                                                                    IgTextView igTextView32 = this.A08;
                                                                                                                                                                    if (igTextView32 != null) {
                                                                                                                                                                        WNS.A00(igTextView32, 37, this);
                                                                                                                                                                        IgTextView igTextView33 = this.A09;
                                                                                                                                                                        if (igTextView33 != null) {
                                                                                                                                                                            WNS.A00(igTextView33, 38, this);
                                                                                                                                                                            IgTextView igTextView34 = this.A0A;
                                                                                                                                                                            if (igTextView34 != null) {
                                                                                                                                                                                WNS.A00(igTextView34, 39, this);
                                                                                                                                                                                IgTextView igTextView35 = this.A0B;
                                                                                                                                                                                if (igTextView35 != null) {
                                                                                                                                                                                    WNS.A00(igTextView35, 40, this);
                                                                                                                                                                                    IgTextView igTextView36 = this.A0C;
                                                                                                                                                                                    if (igTextView36 != null) {
                                                                                                                                                                                        WNS.A00(igTextView36, 41, this);
                                                                                                                                                                                        IgTextView igTextView37 = this.A0D;
                                                                                                                                                                                        if (igTextView37 != null) {
                                                                                                                                                                                            WNS.A00(igTextView37, 42, this);
                                                                                                                                                                                            A0B(this, 1.0f);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    C14360o3.A0F(str2);
                                                                    throw C00O.createAndThrow();
                                                                }
                                                                C14360o3.A0F("quietModeDay5View");
                                                                throw C00O.createAndThrow();
                                                            }
                                                            C14360o3.A0F("quietModeDay4View");
                                                            throw C00O.createAndThrow();
                                                        }
                                                        C14360o3.A0F("quietModeDay3View");
                                                        throw C00O.createAndThrow();
                                                    }
                                                    C14360o3.A0F("quietModeDay2View");
                                                    throw C00O.createAndThrow();
                                                }
                                                C14360o3.A0F("quietModeDay1View");
                                                throw C00O.createAndThrow();
                                            }
                                            C14360o3.A0F("quietModeDay0View");
                                            throw C00O.createAndThrow();
                                        }
                                        A02(8);
                                        this.A0V.clear();
                                        if (!A01.A1W() || AbstractC206099Aq.A08(getSession())) {
                                            A0C(this, 0.5f);
                                            A0B(this, 0.5f);
                                        }
                                        UserSession session2 = getSession();
                                        InterfaceC11380iw interfaceC11380iw = this.A0U;
                                        AbstractC167017dG.A1N(session2, interfaceC11380iw);
                                        C65761Ttc c65761Ttc = new C65761Ttc(interfaceC11380iw, session2);
                                        C69436VnL A0R2 = AbstractC65702TsY.A0R(c71603Jf, this);
                                        String str3 = this.A0N;
                                        C14360o3.A0B(str3, 1);
                                        C65761Ttc.A02(c65761Ttc, A0R2, "ig_quiet_mode_settings_impression", str3);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
            }
        }
        C14360o3.A0F("quietModeFromRowView");
        throw C00O.createAndThrow();
    }

    private final void A02(int i) {
        String str;
        IgTextView igTextView = this.A07;
        if (igTextView == null) {
            str = "quietModeDay0View";
        } else {
            igTextView.setVisibility(i);
            IgTextView igTextView2 = this.A08;
            if (igTextView2 == null) {
                str = "quietModeDay1View";
            } else {
                igTextView2.setVisibility(i);
                IgTextView igTextView3 = this.A09;
                if (igTextView3 == null) {
                    str = "quietModeDay2View";
                } else {
                    igTextView3.setVisibility(i);
                    IgTextView igTextView4 = this.A0A;
                    if (igTextView4 == null) {
                        str = "quietModeDay3View";
                    } else {
                        igTextView4.setVisibility(i);
                        IgTextView igTextView5 = this.A0B;
                        if (igTextView5 == null) {
                            str = "quietModeDay4View";
                        } else {
                            igTextView5.setVisibility(i);
                            IgTextView igTextView6 = this.A0C;
                            if (igTextView6 == null) {
                                str = "quietModeDay5View";
                            } else {
                                igTextView6.setVisibility(i);
                                IgTextView igTextView7 = this.A0D;
                                if (igTextView7 == null) {
                                    str = "quietModeDay6View";
                                } else {
                                    igTextView7.setVisibility(i);
                                    IgTextView igTextView8 = this.A0F;
                                    if (igTextView8 == null) {
                                        str = "quietModeDowHeader";
                                    } else {
                                        igTextView8.setVisibility(i);
                                        IgTextView igTextView9 = this.A0E;
                                        if (igTextView9 == null) {
                                            str = "quietModeDowFooter";
                                        } else {
                                            igTextView9.setVisibility(i);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A04(com.instagram.user.model.User r19) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V0T.A04(com.instagram.user.model.User):void");
    }

    private final void A05(C71603Jf c71603Jf, boolean z) {
        IgTextView igTextView;
        Resources A0N;
        int i;
        Object[] objArr;
        String string;
        Resources A0N2;
        int i2;
        String str = "quietModeDowFooter";
        if (!c71603Jf.A01.A1W()) {
            igTextView = this.A0E;
            if (igTextView != null) {
                A0N2 = AbstractC166997dE.A0N(this);
                i2 = 2131957564;
                if (this.A0P) {
                    i2 = 2131974129;
                }
                string = A0N2.getString(i2);
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        List A0g = AbstractC001800i.A0g(this.A0O, new C65903Tw9(15));
        if (A0g.size() == 7) {
            igTextView = this.A0E;
            if (igTextView != null) {
                A0N2 = AbstractC166997dE.A0N(this);
                i2 = 2131957565;
                if (this.A0P) {
                    i2 = 2131974130;
                }
                string = A0N2.getString(i2);
            }
        } else if (A0g.size() == 6) {
            igTextView = this.A0E;
            if (igTextView != null) {
                A0N = AbstractC166997dE.A0N(this);
                i = 2131957569;
                if (this.A0P) {
                    i = 2131974134;
                }
                objArr = new Object[]{A01(this, A0g, 0), A01(this, A0g, 1), A01(this, A0g, 2), A01(this, A0g, 3), A01(this, A0g, 4), A01(this, A0g, 5)};
                string = A0N.getString(i, objArr);
            }
        } else if (A0g.size() == 5) {
            igTextView = this.A0E;
            if (igTextView != null) {
                A0N = AbstractC166997dE.A0N(this);
                i = 2131957566;
                if (this.A0P) {
                    i = 2131974131;
                }
                objArr = new Object[]{A01(this, A0g, 0), A01(this, A0g, 1), A01(this, A0g, 2), A01(this, A0g, 3), A01(this, A0g, 4)};
                string = A0N.getString(i, objArr);
            }
        } else if (A0g.size() == 4) {
            igTextView = this.A0E;
            if (igTextView != null) {
                A0N = AbstractC166997dE.A0N(this);
                i = 2131957567;
                if (this.A0P) {
                    i = 2131974132;
                }
                objArr = new Object[]{A01(this, A0g, 0), A01(this, A0g, 1), A01(this, A0g, 2), A01(this, A0g, 3)};
                string = A0N.getString(i, objArr);
            }
        } else if (A0g.size() == 3) {
            igTextView = this.A0E;
            if (igTextView != null) {
                A0N = AbstractC166997dE.A0N(this);
                i = 2131957570;
                if (this.A0P) {
                    i = 2131974135;
                }
                objArr = new Object[]{A01(this, A0g, 0), A01(this, A0g, 1), A01(this, A0g, 2)};
                string = A0N.getString(i, objArr);
            }
        } else if (A0g.size() == 2) {
            igTextView = this.A0E;
            if (igTextView != null) {
                A0N = AbstractC166997dE.A0N(this);
                i = 2131957571;
                if (this.A0P) {
                    i = 2131974136;
                }
                objArr = new Object[]{A01(this, A0g, 0), A01(this, A0g, 1)};
                string = A0N.getString(i, objArr);
            }
        } else if (this.A0O.size() == 1) {
            igTextView = this.A0E;
            if (igTextView != null) {
                A0N = AbstractC166997dE.A0N(this);
                i = 2131957568;
                if (this.A0P) {
                    i = 2131974133;
                }
                objArr = new Object[]{A01(this, A0g, 0)};
                string = A0N.getString(i, objArr);
            }
        } else {
            if (!A0g.isEmpty() || !z) {
                return;
            }
            C17060sy.A01.A01(getSession()).A1A(false);
            IgdsSwitch igdsSwitch = this.A0L;
            if (igdsSwitch == null) {
                str = "quietModeToggle";
            } else {
                igdsSwitch.setChecked(false);
                A0G(this, false);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
        igTextView.setText(string);
    }

    private final void A06(EnumC206089Ap enumC206089Ap) {
        Map map = this.A0V;
        TextView textView = (TextView) map.get(enumC206089Ap);
        if (textView != null) {
            AbstractC166987dD.A1O(requireContext(), textView, AbstractC53242c7.A07(getContext()));
        }
        View view = (View) map.get(enumC206089Ap);
        if (view != null) {
            AbstractC31173DnH.A0z(requireContext(), view, R.drawable.dow_disabled_button_background);
        }
        View view2 = (View) map.get(enumC206089Ap);
        if (view2 != null) {
            view2.setSelected(false);
        }
    }

    private final void A07(EnumC206089Ap enumC206089Ap) {
        Map map = this.A0V;
        TextView textView = (TextView) map.get(enumC206089Ap);
        if (textView != null) {
            AbstractC166987dD.A1O(requireContext(), textView, AbstractC53242c7.A0H(getContext(), R.attr.igds_color_gradient_blue));
        }
        View view = (View) map.get(enumC206089Ap);
        if (view != null) {
            AbstractC31173DnH.A0z(requireContext(), view, R.drawable.dow_blue_button_background);
        }
        View view2 = (View) map.get(enumC206089Ap);
        if (view2 != null) {
            view2.setSelected(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0081 A[LOOP:0: B:16:0x007b->B:18:0x0081, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A08(X.EnumC206089Ap r20, X.V0T r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V0T.A08(X.9Ap, X.V0T, boolean):void");
    }

    public static final void A09(InterfaceC30957DjE interfaceC30957DjE, V0T v0t, long j) {
        long j2 = j / 3600;
        C0fJ.A00(new TimePickerDialog(v0t.requireContext(), R.style.SpinnerTimePickerDialog, new C28528CiM(interfaceC30957DjE, 1), (int) j2, (int) ((j - (3600 * j2)) / 60), DateFormat.is24HourFormat(v0t.requireContext())));
    }

    public static final void A0C(V0T v0t, float f) {
        IgTextView igTextView = v0t.A0G;
        String str = "quietModeFooter";
        if (igTextView != null) {
            igTextView.setAlpha(f);
            View view = v0t.A03;
            if (view == null) {
                str = "quietModeTurnOnAutomaticallyRow";
            } else {
                view.setAlpha(f);
                View view2 = v0t.A00;
                if (view2 == null) {
                    str = "quietModeDivider";
                } else {
                    view2.setAlpha(f);
                    IgTextView igTextView2 = v0t.A0G;
                    if (igTextView2 != null) {
                        igTextView2.setAlpha(f);
                        View view3 = v0t.A01;
                        if (view3 == null) {
                            str = "quietModeFromRowView";
                        } else {
                            view3.setAlpha(f);
                            IgTextView igTextView3 = v0t.A05;
                            if (igTextView3 == null) {
                                str = "fromRowValue";
                            } else {
                                igTextView3.setAlpha(f);
                                IgTextView igTextView4 = v0t.A04;
                                if (igTextView4 == null) {
                                    str = "fromRowSubtitle";
                                } else {
                                    igTextView4.setAlpha(f);
                                    View view4 = v0t.A02;
                                    if (view4 == null) {
                                        str = "quietModeToRowView";
                                    } else {
                                        view4.setAlpha(f);
                                        IgTextView igTextView5 = v0t.A0J;
                                        if (igTextView5 == null) {
                                            str = "toRowValue";
                                        } else {
                                            igTextView5.setAlpha(f);
                                            IgTextView igTextView6 = v0t.A0I;
                                            if (igTextView6 == null) {
                                                str = "toRowSubtitle";
                                            } else {
                                                igTextView6.setAlpha(f);
                                                IgTextView igTextView7 = v0t.A0H;
                                                if (igTextView7 == null) {
                                                    str = "quietModeTimePeriodView";
                                                } else {
                                                    igTextView7.setAlpha(f);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x014e, code lost:
    
        if (r34 != false) goto L27;
     */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.0pT, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.0pT, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0D(X.V0T r28, long r29, long r31, boolean r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V0T.A0D(X.V0T, long, long, boolean, boolean):void");
    }

    public static final void A0F(V0T v0t, boolean z) {
        float f;
        String str;
        IgdsSwitch igdsSwitch = v0t.A0L;
        if (igdsSwitch == null) {
            str = "quietModeToggle";
        } else {
            igdsSwitch.setChecked(z);
            User A01 = C17060sy.A01.A01(v0t.getSession());
            if (z) {
                v0t.A04(A01);
                f = 1.0f;
            } else {
                f = 0.5f;
                A0C(v0t, 0.5f);
            }
            A0B(v0t, f);
            if (C18U.A06(C06090Tz.A05, v0t.getSession(), 36321980076599217L)) {
                v0t.A05(new C71603Jf(v0t.getSession()), false);
            }
            if (!z) {
                IgTextView igTextView = v0t.A0Q;
                if (igTextView == null) {
                    str = "quietModeSwitchSubtitleView";
                } else {
                    igTextView.setVisibility(8);
                }
            } else {
                AnonymousClass282 anonymousClass282 = AnonymousClass280.A01;
                UserSession session = v0t.getSession();
                C14360o3.A0B(session, 0);
                InterfaceC19610xo ARD = anonymousClass282.A06(session).ARD();
                ARD.E7G("QUIET_MODE_NEXT_TOAST_TIME", 0L);
                ARD.apply();
            }
            AbstractC206099Aq.A06(v0t.getSession());
            AbstractC25651Mw.A00(v0t.getSession()).E4s(new C2AT(z));
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    /* renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public final UserSession getSession() {
        return (UserSession) this.A0a.getValue();
    }

    public static final int A00(EnumC206089Ap enumC206089Ap) {
        switch (enumC206089Ap.ordinal()) {
            case 0:
                return 2131957551;
            case 1:
                return 2131957547;
            case 2:
                return 2131957555;
            case 3:
                return 2131957557;
            case 4:
                return 2131957553;
            case 5:
                return 2131957545;
            case 6:
                return 2131957549;
            default:
                throw new RuntimeException();
        }
    }

    public static String A01(Fragment fragment, List list, int i) {
        return fragment.requireContext().getResources().getString(A00((EnumC206089Ap) list.get(i)));
    }

    public static void A03(View view, Fragment fragment, EnumC206089Ap enumC206089Ap) {
        view.setContentDescription(fragment.requireContext().getResources().getString(A00(enumC206089Ap)));
    }

    public static final void A0A(V0T v0t) {
        long A06 = AbstractC31177DnL.A06();
        long A03 = AbstractC206099Aq.A03(v0t.getSession(), A06);
        Date A04 = AbstractC206099Aq.A04(v0t.getSession(), A06);
        IgTextView igTextView = v0t.A0Q;
        if (igTextView != null) {
            Resources A0N = AbstractC166997dE.A0N(v0t);
            int i = 2131971404;
            if (v0t.A0P) {
                i = 2131974162;
            }
            MSZ.A11(A0N, igTextView, AbstractC35218FgB.A03(v0t.requireContext(), A03).format(A04), i);
            IgTextView igTextView2 = v0t.A0Q;
            if (igTextView2 != null) {
                igTextView2.setVisibility(0);
                return;
            }
        }
        C14360o3.A0F("quietModeSwitchSubtitleView");
        throw C00O.createAndThrow();
    }

    public static final void A0B(V0T v0t, float f) {
        if (C18U.A06(C06090Tz.A05, v0t.getSession(), 36321980076599217L)) {
            IgTextView igTextView = v0t.A07;
            if (igTextView != null) {
                igTextView.setAlpha(f);
                IgTextView igTextView2 = v0t.A08;
                if (igTextView2 != null) {
                    igTextView2.setAlpha(f);
                    IgTextView igTextView3 = v0t.A09;
                    if (igTextView3 != null) {
                        igTextView3.setAlpha(f);
                        IgTextView igTextView4 = v0t.A0A;
                        if (igTextView4 != null) {
                            igTextView4.setAlpha(f);
                            IgTextView igTextView5 = v0t.A0B;
                            if (igTextView5 != null) {
                                igTextView5.setAlpha(f);
                                IgTextView igTextView6 = v0t.A0C;
                                if (igTextView6 != null) {
                                    igTextView6.setAlpha(f);
                                    IgTextView igTextView7 = v0t.A0D;
                                    String str = "quietModeDay6View";
                                    if (igTextView7 != null) {
                                        igTextView7.setAlpha(f);
                                        IgTextView igTextView8 = v0t.A0F;
                                        if (igTextView8 == null) {
                                            str = "quietModeDowHeader";
                                        } else {
                                            igTextView8.setAlpha(f);
                                            IgTextView igTextView9 = v0t.A0E;
                                            if (igTextView9 == null) {
                                                str = "quietModeDowFooter";
                                            } else {
                                                igTextView9.setAlpha(f);
                                                v0t.A0R = !AbstractC167007dF.A1N((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)));
                                                boolean A1W = new C71603Jf(v0t.getSession()).A01.A1W();
                                                IgTextView igTextView10 = v0t.A07;
                                                if (igTextView10 != null) {
                                                    igTextView10.setClickable(A1W);
                                                    IgTextView igTextView11 = v0t.A08;
                                                    if (igTextView11 != null) {
                                                        igTextView11.setClickable(A1W);
                                                        IgTextView igTextView12 = v0t.A09;
                                                        if (igTextView12 != null) {
                                                            igTextView12.setClickable(A1W);
                                                            IgTextView igTextView13 = v0t.A0A;
                                                            if (igTextView13 != null) {
                                                                igTextView13.setClickable(A1W);
                                                                IgTextView igTextView14 = v0t.A0B;
                                                                if (igTextView14 != null) {
                                                                    igTextView14.setClickable(A1W);
                                                                    IgTextView igTextView15 = v0t.A0C;
                                                                    if (igTextView15 != null) {
                                                                        igTextView15.setClickable(A1W);
                                                                        IgTextView igTextView16 = v0t.A0D;
                                                                        if (igTextView16 != null) {
                                                                            igTextView16.setClickable(A1W);
                                                                            if (!A1W) {
                                                                                Iterator it = AbstractC206079Ao.A02().iterator();
                                                                                while (it.hasNext()) {
                                                                                    EnumC206089Ap A00 = AbstractC206079Ao.A00((String) it.next());
                                                                                    if (A00 != null) {
                                                                                        v0t.A06(A00);
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (!v0t.A0R) {
                                                                                Iterator it2 = AbstractC206079Ao.A02().iterator();
                                                                                while (it2.hasNext()) {
                                                                                    EnumC206089Ap A002 = AbstractC206079Ao.A00((String) it2.next());
                                                                                    if (A002 != null) {
                                                                                        if (v0t.A0O.contains(A002)) {
                                                                                            v0t.A07(A002);
                                                                                        } else {
                                                                                            v0t.A06(A002);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    C14360o3.A0F(str);
                                    throw C00O.createAndThrow();
                                }
                                C14360o3.A0F("quietModeDay5View");
                                throw C00O.createAndThrow();
                            }
                            C14360o3.A0F("quietModeDay4View");
                            throw C00O.createAndThrow();
                        }
                        C14360o3.A0F("quietModeDay3View");
                        throw C00O.createAndThrow();
                    }
                    C14360o3.A0F("quietModeDay2View");
                    throw C00O.createAndThrow();
                }
                C14360o3.A0F("quietModeDay1View");
                throw C00O.createAndThrow();
            }
            C14360o3.A0F("quietModeDay0View");
            throw C00O.createAndThrow();
        }
    }

    public static final void A0E(V0T v0t, boolean z) {
        if (C18U.A06(C06090Tz.A05, v0t.getSession(), 36315980008394598L)) {
            C71603Jf c71603Jf = new C71603Jf(v0t.getSession());
            if (z) {
                UserSession session = v0t.getSession();
                C14360o3.A0B(session, 0);
                ((C50622Uh) session.A01(C50622Uh.class, new C57511Pfl(session, 24))).A00(v0t.getSession(), c71603Jf);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-923336799);
        super.onCreate(bundle);
        C25671My A00 = AbstractC25651Mw.A00(getSession());
        A00.A01(this.A0W, C70705WfU.class);
        A00.A01(this.A0Y, C70707WfW.class);
        A00.A01(this.A0Z, C70708WfX.class);
        A00.A01(this.A0X, C70706WfV.class);
        C0f9.A09(816665183, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = C0f9.A02(1109418027);
        C14360o3.A0B(layoutInflater, 0);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (str = bundle2.getString("entrypoint")) == null) {
            str = "settings";
        }
        this.A0N = str;
        boolean A01 = AbstractC455527p.A01(getSession());
        this.A0P = A01;
        int i = R.layout.quiet_mode_settings;
        if (A01) {
            i = R.layout.sleep_mode_settings;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        C0f9.A09(-504660363, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1327539731);
        super.onDestroy();
        C25671My A00 = AbstractC25651Mw.A00(getSession());
        A00.A02(this.A0W, C70705WfU.class);
        A00.A02(this.A0Y, C70707WfW.class);
        A00.A02(this.A0Z, C70708WfX.class);
        A00.A02(this.A0X, C70706WfV.class);
        C0f9.A09(470917297, A02);
    }
}
