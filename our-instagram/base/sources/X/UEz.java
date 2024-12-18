package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.quickpromotion.debug.devtool.IGDevToolPersistentStateHandler;

/* loaded from: classes11.dex */
public final class UEz extends Fragment implements X70, X72, X73, X74 {
    public C69638Vsf A01;
    public RecyclerView A02;
    public boolean A03;
    public boolean A04;
    public final UHB A06 = new UHB(this);
    public int A00 = R.layout.preference_list_fragment;
    public final Handler A05 = new HandlerC65967TxK(Looper.getMainLooper(), this, 0);
    public final Runnable A07 = new RunnableC71225WqG(this);

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        PreferenceScreen preferenceScreen = this.A01.A05;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.A09(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        PreferenceScreen preferenceScreen;
        Bundle bundle2;
        PreferenceScreen preferenceScreen2;
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreen2 = this.A01.A05) != null) {
            preferenceScreen2.A08(bundle2);
        }
        if (this.A03 && (preferenceScreen = this.A01.A05) != null) {
            this.A02.setAdapter(new C66426UGz(preferenceScreen));
            preferenceScreen.A05();
        }
        this.A04 = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(413364962);
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        requireContext().getTheme().applyStyle(i, false);
        C69638Vsf c69638Vsf = new C69638Vsf(requireContext());
        this.A01 = c69638Vsf;
        c69638Vsf.A03 = this;
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
        Context context = this.A01.A07;
        IGDevToolPersistentStateHandler iGDevToolPersistentStateHandler = new IGDevToolPersistentStateHandler(context, C023409i.A0A.A08(context));
        PreferenceCategory preferenceCategory = new PreferenceCategory(context, null);
        preferenceCategory.A0F("Dev Options");
        C69638Vsf c69638Vsf2 = this.A01;
        PreferenceScreen preferenceScreen = new PreferenceScreen(context, null);
        preferenceScreen.A0C(c69638Vsf2);
        preferenceScreen.A0O(preferenceCategory);
        new W4F().A01(context, preferenceScreen, iGDevToolPersistentStateHandler);
        C69638Vsf c69638Vsf3 = this.A01;
        PreferenceScreen preferenceScreen2 = c69638Vsf3.A05;
        if (preferenceScreen != preferenceScreen2) {
            if (preferenceScreen2 != null) {
                preferenceScreen2.A06();
            }
            c69638Vsf3.A05 = preferenceScreen;
            this.A03 = true;
            if (this.A04) {
                Handler handler = this.A05;
                if (!handler.hasMessages(1)) {
                    handler.obtainMessage(1).sendToTarget();
                }
            }
        }
        C0f9.A09(1505441152, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        int i;
        int A02 = C0f9.A02(348633831);
        TypedArray obtainStyledAttributes = requireContext().obtainStyledAttributes(null, AbstractC68645VZd.A07, R.attr.preferenceFragmentCompatStyle, 0);
        this.A00 = obtainStyledAttributes.getResourceId(0, this.A00);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(requireContext());
        View inflate = cloneInContext.inflate(this.A00, viewGroup, false);
        View findViewById = inflate.findViewById(android.R.id.list_container);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            if (!requireContext().getPackageManager().hasSystemFeature(AbstractC111324zv.A00(345)) || (recyclerView = AbstractC31180DnO.A08(viewGroup2)) == null) {
                recyclerView = (RecyclerView) cloneInContext.inflate(R.layout.preference_recyclerview, viewGroup2, false);
                AbstractC31174DnI.A15(requireContext(), recyclerView);
                recyclerView.setAccessibilityDelegateCompat(new C66493UJx(recyclerView));
            }
            this.A02 = recyclerView;
            UHB uhb = this.A06;
            recyclerView.A10(uhb);
            if (drawable != null) {
                i = drawable.getIntrinsicHeight();
            } else {
                i = 0;
            }
            uhb.A00 = i;
            uhb.A01 = drawable;
            UEz uEz = uhb.A03;
            uEz.A02.A0h();
            if (dimensionPixelSize != -1) {
                uhb.A00 = dimensionPixelSize;
                uEz.A02.A0h();
            }
            uhb.A02 = z;
            if (this.A02.getParent() == null) {
                viewGroup2.addView(this.A02);
            }
            this.A05.post(this.A07);
            C0f9.A09(-1331816327, A02);
            return inflate;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        C0f9.A09(1918416520, A02);
        throw illegalStateException;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(2000382981);
        Handler handler = this.A05;
        handler.removeCallbacks(this.A07);
        handler.removeMessages(1);
        if (this.A03) {
            this.A02.setAdapter(null);
            PreferenceScreen preferenceScreen = this.A01.A05;
            if (preferenceScreen != null) {
                preferenceScreen.A06();
            }
        }
        this.A02 = null;
        super.onDestroyView();
        C0f9.A09(1766876915, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-1535691875);
        super.onStart();
        C69638Vsf c69638Vsf = this.A01;
        c69638Vsf.A04 = this;
        c69638Vsf.A02 = this;
        C0f9.A09(-1353802155, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1846209810);
        super.onStop();
        C69638Vsf c69638Vsf = this.A01;
        c69638Vsf.A04 = null;
        c69638Vsf.A02 = null;
        C0f9.A09(-1654715319, A02);
    }
}
