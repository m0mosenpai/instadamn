package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.facebook.R;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class WPV implements XEV, C02W {
    public int A00;
    public Context A01;
    public Context A02;
    public Drawable A03;
    public LayoutInflater A04;
    public LayoutInflater A05;
    public WQH A06;
    public InterfaceC71933XBi A07;
    public InterfaceC71870X8d A08;
    public UDL A09;
    public UDF A0A;
    public RunnableC71396WtK A0B;
    public UDY A0C;
    public UDM A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public int A0I;
    public int A0J;
    public final SparseBooleanArray A0L = new SparseBooleanArray();
    public final WPR A0K = new WPR(this);

    @Override // X.XEV
    public final boolean AIM(WQH wqh, WQJ wqj) {
        return false;
    }

    @Override // X.XEV
    public final boolean ATp(WQH wqh, WQJ wqj) {
        return false;
    }

    public final boolean A02() {
        Object obj;
        RunnableC71396WtK runnableC71396WtK = this.A0B;
        if (runnableC71396WtK != null && (obj = this.A08) != null) {
            ((View) obj).removeCallbacks(runnableC71396WtK);
            this.A0B = null;
        } else {
            UDM udm = this.A0D;
            if (udm != null) {
                WPX wpx = udm.A03;
                if (wpx != null && wpx.CdI()) {
                    udm.A03.dismiss();
                    return true;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final boolean A03() {
        WPX wpx;
        UDM udm = this.A0D;
        if (udm != null && (wpx = udm.A03) != null && wpx.CdI()) {
            return true;
        }
        return false;
    }

    public final boolean A04() {
        WQH wqh;
        if (this.A0G && !A03() && (wqh = this.A06) != null && this.A08 != null && this.A0B == null) {
            wqh.A04();
            if (!wqh.A08.isEmpty()) {
                RunnableC71396WtK runnableC71396WtK = new RunnableC71396WtK(new UDM(this.A01, this.A0C, this.A06, this), this);
                this.A0B = runnableC71396WtK;
                ((View) this.A08).post(runnableC71396WtK);
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0103, code lost:
    
        if (r15 != false) goto L52;
     */
    @Override // X.XEV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AVx() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WPV.AVx():boolean");
    }

    @Override // X.XEV
    public final void CNw(Context context, WQH wqh) {
        this.A01 = context;
        this.A04 = LayoutInflater.from(context);
        this.A06 = wqh;
        Resources resources = context.getResources();
        if (!this.A0H) {
            this.A0G = true;
        }
        this.A0J = AbstractC167007dF.A0K(context).widthPixels / 2;
        this.A00 = VKM.A00(context);
        int i = this.A0J;
        if (this.A0G) {
            if (this.A0C == null) {
                UDY udy = new UDY(this.A02, this);
                this.A0C = udy;
                if (this.A0F) {
                    udy.setImageDrawable(this.A03);
                    this.A03 = null;
                    this.A0F = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.A0C.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.A0C.getMeasuredWidth();
        } else {
            this.A0C = null;
        }
        this.A0I = i;
        resources.getDisplayMetrics();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [X.UDo, android.view.ViewGroup$LayoutParams, android.widget.LinearLayout$LayoutParams] */
    @Override // X.XEV
    public final void FBO(boolean z) {
        ArrayList arrayList;
        int size;
        WQJ wqj;
        ViewGroup viewGroup = (ViewGroup) this.A08;
        if (viewGroup != null) {
            WQH wqh = this.A06;
            int i = 0;
            if (wqh != null) {
                wqh.A04();
                ArrayList A03 = this.A06.A03();
                int size2 = A03.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size2; i3++) {
                    WQJ wqj2 = (WQJ) A03.get(i3);
                    if ((wqj2.A02 & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt instanceof InterfaceC71934XBj) {
                            wqj = ((InterfaceC71934XBj) childAt).getItemData();
                        } else {
                            wqj = null;
                        }
                        View A00 = A00(childAt, viewGroup, wqj2);
                        if (wqj2 != wqj) {
                            A00.setPressed(false);
                            A00.jumpDrawablesToCurrentState();
                        }
                        if (A00 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) A00.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(A00);
                            }
                            ((ViewGroup) this.A08).addView(A00, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.A0C) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.A08).requestLayout();
        WQH wqh2 = this.A06;
        if (wqh2 != null) {
            wqh2.A04();
            ArrayList arrayList2 = wqh2.A06;
            int size3 = arrayList2.size();
            for (int i4 = 0; i4 < size3; i4++) {
                C02Y c02y = ((WQJ) arrayList2.get(i4)).A0C;
                if (c02y != null) {
                    c02y.A00 = this;
                }
            }
        }
        WQH wqh3 = this.A06;
        if (wqh3 != null) {
            wqh3.A04();
            arrayList = wqh3.A08;
        } else {
            arrayList = null;
        }
        if (this.A0G && arrayList != null && ((size = arrayList.size()) != 1 ? size > 0 : (!((WQJ) arrayList.get(0)).isActionViewExpanded()))) {
            UDY udy = this.A0C;
            if (udy == null) {
                udy = new UDY(this.A02, this);
                this.A0C = udy;
            }
            ViewGroup viewGroup3 = (ViewGroup) udy.getParent();
            if (viewGroup3 != this.A08) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.A0C);
                }
                ViewGroup viewGroup4 = (ViewGroup) this.A08;
                UDY udy2 = this.A0C;
                ?? layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.A04 = false;
                ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
                layoutParams.A04 = true;
                viewGroup4.addView(udy2, (ViewGroup.LayoutParams) layoutParams);
            }
        } else {
            UDY udy3 = this.A0C;
            if (udy3 != null) {
                Object parent = udy3.getParent();
                Object obj = this.A08;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.A0C);
                }
            }
        }
        ((ActionMenuView) this.A08).A06 = this.A0G;
    }

    public WPV(Context context) {
        this.A02 = context;
        this.A05 = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View A00(View view, ViewGroup viewGroup, WQJ wqj) {
        View actionView = wqj.getActionView();
        if (actionView == null || wqj.A02()) {
            boolean z = view instanceof InterfaceC71934XBj;
            Object obj = view;
            if (!z) {
                obj = AbstractC31172DnG.A0A(this.A05, viewGroup, R.layout.abc_action_menu_item_layout);
            }
            InterfaceC71934XBj interfaceC71934XBj = (InterfaceC71934XBj) obj;
            interfaceC71934XBj.COF(wqj, 0);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC71934XBj;
            actionMenuItemView.A01 = (ActionMenuView) this.A08;
            UDF udf = this.A0A;
            if (udf == null) {
                udf = new UDF(this);
                this.A0A = udf;
            }
            actionMenuItemView.A00 = udf;
            actionView = (View) interfaceC71934XBj;
        }
        int i = 0;
        if (wqj.isActionViewExpanded()) {
            i = 8;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof UDo)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    public final void A01() {
        WPX wpx;
        A02();
        UDL udl = this.A09;
        if (udl != null && (wpx = udl.A03) != null && wpx.CdI()) {
            udl.A03.dismiss();
        }
    }

    @Override // X.XEV
    public final void D5e(WQH wqh, boolean z) {
        A01();
        InterfaceC71933XBi interfaceC71933XBi = this.A07;
        if (interfaceC71933XBi != null) {
            interfaceC71933XBi.D5e(wqh, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (r0.CdI() != false) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.XEV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean DpV(X.UDI r8) {
        /*
            r7 = this;
            boolean r0 = r8.hasVisibleItems()
            r5 = 0
            if (r0 == 0) goto La1
            r0 = r8
        L8:
            X.WQH r2 = r0.A00
            X.WQH r1 = r7.A06
            if (r2 == r1) goto L13
            X.WQH r0 = r0.A00
            X.UDI r0 = (X.UDI) r0
            goto L8
        L13:
            android.view.MenuItem r4 = r0.getItem()
            X.X8d r3 = r7.A08
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            if (r3 == 0) goto La1
            int r2 = r3.getChildCount()
            r1 = 0
        L22:
            if (r1 >= r2) goto La1
            android.view.View r6 = r3.getChildAt(r1)
            boolean r0 = r6 instanceof X.InterfaceC71934XBj
            if (r0 == 0) goto L9e
            r0 = r6
            X.XBj r0 = (X.InterfaceC71934XBj) r0
            X.WQJ r0 = r0.getItemData()
            if (r0 != r4) goto L9e
            if (r6 == 0) goto La1
            android.view.MenuItem r0 = r8.getItem()
            r0.getItemId()
            int r4 = r8.size()
            r2 = 0
        L43:
            r3 = 1
            if (r2 >= r4) goto L57
            android.view.MenuItem r1 = r8.getItem(r2)
            boolean r0 = r1.isVisible()
            if (r0 == 0) goto L9b
            android.graphics.drawable.Drawable r0 = r1.getIcon()
            if (r0 == 0) goto L9b
            r5 = 1
        L57:
            android.content.Context r0 = r7.A01
            X.UDL r1 = new X.UDL
            r1.<init>(r0, r6, r8, r7)
            r7.A09 = r1
            r1.A05 = r5
            X.WPX r0 = r1.A03
            if (r0 == 0) goto L77
            r0.A02(r5)
            boolean r0 = r0.CdI()
            if (r0 == 0) goto L77
        L6f:
            X.XBi r0 = r7.A07
            if (r0 == 0) goto L76
            r0.DWt(r8)
        L76:
            return r3
        L77:
            android.view.View r0 = r1.A01
            if (r0 != 0) goto L83
            java.lang.String r1 = "MenuPopupHelper cannot be used without an anchor"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L83:
            X.WPX r2 = r1.A00()
            r1 = 0
            boolean r0 = r2 instanceof X.UDK
            if (r0 == 0) goto L95
            r0 = r2
            X.UDK r0 = (X.UDK) r0
            r0.A07 = r1
        L91:
            r2.show()
            goto L6f
        L95:
            r0 = r2
            X.UDJ r0 = (X.UDJ) r0
            r0.A0D = r1
            goto L91
        L9b:
            int r2 = r2 + 1
            goto L43
        L9e:
            int r1 = r1 + 1
            goto L22
        La1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WPV.DpV(X.UDI):boolean");
    }

    @Override // X.XEV
    public final void EQl(InterfaceC71933XBi interfaceC71933XBi) {
        this.A07 = interfaceC71933XBi;
    }
}
