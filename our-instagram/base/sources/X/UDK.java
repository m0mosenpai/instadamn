package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UDK extends WPX implements XEV, PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener {
    public int A00;
    public View A02;
    public View A03;
    public ViewTreeObserver A04;
    public PopupWindow.OnDismissListener A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public InterfaceC71933XBi A09;
    public final int A0A;
    public final Context A0B;
    public final UBC A0E;
    public final WQH A0F;
    public final C66371UDt A0G;
    public final int A0H;
    public final int A0I;
    public final boolean A0J;
    public final ViewTreeObserver.OnGlobalLayoutListener A0D = new WOE(this, 1);
    public final View.OnAttachStateChangeListener A0C = new WL8(this, 1);
    public int A01 = 0;

    @Override // X.XEV
    public final boolean AVx() {
        return false;
    }

    @Override // X.XEV
    public final void FBO(boolean z) {
        this.A06 = false;
        UBC ubc = this.A0E;
        if (ubc != null) {
            C0fA.A00(ubc, 1956355386);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.A08 = true;
        this.A0F.close();
        ViewTreeObserver viewTreeObserver = this.A04;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.A04 = this.A03.getViewTreeObserver();
            }
            this.A04.removeGlobalOnLayoutListener(this.A0D);
            this.A04 = null;
        }
        this.A03.removeOnAttachStateChangeListener(this.A0C);
        PopupWindow.OnDismissListener onDismissListener = this.A05;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // X.XDX
    public final C66360UCh BNm() {
        return this.A0G.A0A;
    }

    @Override // X.XDX
    public final boolean CdI() {
        if (!this.A08 && this.A0G.A09.isShowing()) {
            return true;
        }
        return false;
    }

    @Override // X.XEV
    public final void D5e(WQH wqh, boolean z) {
        if (wqh == this.A0F) {
            dismiss();
            InterfaceC71933XBi interfaceC71933XBi = this.A09;
            if (interfaceC71933XBi != null) {
                interfaceC71933XBi.D5e(wqh, z);
            }
        }
    }

    @Override // X.XEV
    public final boolean DpV(UDI udi) {
        if (!udi.hasVisibleItems()) {
            return false;
        }
        C69725VuK c69725VuK = new C69725VuK(this.A0B, this.A03, udi, this.A0H, this.A0I, this.A0J);
        InterfaceC71933XBi interfaceC71933XBi = this.A09;
        c69725VuK.A04 = interfaceC71933XBi;
        WPX wpx = c69725VuK.A03;
        if (wpx != null) {
            wpx.EQl(interfaceC71933XBi);
        }
        int size = udi.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = udi.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        c69725VuK.A05 = z;
        WPX wpx2 = c69725VuK.A03;
        if (wpx2 != null) {
            wpx2.A02(z);
        }
        c69725VuK.A02 = this.A05;
        this.A05 = null;
        this.A0F.A0C(false);
        C66371UDt c66371UDt = this.A0G;
        int i2 = c66371UDt.A01;
        int CEs = c66371UDt.CEs();
        if ((Gravity.getAbsoluteGravity(this.A01, this.A02.getLayoutDirection()) & 7) == 5) {
            i2 += this.A02.getWidth();
        }
        WPX wpx3 = c69725VuK.A03;
        if (wpx3 == null || !wpx3.CdI()) {
            if (c69725VuK.A01 == null) {
                return false;
            }
            WPX A00 = c69725VuK.A00();
            boolean z2 = A00 instanceof UDK;
            if (z2) {
                ((UDK) A00).A07 = true;
            } else {
                ((UDJ) A00).A0D = true;
            }
            if ((Gravity.getAbsoluteGravity(c69725VuK.A00, c69725VuK.A01.getLayoutDirection()) & 7) == 5) {
                i2 -= c69725VuK.A01.getWidth();
            }
            if (z2) {
                ((UDK) A00).A0G.A01 = i2;
            } else {
                UDJ udj = (UDJ) A00;
                udj.A0A = true;
                udj.A03 = i2;
            }
            if (z2) {
                ((UDK) A00).A0G.Egm(CEs);
            } else {
                UDJ udj2 = (UDJ) A00;
                udj2.A0B = true;
                udj2.A04 = CEs;
            }
            int A002 = (int) ((AbstractC65702TsY.A00(c69725VuK.A08) * 48.0f) / 2.0f);
            A00.A00 = new Rect(i2 - A002, CEs - A002, i2 + A002, CEs + A002);
            A00.show();
        }
        InterfaceC71933XBi interfaceC71933XBi2 = this.A09;
        if (interfaceC71933XBi2 != null) {
            interfaceC71933XBi2.DWt(udi);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.UDt, X.WPW] */
    public UDK(Context context, View view, WQH wqh, int i, int i2, boolean z) {
        this.A0B = context;
        this.A0F = wqh;
        this.A0J = z;
        this.A0E = new UBC(LayoutInflater.from(context), wqh, R.layout.abc_popup_menu_item_layout, z);
        this.A0H = i;
        this.A0I = i2;
        Resources resources = context.getResources();
        this.A0A = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.A02 = view;
        this.A0G = new WPW(context, null, i, i2);
        wqh.A07(context, this);
    }

    @Override // X.XEV
    public final void EQl(InterfaceC71933XBi interfaceC71933XBi) {
        this.A09 = interfaceC71933XBi;
    }

    @Override // X.XDX
    public final void dismiss() {
        if (CdI()) {
            this.A0G.dismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // X.XDX
    public final void show() {
        View view;
        Rect rect;
        if (!CdI()) {
            if (!this.A08 && (view = this.A02) != null) {
                this.A03 = view;
                C66371UDt c66371UDt = this.A0G;
                PopupWindow popupWindow = c66371UDt.A09;
                popupWindow.setOnDismissListener(this);
                c66371UDt.A07 = this;
                c66371UDt.A0D = true;
                popupWindow.setFocusable(true);
                View view2 = this.A03;
                boolean A1Z = AbstractC25229BEm.A1Z(this.A04);
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.A04 = viewTreeObserver;
                if (A1Z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.A0D);
                }
                view2.addOnAttachStateChangeListener(this.A0C);
                c66371UDt.A06 = view2;
                ((WPW) c66371UDt).A00 = this.A01;
                if (!this.A06) {
                    this.A00 = WPX.A01(this.A0B, this.A0E, this.A0A);
                    this.A06 = true;
                }
                c66371UDt.A00(this.A00);
                popupWindow.setInputMethodMode(2);
                Rect rect2 = super.A00;
                if (rect2 != null) {
                    rect = new Rect(rect2);
                } else {
                    rect = null;
                }
                c66371UDt.A05 = rect;
                c66371UDt.show();
                C66360UCh c66360UCh = c66371UDt.A0A;
                c66360UCh.setOnKeyListener(this);
                if (this.A07) {
                    WQH wqh = this.A0F;
                    if (wqh.A05 != null) {
                        View inflate = LayoutInflater.from(this.A0B).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c66360UCh, false);
                        TextView textView = (TextView) inflate.findViewById(android.R.id.title);
                        if (textView != null) {
                            textView.setText(wqh.A05);
                        }
                        inflate.setEnabled(false);
                        c66360UCh.addHeaderView(inflate, null, false);
                    }
                }
                c66371UDt.EPH(this.A0E);
                c66371UDt.show();
                return;
            }
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }
}
