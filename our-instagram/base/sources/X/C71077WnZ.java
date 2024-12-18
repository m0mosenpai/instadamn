package X;

import android.view.View;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;

/* renamed from: X.WnZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71077WnZ implements InterfaceC57999Pnj {
    public final /* synthetic */ IgRadioGroup A00;

    public C71077WnZ(IgRadioGroup igRadioGroup) {
        this.A00 = igRadioGroup;
    }

    @Override // X.InterfaceC57999Pnj
    public final void D2t(View view, boolean z) {
        IgRadioGroup igRadioGroup = this.A00;
        if (!igRadioGroup.A04) {
            igRadioGroup.A04 = true;
            int i = igRadioGroup.A00;
            if (i != -1) {
                IgRadioGroup.A01(igRadioGroup, i, false);
            }
            igRadioGroup.A04 = false;
            igRadioGroup.setCheckedId(view.getId());
        }
    }
}
