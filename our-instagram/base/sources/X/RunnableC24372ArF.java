package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.ArF, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24372ArF implements Runnable {
    public final /* synthetic */ C8JN A00;

    public RunnableC24372ArF(C8JN c8jn) {
        this.A00 = c8jn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8JN c8jn = this.A00;
        C8HI c8hi = c8jn.A09;
        C24116An1 c24116An1 = new C24116An1(c8jn, 2);
        UserSession userSession = c8hi.A0f;
        C14360o3.A0B(userSession, 0);
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC03240Dh.A00(A0b, userSession);
        AbstractC59962oe abstractC59962oe = new AbstractC59962oe() { // from class: X.9f6
            public static final String __redex_internal_original_name = "GlassesStoryBottomSheetFragment";
            public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

            @Override // X.InterfaceC11380iw
            public final String getModuleName() {
                return "glasses_story_bottom_sheet";
            }

            @Override // X.AbstractC59962oe
            public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
                return AbstractC166987dD.A0n(this.A00);
            }

            @Override // androidx.fragment.app.Fragment
            public final void onCreate(Bundle bundle) {
                int A02 = C0f9.A02(775839535);
                super.onCreate(bundle);
                C0f9.A09(-778594150, A02);
            }

            @Override // androidx.fragment.app.Fragment
            public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
                int A02 = C0f9.A02(1234044814);
                C14360o3.A0B(layoutInflater, 0);
                View inflate = layoutInflater.inflate(R.layout.layout_stories_third_camera_bottom_sheet, viewGroup, false);
                C0f9.A09(1483808296, A02);
                return inflate;
            }
        };
        abstractC59962oe.setArguments(A0b);
        C189448aO c189448aO = new C189448aO(userSession);
        c189448aO.A1C = false;
        Activity activity = c8hi.A0P;
        c189448aO.A0d = activity.getString(2131974497);
        c189448aO.A0g = activity.getString(2131974496);
        c189448aO.A1J = true;
        c189448aO.A0v = true;
        c189448aO.A0U = c24116An1;
        c189448aO.A00().A02(activity, abstractC59962oe);
    }
}
