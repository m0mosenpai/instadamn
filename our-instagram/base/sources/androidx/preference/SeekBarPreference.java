package androidx.preference;

import X.AbstractC68645VZd;
import X.C55531OlP;
import X.C66482UJh;
import X.MSX;
import X.Py5;
import X.ViewOnKeyListenerC70238WNb;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;
import com.facebook.R;

/* loaded from: classes11.dex */
public class SeekBarPreference extends Preference {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public SeekBar A04;
    public TextView A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final View.OnKeyListener A0A;
    public final SeekBar.OnSeekBarChangeListener A0B;

    /* loaded from: classes10.dex */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = Py5.A00(61);
        public int A00;
        public int A01;
        public int A02;

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A02);
            parcel.writeInt(this.A01);
            parcel.writeInt(this.A00);
        }
    }

    @Override // androidx.preference.Preference
    public final void A0A(Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(SavedState.class)) {
            SavedState savedState = (SavedState) parcelable;
            super.A0A(savedState.getSuperState());
            this.A03 = savedState.A02;
            this.A01 = savedState.A01;
            this.A00 = savedState.A00;
            A04();
            return;
        }
        super.A0A(parcelable);
    }

    public final void A0N(SeekBar seekBar) {
        int progress = this.A01 + seekBar.getProgress();
        int i = this.A03;
        if (progress != i) {
            int i2 = this.A01;
            if (progress < i2) {
                progress = i2;
            }
            int i3 = this.A00;
            if (progress > i3) {
                progress = i3;
            }
            if (progress != i) {
                this.A03 = progress;
                TextView textView = this.A05;
                if (textView != null) {
                    MSX.A15(textView, progress);
                }
                if (A0L()) {
                    int i4 = progress ^ (-1);
                    if (A0L()) {
                        i4 = super.A0B.A00().getInt(this.A0G, i4);
                    }
                    if (progress != i4) {
                        SharedPreferences.Editor edit = super.A0B.A00().edit();
                        edit.putInt(this.A0G, progress);
                        edit.apply();
                    }
                }
            }
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        this.A0B = new C55531OlP(this, 0);
        this.A0A = new ViewOnKeyListenerC70238WNb(this, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC68645VZd.A0A, R.attr.seekBarPreferenceStyle, 0);
        this.A01 = obtainStyledAttributes.getInt(3, 0);
        int i = obtainStyledAttributes.getInt(1, 100);
        int i2 = this.A01;
        i = i < i2 ? i2 : i;
        if (i != this.A00) {
            this.A00 = i;
            A04();
        }
        int i3 = obtainStyledAttributes.getInt(4, 0);
        if (i3 != this.A02) {
            this.A02 = Math.min(this.A00 - this.A01, Math.abs(i3));
            A04();
        }
        this.A06 = obtainStyledAttributes.getBoolean(2, true);
        this.A07 = obtainStyledAttributes.getBoolean(5, false);
        this.A09 = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void A0D(C66482UJh c66482UJh) {
        super.A0D(c66482UJh);
        c66482UJh.itemView.setOnKeyListener(this.A0A);
        this.A04 = (SeekBar) c66482UJh.A00(R.id.seekbar);
        TextView textView = (TextView) c66482UJh.A00(R.id.seekbar_value);
        this.A05 = textView;
        if (this.A07) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.A05 = null;
        }
        SeekBar seekBar = this.A04;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.A0B);
        this.A04.setMax(this.A00 - this.A01);
        int i = this.A02;
        SeekBar seekBar2 = this.A04;
        if (i != 0) {
            seekBar2.setKeyProgressIncrement(i);
        } else {
            this.A02 = seekBar2.getKeyProgressIncrement();
        }
        this.A04.setProgress(this.A03 - this.A01);
        int i2 = this.A03;
        TextView textView2 = this.A05;
        if (textView2 != null) {
            MSX.A15(textView2, i2);
        }
        this.A04.setEnabled(A0J());
    }
}
