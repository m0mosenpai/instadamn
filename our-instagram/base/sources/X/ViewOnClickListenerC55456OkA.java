package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.mediakit.analytics.VisibilitySheetOrigin;
import com.instagram.mediakit.model.MediaKitSectionType;
import com.instagram.mediakit.repository.MediaKitRepository;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.monetization.api.MonetizationApi;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.music.common.constants.AudioTrackType;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.search.AudioBrowserBrowseLandingPageFragment;
import com.instagram.music.search.MusicOverlayResultsListController;
import com.instagram.newsfeed.fragment.NewsfeedFragment;
import com.instagram.profile.edit.controller.EditProfileFieldsController;
import com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import go.Seq;
import java.io.IOException;
import java.io.StringWriter;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.OkA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55456OkA implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public ViewOnClickListenerC55456OkA(NQ2 nq2, int i) {
        this.A00 = i;
        this.A01 = nq2;
    }

    public static void A00(View view, int i, Object obj) {
        C0fQ.A00(new ViewOnClickListenerC55456OkA(obj, i), view);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v483, types: [X.Pl8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.Object, com.instagram.monetization.impl.MonetizationFragmentFactoryImpl] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        int A052;
        String str;
        User user;
        int i2;
        User user2;
        String str2;
        MediaKitSectionType mediaKitSectionType;
        String str3;
        C51849Mvr A00;
        C141796aw A002;
        InterfaceC16620sF pzm;
        C51961Mxj c51961Mxj;
        String str4;
        int A053;
        int i3;
        int A054;
        Integer num;
        int i4;
        String str5;
        String str6;
        EnumC193318hB enumC193318hB;
        Fragment n5f;
        User user3;
        String str7;
        String obj;
        C38321qM c38321qM;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-604393617);
                OH8 oh8 = ((C56455P4r) this.A01).A0D;
                if (oh8 != null) {
                    oh8.A00();
                }
                i = 2002619215;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A05 = C0f9.A05(-1590949735);
                OH8 oh82 = ((C56455P4r) this.A01).A0D;
                if (oh82 != null) {
                    N6U n6u = oh82.A00;
                    C189448aO A003 = N6U.A00(n6u);
                    FragmentActivity requireActivity = n6u.requireActivity();
                    A003.A0x = true;
                    C189478aR A004 = A003.A00();
                    N70 n70 = new N70();
                    n70.A00 = A004;
                    n6u.A08 = A004.A02(requireActivity, n70);
                }
                i = 1498900501;
                C0f9.A0C(i, A05);
                return;
            case 2:
                A05 = C0f9.A05(1056334982);
                OH8 oh83 = ((C56455P4r) this.A01).A0D;
                if (oh83 != null) {
                    N6U n6u2 = oh83.A00;
                    AbstractC55033OXz.A01(n6u2, C05F.A0V);
                    C51053Mh7 A0l = MSW.A0l(n6u2.A0O);
                    Context requireContext = n6u2.requireContext();
                    OLz oLz = A0l.A07.A02;
                    if (AbstractC25226BEj.A1b(oLz.A04) && AbstractC166987dD.A1b(oLz.A02)) {
                        PZM.A01(A0l, requireContext, AbstractC141776au.A00(A0l), 30);
                    } else {
                        OJU oju = new OJU(2131966789, 2131966788);
                        oju.A00(EnumC193348hE.A03, null, 2131968948);
                        C51053Mh7.A01(new P5J(oju), A0l);
                    }
                }
                i = -2036708643;
                C0f9.A0C(i, A05);
                return;
            case 3:
                A05 = C0f9.A05(-487765046);
                OH8 oh84 = ((C56455P4r) this.A01).A0D;
                if (oh84 != null) {
                    oh84.A00();
                }
                i = -1678754141;
                C0f9.A0C(i, A05);
                return;
            case 4:
                A05 = C0f9.A05(1658798755);
                N6U n6u3 = (N6U) this.A01;
                AbstractC55033OXz.A01(n6u3, C05F.A0O);
                C51053Mh7 A0l2 = MSW.A0l(n6u3.A0O);
                C57546PgK c57546PgK = new C57546PgK(n6u3, 14);
                if (A0l2.A05.A01) {
                    int size = A0l2.A07.A02.A04.size();
                    int i5 = A0l2.A08.A02;
                    if (size >= i5) {
                        C54720OEx c54720OEx = new C54720OEx(null, null, 2131966809);
                        c54720OEx.A03 = AbstractC25228BEl.A1Y(i5);
                        C51053Mh7.A01(new P5M(c54720OEx), A0l2);
                    } else {
                        c57546PgK.invoke();
                    }
                }
                i = -2096130988;
                C0f9.A0C(i, A05);
                return;
            case 5:
                A052 = C0f9.A05(259759971);
                C51053Mh7 A0l3 = MSW.A0l(((N6U) this.A01).A0O);
                ODC odc = A0l3.A05;
                if (odc.A04 && odc.A02) {
                    Integer num2 = C05F.A0n;
                    HashMap A1G = AbstractC166987dD.A1G();
                    A1G.put("destination", "partnership_thread");
                    AbstractC55033OXz.A02(A0l3, num2, A1G);
                    C51851Mvt c51851Mvt = (C51851Mvt) A0l3.A0M.getValue();
                    if (c51851Mvt != null && (user2 = c51851Mvt.A01) != null) {
                        C51053Mh7.A01(new P5U(user2.getId()), A0l3);
                    }
                } else if (C4A4.A03(odc.A03, 36316791756296856L)) {
                    Integer num3 = C05F.A0n;
                    HashMap A1G2 = AbstractC166987dD.A1G();
                    A1G2.put("destination", "brand_onboarding");
                    AbstractC55033OXz.A02(A0l3, num3, A1G2);
                    C51851Mvt c51851Mvt2 = (C51851Mvt) A0l3.A0M.getValue();
                    if (c51851Mvt2 != null && (user = c51851Mvt2.A01) != null) {
                        str = user.getId();
                    } else {
                        str = null;
                    }
                    C54985OTt c54985OTt = new C54985OTt("com.instagram.branded_content.onboarding.brand.brand_onboarding_carousel_handler");
                    C09530e4[] A1b = AbstractC25229BEm.A1b("creator_userid", str, AbstractC166987dD.A1L(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "MEDIA_KIT_MESSAGING"));
                    int i6 = 0;
                    do {
                        C09530e4 c09530e4 = A1b[i6];
                        Object obj2 = c09530e4.A00;
                        Object obj3 = c09530e4.A01;
                        HashMap hashMap = c54985OTt.A00;
                        if (obj3 == null) {
                            obj3 = "";
                        }
                        hashMap.put(obj2, obj3);
                        i6++;
                    } while (i6 < 2);
                    c54985OTt.A01 = new C57247PbV(A0l3, 17);
                    C51053Mh7.A01(new P5P(c54985OTt), A0l3);
                }
                i2 = 421590036;
                C0f9.A0C(i2, A052);
                return;
            case 6:
                A05 = C0f9.A05(-1068308242);
                C52157N6j c52157N6j = (C52157N6j) this.A01;
                AbstractC55033OXz.A01(c52157N6j, C05F.A0H);
                C140966Yy A0c = AbstractC25231BEo.A0c(c52157N6j.requireActivity(), c52157N6j.A0D);
                N5W n5w = new N5W();
                AbstractC25233BEq.A15(n5w, "mk_select_entry_point", 2);
                A0c.A0D(n5w);
                A0c.A04();
                i = -1399424468;
                C0f9.A0C(i, A05);
                return;
            case 7:
                A05 = C0f9.A05(-307205446);
                N71 n71 = (N71) this.A01;
                AbstractC55033OXz.A01(n71, C05F.A0C);
                AbstractC25227BEk.A1B(n71);
                i = -1044137613;
                C0f9.A0C(i, A05);
                return;
            case 8:
                A05 = C0f9.A05(-2011917916);
                N71 n712 = (N71) this.A01;
                AbstractC55033OXz.A01(n712, C05F.A0j);
                C140966Yy A0c2 = AbstractC25231BEo.A0c(n712.requireActivity(), n712.A06);
                NPU npu = new NPU();
                npu.setArguments(n712.mArguments);
                A0c2.A0D(npu);
                A0c2.A0G = true;
                A0c2.A04();
                i = -1356688629;
                C0f9.A0C(i, A05);
                return;
            case 9:
                A05 = C0f9.A05(1483587794);
                N71 n713 = (N71) this.A01;
                Integer num4 = C05F.A0u;
                HashMap A1G3 = AbstractC166987dD.A1G();
                A1G3.put(CacheBehaviorLogger.SOURCE, "media_kit_intro");
                AbstractC55033OXz.A02(n713, num4, A1G3);
                AbstractC31177DnL.A1N(MSW.A0l(n713.A07).A06.A00, "media_kit_intro_shown", true);
                C140966Yy A0c3 = AbstractC25231BEo.A0c(n713.requireActivity(), n713.A06);
                N6U n6u4 = new N6U();
                n6u4.setArguments(n6u4.mArguments);
                A0c3.A0B(null, n6u4);
                A0c3.A0D = false;
                A0c3.A0G = true;
                A0c3.A04();
                i = -1101409354;
                C0f9.A0C(i, A05);
                return;
            case 10:
                A05 = C0f9.A05(1811663192);
                N71 n714 = (N71) this.A01;
                AbstractC55033OXz.A01(n714, C05F.A0C);
                AbstractC25227BEk.A1B(n714);
                i = -729937824;
                C0f9.A0C(i, A05);
                return;
            case 11:
                int A055 = C0f9.A05(1714143328);
                N5W n5w2 = (N5W) this.A01;
                C51052Mh6 c51052Mh6 = (C51052Mh6) n5w2.A0B.getValue();
                FragmentActivity requireActivity2 = n5w2.requireActivity();
                Object value = n5w2.A0A.getValue();
                C14360o3.A0B(value, 1);
                int ordinal = c51052Mh6.A02.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        Integer num5 = C05F.A0h;
                        HashMap A1G4 = AbstractC166987dD.A1G();
                        A1G4.put("selected_media_count", String.valueOf(c51052Mh6.A02().size()));
                        AbstractC55033OXz.A02(c51052Mh6, num5, A1G4);
                        Collection<AbstractC52514NLh> values = c51052Mh6.A02().values();
                        C14360o3.A07(values);
                        ArrayList A0q = AbstractC167017dG.A0q(values);
                        for (AbstractC52514NLh abstractC52514NLh : values) {
                            if (abstractC52514NLh instanceof C52607NPc) {
                                c51961Mxj = new C51961Mxj(null, ((C52607NPc) abstractC52514NLh).A00.A00, C05F.A00, "", abstractC52514NLh.A00);
                            } else if (abstractC52514NLh instanceof C52606NPb) {
                                Medium medium = ((C52606NPb) abstractC52514NLh).A00.A00.A00;
                                C14360o3.A0C(medium, "null cannot be cast to non-null type com.instagram.common.gallery.Medium");
                                int i7 = abstractC52514NLh.A00;
                                C14360o3.A0B(medium, 0);
                                c51961Mxj = new C51961Mxj(medium, null, C05F.A01, AbstractC43593JPy.A0x(), i7);
                            } else {
                                throw AbstractC37303Gc4.A0M(abstractC52514NLh, "MediaKit media selection should not contain: ", AbstractC166987dD.A1C());
                            }
                            A0q.add(c51961Mxj);
                        }
                        MediaKitRepository mediaKitRepository = c51052Mh6.A03;
                        mediaKitRepository.A02.A02 = A0q;
                        mediaKitRepository.A08.Egh(A0q);
                        mediaKitRepository.A00 = true;
                        ArrayList A1E = AbstractC166987dD.A1E();
                        for (Object obj4 : A0q) {
                            if (((C51961Mxj) obj4).A03 == C05F.A01) {
                                A1E.add(obj4);
                            }
                        }
                        A002 = AbstractC141776au.A00(c51052Mh6);
                        pzm = new PZ3(A1E, c51052Mh6, requireActivity2, value, (InterfaceC23621Ds) null, 25);
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    Collection<AbstractC52514NLh> values2 = c51052Mh6.A02().values();
                    C14360o3.A07(values2);
                    ArrayList A0q2 = AbstractC167017dG.A0q(values2);
                    for (AbstractC52514NLh abstractC52514NLh2 : values2) {
                        C14360o3.A0C(abstractC52514NLh2, "null cannot be cast to non-null type com.instagram.mediakit.ui.definition.picker.MediaKitMediaItemModel");
                        C38321qM c38321qM2 = ((C52607NPc) abstractC52514NLh2).A00.A00;
                        new C1DY((C1DV) new C37761pD(null), 6, false);
                        Integer valueOf = Integer.valueOf(c38321qM2.A0w());
                        new C1DY((C1DV) new C37761pD(null), 6, false);
                        A0q2.add(new C51848Mvq(c38321qM2, valueOf));
                    }
                    if (!A0q2.isEmpty()) {
                        Integer num6 = C05F.A0g;
                        HashMap A1G5 = AbstractC166987dD.A1G();
                        A1G5.put("selected_media_count", String.valueOf(c51052Mh6.A02().size()));
                        C51850Mvs c51850Mvs = c51052Mh6.A00;
                        if (c51850Mvs == null || (str2 = c51850Mvs.A03) == null || !(!c51052Mh6.A03.A0B(str2))) {
                            str2 = null;
                        }
                        C51850Mvs c51850Mvs2 = c51052Mh6.A00;
                        if (c51850Mvs2 == null || (mediaKitSectionType = c51850Mvs2.A01) == null) {
                            mediaKitSectionType = MediaKitSectionType.A06;
                        }
                        MediaKitRepository mediaKitRepository2 = c51052Mh6.A03;
                        if (c51850Mvs2 != null) {
                            str3 = c51850Mvs2.A03;
                        } else {
                            str3 = null;
                        }
                        int A056 = mediaKitRepository2.A05(str3);
                        C14360o3.A0B(mediaKitSectionType, 1);
                        if (str2 != null) {
                            A1G5.put("section_id", str2);
                        }
                        A1G5.put("section_position", String.valueOf(A056 + 1));
                        AbstractC55033OXz.A00(OPN.A01(mediaKitSectionType), c51052Mh6, num6, null, null, A1G5);
                        C51850Mvs c51850Mvs3 = c51052Mh6.A00;
                        if (c51850Mvs3 != null) {
                            List list = c51850Mvs3.A05;
                            String str8 = c51850Mvs3.A02;
                            String str9 = c51850Mvs3.A03;
                            List list2 = c51850Mvs3.A06;
                            String str10 = c51850Mvs3.A04;
                            MediaKitSectionType mediaKitSectionType2 = c51850Mvs3.A01;
                            C51849Mvr c51849Mvr = c51850Mvs3.A00;
                            if (c51849Mvr != null) {
                                boolean z = c51849Mvr.A01;
                                AbstractC37302Gc3.A0n();
                                A00 = Nv8.A00(A0q2, z);
                            } else {
                                AbstractC37302Gc3.A0n();
                                ArrayList A0q3 = AbstractC167017dG.A0q(A0q2);
                                Iterator it = A0q2.iterator();
                                while (it.hasNext()) {
                                    A0q3.add(it.next());
                                }
                                A00 = Nv8.A00(new C51849Mvr(A0q3, false).A00, false);
                            }
                            C51850Mvs A005 = Nv9.A00(A00, mediaKitSectionType2, str8, str9, str10, list, list2);
                            if (c51052Mh6.A01) {
                                A002 = AbstractC141776au.A00(c51052Mh6);
                                pzm = new PZM(c51052Mh6, A005, null, 26);
                            } else {
                                mediaKitRepository2.A0A(A005, A005.A03, true);
                            }
                        }
                    }
                    AbstractC25226BEj.A1P(n5w2);
                    C0f9.A0C(-895825475, A055);
                    return;
                }
                AbstractC166987dD.A1Z(pzm, A002);
                AbstractC25226BEj.A1P(n5w2);
                C0f9.A0C(-895825475, A055);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A05 = C0f9.A05(-809670299);
                C51052Mh6.A01((C51052Mh6) ((N5W) this.A01).A0B.getValue(), C57645Phv.A00);
                i = 240588651;
                C0f9.A0C(i, A05);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A05 = C0f9.A05(-2058702245);
                C52733NUw c52733NUw = (C52733NUw) this.A01;
                C50978Mfl c50978Mfl = (C50978Mfl) c52733NUw.A03.getValue();
                Iterable A0w = AbstractC31172DnG.A0w(c50978Mfl.A0B);
                ArrayList A0q4 = AbstractC167017dG.A0q(A0w);
                Iterator it2 = A0w.iterator();
                while (it2.hasNext()) {
                    A0q4.add(((C32069E6v) it2.next()).A02);
                }
                C51850Mvs c51850Mvs4 = c50978Mfl.A00;
                str4 = "profileSection";
                if (c51850Mvs4 != null) {
                    String str11 = c51850Mvs4.A02;
                    String str12 = c51850Mvs4.A03;
                    List list3 = c51850Mvs4.A06;
                    C51849Mvr c51849Mvr2 = c51850Mvs4.A00;
                    String str13 = c51850Mvs4.A04;
                    MediaKitSectionType mediaKitSectionType3 = c51850Mvs4.A01;
                    C14360o3.A0B(str12, 2);
                    AbstractC167017dG.A1T(str13, mediaKitSectionType3);
                    C51850Mvs c51850Mvs5 = new C51850Mvs(c51849Mvr2, mediaKitSectionType3, str11, str12, str13, A0q4, list3);
                    InterfaceC58279PsX interfaceC58279PsX = c50978Mfl.A05;
                    Integer num7 = C05F.A0i;
                    HashMap A1G6 = AbstractC166987dD.A1G();
                    A1G6.put("selected_profile_count", String.valueOf(A0q4.size()));
                    C51850Mvs c51850Mvs6 = c50978Mfl.A00;
                    if (c51850Mvs6 != null) {
                        String str14 = c51850Mvs6.A03;
                        MediaKitRepository mediaKitRepository3 = c50978Mfl.A06;
                        if (!(!mediaKitRepository3.A0B(str14))) {
                            str14 = null;
                        }
                        C51850Mvs c51850Mvs7 = c50978Mfl.A00;
                        if (c51850Mvs7 != null) {
                            MediaKitSectionType mediaKitSectionType4 = c51850Mvs7.A01;
                            int A057 = mediaKitRepository3.A05(c51850Mvs7.A03);
                            C14360o3.A0B(mediaKitSectionType4, 1);
                            if (str14 != null) {
                                A1G6.put("section_id", str14);
                            }
                            A1G6.put("section_position", String.valueOf(A057 + 1));
                            AbstractC55033OXz.A00(OPN.A01(mediaKitSectionType4), interfaceC58279PsX, num7, null, null, A1G6);
                            if (c50978Mfl.A01) {
                                PZM.A01(c50978Mfl, c51850Mvs5, AbstractC141776au.A00(c50978Mfl), 28);
                            } else {
                                mediaKitRepository3.A0A(c51850Mvs5, c51850Mvs5.A03, true);
                            }
                            AbstractC25226BEj.A1P(c52733NUw);
                            i = 1716900564;
                            C0f9.A0C(i, A05);
                            return;
                        }
                    }
                }
                C14360o3.A0F(str4);
                throw C00O.createAndThrow();
            case 14:
                A05 = C0f9.A05(-517360944);
                N5V n5v = (N5V) this.A01;
                C51053Mh7 A0l4 = MSW.A0l(n5v.A03);
                ArrayList A1F = AbstractC166987dD.A1F(((C51127MiW) n5v.A01.getValue()).A01);
                MediaKitRepository mediaKitRepository4 = A0l4.A07;
                OLz oLz2 = mediaKitRepository4.A02;
                int size2 = A1F.size();
                ArrayList arrayList = oLz2.A04;
                if (size2 == arrayList.size()) {
                    LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC50522MSa.A09(arrayList));
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        A18.put(((C51850Mvs) next).A03, next);
                    }
                    arrayList.clear();
                    ArrayList A1E2 = AbstractC166987dD.A1E();
                    Iterator it4 = A1F.iterator();
                    while (it4.hasNext()) {
                        Object obj5 = A18.get(((C51850Mvs) it4.next()).A03);
                        if (obj5 != null) {
                            A1E2.add(obj5);
                        }
                    }
                    arrayList.addAll(A1E2);
                }
                MediaKitRepository.A04(mediaKitRepository4);
                AbstractC25226BEj.A1P(n5v);
                i = 1676916580;
                C0f9.A0C(i, A05);
                return;
            case Process.SIGTERM /* 15 */:
                A052 = C0f9.A05(-575705297);
                NPU npu2 = (NPU) this.A01;
                Integer num8 = C05F.A0u;
                HashMap A1G7 = AbstractC166987dD.A1G();
                A1G7.put(CacheBehaviorLogger.SOURCE, "media_kit_intro_info");
                AbstractC55033OXz.A02(npu2, num8, A1G7);
                AbstractC31177DnL.A1N(MSW.A0l(npu2.A00).A06.A00, "media_kit_intro_shown", true);
                C140966Yy A0c4 = AbstractC25231BEo.A0c(npu2.requireActivity(), npu2.A07);
                N6U n6u5 = new N6U();
                n6u5.setArguments(n6u5.mArguments);
                A0c4.A0B(null, n6u5);
                A0c4.A0G = true;
                AbstractC10360h2 parentFragmentManager = npu2.getParentFragmentManager();
                int A0L = parentFragmentManager.A0L();
                for (int i8 = 0; i8 < A0L; i8++) {
                    parentFragmentManager.A12();
                }
                A0c4.A04();
                i2 = 1970766319;
                C0f9.A0C(i2, A052);
                return;
            case 16:
                A05 = C0f9.A05(649422851);
                N72 n72 = (N72) this.A01;
                AbstractC55033OXz.A01(n72, C05F.A0N);
                AbstractC25226BEj.A1Q(n72);
                i = -1887835035;
                C0f9.A0C(i, A05);
                return;
            case 17:
                A053 = C0f9.A05(149765803);
                C46015KYd c46015KYd = (C46015KYd) this.A01;
                C56389P2a c56389P2a = c46015KYd.A01;
                C38321qM c38321qM3 = ((OKu) c46015KYd).A00;
                C14360o3.A0B(c38321qM3, 0);
                InterfaceC58279PsX interfaceC58279PsX2 = c56389P2a.A00;
                Integer num9 = C05F.A0b;
                HashMap A1G8 = AbstractC166987dD.A1G();
                String A38 = c38321qM3.A38();
                if (A38 != null) {
                    A1G8.put("media_id", A38);
                    AbstractC55033OXz.A02(interfaceC58279PsX2, num9, A1G8);
                    String id = c38321qM3.getId();
                    if (id != null) {
                        C56389P2a.A00(c56389P2a, new P5W(id));
                        i3 = -210354804;
                        C0f9.A0C(i3, A053);
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 18:
                A053 = C0f9.A05(1582599159);
                AbstractC56115Ova abstractC56115Ova = (AbstractC56115Ova) this.A01;
                abstractC56115Ova.A03.A01(abstractC56115Ova.A01);
                i3 = 1433969984;
                C0f9.A0C(i3, A053);
                return;
            case Process.SIGSTOP /* 19 */:
                A053 = C0f9.A05(1736706054);
                AbstractC56115Ova abstractC56115Ova2 = (AbstractC56115Ova) this.A01;
                abstractC56115Ova2.A03.A01(abstractC56115Ova2.A01);
                i3 = 1899973809;
                C0f9.A0C(i3, A053);
                return;
            case 20:
                A053 = C0f9.A05(280940731);
                AbstractC166987dD.A1Y(this.A01);
                i3 = 966489281;
                C0f9.A0C(i3, A053);
                return;
            case 21:
                A053 = C0f9.A05(-285020711);
                AbstractC166987dD.A1Y(this.A01);
                i3 = -565084131;
                C0f9.A0C(i3, A053);
                return;
            case 22:
                A053 = C0f9.A05(1766484439);
                C51053Mh7.A01(new P5Z(VisibilitySheetOrigin.A05), ((C56085Ov2) this.A01).A00.A02);
                i3 = 584205809;
                C0f9.A0C(i3, A053);
                return;
            case 23:
                A054 = C0f9.A05(769233216);
                C51340Mm1 c51340Mm1 = (C51340Mm1) this.A01;
                int i9 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                N5G n5g = c51340Mm1.A01;
                C51016MgO c51016MgO = (C51016MgO) n5g.A03.getValue();
                UserMonetizationProductType userMonetizationProductType = n5g.A00;
                str4 = "productType";
                if (userMonetizationProductType != null) {
                    C2GS c2gs = c51016MgO.A03;
                    C51638MrV c51638MrV = (C51638MrV) c2gs.A02();
                    if (c51638MrV != null) {
                        c51638MrV.A00 = "disabled";
                    }
                    c2gs.A0B(c51638MrV);
                    C41761wQ c41761wQ = c51016MgO.A05;
                    MonetizationRepository monetizationRepository = c51016MgO.A07;
                    switch (userMonetizationProductType.ordinal()) {
                        case 1:
                            num = C05F.A0N;
                            break;
                        case 2:
                        case 9:
                        case Process.SIGTERM /* 15 */:
                            num = C05F.A00;
                            break;
                        case 10:
                            num = C05F.A0C;
                            break;
                        case 11:
                            num = C05F.A0Y;
                            break;
                        default:
                            num = C05F.A01;
                            break;
                    }
                    C67936V3b c67936V3b = new C67936V3b(9);
                    C14360o3.A0B(num, 0);
                    MonetizationApi monetizationApi = monetizationRepository.A08;
                    String str15 = null;
                    try {
                        switch (num.intValue()) {
                            case 0:
                                str5 = "INSTAGRAM_MONETIZATION_HUB";
                                break;
                            case 1:
                                str5 = "IG_BRANDED_CONTENT";
                                break;
                            case 2:
                                str5 = "IGTV_BRAND_SAFETY";
                                break;
                            case 3:
                                str5 = "IG_AFFILIATE";
                                break;
                            default:
                                str5 = "IG_CREATOR_FUND_ONGOING";
                                break;
                        }
                        String str16 = monetizationApi.A00.userId;
                        C14360o3.A0B(str16, 2);
                        StringWriter A0O = AbstractC37300Gc1.A0O();
                        C17z A0S = AbstractC167007dF.A0S(A0O);
                        A0S.A0r("input");
                        A0S.A0d();
                        A0S.A0S("appeal_source", str5);
                        A0S.A0S("client_mutation_id", str16);
                        A0S.A0a();
                        str15 = AbstractC167017dG.A0l(A0S, A0O);
                    } catch (IOException unused) {
                        C0w9.A03("MonetizationApi", AbstractC111324zv.A00(629));
                    }
                    C907542o c907542o = new C907542o(monetizationApi.A00);
                    if (str15 == null) {
                        str4 = "queryParamsString";
                    } else {
                        c907542o.A09(new C907642p(C69947VyN.class, "IGMonetizationEligibilityAppeal", str15, false));
                        Integer num10 = C05F.A00;
                        c907542o.A08 = AbstractC111324zv.A00(58);
                        C1ON A07 = c907542o.A07(num10);
                        A07.A00 = c67936V3b;
                        c41761wQ.A02(AbstractC34046F0z.A00(A07), new PKE(0, c51016MgO, c51638MrV));
                        UserMonetizationProductType userMonetizationProductType2 = n5g.A00;
                        if (userMonetizationProductType2 != null) {
                            if (userMonetizationProductType2 == UserMonetizationProductType.A06) {
                                AbstractC31175DnJ.A1N(AbstractC12220kQ.A01(n5g, AbstractC25230BEn.A0k(n5g.A04, 0)), "ig_monetization_hub_appeal_request_sent");
                            }
                            i4 = -1409345498;
                            C0f9.A0C(i4, A054);
                            return;
                        }
                    }
                }
                C14360o3.A0F(str4);
                throw C00O.createAndThrow();
            case 24:
                A05 = C0f9.A05(-87103623);
                C3DN A01 = C3DN.A00.A01(((Fragment) this.A01).getContext());
                if (A01 != null) {
                    A01.A0B();
                }
                i = -1583731693;
                C0f9.A0C(i, A05);
                return;
            case 25:
                int A058 = C0f9.A05(-760501808);
                AudioBrowserBrowseLandingPageFragment audioBrowserBrowseLandingPageFragment = (AudioBrowserBrowseLandingPageFragment) this.A01;
                ViewPager viewPager = audioBrowserBrowseLandingPageFragment.viewPager;
                if (viewPager != null) {
                    viewPager.requestFocus();
                    InterfaceC09390do interfaceC09390do = audioBrowserBrowseLandingPageFragment.A0H;
                    AbstractC43593JPy.A0T(interfaceC09390do).A0u(EnumC193318hB.A08);
                    if (audioBrowserBrowseLandingPageFragment.A04 != null) {
                        if (!r1.contains(AudioTrackType.A03)) {
                            str6 = "playlists";
                        } else {
                            str6 = "saved_music";
                        }
                        MusicBrowseCategory A03 = C50535MSo.A03(str6, "bookmarked", AbstractC166997dE.A0p(audioBrowserBrowseLandingPageFragment.requireContext(), 2131968036));
                        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                        MusicProduct musicProduct = audioBrowserBrowseLandingPageFragment.A05;
                        if (musicProduct != null) {
                            ImmutableList immutableList = audioBrowserBrowseLandingPageFragment.A04;
                            if (immutableList != null) {
                                String str17 = audioBrowserBrowseLandingPageFragment.A0D;
                                if (str17 == null) {
                                    str4 = "browseSessionFullId";
                                } else {
                                    EnumC1810381f enumC1810381f = audioBrowserBrowseLandingPageFragment.A0C;
                                    if (enumC1810381f == null) {
                                        str4 = "captureState";
                                    } else {
                                        EnumC50631MWs enumC50631MWs = audioBrowserBrowseLandingPageFragment.A02;
                                        if (enumC50631MWs == null) {
                                            str4 = "surfaceType";
                                        } else {
                                            MYT A006 = AbstractC54062NvM.A00(audioBrowserBrowseLandingPageFragment.A01, enumC50631MWs, immutableList, audioBrowserBrowseLandingPageFragment.A03, musicProduct, A0r, null, A03, null, enumC1810381f, str17, null, "full_list", audioBrowserBrowseLandingPageFragment.A0F, audioBrowserBrowseLandingPageFragment.A00, false, audioBrowserBrowseLandingPageFragment.A0G);
                                            InterfaceC57964PnA interfaceC57964PnA = audioBrowserBrowseLandingPageFragment.A0A;
                                            if (interfaceC57964PnA == null) {
                                                str4 = "trackSelectionDelegate";
                                            } else {
                                                A006.A05 = interfaceC57964PnA;
                                                C677733r c677733r = audioBrowserBrowseLandingPageFragment.A08;
                                                if (c677733r != null) {
                                                    A006.A03 = c677733r;
                                                }
                                                AbstractC54063NvN.A00(audioBrowserBrowseLandingPageFragment, A006, false);
                                                C0f9.A0C(221159723, A058);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        str4 = "musicProduct";
                    }
                    str4 = "audioTrackTypesToExclude";
                } else {
                    str4 = "viewPager";
                }
                C14360o3.A0F(str4);
                throw C00O.createAndThrow();
            case 26:
                A054 = C0f9.A05(-1551629159);
                ((MYM) this.A01).A09(C05F.A0C);
                i4 = -2113264450;
                C0f9.A0C(i4, A054);
                return;
            case 27:
                A05 = C0f9.A05(1747251464);
                MYT myt = (MYT) this.A01;
                C22C A0T = AbstractC43593JPy.A0T(myt.A0S);
                MusicProduct musicProduct2 = myt.A01;
                if (musicProduct2 != null) {
                    if (musicProduct2 == MusicProduct.A06) {
                        enumC193318hB = EnumC193318hB.A02;
                    } else {
                        enumC193318hB = EnumC193318hB.A08;
                    }
                    A0T.A0u(enumC193318hB);
                    MusicOverlayResultsListController musicOverlayResultsListController = myt.A04;
                    if (musicOverlayResultsListController != null) {
                        musicOverlayResultsListController.A08();
                        i = -525495390;
                        C0f9.A0C(i, A05);
                        return;
                    }
                    str4 = "resultsListController";
                    C14360o3.A0F(str4);
                    throw C00O.createAndThrow();
                }
                str4 = "musicProduct";
                C14360o3.A0F(str4);
                throw C00O.createAndThrow();
            case 28:
                A054 = C0f9.A05(-1233887575);
                MYT.A02((MYT) this.A01);
                i4 = -681734028;
                C0f9.A0C(i4, A054);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A054 = C0f9.A05(1198676191);
                MusicOverlayResultsListController musicOverlayResultsListController2 = ((MYT) this.A01).A04;
                if (musicOverlayResultsListController2 != null) {
                    musicOverlayResultsListController2.A07();
                    i4 = 1278552930;
                    C0f9.A0C(i4, A054);
                    return;
                }
                str4 = "resultsListController";
                C14360o3.A0F(str4);
                throw C00O.createAndThrow();
            case 30:
                A054 = C0f9.A05(1686218657);
                ((MYT) this.A01).onBackPressed();
                i4 = 596852869;
                C0f9.A0C(i4, A054);
                return;
            case 31:
                A054 = C0f9.A05(-1788974883);
                P64 p64 = (P64) this.A01;
                C193328hC A0O2 = AbstractC31175DnJ.A0O(p64.A01);
                A0O2.A0A(2131955197);
                A0O2.A09(2131955196);
                A0O2.A0M(DialogInterfaceOnClickListenerC55320Ogi.A00(p64, 14), 2131955188);
                A0O2.A06();
                A0O2.A04();
                AbstractC166987dD.A1W(A0O2);
                i4 = 688982618;
                C0f9.A0C(i4, A054);
                return;
            case 32:
                A054 = C0f9.A05(-421269190);
                C28271Yo A007 = C2OJ.A00();
                NewsfeedFragment newsfeedFragment = (NewsfeedFragment) this.A01;
                A007.A03(newsfeedFragment.requireContext(), AbstractC166987dD.A0r(newsfeedFragment.A0A), "");
                i4 = -220094666;
                C0f9.A0C(i4, A054);
                return;
            case 33:
                A052 = C0f9.A05(-449965538);
                EMR emr = (EMR) this.A01;
                AbstractC50522MSa.A11(AbstractC50522MSa.A0J(emr), emr);
                N42 n42 = new N42();
                InterfaceC09390do interfaceC09390do2 = emr.A06;
                C09530e4 A0n = MSY.A0n(AbstractC166987dD.A0r(interfaceC09390do2));
                Boolean A0b = AbstractC166997dE.A0b();
                AbstractC25227BEk.A1C(n42, AbstractC167007dF.A1b("args_is_form_extension", false, A0n, AbstractC166987dD.A1L("arg_should_include_country_code", A0b)));
                n42.A01 = new C57752Pjf(emr, 28);
                C189448aO A0g = AbstractC25231BEo.A0g(interfaceC09390do2);
                A0g.A0a = A0b;
                A0g.A03 = 1.0f;
                A0g.A0T = new PHV(n42, 6);
                AbstractC31177DnL.A14(emr, n42, A0g);
                i2 = 294513103;
                C0f9.A0C(i2, A052);
                return;
            case 34:
                A054 = C0f9.A05(1011800154);
                N59 n59 = (N59) this.A01;
                FragmentActivity requireActivity3 = n59.requireActivity();
                InterfaceC09390do interfaceC09390do3 = n59.A00;
                C140966Yy A0c5 = AbstractC25231BEo.A0c(requireActivity3, interfaceC09390do3);
                AbstractC34823FVz.A01();
                ?? obj6 = new Object();
                UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do3);
                InterfaceC09390do interfaceC09390do4 = n59.A02;
                A0c5.A0D(obj6.A00(((C50923Mes) interfaceC09390do4.getValue()).A01, A0r2, ((C50923Mes) interfaceC09390do4.getValue()).A02, false));
                A0c5.A04();
                i4 = -268484266;
                C0f9.A0C(i4, A054);
                return;
            case 35:
                A054 = C0f9.A05(-342829045);
                C66277U6x A012 = C66277U6x.A01("com.instagram.pro_home.monetization_platform.support.monetization_help_screen", AbstractC166987dD.A1G());
                N59 n592 = (N59) this.A01;
                A012.A04(n592.requireActivity(), AbstractC31171DnF.A0C(AbstractC166987dD.A0o(n592.A00)));
                i4 = 1735616419;
                C0f9.A0C(i4, A054);
                return;
            case 36:
                A054 = C0f9.A05(1554988801);
                N61 n61 = (N61) this.A01;
                AbstractC41776Ies.A09(n61.requireActivity(), AbstractC166987dD.A0r(n61.A04), C2Fb.A25, "https://help.instagram.com/537304753874814", "creator_revshare_account_level_monetization_toggle");
                N61.A00(n61, "secondary_button_clicked", "https://help.instagram.com/537304753874814");
                i4 = -1642058291;
                C0f9.A0C(i4, A054);
                return;
            case 37:
                A054 = C0f9.A05(1823341579);
                AbstractC25226BEj.A1P((Fragment) this.A01);
                i4 = 1635602942;
                C0f9.A0C(i4, A054);
                return;
            case 38:
                A054 = C0f9.A05(663049620);
                N6E n6e = (N6E) this.A01;
                InterfaceC09390do interfaceC09390do5 = n6e.A02;
                AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do5);
                C06090Tz c06090Tz = C06090Tz.A05;
                n6e.A04("primary_button_clicked", "feature_preview", NQ2.__redex_internal_original_name, C18U.A04(c06090Tz, A0o, 36878758162596039L));
                AbstractC41776Ies.A09(n6e.requireActivity(), AbstractC166987dD.A0r(interfaceC09390do5), C2Fb.A2l, C18U.A04(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do5), 36878758162596039L), NQ2.__redex_internal_original_name);
                i4 = 1154898497;
                C0f9.A0C(i4, A054);
                return;
            case 39:
                A054 = C0f9.A05(1323145598);
                N6E n6e2 = (N6E) this.A01;
                n6e2.A04("primary_button_clicked", "feature_preview", NQ2.__redex_internal_original_name, "https://www.facebook.com/help/instagram/512371932629820");
                AbstractC41776Ies.A09(n6e2.requireActivity(), AbstractC166987dD.A0r(n6e2.A02), C2Fb.A2m, "https://www.facebook.com/help/instagram/512371932629820", NQ2.__redex_internal_original_name);
                i4 = -1141380420;
                C0f9.A0C(i4, A054);
                return;
            case 40:
                A054 = C0f9.A05(1251707360);
                N6E n6e3 = (N6E) this.A01;
                AbstractC41776Ies.A09(n6e3.requireActivity(), AbstractC166987dD.A0r(n6e3.A02), C2Fb.A25, "https://www.facebook.com/help/instagram/512371932629820", NQ2.__redex_internal_original_name);
                n6e3.A04("secondary_button_clicked", "feature_preview", NQ2.__redex_internal_original_name, "https://www.facebook.com/help/instagram/512371932629820");
                i4 = 1385185986;
                C0f9.A0C(i4, A054);
                return;
            case Seq.NULL_REFNUM /* 41 */:
                A054 = C0f9.A05(566343181);
                NQ4 nq4 = (NQ4) this.A01;
                C140966Yy A0T2 = MSZ.A0T(nq4);
                MSZ.A1K(A0T2);
                InterfaceC09390do interfaceC09390do6 = nq4.A00;
                String str18 = ((C50977Mfk) interfaceC09390do6.getValue()).A01.A00;
                String str19 = ((C51722Msz) ((C50977Mfk) interfaceC09390do6.getValue()).A09.getValue()).A01;
                N59 n593 = new N59();
                Bundle A0b2 = AbstractC166987dD.A0b();
                A0b2.putString("ARGUMENT_PRODUCT_TYPE", str18);
                A0b2.putString("ARGUMENT_PRODUCT_ELIGIBILITY", str19);
                AbstractC31175DnJ.A0t(A0b2, n593, A0T2);
                i4 = -515307381;
                C0f9.A0C(i4, A054);
                return;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A054 = C0f9.A05(-1612297652);
                N5L n5l = (N5L) this.A01;
                C140966Yy A0c6 = AbstractC25231BEo.A0c(n5l.requireActivity(), n5l.A00);
                MSZ.A1K(A0c6);
                InterfaceC09390do interfaceC09390do7 = n5l.A02;
                AbstractC31175DnJ.A0t(AbstractC50522MSa.A0F(((C50934Mf3) interfaceC09390do7.getValue()).A00, ((C50934Mf3) interfaceC09390do7.getValue()).A02), new C52147N5w(), A0c6);
                i4 = 1713957140;
                C0f9.A0C(i4, A054);
                return;
            case 43:
                A05 = C0f9.A05(-1216080604);
                N5L n5l2 = (N5L) this.A01;
                FragmentActivity requireActivity4 = n5l2.requireActivity();
                InterfaceC09390do interfaceC09390do8 = n5l2.A00;
                C140966Yy A0c7 = AbstractC25231BEo.A0c(requireActivity4, interfaceC09390do8);
                A0c7.A0E = true;
                OPZ.A01().A00();
                InterfaceC09390do interfaceC09390do9 = n5l2.A02;
                String str20 = ((C50934Mf3) interfaceC09390do9.getValue()).A02;
                AbstractC12990ll A0o2 = AbstractC166987dD.A0o(interfaceC09390do8);
                IGRevShareProductType iGRevShareProductType = ((C50934Mf3) interfaceC09390do9.getValue()).A00;
                if (C18U.A06(AbstractC25225BEi.A0j(A0o2, 1), A0o2, 36315808209833542L)) {
                    n5f = new N5D();
                } else {
                    n5f = new N5F();
                }
                AbstractC31175DnJ.A0t(AbstractC50522MSa.A0F(iGRevShareProductType, str20), n5f, A0c7);
                i = -868363512;
                C0f9.A0C(i, A05);
                return;
            case 44:
                A054 = C0f9.A05(-1614042122);
                ((InterfaceC16660sJ) this.A01).invoke(C52637NQk.A00);
                i4 = -1595689015;
                C0f9.A0C(i4, A054);
                return;
            case 45:
                A054 = C0f9.A05(315167934);
                ((InterfaceC16660sJ) this.A01).invoke(C52639NQm.A00);
                i4 = 1103097045;
                C0f9.A0C(i4, A054);
                return;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A054 = C0f9.A05(1434192899);
                ((InterfaceC16660sJ) this.A01).invoke(C52640NQn.A00);
                i4 = 257951644;
                C0f9.A0C(i4, A054);
                return;
            case 47:
                A054 = C0f9.A05(-1889582925);
                ((InterfaceC16660sJ) this.A01).invoke(C52639NQm.A00);
                i4 = 1456048214;
                C0f9.A0C(i4, A054);
                return;
            case 48:
                A054 = C0f9.A05(1041012080);
                ((InterfaceC16660sJ) this.A01).invoke(C52640NQn.A00);
                i4 = -308789868;
                C0f9.A0C(i4, A054);
                return;
            case 49:
                A054 = C0f9.A05(-1728749562);
                ((InterfaceC16660sJ) this.A01).invoke(C52642NQp.A00);
                i4 = 699784478;
                C0f9.A0C(i4, A054);
                return;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                A054 = C0f9.A05(-164250596);
                EditProfileFieldsController editProfileFieldsController = (EditProfileFieldsController) this.A01;
                C140966Yy A0r3 = AbstractC25225BEi.A0r(editProfileFieldsController.A06(), editProfileFieldsController.A0C);
                A0r3.A0D(AbstractC31364DqT.A02().A06(false));
                A0r3.A04();
                i4 = 566802495;
                C0f9.A0C(i4, A054);
                return;
            case 51:
                A05 = C0f9.A05(2083532331);
                OC5 oc5 = ((C52169N6y) this.A01).A00;
                if (oc5 != null) {
                    C189478aR c189478aR = oc5.A02;
                    UserSession userSession = oc5.A01;
                    C189448aO A0y = AbstractC25225BEi.A0y(userSession);
                    AbstractC25225BEi.A1Q(A0y, false);
                    AbstractC25226BEj.A1M(oc5.A00, A0y, 2131962722);
                    AbstractC31364DqT.A03();
                    String id2 = oc5.A03.getId();
                    Bundle A059 = AbstractC31178DnM.A05(userSession);
                    A059.putString("ProfileLiveNotificationsSettingsFragment.ARG_DISPLAYED_USER_ID", id2);
                    N4s n4s = new N4s();
                    n4s.setArguments(A059);
                    c189478aR.A0F(n4s, A0y);
                }
                i = 1867713666;
                C0f9.A0C(i, A05);
                return;
            case 52:
                A05 = C0f9.A05(-1378113622);
                InterfaceC57971PnH interfaceC57971PnH = ((C52169N6y) this.A01).A01;
                if (interfaceC57971PnH != null) {
                    interfaceC57971PnH.E2j();
                }
                i = 1708273547;
                C0f9.A0C(i, A05);
                return;
            case 53:
                A054 = C0f9.A05(1712686616);
                ((C50976Mfj) ((C52169N6y) this.A01).A06.getValue()).A00();
                i4 = 1200099920;
                C0f9.A0C(i4, A054);
                return;
            case 54:
                A054 = C0f9.A05(538765384);
                ((QuickSnapArchiveViewModel) ((N4Y) this.A01).A06.getValue()).A06();
                i4 = 549266021;
                C0f9.A0C(i4, A054);
                return;
            case 55:
                A054 = C0f9.A05(-1246632847);
                C193798hz c193798hz = (C193798hz) this.A01;
                QuickSnapArchiveViewModel quickSnapArchiveViewModel = (QuickSnapArchiveViewModel) c193798hz.A0D.getValue();
                QuickSnapArchiveViewModel.A01(new P7Z(MSW.A1F(quickSnapArchiveViewModel, 31), new C57249PbX(AMo.A00(c193798hz.A04.getContext(), R.dimen.clips_viewer_recommend_clips_height), 48, quickSnapArchiveViewModel), ((AbstractCollection) ((C9BR) quickSnapArchiveViewModel.A0G.getValue()).A01).size()), quickSnapArchiveViewModel);
                i4 = 1000830757;
                C0f9.A0C(i4, A054);
                return;
            case 56:
                A054 = C0f9.A05(-1795120585);
                ((P7Z) this.A01).A01.invoke();
                i4 = -392629662;
                C0f9.A0C(i4, A054);
                return;
            case 57:
                A054 = C0f9.A05(-1047428278);
                ((P7Z) this.A01).A02.invoke();
                i4 = -1687501539;
                C0f9.A0C(i4, A054);
                return;
            case 58:
                A05 = C0f9.A05(-1240761058);
                AbstractC31177DnL.A12((Fragment) this.A01);
                i = -1974807820;
                C0f9.A0C(i, A05);
                return;
            case 59:
                A05 = C0f9.A05(1806152305);
                C51002Mg9 c51002Mg9 = (C51002Mg9) ((N76) this.A01).A0J.getValue();
                if (((C54721OEy) ((C51755Mte) c51002Mg9.A08.getValue()).A00) != null) {
                    C51002Mg9.A00(P7T.A00, c51002Mg9);
                }
                i = 1320471314;
                C0f9.A0C(i, A05);
                return;
            case 60:
                A05 = C0f9.A05(-823730801);
                C51002Mg9 c51002Mg92 = (C51002Mg9) ((N76) this.A01).A0J.getValue();
                C54721OEy c54721OEy = (C54721OEy) ((C51755Mte) c51002Mg92.A08.getValue()).A00;
                if (c54721OEy != null && (user3 = (User) AbstractC001800i.A0J(c54721OEy.A05)) != null && c54721OEy.A02 == EnumC76383bi.A06) {
                    user3.getId();
                }
                C51002Mg9.A00(new Object(), c51002Mg92);
                i = 987995456;
                C0f9.A0C(i, A05);
                return;
            case 61:
                A054 = C0f9.A05(-566117658);
                N76 n76 = (N76) this.A01;
                C6WQ A0i = AbstractC31174DnI.A0i(n76.requireContext());
                MSX.A0w(n76.requireContext(), A0i, 2131971286);
                C0fJ.A00(A0i);
                n76.A00 = A0i;
                AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(n76.A0J);
                AbstractC31176DnK.A1Z(A0Z, AbstractC141776au.A00(A0Z), 34);
                i4 = -489087791;
                C0f9.A0C(i4, A054);
                return;
            case 62:
                A052 = C0f9.A05(48507391);
                N76 n762 = (N76) this.A01;
                C51002Mg9 c51002Mg93 = (C51002Mg9) n762.A0J.getValue();
                int A013 = AbstractC167027dH.A01(n762.A08);
                C191138dB c191138dB = c51002Mg93.A01;
                C0UO c0uo = c51002Mg93.A09;
                C54721OEy c54721OEy2 = (C54721OEy) ((C51755Mte) c0uo.getValue()).A00;
                if (c54721OEy2 != null) {
                    str7 = c54721OEy2.A01.A38();
                } else {
                    str7 = null;
                }
                C191138dB.A00(EnumC53366NjH.SAVE, c191138dB, str7);
                C54721OEy c54721OEy3 = (C54721OEy) ((C51755Mte) c0uo.getValue()).A00;
                if (c54721OEy3 != null) {
                    AbstractC166987dD.A1Z(new C50530MSj(c51002Mg93, c54721OEy3.A01, null, A013, 20), AbstractC141776au.A00(c51002Mg93));
                }
                i2 = -1882502017;
                C0f9.A0C(i2, A052);
                return;
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                A054 = C0f9.A05(-1622655322);
                ((C8HC) ((C55087Oak) this.A01).A08.A0F.getValue()).A07();
                i4 = -422928092;
                C0f9.A0C(i4, A054);
                return;
            case 64:
                A054 = C0f9.A05(-559357574);
                C55087Oak c55087Oak = (C55087Oak) this.A01;
                AbstractC59962oe abstractC59962oe = c55087Oak.A02;
                AbstractC31173DnH.A0Z(abstractC59962oe.getActivity(), new Bundle(0), c55087Oak.A03, TransparentModalActivity.class, AbstractC111324zv.A00(2944)).A0C(abstractC59962oe.getContext());
                i4 = -542446828;
                C0f9.A0C(i4, A054);
                return;
            case 65:
                A054 = C0f9.A05(-53559067);
                ((C8HC) ((C55087Oak) this.A01).A08.A0F.getValue()).A07();
                i4 = -2080268852;
                C0f9.A0C(i4, A054);
                return;
            case 66:
                A054 = C0f9.A05(-140365478);
                C55087Oak c55087Oak2 = (C55087Oak) this.A01;
                AbstractC59962oe abstractC59962oe2 = c55087Oak2.A02;
                AbstractC31173DnH.A0Z(abstractC59962oe2.getActivity(), new Bundle(0), c55087Oak2.A03, TransparentModalActivity.class, AbstractC111324zv.A00(2944)).A0C(abstractC59962oe2.getContext());
                i4 = -881167692;
                C0f9.A0C(i4, A054);
                return;
            case 67:
                A05 = C0f9.A05(-1544925966);
                C148456mF A008 = C148446mE.A00((C148446mE) this.A01);
                CharSequence charSequence = ((C145006gL) A008.A0D.getValue()).A08;
                if (AbstractC25225BEi.A1Y(charSequence) && charSequence != null && (obj = charSequence.toString()) != null && (c38321qM = A008.A00) != null) {
                    AbstractC166987dD.A1Z(new PZQ(c38321qM, A008, obj, null, 15), (C19L) A008.A0B.getValue());
                }
                i = 1109450949;
                C0f9.A0C(i, A05);
                return;
            case 68:
                A05 = C0f9.A05(1553612103);
                C148456mF A009 = C148446mE.A00((C148446mE) this.A01);
                C05A c05a = A009.A0D;
                if (((C145006gL) c05a.getValue()).A0O) {
                    C148456mF.A01(C56522P7u.A00, A009);
                    C148456mF.A04(A009, false);
                    C148456mF.A01(C56526P7y.A00, A009);
                    ((C141806ax) A009.A0A.getValue()).A01();
                } else if (((C145006gL) c05a.getValue()).A0N) {
                    A009.A07();
                }
                i = 964280925;
                C0f9.A0C(i, A05);
                return;
            case 69:
                A054 = C0f9.A05(170840220);
                ((C148456mF) ((C148476mH) this.A01).A02.getValue()).A06();
                i4 = 1407256444;
                C0f9.A0C(i4, A054);
                return;
            case 70:
                A054 = C0f9.A05(-329446150);
                ((C148456mF) ((C148476mH) this.A01).A02.getValue()).A06();
                i4 = -1755463725;
                C0f9.A0C(i4, A054);
                return;
            default:
                return;
        }
    }

    public ViewOnClickListenerC55456OkA(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
