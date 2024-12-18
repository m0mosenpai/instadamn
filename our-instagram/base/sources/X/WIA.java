package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* loaded from: classes11.dex */
public final class WIA implements DialogInterface.OnDismissListener, DialogInterface.OnClickListener, InterfaceC71933XBi, DialogInterface.OnKeyListener {
    public UD9 A00;
    public WPU A01;
    public WQH A02;

    @Override // X.InterfaceC71933XBi
    public final void D5e(WQH wqh, boolean z) {
        UD9 ud9;
        if ((z || wqh == this.A02) && (ud9 = this.A00) != null) {
            ud9.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        WQH wqh = this.A02;
        WPU wpu = this.A01;
        UBB ubb = wpu.A04;
        if (ubb == null) {
            ubb = new UBB(wpu);
            wpu.A04 = ubb;
        }
        wqh.A0I((WQJ) ubb.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.A01.D5e(this.A02, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.A00.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.A00.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.A02.A0C(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.A02.performShortcut(i, keyEvent, 0);
    }

    @Override // X.InterfaceC71933XBi
    public final boolean DWt(WQH wqh) {
        return false;
    }
}
