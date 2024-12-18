package X;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.base.activity.IgFragmentActivity;

/* loaded from: classes9.dex */
public final class PIN implements InterfaceC59892oW {
    public final /* synthetic */ IgFragmentActivity A00;

    public PIN(IgFragmentActivity igFragmentActivity) {
        this.A00 = igFragmentActivity;
    }

    @Override // X.InterfaceC59892oW
    public final void Dnp(int i, int i2) {
        boolean isTransparentThemeAndroid15;
        IgFragmentActivity igFragmentActivity = this.A00;
        View findViewById = igFragmentActivity.findViewById(R.id.content);
        AbstractC43592JPx.A1T(findViewById);
        View childAt = ((ViewGroup) findViewById).getChildAt(0);
        if (childAt != null) {
            AbstractC13880nE.A0j(childAt, i, i2);
        }
        isTransparentThemeAndroid15 = igFragmentActivity.isTransparentThemeAndroid15();
        if (!isTransparentThemeAndroid15) {
            igFragmentActivity.configureBackgroundColorAndroid15();
        }
    }
}
