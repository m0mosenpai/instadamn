package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate;
import com.instagram.direct.model.DirectThreadThemeInfo;
import com.instagram.ui.emptystaterow.EmptyStateView;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class KDM extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "DirectThreadColorPickerFragment";
    public int A00;
    public int A01;
    public C18920wW A02;
    public C66362zD A03;
    public L3P A04;
    public InterfaceC50421MOb A05;
    public L1O A06;
    public ThemeViewModelDelegate A07;
    public C3o9 A08;
    public String A0A;
    public String A0B;
    public Map A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public RecyclerView A0H;
    public C61972ry A0I;
    public EmptyStateView A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public Integer A09 = C05F.A01;
    public final ArrayList A0O = AbstractC166987dD.A1E();
    public final ArrayList A0N = AbstractC166987dD.A1E();
    public final InterfaceC09390do A0P = C1XM.A00(new C50165MDs(this, 7));
    public final C47355Kw4 A0S = new C47355Kw4(this);
    public final C47354Kw3 A0R = new C47354Kw3(this);
    public final InterfaceC09390do A0Q = AbstractC60492pY.A02(this);

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_thread_color_picker_fragment";
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.2zJ, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KDM.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if ("2694600510862302".equals(r0.A09) != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C48315LZo A01(com.instagram.direct.model.DirectThreadThemeInfo r6) {
        /*
            r5 = this;
            java.lang.String r4 = r6.A0o
            java.lang.String r2 = r6.A0f
            if (r2 != 0) goto L10
            android.content.Context r1 = r5.requireContext()
            int r0 = r6.A00
            java.lang.String r2 = X.AbstractC166997dE.A0p(r1, r0)
        L10:
            java.lang.String r3 = r6.A0o
            com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate r0 = r5.A07
            java.lang.String r1 = "currentTheme"
            if (r0 == 0) goto L85
            java.lang.String r0 = r0.A09
            boolean r0 = X.C14360o3.A0K(r3, r0)
            if (r0 != 0) goto L36
            java.lang.String r0 = "1652456634878319"
            boolean r0 = X.C14360o3.A0K(r3, r0)
            if (r0 == 0) goto L83
            com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate r0 = r5.A07
            if (r0 == 0) goto L85
            java.lang.String r1 = r0.A09
            java.lang.String r0 = "2694600510862302"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L83
        L36:
            r0 = 1
        L37:
            X.LZo r3 = new X.LZo
            r3.<init>(r4, r2, r0)
            boolean r2 = r5.A0G
            if (r2 == 0) goto L7e
            int r1 = r6.A03
            java.lang.String r0 = r6.A0j
        L44:
            if (r1 == 0) goto L63
            r3.A01 = r1
        L48:
            java.lang.String r1 = r6.A0k
            if (r1 == 0) goto L52
            int r0 = r1.length()
            if (r0 != 0) goto L60
        L52:
            int r0 = r6.A04
            if (r0 == 0) goto L62
            android.content.Context r1 = r5.requireContext()
            int r0 = r6.A04
            java.lang.String r1 = r1.getString(r0)
        L60:
            r3.A05 = r1
        L62:
            return r3
        L63:
            if (r0 == 0) goto L68
            r3.A04 = r0
            goto L48
        L68:
            int[] r0 = X.C7IG.A07(r6, r2)
            r3.A06 = r0
            boolean r0 = r5.A0G
            if (r0 == 0) goto L79
            int r0 = r6.A01()
        L76:
            r3.A00 = r0
            goto L48
        L79:
            int r0 = r6.A02()
            goto L76
        L7e:
            int r1 = r6.A07
            java.lang.String r0 = r6.A0n
            goto L44
        L83:
            r0 = 0
            goto L37
        L85:
            X.C14360o3.A0F(r1)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KDM.A01(com.instagram.direct.model.DirectThreadThemeInfo):X.LZo");
    }

    public static final Integer A02(KDM kdm, String str) {
        if ("3259963564026002".equals(str)) {
            return C05F.A0N;
        }
        if ("ai_theme_creation_dummy_theme_id".equals(str)) {
            return C05F.A0C;
        }
        ArrayList arrayList = kdm.A0O;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (C14360o3.A0K(((DirectThreadThemeInfo) it.next()).A0o, str)) {
                    return C05F.A00;
                }
            }
        }
        ArrayList arrayList2 = kdm.A0N;
        if ((arrayList2 instanceof Collection) && arrayList2.isEmpty()) {
            return null;
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            if (C14360o3.A0K(((DirectThreadThemeInfo) it2.next()).A0o, str)) {
                return C05F.A01;
            }
        }
        return null;
    }

    public static final void A04(KDM kdm) {
        C25621Ms A0M = AbstractC31177DnL.A0M(AbstractC31178DnM.A0M(kdm.A0Q));
        A0M.A03();
        A0M.A0B("api/v1/direct_v2/selectable_themes/");
        C1ON A0e = AbstractC25227BEk.A0e(A0M, K7w.class, C47829LAp.class);
        C14360o3.A0C(A0e, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.SelectableThemesResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.SelectableThemesResponse>>");
        C44093JeI.A00(A0e, kdm, 13);
        C61972ry c61972ry = kdm.A0I;
        if (c61972ry == null) {
            C14360o3.A0F("loaderScheduler");
            throw C00O.createAndThrow();
        }
        c61972ry.schedule(A0e);
    }

    public static final void A05(KDM kdm) {
        ImmutableMap copyOf;
        Map map = kdm.A0C;
        if (map != null) {
            AbstractC12990ll A0o = AbstractC166987dD.A0o(kdm.A0Q);
            String A04 = C18U.A04(AbstractC25225BEi.A0j(A0o, 0), A0o, 36875721620521036L);
            if (C14360o3.A0K(AbstractC47901LDv.A03, A04)) {
                copyOf = AbstractC47901LDv.A01;
            } else {
                AbstractC47901LDv.A03 = A04;
                ImmutableMap immutableMap = AbstractC125795mU.A00;
                LinkedHashMap A1I = AbstractC166987dD.A1I();
                List A0m = AbstractC167007dF.A0m(A04, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0);
                ArrayList A1E = AbstractC166987dD.A1E();
                for (Object obj : A0m) {
                    if (immutableMap.get(obj) != null) {
                        A1E.add(obj);
                    }
                }
                for (Object obj2 : A1E) {
                    Object obj3 = immutableMap.get(obj2);
                    if (obj3 != null) {
                        A1I.put(obj2, obj3);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
                copyOf = ImmutableMap.copyOf((Map) A1I);
                AbstractC47901LDv.A01 = copyOf;
            }
            map.putAll(copyOf);
            ArrayList arrayList = kdm.A0O;
            arrayList.clear();
            ArrayList arrayList2 = kdm.A0N;
            arrayList2.clear();
            Map map2 = kdm.A0C;
            if (map2 != null) {
                Iterator A16 = AbstractC166997dE.A16(map2);
                while (A16.hasNext()) {
                    DirectThreadThemeInfo directThreadThemeInfo = (DirectThreadThemeInfo) A16.next();
                    if (directThreadThemeInfo.A09 == C05F.A00) {
                        arrayList2.add(directThreadThemeInfo);
                    } else {
                        arrayList.add(directThreadThemeInfo);
                    }
                }
                C66362zD c66362zD = kdm.A03;
                if (c66362zD != null) {
                    c66362zD.A05(A00(kdm));
                    return;
                }
                return;
            }
        }
        C14360o3.A0F("themesMap");
        throw C00O.createAndThrow();
    }

    public static final void A06(KDM kdm, DirectThreadThemeInfo directThreadThemeInfo, boolean z) {
        C8e c8e;
        String str;
        String str2;
        InterfaceC50421MOb interfaceC50421MOb = kdm.A05;
        if (interfaceC50421MOb != null) {
            interfaceC50421MOb.D5x(directThreadThemeInfo);
        }
        C3o9 c3o9 = kdm.A08;
        if (kdm.A0E) {
            Context requireContext = kdm.requireContext();
            UserSession A0r = AbstractC166987dD.A0r(kdm.A0Q);
            String str3 = directThreadThemeInfo.A0o;
            String str4 = kdm.A0A;
            C50364MLq c50364MLq = new C50364MLq(9, directThreadThemeInfo, requireContext, kdm);
            boolean A1R = AbstractC167007dF.A1R(0, A0r, str3);
            C2JM A0b = AbstractC25225BEi.A0b();
            C2JM A0b2 = AbstractC25225BEi.A0b();
            A0b.A04("theme_id", str3);
            if (str4 == null) {
                str4 = "UNKNOWN";
            }
            A0b.A04("surface", str4);
            C48146LSv.A00(new C58510Pwe(c50364MLq, 14), new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "NMEIGBrandedThreadsConfigMutation", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59451Qem.class, A1R, null, 0, null, "ig_nme_branded_chat_thread_config_mutation", AbstractC166987dD.A1E()), AbstractC40691uc.A01(A0r), c50364MLq, 23);
        }
        if (c3o9 != null) {
            InterfaceC09390do interfaceC09390do = kdm.A0Q;
            AbstractC31278Dp0.A0E(AbstractC166987dD.A0r(interfaceC09390do), c3o9, directThreadThemeInfo.A0o, kdm.A0K);
            String str5 = directThreadThemeInfo.A0o;
            C3o9 c3o92 = kdm.A08;
            if (c3o92 != null && JRE.A06(c3o92) != null) {
                C18920wW c18920wW = kdm.A02;
                if (c18920wW == null) {
                    str2 = "typedLogger";
                } else {
                    ThemeViewModelDelegate themeViewModelDelegate = kdm.A07;
                    if (themeViewModelDelegate == null) {
                        str2 = "currentTheme";
                    } else {
                        String str6 = themeViewModelDelegate.A09;
                        String str7 = kdm.A0B;
                        if (str7 == null) {
                            str2 = "entryPoint";
                        } else {
                            Integer num = kdm.A09;
                            Integer A02 = A02(kdm, str5);
                            if (A02 == null) {
                                A02 = C05F.A0Y;
                            }
                            AbstractC25229BEm.A1I(str5, 2, num);
                            if (z) {
                                c8e = C8e.THEME_PICKER;
                            } else {
                                c8e = C8e.THEME_PREVIEW;
                            }
                            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "direct_thread_change_theme");
                            A0f.AAP("new_theme_id", str5);
                            AbstractC31171DnF.A1F(A0f, JRE.A06(c3o92));
                            A0f.AAP("old_theme_id", str6);
                            AbstractC31175DnJ.A1A(A0f, JRE.A09(c3o92));
                            AbstractC31171DnF.A1H(A0f, str5);
                            A0f.A9K("occamadillo_thread_id", AbstractC43827JZq.A00(c3o92));
                            A0f.A8R(LH5.A00(str7), ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                            A0f.A8R(c8e, "minor_entry_point");
                            LH5.A01(A0f, A02, num);
                            if (kdm.A01 == 29 && JRE.A02(c3o92) != null) {
                                String str8 = JRE.A01(c3o92).A01;
                                C142846ck A0V = AbstractC31176DnK.A0V(interfaceC09390do);
                                int i = kdm.A00;
                                C3o9 c3o93 = kdm.A08;
                                if (c3o93 != null) {
                                    str = JRE.A06(c3o93);
                                } else {
                                    str = null;
                                }
                                C25531Mh A0I = AbstractC31172DnG.A0I(A0V);
                                if (AbstractC25226BEj.A1Z(A0I)) {
                                    AbstractC31175DnJ.A1B(A0I, A0V);
                                    AbstractC31174DnI.A1I(A0I, "thread_update_theme");
                                    A0I.A0o("theme_selector");
                                    A0I.A0h(AbstractC31179DnN.A0a(A0I, "thread_details", str, str8, i));
                                    A0I.Cht();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            }
        }
    }

    public static final void A07(KDM kdm, EnumC153216up enumC153216up) {
        int i;
        EmptyStateView emptyStateView = kdm.A0J;
        if (emptyStateView == null) {
            C14360o3.A0F("emptyStateView");
            throw C00O.createAndThrow();
        }
        emptyStateView.A0P(enumC153216up);
        if (enumC153216up.ordinal() == 4) {
            i = 8;
        } else {
            Object obj = emptyStateView.A01.get(enumC153216up);
            obj.getClass();
            ((C1571273r) obj).A0H = true;
            emptyStateView.A0I();
            i = 0;
        }
        emptyStateView.setVisibility(i);
    }

    public static final void A08(KDM kdm, boolean z) {
        RecyclerView recyclerView;
        int i;
        if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(kdm.A0Q), 36314558373169856L)) {
            if (z) {
                A07(kdm, EnumC153216up.A06);
                recyclerView = kdm.A0H;
                if (recyclerView != null) {
                    i = 8;
                    recyclerView.setVisibility(i);
                    return;
                }
                C14360o3.A0F("recyclerView");
                throw C00O.createAndThrow();
            }
            A07(kdm, EnumC153216up.A05);
            recyclerView = kdm.A0H;
            if (recyclerView != null) {
                i = 0;
                recyclerView.setVisibility(i);
                return;
            }
            C14360o3.A0F("recyclerView");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0Q);
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A0H;
        if (recyclerView != null) {
            if (recyclerView.getChildCount() != 0) {
                RecyclerView recyclerView2 = this.A0H;
                if (recyclerView2 != null) {
                    if (recyclerView2.computeVerticalScrollOffset() != 0) {
                        return false;
                    }
                }
            }
            return true;
        }
        C14360o3.A0F("recyclerView");
        throw C00O.createAndThrow();
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0104  */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.LZ3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.LZ3, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.instagram.common.recyclerview.ViewModelListUpdate A00(X.KDM r7) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KDM.A00(X.KDM):com.instagram.common.recyclerview.ViewModelListUpdate");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r2 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r2.length() != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        r2 = r7.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        if (r6 > 240) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r2 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        if (r2 != null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A03(X.C45069Jwy r7, X.KDM r8) {
        /*
            android.content.res.Resources r0 = X.AbstractC166997dE.A0N(r8)
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r6 = r0.densityDpi
            r4 = 240(0xf0, float:3.36E-43)
            r3 = 320(0x140, float:4.48E-43)
            r5 = 0
            if (r6 <= r3) goto L44
            X.Jxs r2 = r7.A01
            if (r2 == 0) goto L7d
            java.lang.String r1 = r2.A05
            if (r1 == 0) goto L7d
            int r0 = r1.length()
            if (r0 != 0) goto L21
            java.lang.String r1 = r7.A03
        L21:
            if (r2 == 0) goto L30
            java.lang.String r2 = r2.A03
            if (r2 == 0) goto L30
        L27:
            int r0 = r2.length()
            if (r0 != 0) goto L2f
            java.lang.String r2 = r7.A03
        L2f:
            r5 = r2
        L30:
            X.0do r0 = r8.A0Q
            X.0ll r4 = X.AbstractC166987dD.A0o(r0)
            X.0Tz r0 = X.C06090Tz.A05
            r2 = 36324157625806781(0x810ca1000d2fbd, double:3.0348817759783146E-306)
            boolean r0 = X.C18U.A06(r0, r4, r2)
            if (r0 == 0) goto L83
            return r5
        L44:
            if (r6 <= r4) goto L5d
            X.Jxs r2 = r7.A01
            if (r2 == 0) goto L7d
            java.lang.String r1 = r2.A03
            if (r1 == 0) goto L7d
            int r0 = r1.length()
            if (r0 != 0) goto L56
            java.lang.String r1 = r7.A03
        L56:
            if (r2 == 0) goto L30
            java.lang.String r2 = r2.A04
            if (r2 == 0) goto L30
            goto L27
        L5d:
            r0 = 160(0xa0, float:2.24E-43)
            X.Jxs r2 = r7.A01
            if (r6 <= r0) goto L78
            if (r2 == 0) goto L7d
            java.lang.String r1 = r2.A04
        L67:
            if (r1 == 0) goto L7d
            int r0 = r1.length()
            if (r0 != 0) goto L71
            java.lang.String r1 = r7.A03
        L71:
            if (r2 == 0) goto L30
            java.lang.String r2 = r2.A02
            if (r2 == 0) goto L30
            goto L27
        L78:
            if (r2 == 0) goto L7d
            java.lang.String r1 = r2.A02
            goto L67
        L7d:
            r1 = r5
            if (r6 > r3) goto L21
            if (r6 <= r4) goto L71
            goto L56
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KDM.A03(X.Jwy, X.KDM):java.lang.String");
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            if (i2 == -1) {
                AbstractC25233BEq.A14(this);
                return;
            }
            return;
        }
        L3P l3p = this.A04;
        if (l3p == null || i != 1 || intent == null) {
            return;
        }
        android.net.Uri data = intent.getData();
        if (data != null) {
            C0fJ.A00(l3p.A04);
            try {
                InputStream openInputStream = l3p.A00.getContentResolver().openInputStream(data);
                if (openInputStream == null) {
                    return;
                }
                C121275eQ c121275eQ = new C121275eQ(new CallableC43825JZn(6, openInputStream, l3p), 457);
                C43922JbX.A01(c121275eQ, l3p, 11);
                C1GJ.A06(c121275eQ, 457, 2, false, false);
                return;
            } catch (FileNotFoundException unused) {
                C9GR.A01(l3p.A00, "disk_error", 2131963183, 0);
                return;
            }
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ca, code lost:
    
        if (X.JRE.A09(r0) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00dd, code lost:
    
        if (X.C18U.A06(r5, X.AbstractC166987dD.A0o(r6), 36324157625544636L) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f0, code lost:
    
        if (X.C18U.A06(r5, X.AbstractC166987dD.A0o(r6), 36324157625282491L) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0097, code lost:
    
        if (r7.A01 != 29) goto L6;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            r0 = -287269809(0xffffffffeee09c4f, float:-3.4756804E28)
            int r3 = X.C0f9.A02(r0)
            super.onCreate(r8)
            android.os.Bundle r2 = r7.requireArguments()
            X.0do r6 = r7.A0Q
            X.0ll r0 = X.AbstractC166987dD.A0o(r6)
            X.0wW r0 = X.AbstractC12220kQ.A01(r7, r0)
            r7.A02 = r0
            com.instagram.common.session.UserSession r4 = X.AbstractC166987dD.A0r(r6)
            X.Kw4 r1 = r7.A0S
            X.L1O r0 = new X.L1O
            r0.<init>(r4, r1)
            r7.A06 = r0
            java.lang.Class<com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate> r1 = com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate.class
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CURRENT_THEME"
            android.os.Parcelable r0 = X.AbstractC153636vY.A00(r2, r1, r0)
            com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate r0 = (com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate) r0
            r7.A07 = r0
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_KEY"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            X.3o9 r0 = (X.C3o9) r0
            r7.A08 = r0
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_SUBTYPE"
            int r0 = r2.getInt(r0)
            r7.A01 = r0
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_AUDIENCE_TYPE"
            int r0 = r2.getInt(r0)
            r7.A00 = r0
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_IN_SHH_MODE"
            boolean r0 = r2.getBoolean(r0)
            r7.A0K = r0
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_IS_INSTAMADILLO_CUTOVER"
            boolean r0 = r2.getBoolean(r0)
            r7.A0M = r0
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_IS_IN_ACCOUNT_THEME_PICKER_MODE"
            r4 = 0
            boolean r0 = r2.getBoolean(r0, r4)
            r7.A0E = r0
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_ACCOUNT_THEME_PICKER_ENTRYPOINT"
            java.lang.String r0 = r2.getString(r0)
            r7.A0A = r0
            java.lang.String r1 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THEME_PICKER_ENTRYPOINT"
            java.lang.String r0 = "undefined"
            java.lang.String r0 = r2.getString(r1, r0)
            r7.A0B = r0
            X.0ch r5 = X.AbstractC018607g.A00(r7)
            android.content.Context r2 = r7.requireContext()
            r1 = 0
            X.2ry r0 = new X.2ry
            r0.<init>(r2, r5, r1)
            r7.A0I = r0
            java.util.LinkedHashMap r0 = X.AbstractC166987dD.A1I()
            r7.A0C = r0
            boolean r0 = r7.A0E
            if (r0 != 0) goto L99
            int r2 = r7.A01
            r1 = 29
            r0 = 1
            if (r2 == r1) goto L9a
        L99:
            r0 = 0
        L9a:
            r7.A0L = r0
            if (r0 == 0) goto Lad
            com.instagram.common.session.UserSession r2 = X.AbstractC166987dD.A0r(r6)
            android.content.Context r1 = r7.requireContext()
            X.L3P r0 = new X.L3P
            r0.<init>(r1, r7, r2, r7)
            r7.A04 = r0
        Lad:
            boolean r0 = r7.A0E
            if (r0 != 0) goto Lf2
            X.0ll r2 = X.AbstractC166987dD.A0o(r6)
            X.0Tz r5 = X.C06090Tz.A05
            r0 = 36324157624954809(0x810ca100002fb9, double:3.034881775439524E-306)
            boolean r0 = X.C18U.A06(r5, r2, r0)
            if (r0 == 0) goto Lf3
            X.3o9 r0 = r7.A08
            if (r0 == 0) goto Lcc
            boolean r0 = X.JRE.A09(r0)
            if (r0 != 0) goto Lf3
        Lcc:
            boolean r0 = r7.A0M
            if (r0 == 0) goto Ldf
            X.0ll r2 = X.AbstractC166987dD.A0o(r6)
            r0 = 36324157625544636(0x810ca100092fbc, double:3.034881775812533E-306)
            boolean r0 = X.C18U.A06(r5, r2, r0)
            if (r0 == 0) goto Lf3
        Ldf:
            boolean r0 = r7.A0L
            if (r0 == 0) goto Lf2
            X.0ll r2 = X.AbstractC166987dD.A0o(r6)
            r0 = 36324157625282491(0x810ca100052fbb, double:3.0348817756467515E-306)
            boolean r0 = X.C18U.A06(r5, r2, r0)
            if (r0 == 0) goto Lf3
        Lf2:
            r4 = 1
        Lf3:
            r7.A0F = r4
            r0 = -1133207722(0xffffffffbc749f56, float:-0.014930567)
            X.C0f9.A09(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KDM.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1638442500);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_thread_color_picker_fragment, false);
        C0f9.A09(1832979248, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1554681381);
        super.onDestroyView();
        this.A03 = null;
        L1O l1o = this.A06;
        if (l1o == null) {
            C14360o3.A0F("themeVariantsMsysController");
            throw C00O.createAndThrow();
        }
        l1o.A00.A01();
        C0f9.A09(1383609417, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(668480186);
        RecyclerView recyclerView = this.A0H;
        if (recyclerView == null) {
            C14360o3.A0F("recyclerView");
            throw C00O.createAndThrow();
        }
        recyclerView.requestFocus();
        super.onResume();
        C0f9.A09(824277915, A02);
    }
}
