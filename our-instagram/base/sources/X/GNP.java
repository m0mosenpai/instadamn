package X;

import androidx.viewpager2.widget.ViewPager2;
import com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType;

/* loaded from: classes6.dex */
public final class GNP implements Runnable {
    public final /* synthetic */ C31720DwP A00;
    public final /* synthetic */ UpdateProfilePicturePagerAdapter$UpdateProfileTabType A01;

    public GNP(C31720DwP c31720DwP, UpdateProfilePicturePagerAdapter$UpdateProfileTabType updateProfilePicturePagerAdapter$UpdateProfileTabType) {
        this.A00 = c31720DwP;
        this.A01 = updateProfilePicturePagerAdapter$UpdateProfileTabType;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewPager2 viewPager2 = this.A00.A01;
        if (viewPager2 == null) {
            C14360o3.A0F("viewPager");
            throw C00O.createAndThrow();
        }
        viewPager2.A03(this.A01.A00, true);
    }
}
