package X;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.R;
import com.google.android.material.tabs.TabLayout;
import com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType;
import com.instagram.business.boost.mediapicker.model.BoostMediaPickerTabType;
import com.instagram.feed.su.model.MiddleStateCardUser;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout2;
import com.instagram.music.common.model.MusicSearchPlaylist;
import java.util.List;
import java.util.Map;

/* renamed from: X.JWj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43748JWj extends AbstractC65852TvD {
    public final int A00;
    public final Object A01;

    public C43748JWj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AbstractC65852TvD
    public final void A00(int i) {
        switch (this.A00) {
            case 0:
                ((C65969TxM) this.A01).A00(false);
                return;
            case 1:
                if (i != 0) {
                    return;
                }
                ((ViewPager2) this.A01).A02();
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            default:
                super.A00(i);
                return;
            case 7:
                IgSegmentedTabLayout2 igSegmentedTabLayout2 = (IgSegmentedTabLayout2) this.A01;
                igSegmentedTabLayout2.A01 = igSegmentedTabLayout2.A02;
                igSegmentedTabLayout2.A02 = i;
                return;
            case 8:
                HMW hmw = (HMW) this.A01;
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                int i3 = hmw.A01;
                if (i == i3) {
                    return;
                }
                if (i3 == 0) {
                    hmw.A03.removeCallbacksAndMessages(null);
                } else if (i == 0) {
                    hmw.A03.postDelayed(hmw.A08, 4500L);
                }
                hmw.A01 = i;
                return;
        }
    }

    @Override // X.AbstractC65852TvD
    public final void A01(int i) {
        View view;
        String str;
        BoostMediaPickerTabType boostMediaPickerTabType;
        Object value;
        C45124Jxt A01;
        String str2;
        switch (this.A00) {
            case 0:
                ((C65969TxM) this.A01).A00(false);
                return;
            case 1:
                ViewPager2 viewPager2 = (ViewPager2) this.A01;
                if (viewPager2.A00 == i) {
                    return;
                }
                viewPager2.A00 = i;
                viewPager2.A09.A00();
                return;
            case 2:
                C31720DwP c31720DwP = (C31720DwP) this.A01;
                if (!AbstractC43592JPx.A0M(c31720DwP.A05).A01.A05()) {
                    return;
                }
                TabLayout tabLayout = c31720DwP.A02;
                View view2 = null;
                if (tabLayout == null) {
                    str = "tabLayout";
                    break;
                } else {
                    C154306wf A07 = tabLayout.A07(1);
                    if (A07 != null && (view = A07.A03) != null) {
                        view2 = view.findViewById(R.id.new_badge);
                    }
                    int i2 = 0;
                    if (i == 0) {
                        if (view2 == null) {
                            return;
                        }
                    } else if (i != 1 || view2 == null) {
                        return;
                    } else {
                        i2 = 8;
                    }
                    view2.setVisibility(i2);
                    return;
                }
                break;
            case 3:
                KCH kch = (KCH) this.A01;
                C44807JsZ c44807JsZ = kch.A00;
                if (c44807JsZ == null || (boostMediaPickerTabType = (BoostMediaPickerTabType) AbstractC31173DnH.A0i(c44807JsZ.A00, i)) == null) {
                    return;
                }
                InterfaceC09390do interfaceC09390do = kch.A0B;
                C44544Jmo c44544Jmo = (C44544Jmo) interfaceC09390do.getValue();
                C05A c05a = c44544Jmo.A00;
                do {
                    value = c05a.getValue();
                    C45124Jxt c45124Jxt = (C45124Jxt) value;
                    EnumC68121VCe enumC68121VCe = (EnumC68121VCe) c45124Jxt.A05;
                    int ordinal = enumC68121VCe.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            A01 = C45124Jxt.A01((BoostMediaPickerTabType) c45124Jxt.A04, boostMediaPickerTabType, enumC68121VCe, c45124Jxt.A00, c45124Jxt.A01);
                        } else {
                            throw B4Z.A00();
                        }
                    } else {
                        A01 = C45124Jxt.A01(boostMediaPickerTabType, (BoostMediaPickerTabType) c45124Jxt.A03, enumC68121VCe, c45124Jxt.A00, c45124Jxt.A01);
                    }
                } while (!c05a.AIi(value, A01));
                C44544Jmo.A00(c44544Jmo).A00();
                C70399WUb A0N = AbstractC43594JPz.A0N(kch.A0A);
                VG4 vg4 = VG4.A11;
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append(boostMediaPickerTabType);
                String A0x = AbstractC166997dE.A0x("_media_tab", A1C);
                A0N.A01 = AbstractC25225BEi.A15(kch.A06);
                A0N.A0G(vg4, A0x);
                KCH.A00(((C44544Jmo) interfaceC09390do.getValue()).A01(), kch);
                return;
            case 4:
                KBL kbl = (KBL) this.A01;
                AbstractC23641Du.A05(C12L.A00.A04, new MCO(kbl, (InterfaceC23621Ds) null, i), C07Y.A00(kbl));
                return;
            case 5:
                KC5 kc5 = (KC5) this.A01;
                List list = kc5.A07;
                if (list != null) {
                    MiddleStateCardUser middleStateCardUser = (MiddleStateCardUser) list.get(i);
                    if (middleStateCardUser.A0A) {
                        String str3 = middleStateCardUser.A08;
                        String str4 = kc5.A05;
                        if (str4 == null) {
                            str = "containerModule";
                            break;
                        } else {
                            String str5 = "";
                            String str6 = middleStateCardUser.A00;
                            int i3 = kc5.A02;
                            String str7 = middleStateCardUser.A07;
                            String str8 = middleStateCardUser.A04;
                            String str9 = middleStateCardUser.A05;
                            String str10 = middleStateCardUser.A06;
                            String str11 = kc5.A06;
                            if (str11 == null) {
                                str = "displayFormat";
                                break;
                            } else {
                                String str12 = middleStateCardUser.A03;
                                if (str12 != null) {
                                    str5 = str12;
                                }
                                C63702ur c63702ur = kc5.A04;
                                if (c63702ur != null) {
                                    C63702ur.A01(c63702ur, null, null, str6, str4, null, str11, str5, str8, str9, str10, str7, str3, "middle_state_profile", i, i3);
                                }
                            }
                        }
                    } else {
                        C123835ix c123835ix = kc5.A03;
                        if (c123835ix != null) {
                            String str13 = middleStateCardUser.A08;
                            String str14 = middleStateCardUser.A01;
                            if (str14 != null) {
                                c123835ix.A04(str13, str14, "middle_state_profile", middleStateCardUser.A00, middleStateCardUser.A07, i, 0L);
                            } else {
                                throw AbstractC166997dE.A0g();
                            }
                        }
                    }
                    int i4 = kc5.A01;
                    if (i > i4) {
                        str2 = "right";
                    } else {
                        if (i < i4) {
                            str2 = "left";
                        }
                        kc5.A01 = i;
                        return;
                    }
                    List list2 = kc5.A07;
                    if (list2 != null) {
                        MiddleStateCardUser middleStateCardUser2 = (MiddleStateCardUser) list2.get(i);
                        C63702ur c63702ur2 = kc5.A04;
                        if (c63702ur2 != null) {
                            String str15 = middleStateCardUser2.A08;
                            String str16 = kc5.A0C;
                            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c63702ur2.A01, "multiple_profile_navigation");
                            A0f.AAP("direction", str2);
                            A0f.AAP("gesture", "swipe");
                            A0f.AAP("target_id", str15);
                            AbstractC31171DnF.A1D(A0f, str16);
                            A0f.Cht();
                        }
                        kc5.A01 = i;
                        return;
                    }
                }
                str = "listCardUsers";
                break;
            case 6:
                AbstractC43592JPx.A19(i, (InterfaceC16660sJ) this.A01);
                return;
            case 7:
                return;
            default:
                super.A01(i);
                return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC65852TvD
    public final void A02(int i, float f, int i2) {
        String str;
        switch (this.A00) {
            case 2:
                if (f == 0.0f) {
                    return;
                }
                C31720DwP c31720DwP = (C31720DwP) this.A01;
                float f2 = 0.8f;
                if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(c31720DwP.A07), 36322409573263579L)) {
                    f2 = 1.0f;
                }
                TabLayout tabLayout = c31720DwP.A02;
                if (tabLayout == null) {
                    str = "tabLayout";
                    break;
                } else {
                    int selectedTabPosition = tabLayout.getSelectedTabPosition();
                    UpdateProfilePicturePagerAdapter$UpdateProfileTabType updateProfilePicturePagerAdapter$UpdateProfileTabType = UpdateProfilePicturePagerAdapter$UpdateProfileTabType.A04;
                    if (selectedTabPosition == 0) {
                        float f3 = 1.0f - 0.0f;
                        float A00 = (AbstractC43592JPx.A00((f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1)), f, 0.0f, f3) * (f2 - 1.0f)) + 1.0f;
                        float A002 = AbstractC43592JPx.A00((f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1)), f, 0.0f, f3);
                        C31720DwP.A03(c31720DwP, updateProfilePicturePagerAdapter$UpdateProfileTabType, A00);
                        UpdateProfilePicturePagerAdapter$UpdateProfileTabType updateProfilePicturePagerAdapter$UpdateProfileTabType2 = UpdateProfilePicturePagerAdapter$UpdateProfileTabType.A03;
                        C31720DwP.A03(c31720DwP, updateProfilePicturePagerAdapter$UpdateProfileTabType2, (A002 * (1.0f - f2)) + f2);
                        float A003 = AbstractC43592JPx.A00((f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1)), f, 0.0f, f3);
                        float A004 = AbstractC43592JPx.A00((f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1)), f, 0.0f, f3);
                        C31720DwP.A02(c31720DwP, updateProfilePicturePagerAdapter$UpdateProfileTabType, (A003 * (0.6f - 1.0f)) + 1.0f);
                        C31720DwP.A02(c31720DwP, updateProfilePicturePagerAdapter$UpdateProfileTabType2, (A004 * (1.0f - 0.6f)) + 0.6f);
                        return;
                    }
                    UpdateProfilePicturePagerAdapter$UpdateProfileTabType updateProfilePicturePagerAdapter$UpdateProfileTabType3 = UpdateProfilePicturePagerAdapter$UpdateProfileTabType.A03;
                    if (selectedTabPosition != 1) {
                        return;
                    }
                    float f4 = 0.0f - 1.0f;
                    float A005 = (AbstractC43592JPx.A00((f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1)), f, 1.0f, f4) * (f2 - 1.0f)) + 1.0f;
                    float A006 = AbstractC43592JPx.A00((f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1)), f, 1.0f, f4);
                    C31720DwP.A03(c31720DwP, updateProfilePicturePagerAdapter$UpdateProfileTabType3, A005);
                    C31720DwP.A03(c31720DwP, updateProfilePicturePagerAdapter$UpdateProfileTabType, (A006 * (1.0f - f2)) + f2);
                    float A007 = (AbstractC43592JPx.A00((f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1)), f, 1.0f, f4) * (0.6f - 1.0f)) + 1.0f;
                    float A008 = AbstractC43592JPx.A00((f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1)), f, 1.0f, f4);
                    C31720DwP.A02(c31720DwP, updateProfilePicturePagerAdapter$UpdateProfileTabType3, A007);
                    C31720DwP.A02(c31720DwP, updateProfilePicturePagerAdapter$UpdateProfileTabType, (A008 * (1.0f - 0.6f)) + 0.6f);
                    return;
                }
            case 3:
            case 4:
            case 5:
            case 6:
            default:
                super.A02(i, f, i2);
                return;
            case 7:
                IgSegmentedTabLayout2 igSegmentedTabLayout2 = (IgSegmentedTabLayout2) this.A01;
                int i3 = igSegmentedTabLayout2.A02;
                if (i3 != 1 && (i3 != 2 || igSegmentedTabLayout2.A01 != 1)) {
                    return;
                }
                int ceil = (int) Math.ceil(i + f);
                C44436Jks c44436Jks = igSegmentedTabLayout2.A04;
                View childAt = c44436Jks.getChildAt(ceil);
                igSegmentedTabLayout2.scrollTo((int) (((childAt.getLeft() - (AbstractC43594JPz.A09(igSegmentedTabLayout2, childAt) / 2)) * f) + ((1.0f - f) * (r2.getLeft() - (AbstractC43594JPz.A09(igSegmentedTabLayout2, c44436Jks.getChildAt(i)) / 2)))), 0);
                c44436Jks.onPageScrolled(i, f, i2);
                return;
            case 8:
                HMW hmw = (HMW) this.A01;
                int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                hmw.A09.setCurrentPage(i);
                Map map = hmw.A0A;
                MusicSearchPlaylist musicSearchPlaylist = hmw.A02;
                if (musicSearchPlaylist == null) {
                    str = "musicSearchPlaylist";
                    break;
                } else {
                    AbstractC37301Gc2.A1T(musicSearchPlaylist, map, i);
                    hmw.A00 = i;
                    return;
                }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
