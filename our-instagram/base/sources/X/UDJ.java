package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.BaseAdapter;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class UDJ extends WPX implements XEV, PopupWindow.OnDismissListener, View.OnKeyListener {
    public int A01;
    public int A03;
    public int A04;
    public View A05;
    public View A06;
    public ViewTreeObserver A07;
    public PopupWindow.OnDismissListener A08;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public InterfaceC71933XBi A0E;
    public final int A0F;
    public final int A0G;
    public final Context A0H;
    public final Handler A0I;
    public final int A0N;
    public final boolean A0P;
    public final List A0L = new ArrayList();
    public final List A0M = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener A0J = new WOE(this, 0);
    public final View.OnAttachStateChangeListener A0O = new WL8(this, 0);
    public final InterfaceC71937XBm A0K = new C70271WPb(this);
    public int A02 = 0;
    public int A00 = 0;
    public boolean A09 = false;

    @Override // X.XEV
    public final boolean AVx() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [X.UDt, X.WPW] */
    public static void A00(UDJ udj, WQH wqh) {
        VgZ vgZ;
        View view;
        Rect rect;
        int i;
        UBC ubc;
        int i2;
        int firstVisiblePosition;
        Context context = udj.A0H;
        LayoutInflater from = LayoutInflater.from(context);
        UBC ubc2 = new UBC(from, wqh, R.layout.abc_cascading_menu_item_layout, udj.A0P);
        if (!udj.CdI() && udj.A09) {
            ubc2.A01 = true;
        } else if (udj.CdI()) {
            int size = wqh.size();
            boolean z = false;
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                MenuItem item = wqh.getItem(i3);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i3++;
            }
            ubc2.A01 = z;
        }
        int A01 = WPX.A01(context, ubc2, udj.A0N);
        ?? wpw = new WPW(context, null, udj.A0F, udj.A0G);
        wpw.A00 = udj.A0K;
        wpw.A07 = udj;
        PopupWindow popupWindow = wpw.A09;
        popupWindow.setOnDismissListener(udj);
        wpw.A06 = udj.A05;
        wpw.A00 = udj.A00;
        wpw.A0D = true;
        popupWindow.setFocusable(true);
        popupWindow.setInputMethodMode(2);
        wpw.EPH(ubc2);
        wpw.A00(A01);
        wpw.A00 = udj.A00;
        List list = udj.A0M;
        if (list.size() > 0) {
            vgZ = (VgZ) list.get(list.size() - 1);
            WQH wqh2 = vgZ.A01;
            int size2 = wqh2.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size2) {
                    break;
                }
                MenuItem item2 = wqh2.getItem(i4);
                if (item2.hasSubMenu() && wqh == item2.getSubMenu()) {
                    C66360UCh c66360UCh = vgZ.A02.A0A;
                    ListAdapter adapter = c66360UCh.getAdapter();
                    int i5 = 0;
                    if (adapter instanceof HeaderViewListAdapter) {
                        HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                        i2 = headerViewListAdapter.getHeadersCount();
                        ubc = (UBC) headerViewListAdapter.getWrappedAdapter();
                    } else {
                        ubc = (UBC) adapter;
                        i2 = 0;
                    }
                    int count = ubc.getCount();
                    while (true) {
                        if (i5 >= count) {
                            break;
                        }
                        if (item2 == ubc.getItem(i5)) {
                            if (i5 != -1 && (firstVisiblePosition = (i5 + i2) - c66360UCh.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c66360UCh.getChildCount()) {
                                view = c66360UCh.getChildAt(firstVisiblePosition);
                            }
                        } else {
                            i5++;
                        }
                    }
                } else {
                    i4++;
                }
            }
            view = null;
        } else {
            vgZ = null;
            view = null;
        }
        if (view != null) {
            wpw.A01();
            popupWindow.setEnterTransition(null);
            C66360UCh c66360UCh2 = ((VgZ) list.get(list.size() - 1)).A02.A0A;
            int[] iArr = new int[2];
            c66360UCh2.getLocationOnScreen(iArr);
            Rect rect2 = new Rect();
            udj.A06.getWindowVisibleDisplayFrame(rect2);
            if (udj.A01 != 1 ? iArr[0] - A01 >= 0 : iArr[0] + c66360UCh2.getWidth() + A01 > rect2.right) {
                i = 0;
            } else {
                i = 1;
            }
            udj.A01 = i;
            wpw.A06 = view;
            if ((udj.A00 & 5) == 5) {
                if (i == 0) {
                    A01 = view.getWidth();
                    A01 = -A01;
                }
                wpw.A01 = A01;
                wpw.A0F = true;
                wpw.A0E = true;
                wpw.Egm(0);
            } else {
                if (i != 0) {
                    A01 = view.getWidth();
                    wpw.A01 = A01;
                    wpw.A0F = true;
                    wpw.A0E = true;
                    wpw.Egm(0);
                }
                A01 = -A01;
                wpw.A01 = A01;
                wpw.A0F = true;
                wpw.A0E = true;
                wpw.Egm(0);
            }
        } else {
            if (udj.A0A) {
                wpw.A01 = udj.A03;
            }
            if (udj.A0B) {
                wpw.Egm(udj.A04);
            }
            Rect rect3 = ((WPX) udj).A00;
            if (rect3 != null) {
                rect = new Rect(rect3);
            } else {
                rect = null;
            }
            wpw.A05 = rect;
        }
        list.add(new VgZ(wqh, wpw, udj.A01));
        wpw.show();
        C66360UCh c66360UCh3 = wpw.A0A;
        c66360UCh3.setOnKeyListener(udj);
        if (vgZ == null && udj.A0D && wqh.A05 != null) {
            View inflate = from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c66360UCh3, false);
            TextView textView = (TextView) inflate.findViewById(android.R.id.title);
            inflate.setEnabled(false);
            textView.setText(wqh.A05);
            c66360UCh3.addHeaderView(inflate, null, false);
            wpw.show();
        }
    }

    @Override // X.XDX
    public final C66360UCh BNm() {
        List list = this.A0M;
        if (list.isEmpty()) {
            return null;
        }
        return ((VgZ) AbstractC58320PtC.A0u(list)).A02.A0A;
    }

    @Override // X.XDX
    public final boolean CdI() {
        List list = this.A0M;
        if (list.size() <= 0 || !((VgZ) list.get(0)).A02.A09.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // X.XEV
    public final void D5e(WQH wqh, boolean z) {
        List list = this.A0M;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (wqh == ((VgZ) list.get(i)).A01) {
                if (i >= 0) {
                    int i2 = i + 1;
                    if (i2 < list.size()) {
                        ((VgZ) list.get(i2)).A01.A0C(false);
                    }
                    VgZ vgZ = (VgZ) list.remove(i);
                    vgZ.A01.A0B(this);
                    if (this.A0C) {
                        PopupWindow popupWindow = vgZ.A02.A09;
                        popupWindow.setExitTransition(null);
                        popupWindow.setAnimationStyle(0);
                    }
                    vgZ.A02.dismiss();
                    int size2 = list.size();
                    if (size2 > 0) {
                        this.A01 = ((VgZ) list.get(size2 - 1)).A00;
                    } else {
                        int i3 = 1;
                        if (this.A05.getLayoutDirection() == 1) {
                            i3 = 0;
                        }
                        this.A01 = i3;
                        if (size2 == 0) {
                            dismiss();
                            InterfaceC71933XBi interfaceC71933XBi = this.A0E;
                            if (interfaceC71933XBi != null) {
                                interfaceC71933XBi.D5e(wqh, true);
                            }
                            ViewTreeObserver viewTreeObserver = this.A07;
                            if (viewTreeObserver != null) {
                                if (viewTreeObserver.isAlive()) {
                                    this.A07.removeGlobalOnLayoutListener(this.A0J);
                                }
                                this.A07 = null;
                            }
                            this.A06.removeOnAttachStateChangeListener(this.A0O);
                            this.A08.onDismiss();
                            return;
                        }
                    }
                    if (z) {
                        ((VgZ) list.get(0)).A01.A0C(false);
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        return true;
     */
    @Override // X.XEV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean DpV(X.UDI r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.A0M
            java.util.Iterator r3 = r0.iterator()
        L6:
            boolean r0 = r3.hasNext()
            r2 = 1
            if (r0 == 0) goto L1f
            java.lang.Object r1 = r3.next()
            X.VgZ r1 = (X.VgZ) r1
            X.WQH r0 = r1.A01
            if (r5 != r0) goto L6
            X.UDt r0 = r1.A02
            X.UCh r0 = r0.A0A
            r0.requestFocus()
        L1e:
            return r2
        L1f:
            boolean r0 = r5.hasVisibleItems()
            if (r0 == 0) goto L41
            android.content.Context r0 = r4.A0H
            r5.A07(r0, r4)
            boolean r0 = r4.CdI()
            if (r0 == 0) goto L3b
            A00(r4, r5)
        L33:
            X.XBi r0 = r4.A0E
            if (r0 == 0) goto L1e
            r0.DWt(r5)
            return r2
        L3b:
            java.util.List r0 = r4.A0L
            r0.add(r5)
            goto L33
        L41:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UDJ.DpV(X.UDI):boolean");
    }

    @Override // X.XEV
    public final void FBO(boolean z) {
        Iterator it = this.A0M.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((VgZ) it.next()).A02.A0A.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            C0fA.A00((BaseAdapter) adapter, 1673239182);
        }
    }

    @Override // X.XDX
    public final void dismiss() {
        List list = this.A0M;
        int size = list.size();
        if (size > 0) {
            VgZ[] vgZArr = (VgZ[]) list.toArray(new VgZ[size]);
            while (true) {
                size--;
                if (size >= 0) {
                    VgZ vgZ = vgZArr[size];
                    if (vgZ.A02.A09.isShowing()) {
                        vgZ.A02.dismiss();
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        List list = this.A0M;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            VgZ vgZ = (VgZ) list.get(i);
            if (!vgZ.A02.A09.isShowing()) {
                vgZ.A01.A0C(false);
                return;
            }
        }
    }

    public UDJ(Context context, View view, int i, int i2, boolean z) {
        this.A0H = context;
        this.A05 = view;
        this.A0F = i;
        this.A0G = i2;
        this.A0P = z;
        this.A01 = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.A0N = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.A0I = new Handler();
    }

    @Override // X.XEV
    public final void EQl(InterfaceC71933XBi interfaceC71933XBi) {
        this.A0E = interfaceC71933XBi;
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
        if (!CdI()) {
            List list = this.A0L;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A00(this, (WQH) it.next());
            }
            list.clear();
            View view = this.A05;
            this.A06 = view;
            if (view != null) {
                boolean A1Z = AbstractC25229BEm.A1Z(this.A07);
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.A07 = viewTreeObserver;
                if (A1Z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.A0J);
                }
                this.A06.addOnAttachStateChangeListener(this.A0O);
            }
        }
    }
}
