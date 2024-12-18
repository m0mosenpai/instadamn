package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.facebook.R;

/* renamed from: X.0l8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC12630l8 extends Dialog implements C07X, InterfaceC08430c6, InterfaceC20340zA {
    public C0eR A00;
    public final C00M A01;
    public final C08W A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC12630l8(Context context, int i) {
        super(context, i);
        C14360o3.A0B(context, 1);
        this.A02 = new C08W(this);
        this.A01 = new C00M(new Runnable() { // from class: X.00E
            @Override // java.lang.Runnable
            public final void run() {
                DialogC12630l8.A00(DialogC12630l8.this);
            }
        });
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C14360o3.A0B(view, 0);
        A04();
        super.addContentView(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        C14360o3.A0B(view, 0);
        A04();
        super.setContentView(view);
    }

    @Override // X.C07X
    public final C07T getLifecycle() {
        C0eR c0eR = this.A00;
        if (c0eR == null) {
            C0eR c0eR2 = new C0eR(this, true);
            this.A00 = c0eR2;
            return c0eR2;
        }
        return c0eR;
    }

    @Override // X.InterfaceC20340zA
    public final C00M getOnBackPressedDispatcher() {
        return this.A01;
    }

    @Override // X.InterfaceC08430c6
    public final C08U getSavedStateRegistry() {
        return this.A02.A01;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.A01.A04();
    }

    @Override // android.app.Dialog
    public void onStop() {
        C0eR c0eR = this.A00;
        if (c0eR == null) {
            c0eR = new C0eR(this, true);
            this.A00 = c0eR;
        }
        c0eR.A0B(C07R.ON_DESTROY);
        this.A00 = null;
        super.onStop();
    }

    public final void A04() {
        Window window = getWindow();
        C14360o3.A0A(window);
        View decorView = window.getDecorView();
        C14360o3.A07(decorView);
        AbstractC55832hO.A01(decorView, this);
        Window window2 = getWindow();
        C14360o3.A0A(window2);
        View decorView2 = window2.getDecorView();
        C14360o3.A07(decorView2);
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        C14360o3.A0A(window3);
        View decorView3 = window3.getDecorView();
        C14360o3.A07(decorView3);
        AbstractC55842hQ.A01(decorView3, this);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            C00M c00m = this.A01;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            C14360o3.A07(onBackInvokedDispatcher);
            c00m.A05(onBackInvokedDispatcher);
        }
        this.A02.A01(bundle);
        C0eR c0eR = this.A00;
        if (c0eR == null) {
            c0eR = new C0eR(this, true);
            this.A00 = c0eR;
        }
        c0eR.A0B(C07R.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        C14360o3.A07(onSaveInstanceState);
        this.A02.A01.A02(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        C0eR c0eR = this.A00;
        if (c0eR == null) {
            c0eR = new C0eR(this, true);
            this.A00 = c0eR;
        }
        c0eR.A0B(C07R.ON_RESUME);
    }

    public static final void A00(DialogC12630l8 dialogC12630l8) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C14360o3.A0B(view, 0);
        A04();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        A04();
        super.setContentView(i);
    }
}
