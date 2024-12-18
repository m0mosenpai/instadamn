package X;

import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.Rch, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60959Rch extends IgdsSwitch {
    public boolean A00;

    @Override // com.instagram.igds.components.switchbutton.IgdsSwitch, android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.A00 && isChecked() != z) {
            this.A00 = false;
            super.setChecked(z);
        }
    }

    public final void setOn(boolean z) {
        if (isChecked() != z) {
            super.setChecked(z);
        }
        this.A00 = true;
    }
}
