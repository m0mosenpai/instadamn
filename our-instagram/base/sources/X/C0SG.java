package X;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;

/* renamed from: X.0SG, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0SG extends Fragment implements DialogInterface.OnDismissListener, DialogInterface.OnCancelListener {
    public Dialog A01;
    public boolean A05;
    public Handler A0A;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public Runnable A0C = new Runnable() { // from class: X.05p
        @Override // java.lang.Runnable
        public final void run() {
            C0SG c0sg = C0SG.this;
            c0sg.A03.onDismiss(c0sg.A01);
        }
    };
    public DialogInterface.OnCancelListener A02 = new DialogInterface.OnCancelListener() { // from class: X.05q
        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            C0SG c0sg = C0SG.this;
            Dialog dialog = c0sg.A01;
            if (dialog != null) {
                c0sg.onCancel(dialog);
            }
        }
    };
    public DialogInterface.OnDismissListener A03 = new DialogInterface.OnDismissListener() { // from class: X.05r
        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            C0SG c0sg = C0SG.this;
            Dialog dialog = c0sg.A01;
            if (dialog != null) {
                c0sg.onDismiss(dialog);
            }
        }
    };
    public int A00 = 0;
    public int A09 = 0;
    public boolean A04 = true;
    public boolean A07 = true;
    public int A08 = -1;
    public InterfaceC58362lv A0B = new InterfaceC58362lv() { // from class: X.05s
        @Override // X.InterfaceC58362lv
        public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            if (obj != null) {
                C0SG c0sg = C0SG.this;
                if (c0sg.A07) {
                    View requireView = c0sg.requireView();
                    if (requireView.getParent() == null) {
                        if (c0sg.A01 != null) {
                            AbstractC10360h2.A0H(3);
                            c0sg.A01.setContentView(requireView);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
        }
    };
    public boolean A06 = false;

    public void A07() {
        A00(this, false, false, false);
    }

    public void A08() {
        A00(this, true, false, false);
    }

    public final void A09(int i, int i2) {
        AbstractC10360h2.A0H(2);
        this.A00 = i;
        if (i == 2) {
            this.A09 = R.style.Theme.Panel;
        }
        this.A09 = i2;
    }

    public void A0A(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public final void A0B(AbstractC10360h2 abstractC10360h2, String str) {
        this.A0D = false;
        this.A0E = true;
        C14240no c14240no = new C14240no(abstractC10360h2);
        c14240no.A0G = true;
        c14240no.A0B(this, str);
        c14240no.A0J(false);
    }

    public final void A0C(AbstractC016706m abstractC016706m, String str) {
        this.A0D = false;
        this.A0E = true;
        abstractC016706m.A0B(this, str);
        this.A0F = false;
        this.A08 = ((C14240no) abstractC016706m).A0J(false);
    }

    public Dialog A0F(Bundle bundle) {
        AbstractC10360h2.A0H(3);
        return new DialogC12630l8(requireContext(), A0E());
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    public static void A00(C0SG c0sg, boolean z, boolean z2, boolean z3) {
        if (!c0sg.A0D) {
            c0sg.A0D = true;
            c0sg.A0E = false;
            Dialog dialog = c0sg.A01;
            if (dialog != null) {
                dialog.setOnDismissListener(null);
                c0sg.A01.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == c0sg.A0A.getLooper()) {
                        c0sg.onDismiss(c0sg.A01);
                    } else {
                        c0sg.A0A.post(c0sg.A0C);
                    }
                }
            }
            c0sg.A0F = true;
            int i = c0sg.A08;
            AbstractC10360h2 parentFragmentManager = c0sg.getParentFragmentManager();
            if (i >= 0) {
                int i2 = c0sg.A08;
                if (z3) {
                    parentFragmentManager.A0c(i2);
                } else {
                    parentFragmentManager.A0d(i2, 1, z);
                }
                c0sg.A08 = -1;
                return;
            }
            C14240no c14240no = new C14240no(parentFragmentManager);
            c14240no.A0G = true;
            c14240no.A03(c0sg);
            if (z3) {
                c14240no.A0K();
            } else if (z) {
                c14240no.A0J(true);
            } else {
                c14240no.A0J(false);
            }
        }
    }

    public final Dialog A06() {
        Dialog dialog = this.A01;
        if (dialog != null) {
            return dialog;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("DialogFragment ");
        sb.append(this);
        sb.append(" does not have a Dialog.");
        throw new IllegalStateException(sb.toString());
    }

    public final void A0D(boolean z) {
        this.A04 = z;
        Dialog dialog = this.A01;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public int A0E() {
        return this.A09;
    }

    @Override // androidx.fragment.app.Fragment
    public final AnonymousClass067 createFragmentContainer() {
        final C11450j3 c11450j3 = new C11450j3(this);
        return new AnonymousClass067() { // from class: X.0kk
            @Override // X.AnonymousClass067
            public final View A00(int i) {
                AnonymousClass067 anonymousClass067 = c11450j3;
                if (anonymousClass067.A01()) {
                    return anonymousClass067.A00(i);
                }
                Dialog dialog = C0SG.this.A01;
                if (dialog != null) {
                    return dialog.findViewById(i);
                }
                return null;
            }

            @Override // X.AnonymousClass067
            public final boolean A01() {
                if (!c11450j3.A01() && !C0SG.this.A06) {
                    return false;
                }
                return true;
            }
        };
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.A0F) {
            AbstractC10360h2.A0H(3);
            A00(this, true, true, false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Dialog dialog = this.A01;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.A00;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.A09;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.A04;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.A07;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.A08;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        int A02 = C0f9.A02(1684930327);
        super.onActivityCreated(bundle);
        C0f9.A09(1880406405, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mViewLifecycleOwnerLiveData.A09(this.A0B);
        if (!this.A0E) {
            this.A0D = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1208297191);
        super.onCreate(bundle);
        this.A0A = new Handler();
        boolean z = false;
        if (this.mContainerId == 0) {
            z = true;
        }
        this.A07 = z;
        if (bundle != null) {
            this.A00 = bundle.getInt("android:style", 0);
            this.A09 = bundle.getInt("android:theme", 0);
            this.A04 = bundle.getBoolean("android:cancelable", true);
            this.A07 = bundle.getBoolean("android:showsDialog", this.A07);
            this.A08 = bundle.getInt("android:backStackId", -1);
        }
        C0f9.A09(-441591193, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        int A02 = C0f9.A02(-563155941);
        super.onDestroyView();
        Dialog dialog = this.A01;
        if (dialog != null) {
            this.A0F = true;
            dialog.setOnDismissListener(null);
            this.A01.dismiss();
            if (!this.A0D) {
                onDismiss(this.A01);
            }
            this.A01 = null;
            this.A06 = false;
        }
        C0f9.A09(618176553, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        int A02 = C0f9.A02(-1242039940);
        super.onDetach();
        if (!this.A0E && !this.A0D) {
            this.A0D = true;
        }
        this.mViewLifecycleOwnerLiveData.A08(this.A0B);
        C0f9.A09(336420265, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflater = getLayoutInflater(bundle);
        if (this.A07 && !this.A05) {
            if (!this.A06) {
                try {
                    this.A05 = true;
                    Dialog A0F = A0F(bundle);
                    this.A01 = A0F;
                    if (this.A07) {
                        A0A(A0F, this.A00);
                        Context context = getContext();
                        if (context instanceof Activity) {
                            this.A01.setOwnerActivity((Activity) context);
                        }
                        this.A01.setCancelable(this.A04);
                        this.A01.setOnCancelListener(this.A02);
                        this.A01.setOnDismissListener(this.A03);
                        this.A06 = true;
                    } else {
                        this.A01 = null;
                    }
                } finally {
                    this.A05 = false;
                }
            }
            AbstractC10360h2.A0H(2);
            Dialog dialog = this.A01;
            if (dialog != null) {
                return layoutInflater.cloneInContext(dialog.getContext());
            }
        } else {
            AbstractC10360h2.A0H(2);
        }
        return layoutInflater;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        int A02 = C0f9.A02(-105500898);
        super.onStart();
        Dialog dialog = this.A01;
        if (dialog != null) {
            this.A0F = false;
            C0fJ.A00(dialog);
            View decorView = this.A01.getWindow().getDecorView();
            AbstractC55832hO.A01(decorView, this);
            ViewTreeViewModelStoreOwner.A01(decorView, this);
            AbstractC55842hQ.A01(decorView, this);
        }
        C0f9.A09(-212315428, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        int A02 = C0f9.A02(88987751);
        super.onStop();
        Dialog dialog = this.A01;
        if (dialog != null) {
            dialog.hide();
        }
        C0f9.A09(969999624, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        int A02 = C0f9.A02(-1307846882);
        super.onViewStateRestored(bundle);
        if (this.A01 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.A01.onRestoreInstanceState(bundle2);
        }
        C0f9.A09(1368637645, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView == null && this.A01 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.A01.onRestoreInstanceState(bundle2);
        }
    }
}
