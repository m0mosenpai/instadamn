package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.8GH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8GH implements C82M {
    public C8GJ A00;
    public boolean A01;
    public java.util.Set A02;
    public final C1810981l A03;
    public final C8GZ A04;
    public final C8A0 A05;
    public final InterfaceC1810081c A06;
    public final java.util.Set A07;
    public final java.util.Set A08;
    public final java.util.Set A09;
    public final java.util.Set A0A;
    public final UserSession A0B;
    public final ClipsCreationViewModel A0C;
    public final Map A0D;
    public final Map A0E;
    public volatile boolean A0F;

    public C8GH(ViewGroup viewGroup, UserSession userSession, C1810981l c1810981l, C8A0 c8a0, InterfaceC1810081c interfaceC1810081c, ClipsCreationViewModel clipsCreationViewModel, boolean z) {
        double d;
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(viewGroup, 2);
        C14360o3.A0B(c1810981l, 4);
        C14360o3.A0B(interfaceC1810081c, 5);
        C14360o3.A0B(c8a0, 6);
        C14360o3.A0B(clipsCreationViewModel, 7);
        this.A0B = userSession;
        this.A03 = c1810981l;
        this.A06 = interfaceC1810081c;
        this.A05 = c8a0;
        this.A0C = clipsCreationViewModel;
        this.A0A = new LinkedHashSet();
        this.A09 = new LinkedHashSet();
        this.A07 = new LinkedHashSet();
        this.A08 = new LinkedHashSet();
        this.A0D = new EnumMap(C81W.class);
        this.A0E = new EnumMap(C81W.class);
        this.A02 = C16910sj.A00;
        if (z) {
            interfaceC1810081c.A82(new InterfaceC1810781j() { // from class: X.8GI
                @Override // X.InterfaceC1810781j
                public final /* bridge */ /* synthetic */ void DoV(Object obj, Object obj2, Object obj3) {
                    C8GJ c8gj;
                    C8GR c8gr;
                    C8GH c8gh = C8GH.this;
                    if (c8gh.A06.Cap() && !c8gh.A01 && (c8gj = c8gh.A00) != null && (c8gr = (C8GR) c8gj.A0D.get(c8gj.A03)) != null) {
                        c8gr.A06();
                    }
                }
            });
            Context context = viewGroup.getContext();
            C14360o3.A07(context);
            boolean A1z = AbstractC23021Ah.A00(userSession).A1z();
            C8GJ c8gj = new C8GJ(context);
            c8gj.A04 = this;
            c8gj.A02 = userSession;
            C55982hj c55982hj = c8gj.A0B;
            if (A1z) {
                d = 1.0d;
            } else {
                d = 0.0d;
            }
            c55982hj.A08(d, true);
            this.A00 = c8gj;
            ((ViewGroup) viewGroup.findViewById(R.id.layout_camera_tool_menu_container)).addView(this.A00);
            C8GQ c8gq = new C8GQ(this);
            c1810981l.A0G.add(c8gq);
            c1810981l.A07.A00(c8gq);
            A01(this, (java.util.Set) this.A03.A07.A00);
            c1810981l.A0I(new AnonymousClass822() { // from class: X.8GY
                @Override // X.AnonymousClass822
                public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                    java.util.Set set = (java.util.Set) obj;
                    C14360o3.A0B(set, 0);
                    C8GH.A00(C8GH.this, set);
                }
            });
            A00(this, (java.util.Set) c1810981l.A09.A00);
            C8GJ c8gj2 = this.A00;
            if (c8gj2 != null) {
                c8gj2.setVisibility(8);
            }
            C8GJ c8gj3 = this.A00;
            if (c8gj3 != null) {
                c8gj3.A06(0, 0, 0.0f);
            }
        }
        this.A04 = new C8GZ(this);
    }

    public final void A07(C81W c81w, QPTooltipAnchor qPTooltipAnchor, C64842wi c64842wi, C64742wY c64742wY) {
        C14360o3.A0B(c64742wY, 1);
        C8GJ c8gj = this.A00;
        if (c8gj == null) {
            AbstractC12120kG.A00("CameraToolMenuController", "Attempt to register QP tooltip with menu disabled");
            return;
        }
        View A05 = c8gj.A05(c81w);
        if (A05 == null) {
            return;
        }
        c64742wY.A00(A05, qPTooltipAnchor, c64842wi);
    }

    public final void A08(C81W c81w, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(c81w, 0);
        A02(new C171507kg(interfaceC16660sJ), c81w);
    }

    @Override // X.C82M
    public final /* synthetic */ void A7T(Parcelable parcelable) {
    }

    public static final void A00(C8GH c8gh, java.util.Set set) {
        C8GJ c8gj = c8gh.A00;
        if (c8gj != null) {
            C14360o3.A0B(set, 0);
            C8GR c8gr = (C8GR) c8gj.A0D.get(c8gj.A03);
            if (c8gj.A06 != null) {
                if (c8gr == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("adapter is null when trying to update camera tools for destination: ");
                    sb.append(c8gj.A03);
                    AbstractC12120kG.A00("CameraToolMenu", sb.toString());
                    return;
                }
                c8gr.A09(set);
            }
        }
    }

    public static final void A01(final C8GH c8gh, java.util.Set set) {
        if (!C14360o3.A0K(set, c8gh.A02)) {
            c8gh.A02 = set;
            LinkedHashMap linkedHashMap = new LinkedHashMap(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C55U c55u = (C55U) it.next();
                linkedHashMap.put(c55u, c8gh.A03.A09(c55u));
            }
            C8GJ c8gj = c8gh.A00;
            if (c8gj != null) {
                c8gj.setCameraToolPairings(linkedHashMap, (C55U) c8gh.A03.A08.A00);
            }
            C1810981l c1810981l = c8gh.A03;
            c1810981l.A0H.add(new AnonymousClass822() { // from class: X.7m8
                @Override // X.AnonymousClass822
                public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                    C8GR c8gr;
                    Pair pair = (Pair) obj;
                    C14360o3.A0B(pair, 0);
                    C8GJ c8gj2 = C8GH.this.A00;
                    if (c8gj2 != null && (c8gr = (C8GR) c8gj2.A0D.get(pair.first)) != null) {
                        Object obj2 = pair.second;
                        C14360o3.A06(obj2);
                        c8gr.A08((C1811881u) obj2);
                    }
                }
            });
        }
    }

    public final void A02(AnonymousClass822 anonymousClass822, C81W c81w) {
        Map map = this.A0D;
        if (!map.containsKey(c81w)) {
            map.put(c81w, new HashSet());
        }
        java.util.Set set = (java.util.Set) map.get(c81w);
        if (set != null) {
            set.add(anonymousClass822);
        }
    }

    public final void A03(AnonymousClass822 anonymousClass822, C81W c81w) {
        Map map = this.A0E;
        if (!map.containsKey(c81w)) {
            map.put(c81w, anonymousClass822);
        } else {
            AbstractC12120kG.A00("CameraToolMenuController", "Only one UI delegate can exist for each tool");
        }
    }

    public final void A04(C55U c55u, C81W c81w, String str) {
        C8GJ c8gj = this.A00;
        if (c8gj != null) {
            LinkedHashMap linkedHashMap = c8gj.A0D;
            linkedHashMap.values();
            C8GR c8gr = (C8GR) linkedHashMap.get(c55u);
            if (c8gr == null) {
                AbstractC12120kG.A00("CameraToolMenu", "no adapter available for given destination");
                return;
            }
            for (Map.Entry entry : c8gr.A0I.entrySet()) {
                Object key = entry.getKey();
                View view = (View) entry.getValue();
                if (key == c81w && view != null) {
                    view.setContentDescription(str);
                }
            }
        }
    }

    public final void A05(C55U c55u, C81W c81w, String str) {
        C8GJ c8gj = this.A00;
        if (c8gj != null) {
            LinkedHashMap linkedHashMap = c8gj.A0D;
            linkedHashMap.values();
            C8GR c8gr = (C8GR) linkedHashMap.get(c55u);
            if (c8gr == null) {
                AbstractC12120kG.A00("CameraToolMenu", "no adapter available for given destination");
                return;
            }
            for (Map.Entry entry : c8gr.A0I.entrySet()) {
                Object key = entry.getKey();
                CameraToolMenuItem cameraToolMenuItem = (CameraToolMenuItem) entry.getValue();
                if (key == c81w && cameraToolMenuItem != null) {
                    cameraToolMenuItem.A08 = str;
                    cameraToolMenuItem.A01 = cameraToolMenuItem.A0M.measureText(String.valueOf(str));
                    cameraToolMenuItem.invalidate();
                }
            }
        }
    }

    public final void A06(C81W c81w, CameraToolMenuItem cameraToolMenuItem) {
        AnonymousClass822 anonymousClass822;
        String str;
        boolean A05 = C8GX.A05(c81w);
        if (A05) {
            C1810981l c1810981l = this.A03;
            if (c1810981l.A0W(c81w)) {
                if (C8GX.A04(c81w) != null) {
                    UserSession userSession = this.A0B;
                    Integer A04 = C8GX.A04(c81w);
                    C22C A01 = AnonymousClass229.A01(userSession);
                    int A012 = AbstractC449424y.A01(A04);
                    C448724r c448724r = A01.A0F;
                    C18920wW c18920wW = c448724r.A01;
                    InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
                    if (A00.isSampled()) {
                        A00.A8R(C81X.A24, "tool_type");
                        A00.AAP("legacy_falco_event_name", "IG_CAMERA_SELECT_FORMAT_TOGGLE");
                        C22M c22m = c448724r.A04;
                        String str2 = c22m.A0L;
                        if (str2 == null) {
                            str2 = "";
                        }
                        A00.AAP("camera_session_id", str2);
                        int i = 2;
                        if (c22m.A01 != 2) {
                            i = 1;
                        }
                        A00.A8p("camera_position", Integer.valueOf(i));
                        A00.A9K("capture_format_index", Long.valueOf(A012));
                        A00.A8R(c448724r.A0I(), "capture_type");
                        A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                        A00.A8p("event_type", 2);
                        A00.A8R(c22m.A0A, "media_type");
                        A00.AAP("module", C22F.A08.getModuleName());
                        A00.A8R(EnumC50631MWs.A0J, "surface");
                        A00.AAP("nav_chain", C1QM.A00.A02.A00);
                        A00.Cht();
                    }
                }
            } else {
                UserSession userSession2 = this.A0B;
                C1811081m c1811081m = c1810981l.A0B;
                C1811981v c1811981v = c1810981l.A08;
                C55U c55u = (C55U) c1811981v.A00;
                C81O c81o = c1810981l.A01;
                if (c81o == null) {
                    str = "cameraConfigurationSetup";
                } else {
                    Map map = c1810981l.A0F;
                    C22P c22p = c1810981l.A00;
                    if (c22p == null) {
                        str = "entryPoint";
                    } else {
                        Iterator it = c1811081m.A00(c22p, c81o, c55u, map).A00().iterator();
                        int i2 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                int i3 = i2 + 1;
                                if (c81w == it.next()) {
                                    break;
                                } else {
                                    i2 = i3;
                                }
                            } else {
                                i2 = -1;
                                break;
                            }
                        }
                        int size = ClipsCreationViewModel.A00(this.A0C).A01.size();
                        C55U c55u2 = (C55U) c1811981v.A00;
                        EnumC203578zI enumC203578zI = EnumC203578zI.CAMERA_TOOL;
                        C14360o3.A0B(c55u2, 4);
                        C22C A013 = AnonymousClass229.A01(userSession2);
                        EnumC114925Hg enumC114925Hg = c55u2.A00;
                        List singletonList = Collections.singletonList(enumC203578zI);
                        C14360o3.A07(singletonList);
                        A013.A0F.A0S(enumC114925Hg, enumC203578zI, c81w, singletonList, i2, size);
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        }
        Iterator it2 = this.A0A.iterator();
        while (it2.hasNext()) {
            ((InterfaceC16820sZ) it2.next()).invoke();
        }
        Map map2 = this.A0D;
        if (map2.containsKey(c81w)) {
            java.util.Set set = (java.util.Set) map2.get(c81w);
            if (set != null) {
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    ((AnonymousClass822) it3.next()).onChanged(cameraToolMenuItem);
                }
                return;
            }
            return;
        }
        if (A05 && C81W.A0g != c81w) {
            this.A03.A0M(c81w);
        }
        Map map3 = this.A0E;
        if (map3.containsKey(c81w) && (anonymousClass822 = (AnonymousClass822) map3.get(c81w)) != null) {
            anonymousClass822.onChanged(cameraToolMenuItem);
        }
    }

    public final boolean A09(Drawable drawable, C55U c55u, C81W c81w) {
        C8GJ c8gj = this.A00;
        if (c8gj != null) {
            LinkedHashMap linkedHashMap = c8gj.A0D;
            linkedHashMap.values();
            C8GR c8gr = (C8GR) linkedHashMap.get(c55u);
            if (c8gr == null) {
                AbstractC12120kG.A00("CameraToolMenu", "no adapter available for given destination");
            } else {
                for (Map.Entry entry : c8gr.A0I.entrySet()) {
                    Object key = entry.getKey();
                    CameraToolMenuItem cameraToolMenuItem = (CameraToolMenuItem) entry.getValue();
                    if (key == c81w) {
                        if (cameraToolMenuItem == null) {
                            return false;
                        }
                        cameraToolMenuItem.A05 = drawable;
                        cameraToolMenuItem.A06 = null;
                        cameraToolMenuItem.invalidate();
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    @Override // X.C82M
    public final /* synthetic */ Parcelable ANh() {
        return null;
    }
}
