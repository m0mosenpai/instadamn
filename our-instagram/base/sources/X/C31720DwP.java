package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.R;
import com.google.android.material.tabs.TabLayout;
import com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.DwP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31720DwP extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "UpdateProfilePictureBottomSheetFragment";
    public int A00;
    public ViewPager2 A01;
    public TabLayout A02;
    public String A03;
    public String A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06 = AbstractC25225BEi.A0a(new C50162MDp(this, 45), new C50162MDp(this, 44), new MHV(14, (Object) null, this), AbstractC25225BEi.A1D(C31370Dqa.class));
    public final InterfaceC09390do A07;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC43591JPw.A00(948);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0130, code lost:
    
        if (r4 != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e2  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31720DwP.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final ProfileCoinFlipView A00(C31720DwP c31720DwP, UpdateProfilePicturePagerAdapter$UpdateProfileTabType updateProfilePicturePagerAdapter$UpdateProfileTabType) {
        View view;
        TabLayout tabLayout = c31720DwP.A02;
        if (tabLayout == null) {
            C14360o3.A0F("tabLayout");
            throw C00O.createAndThrow();
        }
        C154306wf A07 = tabLayout.A07(updateProfilePicturePagerAdapter$UpdateProfileTabType.A00);
        if (A07 == null || (view = A07.A03) == null) {
            return null;
        }
        return (ProfileCoinFlipView) view.findViewById(R.id.profile_coin_flip_view);
    }

    public static final CircularImageView A01(C31720DwP c31720DwP, UpdateProfilePicturePagerAdapter$UpdateProfileTabType updateProfilePicturePagerAdapter$UpdateProfileTabType) {
        View view;
        TabLayout tabLayout = c31720DwP.A02;
        if (tabLayout == null) {
            C14360o3.A0F("tabLayout");
            throw C00O.createAndThrow();
        }
        C154306wf A07 = tabLayout.A07(updateProfilePicturePagerAdapter$UpdateProfileTabType.A00);
        if (A07 == null || (view = A07.A03) == null) {
            return null;
        }
        return (CircularImageView) view.findViewById(R.id.profile_pic_imageview);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    public C31720DwP() {
        C50162MDp c50162MDp = new C50162MDp(this, 43);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50162MDp(new C50162MDp(this, 46), 47));
        this.A05 = AbstractC25225BEi.A0a(new C50162MDp(A00, 48), c50162MDp, new MHV(15, (Object) null, A00), AbstractC25225BEi.A1D(C148236lt.class));
        this.A07 = AbstractC60492pY.A02(this);
    }

    public static final void A02(C31720DwP c31720DwP, UpdateProfilePicturePagerAdapter$UpdateProfileTabType updateProfilePicturePagerAdapter$UpdateProfileTabType, float f) {
        CircularImageView A01 = A01(c31720DwP, updateProfilePicturePagerAdapter$UpdateProfileTabType);
        if (A01 != null) {
            A01.setAlpha(f);
        }
        ProfileCoinFlipView A00 = A00(c31720DwP, updateProfilePicturePagerAdapter$UpdateProfileTabType);
        if (A00 != null) {
            A00.setAlpha(f);
        }
    }

    public static final void A03(C31720DwP c31720DwP, UpdateProfilePicturePagerAdapter$UpdateProfileTabType updateProfilePicturePagerAdapter$UpdateProfileTabType, float f) {
        CircularImageView A01 = A01(c31720DwP, updateProfilePicturePagerAdapter$UpdateProfileTabType);
        if (A01 != null) {
            A01.setScaleX(f);
            A01.setScaleY(f);
        }
        ProfileCoinFlipView A00 = A00(c31720DwP, updateProfilePicturePagerAdapter$UpdateProfileTabType);
        if (A00 != null) {
            A00.setScaleX(f);
            A00.setScaleY(f);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1930322295);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_update_profile_picture, viewGroup, false);
        C0f9.A09(-2117480929, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-869154359);
        super.onPause();
        ViewPager2 viewPager2 = this.A01;
        if (viewPager2 == null) {
            C14360o3.A0F("viewPager");
            throw C00O.createAndThrow();
        }
        viewPager2.post(new RunnableC36801GKa(this));
        C0f9.A09(-786563059, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1606575649);
        super.onResume();
        ViewPager2 viewPager2 = this.A01;
        if (viewPager2 == null) {
            C14360o3.A0F("viewPager");
            throw C00O.createAndThrow();
        }
        viewPager2.post(new GKZ(this));
        C0f9.A09(-1936295833, A02);
    }
}
