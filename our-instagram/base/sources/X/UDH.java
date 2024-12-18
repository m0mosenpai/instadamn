package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

/* loaded from: classes11.dex */
public final class UDH extends AbstractC69537Vr1 implements MenuItem {
    public Method A00;
    public final C02K A01;

    public final void A01() {
        try {
            Method method = this.A00;
            if (method == null) {
                method = this.A01.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                this.A00 = method;
            }
            method.invoke(this.A01, true);
        } catch (Exception e) {
            android.util.Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.A01.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.A01.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        C02Y C49 = this.A01.C49();
        if (C49 instanceof UER) {
            return ((UER) C49).A01;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.A01.getActionView();
        if (actionView instanceof C66355UBw) {
            return (View) ((C66355UBw) actionView).A00;
        }
        return actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.A01.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.A01.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.A01.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.A01.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.A01.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.A01.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.A01.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.A01.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.A01.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.A01.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.A01.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.A01.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.A01.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.A01.getSubMenu();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.A01.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.A01.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.A01.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.A01.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.A01.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.A01.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.A01.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.A01.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.A01.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        UER uer = new UER(super.A01, actionProvider, this);
        C02K c02k = this.A01;
        if (actionProvider == null) {
            uer = null;
        }
        c02k.EfC(uer);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        C02K c02k = this.A01;
        c02k.setActionView(i);
        View actionView = c02k.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            c02k.setActionView(new C66355UBw(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.A01.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.A01.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.A01.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.A01.ES2(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.A01.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.A01.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.A01.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.A01.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.A01.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.A01.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        MenuItemOnActionExpandListenerC70222WKt menuItemOnActionExpandListenerC70222WKt;
        C02K c02k = this.A01;
        if (onActionExpandListener != null) {
            menuItemOnActionExpandListenerC70222WKt = new MenuItemOnActionExpandListenerC70222WKt(onActionExpandListener, this);
        } else {
            menuItemOnActionExpandListenerC70222WKt = null;
        }
        c02k.setOnActionExpandListener(menuItemOnActionExpandListenerC70222WKt);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        MenuItemOnMenuItemClickListenerC70223WKu menuItemOnMenuItemClickListenerC70223WKu;
        C02K c02k = this.A01;
        if (onMenuItemClickListener != null) {
            menuItemOnMenuItemClickListenerC70223WKu = new MenuItemOnMenuItemClickListenerC70223WKu(onMenuItemClickListener, this);
        } else {
            menuItemOnMenuItemClickListenerC70223WKu = null;
        }
        c02k.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC70223WKu);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.A01.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        this.A01.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        this.A01.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.A01.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.A01.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.A01.Efz(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        return this.A01.setVisible(z);
    }

    public UDH(Context context, C02K c02k) {
        super(context);
        if (c02k != null) {
            this.A01 = c02k;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C66355UBw(view);
        }
        this.A01.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.A01.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.A01.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.A01.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.A01.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.A01.setTitle(charSequence);
        return this;
    }
}
