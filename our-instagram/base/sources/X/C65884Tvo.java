package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState;
import androidx.appcompat.widget.Toolbar;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.bottomappbar.BottomAppBar$SavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.navigation.NavigationBarView$SavedState;
import com.google.android.material.navigation.NavigationView$SavedState;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: X.Tvo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65884Tvo implements Parcelable.ClassLoaderCreator, Parcelable.Creator {
    public final int A00;

    public C65884Tvo(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.customview.view.AbsSavedState, java.lang.Object, com.google.android.material.navigation.NavigationView$SavedState] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.material.navigation.NavigationBarView$SavedState, androidx.customview.view.AbsSavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState] */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.customview.view.AbsSavedState, com.google.android.material.internal.CheckableImageButton$SavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.customview.view.AbsSavedState, java.lang.Object, com.google.android.material.button.MaterialButton$SavedState] */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.customview.view.AbsSavedState, com.google.android.material.bottomappbar.BottomAppBar$SavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.view.View$BaseSavedState, androidx.viewpager2.widget.ViewPager2$SavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.customview.view.AbsSavedState, androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [androidx.customview.view.AbsSavedState, java.lang.Object, androidx.appcompat.widget.Toolbar$SavedState] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.A00) {
            case 0:
                ?? obj = new Object();
                obj.A00 = parcel.readInt();
                boolean A1T = AbstractC58320PtC.A1T(parcel);
                obj.A02 = A1T;
                if (!A1T) {
                    return obj;
                }
                obj.A01 = parcel.readBundle(null);
                return obj;
            case 1:
                ?? absSavedState = new AbsSavedState(parcel, null);
                absSavedState.A00 = parcel.readInt();
                absSavedState.A01 = AbstractC37304Gc5.A1V(parcel);
                return absSavedState;
            case 2:
                return new DrawerLayout.SavedState(parcel, null);
            case 3:
                ?? absSavedState2 = new AbsSavedState(parcel, null);
                absSavedState2.A01 = AbstractC37304Gc5.A1V(parcel);
                absSavedState2.A00 = parcel.readInt();
                return absSavedState2;
            case 4:
                ?? baseSavedState = new View.BaseSavedState(parcel, null);
                baseSavedState.A01 = parcel.readInt();
                baseSavedState.A00 = parcel.readInt();
                baseSavedState.A02 = parcel.readParcelable(null);
                return baseSavedState;
            case 5:
                ?? absSavedState3 = new AbsSavedState(parcel, null);
                absSavedState3.A00 = parcel.readInt();
                absSavedState3.A01 = AbstractC37304Gc5.A1V(parcel);
                return absSavedState3;
            case 6:
                return new BottomSheetBehavior.SavedState(parcel, (ClassLoader) null);
            case 7:
                ?? absSavedState4 = new AbsSavedState(parcel, null);
                absSavedState4.getClass().getClassLoader();
                absSavedState4.A00 = AbstractC58320PtC.A1T(parcel);
                return absSavedState4;
            case 8:
                ?? absSavedState5 = new AbsSavedState(parcel, null);
                absSavedState5.A00 = AbstractC58320PtC.A1T(parcel);
                return absSavedState5;
            case 9:
                ?? absSavedState6 = new AbsSavedState(parcel, null);
                absSavedState6.A00 = parcel.readBundle(absSavedState6.getClass().getClassLoader());
                return absSavedState6;
            case 10:
                ?? absSavedState7 = new AbsSavedState(parcel, null);
                absSavedState7.A00 = parcel.readBundle(null);
                return absSavedState7;
            default:
                return new TextInputLayout.SavedState(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new AppCompatDelegateImpl$PanelFeatureState$SavedState[i];
            case 1:
                return new Toolbar.SavedState[i];
            case 2:
                return new DrawerLayout.SavedState[i];
            case 3:
                return new SlidingPaneLayout.SavedState[i];
            case 4:
                return new ViewPager2.SavedState[i];
            case 5:
                return new BottomAppBar$SavedState[i];
            case 6:
                return new BottomSheetBehavior.SavedState[i];
            case 7:
                return new MaterialButton.SavedState[i];
            case 8:
                return new CheckableImageButton.SavedState[i];
            case 9:
                return new NavigationBarView$SavedState[i];
            case 10:
                return new NavigationView$SavedState[i];
            default:
                return new TextInputLayout.SavedState[i];
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.customview.view.AbsSavedState, java.lang.Object, com.google.android.material.navigation.NavigationView$SavedState] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.material.navigation.NavigationBarView$SavedState, androidx.customview.view.AbsSavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState] */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.customview.view.AbsSavedState, com.google.android.material.internal.CheckableImageButton$SavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.customview.view.AbsSavedState, java.lang.Object, com.google.android.material.button.MaterialButton$SavedState] */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.customview.view.AbsSavedState, com.google.android.material.bottomappbar.BottomAppBar$SavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.view.View$BaseSavedState, androidx.viewpager2.widget.ViewPager2$SavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.customview.view.AbsSavedState, androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [androidx.customview.view.AbsSavedState, java.lang.Object, androidx.appcompat.widget.Toolbar$SavedState] */
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.A00) {
            case 0:
                ?? obj = new Object();
                obj.A00 = parcel.readInt();
                boolean A1T = AbstractC58320PtC.A1T(parcel);
                obj.A02 = A1T;
                if (!A1T) {
                    return obj;
                }
                obj.A01 = parcel.readBundle(classLoader);
                return obj;
            case 1:
                ?? absSavedState = new AbsSavedState(parcel, classLoader);
                absSavedState.A00 = parcel.readInt();
                absSavedState.A01 = AbstractC37304Gc5.A1V(parcel);
                return absSavedState;
            case 2:
                return new DrawerLayout.SavedState(parcel, classLoader);
            case 3:
                ?? absSavedState2 = new AbsSavedState(parcel, null);
                absSavedState2.A01 = AbstractC37304Gc5.A1V(parcel);
                absSavedState2.A00 = parcel.readInt();
                return absSavedState2;
            case 4:
                ?? baseSavedState = new View.BaseSavedState(parcel, classLoader);
                baseSavedState.A01 = parcel.readInt();
                baseSavedState.A00 = parcel.readInt();
                baseSavedState.A02 = parcel.readParcelable(classLoader);
                return baseSavedState;
            case 5:
                ?? absSavedState3 = new AbsSavedState(parcel, classLoader);
                absSavedState3.A00 = parcel.readInt();
                absSavedState3.A01 = AbstractC37304Gc5.A1V(parcel);
                return absSavedState3;
            case 6:
                return new BottomSheetBehavior.SavedState(parcel, classLoader);
            case 7:
                ?? absSavedState4 = new AbsSavedState(parcel, classLoader);
                if (classLoader == null) {
                    absSavedState4.getClass().getClassLoader();
                }
                absSavedState4.A00 = AbstractC58320PtC.A1T(parcel);
                return absSavedState4;
            case 8:
                ?? absSavedState5 = new AbsSavedState(parcel, classLoader);
                absSavedState5.A00 = AbstractC58320PtC.A1T(parcel);
                return absSavedState5;
            case 9:
                ?? absSavedState6 = new AbsSavedState(parcel, classLoader);
                if (classLoader == null) {
                    classLoader = absSavedState6.getClass().getClassLoader();
                }
                absSavedState6.A00 = parcel.readBundle(classLoader);
                return absSavedState6;
            case 10:
                ?? absSavedState7 = new AbsSavedState(parcel, classLoader);
                absSavedState7.A00 = parcel.readBundle(classLoader);
                return absSavedState7;
            default:
                return new TextInputLayout.SavedState(parcel, classLoader);
        }
    }
}
