package com.facebook.rtc.views.omnigridview;

import X.AbstractC001800i;
import X.AbstractC09800fd;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25226BEj;
import X.AbstractC31171DnF;
import X.AbstractC51368MmT;
import X.AbstractC53623NnU;
import X.AbstractC54955OSf;
import X.AbstractC70663Fe;
import X.C00O;
import X.C05F;
import X.C09530e4;
import X.C0eP;
import X.C14360o3;
import X.C16930sl;
import X.C3OO;
import X.C50772Mbe;
import X.C51168MjC;
import X.C51178MjM;
import X.C51198Mji;
import X.C51614Mr7;
import X.C51671Ms2;
import X.C51681MsC;
import X.C51714Msj;
import X.C51727Mt4;
import X.C51749MtY;
import X.C54581O9i;
import X.InterfaceC57799PkR;
import X.InterfaceC57800PkS;
import X.JQ0;
import X.MSW;
import X.N0J;
import X.OVT;
import X.QIw;
import X.UQ7;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.common.draggableview.DraggableViewContainer;
import com.facebook.rtc.views.omnigrid.GridItemType;
import com.facebook.rtc.views.omnigrid.OmniGridLayoutManager;
import com.facebook.rtc.views.omnigrid.OmniGridRecyclerView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public class OmniGridView extends FrameLayout implements InterfaceC57799PkR {
    public View.OnTouchListener A00;
    public View A01;
    public C51749MtY A02;
    public AbstractC51368MmT A03;
    public C51714Msj A04;
    public N0J A05;
    public InterfaceC57800PkS A06;
    public OmniGridView A07;
    public C54581O9i A08;
    public C51671Ms2 A09;
    public List A0A;
    public boolean A0B;
    public boolean A0C;
    public C51168MjC A0D;
    public Map A0E;
    public boolean A0F;
    public final RecyclerView A0G;
    public final DraggableViewContainer A0H;
    public final OmniGridLayoutManager A0I;
    public final C51178MjM A0J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OmniGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        LayoutInflater.from(context).inflate(R.layout.layout_omni_grid, (ViewGroup) this, true);
        OmniGridLayoutManager omniGridLayoutManager = new OmniGridLayoutManager(context, MSW.A1E(this, 2));
        omniGridLayoutManager.A0F.add(new OVT(this));
        this.A0I = omniGridLayoutManager;
        C51178MjM c51178MjM = new C51178MjM(omniGridLayoutManager);
        this.A0J = c51178MjM;
        this.A02 = AbstractC54955OSf.A01;
        View findViewById = findViewById(R.id.omni_grid_recycler_view);
        OmniGridRecyclerView omniGridRecyclerView = (OmniGridRecyclerView) findViewById;
        omniGridRecyclerView.setLayoutManager(omniGridLayoutManager);
        omniGridRecyclerView.setItemAnimator(c51178MjM);
        C51198Mji.A00(omniGridRecyclerView, this, 0);
        omniGridRecyclerView.A00 = new GestureDetector(context, new C50772Mbe(this));
        omniGridRecyclerView.A0S = true;
        C14360o3.A07(findViewById);
        this.A0G = (RecyclerView) findViewById;
        this.A0H = (DraggableViewContainer) findViewById(R.id.floating_view_container);
        this.A0A = C16930sl.A00;
    }

    public static final int A00(float f, float f2, int i) {
        float f3 = i;
        float f4 = f3 - f;
        return (int) (f2 >= 1.0f ? f3 + (f4 * (f2 - 1.0f)) : f3 - (f4 * (1.0f - f2)));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        View.OnTouchListener onTouchListener = this.A00;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(this, motionEvent);
        }
        return false;
    }

    public final void setItemDefinitions(Map map, C54581O9i c54581O9i) {
        Object obj;
        C14360o3.A0B(map, 0);
        AbstractC09800fd.A01("OmniGridView.setItemDefinitions", 211195229);
        try {
            if (this.A0D == null) {
                Iterator A16 = AbstractC166997dE.A16(map);
                do {
                    obj = null;
                    if (!A16.hasNext()) {
                        break;
                    } else {
                        obj = A16.next();
                    }
                } while (!(((AbstractC53623NnU) obj) instanceof N0J));
                AbstractC53623NnU abstractC53623NnU = (AbstractC53623NnU) obj;
                if (abstractC53623NnU != null) {
                    if (c54581O9i == null) {
                        Resources resources = getResources();
                        C14360o3.A07(resources);
                        C51749MtY c51749MtY = AbstractC54955OSf.A01;
                        c54581O9i = new C54581O9i(resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material), resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material));
                    }
                    this.A08 = c54581O9i;
                    this.A0E = map;
                    this.A05 = (N0J) abstractC53623NnU;
                    C51168MjC c51168MjC = new C51168MjC(map);
                    this.A0D = c51168MjC;
                    c51168MjC.setHasStableIds(true);
                    RecyclerView recyclerView = this.A0G;
                    C51168MjC c51168MjC2 = this.A0D;
                    if (c51168MjC2 == null) {
                        C14360o3.A0F("gridAdapter");
                        throw C00O.createAndThrow();
                    }
                    recyclerView.setAdapter(c51168MjC2);
                    AbstractC09800fd.A00(1544903124);
                    return;
                }
                throw AbstractC166987dD.A14("Self Item definition is required but not found!");
            }
            throw AbstractC166987dD.A14("Do not call setItemDefinitions more than once!");
        } catch (Throwable th) {
            AbstractC09800fd.A00(-1421047832);
            throw th;
        }
    }

    private final Long A01() {
        Object obj;
        Iterator A1J = AbstractC25226BEj.A1J(this.A02.A04);
        while (true) {
            if (A1J.hasNext()) {
                obj = A1J.next();
                if (((C51681MsC) obj).A03 == GridItemType.SELF_VIEW) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C51681MsC c51681MsC = (C51681MsC) obj;
        if (c51681MsC == null) {
            return null;
        }
        return Long.valueOf(c51681MsC.A02);
    }

    public static final void A02(OmniGridView omniGridView, int i) {
        int i2;
        AbstractC51368MmT abstractC51368MmT;
        int i3;
        Integer num;
        int i4;
        AbstractC09800fd.A01("OmniGridView.updateRoundedCornerForLayoutPosition", 290118795);
        try {
            C3OO A0W = omniGridView.A0G.A0W(i, false);
            if ((A0W instanceof AbstractC51368MmT) && (abstractC51368MmT = (AbstractC51368MmT) A0W) != null) {
                C51727Mt4 c51727Mt4 = omniGridView.A0I.A07;
                Integer num2 = c51727Mt4.A08;
                if (num2 != null) {
                    i3 = num2.intValue();
                } else {
                    C54581O9i c54581O9i = omniGridView.A08;
                    if (c54581O9i == null) {
                        C14360o3.A0F("gridViewParameters");
                        throw C00O.createAndThrow();
                    }
                    i3 = c54581O9i.A01;
                }
                Integer num3 = ((C51614Mr7) c51727Mt4.A09.get(i)).A04;
                if (i3 > 0 && num3 != C05F.A0C) {
                    Integer num4 = C05F.A00;
                    if (num3 == num4 && ((Integer) omniGridView.A02.A02) != null) {
                        num = num4;
                    } else {
                        num = C05F.A01;
                    }
                    Integer num5 = (Integer) omniGridView.A02.A02;
                    if (num5 != null) {
                        i4 = num5.intValue();
                    } else {
                        i4 = -1;
                    }
                    abstractC51368MmT.A02(num, num4, i3, i4);
                } else {
                    abstractC51368MmT.A01(C05F.A00);
                }
                i2 = 268091002;
            } else {
                i2 = -442241196;
            }
            AbstractC09800fd.A00(i2);
        } catch (Throwable th) {
            AbstractC09800fd.A00(-328056445);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if (((X.C51614Mr7) r2.get(r6)).A02.A00(r4.A1a()) >= 0.25d) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(com.facebook.rtc.views.omnigridview.OmniGridView r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rtc.views.omnigridview.OmniGridView.A03(com.facebook.rtc.views.omnigridview.OmniGridView, boolean):void");
    }

    private final void A04(boolean z) {
        int i;
        Map map;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        AbstractC09800fd.A01("OmniGridView.hideFloatingSelfView", -1385067191);
        try {
            AbstractC51368MmT abstractC51368MmT = this.A03;
            if (abstractC51368MmT == null) {
                i = -274077905;
            } else {
                View view = this.A01;
                if (view != null) {
                    View A06 = AbstractC31171DnF.A06(abstractC51368MmT);
                    if (!C14360o3.A0K(view.getParent(), A06)) {
                        view.setElevation(30.0f);
                        abstractC51368MmT.A01(C05F.A0C);
                        RecyclerView recyclerView = this.A0G;
                        int[] iArr = new int[2];
                        view.getLocationInWindow(iArr);
                        int[] iArr2 = new int[2];
                        recyclerView.getLocationInWindow(iArr2);
                        int i2 = iArr[0] - iArr2[0];
                        int i3 = iArr[1] - iArr2[1];
                        UQ7 uq7 = new UQ7(i2, i3, view.getWidth() + i2, view.getHeight() + i3, 0);
                        ViewParent parent = view.getParent();
                        if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                            viewGroup2.removeView(view);
                        }
                        if ((A06 instanceof ViewGroup) && (viewGroup = (ViewGroup) A06) != null) {
                            viewGroup.addView(view);
                        }
                        Long A01 = A01();
                        if (A01 != null && z) {
                            OmniGridLayoutManager omniGridLayoutManager = this.A0I;
                            C09530e4 A1L = AbstractC166987dD.A1L(uq7, AbstractC54955OSf.A00);
                            if (omniGridLayoutManager.A0D) {
                                map = omniGridLayoutManager.A0B;
                            } else {
                                map = omniGridLayoutManager.A0A;
                            }
                            map.put(A01, A1L);
                            omniGridLayoutManager.A0i();
                            ((AbstractC70663Fe) omniGridLayoutManager).A0F = true;
                        }
                    }
                    Integer num = C05F.A00;
                    if (abstractC51368MmT.A00 != num) {
                        abstractC51368MmT.A00 = num;
                    }
                    i = 1302275379;
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            AbstractC09800fd.A00(i);
        } catch (Throwable th) {
            AbstractC09800fd.A00(-1865935441);
            throw th;
        }
    }

    private final OmniGridView getAndInitFloatingGridView() {
        OmniGridView omniGridView = this.A07;
        if (omniGridView == null) {
            omniGridView = new OmniGridView(AbstractC166997dE.A0L(this), null, 0);
            Map map = this.A0E;
            if (map != null) {
                omniGridView.setItemDefinitions(map, null);
                this.A07 = omniGridView;
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return omniGridView;
    }

    public static /* synthetic */ void setItemDefinitions$default(OmniGridView omniGridView, Map map, C54581O9i c54581O9i, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                c54581O9i = null;
            }
            omniGridView.setItemDefinitions(map, c54581O9i);
            return;
        }
        throw AbstractC166987dD.A1D("Super calls with default arguments not supported in this target, function: setItemDefinitions");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0136, code lost:
    
        if (r0 == null) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fe A[Catch: all -> 0x01d9, TRY_LEAVE, TryCatch #2 {all -> 0x01d9, blocks: (B:3:0x000a, B:5:0x0010, B:7:0x001a, B:9:0x0021, B:10:0x0023, B:12:0x0036, B:19:0x005d, B:23:0x0125, B:106:0x01d8, B:26:0x0063, B:27:0x0071, B:29:0x0077, B:31:0x0094, B:32:0x009a, B:34:0x00a2, B:36:0x00b1, B:38:0x00bd, B:40:0x00c3, B:44:0x00d7, B:46:0x00db, B:48:0x00f4, B:50:0x00fe, B:53:0x0104, B:56:0x012a, B:58:0x0134, B:61:0x0146, B:63:0x014c, B:65:0x0152, B:67:0x0164, B:69:0x016c, B:71:0x0170, B:72:0x017e, B:73:0x0183, B:75:0x0190, B:78:0x01a3, B:80:0x01b3, B:84:0x01c8, B:86:0x019a, B:88:0x01a1, B:92:0x0141, B:93:0x0138, B:96:0x00df, B:98:0x00e3, B:100:0x00e7, B:105:0x01d2), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0146 A[Catch: all -> 0x01d9, TryCatch #2 {all -> 0x01d9, blocks: (B:3:0x000a, B:5:0x0010, B:7:0x001a, B:9:0x0021, B:10:0x0023, B:12:0x0036, B:19:0x005d, B:23:0x0125, B:106:0x01d8, B:26:0x0063, B:27:0x0071, B:29:0x0077, B:31:0x0094, B:32:0x009a, B:34:0x00a2, B:36:0x00b1, B:38:0x00bd, B:40:0x00c3, B:44:0x00d7, B:46:0x00db, B:48:0x00f4, B:50:0x00fe, B:53:0x0104, B:56:0x012a, B:58:0x0134, B:61:0x0146, B:63:0x014c, B:65:0x0152, B:67:0x0164, B:69:0x016c, B:71:0x0170, B:72:0x017e, B:73:0x0183, B:75:0x0190, B:78:0x01a3, B:80:0x01b3, B:84:0x01c8, B:86:0x019a, B:88:0x01a1, B:92:0x0141, B:93:0x0138, B:96:0x00df, B:98:0x00e3, B:100:0x00e7, B:105:0x01d2), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0170 A[Catch: all -> 0x01d9, TryCatch #2 {all -> 0x01d9, blocks: (B:3:0x000a, B:5:0x0010, B:7:0x001a, B:9:0x0021, B:10:0x0023, B:12:0x0036, B:19:0x005d, B:23:0x0125, B:106:0x01d8, B:26:0x0063, B:27:0x0071, B:29:0x0077, B:31:0x0094, B:32:0x009a, B:34:0x00a2, B:36:0x00b1, B:38:0x00bd, B:40:0x00c3, B:44:0x00d7, B:46:0x00db, B:48:0x00f4, B:50:0x00fe, B:53:0x0104, B:56:0x012a, B:58:0x0134, B:61:0x0146, B:63:0x014c, B:65:0x0152, B:67:0x0164, B:69:0x016c, B:71:0x0170, B:72:0x017e, B:73:0x0183, B:75:0x0190, B:78:0x01a3, B:80:0x01b3, B:84:0x01c8, B:86:0x019a, B:88:0x01a1, B:92:0x0141, B:93:0x0138, B:96:0x00df, B:98:0x00e3, B:100:0x00e7, B:105:0x01d2), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0190 A[Catch: all -> 0x01d9, TryCatch #2 {all -> 0x01d9, blocks: (B:3:0x000a, B:5:0x0010, B:7:0x001a, B:9:0x0021, B:10:0x0023, B:12:0x0036, B:19:0x005d, B:23:0x0125, B:106:0x01d8, B:26:0x0063, B:27:0x0071, B:29:0x0077, B:31:0x0094, B:32:0x009a, B:34:0x00a2, B:36:0x00b1, B:38:0x00bd, B:40:0x00c3, B:44:0x00d7, B:46:0x00db, B:48:0x00f4, B:50:0x00fe, B:53:0x0104, B:56:0x012a, B:58:0x0134, B:61:0x0146, B:63:0x014c, B:65:0x0152, B:67:0x0164, B:69:0x016c, B:71:0x0170, B:72:0x017e, B:73:0x0183, B:75:0x0190, B:78:0x01a3, B:80:0x01b3, B:84:0x01c8, B:86:0x019a, B:88:0x01a1, B:92:0x0141, B:93:0x0138, B:96:0x00df, B:98:0x00e3, B:100:0x00e7, B:105:0x01d2), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b3 A[Catch: all -> 0x01d9, TryCatch #2 {all -> 0x01d9, blocks: (B:3:0x000a, B:5:0x0010, B:7:0x001a, B:9:0x0021, B:10:0x0023, B:12:0x0036, B:19:0x005d, B:23:0x0125, B:106:0x01d8, B:26:0x0063, B:27:0x0071, B:29:0x0077, B:31:0x0094, B:32:0x009a, B:34:0x00a2, B:36:0x00b1, B:38:0x00bd, B:40:0x00c3, B:44:0x00d7, B:46:0x00db, B:48:0x00f4, B:50:0x00fe, B:53:0x0104, B:56:0x012a, B:58:0x0134, B:61:0x0146, B:63:0x014c, B:65:0x0152, B:67:0x0164, B:69:0x016c, B:71:0x0170, B:72:0x017e, B:73:0x0183, B:75:0x0190, B:78:0x01a3, B:80:0x01b3, B:84:0x01c8, B:86:0x019a, B:88:0x01a1, B:92:0x0141, B:93:0x0138, B:96:0x00df, B:98:0x00e3, B:100:0x00e7, B:105:0x01d2), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a1 A[Catch: all -> 0x01d9, TryCatch #2 {all -> 0x01d9, blocks: (B:3:0x000a, B:5:0x0010, B:7:0x001a, B:9:0x0021, B:10:0x0023, B:12:0x0036, B:19:0x005d, B:23:0x0125, B:106:0x01d8, B:26:0x0063, B:27:0x0071, B:29:0x0077, B:31:0x0094, B:32:0x009a, B:34:0x00a2, B:36:0x00b1, B:38:0x00bd, B:40:0x00c3, B:44:0x00d7, B:46:0x00db, B:48:0x00f4, B:50:0x00fe, B:53:0x0104, B:56:0x012a, B:58:0x0134, B:61:0x0146, B:63:0x014c, B:65:0x0152, B:67:0x0164, B:69:0x016c, B:71:0x0170, B:72:0x017e, B:73:0x0183, B:75:0x0190, B:78:0x01a3, B:80:0x01b3, B:84:0x01c8, B:86:0x019a, B:88:0x01a1, B:92:0x0141, B:93:0x0138, B:96:0x00df, B:98:0x00e3, B:100:0x00e7, B:105:0x01d2), top: B:2:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(X.C51749MtY r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rtc.views.omnigridview.OmniGridView.A05(X.MtY, boolean):void");
    }

    public final RecyclerView getGridRecyclerView$fbandroid_java_com_facebook_rtc_views_omnigridview_omnigridview() {
        return this.A0G;
    }

    public final C51749MtY getGridViewModel() {
        return this.A02;
    }

    public final OmniGridLayoutManager getLayoutManager() {
        return this.A0I;
    }

    public View getSelfView() {
        return this.A01;
    }

    public AbstractC51368MmT getSelfViewHolder() {
        return this.A03;
    }

    public final InterfaceC57800PkS getTapListener() {
        return this.A06;
    }

    public final View.OnTouchListener getTouchInterceptor() {
        return this.A00;
    }

    public final void setShouldDisableDraggingForFloatingView(boolean z) {
        this.A0H.A0D = z;
    }

    public final void setShouldInterceptChildTouchEventsForFloatingView(boolean z) {
        this.A0B = z;
        this.A0H.A0E = z;
    }

    public final UQ7 getSelfViewFrameInGrid() {
        Object obj;
        Long A01 = A01();
        UQ7 uq7 = null;
        if (A01 != null) {
            long longValue = A01.longValue();
            OmniGridLayoutManager omniGridLayoutManager = this.A0I;
            Iterator it = omniGridLayoutManager.A08.A09.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((C51614Mr7) obj).A01 == longValue) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C51614Mr7 c51614Mr7 = (C51614Mr7) obj;
            if (c51614Mr7 != null) {
                UQ7 uq72 = c51614Mr7.A02;
                C14360o3.A0B(uq72, 0);
                UQ7 A1a = omniGridLayoutManager.A1a();
                int i = uq72.A01;
                int i2 = i - A1a.A01;
                int i3 = uq72.A03;
                int i4 = i3 - A1a.A03;
                uq7 = new UQ7(i2, i4, (uq72.A02 - i) + i2, (uq72.A00 - i3) + i4, 0);
                RecyclerView recyclerView = this.A0G;
                float scaleX = recyclerView.getScaleX();
                float scaleY = recyclerView.getScaleY();
                if (scaleX != 1.0f || scaleY != 1.0f) {
                    float pivotX = recyclerView.getPivotX();
                    float pivotY = recyclerView.getPivotY();
                    return new UQ7(A00(pivotX, scaleX, uq7.A01), A00(pivotY, scaleY, uq7.A03), A00(pivotX, scaleX, uq7.A02), A00(pivotY, scaleY, uq7.A00), 0);
                }
            }
        }
        return uq7;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Object obj;
        super.onConfigurationChanged(configuration);
        OmniGridLayoutManager omniGridLayoutManager = this.A0I;
        UQ7 A1a = omniGridLayoutManager.A1a();
        Iterator it = AbstractC001800i.A0p(omniGridLayoutManager.A07.A09).iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                break;
            } else {
                obj = it.next();
            }
        } while (((C51614Mr7) ((C0eP) obj).A01).A02.A00(A1a) < 1.0f);
        C0eP c0eP = (C0eP) obj;
        if (c0eP != null) {
            int i = c0eP.A00;
            if (Integer.valueOf(i) != null) {
                UQ7 uq7 = ((C51614Mr7) omniGridLayoutManager.A07.A09.get(i)).A02;
                omniGridLayoutManager.A05 = new QIw(i, uq7.A01 - omniGridLayoutManager.A00, uq7.A03 - omniGridLayoutManager.A01, 1);
            }
        }
    }

    public void setSelfView(View view) {
        this.A01 = view;
    }

    public void setSelfViewHolder(AbstractC51368MmT abstractC51368MmT) {
        this.A03 = abstractC51368MmT;
    }

    public final void setTapListener(InterfaceC57800PkS interfaceC57800PkS) {
        this.A06 = interfaceC57800PkS;
    }

    public final void setTouchInterceptor(View.OnTouchListener onTouchListener) {
        this.A00 = onTouchListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OmniGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OmniGridView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ OmniGridView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }
}
