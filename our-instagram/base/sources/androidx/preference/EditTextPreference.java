package androidx.preference;

import X.Py5;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.Preference;

/* loaded from: classes11.dex */
public class EditTextPreference extends DialogPreference {
    public String A00;

    /* loaded from: classes10.dex */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = Py5.A00(56);
        public String A00;

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.A00);
        }
    }

    @Override // androidx.preference.Preference
    public final void A0A(Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(SavedState.class)) {
            SavedState savedState = (SavedState) parcelable;
            super.A0A(savedState.getSuperState());
            String str = savedState.A00;
            boolean A0K = A0K();
            this.A00 = str;
            A0G(str);
            boolean A0K2 = A0K();
            if (A0K2 != A0K) {
                A0I(A0K2);
            }
            A04();
            return;
        }
        super.A0A(parcelable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.WSv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r1 = 2130969334(0x7f0402f6, float:1.7547347E38)
            r0 = 16842898(0x1010092, float:2.3693967E-38)
            int r1 = X.AbstractC63040SbG.A00(r4, r1, r0)
            r2 = 0
            r3.<init>(r4, r5, r1)
            int[] r0 = X.AbstractC68645VZd.A03
            android.content.res.TypedArray r1 = r4.obtainStyledAttributes(r5, r0, r1, r2)
            boolean r0 = r1.getBoolean(r2, r2)
            boolean r0 = r1.getBoolean(r2, r0)
            if (r0 == 0) goto L2e
            X.WSv r0 = X.C70367WSv.A00
            if (r0 != 0) goto L29
            X.WSv r0 = new X.WSv
            r0.<init>()
            X.C70367WSv.A00 = r0
        L29:
            r3.A09 = r0
            r3.A04()
        L2e:
            r1.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }
}
