package X;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes11.dex */
public class UD5 extends DialogC12630l8 implements C2Fg {
    public AbstractC51982Zy A00;
    public final InterfaceC008502z A01;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UD5(android.content.Context r6, int r7) {
        /*
            r5 = this;
            r0 = r7
            if (r7 != 0) goto L15
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r6.getTheme()
            r1 = 2130969253(0x7f0402a5, float:1.7547183E38)
            r0 = 1
            r2.resolveAttribute(r1, r3, r0)
            int r0 = r3.resourceId
        L15:
            r5.<init>(r6, r0)
            X.WQO r0 = new X.WQO
            r0.<init>()
            r5.A01 = r0
            X.2Zy r4 = r5.A05()
            if (r7 != 0) goto L37
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r6.getTheme()
            r1 = 2130969253(0x7f0402a5, float:1.7547183E38)
            r0 = 1
            r2.resolveAttribute(r1, r3, r0)
            int r7 = r3.resourceId
        L37:
            r0 = r4
            X.2a4 r0 = (X.LayoutInflaterFactory2C52042a4) r0
            r0.A03 = r7
            r0 = 0
            r4.A0L(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UD5.<init>(android.content.Context, int):void");
    }

    public final AbstractC51982Zy A05() {
        AbstractC51982Zy abstractC51982Zy = this.A00;
        if (abstractC51982Zy == null) {
            boolean z = AbstractC51982Zy.A05;
            boolean z2 = LayoutInflaterFactory2C52042a4.A0p;
            LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4 = new LayoutInflaterFactory2C52042a4(getContext(), getWindow(), this, this);
            this.A00 = layoutInflaterFactory2C52042a4;
            return layoutInflaterFactory2C52042a4;
        }
        return abstractC51982Zy;
    }

    private void A03() {
        AbstractC55832hO.A01(getWindow().getDecorView(), this);
        AbstractC55842hQ.A01(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        C14360o3.A0B(decorView, 0);
        decorView.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    public final boolean A06(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // X.DialogC12630l8, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A05().A0N(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        A05().A0J();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        InterfaceC008502z interfaceC008502z = this.A01;
        if (interfaceC008502z == null) {
            return false;
        }
        return interfaceC008502z.superDispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4 = (LayoutInflaterFactory2C52042a4) A05();
        LayoutInflaterFactory2C52042a4.A0C(layoutInflaterFactory2C52042a4);
        return layoutInflaterFactory2C52042a4.A0A.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        A05().A0I();
    }

    @Override // X.DialogC12630l8, android.app.Dialog
    public void onCreate(Bundle bundle) {
        LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4 = (LayoutInflaterFactory2C52042a4) A05();
        LayoutInflater from = LayoutInflater.from(layoutInflaterFactory2C52042a4.A0l);
        if (from.getFactory() == null) {
            from.setFactory2(layoutInflaterFactory2C52042a4);
        } else {
            from.getFactory2();
        }
        super.onCreate(bundle);
        A05().A0L(bundle);
    }

    @Override // X.DialogC12630l8, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4 = (LayoutInflaterFactory2C52042a4) A05();
        LayoutInflaterFactory2C52042a4.A0D(layoutInflaterFactory2C52042a4);
        VKK vkk = layoutInflaterFactory2C52042a4.A0E;
        if (vkk != null) {
            vkk.A0E(false);
        }
    }

    @Override // X.DialogC12630l8, android.app.Dialog
    public void setContentView(int i) {
        A03();
        A05().A0K(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        A05().A0P(getContext().getString(i));
    }

    @Override // X.DialogC12630l8, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A03();
        A05().A0O(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        A05().A0P(charSequence);
    }

    @Override // X.DialogC12630l8, android.app.Dialog
    public void setContentView(View view) {
        A03();
        A05().A0M(view);
    }
}
