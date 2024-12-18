package X;

import android.widget.CompoundButton;
import com.google.android.material.chip.ChipGroup;

/* renamed from: X.WOk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70264WOk implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ ChipGroup A00;

    public C70264WOk(ChipGroup chipGroup) {
        this.A00 = chipGroup;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i;
        ChipGroup chipGroup = this.A00;
        if (!chipGroup.A01) {
            if (chipGroup.getCheckedChipIds().isEmpty() && chipGroup.A02) {
                ChipGroup.A00(chipGroup, compoundButton.getId(), true);
                i = compoundButton.getId();
            } else {
                int id = compoundButton.getId();
                i = -1;
                int i2 = chipGroup.A00;
                if (z) {
                    if (i2 != -1 && i2 != id && chipGroup.A03) {
                        ChipGroup.A00(chipGroup, i2, false);
                    }
                    chipGroup.A00 = id;
                    return;
                }
                if (i2 != id) {
                    return;
                }
            }
            chipGroup.A00 = i;
        }
    }
}
