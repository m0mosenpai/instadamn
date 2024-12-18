package androidx.appcompat.app;

import X.AbstractC29563D0q;
import X.AbstractC51982Zy;
import X.AbstractC53152bx;
import X.AbstractC55832hO;
import X.AbstractC55842hQ;
import X.C003501a;
import X.C00R;
import X.C08T;
import X.C0f9;
import X.C14360o3;
import X.C2Fg;
import X.C52102aA;
import X.C52112aB;
import X.C53082bp;
import X.C63540Sp8;
import X.InterfaceC47342Fh;
import X.InterfaceC65173TfH;
import X.LayoutInflaterFactory2C52042a4;
import X.UA6;
import X.UD7;
import X.UD8;
import X.VK7;
import X.VKK;
import X.XDW;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.facebook.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class AppCompatActivity extends FragmentActivity implements C2Fg, InterfaceC47342Fh {
    public static final String DELEGATE_TAG = "androidx:appcompat";
    public AbstractC51982Zy mDelegate;
    public Resources mResources;

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
    }

    public void onLocalesChanged(C53082bp c53082bp) {
    }

    public void onNightModeChanged(int i) {
    }

    public void onPrepareSupportNavigateUpTaskStack(AbstractC29563D0q abstractC29563D0q) {
    }

    public void onSupportActionModeFinished(VK7 vk7) {
    }

    public void onSupportActionModeStarted(VK7 vk7) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public VK7 onWindowStartingSupportActionMode(XDW xdw) {
        return null;
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    private void initDelegate() {
        this.savedStateRegistryController.A01.A03(new C08T() { // from class: X.2Zv
            @Override // X.C08T
            public final Bundle ELr() {
                Bundle bundle = new Bundle();
                AppCompatActivity.this.getDelegate();
                return bundle;
            }
        }, DELEGATE_TAG);
        addOnContextAvailableListener(new C00R() { // from class: X.2Zw
            @Override // X.C00R
            public final void D7h(Context context) {
                AppCompatActivity appCompatActivity = AppCompatActivity.this;
                AbstractC51982Zy delegate = appCompatActivity.getDelegate();
                LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4 = (LayoutInflaterFactory2C52042a4) delegate;
                LayoutInflater from = LayoutInflater.from(layoutInflaterFactory2C52042a4.A0l);
                if (from.getFactory() == null) {
                    from.setFactory2(layoutInflaterFactory2C52042a4);
                } else {
                    from.getFactory2();
                }
                delegate.A0L(appCompatActivity.savedStateRegistryController.A01.A00(AppCompatActivity.DELEGATE_TAG));
            }
        });
    }

    public AbstractC51982Zy getDelegate() {
        AbstractC51982Zy abstractC51982Zy = this.mDelegate;
        if (abstractC51982Zy == null) {
            boolean z = AbstractC51982Zy.A05;
            LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4 = new LayoutInflaterFactory2C52042a4(this, null, this, this);
            this.mDelegate = layoutInflaterFactory2C52042a4;
            return layoutInflaterFactory2C52042a4;
        }
        return abstractC51982Zy;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            return super.getResources();
        }
        return resources;
    }

    public void onCreateSupportNavigateUpTaskStack(AbstractC29563D0q abstractC29563D0q) {
        throw new NullPointerException("addParentStack");
    }

    public AppCompatActivity() {
        initDelegate();
    }

    private void initViewTreeOwners() {
        AbstractC55832hO.A01(getWindow().getDecorView(), this);
        ViewTreeViewModelStoreOwner.A01(getWindow().getDecorView(), this);
        AbstractC55842hQ.A01(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        C14360o3.A0B(decorView, 0);
        decorView.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().A0N(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().A0G(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4 = (LayoutInflaterFactory2C52042a4) getDelegate();
        LayoutInflaterFactory2C52042a4.A0D(layoutInflaterFactory2C52042a4);
        VKK vkk = layoutInflaterFactory2C52042a4.A0E;
        if (getWindow().hasFeature(0)) {
            if (vkk == null || !vkk.A0F()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4 = (LayoutInflaterFactory2C52042a4) getDelegate();
        LayoutInflaterFactory2C52042a4.A0D(layoutInflaterFactory2C52042a4);
        VKK vkk = layoutInflaterFactory2C52042a4.A0E;
        if (keyCode == 82 && vkk != null && vkk.A0K(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public View findViewById(int i) {
        LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4 = (LayoutInflaterFactory2C52042a4) getDelegate();
        LayoutInflaterFactory2C52042a4.A0C(layoutInflaterFactory2C52042a4);
        return layoutInflaterFactory2C52042a4.A0A.findViewById(i);
    }

    public InterfaceC65173TfH getDrawerToggleDelegate() {
        return new C63540Sp8((LayoutInflaterFactory2C52042a4) getDelegate());
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        Context context;
        LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4 = (LayoutInflaterFactory2C52042a4) getDelegate();
        MenuInflater menuInflater = layoutInflaterFactory2C52042a4.A07;
        if (menuInflater == null) {
            LayoutInflaterFactory2C52042a4.A0D(layoutInflaterFactory2C52042a4);
            VKK vkk = layoutInflaterFactory2C52042a4.A0E;
            if (vkk != null) {
                context = vkk.A03();
            } else {
                context = layoutInflaterFactory2C52042a4.A0l;
            }
            UA6 ua6 = new UA6(context);
            layoutInflaterFactory2C52042a4.A07 = ua6;
            return ua6;
        }
        return menuInflater;
    }

    public VKK getSupportActionBar() {
        LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4 = (LayoutInflaterFactory2C52042a4) getDelegate();
        LayoutInflaterFactory2C52042a4.A0D(layoutInflaterFactory2C52042a4);
        return layoutInflaterFactory2C52042a4.A0E;
    }

    public Intent getSupportParentActivityIntent() {
        return AbstractC53152bx.A00(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().A0I();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4 = (LayoutInflaterFactory2C52042a4) getDelegate();
        if (layoutInflaterFactory2C52042a4.A0Y && layoutInflaterFactory2C52042a4.A0e) {
            LayoutInflaterFactory2C52042a4.A0D(layoutInflaterFactory2C52042a4);
            VKK vkk = layoutInflaterFactory2C52042a4.A0E;
            if (vkk != null) {
                vkk.A05();
            }
        }
        C52102aA A01 = C52102aA.A01();
        Context context = layoutInflaterFactory2C52042a4.A0l;
        synchronized (A01) {
            C52112aB c52112aB = A01.A00;
            synchronized (c52112aB) {
                C003501a c003501a = (C003501a) c52112aB.A04.get(context);
                if (c003501a != null) {
                    c003501a.A07();
                }
            }
        }
        layoutInflaterFactory2C52042a4.A04 = new Configuration(context.getResources().getConfiguration());
        LayoutInflaterFactory2C52042a4.A0E(layoutInflaterFactory2C52042a4, false, false);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        int A00 = C0f9.A00(-112121549);
        super.onDestroy();
        getDelegate().A0J();
        C0f9.A07(160187004, A00);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4 = (LayoutInflaterFactory2C52042a4) getDelegate();
        LayoutInflaterFactory2C52042a4.A0D(layoutInflaterFactory2C52042a4);
        VKK vkk = layoutInflaterFactory2C52042a4.A0E;
        if (menuItem.getItemId() == 16908332 && vkk != null && (vkk.A02() & 4) != 0) {
            return onSupportNavigateUp();
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        LayoutInflaterFactory2C52042a4.A0C((LayoutInflaterFactory2C52042a4) getDelegate());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4 = (LayoutInflaterFactory2C52042a4) getDelegate();
        LayoutInflaterFactory2C52042a4.A0D(layoutInflaterFactory2C52042a4);
        VKK vkk = layoutInflaterFactory2C52042a4.A0E;
        if (vkk != null) {
            vkk.A0E(true);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        int A00 = C0f9.A00(-1109923859);
        super.onStart();
        LayoutInflaterFactory2C52042a4.A0E((LayoutInflaterFactory2C52042a4) getDelegate(), true, false);
        C0f9.A07(476223630, A00);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        int A00 = C0f9.A00(-200454610);
        super.onStop();
        LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4 = (LayoutInflaterFactory2C52042a4) getDelegate();
        LayoutInflaterFactory2C52042a4.A0D(layoutInflaterFactory2C52042a4);
        VKK vkk = layoutInflaterFactory2C52042a4.A0E;
        if (vkk != null) {
            vkk.A0E(false);
        }
        C0f9.A07(-1510167227, A00);
    }

    public boolean onSupportNavigateUp() {
        Intent A00;
        Intent A002 = AbstractC53152bx.A00(this);
        if (A002 != null) {
            if (shouldUpRecreateTask(A002)) {
                ArrayList arrayList = new ArrayList();
                if (((this instanceof InterfaceC47342Fh) && (A00 = AbstractC53152bx.A00(this)) != null) || (A00 = AbstractC53152bx.A00(this)) != null) {
                    ComponentName component = A00.getComponent();
                    if (component == null) {
                        component = A00.resolveActivity(getPackageManager());
                    }
                    int size = arrayList.size();
                    try {
                        Intent A01 = AbstractC53152bx.A01(component, this);
                        while (A01 != null) {
                            arrayList.add(size, A01);
                            A01 = AbstractC53152bx.A01(A01.getComponent(), this);
                        }
                        arrayList.add(A00);
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                        throw new IllegalArgumentException(e);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                    startActivities(intentArr, null);
                    try {
                        finishAffinity();
                        return true;
                    } catch (IllegalStateException unused) {
                        finish();
                        return true;
                    }
                }
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            navigateUpTo(A002);
            return true;
        }
        return false;
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().A0P(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4 = (LayoutInflaterFactory2C52042a4) getDelegate();
        LayoutInflaterFactory2C52042a4.A0D(layoutInflaterFactory2C52042a4);
        VKK vkk = layoutInflaterFactory2C52042a4.A0E;
        if (getWindow().hasFeature(0)) {
            if (vkk == null || !vkk.A0I()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        initViewTreeOwners();
        getDelegate().A0K(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4 = (LayoutInflaterFactory2C52042a4) getDelegate();
        Object obj = layoutInflaterFactory2C52042a4.A0n;
        if (obj instanceof Activity) {
            LayoutInflaterFactory2C52042a4.A0D(layoutInflaterFactory2C52042a4);
            VKK vkk = layoutInflaterFactory2C52042a4.A0E;
            if (!(vkk instanceof UD8)) {
                layoutInflaterFactory2C52042a4.A07 = null;
                if (vkk != null) {
                    vkk.A06();
                }
                layoutInflaterFactory2C52042a4.A0E = null;
                if (toolbar != null) {
                    UD7 ud7 = new UD7(layoutInflaterFactory2C52042a4.A0F, toolbar, ((Activity) obj).getTitle());
                    layoutInflaterFactory2C52042a4.A0E = ud7;
                    layoutInflaterFactory2C52042a4.A0F.A00 = ud7.A05;
                    toolbar.setBackInvokedCallbackEnabled(true);
                } else {
                    layoutInflaterFactory2C52042a4.A0F.A00 = null;
                }
                layoutInflaterFactory2C52042a4.A0I();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        ((LayoutInflaterFactory2C52042a4) getDelegate()).A03 = i;
    }

    public VK7 startSupportActionMode(XDW xdw) {
        return getDelegate().A0H(xdw);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void supportInvalidateOptionsMenu() {
        getDelegate().A0I();
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().A0Q(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().A0O(view, layoutParams);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        getDelegate().A0M(view);
    }
}
