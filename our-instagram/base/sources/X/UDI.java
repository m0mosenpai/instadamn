package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes11.dex */
public final class UDI extends WQH implements SubMenu {
    public WQH A00;
    public WQJ A01;

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        if (i > 0) {
            super.A01 = this.A0M.getDrawable(i);
        }
        this.A02 = null;
        A0D(false);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        Resources resources = this.A0N;
        if (i > 0) {
            this.A05 = resources.getText(i);
        }
        this.A02 = null;
        A0D(false);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        if (view != null) {
            this.A02 = view;
            this.A05 = null;
            super.A01 = null;
        } else {
            this.A02 = null;
        }
        A0D(false);
        return this;
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A01;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A01.setIcon(i);
        return this;
    }

    @Override // X.WQH
    public final boolean A0H(MenuItem menuItem, WQH wqh) {
        if (!super.A0H(menuItem, wqh) && !this.A00.A0H(menuItem, wqh)) {
            return false;
        }
        return true;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        if (drawable != null) {
            super.A01 = drawable;
        }
        this.A02 = null;
        A0D(false);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.A05 = charSequence;
        }
        this.A02 = null;
        A0D(false);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A01.setIcon(drawable);
        return this;
    }
}
