package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;
import com.instagram.notifications.badging.ui.component.ToastingBadge;
import com.instagram.ui.widget.proxy.ProxyFrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2lT */
/* loaded from: classes2.dex */
public abstract class AbstractC58112lT extends ProxyFrameLayout {
    public int A00;
    public C07X A01;
    public C5SW A02;
    public EnumC58122lU A03;
    public EnumC58122lU A04;
    public EnumC58122lU A05;
    public EnumC58122lU A06;
    public InterfaceC58442m3 A07;
    public InterfaceC58022lI A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public YN0 A0F;
    public String A0G;
    public final InterfaceC09670ek A0H;
    public final TypedArray A0I;
    public final EnumC58132lV A0J;
    public final Map A0K;
    public final Map A0L;
    public final InterfaceC09390do A0M;
    public final InterfaceC09390do A0N;
    public final InterfaceC09390do A0O;
    public final InterfaceC09390do A0P;
    public final InterfaceC09390do A0Q;
    public final InterfaceC09390do A0R;
    public final InterfaceC09390do A0S;
    public final InterfaceC09390do A0T;
    public final InterfaceC09390do A0U;

    public AbstractC58112lT(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C09530e4 c09530e4 = new C09530e4(0, EnumC58122lU.A08);
        EnumC58122lU enumC58122lU = EnumC58122lU.A03;
        LinkedHashMap A06 = AbstractC06930Yk.A06(c09530e4, new C09530e4(1, enumC58122lU), new C09530e4(2, EnumC58122lU.A07), new C09530e4(3, EnumC58122lU.A05));
        this.A0K = A06;
        EnumC58132lV enumC58132lV = EnumC58132lV.A02;
        LinkedHashMap A062 = AbstractC06930Yk.A06(new C09530e4(0, enumC58132lV), new C09530e4(1, EnumC58132lV.A03));
        this.A0L = A062;
        this.A0N = AbstractC09440dt.A01(new C206919Dw(this, 8));
        this.A0U = AbstractC09440dt.A01(new C206919Dw(this, 15));
        this.A0T = AbstractC09440dt.A01(new C206919Dw(this, 14));
        this.A0S = AbstractC09440dt.A01(new C206919Dw(this, 13));
        this.A0P = AbstractC09440dt.A01(new C206919Dw(this, 10));
        this.A0O = AbstractC09440dt.A01(new C206919Dw(this, 9));
        this.A0R = AbstractC09440dt.A01(new C206919Dw(this, 12));
        this.A0Q = AbstractC09440dt.A01(new C206919Dw(this, 11));
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC55922hc.A2K, 0, 0);
        C14360o3.A07(obtainStyledAttributes);
        this.A0I = obtainStyledAttributes;
        EnumC58122lU enumC58122lU2 = (EnumC58122lU) A06.get(Integer.valueOf(obtainStyledAttributes.getInt(1, -1)));
        this.A03 = enumC58122lU2 == null ? enumC58122lU : enumC58122lU2;
        this.A04 = (EnumC58122lU) A06.get(Integer.valueOf(obtainStyledAttributes.getInt(4, -1)));
        EnumC58122lU enumC58122lU3 = (EnumC58122lU) A06.get(Integer.valueOf(obtainStyledAttributes.getInt(8, -1)));
        this.A06 = enumC58122lU3 == null ? this.A03 : enumC58122lU3;
        EnumC58122lU enumC58122lU4 = (EnumC58122lU) A06.get(Integer.valueOf(obtainStyledAttributes.getInt(7, -1)));
        this.A05 = enumC58122lU4 == null ? this.A06 : enumC58122lU4;
        this.A0D = obtainStyledAttributes.getBoolean(6, false);
        this.A0E = obtainStyledAttributes.getBoolean(9, true);
        EnumC58132lV enumC58132lV2 = (EnumC58132lV) A062.get(Integer.valueOf(obtainStyledAttributes.getInt(10, -1)));
        this.A0J = enumC58132lV2 == null ? enumC58132lV : enumC58132lV2;
        this.A0C = obtainStyledAttributes.getBoolean(5, false);
        this.A00 = obtainStyledAttributes.getInt(3, 0);
        this.A0G = "0";
        this.A0M = AbstractC09440dt.A01(new C206919Dw(this, 7));
        View.inflate(context, R.layout.dot_badge, this);
        setClipChildren(false);
        setClipToPadding(false);
        super.A02.add(new View.OnClickListener() { // from class: X.2lW
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(2035487354);
                AbstractC58112lT.this.getViewModel().A02(false);
                C0f9.A0C(-1608855558, A05);
            }
        });
        obtainStyledAttributes.recycle();
        this.A0H = new InterfaceC09670ek() { // from class: X.2lX
            @Override // X.InterfaceC09670ek
            public final void DoQ(C07R c07r, C07X c07x) {
                C14360o3.A0B(c07r, 1);
                if (c07r == C07R.ON_RESUME) {
                    try {
                        AbstractC58112lT.this.getViewModel().A03();
                    } catch (Throwable th) {
                        new C09540e5(th);
                    }
                }
            }
        };
    }

    public abstract InterfaceC54692fR getViewModelFactory();

    public final void setBadgeDisplayStyle(EnumC58122lU enumC58122lU) {
        C14360o3.A0B(enumC58122lU, 0);
        this.A03 = enumC58122lU;
    }

    public final void setBadgeValue(String str) {
        C14360o3.A0B(str, 0);
        if (this.A09 && str.equals(this.A0G)) {
            return;
        }
        IgTextView numberBadgeTextView = getNumberBadgeTextView();
        if (numberBadgeTextView != null) {
            numberBadgeTextView.setText(str);
        }
        this.A0G = str;
    }

    public final void setLifecycleOwner(C07X c07x) {
        C14360o3.A0B(c07x, 0);
        this.A01 = c07x;
        C2GT c2gt = getViewModel().A06;
        C07X c07x2 = this.A01;
        if (c07x2 != null) {
            c2gt.A06(c07x2, new InterfaceC58362lv() { // from class: X.2lu
                @Override // X.InterfaceC58362lv
                public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                    EnumC58122lU enumC58122lU = (EnumC58122lU) obj;
                    AbstractC58112lT abstractC58112lT = AbstractC58112lT.this;
                    C14360o3.A0A(enumC58122lU);
                    AbstractC58112lT.A07(enumC58122lU, abstractC58112lT);
                }
            });
            C2GT c2gt2 = getViewModel().A07;
            C07X c07x3 = this.A01;
            if (c07x3 != null) {
                c2gt2.A06(c07x3, new InterfaceC58362lv() { // from class: X.2ly
                    @Override // X.InterfaceC58362lv
                    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                        Boolean bool = (Boolean) obj;
                        AbstractC58112lT abstractC58112lT = AbstractC58112lT.this;
                        C14360o3.A0A(bool);
                        AbstractC58112lT.A08(abstractC58112lT, bool.booleanValue());
                    }
                });
                C2GT c2gt3 = getViewModel().A05;
                C07X c07x4 = this.A01;
                if (c07x4 != null) {
                    c2gt3.A06(c07x4, new C58412m0(new C58402lz(this)));
                    if (this.A03 == EnumC58122lU.A08 || this.A0C) {
                        C2GT c2gt4 = getViewModel().A08;
                        C07X c07x5 = this.A01;
                        if (c07x5 != null) {
                            c2gt4.A06(c07x5, new InterfaceC58362lv() { // from class: X.2m1
                                @Override // X.InterfaceC58362lv
                                public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                                    C9BT c9bt = (C9BT) obj;
                                    AbstractC58112lT abstractC58112lT = AbstractC58112lT.this;
                                    C14360o3.A0A(c9bt);
                                    AbstractC58112lT.A06(c9bt, abstractC58112lT);
                                }
                            });
                        }
                    }
                    C07X c07x6 = this.A01;
                    if (c07x6 != null) {
                        c07x6.getLifecycle().A09(this.A0H);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F("lifecycleOwner");
        throw C00O.createAndThrow();
    }

    public final void setToastCappedFallbackDisplayStyle(EnumC58122lU enumC58122lU) {
        C14360o3.A0B(enumC58122lU, 0);
        this.A05 = enumC58122lU;
    }

    public final void setToastFallbackDisplayStyle(EnumC58122lU enumC58122lU) {
        C14360o3.A0B(enumC58122lU, 0);
        this.A06 = enumC58122lU;
    }

    private final ViewGroup getContainer() {
        return (ViewGroup) this.A0M.getValue();
    }

    private final Map getDisplayStyleToViewMap() {
        return (Map) this.A0N.getValue();
    }

    public final IgView getLedBadgeIgView() {
        return (IgView) this.A0O.getValue();
    }

    public final ViewStub getLedBadgeViewStub() {
        Object value = this.A0P.getValue();
        C14360o3.A07(value);
        return (ViewStub) value;
    }

    public final IgTextView getNumberBadgeTextView() {
        return (IgTextView) this.A0Q.getValue();
    }

    public final ViewStub getNumberBadgeViewStub() {
        Object value = this.A0R.getValue();
        C14360o3.A07(value);
        return (ViewStub) value;
    }

    public final IgView getToastBadgeIgView() {
        return (IgView) this.A0S.getValue();
    }

    public final ViewStub getToastBadgeViewStub() {
        Object value = this.A0T.getValue();
        C14360o3.A07(value);
        return (ViewStub) value;
    }

    public static /* synthetic */ void setLedBadgeOffsetsInDPs$default(AbstractC58112lT abstractC58112lT, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            abstractC58112lT.A0A(i, i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setLedBadgeOffsetsInDPs");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getId() == R.id.wrapper) {
            super.addView(view, i, layoutParams);
            return;
        }
        ViewGroup container = getContainer();
        if (container == null) {
            return;
        }
        container.addView(view, i, layoutParams);
    }

    public final EnumC58122lU getBadgeDisplayStyle() {
        return this.A03;
    }

    public final YN0 getCappedBadgeValueProvider() {
        return null;
    }

    public final boolean getCheckAnchorVisibilityWhenShowingTooltip() {
        return this.A0A;
    }

    public final boolean getEnablePrismCircularDesign() {
        return this.A0B;
    }

    public final int getNumberCap() {
        return this.A00;
    }

    public final EnumC58122lU getSelectedDisplayStyle() {
        return this.A04;
    }

    public final boolean getShouldToast() {
        return this.A0C;
    }

    public final boolean getShowBadgeWhenSelected() {
        return this.A0D;
    }

    public final EnumC58122lU getToastCappedFallbackDisplayStyle() {
        return this.A05;
    }

    public final EnumC58122lU getToastFallbackDisplayStyle() {
        return this.A06;
    }

    public final boolean getToastWhenSelected() {
        return this.A0E;
    }

    public final InterfaceC58442m3 getTooltipClickListener() {
        return this.A07;
    }

    public final InterfaceC58022lI getTooltipStateChangeListener() {
        return this.A08;
    }

    public final AbstractC58182la getViewModel() {
        return (AbstractC58182la) this.A0U.getValue();
    }

    public final void setPrismLedBadgeEnabled(boolean z) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (z) {
            IgView ledBadgeIgView = getLedBadgeIgView();
            if (ledBadgeIgView != null) {
                ledBadgeIgView.setBackground(getContext().getDrawable(R.drawable.prism_red_pill_with_border));
            }
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
            IgView ledBadgeIgView2 = getLedBadgeIgView();
            if (ledBadgeIgView2 != null && (layoutParams2 = ledBadgeIgView2.getLayoutParams()) != null) {
                layoutParams2.height = dimensionPixelSize;
            }
            IgView ledBadgeIgView3 = getLedBadgeIgView();
            if (ledBadgeIgView3 != null && (layoutParams = ledBadgeIgView3.getLayoutParams()) != null) {
                layoutParams.width = dimensionPixelSize;
            }
            A0A(-3, -2);
        }
    }

    public static final /* synthetic */ ViewStub A00(AbstractC58112lT abstractC58112lT) {
        return abstractC58112lT.getLedBadgeViewStub();
    }

    public static final /* synthetic */ ViewStub A01(AbstractC58112lT abstractC58112lT) {
        return abstractC58112lT.getNumberBadgeViewStub();
    }

    public static final /* synthetic */ ViewStub A02(AbstractC58112lT abstractC58112lT) {
        return abstractC58112lT.getToastBadgeViewStub();
    }

    public static final /* synthetic */ IgTextView A03(AbstractC58112lT abstractC58112lT) {
        return abstractC58112lT.getNumberBadgeTextView();
    }

    public static final /* synthetic */ IgView A04(AbstractC58112lT abstractC58112lT) {
        return abstractC58112lT.getLedBadgeIgView();
    }

    public static final /* synthetic */ IgView A05(AbstractC58112lT abstractC58112lT) {
        return abstractC58112lT.getToastBadgeIgView();
    }

    public static final void A06(final C9BT c9bt, final AbstractC58112lT abstractC58112lT) {
        Activity activity;
        C5SW c5sw;
        Context context = abstractC58112lT.getContext();
        if ((context instanceof Activity) && (activity = (Activity) context) != null && !c9bt.A03) {
            C33H c33h = new C33H() { // from class: X.5SR
                @Override // X.C33H, X.C33I
                public final boolean Dtk(C5SW c5sw2) {
                    java.util.Set set;
                    C54432ex c54432ex;
                    C14360o3.A0B(c5sw2, 0);
                    AbstractC58112lT abstractC58112lT2 = abstractC58112lT;
                    AbstractC58182la viewModel = abstractC58112lT2.getViewModel();
                    List list = (List) c9bt.A02;
                    if (list != null) {
                        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((C206379Bu) it.next()).A03);
                        }
                        set = AbstractC001800i.A0k(arrayList);
                    } else {
                        set = null;
                    }
                    C58172lZ c58172lZ = (C58172lZ) viewModel;
                    if ((!((Boolean) c58172lZ.A0I.getValue()).booleanValue() || c58172lZ.A03) && (c54432ex = ((AbstractC58182la) c58172lZ).A01) != null) {
                        C54392et c54392et = c58172lZ.A00;
                        EnumC58162lY enumC58162lY = c58172lZ.A02;
                        EnumC58122lU enumC58122lU = EnumC58122lU.A08;
                        c54392et.A05(enumC58122lU, enumC58162lY, c54432ex, C58172lZ.A00(c54432ex));
                        C54412ev c54412ev = c58172lZ.A01;
                        C14360o3.A0B(enumC58162lY, 0);
                        c54412ev.A03(new C72053Ld(enumC58122lU, enumC58162lY, null, set), c54432ex, false);
                    }
                    InterfaceC58442m3 interfaceC58442m3 = abstractC58112lT2.A07;
                    if (interfaceC58442m3 != null) {
                        interfaceC58442m3.Dtm();
                        return true;
                    }
                    return true;
                }

                @Override // X.C33H, X.C33I
                public final void Dto(C5SW c5sw2) {
                    EnumC58212ld enumC58212ld;
                    AbstractC58182la viewModel = abstractC58112lT.getViewModel();
                    C54432ex c54432ex = viewModel.A01;
                    if (c54432ex != null && c54432ex.A00() > 0) {
                        enumC58212ld = EnumC58212ld.A02;
                    } else {
                        enumC58212ld = EnumC58212ld.A03;
                    }
                    viewModel.A01(enumC58212ld);
                }

                @Override // X.C33H, X.C33I
                public final void Dtq(C5SW c5sw2) {
                    AbstractC58112lT abstractC58112lT2 = abstractC58112lT;
                    abstractC58112lT2.getViewModel().A01(EnumC58212ld.A04);
                    InterfaceC58022lI interfaceC58022lI = abstractC58112lT2.A08;
                    if (interfaceC58022lI != null) {
                        final C58012lH c58012lH = (C58012lH) interfaceC58022lI;
                        C3DN bottomSheetNavigator = c58012lH.A05.getBottomSheetNavigator();
                        if (bottomSheetNavigator != null) {
                            bottomSheetNavigator.A0R(new AbstractC86353t7() { // from class: X.9q2
                                @Override // X.AbstractC86353t7, X.InterfaceC86363t8
                                public final void CwQ(float f) {
                                    ToastingBadge toastingBadge = C58012lH.this.A00;
                                    if (toastingBadge != null) {
                                        C5SW c5sw3 = ((AbstractC58112lT) toastingBadge).A02;
                                        if (c5sw3 != null) {
                                            c5sw3.A08(false);
                                        }
                                        AbstractC166997dE.A1Y(toastingBadge.getViewModel().A0J, true);
                                    }
                                }

                                @Override // X.AbstractC86353t7, X.InterfaceC86363t8
                                public final void DB6() {
                                    ToastingBadge toastingBadge = C58012lH.this.A00;
                                    if (toastingBadge != null) {
                                        AbstractC166997dE.A1Y(toastingBadge.getViewModel().A0J, false);
                                    }
                                }
                            });
                        }
                    }
                }

                @Override // X.C33H, X.C33I
                public final void Dtt(C5SW c5sw2) {
                    java.util.Set set;
                    AbstractC58182la viewModel = abstractC58112lT.getViewModel();
                    List list = (List) c9bt.A02;
                    if (list != null) {
                        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((C206379Bu) it.next()).A03);
                        }
                        set = AbstractC001800i.A0k(arrayList);
                    } else {
                        set = null;
                    }
                    C58172lZ c58172lZ = (C58172lZ) viewModel;
                    C54432ex c54432ex = ((AbstractC58182la) c58172lZ).A01;
                    if (c54432ex != null && c54432ex.A01 + c54432ex.A00 > 0) {
                        C54392et c54392et = c58172lZ.A00;
                        EnumC58162lY enumC58162lY = c58172lZ.A02;
                        EnumC58122lU enumC58122lU = EnumC58122lU.A08;
                        c54392et.A06(enumC58122lU, enumC58162lY, c54432ex, C58172lZ.A00(c54432ex));
                        C54412ev c54412ev = c58172lZ.A01;
                        C14360o3.A0B(enumC58162lY, 0);
                        c54412ev.A02(new C72053Ld(enumC58122lU, enumC58162lY, null, set), c54432ex);
                    }
                }
            };
            C5ST c5st = new C5ST((List) c9bt.A02) { // from class: X.5SS
                public final List A00;

                {
                    C14360o3.A0B(r2, 1);
                    this.A00 = r2;
                }

                @Override // X.C5ST
                public final /* bridge */ /* synthetic */ AbstractC117215Sg ANT(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                    C14360o3.A0B(layoutInflater, 0);
                    C14360o3.A0B(viewGroup, 1);
                    View inflate = layoutInflater.inflate(R.layout.activity_tab_tooltip, viewGroup, false);
                    C14360o3.A07(inflate);
                    return new C117205Sf(inflate);
                }

                @Override // X.C5ST
                public final /* bridge */ /* synthetic */ void ADz(C5SV c5sv, AbstractC117215Sg abstractC117215Sg) {
                    C117205Sf c117205Sf = (C117205Sf) abstractC117215Sg;
                    C14360o3.A0B(c117205Sf, 0);
                    List<C206379Bu> list = this.A00;
                    List list2 = c117205Sf.A00;
                    Iterator it = list2.iterator();
                    int i = 0;
                    for (C206379Bu c206379Bu : list) {
                        int i2 = c206379Bu.A01;
                        if (i2 > 0) {
                            TextView textView = (TextView) it.next();
                            int i3 = c206379Bu.A02;
                            textView.setVisibility(0);
                            textView.setText(String.valueOf(i2));
                            textView.setCompoundDrawablesWithIntrinsicBounds(i3, 0, 0, 0);
                            Context context2 = textView.getContext();
                            textView.setCompoundDrawableTintList(ColorStateList.valueOf(context2.getColor(AbstractC53242c7.A0H(context2, R.attr.igds_color_icon_on_color))));
                            i++;
                            if (i >= list2.size()) {
                                break;
                            }
                        }
                    }
                    while (it.hasNext()) {
                        ((View) it.next()).setVisibility(8);
                    }
                }
            };
            ViewGroup container = abstractC58112lT.getContainer();
            if (container != null) {
                C5SU c5su = new C5SU(activity, c5st);
                c5su.A03(container);
                c5su.A06(abstractC58112lT.A0J);
                c5su.A0F = true;
                C5SV c5sv = C5SV.A08;
                c5su.A08 = c5sv;
                c5su.A07 = c5sv;
                c5su.A00 = c9bt.A01;
                c5su.A0A = false;
                c5su.A0E = abstractC58112lT.A0B;
                c5su.A04 = c33h;
                c5su.A0D = abstractC58112lT.A0A;
                c5sw = c5su.A00();
            } else {
                c5sw = null;
            }
            abstractC58112lT.A02 = c5sw;
            if (c5sw != null) {
                c5sw.A07(null);
            }
        }
    }

    public static final void A07(EnumC58122lU enumC58122lU, AbstractC58112lT abstractC58112lT) {
        int i;
        View view;
        View badge = abstractC58112lT.getBadge();
        if (badge != null) {
            i = badge.getVisibility();
        } else {
            i = 8;
        }
        abstractC58112lT.A03 = enumC58122lU;
        for (Map.Entry entry : abstractC58112lT.getDisplayStyleToViewMap().entrySet()) {
            Object value = entry.getValue();
            if ((value instanceof View) && (view = (View) value) != null) {
                int i2 = 8;
                if (entry.getKey() == enumC58122lU) {
                    i2 = i;
                }
                view.setVisibility(i2);
            }
        }
    }

    public static final void A08(AbstractC58112lT abstractC58112lT, boolean z) {
        Integer num;
        View badge = abstractC58112lT.getBadge();
        View view = null;
        if (badge != null) {
            num = Integer.valueOf(badge.getVisibility());
        } else {
            num = null;
        }
        int i = 8;
        if (z) {
            i = 0;
        }
        View badge2 = abstractC58112lT.getBadge();
        if (badge2 != null) {
            if ((badge2 instanceof ViewStub) && z) {
                ViewStub viewStub = (ViewStub) badge2;
                if (viewStub.getParent() != null) {
                    view = viewStub.inflate();
                } else {
                    view = abstractC58112lT.findViewById(viewStub.getInflatedId());
                }
                C14360o3.A0A(view);
            } else {
                view = badge2;
            }
        }
        if ((num == null || i != num.intValue()) && view != null) {
            view.setVisibility(i);
        }
    }

    private final View getBadge() {
        Object obj = getDisplayStyleToViewMap().get(this.A03);
        if (obj instanceof View) {
            return (View) obj;
        }
        return null;
    }

    public final void A09() {
        C54432ex c54432ex;
        C58172lZ c58172lZ = (C58172lZ) getViewModel();
        if ((!((Boolean) c58172lZ.A0I.getValue()).booleanValue() || c58172lZ.A03) && (c54432ex = ((AbstractC58182la) c58172lZ).A01) != null) {
            C54392et c54392et = c58172lZ.A00;
            EnumC58162lY enumC58162lY = c58172lZ.A02;
            EnumC58122lU enumC58122lU = EnumC58122lU.A03;
            c54392et.A05(enumC58122lU, enumC58162lY, c54432ex, null);
            C54412ev c54412ev = c58172lZ.A01;
            C14360o3.A0B(enumC58162lY, 0);
            c54412ev.A03(new C72053Ld(enumC58122lU, enumC58162lY, null, null), c54432ex, true);
        }
    }

    public final void A0A(int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        IgView ledBadgeIgView = getLedBadgeIgView();
        ViewGroup.LayoutParams layoutParams = null;
        if (ledBadgeIgView != null) {
            layoutParams = ledBadgeIgView.getLayoutParams();
        }
        if ((layoutParams instanceof C56302iJ) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            Context context = getContext();
            C14360o3.A07(context);
            marginLayoutParams.setMarginEnd((int) AbstractC13880nE.A04(context, i));
            marginLayoutParams.topMargin = (int) AbstractC13880nE.A04(context, i2);
            IgView ledBadgeIgView2 = getLedBadgeIgView();
            if (ledBadgeIgView2 != null) {
                ledBadgeIgView2.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public final boolean A0B() {
        View badge = getBadge();
        if (badge == null || badge.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getViewModel().A0I.Egh(Boolean.valueOf(isSelected()));
    }

    public final String getBadgeValue() {
        CharSequence charSequence;
        IgTextView numberBadgeTextView = getNumberBadgeTextView();
        if (numberBadgeTextView != null) {
            charSequence = numberBadgeTextView.getText();
        } else {
            charSequence = null;
        }
        return String.valueOf(charSequence);
    }

    public final boolean getTooltipVisible() {
        if (getViewModel().A0H.getValue() != EnumC58212ld.A04) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-261424511);
        super.onDetachedFromWindow();
        C2GT c2gt = getViewModel().A06;
        C07X c07x = this.A01;
        if (c07x != null) {
            c2gt.A05(c07x);
            C2GT c2gt2 = getViewModel().A07;
            C07X c07x2 = this.A01;
            if (c07x2 != null) {
                c2gt2.A05(c07x2);
                C2GT c2gt3 = getViewModel().A05;
                C07X c07x3 = this.A01;
                if (c07x3 != null) {
                    c2gt3.A05(c07x3);
                    C2GT c2gt4 = getViewModel().A08;
                    C07X c07x4 = this.A01;
                    if (c07x4 != null) {
                        c2gt4.A05(c07x4);
                        C07X c07x5 = this.A01;
                        if (c07x5 != null) {
                            c07x5.getLifecycle().A0A(this.A0H);
                            C0f9.A0D(-931718746, A06);
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F("lifecycleOwner");
        throw C00O.createAndThrow();
    }

    public final void setBugFixLazyLoad(boolean z) {
        this.A09 = z;
    }

    public final void setCappedBadgeValueProvider(YN0 yn0) {
        this.A0F = yn0;
    }

    public final void setCheckAnchorVisibilityWhenShowingTooltip(boolean z) {
        this.A0A = z;
    }

    public final void setEnablePrismCircularDesign(boolean z) {
        this.A0B = z;
    }

    public final void setNumberCap(int i) {
        this.A00 = i;
    }

    public final void setSelectedDisplayStyle(EnumC58122lU enumC58122lU) {
        this.A04 = enumC58122lU;
    }

    public final void setShouldToast(boolean z) {
        this.A0C = z;
    }

    public final void setShowBadgeWhenSelected(boolean z) {
        this.A0D = z;
    }

    public final void setToastWhenSelected(boolean z) {
        this.A0E = z;
    }

    public final void setTooltipClickListener(InterfaceC58442m3 interfaceC58442m3) {
        this.A07 = interfaceC58442m3;
    }

    public final void setTooltipStateChangeListener(InterfaceC58022lI interfaceC58022lI) {
        this.A08 = interfaceC58022lI;
    }
}
