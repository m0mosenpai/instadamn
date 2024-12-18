package X;

import X.AbstractC111324zv;
import X.AbstractC58317Pt9;
import X.C14360o3;
import X.W2u;
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
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public final class W2u {
    public static final W2u A07 = new W2u();
    public Context A00;
    public View A01;
    public WindowManager A02;
    public HashMap A03;
    public HashMap A04;
    public final AtomicBoolean A06 = AbstractC166997dE.A17();
    public final Application.ActivityLifecycleCallbacks A05 = new Application.ActivityLifecycleCallbacks() { // from class: com.facebook.video.grootplayer.loggersdk.debug.SharedVideoLoggerWatchTimeDebugDialog$lifecycleCallbacks$1
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
            W2u w2u = W2u.this;
            View view = w2u.A01;
            if (view != null) {
                WindowManager windowManager = w2u.A02;
                if (windowManager != null) {
                    windowManager.removeView(view);
                }
                w2u.A06.set(false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            Context context;
            Object obj;
            W2u w2u = W2u.this;
            AtomicBoolean atomicBoolean = w2u.A06;
            if (!atomicBoolean.get() && (context = w2u.A00) != null) {
                Object systemService = context.getSystemService("window");
                C14360o3.A0C(systemService, AbstractC58317Pt9.A00(2));
                w2u.A02 = (WindowManager) systemService;
                Context context2 = w2u.A00;
                if (context2 != null) {
                    obj = context2.getSystemService("layout_inflater");
                } else {
                    obj = null;
                }
                C14360o3.A0C(obj, AbstractC111324zv.A00(479));
                w2u.A01 = ((LayoutInflater) obj).inflate(R.layout.shared_video_logger_watch_time_debug_view, (ViewGroup) null);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 2038, 24, -3);
                WindowManager windowManager = w2u.A02;
                if (windowManager != null) {
                    windowManager.addView(w2u.A01, layoutParams);
                }
                View view = w2u.A01;
                if (view != null) {
                    View findViewById = view.findViewById(R.id.watch_time_table_view);
                    C14360o3.A0C(findViewById, "null cannot be cast to non-null type android.widget.TableLayout");
                    ((ViewGroup) findViewById).removeAllViews();
                    View view2 = w2u.A01;
                    if (view2 != null) {
                        if (w2u.A00 != null) {
                            ViewGroup viewGroup = (ViewGroup) view2.findViewById(R.id.watch_time_table_view);
                            TableLayout.LayoutParams layoutParams2 = new TableLayout.LayoutParams(-1, -2);
                            layoutParams2.setMargins(10, 0, 0, 0);
                            TableRow tableRow = new TableRow(w2u.A00);
                            TextView textView = new TextView(w2u.A00);
                            textView.setLayoutParams(new TableRow.LayoutParams(-2, -2));
                            textView.setPadding(20, 5, 0, 5);
                            textView.setText("TOT_TIME");
                            textView.setTextColor(-256);
                            TextView textView2 = new TextView(w2u.A00);
                            textView2.setLayoutParams(new TableRow.LayoutParams(-2, -1));
                            textView2.setPadding(20, 5, 0, 5);
                            textView2.setText("EVENT");
                            textView2.setTextColor(-65536);
                            TextView textView3 = new TextView(w2u.A00);
                            textView3.setLayoutParams(new TableRow.LayoutParams(-1, -1));
                            textView3.setPadding(20, 5, 0, 5);
                            textView3.setText("EL_TIME");
                            textView3.setTextColor(-16776961);
                            TextView textView4 = new TextView(w2u.A00);
                            textView4.setLayoutParams(new TableRow.LayoutParams(-1, -1));
                            textView4.setPadding(20, 5, 0, 5);
                            int length = "VID".length() - 6;
                            int i = 0;
                            if (0 < length) {
                                i = length;
                            }
                            String substring = "VID".substring(i);
                            C14360o3.A07(substring);
                            textView4.setText(substring);
                            textView4.setTextColor(-16711936);
                            tableRow.addView(textView);
                            tableRow.addView(textView2);
                            tableRow.addView(textView3);
                            tableRow.addView(textView4);
                            tableRow.setLayoutParams(layoutParams2);
                            if (viewGroup != null) {
                                viewGroup.addView(tableRow, 0);
                            }
                            w2u.A04 = new HashMap();
                            w2u.A03 = new HashMap();
                            atomicBoolean.set(true);
                            return;
                        }
                        throw new IllegalStateException("mContext is null.");
                    }
                    throw new IllegalStateException("mRootView is null.");
                }
                throw new IllegalStateException("mRootView is null.");
            }
        }
    };
}
