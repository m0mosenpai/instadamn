package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.TQt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64712TQt implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ IgReactNavigatorModule A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public RunnableC64712TQt(FragmentActivity fragmentActivity, IgReactNavigatorModule igReactNavigatorModule, String str, String str2) {
        this.A01 = igReactNavigatorModule;
        this.A00 = fragmentActivity;
        this.A03 = str;
        this.A02 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentActivity fragmentActivity = this.A00;
        if (fragmentActivity != null) {
            IgReactNavigatorModule igReactNavigatorModule = this.A01;
            View view = igReactNavigatorModule.mCustomActionBarView;
            if (view != null && view.getParent() != null) {
                ((ViewGroup) igReactNavigatorModule.mCustomActionBarView.getParent()).removeView(igReactNavigatorModule.mCustomActionBarView);
            } else {
                igReactNavigatorModule.mCustomActionBarView = LayoutInflater.from(fragmentActivity).inflate(R.layout.action_bar_image_title, (ViewGroup) null);
            }
            ImageView A0I = AbstractC31173DnH.A0I(igReactNavigatorModule.mCustomActionBarView, R.id.action_bar_title_imageview);
            A0I.setColorFilter(C3DY.A00(AbstractC53242c7.A01(fragmentActivity)));
            AbstractC166997dE.A0T(igReactNavigatorModule.mCustomActionBarView, R.id.action_bar_title_textview).setText(this.A03);
            AbstractC166997dE.A19(fragmentActivity, A0I, IgReactNavigatorModule.resourceForIconType(this.A02));
            C56352iT.A0t.A03(fragmentActivity).ESn(igReactNavigatorModule.mCustomActionBarView);
        }
    }
}
