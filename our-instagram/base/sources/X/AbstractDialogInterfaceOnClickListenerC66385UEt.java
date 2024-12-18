package X;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.preference.DialogPreference;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;

/* renamed from: X.UEt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC66385UEt extends C0SG implements DialogInterface.OnClickListener {
    public int A00;
    public int A01;
    public BitmapDrawable A02;
    public DialogPreference A03;
    public CharSequence A04;
    public CharSequence A05;
    public CharSequence A06;
    public CharSequence A07;

    @Override // X.C0SG
    public final Dialog A0F(Bundle bundle) {
        View inflate;
        this.A01 = -2;
        C69797Vvh c69797Vvh = new C69797Vvh(requireContext());
        c69797Vvh.A08(this.A05);
        BitmapDrawable bitmapDrawable = this.A02;
        C69487VoA c69487VoA = c69797Vvh.A01;
        c69487VoA.A08 = bitmapDrawable;
        c69797Vvh.A06(this, this.A07);
        c69797Vvh.A05(this, this.A06);
        requireContext();
        int i = this.A00;
        if (i != 0 && (inflate = getLayoutInflater().inflate(i, (ViewGroup) null)) != null) {
            A0H(inflate);
            c69797Vvh.A07(inflate);
        } else {
            c69487VoA.A0C = this.A04;
        }
        if (this instanceof UG7) {
            UG7 ug7 = (UG7) this;
            int length = ug7.A03.length;
            boolean[] zArr = new boolean[length];
            for (int i2 = 0; i2 < length; i2++) {
                zArr[i2] = ug7.A00.contains(ug7.A03[i2].toString());
            }
            CharSequence[] charSequenceArr = ug7.A02;
            WIB wib = new WIB(ug7);
            c69487VoA.A0J = charSequenceArr;
            c69487VoA.A07 = wib;
            c69487VoA.A0K = zArr;
            c69487VoA.A0H = true;
        } else if (this instanceof UG6) {
            UG6 ug6 = (UG6) this;
            CharSequence[] charSequenceArr2 = ug6.A01;
            int i3 = ug6.A00;
            WHP whp = new WHP(ug6, 0);
            c69487VoA.A0J = charSequenceArr2;
            c69487VoA.A03 = whp;
            c69487VoA.A00 = i3;
            c69487VoA.A0I = true;
            c69797Vvh.A06(null, null);
        }
        UD9 A00 = c69797Vvh.A00();
        if (this instanceof UG8) {
            Window window = A00.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                AbstractC61642RrD.A00(window);
            } else {
                UG8 ug8 = (UG8) this;
                ug8.A00 = SystemClock.currentThreadTimeMillis();
                ug8.A0I();
                return A00;
            }
        }
        return A00;
    }

    public final DialogPreference A0G() {
        Preference preference;
        PreferenceScreen preferenceScreen;
        DialogPreference dialogPreference = this.A03;
        if (dialogPreference == null) {
            String string = requireArguments().getString("key");
            C69638Vsf c69638Vsf = ((UEz) ((X70) getTargetFragment())).A01;
            if (c69638Vsf != null && (preferenceScreen = c69638Vsf.A05) != null) {
                preference = preferenceScreen.A0N(string);
            } else {
                preference = null;
            }
            DialogPreference dialogPreference2 = (DialogPreference) preference;
            this.A03 = dialogPreference2;
            return dialogPreference2;
        }
        return dialogPreference;
    }

    public void A0H(View view) {
        View findViewById = view.findViewById(R.id.message);
        if (findViewById != null) {
            CharSequence charSequence = this.A04;
            int i = 8;
            if (!TextUtils.isEmpty(charSequence)) {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i = 0;
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A01 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b7, code lost:
    
        if (r3 != null) goto L16;
     */
    @Override // X.C0SG, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            r0 = 1894856040(0x70f13568, float:5.972036E29)
            int r4 = X.C0f9.A02(r0)
            super.onCreate(r8)
            androidx.fragment.app.Fragment r2 = r7.getTargetFragment()
            boolean r0 = r2 instanceof X.X70
            if (r0 == 0) goto Lba
            X.X70 r2 = (X.X70) r2
            android.os.Bundle r1 = r7.requireArguments()
            java.lang.String r0 = "key"
            java.lang.String r1 = r1.getString(r0)
            r5 = 0
            if (r8 != 0) goto L87
            X.UEz r2 = (X.UEz) r2
            X.Vsf r0 = r2.A01
            if (r0 == 0) goto L85
            androidx.preference.PreferenceScreen r0 = r0.A05
            if (r0 == 0) goto L85
            androidx.preference.Preference r1 = r0.A0N(r1)
        L2f:
            androidx.preference.DialogPreference r1 = (androidx.preference.DialogPreference) r1
            r7.A03 = r1
            java.lang.CharSequence r0 = r1.A03
            r7.A05 = r0
            java.lang.CharSequence r0 = r1.A05
            r7.A07 = r0
            java.lang.CharSequence r0 = r1.A04
            r7.A06 = r0
            java.lang.CharSequence r0 = r1.A02
            r7.A04 = r0
            int r0 = r1.A00
            r7.A00 = r0
            android.graphics.drawable.Drawable r6 = r1.A01
            if (r6 == 0) goto L82
            boolean r0 = r6 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 != 0) goto L82
            int r2 = r6.getIntrinsicWidth()
            int r1 = r6.getIntrinsicHeight()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r3)
            int r1 = r2.getWidth()
            int r0 = r2.getHeight()
            r6.setBounds(r5, r5, r1, r0)
            r6.draw(r2)
        L70:
            android.content.res.Resources r0 = X.AbstractC166997dE.A0N(r7)
            android.graphics.drawable.BitmapDrawable r6 = new android.graphics.drawable.BitmapDrawable
            r6.<init>(r0, r3)
        L79:
            r7.A02 = r6
        L7b:
            r0 = -994430099(0xffffffffc4ba336d, float:-1489.607)
            X.C0f9.A09(r0, r4)
            return
        L82:
            android.graphics.drawable.BitmapDrawable r6 = (android.graphics.drawable.BitmapDrawable) r6
            goto L79
        L85:
            r1 = 0
            goto L2f
        L87:
            java.lang.String r0 = "PreferenceDialogFragment.title"
            java.lang.CharSequence r0 = r8.getCharSequence(r0)
            r7.A05 = r0
            java.lang.String r0 = "PreferenceDialogFragment.positiveText"
            java.lang.CharSequence r0 = r8.getCharSequence(r0)
            r7.A07 = r0
            java.lang.String r0 = "PreferenceDialogFragment.negativeText"
            java.lang.CharSequence r0 = r8.getCharSequence(r0)
            r7.A06 = r0
            java.lang.String r0 = "PreferenceDialogFragment.message"
            java.lang.CharSequence r0 = r8.getCharSequence(r0)
            r7.A04 = r0
            java.lang.String r0 = "PreferenceDialogFragment.layout"
            int r0 = r8.getInt(r0, r5)
            r7.A00 = r0
            java.lang.String r0 = "PreferenceDialogFragment.icon"
            android.os.Parcelable r3 = r8.getParcelable(r0)
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            if (r3 == 0) goto L7b
            goto L70
        Lba:
            java.lang.String r0 = "Target fragment must implement TargetFragment interface"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            r0 = 1032845014(0x3d8ff6d6, float:0.07029502)
            X.C0f9.A09(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractDialogInterfaceOnClickListenerC66385UEt.onCreate(android.os.Bundle):void");
    }

    @Override // X.C0SG, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i;
        super.onDismiss(dialogInterface);
        boolean A1P = AbstractC167007dF.A1P(this.A01, -1);
        if (this instanceof UG7) {
            UG7 ug7 = (UG7) this;
            if (A1P && ug7.A01) {
                ((MultiSelectListPreference) ug7.A0G()).A0N(ug7.A00);
            }
            ug7.A01 = false;
            return;
        }
        if (this instanceof UG6) {
            UG6 ug6 = (UG6) this;
            if (!A1P || (i = ug6.A00) < 0) {
                return;
            }
            ((ListPreference) ug6.A0G()).A0O(ug6.A02[i].toString());
            return;
        }
        UG8 ug8 = (UG8) this;
        if (!A1P) {
            return;
        }
        String A0g = AbstractC167007dF.A0g(ug8.A01);
        EditTextPreference editTextPreference = (EditTextPreference) ug8.A0G();
        boolean A0K = editTextPreference.A0K();
        editTextPreference.A00 = A0g;
        editTextPreference.A0G(A0g);
        boolean A0K2 = editTextPreference.A0K();
        if (A0K2 != A0K) {
            editTextPreference.A0I(A0K2);
        }
        editTextPreference.A04();
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.A05);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.A07);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.A06);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.A04);
        bundle.putInt("PreferenceDialogFragment.layout", this.A00);
        BitmapDrawable bitmapDrawable = this.A02;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }
}
