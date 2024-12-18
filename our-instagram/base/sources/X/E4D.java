package X;

import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.recommended.FollowListData;
import com.instagram.user.userlist.fragment.UnifiedFollowFragment;
import java.util.List;

/* loaded from: classes6.dex */
public final class E4D extends AbstractC65852TvD {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public E4D(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // X.AbstractC65852TvD
    public final void A00(int i) {
        if (this.A00 == 0) {
            IgSegmentedTabLayout igSegmentedTabLayout = (IgSegmentedTabLayout) this.A02;
            igSegmentedTabLayout.A01 = igSegmentedTabLayout.A02;
            igSegmentedTabLayout.A02 = i;
        }
    }

    @Override // X.AbstractC65852TvD
    public final void A01(int i) {
        String str;
        boolean z;
        FollowListData followListData;
        String str2;
        String str3;
        if (this.A00 != 0) {
            UnifiedFollowFragment unifiedFollowFragment = (UnifiedFollowFragment) this.A02;
            List list = unifiedFollowFragment.A0L;
            if (list != null) {
                EnumC31556Dtg enumC31556Dtg = (EnumC31556Dtg) list.get(i);
                unifiedFollowFragment.A0A = enumC31556Dtg;
                if (unifiedFollowFragment.A0B != enumC31556Dtg) {
                    UserSession A0r = AbstractC166987dD.A0r(unifiedFollowFragment.A0U);
                    AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A01;
                    List list2 = unifiedFollowFragment.A0L;
                    if (list2 != null) {
                        switch (((EnumC31556Dtg) list2.get(i)).ordinal()) {
                            case 0:
                                str2 = AbstractC111324zv.A00(5458);
                                break;
                            case 1:
                                str2 = AbstractC111324zv.A00(5459);
                                break;
                            case 2:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 14:
                            case Process.SIGTERM /* 15 */:
                            default:
                                str2 = NetInfoModule.CONNECTION_TYPE_NONE;
                                break;
                            case 3:
                                str2 = "tap_mutual";
                                break;
                            case 4:
                                str2 = "tap_suggested_users";
                                break;
                            case 10:
                                str2 = "tap_members";
                                break;
                            case 11:
                                str2 = "tap_admins";
                                break;
                            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                                str2 = "tap_blocked";
                                break;
                            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                                str2 = "tap_subscriptions";
                                break;
                            case 16:
                                str2 = "tap_spam_followers";
                                break;
                        }
                        EnumC1571773w enumC1571773w = unifiedFollowFragment.A09;
                        if (enumC1571773w == null) {
                            str = "loggingFollowStatus";
                        } else {
                            String str4 = unifiedFollowFragment.A0H;
                            if (str4 == null) {
                                str = "profileUserId";
                            } else {
                                if (unifiedFollowFragment.A0Q) {
                                    str3 = "tab_header";
                                } else {
                                    str3 = "swipe";
                                }
                                C1571673v.A08(abstractC59962oe, A0r, enumC1571773w, str2, str4, null, null, str3);
                            }
                        }
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                }
                EnumC31556Dtg enumC31556Dtg2 = unifiedFollowFragment.A0A;
                unifiedFollowFragment.A0B = enumC31556Dtg2;
                unifiedFollowFragment.A0Q = false;
                Fragment fragment = null;
                if (enumC31556Dtg2 != null) {
                    C31537DtM c31537DtM = unifiedFollowFragment.A0D;
                    if (c31537DtM == null) {
                        str = "fragmentStateAdapter";
                    } else {
                        List list3 = unifiedFollowFragment.A0L;
                        if (list3 != null) {
                            int indexOf = list3.indexOf(enumC31556Dtg2);
                            SparseArray sparseArray = c31537DtM.A00.A04;
                            if (sparseArray == null) {
                                str = "fragmentSparseArray";
                            } else {
                                fragment = (Fragment) sparseArray.get(indexOf);
                            }
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                if (fragment instanceof C31535DtK) {
                    C31535DtK c31535DtK = (C31535DtK) fragment;
                    c31535DtK.A0X = true;
                    UserSession A03 = C31535DtK.A03(c31535DtK);
                    C14360o3.A0B(A03, 0);
                    boolean A06 = C18U.A06(C06090Tz.A06, A03, 36329247161204959L);
                    FollowListData followListData2 = c31535DtK.A0D;
                    if (followListData2 != null && A06) {
                        z = ((FQ7) c31535DtK.A0t.getValue()).A02.containsKey(new C38687GzS(followListData2.A00, followListData2.A02));
                    } else {
                        z = false;
                    }
                    if (c31535DtK.A0a && !c31535DtK.A0V) {
                        C31543DtT c31543DtT = c31535DtK.A0J;
                        if (c31543DtT == null) {
                            str = "paginationHelper";
                            C14360o3.A0F(str);
                            throw C00O.createAndThrow();
                        }
                        if (!c31543DtT.isLoading()) {
                            if (!A06 || !z) {
                                if (c31535DtK.isResumed()) {
                                    C31535DtK.A0C(c31535DtK);
                                }
                            }
                            followListData = c31535DtK.A0D;
                            if (followListData == null && z) {
                                C38687GzS c38687GzS = new C38687GzS(followListData.A00, followListData.A02);
                                InterfaceC09390do interfaceC09390do = c31535DtK.A0t;
                                ListenableFuture listenableFuture = (ListenableFuture) ((FQ7) interfaceC09390do.getValue()).A02.get(c38687GzS);
                                if (((FQ7) interfaceC09390do.getValue()).A02.containsKey(c38687GzS) && listenableFuture != null) {
                                    C31535DtK.A0F(c31535DtK);
                                    C2OD.A03(new Ft6(1, c38687GzS, c31535DtK), listenableFuture, c31535DtK.requireContext().getMainExecutor());
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    if (!A06) {
                        return;
                    }
                    followListData = c31535DtK.A0D;
                    if (followListData == null) {
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            str = "tabs";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.AbstractC65852TvD
    public final void A02(int i, float f, int i2) {
        if (this.A00 == 0) {
            IgSegmentedTabLayout igSegmentedTabLayout = (IgSegmentedTabLayout) this.A02;
            int i3 = igSegmentedTabLayout.A02;
            if (i3 == 1 || (i3 == 2 && igSegmentedTabLayout.A01 == 1)) {
                int ceil = (int) Math.ceil(i + f);
                C44436Jks c44436Jks = (C44436Jks) this.A01;
                View childAt = c44436Jks.getChildAt(ceil);
                igSegmentedTabLayout.scrollTo((int) (((childAt.getLeft() - ((igSegmentedTabLayout.getWidth() - childAt.getWidth()) / 2)) * f) + ((1.0f - f) * (r7.getLeft() - ((igSegmentedTabLayout.getWidth() - c44436Jks.getChildAt(i).getWidth()) / 2)))), 0);
                c44436Jks.onPageScrolled(i, f, i2);
            }
        }
    }
}
