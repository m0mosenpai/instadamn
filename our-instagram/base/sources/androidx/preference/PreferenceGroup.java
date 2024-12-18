package androidx.preference;

import X.AbstractC167007dF;
import X.AbstractC31173DnH;
import X.AbstractC68645VZd;
import X.AnonymousClass001;
import X.C005001p;
import X.Py5;
import X.RunnableC71226WqH;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class PreferenceGroup extends Preference {
    public int A00;
    public boolean A01;
    public boolean A02;
    public int A03;
    public final Handler A04;
    public final C005001p A05;
    public final Runnable A06;
    public final List A07;

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A05 = new C005001p(0);
        this.A04 = AbstractC167007dF.A0J();
        this.A02 = true;
        this.A03 = 0;
        this.A01 = false;
        this.A00 = Integer.MAX_VALUE;
        this.A06 = new RunnableC71226WqH(this);
        this.A07 = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC68645VZd.A08, i, 0);
        this.A02 = obtainStyledAttributes.getBoolean(2, obtainStyledAttributes.getBoolean(2, true));
        if (obtainStyledAttributes.hasValue(1)) {
            int i2 = obtainStyledAttributes.getInt(1, obtainStyledAttributes.getInt(1, Integer.MAX_VALUE));
            if (i2 != Integer.MAX_VALUE && !(!TextUtils.isEmpty(this.A0G))) {
                Log.e("PreferenceGroup", AnonymousClass001.A0R(AbstractC31173DnH.A0q(this), " should have a key defined if it contains an expandable preference"));
            }
            this.A00 = i2;
        }
        obtainStyledAttributes.recycle();
    }

    /* loaded from: classes10.dex */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = Py5.A00(60);
        public int A00;

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00);
        }
    }

    @Override // androidx.preference.Preference
    public final void A0A(Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(SavedState.class)) {
            SavedState savedState = (SavedState) parcelable;
            this.A00 = savedState.A00;
            parcelable = savedState.getSuperState();
        }
        super.A0A(parcelable);
    }

    public final Preference A0N(CharSequence charSequence) {
        if (charSequence != null) {
            if (TextUtils.equals(this.A0G, charSequence)) {
                return this;
            }
            List list = this.A07;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Preference preference = (Preference) list.get(i);
                if (TextUtils.equals(preference.A0G, charSequence) || ((preference instanceof PreferenceGroup) && (preference = ((PreferenceGroup) preference).A0N(charSequence)) != null)) {
                    return preference;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("Key cannot be null");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0O(androidx.preference.Preference r8) {
        /*
            r7 = this;
            java.util.List r3 = r7.A07
            boolean r0 = r3.contains(r8)
            r6 = 1
            if (r0 != 0) goto Lc1
            java.lang.String r4 = r8.A0G
            if (r4 == 0) goto L28
            r0 = r7
        Le:
            androidx.preference.PreferenceGroup r1 = r0.A0A
            if (r1 == 0) goto L15
            androidx.preference.PreferenceGroup r0 = r0.A0A
            goto Le
        L15:
            androidx.preference.Preference r0 = r0.A0N(r4)
            if (r0 == 0) goto L28
            java.lang.String r2 = "PreferenceGroup"
            java.lang.String r1 = "Found duplicated key: \""
            java.lang.String r0 = "\". This can cause unintended behaviour, please use unique keys for every preference."
            java.lang.String r0 = X.AnonymousClass001.A0g(r1, r4, r0)
            android.util.Log.e(r2, r0)
        L28:
            int r2 = r8.A02
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r0) goto L4b
            boolean r0 = r7.A02
            if (r0 == 0) goto L40
            int r1 = r7.A03
            int r0 = r1 + 1
            r7.A03 = r0
            if (r1 == r2) goto L40
            r8.A02 = r1
            r8.A07()
        L40:
            boolean r0 = r8 instanceof androidx.preference.PreferenceGroup
            if (r0 == 0) goto L4b
            r1 = r8
            androidx.preference.PreferenceGroup r1 = (androidx.preference.PreferenceGroup) r1
            boolean r0 = r7.A02
            r1.A02 = r0
        L4b:
            int r2 = java.util.Collections.binarySearch(r3, r8)
            if (r2 >= 0) goto L53
            int r2 = -r2
            int r2 = r2 - r6
        L53:
            boolean r1 = r7.A0K()
            boolean r0 = r8.A0M
            if (r0 != r1) goto L69
            r0 = r1 ^ 1
            r8.A0M = r0
            boolean r0 = r8.A0K()
            r8.A0I(r0)
            r8.A04()
        L69:
            monitor-enter(r7)
            r3.add(r2, r8)     // Catch: java.lang.Throwable -> Lbe
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lbe
            X.Vsf r5 = r7.A0B
            java.lang.String r4 = r8.A0G
            if (r4 == 0) goto L8f
            X.01p r1 = r7.A05
            boolean r0 = r1.containsKey(r4)
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r1.get(r4)
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            r1.remove(r4)
        L89:
            r8.A04 = r2
            r8.A0L = r6
            r1 = 0
            goto L99
        L8f:
            monitor-enter(r5)
            long r2 = r5.A00     // Catch: java.lang.Throwable -> Lbb
            r0 = 1
            long r0 = r0 + r2
            r5.A00 = r0     // Catch: java.lang.Throwable -> Lbb
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lbb
            goto L89
        L99:
            r8.A0C(r5)     // Catch: java.lang.Throwable -> Lb7
            r8.A0L = r1
            androidx.preference.PreferenceGroup r0 = r8.A0A
            if (r0 != 0) goto Laf
            r8.A0A = r7
            boolean r0 = r7.A01
            if (r0 == 0) goto Lab
            r8.A05()
        Lab:
            r7.A07()
            return
        Laf:
            java.lang.String r0 = "This preference already has a parent. You must remove the existing parent before assigning a new one."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        Lb7:
            r0 = move-exception
            r8.A0L = r1
            throw r0
        Lbb:
            r1 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lbb
            throw r1
        Lbe:
            r1 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lbe
            throw r1
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.PreferenceGroup.A0O(androidx.preference.Preference):void");
    }

    @Override // androidx.preference.Preference
    public final void A05() {
        super.A05();
        this.A01 = true;
        List list = this.A07;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Preference) list.get(i)).A05();
        }
    }

    @Override // androidx.preference.Preference
    public final void A08(Bundle bundle) {
        super.A08(bundle);
        List list = this.A07;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Preference) list.get(i)).A08(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void A09(Bundle bundle) {
        super.A09(bundle);
        List list = this.A07;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Preference) list.get(i)).A09(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void A0I(boolean z) {
        super.A0I(z);
        List list = this.A07;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Preference preference = (Preference) list.get(i);
            if (preference.A0M == z) {
                preference.A0M = !z;
                preference.A0I(preference.A0K());
                preference.A04();
            }
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
