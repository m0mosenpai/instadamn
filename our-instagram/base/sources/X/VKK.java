package X;

import android.content.Context;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.R;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class VKK {
    public final int A02() {
        InterfaceC71936XBl interfaceC71936XBl;
        if (this instanceof UD8) {
            interfaceC71936XBl = ((UD8) this).A0B;
        } else {
            interfaceC71936XBl = ((UD7) this).A06;
        }
        return ((WPa) interfaceC71936XBl).A01;
    }

    public final Context A03() {
        if (this instanceof UD8) {
            UD8 ud8 = (UD8) this;
            Context context = ud8.A02;
            if (context == null) {
                TypedValue typedValue = new TypedValue();
                ud8.A01.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                int i = typedValue.resourceId;
                if (i != 0) {
                    context = new ContextThemeWrapper(ud8.A01, i);
                } else {
                    context = ud8.A01;
                }
                ud8.A02 = context;
            }
            return context;
        }
        return ((WPa) ((UD7) this).A06).A09.getContext();
    }

    public final VK7 A04(XDW xdw) {
        if (this instanceof UD8) {
            UD8 ud8 = (UD8) this;
            UDE ude = ud8.A04;
            if (ude != null) {
                ude.A00();
            }
            ud8.A0A.setHideOnContentScrollEnabled(false);
            ud8.A09.A04();
            UDE ude2 = new UDE(ud8.A09.getContext(), ud8, xdw);
            WQH wqh = ude2.A03;
            wqh.A06();
            try {
                if (ude2.A00.D83(wqh, ude2)) {
                    ud8.A04 = ude2;
                    ude2.A01();
                    ud8.A09.A05(ude2);
                    ud8.A0L(true);
                    return ude2;
                }
                return null;
            } finally {
                wqh.A05();
            }
        }
        return null;
    }

    public final void A05() {
        if (this instanceof UD8) {
            UD8 ud8 = (UD8) this;
            ud8.A01.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
            ud8.A08.setTabContainer(null);
            ((WPa) ud8.A0B).A09.setCollapsible(false);
            ud8.A0A.A05 = false;
        }
    }

    public final void A06() {
        if (this instanceof UD7) {
            UD7 ud7 = (UD7) this;
            ((WPa) ud7.A06).A09.removeCallbacks(ud7.A07);
        }
    }

    public final void A07() {
        InterfaceC71936XBl interfaceC71936XBl;
        if (this instanceof UD8) {
            interfaceC71936XBl = ((UD8) this).A0B;
        } else {
            interfaceC71936XBl = ((UD7) this).A06;
        }
        interfaceC71936XBl.ETL(((WPa) interfaceC71936XBl).A01 & (-3));
    }

    public final void A08() {
        InterfaceC71936XBl interfaceC71936XBl;
        if (this instanceof UD8) {
            interfaceC71936XBl = ((UD8) this).A0B;
        } else {
            interfaceC71936XBl = ((UD7) this).A06;
        }
        interfaceC71936XBl.ETL(((WPa) interfaceC71936XBl).A01 & (-9));
    }

    public final void A09() {
        InterfaceC71936XBl interfaceC71936XBl;
        if (this instanceof UD8) {
            interfaceC71936XBl = ((UD8) this).A0B;
        } else {
            interfaceC71936XBl = ((UD7) this).A06;
        }
        interfaceC71936XBl.ETL(((WPa) interfaceC71936XBl).A01 & (-2));
    }

    public final void A0A(CharSequence charSequence) {
        InterfaceC71936XBl interfaceC71936XBl;
        if (this instanceof UD8) {
            interfaceC71936XBl = ((UD8) this).A0B;
        } else {
            interfaceC71936XBl = ((UD7) this).A06;
        }
        interfaceC71936XBl.setWindowTitle(charSequence);
    }

    public final void A0B(boolean z) {
        if (this instanceof UD8) {
            UD8 ud8 = (UD8) this;
            if (z != ud8.A0H) {
                ud8.A0H = z;
                ArrayList arrayList = ud8.A0C;
                if (0 < arrayList.size()) {
                    arrayList.get(0);
                    throw new NullPointerException("onMenuVisibilityChanged");
                }
                return;
            }
            return;
        }
        UD7 ud7 = (UD7) this;
        if (z != ud7.A01) {
            ud7.A01 = z;
            ArrayList arrayList2 = ud7.A00;
            if (0 < arrayList2.size()) {
                arrayList2.get(0);
                throw new NullPointerException("onMenuVisibilityChanged");
            }
        }
    }

    public final void A0C(boolean z) {
        if (this instanceof UD8) {
            UD8 ud8 = (UD8) this;
            if (!ud8.A0E) {
                ud8.A0D(z);
            }
        }
    }

    public final void A0D(boolean z) {
        InterfaceC71936XBl interfaceC71936XBl;
        int i;
        if (this instanceof UD8) {
            UD8 ud8 = (UD8) this;
            int i2 = 0;
            if (z) {
                i2 = 4;
            }
            interfaceC71936XBl = ud8.A0B;
            int i3 = ((WPa) interfaceC71936XBl).A01;
            ud8.A0E = true;
            i = (i2 & 4) | (i3 & (-5));
        } else {
            interfaceC71936XBl = ((UD7) this).A06;
            i = ((WPa) interfaceC71936XBl).A01 & (-5);
        }
        interfaceC71936XBl.ETL(i);
    }

    public final void A0E(boolean z) {
        C69708Vu3 c69708Vu3;
        if (this instanceof UD8) {
            UD8 ud8 = (UD8) this;
            ud8.A0I = z;
            if (!z && (c69708Vu3 = ud8.A07) != null) {
                c69708Vu3.A00();
            }
        }
    }

    public final boolean A0F() {
        ActionMenuView actionMenuView;
        WPV wpv;
        if ((this instanceof UD7) && (actionMenuView = ((WPa) ((UD7) this).A06).A09.A0E) != null && (wpv = actionMenuView.A04) != null && wpv.A02()) {
            return true;
        }
        return false;
    }

    public final boolean A0G() {
        InterfaceC71936XBl interfaceC71936XBl;
        WQJ wqj;
        if (this instanceof UD8) {
            interfaceC71936XBl = ((UD8) this).A0B;
            if (interfaceC71936XBl == null) {
                return false;
            }
        } else {
            interfaceC71936XBl = ((UD7) this).A06;
        }
        WPT wpt = ((WPa) interfaceC71936XBl).A09.A0G;
        if (wpt != null && (wqj = wpt.A01) != null) {
            wqj.collapseActionView();
            return true;
        }
        return false;
    }

    public final boolean A0H() {
        if (this instanceof UD7) {
            UD7 ud7 = (UD7) this;
            Toolbar toolbar = ((WPa) ud7.A06).A09;
            Runnable runnable = ud7.A07;
            toolbar.removeCallbacks(runnable);
            toolbar.postOnAnimation(runnable);
            return true;
        }
        return false;
    }

    public final boolean A0I() {
        ActionMenuView actionMenuView;
        WPV wpv;
        if ((this instanceof UD7) && (actionMenuView = ((WPa) ((UD7) this).A06).A09.A0E) != null && (wpv = actionMenuView.A04) != null && wpv.A04()) {
            return true;
        }
        return false;
    }

    public final boolean A0J(int i, KeyEvent keyEvent) {
        WQH wqh;
        if (this instanceof UD8) {
            UDE ude = ((UD8) this).A04;
            if (ude != null && (wqh = ude.A03) != null) {
                boolean z = true;
                if (KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() == 1) {
                    z = false;
                }
                wqh.setQwertyMode(z);
                return wqh.performShortcut(i, keyEvent, 0);
            }
            return false;
        }
        Menu A00 = UD7.A00((UD7) this);
        if (A00 != null) {
            boolean z2 = true;
            if (KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() == 1) {
                z2 = false;
            }
            A00.setQwertyMode(z2);
            return A00.performShortcut(i, keyEvent, 0);
        }
        return false;
    }

    public final boolean A0K(KeyEvent keyEvent) {
        if (this instanceof UD7) {
            if (keyEvent.getAction() == 1) {
                A0I();
            }
            return true;
        }
        return false;
    }
}
