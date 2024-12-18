package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.Awf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24699Awf implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ TargetViewSizeProvider A01;

    public RunnableC24699Awf(View view, TargetViewSizeProvider targetViewSizeProvider) {
        this.A00 = view;
        this.A01 = targetViewSizeProvider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view = this.A00;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            NineSixteenLayoutConfigImpl nineSixteenLayoutConfigImpl = (NineSixteenLayoutConfigImpl) this.A01;
            int i = nineSixteenLayoutConfigImpl.A0H - nineSixteenLayoutConfigImpl.A0I;
            int A03 = AbstractC167017dG.A03(view.getContext());
            int height = (i - view.getHeight()) - A03;
            if (height < 0) {
                height = 0;
            }
            marginLayoutParams.bottomMargin = height;
            view.setLayoutParams(marginLayoutParams);
            view.setPadding(0, A03, 0, 0);
        }
    }
}
