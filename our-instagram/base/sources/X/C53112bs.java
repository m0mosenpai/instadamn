package X;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.WindowCallbackWrapper;
import java.util.List;

/* renamed from: X.2bs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C53112bs extends WindowCallbackWrapper {
    public InterfaceC71830X6m A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final /* synthetic */ LayoutInflaterFactory2C52042a4 A04;

    public final void A00(Window.Callback callback) {
        try {
            this.A03 = true;
            callback.onContentChanged();
        } finally {
            this.A03 = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53112bs(Window.Callback callback, LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4) {
        super(callback);
        this.A04 = layoutInflaterFactory2C52042a4;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.A01) {
            return this.mWrapped.dispatchKeyEvent(keyEvent);
        }
        if (!this.A04.A0b(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final void onContentChanged() {
        if (this.A03) {
            this.mWrapped.onContentChanged();
        }
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0 && !(menu instanceof WQH)) {
            return false;
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        InterfaceC71830X6m interfaceC71830X6m = this.A00;
        if (interfaceC71830X6m != null) {
            WPI wpi = (WPI) interfaceC71830X6m;
            if (i == 0) {
                return new View(((WPa) wpi.A00.A06).A09.getContext());
            }
        }
        return super.onCreatePanelView(i);
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.A02) {
            this.mWrapped.onPanelClosed(i, menu);
            return;
        }
        super.onPanelClosed(i, menu);
        LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4 = this.A04;
        if (i == 108) {
            LayoutInflaterFactory2C52042a4.A0D(layoutInflaterFactory2C52042a4);
            VKK vkk = layoutInflaterFactory2C52042a4.A0E;
            if (vkk == null) {
                return;
            }
            vkk.A0B(false);
            return;
        }
        if (i != 0) {
            return;
        }
        C53142bw A0S = layoutInflaterFactory2C52042a4.A0S(i);
        if (!A0S.A0C) {
            return;
        }
        layoutInflaterFactory2C52042a4.A0Y(A0S, false);
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        WQH wqh;
        if (menu instanceof WQH) {
            wqh = (WQH) menu;
        } else {
            wqh = null;
        }
        if (i == 0 && wqh == null) {
            return false;
        }
        if (wqh != null) {
            wqh.A0C = true;
        }
        InterfaceC71830X6m interfaceC71830X6m = this.A00;
        if (interfaceC71830X6m != null) {
            WPI wpi = (WPI) interfaceC71830X6m;
            if (i == 0) {
                UD7 ud7 = wpi.A00;
                if (!ud7.A02) {
                    ((WPa) ud7.A06).A0D = true;
                    ud7.A02 = true;
                }
            }
        }
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (wqh != null) {
            wqh.A0C = false;
        }
        return onPreparePanel;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        WQH wqh = this.A04.A0S(0).A0A;
        if (wqh != null) {
            super.onProvideKeyboardShortcuts(list, wqh, i);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        WQH wqh;
        WQH wqh2;
        if (!super.dispatchKeyShortcutEvent(keyEvent)) {
            LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4 = this.A04;
            int keyCode = keyEvent.getKeyCode();
            LayoutInflaterFactory2C52042a4.A0D(layoutInflaterFactory2C52042a4);
            VKK vkk = layoutInflaterFactory2C52042a4.A0E;
            if (vkk != null && vkk.A0J(keyCode, keyEvent)) {
                return true;
            }
            C53142bw c53142bw = layoutInflaterFactory2C52042a4.A0I;
            if (c53142bw != null) {
                int keyCode2 = keyEvent.getKeyCode();
                if (!keyEvent.isSystem() && ((c53142bw.A0D || LayoutInflaterFactory2C52042a4.A0F(keyEvent, c53142bw, layoutInflaterFactory2C52042a4)) && (wqh2 = c53142bw.A0A) != null && wqh2.performShortcut(keyCode2, keyEvent, 1))) {
                    C53142bw c53142bw2 = layoutInflaterFactory2C52042a4.A0I;
                    if (c53142bw2 == null) {
                        return true;
                    }
                    c53142bw2.A0B = true;
                    return true;
                }
            }
            if (layoutInflaterFactory2C52042a4.A0I == null) {
                C53142bw A0S = layoutInflaterFactory2C52042a4.A0S(0);
                LayoutInflaterFactory2C52042a4.A0F(keyEvent, A0S, layoutInflaterFactory2C52042a4);
                int keyCode3 = keyEvent.getKeyCode();
                boolean z = false;
                if (!keyEvent.isSystem() && ((A0S.A0D || LayoutInflaterFactory2C52042a4.A0F(keyEvent, A0S, layoutInflaterFactory2C52042a4)) && (wqh = A0S.A0A) != null)) {
                    z = wqh.performShortcut(keyCode3, keyEvent, 1);
                }
                A0S.A0D = false;
                if (z) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        super.onMenuOpened(i, menu);
        LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4 = this.A04;
        if (i == 108) {
            LayoutInflaterFactory2C52042a4.A0D(layoutInflaterFactory2C52042a4);
            VKK vkk = layoutInflaterFactory2C52042a4.A0E;
            if (vkk != null) {
                vkk.A0B(true);
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4 = this.A04;
        if (layoutInflaterFactory2C52042a4.A0X && i == 0) {
            WPK wpk = new WPK(layoutInflaterFactory2C52042a4.A0l, callback);
            VK7 A0H = layoutInflaterFactory2C52042a4.A0H(wpk);
            if (A0H != null) {
                return wpk.A00(A0H);
            }
            return null;
        }
        return super.onWindowStartingActionMode(callback, i);
    }
}
