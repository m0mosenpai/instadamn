package com.instagram.creation.capture.quickcapture.cameratoolmenu;

import X.A56;
import X.A89;
import X.ATC;
import X.AbstractC001800i;
import X.AbstractC13880nE;
import X.AnonymousClass834;
import X.C14360o3;
import X.C16910sj;
import X.C172287lx;
import X.C1810981l;
import X.C1811981v;
import X.C3P9;
import X.C3PD;
import X.C81W;
import X.C8GH;
import X.C8GO;
import X.C8GS;
import X.C8GW;
import X.InterfaceC184968Il;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class CameraPreCaptureUtilityMenu extends IgFrameLayout implements C8GS {
    public UserSession A00;
    public C8GH A01;
    public InterfaceC184968Il A02;
    public C172287lx A03;
    public Set A04;
    public ImageView A05;
    public final FrameLayout A06;
    public final A89 A07;
    public final LinkedHashMap A08;
    public final Set A09;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraPreCaptureUtilityMenu(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    @Override // X.C8GS
    public final int BmD(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr2);
        return iArr[0] - iArr2[1];
    }

    @Override // X.C8GS
    public final float Bra(CameraToolMenuItem cameraToolMenuItem) {
        cameraToolMenuItem.getLocationOnScreen(new int[2]);
        getLocationOnScreen(new int[2]);
        return r1[1] - r2[1];
    }

    @Override // X.C8GS
    public final void Djc() {
    }

    @Override // X.C8GS
    public View getCameraToolMenuShadow() {
        return null;
    }

    public final void setUtilityMenuCameraTools(Set set) {
        C14360o3.A0B(set, 0);
        this.A04 = set;
        Context context = getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        this.A06.addView(frameLayout, new FrameLayout.LayoutParams(-1, -2));
        LinkedHashMap linkedHashMap = this.A08;
        linkedHashMap.clear();
        this.A04 = set;
        Iterator it = set.iterator();
        int i = 1;
        while (it.hasNext()) {
            final C81W c81w = (C81W) it.next();
            Object obj = linkedHashMap.get(c81w);
            Object obj2 = obj;
            if (obj == null) {
                C8GW A02 = C8GO.A00.A02(this.A00, c81w);
                if (A02 == null) {
                    obj2 = null;
                } else {
                    Context context2 = frameLayout.getContext();
                    C14360o3.A07(context2);
                    Resources resources = getResources();
                    final CameraToolMenuItem cameraToolMenuItem = new CameraToolMenuItem(context2, null, 0, Float.valueOf(resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width)));
                    cameraToolMenuItem.setCameraToolResources(A02);
                    cameraToolMenuItem.setCircularBackground(context.getColor(R.color.button_background_color));
                    cameraToolMenuItem.setIconPaddingForUtilityToolBarItem(resources.getDimensionPixelSize(R.dimen.abc_control_corner_material));
                    frameLayout.addView(cameraToolMenuItem);
                    AbstractC13880nE.A0e(cameraToolMenuItem, (resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width)) * i);
                    C3P9 c3p9 = new C3P9(cameraToolMenuItem);
                    c3p9.A04 = new C3PD() { // from class: X.9iA
                        /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
                        @Override // X.C3PD, X.C3PE
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final boolean DsE(android.view.View r7) {
                            /*
                                r6 = this;
                                com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraPreCaptureUtilityMenu r4 = r2
                                X.7lx r1 = r4.A03
                                r2 = 1
                                if (r1 == 0) goto L56
                                X.81W r5 = r1
                                com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem r0 = r3
                                boolean r0 = r1.A03(r5, r0)
                                if (r0 != 0) goto L56
                                X.7lx r0 = r4.A03
                                if (r0 == 0) goto L18
                                r0.A00()
                            L18:
                                java.util.Set r0 = r4.A09
                                r0.remove(r5)
                            L1d:
                                com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem r3 = r3
                                r1 = 0
                                X.C14360o3.A0B(r5, r1)
                                X.C14360o3.A0B(r3, r2)
                                X.8Il r4 = r4.A02
                                if (r4 == 0) goto L82
                                X.8Ik r4 = (X.C184958Ik) r4
                                X.83C r0 = r4.A00
                                if (r0 == 0) goto L39
                                X.8Z9 r0 = r0.A00()
                                if (r0 == 0) goto L39
                                r0.A04(r1)
                            L39:
                                X.8GG r0 = r4.A01
                                X.8GH r0 = r0.A00()
                                r0.A06(r5, r3)
                                java.util.Set r0 = r4.A03
                                java.util.Iterator r1 = r0.iterator()
                            L48:
                                boolean r0 = r1.hasNext()
                                if (r0 == 0) goto L5e
                                java.lang.Object r0 = r1.next()
                                X.AbstractC166987dD.A1Y(r0)
                                goto L48
                            L56:
                                java.util.Set r0 = r4.A09
                                X.81W r5 = r1
                                r0.add(r5)
                                goto L1d
                            L5e:
                                java.util.Map r1 = r4.A02
                                boolean r0 = r1.containsKey(r5)
                                if (r0 == 0) goto L82
                                java.lang.Object r0 = r1.get(r5)
                                java.util.Set r0 = (java.util.Set) r0
                                if (r0 == 0) goto L82
                                java.util.Iterator r1 = r0.iterator()
                            L72:
                                boolean r0 = r1.hasNext()
                                if (r0 == 0) goto L82
                                java.lang.Object r0 = r1.next()
                                X.822 r0 = (X.AnonymousClass822) r0
                                r0.onChanged(r3)
                                goto L72
                            L82:
                                return r2
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C216539iA.DsE(android.view.View):boolean");
                        }
                    };
                    c3p9.A00();
                    obj2 = cameraToolMenuItem;
                }
            }
            i++;
            linkedHashMap.put(c81w, obj2);
            C172287lx c172287lx = this.A03;
            if (c172287lx != null) {
                c172287lx.A01(c81w);
            }
        }
    }

    public final void setUtilityMenuDelegateListener(InterfaceC184968Il interfaceC184968Il) {
        C14360o3.A0B(interfaceC184968Il, 0);
        this.A02 = interfaceC184968Il;
    }

    @Override // X.C8GS
    public final int Bsk(C81W c81w) {
        C8GH c8gh = this.A01;
        if (c8gh != null) {
            return c8gh.A03.A06(c81w);
        }
        return 0;
    }

    @Override // X.C8GS
    public final A56 Bso(C81W c81w) {
        C8GH c8gh = this.A01;
        if (c8gh != null) {
            return (A56) C1810981l.A01(c81w, c8gh.A03).A00;
        }
        return null;
    }

    @Override // X.C8GS
    public final void Djd(C81W c81w, int i) {
        C8GH c8gh = this.A01;
        if (c8gh != null) {
            c8gh.A03.A0O(c81w, i);
        }
    }

    @Override // X.C8GS
    public final void Dje(C81W c81w, int i) {
        C8GH c8gh = this.A01;
        if (c8gh != null) {
            C1811981v A01 = C1810981l.A01(c81w, c8gh.A03);
            A56 a56 = (A56) A01.A00;
            a56.A00 = i;
            A01.A02(a56);
        }
    }

    @Override // X.C8GS
    public final void ECv() {
        Object A0A;
        CameraToolMenuItem cameraToolMenuItem;
        C172287lx c172287lx;
        Set set = this.A09;
        if ((!set.isEmpty()) && (A0A = AbstractC001800i.A0A(set)) != null && (cameraToolMenuItem = (CameraToolMenuItem) this.A08.getOrDefault(A0A, null)) != null && (c172287lx = this.A03) != null) {
            c172287lx.A02(cameraToolMenuItem, 0.5d, 1.0f, 1.0f);
        }
    }

    public final AnonymousClass834 getCameraFlashButton() {
        AnonymousClass834 anonymousClass834 = new AnonymousClass834(this.A05);
        A89 a89 = this.A07;
        C14360o3.A0B(a89, 0);
        anonymousClass834.A00 = a89;
        return anonymousClass834;
    }

    @Override // X.C8GS
    public LinkedHashMap getCameraToolMenuItemMap() {
        return this.A08;
    }

    @Override // X.C8GS
    public Set getSelectedCameraTools() {
        return this.A09;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraPreCaptureUtilityMenu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A04 = C16910sj.A00;
        this.A08 = new LinkedHashMap();
        this.A09 = new HashSet();
        LayoutInflater.from(context).inflate(R.layout.layout_camera_pre_capture_utility_menu, this);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.camera_pre_capture_utility_menu);
        this.A06 = frameLayout;
        ImageView imageView = (ImageView) frameLayout.findViewById(R.id.camera_utility_tool_flash_button);
        this.A05 = imageView;
        this.A07 = new A89(imageView, this);
        frameLayout.setVisibility(0);
        setOnTouchListener(new ATC(this));
        this.A06.setVisibility(4);
    }

    public /* synthetic */ CameraPreCaptureUtilityMenu(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraPreCaptureUtilityMenu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
