package X;

import android.content.Context;
import android.media.AudioAttributes;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.8GR, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8GR implements C8GS {
    public double A00;
    public float A01;
    public int A02;
    public View A03;
    public ViewGroup A04;
    public ViewGroup A05;
    public C1811881u A06;
    public CameraToolMenuItem A07;
    public boolean A08;
    public boolean A09;
    public final FrameLayout A0A;
    public final C55982hj A0B;
    public final C55982hj A0C;
    public final C55982hj A0D;
    public final UserSession A0E;
    public final C55U A0F;
    public final C8GN A0G;
    public final C172287lx A0H;
    public final LinkedHashMap A0I;
    public final List A0J;
    public final java.util.Set A0K;
    public final C55982hj A0L;
    public final InterfaceC55932he A0M;
    public final C8GJ A0N;
    public final Runnable A0O;
    public final Runnable A0P;
    public final Map A0Q;
    public final Map A0R;

    public C8GR(FrameLayout frameLayout, UserSession userSession, C55U c55u, C8GN c8gn, C8GJ c8gj) {
        C14360o3.A0B(c55u, 4);
        C14360o3.A0B(c8gn, 5);
        this.A0E = userSession;
        this.A0N = c8gj;
        this.A0A = frameLayout;
        this.A0F = c55u;
        this.A0G = c8gn;
        this.A0Q = new HashMap();
        this.A0R = new HashMap();
        this.A0K = new HashSet();
        this.A0I = new LinkedHashMap();
        this.A0J = new ArrayList();
        this.A0P = new Runnable() { // from class: X.7lv
            @Override // java.lang.Runnable
            public final void run() {
                C8GR.this.A05();
            }
        };
        C668630d c668630d = new C668630d() { // from class: X.7lw
            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnm(C55982hj c55982hj) {
                C8GR.this.ECv();
            }
        };
        this.A0M = c668630d;
        this.A0H = new C172287lx(c8gj, userSession, c8gj.getCameraToolMenuDelegate(), this, false);
        this.A0C = C8GO.A00(new C668630d() { // from class: X.7lz
            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnm(C55982hj c55982hj) {
                C8GR c8gr = C8GR.this;
                C55982hj c55982hj2 = c8gr.A0C;
                float f = (float) c55982hj2.A09.A00;
                float f2 = (float) c55982hj2.A01;
                for (CameraToolMenuItem cameraToolMenuItem : c8gr.A0J) {
                    cameraToolMenuItem.A02 = f;
                    if (Float.valueOf(f2).equals(Double.valueOf(1.0d))) {
                        cameraToolMenuItem.A0Q.A04();
                    }
                    CameraToolMenuItem.A02(cameraToolMenuItem);
                }
                c8gr.ECv();
                C8GJ c8gj2 = c8gr.A0G.A00;
                C8GJ.A01(c8gj2);
                C8GJ.A02(c8gj2);
            }
        }, 2.0d, 20.0d);
        this.A0L = C8GO.A00(c668630d, 5.0d, 10.0d);
        this.A0D = C8GO.A00(new C668630d() { // from class: X.7m0
            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnk(C55982hj c55982hj) {
                Double valueOf;
                if (c55982hj != null && (valueOf = Double.valueOf(c55982hj.A01)) != null && valueOf.doubleValue() == 0.0d) {
                    C8GR.this.A0G.A00(false);
                }
            }

            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnm(C55982hj c55982hj) {
                C8GR c8gr = C8GR.this;
                float f = (float) c8gr.A0D.A09.A00;
                for (CameraToolMenuItem cameraToolMenuItem : c8gr.A0J) {
                    if (C14360o3.A0K(cameraToolMenuItem, c8gr.A07) && c8gr.A0C.A01 == 0.0d) {
                        C8GR.A04(c8gr, cameraToolMenuItem, 0.0f);
                    } else {
                        C8GR.A04(c8gr, cameraToolMenuItem, f);
                    }
                }
            }
        }, 2.0d, 20.0d);
        this.A0B = C8GO.A00(new C668630d() { // from class: X.7m1
            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnm(C55982hj c55982hj) {
                C8GR c8gr = C8GR.this;
                C81W c81w = C81W.A0g;
                float f = (float) c8gr.A0B.A09.A00;
                for (Map.Entry entry : c8gr.A0I.entrySet()) {
                    Object key = entry.getKey();
                    CameraToolMenuItem cameraToolMenuItem = (CameraToolMenuItem) entry.getValue();
                    if (key == c81w) {
                        C8GR.A04(c8gr, cameraToolMenuItem, f);
                    }
                }
            }
        }, 2.0d, 20.0d);
        AbstractC13880nE.A0q(frameLayout, new Runnable() { // from class: X.7m2
            @Override // java.lang.Runnable
            public final void run() {
                C8GR.this.ECv();
            }
        });
        this.A0O = new Runnable() { // from class: X.7m3
            @Override // java.lang.Runnable
            public final void run() {
                C8GR.this.A0B.A04();
            }
        };
    }

    public final void A08(C1811881u c1811881u) {
        C14360o3.A0B(c1811881u, 0);
        LinkedHashMap linkedHashMap = this.A0I;
        for (Object obj : linkedHashMap.keySet()) {
            C14360o3.A07(obj);
            C81W c81w = (C81W) obj;
            C14360o3.A0B(c81w, 0);
            if (!c1811881u.A00.containsKey(c81w) && !c1811881u.A03(c81w)) {
                A03(c81w, false);
            } else {
                A03(c81w, true);
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap.clear();
        List list = this.A0J;
        list.clear();
        this.A06 = c1811881u;
        for (C81W c81w2 : c1811881u.A00()) {
            C14360o3.A0B(c81w2, 0);
            switch (c81w2.ordinal()) {
                case 47:
                case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                case 56:
                    break;
                default:
                    Object obj2 = linkedHashMap2.get(c81w2);
                    if (obj2 != null || (obj2 = A02(c81w2)) != null) {
                        linkedHashMap.put(c81w2, obj2);
                        list.add(obj2);
                        break;
                    } else {
                        break;
                    }
                    break;
            }
            C1811881u c1811881u2 = this.A06;
            if (c1811881u2 != null) {
                for (C81W c81w3 : c1811881u2.A01(c81w2)) {
                    C1811881u c1811881u3 = this.A06;
                    if (c1811881u3 != null) {
                        C14360o3.A0B(c81w3, 0);
                        if (c1811881u3.A00.containsKey(c81w3)) {
                        }
                    }
                    Object obj3 = linkedHashMap2.get(c81w3);
                    if (obj3 != null || (obj3 = A02(c81w3)) != null) {
                        linkedHashMap.put(c81w3, obj3);
                        list.add(obj3);
                    }
                }
            }
        }
        C1811881u c1811881u4 = this.A06;
        if (c1811881u4 != null) {
            Iterator it = new LinkedHashSet(c1811881u4.A01).iterator();
            while (it.hasNext()) {
                A03((C81W) it.next(), false);
            }
        }
        if (this.A07 == null) {
            FrameLayout frameLayout = this.A0A;
            Context context = frameLayout.getContext();
            C14360o3.A07(context);
            CameraToolMenuItem cameraToolMenuItem = new CameraToolMenuItem(context, null, 0, null);
            this.A07 = cameraToolMenuItem;
            cameraToolMenuItem.setCameraToolResources(new C8GW(2131954661, R.drawable.instagram_chevron_down_outline_44, 2131954662, false));
            C0fQ.A00(new View.OnClickListener() { // from class: X.7m4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C448124l c448124l;
                    C25531Mh A08;
                    String str;
                    int A05 = C0f9.A05(-1559026410);
                    C8GR c8gr = C8GR.this;
                    if (c8gr.A0C.A01 == 1.0d) {
                        c8gr.A07(0.0d);
                        c448124l = AnonymousClass229.A01(c8gr.A0E).A09;
                        A08 = C25531Mh.A08(c448124l.A01);
                        if (((AbstractC02600Aj) A08).A00.isSampled()) {
                            A08.A0s("IG_CAMERA_FORMAT_MENU_CLOSE");
                            str = "FORMAT_MENU_CLOSE";
                            A08.A0q(str);
                            C448124l.A00(A08, c448124l);
                            A08.A0b(c448124l.A04.A09);
                            A08.A0W(2);
                            A08.A0m(C22F.A08.getModuleName());
                            A08.A0M(EnumC50631MWs.A0J, "surface");
                            A08.A0t(C1QM.A00.A02.A00);
                            A08.Cht();
                        }
                    } else {
                        c8gr.A07(1.0d);
                        c448124l = AnonymousClass229.A01(c8gr.A0E).A09;
                        A08 = C25531Mh.A08(c448124l.A01);
                        if (((AbstractC02600Aj) A08).A00.isSampled()) {
                            A08.A0s("IG_CAMERA_FORMAT_MENU_OPEN");
                            str = "FORMAT_MENU_OPEN";
                            A08.A0q(str);
                            C448124l.A00(A08, c448124l);
                            A08.A0b(c448124l.A04.A09);
                            A08.A0W(2);
                            A08.A0m(C22F.A08.getModuleName());
                            A08.A0M(EnumC50631MWs.A0J, "surface");
                            A08.A0t(C1QM.A00.A02.A00);
                            A08.Cht();
                        }
                    }
                    c8gr.A05();
                    C8GN c8gn = c8gr.A0G;
                    C2UY c2uy = C2UY.A01;
                    long[] jArr = {10, 10};
                    EnumC72346Xbi enumC72346Xbi = EnumC72346Xbi.A00;
                    Vibrator vibrator = c2uy.A00;
                    if (vibrator != null) {
                        vibrator.vibrate(VibrationEffect.createWaveform(jArr, -1), new AudioAttributes.Builder().setUsage(enumC72346Xbi.A00()).build());
                    }
                    for (Object obj4 : c8gn.A00.A0D.values()) {
                        C14360o3.A07(obj4);
                        ((C8GR) obj4).A0H.A00();
                    }
                    C0f9.A0C(-447400875, A05);
                }
            }, cameraToolMenuItem);
            AbstractC13880nE.A0X(cameraToolMenuItem, this.A02);
            frameLayout.addView(cameraToolMenuItem);
        }
        CameraToolMenuItem cameraToolMenuItem2 = this.A07;
        if (cameraToolMenuItem2 != null) {
            list.add(cameraToolMenuItem2);
        }
    }

    public final void A09(java.util.Set set) {
        C1811881u c1811881u;
        for (Map.Entry entry : this.A0I.entrySet()) {
            Object key = entry.getKey();
            CameraToolMenuItem cameraToolMenuItem = (CameraToolMenuItem) entry.getValue();
            C14360o3.A0B(key, 0);
            if (C81W.A0g != key && ((c1811881u = this.A06) == null || !new LinkedHashSet(c1811881u.A01).contains(key))) {
                boolean contains = set.contains(key);
                if (cameraToolMenuItem != null) {
                    cameraToolMenuItem.A04(contains, true);
                }
            }
        }
        Map map = this.A0Q;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C55982hj) it.next()).A06(0.0d);
        }
        C1811881u c1811881u2 = this.A06;
        if (c1811881u2 != null && !c1811881u2.A00().isEmpty()) {
            java.util.Set set2 = this.A0K;
            set2.clear();
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                C81W c81w = (C81W) it2.next();
                C14360o3.A0B(c81w, 0);
                switch (c81w.ordinal()) {
                    case 47:
                    case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                    case 56:
                        break;
                    default:
                        C1811881u c1811881u3 = this.A06;
                        if (c1811881u3 == null || !new LinkedHashSet(c1811881u3.A01).contains(c81w)) {
                            set2.add(c81w);
                            C55982hj c55982hj = (C55982hj) map.get(c81w);
                            if (c55982hj == null) {
                                c55982hj = C8GO.A00(this.A0M, 2.0d, 20.0d);
                                map.put(c81w, c55982hj);
                            }
                            c55982hj.A06(1.0d);
                            break;
                        } else {
                            break;
                        }
                        break;
                }
            }
        }
        ECv();
    }

    @Override // X.C8GS
    public final int BmD(View view) {
        View view2;
        if (view == null) {
            return 0;
        }
        if (view.getParent() == this.A0N) {
            return view.getLeft();
        }
        if (this.A09) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i = iArr[0];
            if (Integer.valueOf(i) != null) {
                return i;
            }
            return 0;
        }
        int left = view.getLeft();
        Object parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        return left + BmD(view2);
    }

    private final int A00() {
        boolean A06;
        int i;
        C55U c55u = this.A0F;
        if (!C14360o3.A0K(c55u, C208509Kk.A00) && !C14360o3.A0K(c55u, C81T.A00)) {
            if (c55u instanceof C81V) {
                A06 = C18U.A06(C06090Tz.A06, this.A0E, 36317972872107751L);
                i = 7;
            } else if (C14360o3.A0K(c55u, C81S.A00)) {
                A06 = C18U.A06(C06090Tz.A05, this.A0E, 36322757465811428L);
                i = 6;
            } else {
                if (C14360o3.A0K(c55u, C1811581r.A00) || C14360o3.A0K(c55u, C1811481q.A00) || C14360o3.A0K(c55u, C1811281o.A00) || C14360o3.A0K(c55u, C128535rM.A00) || C14360o3.A0K(c55u, C1811381p.A00) || C14360o3.A0K(c55u, C81R.A00) || C14360o3.A0K(c55u, C81Q.A00)) {
                    return 0;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unknown camera destination ");
                sb.append(c55u);
                AbstractC12120kG.A00("CameraToolMenuAdapter", sb.toString());
                return 0;
            }
            if (!A06) {
                return i;
            }
        }
        return 3;
    }

    private final int A01(View view) {
        View view2;
        if (view == null) {
            return 0;
        }
        if (view.getParent() == this.A0N) {
            return view.getTop();
        }
        int top = view.getTop();
        Object parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        return A01(view2) + top;
    }

    private final CameraToolMenuItem A02(final C81W c81w) {
        InterfaceC19630xq interfaceC19630xq;
        String str;
        if (this.A0I.containsKey(c81w)) {
            StringBuilder sb = new StringBuilder();
            sb.append("cannot handle duplicate tools in the menu: ");
            sb.append(c81w);
            AbstractC12120kG.A00("CameraToolMenuAdapter", sb.toString());
        } else {
            C8GO c8go = C8GO.A00;
            UserSession userSession = this.A0E;
            C8GW A02 = c8go.A02(userSession, c81w);
            if (A02 != null) {
                FrameLayout frameLayout = this.A0A;
                Context context = frameLayout.getContext();
                C14360o3.A07(context);
                final CameraToolMenuItem cameraToolMenuItem = new CameraToolMenuItem(context, null, 0, null);
                AbstractC13880nE.A0X(cameraToolMenuItem, this.A02);
                this.A0H.A01(c81w);
                C14360o3.A0B(c81w, 1);
                boolean z = false;
                if (C8GX.A01(c81w) == 3) {
                    z = true;
                }
                cameraToolMenuItem.A0A = z;
                int ordinal = c81w.ordinal();
                boolean z2 = false;
                if (ordinal != 14 && ordinal != 13) {
                    z2 = true;
                }
                cameraToolMenuItem.A09 = z2;
                cameraToolMenuItem.setCameraToolResources(A02);
                C3P9 c3p9 = new C3P9(cameraToolMenuItem);
                c3p9.A04 = new C3PD() { // from class: X.7m5
                    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
                    
                        if (r10 == X.C81W.A0E) goto L6;
                     */
                    @Override // X.C3PD, X.C3PE
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final boolean DsE(android.view.View r13) {
                        /*
                            r12 = this;
                            X.8GR r8 = r2
                            X.81W r10 = r1
                            com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem r4 = r3
                            com.instagram.common.session.UserSession r5 = r8.A0E
                            int r1 = X.C8GX.A01(r10)
                            r0 = 3
                            if (r1 != r0) goto L14
                            X.81W r0 = X.C81W.A0E
                            r2 = 1
                            if (r10 != r0) goto L15
                        L14:
                            r2 = 0
                        L15:
                            r0 = 0
                            if (r2 == 0) goto L1c
                            r8.A07(r0)
                        L1c:
                            X.7lx r3 = r8.A0H
                            boolean r2 = r3.A03(r10, r4)
                            if (r2 != 0) goto L27
                            r3.A00()
                        L27:
                            r9 = 26
                            r3 = 0
                            r7 = 0
                            r8.A05()
                            X.2hj r2 = r8.A0B
                            r2.A06(r0)
                            X.8GN r11 = r8.A0G
                            r2 = 1
                            X.C14360o3.A0B(r4, r2)
                            X.2UY r6 = X.C2UY.A01
                            r0 = 5
                            r6.A05(r0)
                            X.8GJ r0 = r11.A00
                            X.8GH r0 = r0.A04
                            if (r0 != 0) goto L50
                            java.lang.String r0 = "delegate"
                            X.C14360o3.A0F(r0)
                            X.00O r0 = X.C00O.createAndThrow()
                            throw r0
                        L50:
                            r0.A06(r10, r4)
                            X.7k2 r6 = r4.A07
                            if (r6 == 0) goto L81
                            int r1 = r10.ordinal()
                            if (r1 == r9) goto L99
                            if (r1 == r7) goto L82
                            r0 = 42
                            if (r1 == r0) goto Laa
                            r0 = 59
                            if (r1 != r0) goto L7e
                            X.7k2 r0 = X.EnumC171117k2.A05
                            if (r6 != r0) goto L7e
                            X.1Ai r6 = X.AbstractC23021Ah.A00(r5)
                            X.0ry r5 = r6.A1w
                            X.0YR[] r1 = X.C23031Ai.A8c
                            r0 = 208(0xd0, float:2.91E-43)
                            r1 = r1[r0]
                            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                            r5.Egi(r6, r0, r1)
                        L7e:
                            r4.setMerchandiseBadge(r3)
                        L81:
                            return r2
                        L82:
                            X.7k2 r0 = X.EnumC171117k2.A05
                            if (r6 != r0) goto L7e
                            X.55U r0 = r8.A0F
                            boolean r0 = r0 instanceof X.C81V
                            if (r0 == 0) goto L7e
                            X.1Ai r0 = X.AbstractC23021Ah.A00(r5)
                            X.0xq r0 = r0.A01
                            X.0xo r1 = r0.ARD()
                            java.lang.String r0 = "dismissed_new_clips_boomerang_tool_badge"
                            goto Lba
                        L99:
                            X.7k2 r0 = X.EnumC171117k2.A05
                            if (r6 != r0) goto L7e
                            X.1Ai r0 = X.AbstractC23021Ah.A00(r5)
                            X.0xq r0 = r0.A01
                            X.0xo r1 = r0.ARD()
                            java.lang.String r0 = "dismissed_new_audience_controls_tool_badge"
                            goto Lba
                        Laa:
                            X.7k2 r0 = X.EnumC171117k2.A05
                            if (r6 != r0) goto L7e
                            X.1Ai r0 = X.AbstractC23021Ah.A00(r5)
                            X.0xq r0 = r0.A01
                            X.0xo r1 = r0.ARD()
                            java.lang.String r0 = "dismissed_new_clips_green_screen_tool_badge"
                        Lba:
                            r1.E77(r0, r2)
                            r1.apply()
                            goto L7e
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C172367m5.DsE(android.view.View):boolean");
                    }
                };
                c3p9.A00();
                if (ordinal != 26) {
                    if (ordinal != 0) {
                        if (ordinal != 42) {
                            if (ordinal == 59) {
                                C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                                InterfaceC16530ry interfaceC16530ry = A00.A1w;
                                C0YR[] c0yrArr = C23031Ai.A8c;
                                if (!((Boolean) interfaceC16530ry.CES(A00, c0yrArr[208])).booleanValue()) {
                                    C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                                    if (((Number) A002.A88.CES(A002, c0yrArr[209])).intValue() < 5) {
                                        cameraToolMenuItem.setMerchandiseBadge(EnumC171117k2.A05);
                                        C23031Ai A003 = AbstractC23021Ah.A00(userSession);
                                        InterfaceC16530ry interfaceC16530ry2 = A003.A88;
                                        int intValue = ((Number) interfaceC16530ry2.CES(A003, c0yrArr[209])).intValue() + 1;
                                        interfaceC16530ry2.Egi(A003, Integer.valueOf(intValue), c0yrArr[209]);
                                    }
                                }
                            }
                        } else if (C14360o3.A0K(this.A0F, C81U.A00)) {
                            interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
                            str = "dismissed_new_clips_green_screen_tool_badge";
                        }
                    } else if (C14360o3.A0K(this.A0F, C81U.A00)) {
                        interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
                        str = "dismissed_new_clips_boomerang_tool_badge";
                    }
                    frameLayout.addView(cameraToolMenuItem);
                    return cameraToolMenuItem;
                }
                interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
                str = "dismissed_new_audience_controls_tool_badge";
                if (!interfaceC19630xq.getBoolean(str, false)) {
                    cameraToolMenuItem.setMerchandiseBadge(EnumC171117k2.A05);
                }
                frameLayout.addView(cameraToolMenuItem);
                return cameraToolMenuItem;
            }
        }
        return null;
    }

    private final void A03(C81W c81w, boolean z) {
        Map map = this.A0R;
        Object obj = map.get(c81w);
        double d = 1.0d;
        Object obj2 = obj;
        if (obj == null) {
            if (!z) {
                C55982hj A00 = C8GO.A00(this.A0M, 2.0d, 20.0d);
                A00.A08(1.0d, true);
                obj2 = A00;
                if (c81w != null) {
                    map.put(c81w, A00);
                    obj2 = A00;
                }
            } else {
                return;
            }
        }
        C55982hj c55982hj = (C55982hj) obj2;
        if (!z) {
            d = 0.0d;
        }
        c55982hj.A06(d);
    }

    public static final void A04(C8GR c8gr, CameraToolMenuItem cameraToolMenuItem, float f) {
        if (C14360o3.A0K(cameraToolMenuItem, c8gr.A07) && c8gr.A0C.A01 == 0.0d) {
            if (cameraToolMenuItem != null) {
                f = 0.0f;
            } else {
                return;
            }
        } else if (cameraToolMenuItem == null) {
            return;
        }
        cameraToolMenuItem.setLabelDisplayPercentage(f);
    }

    public final void A05() {
        this.A0D.A06(0.0d);
        C11T.A01(this.A0P);
    }

    public final void A06() {
        this.A0D.A06(1.0d);
        Runnable runnable = this.A0P;
        C11T.A01(runnable);
        C11T.A04(runnable, 6000L);
        this.A0G.A00(true);
    }

    public final void A07(double d) {
        int i;
        int i2;
        int i3;
        this.A0C.A06(d);
        this.A0L.A06(d);
        CameraToolMenuItem cameraToolMenuItem = this.A07;
        if (cameraToolMenuItem != null) {
            if (d == 0.0d) {
                i = 2131954661;
                i2 = R.drawable.instagram_chevron_down_outline_44;
                i3 = 2131954662;
            } else {
                if (d != 1.0d) {
                    return;
                }
                i = 2131954611;
                i2 = R.drawable.instagram_chevron_down_outline_44;
                i3 = 2131954612;
            }
            cameraToolMenuItem.setCameraToolResources(new C8GW(i, i2, i3, false));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (r0 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0A(boolean r4) {
        /*
            r3 = this;
            android.view.ViewGroup r0 = r3.A05
            if (r0 == 0) goto L61
            android.view.ViewGroup r0 = r3.A04
            if (r0 == 0) goto L61
            r1 = 0
            if (r4 == 0) goto L55
            int r0 = r0.getChildCount()
            if (r0 > 0) goto L61
        L11:
            r3.A09 = r4
            X.7lx r0 = r3.A0H
            r0.A02 = r4
            if (r4 == 0) goto L47
            android.widget.FrameLayout r0 = r3.A0A
            r0.removeAllViews()
            android.view.ViewGroup r0 = r3.A05
            if (r0 == 0) goto L25
        L22:
            r0.setVisibility(r1)
        L25:
            java.util.List r0 = r3.A0J
            java.util.Iterator r2 = r0.iterator()
        L2b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r1 = r2.next()
            com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem r1 = (com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem) r1
            if (r4 == 0) goto L44
            android.view.ViewGroup r0 = r3.A04
            if (r0 == 0) goto L40
        L3d:
            r0.addView(r1)
        L40:
            r1.setIsFlexModeBackgroundEnabled(r4)
            goto L2b
        L44:
            android.widget.FrameLayout r0 = r3.A0A
            goto L3d
        L47:
            android.view.ViewGroup r0 = r3.A04
            if (r0 == 0) goto L4e
            r0.removeAllViews()
        L4e:
            android.view.ViewGroup r0 = r3.A05
            if (r0 == 0) goto L25
            r1 = 8
            goto L22
        L55:
            android.widget.FrameLayout r0 = r3.A0A
            int r0 = r0.getChildCount()
            if (r0 <= 0) goto L11
            return
        L5e:
            r3.ECv()
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8GR.A0A(boolean):void");
    }

    @Override // X.C8GS
    public final float Bra(CameraToolMenuItem cameraToolMenuItem) {
        ViewGroup viewGroup = this.A05;
        if (viewGroup != null) {
            Float valueOf = Float.valueOf(viewGroup.getY());
            if (this.A09 && valueOf != null) {
                return valueOf.floatValue();
            }
        }
        return A01(cameraToolMenuItem) + ((int) cameraToolMenuItem.getTranslationY());
    }

    @Override // X.C8GS
    public final int Bsk(C81W c81w) {
        C8GH c8gh = this.A0N.A04;
        if (c8gh == null) {
            C14360o3.A0F("delegate");
            throw C00O.createAndThrow();
        }
        return c8gh.A03.A06(c81w);
    }

    @Override // X.C8GS
    public final A56 Bso(C81W c81w) {
        C8GH c8gh = this.A0N.A04;
        if (c8gh == null) {
            C14360o3.A0F("delegate");
            throw C00O.createAndThrow();
        }
        return (A56) C1810981l.A01(c81w, c8gh.A03).A00;
    }

    @Override // X.C8GS
    public final void Djc() {
        C8GJ.A01(this.A0G.A00);
    }

    @Override // X.C8GS
    public final void Djd(C81W c81w, int i) {
        C8GH c8gh = this.A0G.A00.A04;
        if (c8gh == null) {
            C14360o3.A0F("delegate");
            throw C00O.createAndThrow();
        }
        c8gh.A03.A0O(c81w, i);
    }

    @Override // X.C8GS
    public final void Dje(C81W c81w, int i) {
        C8GH c8gh = this.A0G.A00.A04;
        if (c8gh == null) {
            C14360o3.A0F("delegate");
            throw C00O.createAndThrow();
        }
        C1811981v A01 = C1810981l.A01(c81w, c8gh.A03);
        A56 a56 = (A56) A01.A00;
        a56.A00 = i;
        A01.A02(a56);
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x01ea, code lost:
    
        if (r20 != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0216, code lost:
    
        if (r5 != X.C81W.A0k) goto L102;
     */
    @Override // X.C8GS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ECv() {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8GR.ECv():void");
    }

    @Override // X.C8GS
    public final LinkedHashMap getCameraToolMenuItemMap() {
        return this.A0I;
    }

    @Override // X.C8GS
    public final View getCameraToolMenuShadow() {
        return this.A03;
    }

    @Override // X.C8GS
    public final java.util.Set getSelectedCameraTools() {
        return this.A0K;
    }
}
