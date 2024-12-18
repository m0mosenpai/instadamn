package androidx.activity;

import X.AbstractC001300b;
import X.AbstractC001600g;
import X.AbstractC020908f;
import X.AbstractC021008g;
import X.AbstractC09440dt;
import X.AbstractC210211d;
import X.AbstractC51872Zl;
import X.AbstractC52972be;
import X.AbstractC55832hO;
import X.AbstractC55842hQ;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass008;
import X.AnonymousClass036;
import X.AnonymousClass037;
import X.AnonymousClass038;
import X.C00M;
import X.C00P;
import X.C00R;
import X.C00V;
import X.C00W;
import X.C00X;
import X.C018307d;
import X.C02N;
import X.C03F;
import X.C05990Tn;
import X.C06000To;
import X.C06020Tq;
import X.C07N;
import X.C07R;
import X.C07S;
import X.C07T;
import X.C07X;
import X.C08T;
import X.C08U;
import X.C08W;
import X.C0eR;
import X.C0f9;
import X.C10750hj;
import X.C14360o3;
import X.C15500q5;
import X.C1U9;
import X.C1UA;
import X.C1UB;
import X.C1UC;
import X.C28168CbF;
import X.C28169CbG;
import X.C52962bd;
import X.C52992bg;
import X.C53432cR;
import X.C72852Xp8;
import X.InterfaceC001400c;
import X.InterfaceC018407e;
import X.InterfaceC08430c6;
import X.InterfaceC09390do;
import X.InterfaceC09670ek;
import X.InterfaceC20340zA;
import X.InterfaceC51892Zn;
import X.InterfaceC52932ba;
import X.RunnableC20390zG;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.result.IntentSenderRequest;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Deprecated;

/* loaded from: classes.dex */
public abstract class ComponentActivity extends androidx.core.app.ComponentActivity implements C07X, InterfaceC018407e, C07N, InterfaceC08430c6, C1U9, InterfaceC20340zA, C00W, InterfaceC001400c, C1UA, C1UB, C1UC, AnonymousClass036 {
    public static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    public static final AnonymousClass006 Companion = new Object();
    public C018307d _viewModelStore;
    public final AbstractC001300b activityResultRegistry;
    public int contentLayoutId;
    public final C00P contextAwareHelper;
    public final InterfaceC09390do defaultViewModelProviderFactory$delegate;
    public boolean dispatchingOnMultiWindowModeChanged;
    public boolean dispatchingOnPictureInPictureModeChanged;
    public final InterfaceC09390do fullyDrawnReporter$delegate;
    public final AnonymousClass038 menuHostHelper;
    public final AtomicInteger nextLocalRequestCode;
    public final InterfaceC09390do onBackPressedDispatcher$delegate;
    public final CopyOnWriteArrayList onConfigurationChangedListeners;
    public final CopyOnWriteArrayList onMultiWindowModeChangedListeners;
    public final CopyOnWriteArrayList onNewIntentListeners;
    public final CopyOnWriteArrayList onPictureInPictureModeChangedListeners;
    public final CopyOnWriteArrayList onTrimMemoryListeners;
    public final CopyOnWriteArrayList onUserLeaveHintListeners;
    public final AnonymousClass008 reportFullyDrawnExecutor;
    public final C08W savedStateRegistryController;

    public static final void _init_$lambda$2(ComponentActivity componentActivity, C07X c07x, C07R c07r) {
        Window window;
        View peekDecorView;
        C14360o3.A0B(componentActivity, 0);
        C14360o3.A0B(c07r, 2);
        if (c07r == C07R.ON_STOP && (window = componentActivity.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
            peekDecorView.cancelPendingInputEvents();
        }
    }

    public static final void _init_$lambda$3(ComponentActivity componentActivity, C07X c07x, C07R c07r) {
        C14360o3.A0B(componentActivity, 0);
        C14360o3.A0B(c07r, 2);
        if (c07r == C07R.ON_DESTROY) {
            componentActivity.contextAwareHelper.A01 = null;
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getViewModelStore().A00();
            }
            RunnableC20390zG runnableC20390zG = (RunnableC20390zG) componentActivity.reportFullyDrawnExecutor;
            ComponentActivity componentActivity2 = runnableC20390zG.A03;
            componentActivity2.getWindow().getDecorView().removeCallbacks(runnableC20390zG);
            componentActivity2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(runnableC20390zG);
        }
    }

