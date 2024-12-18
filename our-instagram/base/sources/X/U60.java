package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes11.dex */
public final class U60 extends AbstractC59962oe implements InterfaceC60072op, C51D, InterfaceC72763Nx, InterfaceC72523Mz, InterfaceC72773Ny {
    public static final String __redex_internal_original_name = "IgBloksBottomSheetFragment";
    public View A00;
    public FrameLayout A01;
    public C126545np A05;
    public C62862tP A06;
    public C62862tP A07;
    public IgBloksScreenConfig A08;
    public C6T7 A09;
    public AbstractC18680vv A0A;
    public C57012jc A0B;
    public C189478aR A0C;
    public Integer A0E;
    public int A0G;
    public int A0H;
    public InterfaceC103384lE A0I;
    public C57012jc A0J;
    public C57112jm A0K;
    public C66201U3x A02 = null;
    public C66273U6s A03 = null;
    public boolean A0F = false;
    public InterfaceC72008XEw A04 = null;
    public C3DN A0D = null;

    @Override // X.InterfaceC72773Ny
    public final void DV2(X9M x9m, C6FG c6fg, C102884kP c102884kP) {
        C189468aQ c189468aQ;
        U5K A00 = U5L.A00(null, c6fg, null, c102884kP);
        if (A00 != null) {
            List list = A00.A07;
            if (list != null && !list.isEmpty()) {
                if (list.size() > 1) {
                    AbstractC25241Le.A02("invalid_screen", "Backing screens for bottom sheets only allow one navbar right button");
                }
                c189468aQ = A00((C102884kP) list.get(0));
            } else {
                c189468aQ = null;
            }
            C102884kP c102884kP2 = A00.A02;
            C189468aQ A002 = c102884kP2 != null ? A00(c102884kP2) : null;
            C189478aR c189478aR = this.A0C;
            if (c189478aR != null) {
                if (c189468aQ != null) {
                    c189478aR.A0K(c189468aQ, false);
                } else {
                    c189478aR.A0O(false);
                }
                if (A002 != null) {
                    c189478aR.A0J(A002, false);
                } else {
                    BottomSheetFragment bottomSheetFragment = c189478aR.A03;
                    BottomSheetFragment.A00(bottomSheetFragment).A01();
                    bottomSheetFragment.A0R();
                    bottomSheetFragment.A0R();
                }
                c189478aR.A0M(A00.A06);
            }
        }
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.InterfaceC72523Mz
    public final String BUi() {
        C66273U6s c66273U6s = this.A03;
        if (this.A08 != null && c66273U6s != null) {
            String str = c66273U6s.A09;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            return "bloks_unknown_class";
        }
        return "bloks_unknown_class";
    }

    @Override // X.InterfaceC72763Nx
    public final void DfM(int i) {
        C11T.A02(new U62(this, i));
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

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str;
        String str2;
        boolean isEmpty;
        IgBloksScreenConfig igBloksScreenConfig = this.A08;
        if (igBloksScreenConfig != null) {
            str2 = igBloksScreenConfig.A0R;
            C66273U6s c66273U6s = this.A03;
            c66273U6s.getClass();
            str = c66273U6s.A09;
            isEmpty = TextUtils.isEmpty(str2);
        } else {
            str = null;
            str2 = null;
            isEmpty = TextUtils.isEmpty(null);
        }
        if (isEmpty) {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            return "bloks_unknown";
        }
        return str2;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A0A;
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

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
    
        if (r0 != null) goto L10;
     */
    @Override // X.C51D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isScrolledToTop() {
        /*
            r2 = this;
            X.6T7 r0 = r2.A09
            if (r0 != 0) goto L12
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r2.A08
            if (r0 == 0) goto L1f
            X.U3x r0 = r2.A02
            if (r0 == 0) goto L21
            X.U3w r0 = r0.A04
            X.6T7 r0 = r0.A01
            if (r0 == 0) goto L1f
        L12:
            X.6FG r0 = r0.A02()
            if (r0 == 0) goto L1f
            boolean r1 = X.VR3.A00(r0)
            r0 = 0
            if (r1 == 0) goto L20
        L1f:
            r0 = 1
        L20:
            return r0
        L21:
            java.lang.String r1 = "BloksSurfaceController is null, have you initialized it for Screens?"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U60.isScrolledToTop():boolean");
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C1338462s c1338462s;
        InterfaceC103384lE interfaceC103384lE = this.A0I;
        if (interfaceC103384lE != null) {
            C62862tP c62862tP = this.A06;
            if (c62862tP != null) {
                Integer num = this.A0E;
                String str = null;
                if (num != null) {
                    c1338462s = (C1338462s) U6N.A00(this.A0A).A02(num.intValue());
                } else {
                    c1338462s = null;
                }
                C6FW c6fw = C6FW.A01;
                if (c1338462s != null) {
                    str = c1338462s.A03;
                }
                return C6DZ.A01(C6FP.A04(c62862tP, c6fw, interfaceC103384lE, str));
            }
            if (this.mView != null) {
                C0w9.A03(__redex_internal_original_name, "Bloks fragment has a view but no host");
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
        if (this.A08 != null) {
            C66201U3x c66201U3x = this.A02;
            if (c66201U3x != null) {
                C6T7 c6t7 = c66201U3x.A04.A01;
                if (c6t7 != null) {
                    c6t7.A06();
                }
            } else {
                throw new IllegalStateException("BloksSurfaceController is null, have you initialized it for Screens?");
            }
        }
        C6T7 c6t72 = this.A09;
        if (c6t72 != null) {
            c6t72.A06();
        }
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    private C189468aQ A00(C102884kP c102884kP) {
        WNX wnx;
        InterfaceC103384lE A0A = c102884kP.A0A();
        if (A0A != null) {
            wnx = new WNX(11, this, A0A, c102884kP);
        } else {
            wnx = null;
        }
        Context requireContext = requireContext();
        String str = "";
        String str2 = "";
        String A0G = c102884kP.A0G();
        if (A0G != null) {
            str2 = A0G;
        }
        String str3 = "";
        String A0I = c102884kP.A0I();
        if (A0I != null) {
            str3 = A0I;
        }
        String A0K = c102884kP.A0K();
        if (A0K != null) {
            str = A0K;
        }
        return AbstractC70200WGp.A0A(requireContext, wnx, null, null, str2, str3, str, c102884kP.A0S(44, true));
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        int A02 = C0f9.A02(-161205367);
        super.onCreate(bundle);
        this.A0A = C023409i.A0A.A04(requireArguments());
        C57112jm A0N = AbstractC31180DnO.A0N();
        this.A0K = A0N;
        AbstractC18680vv abstractC18680vv = this.A0A;
        Pair[] pairArr = {Pair.create(Integer.valueOf(R.id.bottom_sheet_id), this.A0C)};
        SparseArray sparseArray = new SparseArray();
        Pair pair = pairArr[0];
        sparseArray.put(((Number) pair.first).intValue(), pair.second);
        this.A06 = C62862tP.A00(sparseArray, this, this, abstractC18680vv, A0N);
        IgBloksScreenConfig A01 = IgBloksScreenConfig.A01(this.mArguments, this.A0A);
        this.A08 = A01;
        if (A01 != null) {
            C62862tP c62862tP = this.A06;
            if (A01.A0c) {
                c62862tP.A00 = true;
            }
            this.A0I = A01.A09;
            this.A0H = A01.A00;
            this.A0D = C3DN.A00.A00(getActivity());
            if (bundle == null) {
                bundle = this.mArguments;
            }
            this.A03 = C66201U3x.A01(bundle);
            Context requireContext = requireContext();
            C62862tP c62862tP2 = this.A06;
            C191778eZ A04 = this.A08.A04();
            C66201U3x A00 = C66201U3x.A00(requireContext, new SparseArray(), this.A03, this.A08.A07, c62862tP2, A04);
            this.A02 = A00;
            A00.A08(requireContext(), this);
            InterfaceC72008XEw interfaceC72008XEw = this.A02.A00;
            interfaceC72008XEw.getClass();
            this.A04 = interfaceC72008XEw;
            i = -1435802658;
        } else {
            C62862tP c62862tP3 = this.A07;
            if (c62862tP3 != null) {
                C62862tP c62862tP4 = this.A06;
                int i2 = 0;
                while (true) {
                    SparseArray sparseArray2 = c62862tP3.A01;
                    if (i2 >= sparseArray2.size()) {
                        break;
                    }
                    AbstractC65702TsY.A10(sparseArray2, c62862tP4.A01, i2);
                    i2++;
                }
                if (c62862tP3.A00) {
                    this.A06.A00 = true;
                }
            }
            Bundle requireArguments = requireArguments();
            this.A0E = AbstractC31179DnN.A0X(requireArguments, "content_key");
            C1338462s c1338462s = (C1338462s) U6N.A00(this.A0A).A02(this.A0E.intValue());
            if (c1338462s == null) {
                C0w9.A03(__redex_internal_original_name, "Bloks bottom sheet must pass in parse result");
                i = 19585950;
            } else {
                this.A0H = requireArguments.getInt("soft_input_mode");
                HashMap hashMap = null;
                if (requireArguments.containsKey("external_variables_key")) {
                    hashMap = (HashMap) U6N.A00(this.A0A).A02(requireArguments.getInt("external_variables_key"));
                }
                C6T8 A002 = C6T7.A00(requireContext(), c1338462s, this.A06);
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                A002.A01 = hashMap;
                this.A09 = A002.A00();
                requireArguments.getString("module_name");
                if (requireArguments.containsKey("backpress_key")) {
                    this.A0I = (InterfaceC103384lE) U6N.A00(this.A0A).A02(requireArguments.getInt("backpress_key"));
                }
                i = -891201565;
            }
        }
        C0f9.A09(i, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1687691054);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.bloks_bottom_sheet_fragment);
        C0f9.A09(-2058221264, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C69503VpY c69503VpY;
        int A02 = C0f9.A02(-1311309452);
        super.onDestroy();
        IgBloksScreenConfig igBloksScreenConfig = this.A08;
        if (igBloksScreenConfig != null && (c69503VpY = igBloksScreenConfig.A03) != null) {
            c69503VpY.A00(AbstractC03270Dk.A01(this.A0A));
        }
        if (requireActivity().isFinishing() || !requireActivity().isChangingConfigurations()) {
            IgBloksScreenConfig igBloksScreenConfig2 = this.A08;
            if (igBloksScreenConfig2 != null) {
                igBloksScreenConfig2.A05();
                C66201U3x c66201U3x = this.A02;
                if (c66201U3x != null) {
                    c66201U3x.A06();
                } else {
                    throw new IllegalStateException("BloksSurfaceController is null, have you initialized it for Screens?");
                }
            } else {
                U6N A00 = U6N.A00(this.A0A);
                Integer num = this.A0E;
                num.getClass();
                A00.A03(num.intValue());
            }
        }
        C6T7 c6t7 = this.A09;
        if (c6t7 != null) {
            c6t7.A03();
            this.A09 = null;
        }
        C0f9.A09(1867968740, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(316228893);
        super.onDestroyView();
        if (this.A08 != null) {
            C66201U3x c66201U3x = this.A02;
            if (c66201U3x != null) {
                c66201U3x.A07();
            } else {
                throw new IllegalStateException("BloksSurfaceController is null, have you initialized it for Screens?");
            }
        }
        C6T7 c6t7 = this.A09;
        if (c6t7 != null) {
            c6t7.A04();
        }
        FrameLayout frameLayout = this.A01;
        frameLayout.getClass();
        frameLayout.removeAllViews();
        this.A00 = null;
        this.A01 = null;
        this.A05 = null;
        this.A0F = false;
        C0f9.A09(1013085257, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(166143488);
        super.onPause();
        Activity rootActivity = getRootActivity();
        rootActivity.getClass();
        Window window = rootActivity.getWindow();
        if (window != null) {
            window.setSoftInputMode(this.A0G);
        }
        C0f9.A09(-1384833584, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1931901541);
        super.onResume();
        Activity rootActivity = getRootActivity();
        rootActivity.getClass();
        Window window = rootActivity.getWindow();
        if (window != null) {
            this.A0G = window.getAttributes().softInputMode;
            window.setSoftInputMode(this.A0H | 2);
        }
        C0f9.A09(100906312, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.A08 != null) {
            boolean booleanValue = AbstractC66275U6v.A00(this.A0A).booleanValue();
            C66201U3x c66201U3x = this.A02;
            if (c66201U3x != null) {
                C66273U6s c66273U6s = c66201U3x.A05;
                bundle.putString("__nav_data_type", "legacy_screen");
                if (booleanValue) {
                    bundle.putBoolean("BloksSurfaceProps_isFlattenedBundle", true);
                    bundle.putAll(C66273U6s.A00(c66273U6s, true));
                    return;
                } else {
                    bundle.putBundle("BloksSurfaceProps", C66273U6s.A00(c66273U6s, true));
                    return;
                }
            }
            throw new IllegalStateException("BloksSurfaceController is null, have you initialized it for Screens?");
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C126545np u3u;
        super.onViewCreated(view, bundle);
        this.A01 = (FrameLayout) view.requireViewById(R.id.bloks_container);
        this.A0B = AbstractC31177DnL.A0V(view, R.id.error_view_stub);
        this.A0J = AbstractC31177DnL.A0V(view, R.id.debug_error_view_stub);
        this.A0K.A06(this.A01, C71163Hc.A00(this));
        if (this.A08 != null) {
            C66201U3x c66201U3x = this.A02;
            if (c66201U3x != null) {
                Object obj = c66201U3x.A04(requireContext()).first;
                obj.getClass();
                u3u = (C126545np) obj;
            } else {
                throw new IllegalStateException("BloksSurfaceController is null, have you initialized it for Screens?");
            }
        } else {
            u3u = new U3u(requireContext());
        }
        this.A05 = u3u;
        if (this.A0F) {
            u3u.setVisibility(8);
        }
        this.A01.addView(this.A05);
        C6T7 c6t7 = this.A09;
        if (c6t7 != null) {
            c6t7.A07(this.A05);
        }
    }
}
