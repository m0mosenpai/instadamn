package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.GalleryMediaGridView;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.9fV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214939fV extends AbstractC59962oe implements C51D, InterfaceC62612t0, MQK {
    public static final String __redex_internal_original_name = "RemoteSharedMediaPickerFragment";
    public ShimmerFrameLayout A00;
    public C187198Rm A01;
    public C44559Jnf A02;
    public String A03;
    public boolean A04;
    public C88Z A05;
    public C61972ry A06;
    public GalleryMediaGridView A07;
    public String A08;
    public final HashMap A09 = AbstractC166987dD.A1G();
    public final InterfaceC09390do A0A = AbstractC60492pY.A02(this);

    private final void A00() {
        String str;
        C25621Ms c25621Ms;
        String str2;
        String str3;
        this.A04 = true;
        if (this.A03 == null) {
            ShimmerFrameLayout shimmerFrameLayout = this.A00;
            str2 = "shimmerView";
            if (shimmerFrameLayout != null) {
                shimmerFrameLayout.A02();
                ShimmerFrameLayout shimmerFrameLayout2 = this.A00;
                if (shimmerFrameLayout2 != null) {
                    shimmerFrameLayout2.setVisibility(0);
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
        C88Z c88z = this.A05;
        if (c88z == null) {
            str3 = "Cannot create Media Picker task with a null create mode type";
        } else {
            int ordinal = c88z.ordinal();
            if (ordinal != 8) {
                if (ordinal != 31) {
                    str3 = "Cannot create Media Picker task from this create mode type";
                } else {
                    AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A0A);
                    str = this.A03;
                    c25621Ms = new C25621Ms(A0o);
                    c25621Ms.A06();
                    c25621Ms.A0B("stories/end_of_year/get_end_of_year_media/");
                }
            } else {
                AbstractC12990ll A0o2 = AbstractC166987dD.A0o(this.A0A);
                String str4 = this.A08;
                str = this.A03;
                c25621Ms = new C25621Ms(A0o2);
                c25621Ms.A06();
                c25621Ms.A0L("creatives/create_mode/list_user_media/%s/", str4);
            }
            c25621Ms.A0S(C214429eg.class, ADZ.class);
            c25621Ms.A9s("page_size", "50");
            if (!TextUtils.isEmpty(str)) {
                c25621Ms.A9s("max_id", str);
            }
            C1ON A0N = c25621Ms.A0N();
            A0N.A00 = new C207879Ht(this, 9);
            C61972ry c61972ry = this.A06;
            if (c61972ry == null) {
                str2 = "loaderScheduler";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            }
            c61972ry.schedule(A0N);
            return;
        }
        AbstractC12120kG.A07("RemoteSharedMediaPickerFragment::makeRequest", str3, null);
    }

    @Override // X.MQK
    public final void DSA(GalleryItem galleryItem, boolean z) {
        C14360o3.A0B(galleryItem, 0);
        C187198Rm c187198Rm = this.A01;
        String str = "delegate";
        if (c187198Rm != null) {
            if (c187198Rm.A0Y.A01.size() < 10) {
                Object obj = this.A09.get(galleryItem.A0A);
                if (obj != null) {
                    C38321qM c38321qM = (C38321qM) obj;
                    C187198Rm c187198Rm2 = this.A01;
                    if (c187198Rm2 != null) {
                        c187198Rm2.A08(null, c38321qM);
                        return;
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                C44559Jnf c44559Jnf = this.A02;
                if (c44559Jnf == null) {
                    str = "adapter";
                } else {
                    List list = c44559Jnf.A02;
                    int indexOf = list.indexOf(galleryItem.A0A);
                    if (indexOf == -1) {
                        return;
                    }
                    list.remove(indexOf);
                    c44559Jnf.notifyDataSetChanged();
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "media_picker_fragment";
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        String string = requireArguments().getString("dial_element_type");
        if (string == null) {
            string = "";
        }
        RandomAccess stringArrayList = requireArguments().getStringArrayList("selected_media_ids");
        if (stringArrayList == null) {
            stringArrayList = C16930sl.A00;
        }
        this.A00 = (ShimmerFrameLayout) view.requireViewById(R.id.media_picker_shimmer);
        this.A05 = AbstractC225759xu.A00(string);
        C44559Jnf c44559Jnf = new C44559Jnf(this);
        this.A02 = c44559Jnf;
        List list = c44559Jnf.A02;
        list.clear();
        list.addAll(stringArrayList);
        GalleryMediaGridView galleryMediaGridView = (GalleryMediaGridView) view.requireViewById(R.id.media_picker_grid_view);
        this.A07 = galleryMediaGridView;
        String str = "galleryMediaGridView";
        if (galleryMediaGridView != null) {
            C44559Jnf c44559Jnf2 = this.A02;
            if (c44559Jnf2 == null) {
                str = "adapter";
            } else {
                galleryMediaGridView.setAdapter(c44559Jnf2);
                GalleryMediaGridView galleryMediaGridView2 = this.A07;
                if (galleryMediaGridView2 != null) {
                    C153146ui c153146ui = C153146ui.A05;
                    AbstractC70663Fe abstractC70663Fe = galleryMediaGridView2.A0D;
                    if (abstractC70663Fe != null) {
                        galleryMediaGridView2.A14(new C153156uj(abstractC70663Fe, this, c153146ui, false, false));
                        A00();
                        return;
                    }
                    throw AbstractC166997dE.A0g();
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        if (!this.A04 && this.A03 != null) {
            A00();
        }
    }

    @Override // X.MQK
    public final void DSB(GalleryItem galleryItem, boolean z) {
        C187198Rm c187198Rm = this.A01;
        if (c187198Rm == null) {
            C14360o3.A0F("delegate");
            throw C00O.createAndThrow();
        }
        c187198Rm.A09(galleryItem.A0A);
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
        return AbstractC166987dD.A0n(this.A0A);
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
        GalleryMediaGridView galleryMediaGridView = this.A07;
        if (galleryMediaGridView == null) {
            C14360o3.A0F("galleryMediaGridView");
            throw C00O.createAndThrow();
        }
        return AbstractC110854yx.A03(galleryMediaGridView.A01);
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

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1069867958);
        super.onCreate(bundle);
        this.A08 = requireArguments().getString(AbstractC58317Pt9.A00(131));
        this.A06 = new C61972ry(requireContext(), AbstractC018607g.A00(this), null);
        C0f9.A09(755742486, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1669045655);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_remote_shared_media, viewGroup, false);
        C0f9.A09(-1186101536, A02);
        return inflate;
    }
}
