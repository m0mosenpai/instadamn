package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.AdsMessageExtensionType;
import com.instagram.api.schemas.AdvantageAudienceData;
import com.instagram.api.schemas.AdvantageAudienceDataImpl;
import com.instagram.api.schemas.ImmutablePandoAdvantageAudienceData;
import com.instagram.api.schemas.TargetingRelaxationConstants;
import com.instagram.api.schemas.XFBAdproRegionalRegulatedCategory;
import com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus;
import com.instagram.business.promote.model.PromoteAudienceInfo;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.datepicker.IgDatePicker;
import com.instagram.igds.components.datepicker.IgTimePicker;
import java.util.Calendar;
import java.util.List;

/* renamed from: X.Wkw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70950Wkw implements InterfaceC190658cN {
    public final int A00;
    public final Object A01;

    public C70950Wkw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.InterfaceC190658cN
    public final boolean onToggle(boolean z) {
        PromoteState promoteState;
        PromoteData promoteData;
        XFBTargetingAutomationAdvantageAudienceStatus xFBTargetingAutomationAdvantageAudienceStatus;
        Object advantageAudienceDataImpl;
        C69649Vsq A00;
        int i;
        Integer BTn;
        TargetingRelaxationConstants targetingRelaxationConstants;
        TargetingRelaxationConstants targetingRelaxationConstants2;
        Object value;
        String str;
        C70399WUb c70399WUb;
        VG4 vg4;
        String str2;
        Object value2;
        C66628UPq c66628UPq;
        switch (this.A00) {
            case 0:
                C69655Vsw c69655Vsw = (C69655Vsw) this.A01;
                PromoteData promoteData2 = c69655Vsw.A05;
                java.util.Set set = promoteData2.A25;
                XFBAdproRegionalRegulatedCategory xFBAdproRegionalRegulatedCategory = XFBAdproRegionalRegulatedCategory.A06;
                if (z) {
                    set.add(xFBAdproRegionalRegulatedCategory);
                } else {
                    set.remove(xFBAdproRegionalRegulatedCategory);
                }
                C70399WUb c70399WUb2 = c69655Vsw.A03;
                C70399WUb.A02(null, VG4.A0B, c70399WUb2, null, null, null, null, null, null, Boolean.valueOf(z), "taiwan_finserv_toggle", null, null, null, null, null);
                if (z) {
                    c70399WUb2.A0T(promoteData2.A1K, VG4.A1R.toString());
                    String str3 = c70399WUb2.A03;
                    C14360o3.A07(str3);
                    AbstractC69923Vxo.A00(c69655Vsw.A02, promoteData2, str3);
                    return true;
                }
                promoteData2.A1f = null;
                promoteData2.A1i = null;
                promoteData2.A1d = null;
                promoteData2.A1g = null;
                promoteData2.A1e = null;
                promoteData2.A1h = null;
                return true;
            case 1:
                V11 v11 = (V11) this.A01;
                V11.A00(v11).A2f = z;
                C70399WUb c70399WUb3 = v11.A03;
                if (c70399WUb3 != null) {
                    C70399WUb.A03(VG4.A0B, c70399WUb3, null, null, null, Boolean.valueOf(z), null, "fb_placement_toggle");
                    return true;
                }
                return true;
            case 2:
                C67872V0d c67872V0d = (C67872V0d) this.A01;
                AbstractC65702TsY.A0N(c67872V0d.A0Z).A0N((VG4) c67872V0d.A0W.getValue(), z);
                promoteState = (PromoteState) c67872V0d.A0a.getValue();
                promoteData = (PromoteData) AbstractC166987dD.A17(c67872V0d.A0Y);
                C14360o3.A0B(promoteData, 0);
                AdvantageAudienceData advantageAudienceData = promoteData.A0q.A02;
                if (advantageAudienceData != null) {
                    advantageAudienceData.AaJ();
                    Integer BTn2 = advantageAudienceData.BTn();
                    if (z) {
                        xFBTargetingAutomationAdvantageAudienceStatus = XFBTargetingAutomationAdvantageAudienceStatus.A05;
                    } else {
                        xFBTargetingAutomationAdvantageAudienceStatus = XFBTargetingAutomationAdvantageAudienceStatus.A04;
                    }
                    if (advantageAudienceData instanceof ImmutablePandoAdvantageAudienceData) {
                        advantageAudienceDataImpl = AbstractC37303Gc4.A06(advantageAudienceData, AbstractC25229BEm.A1b("min_age_constraint", BTn2, new C09530e4("advantage_audience_status", xFBTargetingAutomationAdvantageAudienceStatus.A00)));
                    } else {
                        advantageAudienceDataImpl = new AdvantageAudienceDataImpl(xFBTargetingAutomationAdvantageAudienceStatus, BTn2);
                    }
                    AdvantageAudienceData advantageAudienceData2 = (AdvantageAudienceData) advantageAudienceDataImpl;
                    if (z) {
                        PromoteAudienceInfo promoteAudienceInfo = promoteData.A0q;
                        int i2 = promoteAudienceInfo.A01;
                        AdvantageAudienceData advantageAudienceData3 = promoteAudienceInfo.A02;
                        if (advantageAudienceData3 != null && (BTn = advantageAudienceData3.BTn()) != null) {
                            i = BTn.intValue();
                        } else {
                            i = 0;
                        }
                        PromoteAudienceInfo promoteAudienceInfo2 = promoteData.A0q;
                        C14360o3.A06(promoteAudienceInfo2);
                        A00 = AbstractC68446VRc.A00(promoteAudienceInfo2);
                        if (i2 < i) {
                            i2 = i;
                        }
                        A00.A01 = i2;
                    } else {
                        PromoteAudienceInfo promoteAudienceInfo3 = promoteData.A0q;
                        C14360o3.A06(promoteAudienceInfo3);
                        A00 = AbstractC68446VRc.A00(promoteAudienceInfo3);
                        A00.A01 = 13;
                    }
                    A00.A02 = advantageAudienceData2;
                    promoteData.A0q = A00.A00();
                    PromoteState.A01(promoteState, C05F.A15);
                    return true;
                }
                return true;
            case 3:
                C67872V0d c67872V0d2 = (C67872V0d) this.A01;
                promoteState = (PromoteState) c67872V0d2.A0a.getValue();
                promoteData = (PromoteData) AbstractC166987dD.A17(c67872V0d2.A0Y);
                if (z) {
                    targetingRelaxationConstants = TargetingRelaxationConstants.A04;
                } else {
                    targetingRelaxationConstants = TargetingRelaxationConstants.A05;
                }
                C14360o3.A0B(promoteData, 0);
                PromoteAudienceInfo promoteAudienceInfo4 = promoteData.A0q;
                C14360o3.A06(promoteAudienceInfo4);
                A00 = AbstractC68446VRc.A00(promoteAudienceInfo4);
                A00.A03 = targetingRelaxationConstants;
                promoteData.A0q = A00.A00();
                PromoteState.A01(promoteState, C05F.A15);
                return true;
            case 4:
                UFT A01 = C6QR.A01((C6QR) this.A01);
                if (z) {
                    targetingRelaxationConstants2 = TargetingRelaxationConstants.A04;
                } else {
                    targetingRelaxationConstants2 = TargetingRelaxationConstants.A05;
                }
                C05A c05a = A01.A02.A01;
                do {
                    value = c05a.getValue();
                } while (!c05a.AIi(value, UQJ.A00(null, targetingRelaxationConstants2, (UQJ) value, null, null, null, null, 0, 0, 895, false)));
                return true;
            case 5:
                C67876V0h c67876V0h = (C67876V0h) this.A01;
                if (!C1VW.isLocationPermitted(c67876V0h.requireContext(), c67876V0h.getSession(), "PROMOTE_AUDIENCE")) {
                    UserSession session = c67876V0h.getSession();
                    AbstractC68641VYw.A00.A05(session, new C4I7(new C19270xB("promote_create_audience_locations_local"), session), "PROMOTE_AUDIENCE", "CurrentLocationHelper::onCurrentLocationButtonTap");
                }
                if (z) {
                    C1VW c1vw = c67876V0h.A0I;
                    if (c1vw == null) {
                        return false;
                    }
                    UserSession session2 = c67876V0h.getSession();
                    FragmentActivity activity = c67876V0h.getActivity();
                    C14360o3.A0C(activity, "null cannot be cast to non-null type android.app.Activity");
                    c1vw.requestLocationUpdates(session2, activity, c67876V0h.A0G, c67876V0h.A0H, "promote_create_audience_locations_local", false, VDJ.A0P);
                    return false;
                }
                C67876V0h.A04(c67876V0h, false);
                return true;
            case 6:
                C67868Uzz c67868Uzz = (C67868Uzz) this.A01;
                FragmentActivity activity2 = c67868Uzz.getActivity();
                if (activity2 != null) {
                    UFT uft = (UFT) c67868Uzz.A0D.getValue();
                    if (z) {
                        UserSession userSession = uft.A03;
                        if (!C1VW.isLocationPermitted(activity2, userSession, "PROMOTE_AUDIENCE")) {
                            AbstractC68641VYw.A00.A05(userSession, new C4I7(new C19270xB(uft.A06), userSession), "PROMOTE_AUDIENCE", "CurrentLocationHelper::onCurrentLocationButtonTap");
                        }
                        C1VW c1vw2 = C1VW.A00;
                        if (c1vw2 != null) {
                            c1vw2.requestLocationUpdates(userSession, activity2, new C70964WlB(activity2, uft), new C70967WlE(activity2, uft), "promote_create_audience_locations_local", false, VDJ.A0P);
                        }
                    }
                    C05A c05a2 = uft.A02.A04;
                    do {
                        value2 = c05a2.getValue();
                        c66628UPq = (C66628UPq) value2;
                    } while (!c05a2.AIi(value2, C66628UPq.A00(c66628UPq.A03, c66628UPq.A02, c66628UPq.A05, c66628UPq.A04, c66628UPq.A00, c66628UPq.A01, z)));
                }
                return false;
            case 7:
                C67892V0z c67892V0z = (C67892V0z) this.A01;
                PromoteData promoteData3 = c67892V0z.A0F;
                if (promoteData3 != null) {
                    java.util.Set set2 = promoteData3.A25;
                    XFBAdproRegionalRegulatedCategory xFBAdproRegionalRegulatedCategory2 = XFBAdproRegionalRegulatedCategory.A06;
                    if (z) {
                        set2.add(xFBAdproRegionalRegulatedCategory2);
                    } else {
                        set2.remove(xFBAdproRegionalRegulatedCategory2);
                    }
                    C70399WUb c70399WUb4 = c67892V0z.A0B;
                    if (c70399WUb4 != null) {
                        C70399WUb.A02(null, VG4.A1Q, c70399WUb4, null, null, null, null, null, null, Boolean.valueOf(z), "taiwan_finserv_toggle", null, null, null, null, null);
                    }
                    if (z) {
                        C70399WUb c70399WUb5 = c67892V0z.A0B;
                        if (c70399WUb5 != null) {
                            AbstractC65702TsY.A1M(c70399WUb5, VG4.A1R);
                        }
                        C70399WUb c70399WUb6 = c67892V0z.A0B;
                        C14360o3.A0A(c70399WUb6);
                        String str4 = c70399WUb6.A03;
                        C14360o3.A07(str4);
                        FragmentActivity requireActivity = c67892V0z.requireActivity();
                        PromoteData promoteData4 = c67892V0z.A0F;
                        if (promoteData4 != null) {
                            AbstractC69923Vxo.A00(requireActivity, promoteData4, str4);
                            return true;
                        }
                    } else {
                        PromoteData promoteData5 = c67892V0z.A0F;
                        if (promoteData5 != null) {
                            promoteData5.A1f = null;
                            promoteData5.A1i = null;
                            promoteData5.A1d = null;
                            promoteData5.A1g = null;
                            promoteData5.A1e = null;
                            promoteData5.A1h = null;
                            return true;
                        }
                    }
                }
                C14360o3.A0F("promoteData");
                throw C00O.createAndThrow();
            case 8:
                V0W v0w = (V0W) this.A01;
                PromoteData promoteData6 = v0w.A04;
                if (promoteData6 == null) {
                    str = "promoteData";
                } else {
                    str = "promoteLogger";
                    List list = promoteData6.A1x;
                    AdsMessageExtensionType adsMessageExtensionType = AdsMessageExtensionType.A04;
                    if (z) {
                        list.add(adsMessageExtensionType);
                        c70399WUb = v0w.A01;
                        if (c70399WUb != null) {
                            vg4 = VG4.A0d;
                            str2 = "secondary_cta_toggle_opt_in";
                            c70399WUb.A0G(vg4, str2);
                            return true;
                        }
                    } else {
                        list.remove(adsMessageExtensionType);
                        c70399WUb = v0w.A01;
                        if (c70399WUb != null) {
                            vg4 = VG4.A0d;
                            str2 = "secondary_cta_toggle_opt_out";
                            c70399WUb.A0G(vg4, str2);
                            return true;
                        }
                    }
                    throw C00O.createAndThrow();
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 9:
                C23031Ai A002 = AbstractC23021Ah.A00(((ViewOnFocusChangeListenerC70880Wil) this.A01).A0L);
                AbstractC167007dF.A1L(A002, A002.A0A, C23031Ai.A8c, 236, z);
                return true;
            case 10:
                str = "datePicker";
                V1G v1g = (V1G) this.A01;
                if (z) {
                    IgTimePicker igTimePicker = v1g.A05;
                    if (igTimePicker != null) {
                        Calendar selectedTime = igTimePicker.getSelectedTime();
                        if (selectedTime != null) {
                            int i3 = selectedTime.get(2);
                            Integer valueOf = Integer.valueOf(i3);
                            int i4 = selectedTime.get(5);
                            Integer valueOf2 = Integer.valueOf(i4);
                            if (valueOf != null && valueOf2 != null) {
                                IgDatePicker igDatePicker = v1g.A04;
                                if (igDatePicker != null) {
                                    igDatePicker.A02(i3, i4);
                                    V1G.A00(v1g, i3, i4);
                                }
                                C14360o3.A0F(str);
                            }
                        }
                        IgTimePicker igTimePicker2 = v1g.A05;
                        if (igTimePicker2 == null) {
                            str = "timePicker";
                        } else {
                            AbstractC125325le.A06(new View[]{igTimePicker2}, true);
                            IgDatePicker igDatePicker2 = v1g.A04;
                            if (igDatePicker2 != null) {
                                AbstractC125325le.A07(new View[]{igDatePicker2}, true);
                                return true;
                            }
                        }
                        C14360o3.A0F(str);
                    }
                    C14360o3.A0F("timePicker");
                } else {
                    Calendar calendar = v1g.A07;
                    if (calendar == null) {
                        str = "datePickerCalendar";
                    } else {
                        int i5 = calendar.get(1);
                        IgDatePicker igDatePicker3 = v1g.A04;
                        if (igDatePicker3 != null) {
                            int currentMonth = igDatePicker3.getCurrentMonth();
                            IgDatePicker igDatePicker4 = v1g.A04;
                            if (igDatePicker4 != null) {
                                int currentDayOfMonth = igDatePicker4.getCurrentDayOfMonth();
                                IgTimePicker igTimePicker3 = v1g.A05;
                                if (igTimePicker3 != null) {
                                    igTimePicker3.A01();
                                    IgTimePicker igTimePicker4 = v1g.A05;
                                    if (igTimePicker4 != null) {
                                        igTimePicker4.A02(i5, currentMonth, currentDayOfMonth);
                                        IgTimePicker igTimePicker5 = v1g.A05;
                                        if (igTimePicker5 != null) {
                                            Calendar selectedTime2 = igTimePicker5.getSelectedTime();
                                            if (selectedTime2 != null) {
                                                V1G.A01(v1g, selectedTime2);
                                            }
                                            V1G.A02(v1g, true);
                                            return true;
                                        }
                                    }
                                }
                                C14360o3.A0F("timePicker");
                            }
                        }
                    }
                    C14360o3.A0F(str);
                }
                throw C00O.createAndThrow();
            default:
                V0R v0r = (V0R) this.A01;
                if (!z) {
                    C193328hC c193328hC = new C193328hC(v0r.A04());
                    c193328hC.A0A(2131960895);
                    c193328hC.A09(2131960893);
                    c193328hC.A0J(new WHP(v0r, 48), 2131960894);
                    AbstractC31176DnK.A16(null, c193328hC, 2131960892);
                } else {
                    v0r.A08().setChecked(true);
                    View view = v0r.A03;
                    if (view != null) {
                        view.setVisibility(0);
                        v0r.A05().requestFocus();
                        AbstractC13880nE.A0R(v0r.A05());
                    } else {
                        str = "messageSection";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                }
                return false;
        }
    }
}
