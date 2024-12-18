package androidx.preference;

import X.AbstractC10360h2;
import X.AbstractC31173DnH;
import X.AbstractC58320PtC;
import X.AbstractC63040SbG;
import X.AnonymousClass001;
import X.C0SG;
import X.C14240no;
import X.C14360o3;
import X.C66426UGz;
import X.C69638Vsf;
import X.InterfaceC19630xq;
import X.InterfaceC55722hD;
import X.InterfaceC71880X8n;
import X.InterfaceC71881X8o;
import X.MenuItemOnMenuItemClickListenerC70225WKw;
import X.Py5;
import X.UG7;
import X.UG8;
import X.X71;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.quickpromotion.sdk.devtool.QPCheckBoxPreference;
import com.instagram.quickpromotion.debug.devtool.IGDevToolPersistentStateHandler;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class Preference implements Comparable {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public Drawable A05;
    public Bundle A06;
    public X71 A07;
    public InterfaceC71880X8n A08;
    public InterfaceC71881X8o A09;
    public PreferenceGroup A0A;
    public C69638Vsf A0B;
    public CharSequence A0C;
    public Object A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public List A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public MenuItemOnMenuItemClickListenerC70225WKw A0R;
    public CharSequence A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public final Context A0a;
    public final View.OnClickListener A0b;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00f2, code lost:
    
        if (r6.hasValue(11) != false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.HashSet, java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Preference(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void A0A(Parcelable parcelable) {
        this.A0I = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    /* loaded from: classes10.dex */
    public class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = Py5.A00(59);

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static void A02(Preference preference) {
        C69638Vsf c69638Vsf;
        PreferenceScreen preferenceScreen;
        Preference A0N;
        List list;
        String str = preference.A0E;
        if (str != null && (c69638Vsf = preference.A0B) != null && (preferenceScreen = c69638Vsf.A05) != null && (A0N = preferenceScreen.A0N(str)) != null && (list = A0N.A0H) != null) {
            list.remove(preference);
        }
    }

    public CharSequence A03() {
        InterfaceC71881X8o interfaceC71881X8o = this.A09;
        if (interfaceC71881X8o != null) {
            return interfaceC71881X8o.E6i(this);
        }
        return this.A0S;
    }

    public void A04() {
        X71 x71 = this.A07;
        if (x71 != null) {
            C66426UGz c66426UGz = (C66426UGz) x71;
            int indexOf = c66426UGz.A00.indexOf(this);
            if (indexOf != -1) {
                c66426UGz.notifyItemChanged(indexOf, this);
            }
        }
    }

    public void A05() {
        PreferenceScreen preferenceScreen;
        Preference A0N;
        String str = this.A0E;
        if (!TextUtils.isEmpty(str)) {
            C69638Vsf c69638Vsf = this.A0B;
            if (c69638Vsf != null && (preferenceScreen = c69638Vsf.A05) != null && (A0N = preferenceScreen.A0N(str)) != null) {
                List list = A0N.A0H;
                if (list == null) {
                    list = new ArrayList();
                    A0N.A0H = list;
                }
                list.add(this);
                boolean A0K = A0N.A0K();
                if (this.A0K == A0K) {
                    this.A0K = !A0K;
                    A0I(A0K());
                    A04();
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Dependency \"");
            sb.append(str);
            sb.append("\" not found for preference \"");
            sb.append(this.A0G);
            sb.append("\" (title: \"");
            sb.append((Object) this.A0C);
            throw AbstractC58320PtC.A0o("\"", sb);
        }
    }

    public final void A06() {
        if (this instanceof PreferenceGroup) {
            PreferenceGroup preferenceGroup = (PreferenceGroup) this;
            A02(preferenceGroup);
            preferenceGroup.A01 = false;
            List list = preferenceGroup.A07;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((Preference) list.get(i)).A06();
            }
            return;
        }
        A02(this);
    }

    public final void A07() {
        X71 x71 = this.A07;
        if (x71 != null) {
            C66426UGz c66426UGz = (C66426UGz) x71;
            Handler handler = c66426UGz.A02;
            Runnable runnable = c66426UGz.A03;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
        }
    }

    public void A08(Bundle bundle) {
        Parcelable parcelable;
        if ((!TextUtils.isEmpty(this.A0G)) && (parcelable = bundle.getParcelable(this.A0G)) != null) {
            this.A0I = false;
            A0A(parcelable);
            if (!this.A0I) {
                throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bc  */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.preference.EditTextPreference$SavedState, androidx.preference.Preference$BaseSavedState] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.preference.Preference$BaseSavedState, androidx.preference.ListPreference$SavedState] */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.preference.Preference$BaseSavedState, androidx.preference.MultiSelectListPreference$SavedState] */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.preference.SeekBarPreference$SavedState, androidx.preference.Preference$BaseSavedState] */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.preference.TwoStatePreference$SavedState, androidx.preference.Preference$BaseSavedState] */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.preference.PreferenceGroup$SavedState, androidx.preference.Preference$BaseSavedState] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A09(android.os.Bundle r5) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.A09(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0C(X.C69638Vsf r5) {
        /*
            r4 = this;
            r4.A0B = r5
            boolean r0 = r4.A0L
            if (r0 != 0) goto L15
            monitor-enter(r5)
            long r2 = r5.A00     // Catch: java.lang.Throwable -> L10
            r0 = 1
            long r0 = r0 + r2
            r5.A00 = r0     // Catch: java.lang.Throwable -> L10
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L10
            throw r0
        L13:
            r4.A04 = r2
        L15:
            boolean r0 = r4.A0L()
            if (r0 == 0) goto L49
            X.Vsf r0 = r4.A0B
            if (r0 == 0) goto L47
            android.content.SharedPreferences r1 = r0.A00()
        L23:
            java.lang.String r0 = r4.A0G
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L49
            r2 = 0
        L2c:
            r1 = r4
            boolean r0 = r4 instanceof androidx.preference.TwoStatePreference
            if (r0 == 0) goto L46
            androidx.preference.TwoStatePreference r1 = (androidx.preference.TwoStatePreference) r1
            if (r2 != 0) goto L39
            java.lang.Boolean r2 = X.AbstractC166997dE.A0a()
        L39:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            boolean r0 = r1.A0M(r0)
            r1.A0O(r0)
        L46:
            return
        L47:
            r1 = 0
            goto L23
        L49:
            java.lang.Object r2 = r4.A0D
            if (r2 == 0) goto L46
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.A0C(X.Vsf):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0D(X.C66482UJh r9) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.A0D(X.UJh):void");
    }

    public final void A0E(CharSequence charSequence) {
        if (this.A09 == null) {
            if (!TextUtils.equals(this.A0S, charSequence)) {
                this.A0S = charSequence;
                A04();
                return;
            }
            return;
        }
        throw new IllegalStateException("Preference already has a SummaryProvider set.");
    }

    public final void A0F(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.A0C)) {
            this.A0C = charSequence;
            A04();
        }
    }

    public final void A0H(String str) {
        this.A0G = str;
        if (this.A0O && !(!TextUtils.isEmpty(str))) {
            if (!TextUtils.isEmpty(this.A0G)) {
                this.A0O = true;
                return;
            }
            throw new IllegalStateException("Preference does not have a key assigned.");
        }
    }

    public void A0I(boolean z) {
        List list = this.A0H;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Preference preference = (Preference) list.get(i);
                if (preference.A0K == z) {
                    preference.A0K = !z;
                    preference.A0I(preference.A0K());
                    preference.A04();
                }
            }
        }
    }

    public boolean A0J() {
        if (this.A0V && this.A0K && this.A0M) {
            return true;
        }
        return false;
    }

    public boolean A0K() {
        if (this instanceof TwoStatePreference) {
            TwoStatePreference twoStatePreference = (TwoStatePreference) this;
            boolean z = twoStatePreference.A03;
            boolean z2 = twoStatePreference.A02;
            if (z) {
                if (z2) {
                    return true;
                }
            } else if (!z2) {
                return true;
            }
            if (!twoStatePreference.A0J()) {
                return true;
            }
            return false;
        }
        if (this instanceof EditTextPreference) {
            if (!TextUtils.isEmpty(((EditTextPreference) this).A00) && !(!r1.A0J())) {
                return false;
            }
            return true;
        }
        return !A0J();
    }

    public final boolean A0L() {
        if (this.A0B != null && this.A0N && (!TextUtils.isEmpty(this.A0G))) {
            return true;
        }
        return false;
    }

    public final boolean A0M(boolean z) {
        if (this instanceof QPCheckBoxPreference) {
            QPCheckBoxPreference qPCheckBoxPreference = (QPCheckBoxPreference) this;
            InterfaceC55722hD interfaceC55722hD = qPCheckBoxPreference.A00;
            String str = qPCheckBoxPreference.A0G;
            C14360o3.A07(str);
            return ((InterfaceC19630xq) ((IGDevToolPersistentStateHandler) interfaceC55722hD).A02.getValue()).getBoolean(str, z);
        }
        if (A0L()) {
            return this.A0B.A00().getBoolean(this.A0G, z);
        }
        return z;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        int i = this.A02;
        int i2 = preference.A02;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.A0C;
        CharSequence charSequence2 = preference.A0C;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.A0C.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.A0C;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence A03 = A03();
        if (!TextUtils.isEmpty(A03)) {
            sb.append(A03);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    private void A01(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount >= 0) {
                    A01(viewGroup.getChildAt(childCount), z);
                } else {
                    return;
                }
            }
        }
    }

    public void A0B(View view) {
        String str;
        C0SG ug7;
        Object obj;
        Object obj2;
        if (A0J() && this.A0P) {
            if (this instanceof TwoStatePreference) {
                ((TwoStatePreference) this).A0O(!r1.A02);
            } else if (this instanceof PreferenceScreen) {
                PreferenceGroup preferenceGroup = (PreferenceGroup) this;
                if (preferenceGroup.A0F == null && preferenceGroup.A07.size() != 0 && (obj = preferenceGroup.A0B.A03) != null) {
                    Fragment fragment = (Fragment) obj;
                    Fragment fragment2 = fragment;
                    do {
                        fragment2 = fragment2.mParentFragment;
                    } while (fragment2 != null);
                    fragment.getContext();
                }
            } else if (this instanceof DialogPreference) {
                DialogPreference dialogPreference = (DialogPreference) this;
                if (dialogPreference instanceof DropDownPreference) {
                    ((DropDownPreference) dialogPreference).A00.performClick();
                } else {
                    Object obj3 = dialogPreference.A0B.A02;
                    if (obj3 != null) {
                        Fragment fragment3 = (Fragment) obj3;
                        Fragment fragment4 = fragment3;
                        do {
                            fragment4 = fragment4.mParentFragment;
                        } while (fragment4 != null);
                        fragment3.getContext();
                        if (fragment3.getParentFragmentManager().A0Q("androidx.preference.PreferenceFragment.DIALOG") == null) {
                            if (dialogPreference instanceof EditTextPreference) {
                                str = dialogPreference.A0G;
                                ug7 = new UG8();
                            } else if (dialogPreference instanceof ListPreference) {
                                str = dialogPreference.A0G;
                                ug7 = new C0SG();
                            } else if (dialogPreference instanceof MultiSelectListPreference) {
                                str = dialogPreference.A0G;
                                ug7 = new UG7();
                            } else {
                                throw new IllegalArgumentException(AnonymousClass001.A0g("Cannot display dialog for an unknown Preference type: ", AbstractC31173DnH.A0q(dialogPreference), ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference."));
                            }
                            Bundle bundle = new Bundle(1);
                            bundle.putString("key", str);
                            ug7.setArguments(bundle);
                            ug7.setTargetFragment(fragment3, 0);
                            ug7.A0B(fragment3.getParentFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
                        }
                    }
                }
            }
            InterfaceC71880X8n interfaceC71880X8n = this.A08;
            if (interfaceC71880X8n != null) {
                interfaceC71880X8n.DaD(this);
                return;
            }
            C69638Vsf c69638Vsf = this.A0B;
            if (c69638Vsf == null || (obj2 = c69638Vsf.A04) == null) {
                return;
            }
            Fragment fragment5 = (Fragment) obj2;
            String str2 = this.A0F;
            if (str2 == null) {
                return;
            }
            Fragment fragment6 = fragment5;
            do {
                fragment6 = fragment6.mParentFragment;
            } while (fragment6 != null);
            fragment5.getContext();
            Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
            AbstractC10360h2 parentFragmentManager = fragment5.getParentFragmentManager();
            Bundle bundle2 = this.A06;
            if (bundle2 == null) {
                bundle2 = new Bundle();
                this.A06 = bundle2;
            }
            Fragment A01 = parentFragmentManager.A0R().A01(fragment5.requireActivity().getClassLoader(), str2);
            A01.setArguments(bundle2);
            A01.setTargetFragment(fragment5, 0);
            C14240no c14240no = new C14240no(parentFragmentManager);
            c14240no.A0A(A01, ((View) fragment5.requireView().getParent()).getId());
            c14240no.A0I(null);
            c14240no.A00();
        }
    }

    public final void A0G(String str) {
        if (A0L()) {
            String str2 = null;
            if (A0L()) {
                str2 = this.A0B.A00().getString(this.A0G, null);
            }
            if (!TextUtils.equals(str, str2)) {
                SharedPreferences.Editor edit = this.A0B.A00().edit();
                edit.putString(this.A0G, str);
                edit.apply();
            }
        }
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC63040SbG.A00(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }
}
