package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;

/* loaded from: classes11.dex */
public abstract class VQ5 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        ViewOnClickListenerC42034Ik3 viewOnClickListenerC42034Ik3;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A03;
        Object A032 = c6fw.A03(1);
        C14360o3.A0C(A032, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) A032;
        InterfaceC103384lE A00 = C1344465q.A00(c6fw.A00.get(2));
        if (A00 != null) {
            viewOnClickListenerC42034Ik3 = new ViewOnClickListenerC42034Ik3(c6fq, A00, 3);
        } else {
            viewOnClickListenerC42034Ik3 = null;
        }
        Fragment A002 = C6BQ.A00(C6BQ.A09(c6fq));
        if (A002 instanceof C72743Nv) {
            C72743Nv c72743Nv = (C72743Nv) A002;
            C14360o3.A0B(c72743Nv, 0);
            C14360o3.A0B(str, 1);
            C14360o3.A0B(str2, 2);
            C56342iS c56342iS = C56352iT.A0t;
            View findViewById = c56342iS.A03(c72743Nv.getActivity()).C95().findViewById(R.id.timeframe_header_container);
            boolean z = true;
            if (findViewById == null) {
                z = false;
                findViewById = LayoutInflater.from(c72743Nv.getRootActivity()).inflate(R.layout.insights_timeframe_header, (ViewGroup) null);
            }
            AbstractC167007dF.A0N(findViewById, R.id.timeframe_header_title).setText(str);
            TextView A0N = AbstractC167007dF.A0N(findViewById, R.id.timeframe_header_subtitle);
            A0N.setText(str2);
            if (viewOnClickListenerC42034Ik3 != null && c72743Nv.getContext() != null) {
                C0fQ.A00(viewOnClickListenerC42034Ik3, findViewById);
                Context context = c72743Nv.getContext();
                if (context != null) {
                    A0N.setCompoundDrawables(null, null, context.getDrawable(R.drawable.instagram_chevron_down_pano_outline_12), null);
                    A0N.setCompoundDrawablePadding(4);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            if (!z) {
                Activity rootActivity = c72743Nv.getRootActivity();
                if (rootActivity != null) {
                    int A0G = AbstractC53242c7.A0G(rootActivity, R.attr.actionBarButtonWidth);
                    C6T7 c6t7 = c72743Nv.A0B;
                    if (c6t7 != null) {
                        c6t7.A03();
                        c72743Nv.A0B = null;
                    }
                    FrameLayout frameLayout = c72743Nv.A02;
                    if (frameLayout != null) {
                        frameLayout.removeAllViews();
                        c72743Nv.A02 = null;
                        c72743Nv.A07 = null;
                        c72743Nv.A0C = null;
                    }
                    c56342iS.A03(c72743Nv.A03).ESo(findViewById, 0, A0G, false);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        return null;
    }
}
