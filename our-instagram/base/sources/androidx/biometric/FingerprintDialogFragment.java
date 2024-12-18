package androidx.biometric;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC31171DnF;
import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.C0SG;
import X.C0f9;
import X.C2GS;
import X.C58772Q8e;
import X.C63628Sqa;
import X.C69797Vvh;
import X.DialogInterfaceOnClickListenerC63420Sjy;
import X.SH3;
import X.TJB;
import X.UD9;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;

/* loaded from: classes10.dex */
public final class FingerprintDialogFragment extends C0SG {
    public int A00;
    public int A01;
    public ImageView A02;
    public TextView A03;
    public C58772Q8e A04;
    public final Handler A05 = AbstractC167007dF.A0J();
    public final Runnable A06 = new TJB(this);

    @Override // X.C0SG, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C58772Q8e c58772Q8e = this.A04;
        C2GS c2gs = c58772Q8e.A0E;
        if (c2gs == null) {
            c2gs = AbstractC58318PtA.A0J();
            c58772Q8e.A0E = c2gs;
        }
        C58772Q8e.A00(c2gs, true);
    }

    private int A01(int i) {
        Context context = getContext();
        FragmentActivity activity = getActivity();
        if (context != null && activity != null) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(i, typedValue, true);
            TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(typedValue.data, new int[]{i});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            return color;
        }
        Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
        return 0;
    }

    @Override // X.C0SG
    public final Dialog A0F(Bundle bundle) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        C69797Vvh c69797Vvh = new C69797Vvh(requireContext());
        SH3 sh3 = this.A04.A06;
        if (sh3 != null) {
            charSequence = sh3.A03;
        } else {
            charSequence = null;
        }
        c69797Vvh.A08(charSequence);
        View inflate = LayoutInflater.from(c69797Vvh.A01.A0L).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView A0e = AbstractC166987dD.A0e(inflate, R.id.fingerprint_subtitle);
        if (A0e != null) {
            if (TextUtils.isEmpty(null)) {
                A0e.setVisibility(8);
            } else {
                A0e.setVisibility(0);
                A0e.setText((CharSequence) null);
            }
        }
        TextView A0e2 = AbstractC166987dD.A0e(inflate, R.id.fingerprint_description);
        if (A0e2 != null) {
            SH3 sh32 = this.A04.A06;
            if (sh32 != null) {
                charSequence3 = sh32.A01;
            } else {
                charSequence3 = null;
            }
            if (TextUtils.isEmpty(charSequence3)) {
                A0e2.setVisibility(8);
            } else {
                A0e2.setVisibility(0);
                A0e2.setText(charSequence3);
            }
        }
        this.A02 = AbstractC31171DnF.A08(inflate, R.id.fingerprint_icon);
        this.A03 = AbstractC166987dD.A0e(inflate, R.id.fingerprint_error);
        C58772Q8e c58772Q8e = this.A04;
        if ((c58772Q8e.A01() & Constants.LOAD_RESULT_PGO) != 0) {
            charSequence2 = getString(2131956566);
        } else {
            charSequence2 = c58772Q8e.A0G;
            if (charSequence2 == null) {
                SH3 sh33 = c58772Q8e.A06;
                if (sh33 != null) {
                    charSequence2 = sh33.A02;
                    if (charSequence2 == null) {
                        charSequence2 = "";
                    }
                } else {
                    charSequence2 = null;
                }
            }
        }
        c69797Vvh.A05(new DialogInterfaceOnClickListenerC63420Sjy(this, 0), charSequence2);
        c69797Vvh.A07(inflate);
        UD9 A00 = c69797Vvh.A00();
        A00.setCanceledOnTouchOutside(false);
        return A00;
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1792436741);
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C58772Q8e A0H = AbstractC58320PtC.A0H(activity);
            this.A04 = A0H;
            C2GS c2gs = A0H.A0C;
            if (c2gs == null) {
                c2gs = AbstractC58318PtA.A0J();
                A0H.A0C = c2gs;
            }
            C63628Sqa.A02(this, c2gs, 6);
            C58772Q8e c58772Q8e = this.A04;
            C2GS c2gs2 = c58772Q8e.A0B;
            if (c2gs2 == null) {
                c2gs2 = AbstractC58318PtA.A0J();
                c58772Q8e.A0B = c2gs2;
            }
            C63628Sqa.A02(this, c2gs2, 7);
        }
        this.A00 = A01(R.attr.colorError);
        this.A01 = A01(android.R.attr.textColorSecondary);
        C0f9.A09(-1212182408, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-227822491);
        super.onPause();
        this.A05.removeCallbacksAndMessages(null);
        C0f9.A09(1872654175, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-267701365);
        super.onResume();
        C58772Q8e c58772Q8e = this.A04;
        c58772Q8e.A01 = 0;
        c58772Q8e.A02(1);
        this.A04.A03(getString(2131962617));
        C0f9.A09(2131559532, A02);
    }
}
