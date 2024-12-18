package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class WQJ implements C02K {
    public char A00;
    public char A01;
    public int A05;
    public Intent A06;
    public MenuItem.OnMenuItemClickListener A09;
    public WQH A0A;
    public UDI A0B;
    public C02Y A0C;
    public Drawable A0I;
    public MenuItem.OnActionExpandListener A0J;
    public View A0K;
    public CharSequence A0L;
    public CharSequence A0M;
    public CharSequence A0N;
    public CharSequence A0O;
    public final int A0P;
    public final int A0Q;
    public final int A0R;
    public final int A0S;
    public int A04 = 4096;
    public int A03 = 4096;
    public int A0H = 0;
    public ColorStateList A07 = null;
    public PorterDuff.Mode A08 = null;
    public boolean A0D = false;
    public boolean A0E = false;
    public boolean A0G = false;
    public int A02 = 16;
    public boolean A0F = false;

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.A0H = 0;
        this.A0I = drawable;
        this.A0G = true;
        this.A0A.A0D(false);
        return this;
    }

    public static void A00(WQJ wqj) {
        wqj.A0A.A0D(false);
    }

    public final void A01(View view) {
        int i;
        this.A0K = view;
        this.A0C = null;
        if (view != null && view.getId() == -1 && (i = this.A0S) > 0) {
            view.setId(i);
        }
        WQH wqh = this.A0A;
        wqh.A0A = true;
        wqh.A0D(true);
    }

    public final boolean A02() {
        C02Y c02y;
        if ((this.A05 & 8) == 0) {
            return false;
        }
        View view = this.A0K;
        if (view == null && (c02y = this.A0C) != null) {
            view = ((UER) c02y).A01.onCreateActionView(this);
            this.A0K = view;
        }
        if (view == null) {
            return false;
        }
        return true;
    }

    @Override // X.C02K
    public final C02Y C49() {
        return this.A0C;
    }

    @Override // X.C02K
    public final C02K ES2(CharSequence charSequence) {
        this.A0L = charSequence;
        A00(this);
        return this;
    }

    @Override // X.C02K
    public final C02K EfC(C02Y c02y) {
        C02Y c02y2 = this.A0C;
        if (c02y2 != null) {
            c02y2.A00 = null;
        }
        this.A0K = null;
        this.A0C = c02y;
        this.A0A.A0D(true);
        C02Y c02y3 = this.A0C;
        if (c02y3 != null) {
            UER uer = (UER) c02y3;
            uer.A00 = new WQN(this);
            uer.A01.setVisibilityListener(uer);
        }
        return this;
    }

    @Override // X.C02K
    public final C02K Efz(CharSequence charSequence) {
        this.A0O = charSequence;
        A00(this);
        return this;
    }

    @Override // X.C02K, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.A05 & 8) == 0) {
            return false;
        }
        if (this.A0K == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.A0J;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.A0A.A0J(this);
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // X.C02K, android.view.MenuItem
    public final View getActionView() {
        View view = this.A0K;
        if (view == null) {
            C02Y c02y = this.A0C;
            if (c02y != null) {
                View onCreateActionView = ((UER) c02y).A01.onCreateActionView(this);
                this.A0K = onCreateActionView;
                return onCreateActionView;
            }
            return null;
        }
        return view;
    }

    @Override // X.C02K, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.A03;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.A00;
    }

    @Override // X.C02K, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.A0L;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.A0R;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.A0I;
        if (drawable == null) {
            int i = this.A0H;
            if (i != 0) {
                drawable = C71x.A00(this.A0A.A0M, i);
                this.A0H = 0;
                this.A0I = drawable;
            } else {
                return null;
            }
        }
        if (drawable != null && this.A0G && (this.A0D || this.A0E)) {
            drawable = drawable.mutate();
            if (this.A0D) {
                drawable.setTintList(this.A07);
            }
            if (this.A0E) {
                drawable.setTintMode(this.A08);
            }
            this.A0G = false;
        }
        return drawable;
    }

    @Override // X.C02K, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.A07;
    }

    @Override // X.C02K, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.A08;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.A06;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.A0S;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // X.C02K, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.A04;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.A01;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.A0Q;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.A0B;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.A0M;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.A0N;
        if (charSequence == null) {
            return this.A0M;
        }
        return charSequence;
    }

    @Override // X.C02K, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.A0O;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return AbstractC167007dF.A1W(this.A0B);
    }

    @Override // X.C02K, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.A0F;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.A02 & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return AbstractC167007dF.A1P(this.A02 & 2, 2);
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return AbstractC167007dF.A1M(this.A02 & 16);
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        C02Y c02y = this.A0C;
        if (c02y != null && ((UER) c02y).A01.overridesItemVisibility()) {
            if ((this.A02 & 8) == 0 && ((UER) this.A0C).A01.isVisible()) {
                return true;
            }
            return false;
        }
        if ((this.A02 & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // X.C02K, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        Context context = this.A0A.A0M;
        A01(AbstractC31172DnG.A0A(LayoutInflater.from(context), new LinearLayout(context), i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.A00 != c) {
            this.A00 = Character.toLowerCase(c);
            A00(this);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.A02;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.A02 = i2;
        if (i != i2) {
            A00(this);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.A02;
        if ((i & 4) != 0) {
            WQH wqh = this.A0A;
            int groupId = getGroupId();
            ArrayList arrayList = wqh.A07;
            int size = arrayList.size();
            wqh.A06();
            for (int i2 = 0; i2 < size; i2++) {
                WQJ wqj = (WQJ) arrayList.get(i2);
                if (wqj.getGroupId() == groupId && (wqj.A02 & 4) != 0 && wqj.isCheckable()) {
                    boolean A1X = AbstractC167007dF.A1X(wqj, this);
                    int i3 = wqj.A02;
                    int i4 = i3 & (-3);
                    int i5 = 0;
                    if (A1X) {
                        i5 = 2;
                    }
                    int i6 = i5 | i4;
                    wqj.A02 = i6;
                    if (i3 != i6) {
                        wqj.A0A.A0D(false);
                    }
                }
            }
            wqh.A05();
        } else {
            int i7 = i & (-3);
            int i8 = 0;
            if (z) {
                i8 = 2;
            }
            int i9 = i8 | i7;
            this.A02 = i9;
            if (i != i9) {
                this.A0A.A0D(false);
                return this;
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        int i = this.A02;
        int i2 = i & (-17);
        if (z) {
            i2 = i | 16;
        }
        this.A02 = i2;
        A00(this);
        return this;
    }

    @Override // X.C02K, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.A07 = colorStateList;
        this.A0D = true;
        this.A0G = true;
        A00(this);
        return this;
    }

    @Override // X.C02K, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.A08 = mode;
        this.A0E = true;
        this.A0G = true;
        A00(this);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.A01 != c) {
            this.A01 = c;
            A00(this);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.A01 = c;
        this.A00 = Character.toLowerCase(c2);
        A00(this);
        return this;
    }

    @Override // X.C02K, android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.A05 = i;
        WQH wqh = this.A0A;
        wqh.A0A = true;
        wqh.A0D(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.A0M = charSequence;
        A00(this);
        UDI udi = this.A0B;
        if (udi != null) {
            udi.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.A0N = charSequence;
        A00(this);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.A02;
        int A05 = AbstractC167007dF.A05(z ? 1 : 0) | (i & (-9));
        this.A02 = A05;
        if (i != A05) {
            WQH wqh = this.A0A;
            wqh.A0B = true;
            wqh.A0D(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.A0M;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public WQJ(WQH wqh, CharSequence charSequence, int i, int i2, int i3, int i4, int i5) {
        this.A0A = wqh;
        this.A0S = i2;
        this.A0R = i;
        this.A0Q = i3;
        this.A0P = i4;
        this.A0M = charSequence;
        this.A05 = i5;
    }

    @Override // X.C02K, android.view.MenuItem
    public final boolean expandActionView() {
        if (!A02()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.A0J;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.A0A.A0K(this);
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        ES2(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.A06 = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.A0J = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.A09 = onMenuItemClickListener;
        return this;
    }

    @Override // X.C02K, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        Efz(charSequence);
        return this;
    }

    @Override // X.C02K, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        A01(view);
        return this;
    }

    @Override // X.C02K, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.A00 == c && this.A03 == i) {
            return this;
        }
        this.A00 = Character.toLowerCase(c);
        this.A03 = KeyEvent.normalizeMetaState(i);
        A00(this);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.A0I = null;
        this.A0H = i;
        this.A0G = true;
        A00(this);
        return this;
    }

    @Override // X.C02K, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.A01 == c && this.A04 == i) {
            return this;
        }
        this.A01 = c;
        this.A04 = KeyEvent.normalizeMetaState(i);
        A00(this);
        return this;
    }

    @Override // X.C02K, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.A01 = c;
        this.A04 = KeyEvent.normalizeMetaState(i);
        this.A00 = Character.toLowerCase(c2);
        this.A03 = KeyEvent.normalizeMetaState(i2);
        A00(this);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.A0A.A0M.getString(i));
        return this;
    }
}
