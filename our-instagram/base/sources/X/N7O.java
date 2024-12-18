package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.ui.widget.recyclerview.FastScrollingLinearLayoutManager;

/* loaded from: classes9.dex */
public final class N7O extends AbstractC59962oe implements C51D, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "UserPaySupporterListBottomSheetFragment";
    public TextView A00;
    public TextView A01;
    public OKz A02;
    public C51160Mj3 A03;
    public Integer A05;
    public Long A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public RecyclerView A0D;
    public final InterfaceC09390do A0F = C57517Pfr.A00(this, 33);
    public EnumC53158NfD A04 = EnumC53158NfD.A02;
    public final InterfaceC09390do A0E = C57517Pfr.A00(this, 32);
    public final InterfaceC09390do A0G = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        if (!AbstractC167007dF.A1Z(this.A0E) ? this.A0A : this.A04 == EnumC53158NfD.A04) {
            interfaceC56362iU.Efu(2131965602);
            interfaceC56362iU.EkS(true);
        } else {
            interfaceC56362iU.EkF(false);
        }
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String str;
        int intValue;
        String str2;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            String str3 = "0";
            String string2 = bundle2.getString("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_NUM_BADGES", "0");
            if (string2 != null) {
                str3 = string2;
            }
            String str4 = null;
            if (A00(this)) {
                TextView A0e = AbstractC166987dD.A0e(view, R.id.title);
                String A0k = AbstractC167017dG.A0k(AbstractC166997dE.A0L(view).getResources(), AbstractC167017dG.A0K(AbstractC003100w.A0i(str3)), R.plurals.live_user_pay_badges_uppercase);
                C14360o3.A07(A0k);
                A0e.setText(A0k);
                A0e.setVisibility(0);
                A0e.setGravity(17);
                Integer A0i = AbstractC003100w.A0i(str3);
                if (A0i != null && A0i.intValue() != 0) {
                    AbstractC43592JPx.A1I(view, R.id.sort_selector, 0);
                    TextView A0e2 = AbstractC166987dD.A0e(view, R.id.sort_by_time);
                    this.A01 = A0e2;
                    str2 = "timeSortButton";
                    if (A0e2 != null) {
                        AbstractC56952jT.A01(A0e2);
                        TextView textView = this.A01;
                        if (textView != null) {
                            ViewOnClickListenerC55468OkN.A00(textView, 53, view, this);
                            TextView A0e3 = AbstractC166987dD.A0e(view, R.id.sort_by_amount);
                            this.A00 = A0e3;
                            str2 = "amountSortButton";
                            if (A0e3 != null) {
                                AbstractC56952jT.A01(A0e3);
                                TextView textView2 = this.A00;
                                if (textView2 != null) {
                                    ViewOnClickListenerC55468OkN.A00(textView2, 54, view, this);
                                }
                            }
                        }
                    }
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                TextView A0e4 = AbstractC166987dD.A0e(view, R.id.subheader_text);
                A0e4.setVisibility(0);
                AbstractC25227BEk.A12(A0e4, this, 2131953636);
                TextView A0e5 = AbstractC166987dD.A0e(view, R.id.estimated_earnings);
                A0e5.setVisibility(0);
                AbstractC25227BEk.A12(A0e5, this, 2131976555);
                TextView A0e6 = AbstractC166987dD.A0e(view, R.id.estimated_earnings_amount);
                A0e6.setVisibility(0);
                A0e6.setText(bundle2.getString("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_BADGES_ESTIMATED_EARNINGS", "$0"));
                View findViewById = view.findViewById(R.id.info_button);
                findViewById.setVisibility(0);
                C0fQ.A00(null, findViewById);
            } else if (this.A04 == EnumC53158NfD.A05) {
                TextView A0e7 = AbstractC166987dD.A0e(view, R.id.title);
                if (this.A06 != null) {
                    str4 = C23831Eq.A01(r0.longValue());
                }
                String str5 = this.A09;
                if (str5 != null && !AbstractC001900j.A0T(str5)) {
                    string = this.A09;
                } else {
                    string = getString(2131953624);
                }
                if (str4 == null || (str = getString(2131953623, string, str4)) == null) {
                    str = string;
                }
                A0e7.setText(str);
                A0e7.setVisibility(0);
                A0e7.setGravity(8388611);
                Integer num = this.A05;
                if (num != null && (intValue = num.intValue()) != 0) {
                    TextView A0e8 = AbstractC166987dD.A0e(view, R.id.subheader_text);
                    A0e8.setVisibility(0);
                    A0e8.setText(AbstractC167017dG.A0k(view.getResources(), intValue, R.plurals.user_pay_badges_thanks_sticker_notification_description));
                }
                view.findViewById(R.id.divider).setVisibility(8);
            }
            RecyclerView A0B = AbstractC43592JPx.A0B(view, R.id.supporter_list_recycler_view);
            A0B.setLayoutManager(new FastScrollingLinearLayoutManager(view.getContext()));
            AbstractC37304Gc5.A0y(A0B.A0D, A0B, new P2N(this, 8), C153146ui.A0A);
            C51160Mj3 c51160Mj3 = this.A03;
            if (c51160Mj3 == null) {
                str2 = "adapter";
            } else {
                A0B.setAdapter(c51160Mj3);
                this.A0D = A0B;
                if (!A00(this)) {
                    if (C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(this.A0G, 0), 36312402299520102L) && this.A04 != EnumC53158NfD.A05) {
                        OKz oKz = this.A02;
                        if (oKz == null) {
                            str2 = "interactor";
                        } else {
                            oKz.A00().A06(this, new C55560Olu(2, view, this));
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
    }

    public static final boolean A00(N7O n7o) {
        if (AbstractC167007dF.A1Z(n7o.A0E)) {
            if (n7o.A04 == EnumC53158NfD.A02) {
                return true;
            }
            return false;
        }
        if (!n7o.A0B && !n7o.A0A) {
            return true;
        }
        return false;
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
        return AbstractC166987dD.A0n(this.A0G);
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
        if (this.A0D == null) {
            C14360o3.A0F("recyclerView");
            throw C00O.createAndThrow();
        }
        return !AbstractC43592JPx.A1X(r0);
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
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
        if (i == 1 && i2 == -1) {
            this.A0C = true;
            C9GR.A07(requireContext(), 2131953634);
            View view = this.mView;
            if (view != null) {
                AbstractC167007dF.A0x(view.findViewById(R.id.supporter_list_action_button));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        Integer num;
        String str3;
        Long l;
        boolean z;
        boolean z2;
        EnumC53158NfD enumC53158NfD;
        int A02 = C0f9.A02(-973380144);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        Object obj = null;
        if (bundle2 != null) {
            str = bundle2.getString("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_MEDIA_ID");
        } else {
            str = null;
        }
        C14360o3.A0A(str);
        this.A08 = str;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            str2 = bundle3.getString("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_INSIGHTS_ID");
        } else {
            str2 = null;
        }
        this.A07 = str2;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            num = Integer.valueOf(bundle4.getInt("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_NUM_SUPPORTERS"));
        } else {
            num = null;
        }
        this.A05 = num;
        Bundle bundle5 = this.mArguments;
        if (bundle5 != null) {
            str3 = bundle5.getString("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_MEDIA_INSIGHT_TITLE");
        } else {
            str3 = null;
        }
        this.A09 = str3;
        Bundle bundle6 = this.mArguments;
        if (bundle6 != null) {
            l = Long.valueOf(bundle6.getLong("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_MEDIA_INSIGHT_DATETIME"));
        } else {
            l = null;
        }
        this.A06 = l;
        InterfaceC09390do interfaceC09390do = this.A0E;
        boolean A1Z = AbstractC167007dF.A1Z(interfaceC09390do);
        boolean z3 = false;
        Bundle bundle7 = this.mArguments;
        if (A1Z) {
            if (bundle7 != null) {
                obj = bundle7.get("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_ENTRY_POINT");
            }
            if (!(obj instanceof EnumC53158NfD) || (enumC53158NfD = (EnumC53158NfD) obj) == null) {
                enumC53158NfD = EnumC53158NfD.A02;
            }
            this.A04 = enumC53158NfD;
        } else {
            if (bundle7 != null) {
                z = bundle7.getBoolean("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_IS_FROM_SETTINGS");
            } else {
                z = false;
            }
            this.A0A = z;
            Bundle bundle8 = this.mArguments;
            if (bundle8 != null) {
                z2 = bundle8.getBoolean("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_IS_POST_LIVE");
            } else {
                z2 = false;
            }
            this.A0B = z2;
        }
        if (AbstractC167007dF.A1Z(interfaceC09390do)) {
            if (this.A04 == EnumC53158NfD.A04) {
                z3 = true;
            }
        } else {
            z3 = this.A0A;
        }
        this.A03 = new C51160Mj3(this, this, A00(this), z3);
        OKz oKz = new OKz(new O6G(new O6F(AbstractC166987dD.A0r(this.A0G))));
        this.A02 = oKz;
        String str4 = this.A08;
        if (str4 != null) {
            oKz.A01(str4, true, this.A07);
            OKz oKz2 = this.A02;
            if (oKz2 != null) {
                oKz2.A00().A06(this, new MY1(this, 18));
                if (A00(this)) {
                    OKz oKz3 = this.A02;
                    if (oKz3 != null) {
                        oKz3.A00 = "time";
                        String str5 = this.A08;
                        if (str5 != null) {
                            oKz3.A01(str5, true, this.A07);
                            OKz oKz4 = this.A02;
                            if (oKz4 != null) {
                                oKz4.A00().A06(this, new MY1(this, 19));
                            }
                        }
                    }
                }
                C0f9.A09(1766412958, A02);
                return;
            }
            C14360o3.A0F("interactor");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F("mediaId");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1438316491);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.iglive_user_pay_supporter_list_bottom_sheet, viewGroup, false);
        C0f9.A09(-2041749289, A02);
        return inflate;
    }

    @Override // X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
    }
}
