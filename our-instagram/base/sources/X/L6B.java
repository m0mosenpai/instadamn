package X;

import android.widget.ToggleButton;

/* loaded from: classes8.dex */
public final class L6B {
    public final /* synthetic */ KCY A00;

    public L6B(KCY kcy) {
        this.A00 = kcy;
    }

    public final void A00() {
        KCY kcy = this.A00;
        KCT A00 = KCY.A00(kcy);
        if (A00 != null) {
            boolean z = ((C51758Mth) ((C44526JmW) kcy.A0k.getValue()).A06.getValue()).A01;
            C47958LGu c47958LGu = A00.A02;
            if (c47958LGu == null) {
                C14360o3.A0F("mediaPickerPhotosController");
                throw C00O.createAndThrow();
            }
            ToggleButton toggleButton = c47958LGu.A07.A0B;
            if (toggleButton != null) {
                toggleButton.setChecked(z);
            }
        }
    }
}
