package androidx.fragment.app;

import X.AbstractC001300b;
import X.AbstractC001600g;
import X.AbstractC018607g;
import X.AbstractC10070gK;
import X.AbstractC10360h2;
import X.AbstractC10920i8;
import X.AbstractC55832hO;
import X.AbstractC55842hQ;
import X.AnonymousClass001;
import X.AnonymousClass061;
import X.AnonymousClass067;
import X.C005101q;
import X.C00V;
import X.C00W;
import X.C00X;
import X.C018307d;
import X.C05z;
import X.C06B;
import X.C06X;
import X.C06Y;
import X.C07A;
import X.C07F;
import X.C07J;
import X.C07K;
import X.C07L;
import X.C07N;
import X.C07R;
import X.C07S;
import X.C07T;
import X.C07X;
import X.C08890cs;
import X.C08U;
import X.C08W;
import X.C0eR;
import X.C0f9;
import X.C11450j3;
import X.C12000jz;
import X.C12460ko;
import X.C14360o3;
import X.C1N8;
import X.C2GS;
import X.C2GT;
import X.C5GL;
import X.InterfaceC018407e;
import X.InterfaceC08430c6;
import X.InterfaceC09670ek;
import X.InterfaceC52932ba;
import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class Fragment implements C07X, InterfaceC018407e, C07N, InterfaceC08430c6, C00W, ComponentCallbacks, View.OnCreateContextMenuListener {
    public static final int ACTIVITY_CREATED = 4;
    public static final int ATTACHED = 0;
    public static final int AWAITING_ENTER_EFFECTS = 6;
    public static final int AWAITING_EXIT_EFFECTS = 3;
    public static final int CREATED = 1;
    public static final int INITIALIZING = -1;
    public static final int RESUMED = 7;
    public static final int STARTED = 5;
    public static final Object USE_DEFAULT_TRANSITION = new Object();
    public static final int VIEW_CREATED = 2;
    public boolean mAdded;
    public C05z mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    public boolean mBeingSaved;
    public boolean mCalled;
    public AbstractC10360h2 mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    public int mContentLayoutId;
    public InterfaceC52932ba mDefaultFactory;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public AbstractC10360h2 mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public AbstractC10920i8 mHost;
    public boolean mInDynamicContainer;
    public boolean mInLayout;
    public boolean mIsCreated;
    public Boolean mIsPrimaryNavigationFragment;
    public LayoutInflater mLayoutInflater;
    public C0eR mLifecycleRegistry;
    public C07S mMaxState;
    public boolean mMenuVisible;
    public final AtomicInteger mNextLocalRequestCode;
    public final ArrayList mOnPreAttachedListeners;
    public Fragment mParentFragment;
    public boolean mPerformedCreateView;
    public Runnable mPostponedDurationRunnable;
    public Handler mPostponedHandler;
    public String mPreviousWho;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    public final AnonymousClass061 mSavedStateAttachListener;
    public C08W mSavedStateRegistryController;
    public Boolean mSavedUserVisibleHint;
    public Bundle mSavedViewRegistryState;
    public SparseArray mSavedViewState;
    public int mState;
    public String mTag;
    public Fragment mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mTransitioning;
    public boolean mUserVisibleHint;
    public View mView;
    public C12000jz mViewLifecycleOwner;
    public C2GS mViewLifecycleOwnerLiveData;
    public String mWho;

    /* loaded from: classes.dex */
    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new Parcelable.ClassLoaderCreator() { // from class: X.062
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new Fragment.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new Fragment.SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new Fragment.SavedState(parcel, classLoader);
            }
        };
        public final Bundle A00;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.A00);
        }

        public SavedState(Bundle bundle) {
            this.A00 = bundle;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.A00 = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new C0eR(this, true);
        this.mSavedStateRegistryController = new C08W(this);
        this.mDefaultFactory = null;
        if (!this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            registerOnPreAttachListener(this.mSavedStateAttachListener);
        }
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    private C00X prepareCallInternal(final AbstractC001600g abstractC001600g, final C1N8 c1n8, final C00V c00v) {
        if (this.mState <= 1) {
            final AtomicReference atomicReference = new AtomicReference();
            registerOnPreAttachListener(new AnonymousClass061() { // from class: X.0ia
                @Override // X.AnonymousClass061
                public final void A00() {
                    Fragment fragment = this;
                    String generateActivityResultKey = fragment.generateActivityResultKey();
                    AbstractC001300b abstractC001300b = (AbstractC001300b) c1n8.apply(null);
                    atomicReference.set(abstractC001300b.A01(c00v, abstractC001600g, fragment, generateActivityResultKey));
                }
            });
            return new C00X() { // from class: X.0jA
                @Override // X.C00X
                public final void A01(C35204Ffw c35204Ffw, Object obj) {
                    C00X c00x = (C00X) atomicReference.get();
                    if (c00x != null) {
                        c00x.A01(null, obj);
                        return;
                    }
                    throw new IllegalStateException("Operation cannot be started before fragment is in created state");
                }

                @Override // X.C00X
                public final void A00() {
                    C00X c00x = (C00X) atomicReference.getAndSet(null);
                    if (c00x != null) {
                        c00x.A00();
                    }
                }
            };
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
        throw new IllegalStateException(sb.toString());
    }

    public View getAnimatingAway() {
        return null;
    }

    public C5GL getEnterTransitionCallback() {
        return null;
    }

    public C5GL getExitTransitionCallback() {
        return null;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        AbstractC10360h2.A0H(2);
    }

    public void onAttach(Context context) {
        Activity activity;
        this.mCalled = true;
        AbstractC10920i8 abstractC10920i8 = this.mHost;
        if (abstractC10920i8 != null && (activity = abstractC10920i8.A00) != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        AbstractC10920i8 abstractC10920i8 = this.mHost;
        if (abstractC10920i8 != null && abstractC10920i8.A00 != null) {
            this.mCalled = false;
            this.mCalled = true;
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            AbstractC10360h2 abstractC10360h2 = this.mChildFragmentManager;
            if (!abstractC10360h2.A0G) {
                abstractC10360h2.A0X();
                this.mChildFragmentManager = new AbstractC10360h2();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onDetach()");
        throw new AndroidRuntimeException(sb.toString());
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.fragment.app.FragmentManager$LaunchedFragmentInfo, java.lang.Object] */
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        Intent intent2 = intent;
        if (this.mHost != null) {
            AbstractC10360h2.A0H(2);
            AbstractC10360h2 parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.A04 != null) {
                if (bundle != null) {
                    if (intent == null) {
                        intent2 = new Intent();
                        intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                    }
                    AbstractC10360h2.A0H(2);
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                C14360o3.A0B(intentSender, 1);
                IntentSenderRequest intentSenderRequest = new IntentSenderRequest(intent2, intentSender, i2, i3);
                String str = this.mWho;
                ?? obj = new Object();
                obj.A01 = str;
                obj.A00 = i;
                parentFragmentManager.A0D.addLast(obj);
                AbstractC10360h2.A0H(2);
                parentFragmentManager.A04.A02(intentSenderRequest);
                return;
            }
            AbstractC10920i8 abstractC10920i8 = parentFragmentManager.A0A;
            C14360o3.A0B(intentSender, 1);
            boolean z = false;
            if (i == -1) {
                z = true;
            }
            if (z) {
                Activity activity = abstractC10920i8.A00;
                if (activity != null) {
                    activity.startIntentSenderForResult(intentSender, i, intent2, i2, i3, i4, bundle);
                    return;
                }
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    private C05z ensureAnimationInfo() {
        C05z c05z = this.mAnimationInfo;
        if (c05z == null) {
            C05z c05z2 = new C05z();
            this.mAnimationInfo = c05z2;
            return c05z2;
        }
        return c05z;
    }

    private int getMinimumMaxLifecycleState() {
        Fragment fragment;
        C07S c07s = this.mMaxState;
        if (c07s != C07S.INITIALIZED && (fragment = this.mParentFragment) != null) {
            return Math.min(c07s.ordinal(), fragment.getMinimumMaxLifecycleState());
        }
        return c07s.ordinal();
    }

    private Fragment getTargetFragment(boolean z) {
        String str;
        if (z) {
            C07K c07k = C07K.A01;
            StringBuilder sb = new StringBuilder();
            sb.append("Attempting to get target fragment from fragment ");
            sb.append(this);
            C07L c07l = new C07L(this, sb.toString());
            AbstractC10360h2.A0H(3);
            C07J A00 = C07K.A00(this);
            if (A00.A01.contains(C07F.DETECT_TARGET_FRAGMENT_USAGE) && C07K.A05(A00, getClass(), c07l.getClass())) {
                C07K.A04(A00, c07l);
            }
        }
        Fragment fragment = this.mTarget;
        if (fragment == null) {
            AbstractC10360h2 abstractC10360h2 = this.mFragmentManager;
            if (abstractC10360h2 != null && (str = this.mTargetWho) != null) {
                return abstractC10360h2.A0U.A00(str);
            }
            return null;
        }
        return fragment;
    }

    private void registerOnPreAttachListener(AnonymousClass061 anonymousClass061) {
        if (this.mState >= 0) {
            anonymousClass061.A00();
        } else {
            this.mOnPreAttachedListeners.add(anonymousClass061);
        }
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        AbstractC10360h2 abstractC10360h2;
        C05z c05z = this.mAnimationInfo;
        if (c05z != null) {
            c05z.A0J = false;
        }
        if (this.mView != null && (viewGroup = this.mContainer) != null && (abstractC10360h2 = this.mFragmentManager) != null) {
            final C07A A02 = C07A.A02(viewGroup, abstractC10360h2);
            A02.A08();
            if (z) {
                this.mHost.A02.post(new Runnable() { // from class: X.05w
                    @Override // java.lang.Runnable
                    public final void run() {
                        C07A c07a = A02;
                        if (!c07a.A03.isEmpty()) {
                            c07a.A06();
                        }
                    }
                });
            } else {
                A02.A06();
            }
            Handler handler = this.mPostponedHandler;
            if (handler != null) {
                handler.removeCallbacks(this.mPostponedDurationRunnable);
                this.mPostponedHandler = null;
            }
        }
    }

    public AnonymousClass067 createFragmentContainer() {
        return new C11450j3(this);
    }

    public Fragment findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.A0U.A01(str);
    }

    public final FragmentActivity getActivity() {
        AbstractC10920i8 abstractC10920i8 = this.mHost;
        if (abstractC10920i8 == null) {
            return null;
        }
        return (FragmentActivity) abstractC10920i8.A00;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C05z c05z = this.mAnimationInfo;
        if (c05z != null && (bool = c05z.A09) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C05z c05z = this.mAnimationInfo;
        if (c05z != null && (bool = c05z.A0A) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final AbstractC10360h2 getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" has not been attached yet.");
        throw new IllegalStateException(sb.toString());
    }

    public Context getContext() {
        AbstractC10920i8 abstractC10920i8 = this.mHost;
        if (abstractC10920i8 == null) {
            return null;
        }
        return abstractC10920i8.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        if (r2 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
    
        if (X.AbstractC10360h2.A0H(3) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
    
        requireContext().getApplicationContext();
     */
    @Override // X.C07N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.InterfaceC52932ba getDefaultViewModelProviderFactory() {
        /*
            r3 = this;
            X.0h2 r0 = r3.mFragmentManager
            if (r0 == 0) goto L3d
            X.2ba r1 = r3.mDefaultFactory
            if (r1 != 0) goto L35
            r2 = 0
            android.content.Context r0 = r3.requireContext()
            android.content.Context r1 = r0.getApplicationContext()
        L11:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L1e
            boolean r0 = r1 instanceof android.app.Application
            if (r0 == 0) goto L36
            r2 = r1
            android.app.Application r2 = (android.app.Application) r2
            if (r2 != 0) goto L2c
        L1e:
            r0 = 3
            boolean r0 = X.AbstractC10360h2.A0H(r0)
            if (r0 == 0) goto L2c
            android.content.Context r0 = r3.requireContext()
            r0.getApplicationContext()
        L2c:
            android.os.Bundle r0 = r3.mArguments
            X.6tO r1 = new X.6tO
            r1.<init>(r2, r0, r3)
            r3.mDefaultFactory = r1
        L35:
            return r1
        L36:
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L11
        L3d:
            java.lang.String r1 = "Can't access ViewModels from detached fragment"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.getDefaultViewModelProviderFactory():X.2ba");
    }

    public int getEnterAnim() {
        C05z c05z = this.mAnimationInfo;
        if (c05z == null) {
            return 0;
        }
        return c05z.A01;
    }

    public Object getEnterTransition() {
        C05z c05z = this.mAnimationInfo;
        if (c05z == null) {
            return null;
        }
        return c05z.A0B;
    }

    public int getExitAnim() {
        C05z c05z = this.mAnimationInfo;
        if (c05z == null) {
            return 0;
        }
        return c05z.A02;
    }

    public Object getExitTransition() {
        C05z c05z = this.mAnimationInfo;
        if (c05z == null) {
            return null;
        }
        return c05z.A0C;
    }

    public View getFocusedView() {
        C05z c05z = this.mAnimationInfo;
        if (c05z == null) {
            return null;
        }
        return c05z.A06;
    }

    @Deprecated
    public final AbstractC10360h2 getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        AbstractC10920i8 abstractC10920i8 = this.mHost;
        if (abstractC10920i8 == null) {
            return null;
        }
        return ((C12460ko) abstractC10920i8).A00;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        AbstractC10920i8 abstractC10920i8 = this.mHost;
        if (abstractC10920i8 != null) {
            LayoutInflater A02 = abstractC10920i8.A02();
            A02.setFactory2(this.mChildFragmentManager.A0S);
            return A02;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Override // X.C07X
    public C07T getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public int getNextTransition() {
        C05z c05z = this.mAnimationInfo;
        if (c05z == null) {
            return 0;
        }
        return c05z.A03;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final AbstractC10360h2 getParentFragmentManager() {
        AbstractC10360h2 abstractC10360h2 = this.mFragmentManager;
        if (abstractC10360h2 != null) {
            return abstractC10360h2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not associated with a fragment manager.");
        throw new IllegalStateException(sb.toString());
    }

    public boolean getPopDirection() {
        C05z c05z = this.mAnimationInfo;
        if (c05z == null) {
            return false;
        }
        return c05z.A0K;
    }

    public int getPopEnterAnim() {
        C05z c05z = this.mAnimationInfo;
        if (c05z == null) {
            return 0;
        }
        return c05z.A04;
    }

    public int getPopExitAnim() {
        C05z c05z = this.mAnimationInfo;
        if (c05z == null) {
            return 0;
        }
        return c05z.A05;
    }

    public float getPostOnViewCreatedAlpha() {
        C05z c05z = this.mAnimationInfo;
        if (c05z == null) {
            return 1.0f;
        }
        return c05z.A00;
    }

    public Object getReenterTransition() {
        C05z c05z = this.mAnimationInfo;
        if (c05z == null) {
            return null;
        }
        Object obj = c05z.A0D;
        if (obj != USE_DEFAULT_TRANSITION) {
            return obj;
        }
        return getExitTransition();
    }

    public Object getReturnTransition() {
        C05z c05z = this.mAnimationInfo;
        if (c05z == null) {
            return null;
        }
        Object obj = c05z.A0E;
        if (obj != USE_DEFAULT_TRANSITION) {
            return obj;
        }
        return getEnterTransition();
    }

    @Override // X.InterfaceC08430c6
    public final C08U getSavedStateRegistry() {
        return this.mSavedStateRegistryController.A01;
    }

    public Object getSharedElementEnterTransition() {
        C05z c05z = this.mAnimationInfo;
        if (c05z == null) {
            return null;
        }
        return c05z.A0F;
    }

    public Object getSharedElementReturnTransition() {
        C05z c05z = this.mAnimationInfo;
        if (c05z == null) {
            return null;
        }
        Object obj = c05z.A0G;
        if (obj != USE_DEFAULT_TRANSITION) {
            return obj;
        }
        return getSharedElementEnterTransition();
    }

    public ArrayList getSharedElementSourceNames() {
        ArrayList arrayList;
        C05z c05z = this.mAnimationInfo;
        if (c05z == null || (arrayList = c05z.A0H) == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    public ArrayList getSharedElementTargetNames() {
        ArrayList arrayList;
        C05z c05z = this.mAnimationInfo;
        if (c05z == null || (arrayList = c05z.A0I) == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public C07X getViewLifecycleOwner() {
        C12000jz c12000jz = this.mViewLifecycleOwner;
        if (c12000jz != null) {
            return c12000jz;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't access the Fragment View's LifecycleOwner for ");
        sb.append(this);
        sb.append(" when getView() is null i.e., before onCreateView() or after onDestroyView()");
        throw new IllegalStateException(sb.toString());
    }

    public C2GT getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // X.InterfaceC018407e
    public C018307d getViewModelStore() {
        AbstractC10360h2 abstractC10360h2 = this.mFragmentManager;
        if (abstractC10360h2 != null) {
            if (getMinimumMaxLifecycleState() != 1) {
                HashMap hashMap = abstractC10360h2.A0B.A04;
                C018307d c018307d = (C018307d) hashMap.get(this.mWho);
                if (c018307d == null) {
                    C018307d c018307d2 = new C018307d();
                    hashMap.put(this.mWho, c018307d2);
                    return c018307d2;
                }
                return c018307d;
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final boolean isAdded() {
        if (this.mHost != null && this.mAdded) {
            return true;
        }
        return false;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        Fragment fragment;
        if (!this.mHidden) {
            if (this.mFragmentManager != null && (fragment = this.mParentFragment) != null && fragment.isHidden()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean isInBackStack() {
        if (this.mBackStackNesting <= 0) {
            return false;
        }
        return true;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        Fragment fragment;
        if (this.mMenuVisible) {
            if (this.mFragmentManager == null || (fragment = this.mParentFragment) == null || fragment.isMenuVisible()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean isPostponed() {
        C05z c05z = this.mAnimationInfo;
        if (c05z == null) {
            return false;
        }
        return c05z.A0J;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        if (this.mState < 7) {
            return false;
        }
        return true;
    }

    public final boolean isStateSaved() {
        AbstractC10360h2 abstractC10360h2 = this.mFragmentManager;
        if (abstractC10360h2 == null) {
            return false;
        }
        return abstractC10360h2.A11();
    }

    /* renamed from: lambda$performCreateView$0$androidx-fragment-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m44lambda$performCreateView$0$androidxfragmentappFragment() {
        C12000jz c12000jz = this.mViewLifecycleOwner;
        c12000jz.A01.A01(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.A0a();
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.A0a();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            restoreViewState();
            AbstractC10360h2 abstractC10360h2 = this.mChildFragmentManager;
            abstractC10360h2.A0I = false;
            abstractC10360h2.A0J = false;
            abstractC10360h2.A0B.A01 = false;
            AbstractC10360h2.A0C(abstractC10360h2, 4);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onActivityCreated()");
        throw new AndroidRuntimeException(sb.toString());
    }

    public void performAttach() {
        Iterator it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            ((AnonymousClass061) it.next()).A00();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.A0m(this, createFragmentContainer(), this.mHost);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.A01);
        if (this.mCalled) {
            AbstractC10360h2 abstractC10360h2 = this.mFragmentManager;
            Iterator it2 = abstractC10360h2.A0Z.iterator();
            while (it2.hasNext()) {
                ((C06Y) it2.next()).Cxc(this, abstractC10360h2);
            }
            AbstractC10360h2 abstractC10360h22 = this.mChildFragmentManager;
            abstractC10360h22.A0I = false;
            abstractC10360h22.A0J = false;
            abstractC10360h22.A0B.A01 = false;
            AbstractC10360h2.A0C(abstractC10360h22, 0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onAttach()");
        throw new AndroidRuntimeException(sb.toString());
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            return this.mChildFragmentManager.A15(menuItem);
        }
        return false;
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.A0a();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.A09(new InterfaceC09670ek() { // from class: X.0kq
            @Override // X.InterfaceC09670ek
            public final void DoQ(C07R c07r, C07X c07x) {
                View view;
                if (c07r == C07R.ON_STOP && (view = Fragment.this.mView) != null) {
                    view.cancelPendingInputEvents();
                }
            }
        });
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.A0B(C07R.ON_CREATE);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onCreate()");
        throw new AndroidRuntimeException(sb.toString());
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
        }
        return z | this.mChildFragmentManager.A14(menu, menuInflater);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.A0a();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C12000jz(this, getViewModelStore(), new Runnable() { // from class: X.05t
            @Override // java.lang.Runnable
            public final void run() {
                Fragment.this.m44lambda$performCreateView$0$androidxfragmentappFragment();
            }
        });
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        C12000jz c12000jz = this.mViewLifecycleOwner;
        if (onCreateView != null) {
            c12000jz.A00();
            AbstractC10360h2.A0H(3);
            AbstractC55832hO.A01(this.mView, this.mViewLifecycleOwner);
            ViewTreeViewModelStoreOwner.A01(this.mView, this.mViewLifecycleOwner);
            AbstractC55842hQ.A01(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.A0B(this.mViewLifecycleOwner);
            return;
        }
        if (c12000jz.A00 != null) {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
        this.mViewLifecycleOwner = null;
    }

    public void performDestroy() {
        this.mChildFragmentManager.A0X();
        this.mLifecycleRegistry.A0B(C07R.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onDestroy()");
        throw new AndroidRuntimeException(sb.toString());
    }

    public void performDestroyView() {
        AbstractC10360h2.A0C(this.mChildFragmentManager, 1);
        if (this.mView != null) {
            C12000jz c12000jz = this.mViewLifecycleOwner;
            c12000jz.A00();
            if (c12000jz.A00.A07().A00(C07S.CREATED)) {
                C12000jz c12000jz2 = this.mViewLifecycleOwner;
                c12000jz2.A00.A0B(C07R.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            C005101q c005101q = AbstractC018607g.A00(this).A01.A00;
            int A00 = c005101q.A00();
            for (int i = 0; i < A00; i++) {
                ((C08890cs) c005101q.A04(i)).A0F();
            }
            this.mPerformedCreateView = false;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onDestroyView()");
        throw new AndroidRuntimeException(sb.toString());
    }

    public void performMultiWindowModeChanged(boolean z) {
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            return this.mChildFragmentManager.A16(menuItem);
        }
        return false;
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            this.mChildFragmentManager.A0h(menu);
        }
    }

    public void performPause() {
        AbstractC10360h2.A0C(this.mChildFragmentManager, 5);
        if (this.mView != null) {
            C12000jz c12000jz = this.mViewLifecycleOwner;
            c12000jz.A00.A0B(C07R.ON_PAUSE);
        }
        this.mLifecycleRegistry.A0B(C07R.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onPause()");
        throw new AndroidRuntimeException(sb.toString());
    }

    public void performPictureInPictureModeChanged(boolean z) {
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
        }
        return z | this.mChildFragmentManager.A13(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean A17 = this.mFragmentManager.A17(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != A17) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(A17);
            AbstractC10360h2 abstractC10360h2 = this.mChildFragmentManager;
            AbstractC10360h2.A0B(abstractC10360h2);
            AbstractC10360h2.A09(abstractC10360h2.A07, abstractC10360h2);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.A0a();
        this.mChildFragmentManager.A10(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            C0eR c0eR = this.mLifecycleRegistry;
            C07R c07r = C07R.ON_RESUME;
            c0eR.A0B(c07r);
            if (this.mView != null) {
                this.mViewLifecycleOwner.A00.A0B(c07r);
            }
            AbstractC10360h2 abstractC10360h2 = this.mChildFragmentManager;
            abstractC10360h2.A0I = false;
            abstractC10360h2.A0J = false;
            abstractC10360h2.A0B.A01 = false;
            AbstractC10360h2.A0C(abstractC10360h2, 7);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onResume()");
        throw new AndroidRuntimeException(sb.toString());
    }

    public void performStart() {
        this.mChildFragmentManager.A0a();
        this.mChildFragmentManager.A10(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            C0eR c0eR = this.mLifecycleRegistry;
            C07R c07r = C07R.ON_START;
            c0eR.A0B(c07r);
            if (this.mView != null) {
                this.mViewLifecycleOwner.A00.A0B(c07r);
            }
            AbstractC10360h2 abstractC10360h2 = this.mChildFragmentManager;
            abstractC10360h2.A0I = false;
            abstractC10360h2.A0J = false;
            abstractC10360h2.A0B.A01 = false;
            AbstractC10360h2.A0C(abstractC10360h2, 5);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onStart()");
        throw new AndroidRuntimeException(sb.toString());
    }

    public void performStop() {
        AbstractC10360h2 abstractC10360h2 = this.mChildFragmentManager;
        abstractC10360h2.A0J = true;
        abstractC10360h2.A0B.A01 = true;
        AbstractC10360h2.A0C(abstractC10360h2, 4);
        if (this.mView != null) {
            C12000jz c12000jz = this.mViewLifecycleOwner;
            c12000jz.A00.A0B(C07R.ON_STOP);
        }
        this.mLifecycleRegistry.A0B(C07R.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onStop()");
        throw new AndroidRuntimeException(sb.toString());
    }

    public void performViewCreated() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        onViewCreated(this.mView, bundle);
        AbstractC10360h2.A0C(this.mChildFragmentManager, 2);
    }

    @Override // X.C00W
    public final C00X registerForActivityResult(AbstractC001600g abstractC001600g, C00V c00v) {
        return prepareCallInternal(abstractC001600g, new C1N8() { // from class: X.05x
            @Override // X.C1N8
            public final /* bridge */ /* synthetic */ Object apply(Object obj) {
                Fragment fragment = Fragment.this;
                Object obj2 = fragment.mHost;
                if (obj2 instanceof InterfaceC001400c) {
                    return ((InterfaceC001400c) obj2).getActivityResultRegistry();
                }
                return fragment.requireActivity().activityResultRegistry;
            }
        }, c00v);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.fragment.app.FragmentManager$LaunchedFragmentInfo, java.lang.Object] */
    @Deprecated
    public final void requestPermissions(String[] strArr, int i) {
        if (this.mHost != null) {
            AbstractC10360h2 parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.A02 != null) {
                String str = this.mWho;
                ?? obj = new Object();
                obj.A01 = str;
                obj.A00 = i;
                parentFragmentManager.A0D.addLast(obj);
                parentFragmentManager.A02.A02(strArr);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    public final Bundle requireArguments() {
        Bundle bundle = this.mArguments;
        if (bundle != null) {
            return bundle;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" does not have any arguments.");
        throw new IllegalStateException(sb.toString());
    }

    public final Fragment requireParentFragment() {
        Fragment fragment = this.mParentFragment;
        if (fragment == null) {
            Context context = getContext();
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            if (context == null) {
                sb.append(this);
                sb.append(" is not attached to any Fragment or host");
                throw new IllegalStateException(sb.toString());
            }
            sb.append(this);
            sb.append(" is not a child Fragment, it is directly attached to ");
            sb.append(getContext());
            throw new IllegalStateException(sb.toString());
        }
        return fragment;
    }

    public final View requireView() {
        View view = this.mView;
        if (view != null) {
            return view;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not return a View from onCreateView() or this was called before onCreateView().");
        throw new IllegalStateException(sb.toString());
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 != null && (bundle = bundle2.getBundle("childFragmentManager")) != null) {
            this.mChildFragmentManager.A0g(bundle);
            AbstractC10360h2 abstractC10360h2 = this.mChildFragmentManager;
            abstractC10360h2.A0I = false;
            abstractC10360h2.A0J = false;
            abstractC10360h2.A0B.A01 = false;
            AbstractC10360h2.A0C(abstractC10360h2, 1);
        }
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                C12000jz c12000jz = this.mViewLifecycleOwner;
                c12000jz.A00.A0B(C07R.ON_CREATE);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onViewStateRestored()");
        throw new AndroidRuntimeException(sb.toString());
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        ensureAnimationInfo().A01 = i;
        ensureAnimationInfo().A02 = i2;
        ensureAnimationInfo().A04 = i3;
        ensureAnimationInfo().A05 = i4;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.A03();
            }
        }
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager == null) {
            if (savedState == null || (bundle = savedState.A00) == null) {
                bundle = null;
            }
            this.mSavedFragmentState = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.A03();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.A03 = i;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo != null) {
            ensureAnimationInfo().A0K = z;
        }
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        C07K c07k = C07K.A01;
        StringBuilder sb = new StringBuilder();
        sb.append("Attempting to set retain instance for fragment ");
        sb.append(this);
        C07L c07l = new C07L(this, sb.toString());
        AbstractC10360h2.A0H(3);
        C07J A00 = C07K.A00(this);
        if (A00.A01.contains(C07F.DETECT_RETAIN_INSTANCE_USAGE) && C07K.A05(A00, getClass(), c07l.getClass())) {
            C07K.A04(A00, c07l);
        }
        this.mRetainInstance = z;
        AbstractC10360h2 abstractC10360h2 = this.mFragmentManager;
        if (abstractC10360h2 != null) {
            if (z) {
                C06X c06x = abstractC10360h2.A0B;
                if (!c06x.A01) {
                    HashMap hashMap = c06x.A03;
                    if (!hashMap.containsKey(this.mWho)) {
                        hashMap.put(this.mWho, this);
                    } else {
                        return;
                    }
                }
                AbstractC10360h2.A0H(2);
                return;
            }
            abstractC10360h2.A0B.A01(this);
            return;
        }
        this.mRetainInstanceChangedWhileDetached = true;
    }

    @Deprecated
    public void setTargetFragment(final Fragment fragment, final int i) {
        AbstractC10360h2 abstractC10360h2;
        if (fragment != null) {
            C07K c07k = C07K.A01;
            AbstractC10070gK abstractC10070gK = new AbstractC10070gK(this, fragment, i) { // from class: X.0is
                public final Fragment A00;

                /* JADX WARN: Illegal instructions before constructor call */
                {
                    /*
                        r2 = this;
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r0 = "Attempting to set target fragment "
                        r1.append(r0)
                        r1.append(r4)
                        java.lang.String r0 = " with request code "
                        r1.append(r0)
                        r1.append(r5)
                        java.lang.String r0 = " for fragment "
                        r1.append(r0)
                        r1.append(r3)
                        java.lang.String r0 = r1.toString()
                        r2.<init>(r3, r0)
                        r2.A00 = r4
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C11340is.<init>(androidx.fragment.app.Fragment, androidx.fragment.app.Fragment, int):void");
                }
            };
            AbstractC10360h2.A0H(3);
            C07J A00 = C07K.A00(this);
            if (A00.A01.contains(C07F.DETECT_TARGET_FRAGMENT_USAGE) && C07K.A05(A00, getClass(), abstractC10070gK.getClass())) {
                C07K.A04(A00, abstractC10070gK);
            }
        }
        AbstractC10360h2 abstractC10360h22 = this.mFragmentManager;
        if (fragment != null) {
            abstractC10360h2 = fragment.mFragmentManager;
        } else {
            abstractC10360h2 = null;
        }
        if (abstractC10360h22 != null && abstractC10360h2 != null && abstractC10360h22 != abstractC10360h2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(fragment);
            sb.append(" must share the same FragmentManager to be set as a target fragment");
            throw new IllegalArgumentException(sb.toString());
        }
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getTargetFragment(false)) {
            if (fragment2.equals(this)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Setting ");
                sb2.append(fragment);
                sb2.append(" as the target of ");
                sb2.append(this);
                sb2.append(" would create a target cycle");
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager != null && fragment.mFragmentManager != null) {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        } else {
            this.mTargetWho = null;
            this.mTarget = fragment;
        }
        this.mTargetRequestCode = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        if (r5 != false) goto L23;
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setUserVisibleHint(boolean r5) {
        /*
            r4 = this;
            X.07K r0 = X.C07K.A01
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Attempting to set user visible hint to "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " for fragment "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            X.0gL r3 = new X.0gL
            r3.<init>(r4, r0)
            r0 = 3
            X.AbstractC10360h2.A0H(r0)
            X.07J r2 = X.C07K.A00(r4)
            java.util.Set r1 = r2.A01
            X.07F r0 = X.C07F.DETECT_SET_USER_VISIBLE_HINT
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L43
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r3.getClass()
            boolean r0 = X.C07K.A05(r2, r1, r0)
            if (r0 == 0) goto L43
            X.C07K.A04(r2, r3)
        L43:
            boolean r0 = r4.mUserVisibleHint
            r2 = 5
            if (r0 != 0) goto L63
            if (r5 == 0) goto L63
            int r0 = r4.mState
            if (r0 >= r2) goto L63
            X.0h2 r1 = r4.mFragmentManager
            if (r1 == 0) goto L63
            boolean r0 = r4.isAdded()
            if (r0 == 0) goto L63
            boolean r0 = r4.mIsCreated
            if (r0 == 0) goto L63
            X.06f r0 = r1.A0U(r4)
            r1.A0v(r0)
        L63:
            r4.mUserVisibleHint = r5
            int r0 = r4.mState
            if (r0 >= r2) goto L6c
            r0 = 1
            if (r5 == 0) goto L6d
        L6c:
            r0 = 0
        L6d:
            r4.mDeferStart = r0
            android.os.Bundle r0 = r4.mSavedFragmentState
            if (r0 == 0) goto L79
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r4.mSavedUserVisibleHint = r0
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.setUserVisibleHint(boolean):void");
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        AbstractC10920i8 abstractC10920i8 = this.mHost;
        if (abstractC10920i8 != null) {
            return abstractC10920i8.A04(str);
        }
        return false;
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo != null && ensureAnimationInfo().A0J) {
            if (this.mHost == null) {
                ensureAnimationInfo().A0J = false;
            } else if (Looper.myLooper() != this.mHost.A02.getLooper()) {
                this.mHost.A02.postAtFrontOfQueue(new Runnable() { // from class: X.05v
                    @Override // java.lang.Runnable
                    public final void run() {
                        Fragment.this.callStartTransitionListener(false);
                    }
                });
            } else {
                callStartTransitionListener(true);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        int i = this.mFragmentId;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.mTag;
        if (str != null) {
            sb.append(" tag=");
            sb.append(str);
        }
        sb.append(")");
        return sb.toString();
    }

    public Fragment(int i) {
        this();
        this.mContentLayoutId = i;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getContext() != null) {
            AbstractC018607g.A00(this).A05(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        StringBuilder sb = new StringBuilder();
        sb.append("Child ");
        sb.append(this.mChildFragmentManager);
        sb.append(":");
        printWriter.println(sb.toString());
        this.mChildFragmentManager.A0z(AnonymousClass001.A0R(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String generateActivityResultKey() {
        return AnonymousClass001.A07(this.mNextLocalRequestCode.getAndIncrement(), "fragment_", this.mWho, "_rq#");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (X.AbstractC10360h2.A0H(3) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        requireContext().getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
    
        if (r1 == null) goto L8;
     */
    @Override // X.C07N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.AbstractC52972be getDefaultViewModelCreationExtras() {
        /*
            r3 = this;
            android.content.Context r0 = r3.requireContext()
            android.content.Context r1 = r0.getApplicationContext()
        L8:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L47
            boolean r0 = r1 instanceof android.app.Application
            if (r0 == 0) goto L40
            if (r1 != 0) goto L20
        L12:
            r0 = 3
            boolean r0 = X.AbstractC10360h2.A0H(r0)
            if (r0 == 0) goto L20
            android.content.Context r0 = r3.requireContext()
            r0.getApplicationContext()
        L20:
            X.2bg r2 = new X.2bg
            r2.<init>()
            if (r1 == 0) goto L2c
            X.2Zn r0 = X.C53432cR.A02
            r2.A01(r0, r1)
        L2c:
            X.2Zn r0 = X.AbstractC51872Zl.A01
            r2.A01(r0, r3)
            X.2Zn r0 = X.AbstractC51872Zl.A02
            r2.A01(r0, r3)
            android.os.Bundle r1 = r3.mArguments
            if (r1 == 0) goto L3f
            X.2Zn r0 = X.AbstractC51872Zl.A00
            r2.A01(r0, r1)
        L3f:
            return r2
        L40:
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L8
        L47:
            r1 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.getDefaultViewModelCreationExtras():X.2be");
    }

    @Deprecated
    public AbstractC018607g getLoaderManager() {
        return AbstractC018607g.A00(this);
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        C07K.A01(this);
        return this.mRetainInstance;
    }

    public final String getString(int i) {
        return requireContext().getResources().getString(i);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        C07K.A02(this);
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i) {
        return requireContext().getResources().getText(i);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new AbstractC10360h2();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isVisible() {
        View view;
        if (isAdded() && !isHidden() && (view = this.mView) != null && view.getWindowToken() != null && this.mView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        int A02 = C0f9.A02(-1986149221);
        this.mCalled = true;
        C0f9.A09(1469501862, A02);
    }

    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(412399288);
        this.mCalled = true;
        restoreChildFragmentState();
        AbstractC10360h2 abstractC10360h2 = this.mChildFragmentManager;
        if (abstractC10360h2.A00 < 1) {
            abstractC10360h2.A0I = false;
            abstractC10360h2.A0J = false;
            abstractC10360h2.A0B.A01 = false;
            AbstractC10360h2.A0C(abstractC10360h2, 1);
        }
        C0f9.A09(1111400336, A02);
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        int i;
        int A02 = C0f9.A02(-1027310901);
        int i2 = this.mContentLayoutId;
        if (i2 != 0) {
            view = layoutInflater.inflate(i2, viewGroup, false);
            i = 1445078932;
        } else {
            view = null;
            i = 1196706451;
        }
        C0f9.A09(i, A02);
        return view;
    }

    public void onDestroy() {
        int A02 = C0f9.A02(1429640738);
        this.mCalled = true;
        C0f9.A09(55621516, A02);
    }

    public void onDestroyView() {
        int A02 = C0f9.A02(-961299403);
        this.mCalled = true;
        C0f9.A09(223467279, A02);
    }

    public void onDetach() {
        int A02 = C0f9.A02(1887423784);
        this.mCalled = true;
        C0f9.A09(1766004772, A02);
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onPause() {
        int A02 = C0f9.A02(-741365511);
        this.mCalled = true;
        C0f9.A09(257018534, A02);
    }

    public void onResume() {
        int A02 = C0f9.A02(339993235);
        this.mCalled = true;
        C0f9.A09(-70928354, A02);
    }

    public void onStart() {
        int A02 = C0f9.A02(-179177744);
        this.mCalled = true;
        C0f9.A09(84446793, A02);
    }

    public void onStop() {
        int A02 = C0f9.A02(1602857852);
        this.mCalled = true;
        C0f9.A09(1867857833, A02);
    }

    public void onViewStateRestored(Bundle bundle) {
        int A02 = C0f9.A02(865006028);
        this.mCalled = true;
        C0f9.A09(881477546, A02);
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        Handler handler;
        ensureAnimationInfo().A0J = true;
        Handler handler2 = this.mPostponedHandler;
        if (handler2 != null) {
            handler2.removeCallbacks(this.mPostponedDurationRunnable);
        }
        AbstractC10360h2 abstractC10360h2 = this.mFragmentManager;
        if (abstractC10360h2 != null) {
            handler = abstractC10360h2.A0A.A02;
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler = handler;
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to an activity.");
        throw new IllegalStateException(sb.toString());
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to a context.");
        throw new IllegalStateException(sb.toString());
    }

    @Deprecated
    public final AbstractC10360h2 requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to a host.");
        throw new IllegalStateException(sb.toString());
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().A09 = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().A0A = Boolean.valueOf(z);
    }

    public void setEnterSharedElementCallback(C5GL c5gl) {
        ensureAnimationInfo().A07 = c5gl;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().A0B = obj;
    }

    public void setExitSharedElementCallback(C5GL c5gl) {
        ensureAnimationInfo().A08 = c5gl;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().A0C = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().A06 = view;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        ensureAnimationInfo().A00 = f;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().A0D = obj;
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().A0E = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().A0F = obj;
    }

    public void setSharedElementNames(ArrayList arrayList, ArrayList arrayList2) {
        ensureAnimationInfo();
        C05z c05z = this.mAnimationInfo;
        c05z.A0H = arrayList;
        c05z.A0I = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().A0G = obj;
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.2GT, X.2GS] */
    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new AbstractC10360h2();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new Runnable() { // from class: X.05u
            @Override // java.lang.Runnable
            public final void run() {
                Fragment.this.startPostponedEnterTransition();
            }
        };
        this.mMaxState = C07S.RESUMED;
        this.mViewLifecycleOwnerLiveData = new C2GT();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList();
        this.mSavedStateAttachListener = new AnonymousClass061() { // from class: X.0j5
            @Override // X.AnonymousClass061
            public final void A00() {
                Bundle bundle;
                Fragment fragment = Fragment.this;
                fragment.mSavedStateRegistryController.A00();
                AbstractC51872Zl.A01(fragment);
                Bundle bundle2 = fragment.mSavedFragmentState;
                if (bundle2 != null) {
                    bundle = bundle2.getBundle("registryState");
                } else {
                    bundle = null;
                }
                fragment.mSavedStateRegistryController.A01(bundle);
            }
        };
        initLifecycle();
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) C06B.A00(str, context.getClassLoader()).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(AnonymousClass001.A0g("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(AnonymousClass001.A0g("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(AnonymousClass001.A0g("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(AnonymousClass001.A0g("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }

    private void restoreViewState() {
        Bundle bundle;
        AbstractC10360h2.A0H(3);
        if (this.mView != null) {
            Bundle bundle2 = this.mSavedFragmentState;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            restoreViewState(bundle);
        }
        this.mSavedFragmentState = null;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        if (layoutInflater == null) {
            LayoutInflater onGetLayoutInflater = onGetLayoutInflater(null);
            this.mLayoutInflater = onGetLayoutInflater;
            return onGetLayoutInflater;
        }
        return layoutInflater;
    }

    public final String getString(int i, Object... objArr) {
        return requireContext().getResources().getString(i, objArr);
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public void onAttach(Activity activity) {
        int A02 = C0f9.A02(894618012);
        this.mCalled = true;
        C0f9.A09(-1276121473, A02);
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().A0J = true;
    }

    public final C00X registerForActivityResult(AbstractC001600g abstractC001600g, final AbstractC001300b abstractC001300b, C00V c00v) {
        return prepareCallInternal(abstractC001600g, new C1N8() { // from class: X.05y
            @Override // X.C1N8
            public final /* bridge */ /* synthetic */ Object apply(Object obj) {
                return abstractC001300b;
            }
        }, c00v);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        AbstractC10920i8 abstractC10920i8 = this.mHost;
        if (abstractC10920i8 != null) {
            C14360o3.A0B(intent, 1);
            abstractC10920i8.A01.startActivity(intent, bundle);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" not attached to Activity");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.fragment.app.FragmentManager$LaunchedFragmentInfo, java.lang.Object] */
    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (this.mHost != null) {
            AbstractC10360h2 parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.A03 != null) {
                String str = this.mWho;
                ?? obj = new Object();
                obj.A01 = str;
                obj.A00 = i;
                parentFragmentManager.A0D.addLast(obj);
                if (bundle != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                parentFragmentManager.A03.A02(intent);
                return;
            }
            AbstractC10920i8 abstractC10920i8 = parentFragmentManager.A0A;
            C14360o3.A0B(intent, 1);
            if (i == -1) {
                abstractC10920i8.A01.startActivity(intent, bundle);
                return;
            }
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }
}
