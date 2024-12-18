package androidx.fragment.app;

import X.AbstractC018607g;
import X.AbstractC10360h2;
import X.AbstractC10920i8;
import X.AbstractC114515Ew;
import X.AnonymousClass001;
import X.C00R;
import X.C02N;
import X.C06A;
import X.C07R;
import X.C07S;
import X.C08T;
import X.C0eR;
import X.C0f9;
import X.C12000jz;
import X.C12460ko;
import X.C5GL;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity {
    public static final String LIFECYCLE_TAG = "android:support:lifecycle";
    public boolean mCreated;
    public final C0eR mFragmentLifecycleRegistry;
    public final C06A mFragments;
    public boolean mResumed;
    public boolean mStopped;

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i == -1) {
            startIntentSenderForResult(intentSender, -1, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    private void init() {
        this.savedStateRegistryController.A01.A03(new C08T() { // from class: X.0iU
            @Override // X.C08T
            public final Bundle ELr() {
                return FragmentActivity.this.m45lambda$init$0$androidxfragmentappFragmentActivity();
            }
        }, LIFECYCLE_TAG);
        addOnConfigurationChangedListener(new C02N() { // from class: X.0iH
            @Override // X.C02N
            public final void accept(Object obj) {
                FragmentActivity.this.m46lambda$init$1$androidxfragmentappFragmentActivity((Configuration) obj);
            }
        });
        addOnNewIntentListener(new C02N() { // from class: X.0iG
            @Override // X.C02N
            public final void accept(Object obj) {
                FragmentActivity.this.m47lambda$init$2$androidxfragmentappFragmentActivity((Intent) obj);
            }
        });
        addOnContextAvailableListener(new C00R() { // from class: X.0iD
            @Override // X.C00R
            public final void D7h(Context context) {
                FragmentActivity.this.m48lambda$init$3$androidxfragmentappFragmentActivity(context);
            }
        });
    }

    public static boolean markState(AbstractC10360h2 abstractC10360h2, C07S c07s) {
        boolean z = false;
        for (Fragment fragment : abstractC10360h2.A0U.A04()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z |= markState(fragment.getChildFragmentManager(), c07s);
                }
                C12000jz c12000jz = fragment.mViewLifecycleOwner;
                if (c12000jz != null) {
                    c12000jz.A00();
                    if (c12000jz.A00.A07().A00(C07S.STARTED)) {
                        fragment.mViewLifecycleOwner.A00.A0C(c07s);
                        z = true;
                    }
                }
                if (fragment.mLifecycleRegistry.A00.A00(C07S.STARTED)) {
                    fragment.mLifecycleRegistry.A0C(c07s);
                    z = true;
                }
            }
        }
        return z;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.A00.A03.A0S.onCreateView(view, str, context, attributeSet);
    }

    public AbstractC10360h2 getSupportFragmentManager() {
        return this.mFragments.A00.A03;
    }

    /* renamed from: lambda$init$1$androidx-fragment-app-FragmentActivity, reason: not valid java name */
    public /* synthetic */ void m46lambda$init$1$androidxfragmentappFragmentActivity(Configuration configuration) {
        this.mFragments.A00.A03.A0a();
    }

    /* renamed from: lambda$init$2$androidx-fragment-app-FragmentActivity, reason: not valid java name */
    public /* synthetic */ void m47lambda$init$2$androidxfragmentappFragmentActivity(Intent intent) {
        this.mFragments.A00.A03.A0a();
    }

    /* renamed from: lambda$init$3$androidx-fragment-app-FragmentActivity, reason: not valid java name */
    public /* synthetic */ void m48lambda$init$3$androidxfragmentappFragmentActivity(Context context) {
        AbstractC10920i8 abstractC10920i8 = this.mFragments.A00;
        abstractC10920i8.A03.A0m(null, abstractC10920i8, abstractC10920i8);
    }

    public void markFragmentsCreated() {
        do {
        } while (markState(this.mFragments.A00.A03, C07S.CREATED));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.A00.A03.A0a();
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.mFragments.A00.A03.A0S.onCreateView(view, str, context, attributeSet);
        if (onCreateView == null) {
            return super.onCreateView(view, str, context, attributeSet);
        }
        return onCreateView;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.A00.A03.A0a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.A0B(C07R.ON_RESUME);
        AbstractC10360h2 abstractC10360h2 = this.mFragments.A00.A03;
        abstractC10360h2.A0I = false;
        abstractC10360h2.A0J = false;
        abstractC10360h2.A0B.A01 = false;
        AbstractC10360h2.A0C(abstractC10360h2, 7);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.A00.A03.A0a();
    }

    public FragmentActivity(int i) {
        super(i);
        this.mFragments = new C06A(new C12460ko(this));
        this.mFragmentLifecycleRegistry = new C0eR(this, true);
        this.mStopped = true;
        init();
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String A0R = AnonymousClass001.A0R(str, "  ");
            printWriter.print(A0R);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                AbstractC018607g.A00(this).A05(A0R, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.A00.A03.A0z(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Deprecated
    public AbstractC018607g getSupportLoaderManager() {
        return AbstractC018607g.A00(this);
    }

    /* renamed from: lambda$init$0$androidx-fragment-app-FragmentActivity, reason: not valid java name */
    public /* synthetic */ Bundle m45lambda$init$0$androidxfragmentappFragmentActivity() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.A0B(C07R.ON_STOP);
        return new Bundle();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(-1607969077);
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.A0B(C07R.ON_CREATE);
        AbstractC10360h2 abstractC10360h2 = this.mFragments.A00.A03;
        abstractC10360h2.A0I = false;
        abstractC10360h2.A0J = false;
        abstractC10360h2.A0B.A01 = false;
        AbstractC10360h2.A0C(abstractC10360h2, 1);
        C0f9.A07(-31364971, A00);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        int A00 = C0f9.A00(-657998352);
        super.onDestroy();
        this.mFragments.A00.A03.A0X();
        this.mFragmentLifecycleRegistry.A0B(C07R.ON_DESTROY);
        C0f9.A07(878966625, A00);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.A00.A03.A15(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        int A00 = C0f9.A00(1017292864);
        super.onPause();
        this.mResumed = false;
        AbstractC10360h2.A0C(this.mFragments.A00.A03, 5);
        this.mFragmentLifecycleRegistry.A0B(C07R.ON_PAUSE);
        C0f9.A07(1576098307, A00);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // android.app.Activity
    public void onResume() {
        int A00 = C0f9.A00(561736250);
        this.mFragments.A00.A03.A0a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.A00.A03.A10(true);
        C0f9.A07(-1018825767, A00);
    }

    @Override // android.app.Activity
    public void onStart() {
        int A00 = C0f9.A00(1455024966);
        this.mFragments.A00.A03.A0a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            AbstractC10360h2 abstractC10360h2 = this.mFragments.A00.A03;
            abstractC10360h2.A0I = false;
            abstractC10360h2.A0J = false;
            abstractC10360h2.A0B.A01 = false;
            AbstractC10360h2.A0C(abstractC10360h2, 4);
        }
        this.mFragments.A00.A03.A10(true);
        this.mFragmentLifecycleRegistry.A0B(C07R.ON_START);
        AbstractC10360h2 abstractC10360h22 = this.mFragments.A00.A03;
        abstractC10360h22.A0I = false;
        abstractC10360h22.A0J = false;
        abstractC10360h22.A0B.A01 = false;
        AbstractC10360h2.A0C(abstractC10360h22, 5);
        C0f9.A07(-2036869785, A00);
    }

    @Override // android.app.Activity
    public void onStop() {
        int A00 = C0f9.A00(1355157239);
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        AbstractC10360h2 abstractC10360h2 = this.mFragments.A00.A03;
        abstractC10360h2.A0J = true;
        abstractC10360h2.A0B.A01 = true;
        AbstractC10360h2.A0C(abstractC10360h2, 4);
        this.mFragmentLifecycleRegistry.A0B(C07R.ON_STOP);
        C0f9.A07(853652186, A00);
    }

    public void supportFinishAfterTransition() {
        finishAfterTransition();
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        startPostponedEnterTransition();
    }

    public void setEnterSharedElementCallback(C5GL c5gl) {
        AbstractC114515Ew.A03(this, c5gl);
    }

    public void setExitSharedElementCallback(C5GL c5gl) {
        AbstractC114515Ew.A04(this, c5gl);
    }

    public FragmentActivity() {
        this.mFragments = new C06A(new C12460ko(this));
        this.mFragmentLifecycleRegistry = new C0eR(this, true);
        this.mStopped = true;
        init();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.mFragments.A00.A03.A0S.onCreateView(null, str, context, attributeSet);
        if (onCreateView == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return onCreateView;
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }
}
