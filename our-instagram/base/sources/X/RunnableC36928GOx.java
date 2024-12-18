package X;

import androidx.fragment.app.Fragment;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.urlhandlers.media.ShortUrlReelLoadingFragment;

/* renamed from: X.GOx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36928GOx implements Runnable {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ ET6 A01;

    public RunnableC36928GOx(Fragment fragment, ET6 et6) {
        this.A01 = et6;
        this.A00 = fragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ShortUrlReelLoadingFragment shortUrlReelLoadingFragment = this.A01.A01;
        BaseFragmentActivity baseFragmentActivity = (BaseFragmentActivity) shortUrlReelLoadingFragment.requireActivity();
        C140966Yy A0F = AbstractC31178DnM.A0F(shortUrlReelLoadingFragment);
        A0F.A0E(this.A00);
        AbstractC31174DnI.A1L(A0F);
        baseFragmentActivity.A0Z();
    }
}
