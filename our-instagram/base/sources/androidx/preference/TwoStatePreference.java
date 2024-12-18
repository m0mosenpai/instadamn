package androidx.preference;

import X.AbstractC31177DnL;
import X.C14360o3;
import X.InterfaceC19630xq;
import X.InterfaceC55722hD;
import X.Py5;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;
import com.facebook.quickpromotion.sdk.devtool.QPCheckBoxPreference;
import com.instagram.quickpromotion.debug.devtool.IGDevToolPersistentStateHandler;

/* loaded from: classes11.dex */
public abstract class TwoStatePreference extends Preference {
    public CharSequence A00;
    public CharSequence A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    /* loaded from: classes10.dex */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = Py5.A00(62);
        public boolean A00;

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00 ? 1 : 0);
        }
    }

    @Override // androidx.preference.Preference
    public final void A0A(Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(SavedState.class)) {
            SavedState savedState = (SavedState) parcelable;
            super.A0A(savedState.getSuperState());
            A0O(savedState.A00);
            return;
        }
        super.A0A(parcelable);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0N(android.view.View r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 == 0) goto L21
            android.widget.TextView r4 = (android.widget.TextView) r4
            boolean r0 = r3.A02
            r2 = 0
            if (r0 == 0) goto L22
            java.lang.CharSequence r0 = r3.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L22
            java.lang.CharSequence r1 = r3.A01
        L15:
            r4.setText(r1)
        L18:
            int r0 = r4.getVisibility()
            if (r2 == r0) goto L21
            r4.setVisibility(r2)
        L21:
            return
        L22:
            boolean r0 = r3.A02
            if (r0 != 0) goto L31
            java.lang.CharSequence r0 = r3.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L31
            java.lang.CharSequence r1 = r3.A00
            goto L15
        L31:
            java.lang.CharSequence r1 = r3.A03()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L15
            r2 = 8
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.A0N(android.view.View):void");
    }

    public final void A0O(boolean z) {
        boolean z2 = true;
        if (this.A02 == z) {
            z2 = false;
            if (this.A04) {
                return;
            }
        }
        this.A02 = z;
        this.A04 = true;
        if (this instanceof QPCheckBoxPreference) {
            QPCheckBoxPreference qPCheckBoxPreference = (QPCheckBoxPreference) this;
            if (qPCheckBoxPreference.A0L()) {
                InterfaceC55722hD interfaceC55722hD = qPCheckBoxPreference.A00;
                String str = qPCheckBoxPreference.A0G;
                C14360o3.A07(str);
                IGDevToolPersistentStateHandler iGDevToolPersistentStateHandler = (IGDevToolPersistentStateHandler) interfaceC55722hD;
                synchronized (iGDevToolPersistentStateHandler) {
                    AbstractC31177DnL.A1N((InterfaceC19630xq) iGDevToolPersistentStateHandler.A02.getValue(), str, z);
                }
            }
        } else if (A0L() && z != A0M(!z)) {
            SharedPreferences.Editor edit = this.A0B.A00().edit();
            edit.putBoolean(this.A0G, z);
            edit.apply();
        }
        if (z2) {
            A0I(A0K());
            A04();
        }
    }
}