    public static final Bundle _init_$lambda$4(ComponentActivity componentActivity) {
        C14360o3.A0B(componentActivity, 0);
        Bundle bundle = new Bundle();
        AbstractC001300b abstractC001300b = componentActivity.activityResultRegistry;
        Map map = abstractC001300b.A02;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(abstractC001300b.A01));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(abstractC001300b.A00));
        return bundle;
    }

    public static final void _init_$lambda$5(ComponentActivity componentActivity, Context context) {
        C14360o3.A0B(componentActivity, 0);
        Bundle A00 = componentActivity.savedStateRegistryController.A01.A00(ACTIVITY_RESULT_TAG);
        if (A00 != null) {
            AbstractC001300b abstractC001300b = componentActivity.activityResultRegistry;
            ArrayList<Integer> integerArrayList = A00.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = A00.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                ArrayList<String> stringArrayList2 = A00.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                if (stringArrayList2 != null) {
                    abstractC001300b.A01.addAll(stringArrayList2);
                }
                Bundle bundle = A00.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                if (bundle != null) {
                    abstractC001300b.A00.putAll(bundle);
                }
                int size = stringArrayList.size();
                for (int i = 0; i < size; i++) {
                    String str = stringArrayList.get(i);
                    Map map = abstractC001300b.A02;
                    if (map.containsKey(str)) {
                        Object remove = map.remove(str);
                        if (!abstractC001300b.A00.containsKey(str)) {
                            C15500q5.A04(abstractC001300b.A04).remove(remove);
                        }
                    }
                    Integer num = integerArrayList.get(i);
                    C14360o3.A07(num);
                    int intValue = num.intValue();
                    String str2 = stringArrayList.get(i);
                    C14360o3.A07(str2);
                    Integer valueOf = Integer.valueOf(intValue);
                    abstractC001300b.A04.put(valueOf, str2);
                    map.put(str2, valueOf);
                }
            }
        }
    }

    public static final void addObserverForBackInvoker$lambda$7(C00M c00m, ComponentActivity componentActivity, C07X c07x, C07R c07r) {
        C14360o3.A0B(c00m, 0);
        C14360o3.A0B(componentActivity, 1);
        C14360o3.A0B(c07r, 3);
        if (c07r == C07R.ON_CREATE) {
            c00m.A05(AnonymousClass005.A00(componentActivity));
        }
    }

    public static final void menuHostHelper$lambda$0(ComponentActivity componentActivity) {
        C14360o3.A0B(componentActivity, 0);
        componentActivity.invalidateOptionsMenu();
    }

    @Override // X.AnonymousClass036
    public void addMenuProvider(C03F c03f) {
        C14360o3.A0B(c03f, 0);
        AnonymousClass038 anonymousClass038 = this.menuHostHelper;
        anonymousClass038.A02.add(c03f);
        anonymousClass038.A00.run();
    }

    @Override // X.C1U9
    public final void addOnConfigurationChangedListener(C02N c02n) {
        C14360o3.A0B(c02n, 0);
        this.onConfigurationChangedListeners.add(c02n);
    }

    public final void addOnContextAvailableListener(C00R c00r) {
        C14360o3.A0B(c00r, 0);
        C00P c00p = this.contextAwareHelper;
        Context context = c00p.A01;
        if (context != null) {
            c00r.D7h(context);
        }
        c00p.A00.add(c00r);
    }

    @Override // X.C1UA
    public final void addOnMultiWindowModeChangedListener(C02N c02n) {
        C14360o3.A0B(c02n, 0);
        this.onMultiWindowModeChangedListeners.add(c02n);
    }

    public final void addOnNewIntentListener(C02N c02n) {
        C14360o3.A0B(c02n, 0);
        this.onNewIntentListeners.add(c02n);
    }

    @Override // X.C1UB
    public final void addOnPictureInPictureModeChangedListener(C02N c02n) {
        C14360o3.A0B(c02n, 0);
        this.onPictureInPictureModeChangedListeners.add(c02n);
    }

    @Override // X.C1UC
    public final void addOnTrimMemoryListener(C02N c02n) {
        C14360o3.A0B(c02n, 0);
        this.onTrimMemoryListeners.add(c02n);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        C14360o3.A0B(runnable, 0);
        this.onUserLeaveHintListeners.add(runnable);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        C14360o3.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
        Iterator it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            ((C02N) it.next()).accept(configuration);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        C14360o3.A0B(menu, 1);
        if (i == 0) {
            super.onCreatePanelMenu(i, menu);
            this.menuHostHelper.A01(menu, getMenuInflater());
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        C14360o3.A0B(menuItem, 1);
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.menuHostHelper.A03(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        C14360o3.A0B(intent, 0);
        super.onNewIntent(intent);
        Iterator it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            ((C02N) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        C14360o3.A0B(menu, 1);
        Iterator it = this.menuHostHelper.A02.iterator();
        while (it.hasNext()) {
            ((C10750hj) ((C03F) it.next())).A00.A0h(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        C14360o3.A0B(menu, 2);
        if (i == 0) {
            super.onPreparePanel(i, view, menu);
            this.menuHostHelper.A00(menu);
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)} passing\n      in a {@link RequestMultiplePermissions} object for the {@link ActivityResultContract} and\n      handling the result in the {@link ActivityResultCallback#onActivityResult(Object) callback}.")
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C14360o3.A0B(strArr, 1);
        C14360o3.A0B(iArr, 2);
        if (!this.activityResultRegistry.A05(new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr), i, -1)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Deprecated(message = "Use a {@link androidx.lifecycle.ViewModel} to store non config state.")
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.007] */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        AnonymousClass007 anonymousClass007;
        C018307d c018307d = this._viewModelStore;
        if (c018307d == null && ((anonymousClass007 = (AnonymousClass007) getLastNonConfigurationInstance()) == null || (c018307d = anonymousClass007.A00) == null)) {
            return null;
        }
        ?? obj = new Object();
        obj.A00 = c018307d;
        return obj;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        C0eR c0eR = this.lifecycleRegistry;
        if (c0eR != null) {
            c0eR.A0C(C07S.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.A01.A02(bundle);
    }

    @Override // X.C00W
    public final C00X registerForActivityResult(AbstractC001600g abstractC001600g, C00V c00v) {
        C14360o3.A0B(abstractC001600g, 0);
        C14360o3.A0B(c00v, 1);
        return registerForActivityResult(abstractC001600g, this.activityResultRegistry, c00v);
    }

    @Override // X.AnonymousClass036
    public void removeMenuProvider(C03F c03f) {
        C14360o3.A0B(c03f, 0);
        this.menuHostHelper.A02(c03f);
    }

    @Override // X.C1U9
    public final void removeOnConfigurationChangedListener(C02N c02n) {
        C14360o3.A0B(c02n, 0);
        this.onConfigurationChangedListeners.remove(c02n);
    }

    public final void removeOnContextAvailableListener(C00R c00r) {
        C14360o3.A0B(c00r, 0);
        this.contextAwareHelper.A00.remove(c00r);
    }

    @Override // X.C1UA
    public final void removeOnMultiWindowModeChangedListener(C02N c02n) {
        C14360o3.A0B(c02n, 0);
        this.onMultiWindowModeChangedListeners.remove(c02n);
    }

    public final void removeOnNewIntentListener(C02N c02n) {
        C14360o3.A0B(c02n, 0);
        this.onNewIntentListeners.remove(c02n);
    }

    @Override // X.C1UB
    public final void removeOnPictureInPictureModeChangedListener(C02N c02n) {
        C14360o3.A0B(c02n, 0);
        this.onPictureInPictureModeChangedListeners.remove(c02n);
    }

    @Override // X.C1UC
    public final void removeOnTrimMemoryListener(C02N c02n) {
        C14360o3.A0B(c02n, 0);
        this.onTrimMemoryListeners.remove(c02n);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        C14360o3.A0B(runnable, 0);
        this.onUserLeaveHintListeners.remove(runnable);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartActivityForResult} object for the {@link ActivityResultContract}.")
    public void startActivityForResult(Intent intent, int i) {
        C14360o3.A0B(intent, 0);
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartIntentSenderForResult} object for the\n      {@link ActivityResultContract}.")
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        C14360o3.A0B(intentSender, 0);
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addObserverForBackInvoker(final C00M c00m) {
        this.lifecycleRegistry.A09(new InterfaceC09670ek(this) { // from class: X.0lD
            public final /* synthetic */ ComponentActivity A00;

            {
                this.A00 = this;
            }

            @Override // X.InterfaceC09670ek
            public final void DoQ(C07R c07r, C07X c07x) {
                ComponentActivity.addObserverForBackInvoker$lambda$7(c00m, this.A00, c07x, c07r);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            AnonymousClass007 anonymousClass007 = (AnonymousClass007) getLastNonConfigurationInstance();
            if (anonymousClass007 != null) {
                this._viewModelStore = anonymousClass007.A00;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new C018307d();
            }
        }
    }

    @Override // X.InterfaceC001400c
    public final AbstractC001300b getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // X.C07N
    public AbstractC52972be getDefaultViewModelCreationExtras() {
        Bundle extras;
        C52992bg c52992bg = new C52992bg(C52962bd.A00);
        if (getApplication() != null) {
            InterfaceC51892Zn interfaceC51892Zn = C53432cR.A02;
            Application application = getApplication();
            C14360o3.A07(application);
            c52992bg.A01(interfaceC51892Zn, application);
        }
        c52992bg.A01(AbstractC51872Zl.A01, this);
        c52992bg.A01(AbstractC51872Zl.A02, this);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            c52992bg.A01(AbstractC51872Zl.A00, extras);
        }
        return c52992bg;
    }

    @Override // X.C07N
    public InterfaceC52932ba getDefaultViewModelProviderFactory() {
        return (InterfaceC52932ba) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public C72852Xp8 getFullyDrawnReporter() {
        return (C72852Xp8) this.fullyDrawnReporter$delegate.getValue();
    }

    @Override // androidx.core.app.ComponentActivity, X.C07X
    public C07T getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // X.InterfaceC20340zA
    public final C00M getOnBackPressedDispatcher() {
        return (C00M) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // X.InterfaceC08430c6
    public final C08U getSavedStateRegistry() {
        return this.savedStateRegistryController.A01;
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      with the appropriate {@link ActivityResultContract} and handling the result in the\n      {@link ActivityResultCallback#onActivityResult(Object) callback}.")
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.activityResultRegistry.A05(intent, i, i2)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    @Deprecated(message = "Deprecated in android.app.Activity")
    public void onMultiWindowModeChanged(boolean z) {
        if (!this.dispatchingOnMultiWindowModeChanged) {
            Iterator it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                ((C02N) it.next()).accept(new C28168CbF(z));
            }
        }
    }

    @Override // android.app.Activity
    @Deprecated(message = "Deprecated in android.app.Activity")
    public void onPictureInPictureModeChanged(boolean z) {
        if (!this.dispatchingOnPictureInPictureModeChanged) {
            Iterator it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                ((C02N) it.next()).accept(new C28169CbG(z));
            }
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.A01;
    }

    public ComponentActivity(int i) {
        this();
        this.contentLayoutId = i;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        AnonymousClass008 anonymousClass008 = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        C14360o3.A07(decorView);
        anonymousClass008.FDg(decorView);
        super.addContentView(view, layoutParams);
    }

    @Deprecated(message = "Use a {@link androidx.lifecycle.ViewModel} to store non config state.")
    public Object getLastCustomNonConfigurationInstance() {
        getLastNonConfigurationInstance();
        return null;
    }

    @Override // X.InterfaceC018407e
    public C018307d getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            C018307d c018307d = this._viewModelStore;
            C14360o3.A0A(c018307d);
            return c018307d;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        C14360o3.A07(decorView);
        AbstractC55832hO.A01(decorView, this);
        View decorView2 = getWindow().getDecorView();
        C14360o3.A07(decorView2);
        ViewTreeViewModelStoreOwner.A01(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        C14360o3.A07(decorView3);
        AbstractC55842hQ.A01(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        C14360o3.A07(decorView4);
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        C14360o3.A07(decorView5);
        decorView5.setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the\n      {@link OnBackPressedDispatcher} via {@link #getOnBackPressedDispatcher()}.\n      The OnBackPressedDispatcher controls how back button events are dispatched\n      to one or more {@link OnBackPressedCallback} objects.")
    public void onBackPressed() {
        getOnBackPressedDispatcher().A04();
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(950917542);
        this.savedStateRegistryController.A01(bundle);
        C00P c00p = this.contextAwareHelper;
        c00p.A01 = this;
        Iterator it = c00p.A00.iterator();
        while (it.hasNext()) {
            ((C00R) it.next()).D7h(this);
        }
        super.onCreate(bundle);
        AbstractC210211d.A00(this);
        int i = this.contentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
        C0f9.A07(-1508650169, A00);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            ((C02N) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (AbstractC020908f.A01()) {
                AbstractC020908f.A00("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().A00();
        } finally {
            AbstractC021008g.A00();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        AnonymousClass008 anonymousClass008 = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        C14360o3.A07(decorView);
        anonymousClass008.FDg(decorView);
        super.setContentView(i);
    }

    public void addMenuProvider(final C03F c03f, C07X c07x, final C07S c07s) {
        C14360o3.A0B(c03f, 0);
        C14360o3.A0B(c07x, 1);
        C14360o3.A0B(c07s, 2);
        final AnonymousClass038 anonymousClass038 = this.menuHostHelper;
        C07T lifecycle = c07x.getLifecycle();
        Map map = anonymousClass038.A01;
        AnonymousClass037 anonymousClass037 = (AnonymousClass037) map.remove(c03f);
        if (anonymousClass037 != null) {
            anonymousClass037.A01.A0A(anonymousClass037.A00);
            anonymousClass037.A00 = null;
        }
        map.put(c03f, new AnonymousClass037(lifecycle, new InterfaceC09670ek() { // from class: X.0kx
            @Override // X.InterfaceC09670ek
            public final void DoQ(C07R c07r, C07X c07x2) {
                AnonymousClass038 anonymousClass0382 = AnonymousClass038.this;
                C07S c07s2 = c07s;
                C03F c03f2 = c03f;
                if (c07r == C07P.A01(c07s2)) {
                    anonymousClass0382.A02.add(c03f2);
                } else if (c07r == C07R.ON_DESTROY) {
                    anonymousClass0382.A02(c03f2);
                    return;
                } else if (c07r != C07P.A00(c07s2)) {
                    return;
                } else {
                    anonymousClass0382.A02.remove(c03f2);
                }
                anonymousClass0382.A00.run();
            }
        }));
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        C14360o3.A0B(configuration, 1);
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                ((C02N) it.next()).accept(new C28168CbF(z, configuration));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C14360o3.A0B(configuration, 1);
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                ((C02N) it.next()).accept(new C28169CbG(z, configuration));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    public final C00X registerForActivityResult(AbstractC001600g abstractC001600g, AbstractC001300b abstractC001300b, C00V c00v) {
        C14360o3.A0B(abstractC001600g, 0);
        C14360o3.A0B(abstractC001300b, 1);
        C14360o3.A0B(c00v, 2);
        return abstractC001300b.A01(c00v, abstractC001600g, this, AnonymousClass001.A0O("activity_rq#", this.nextLocalRequestCode.getAndIncrement()));
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        AnonymousClass008 anonymousClass008 = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        C14360o3.A07(decorView);
        anonymousClass008.FDg(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartActivityForResult} object for the {@link ActivityResultContract}.")
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        C14360o3.A0B(intent, 0);
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartIntentSenderForResult} object for the\n      {@link ActivityResultContract}.")
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        C14360o3.A0B(intentSender, 0);
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public ComponentActivity() {
        this.contextAwareHelper = new C00P();
        this.menuHostHelper = new AnonymousClass038(new Runnable() { // from class: X.004
            @Override // java.lang.Runnable
            public final void run() {
                ComponentActivity.menuHostHelper$lambda$0(ComponentActivity.this);
            }
        });
        C08W c08w = new C08W(this);
        this.savedStateRegistryController = c08w;
        this.reportFullyDrawnExecutor = new RunnableC20390zG(this);
        this.fullyDrawnReporter$delegate = AbstractC09440dt.A01(new C06000To(this));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new AbstractC001300b() { // from class: X.0zF
            @Override // X.AbstractC001300b
            public final void A03(AbstractC001600g abstractC001600g, C35204Ffw c35204Ffw, Object obj, final int i) {
                ComponentActivity componentActivity = ComponentActivity.this;
                final C00f A01 = abstractC001600g.A01(componentActivity, obj);
                if (A01 != null) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: X.00A
                        @Override // java.lang.Runnable
                        public final void run() {
                            C20380zF c20380zF = C20380zF.this;
                            int i2 = i;
                            Object obj2 = A01.A00;
                            String str = (String) c20380zF.A04.get(Integer.valueOf(i2));
                            if (str != null) {
                                C00Y c00y = (C00Y) c20380zF.A06.get(str);
                                if (c00y != null) {
                                    C00V c00v = c00y.A00;
                                    if (c20380zF.A01.remove(str)) {
                                        c00v.Cv1(obj2);
                                        return;
                                    }
                                    return;
                                }
                                ((AbstractC001300b) c20380zF).A00.remove(str);
                                c20380zF.A03.put(str, obj2);
                            }
                        }
                    });
                    return;
                }
                Intent A00 = abstractC001600g.A00(componentActivity, obj);
                Bundle bundle = null;
                if (A00.getExtras() != null) {
                    Bundle extras = A00.getExtras();
                    C14360o3.A0A(extras);
                    if (extras.getClassLoader() == null) {
                        A00.setExtrasClassLoader(componentActivity.getClassLoader());
                    }
                }
                if (A00.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                    bundle = A00.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    A00.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                }
                if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(A00.getAction())) {
                    String[] stringArrayExtra = A00.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    if (stringArrayExtra == null) {
                        stringArrayExtra = new String[0];
                    }
                    AbstractC114515Ew.A05(componentActivity, stringArrayExtra, i);
                    return;
                }
                if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(A00.getAction())) {
                    IntentSenderRequest intentSenderRequest = (IntentSenderRequest) A00.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                    try {
                        C14360o3.A0A(intentSenderRequest);
                        componentActivity.startIntentSenderForResult(intentSenderRequest.A03, i, intentSenderRequest.A02, intentSenderRequest.A00, intentSenderRequest.A01, 0, bundle);
                        return;
                    } catch (IntentSender.SendIntentException e) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: X.00B
                            @Override // java.lang.Runnable
                            public final void run() {
                                A05(new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", e), i, 0);
                            }
                        });
                        return;
                    }
                }
                componentActivity.startActivityForResult(A00, i, bundle);
            }
        };
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList();
        this.onNewIntentListeners = new CopyOnWriteArrayList();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList();
        C0eR c0eR = this.lifecycleRegistry;
        if (c0eR != null) {
            c0eR.A09(new InterfaceC09670ek() { // from class: X.0lC
                @Override // X.InterfaceC09670ek
                public final void DoQ(C07R c07r, C07X c07x) {
                    ComponentActivity._init_$lambda$2(ComponentActivity.this, c07x, c07r);
                }
            });
            this.lifecycleRegistry.A09(new InterfaceC09670ek() { // from class: X.0lB
                @Override // X.InterfaceC09670ek
                public final void DoQ(C07R c07r, C07X c07x) {
                    ComponentActivity._init_$lambda$3(ComponentActivity.this, c07x, c07r);
                }
            });
            this.lifecycleRegistry.A09(new InterfaceC09670ek() { // from class: X.0lA
                @Override // X.InterfaceC09670ek
                public final void DoQ(C07R c07r, C07X c07x) {
                    ComponentActivity componentActivity = ComponentActivity.this;
                    componentActivity.ensureViewModelStore();
                    componentActivity.lifecycleRegistry.A0A(this);
                }
            });
            c08w.A00();
            AbstractC51872Zl.A01(this);
            this.savedStateRegistryController.A01.A03(new C08T() { // from class: X.0zI
                @Override // X.C08T
                public final Bundle ELr() {
                    return ComponentActivity._init_$lambda$4(ComponentActivity.this);
                }
            }, ACTIVITY_RESULT_TAG);
            addOnContextAvailableListener(new C00R() { // from class: X.0zH
                @Override // X.C00R
                public final void D7h(Context context) {
                    ComponentActivity._init_$lambda$5(ComponentActivity.this, context);
                }
            });
            this.defaultViewModelProviderFactory$delegate = AbstractC09440dt.A01(new C06020Tq(this));
            this.onBackPressedDispatcher$delegate = AbstractC09440dt.A01(new C05990Tn(this));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public void addMenuProvider(final C03F c03f, C07X c07x) {
        C14360o3.A0B(c03f, 0);
        C14360o3.A0B(c07x, 1);
        final AnonymousClass038 anonymousClass038 = this.menuHostHelper;
        anonymousClass038.A02.add(c03f);
        anonymousClass038.A00.run();
        C07T lifecycle = c07x.getLifecycle();
        Map map = anonymousClass038.A01;
        AnonymousClass037 anonymousClass037 = (AnonymousClass037) map.remove(c03f);
        if (anonymousClass037 != null) {
            anonymousClass037.A01.A0A(anonymousClass037.A00);
            anonymousClass037.A00 = null;
        }
        map.put(c03f, new AnonymousClass037(lifecycle, new InterfaceC09670ek() { // from class: X.0ky
            @Override // X.InterfaceC09670ek
            public final void DoQ(C07R c07r, C07X c07x2) {
                AnonymousClass038 anonymousClass0382 = AnonymousClass038.this;
                C03F c03f2 = c03f;
                if (c07r == C07R.ON_DESTROY) {
                    anonymousClass0382.A02(c03f2);
                }
            }
        }));
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        AnonymousClass008 anonymousClass008 = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        C14360o3.A07(decorView);
        anonymousClass008.FDg(decorView);
        super.setContentView(view);
    }
}
