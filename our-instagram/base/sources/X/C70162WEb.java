package X;

import X.AbstractC111324zv;
import X.AbstractC31172DnG;
import X.AbstractC58317Pt9;
import X.C14360o3;
import X.C17280tP;
import X.C70162WEb;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.WEb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70162WEb {
    public static Context A00;
    public static View A01;
    public static WindowManager A02;
    public static final C70162WEb A04 = new Object();
    public static final AtomicBoolean A05 = AbstractC166997dE.A17();
    public static final Application.ActivityLifecycleCallbacks A03 = new Application.ActivityLifecycleCallbacks() { // from class: com.instagram.video.player.common.PhujiClientDebugDialog$lifecycleCallbacks$1
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            View view = C70162WEb.A01;
            if (view != null) {
                WindowManager windowManager = C70162WEb.A02;
                if (windowManager != null) {
                    windowManager.removeView(view);
                }
                C70162WEb.A05.set(false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            AtomicBoolean atomicBoolean = C70162WEb.A05;
            if (!atomicBoolean.get() && C17280tP.A4E.A00().A0Y()) {
                Context context = C70162WEb.A00;
                if (context != null) {
                    Object systemService = context.getSystemService("window");
                    C14360o3.A0C(systemService, AbstractC58317Pt9.A00(2));
                    C70162WEb.A02 = (WindowManager) systemService;
                    Object systemService2 = context.getSystemService("layout_inflater");
                    C14360o3.A0C(systemService2, AbstractC111324zv.A00(479));
                    C70162WEb.A01 = AbstractC31172DnG.A0A((LayoutInflater) systemService2, null, R.layout.watch_time_debug_view);
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(1000);
                    ((ViewGroup.LayoutParams) layoutParams).width = -1;
                    ((ViewGroup.LayoutParams) layoutParams).height = -1;
                    layoutParams.type = 2038;
                    layoutParams.flags = 16777240;
                    layoutParams.format = -3;
                    layoutParams.alpha = 0.8f;
                    WindowManager windowManager = C70162WEb.A02;
                    if (windowManager != null) {
                        windowManager.addView(C70162WEb.A01, layoutParams);
                    }
                }
                C70162WEb.A00();
                atomicBoolean.set(true);
            }
        }
    };

    public final void A02(Integer num, Integer num2, Integer num3, Integer num4, String str) {
        A01(AbstractC166987dD.A1J(new C09530e4(str, "")), true);
        ArrayList A1N = AbstractC16960so.A1N(AbstractC167007dF.A1b("Framebased", String.valueOf(num3), new C09530e4("Legacy", String.valueOf(num)), new C09530e4("SNAPL", String.valueOf(num2))));
        if (num4 != null) {
            AbstractC166997dE.A1R("VIPER", String.valueOf(num4), A1N);
        }
        A01(A1N, false);
    }

    public static final void A00() {
        View view = A01;
        if (view != null) {
            ((ViewGroup) view.findViewById(R.id.watch_time_table_view)).removeAllViews();
        }
    }

    public static final void A01(List list, boolean z) {
        View view = A01;
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.watch_time_table_view);
            Context context = A00;
            if (context != null) {
                TableRow tableRow = new TableRow(context);
                if (z) {
                    tableRow.setBackgroundColor(-256);
                }
                Iterator it = list.iterator();
                while (true) {
                    int i = -1;
                    if (it.hasNext()) {
                        C09530e4 c09530e4 = (C09530e4) it.next();
                        TextView textView = new TextView(context);
                        textView.setLayoutParams(new TableRow.LayoutParams(-2, -2));
                        textView.setPadding(20, 5, 0, 5);
                        textView.setText(AnonymousClass001.A0T((String) c09530e4.A00, (String) c09530e4.A01, '\n'));
                        if (z) {
                            i = -16777216;
                        }
                        textView.setTextColor(i);
                        tableRow.addView(textView);
                    } else {
                        viewGroup.addView(tableRow, new TableLayout.LayoutParams(-1, -2));
                        return;
                    }
                }
            }
        }
    }
}
