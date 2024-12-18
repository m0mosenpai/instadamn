package X;

import com.instagram.creation.photo.edit.tint.IgTintColorPicker;

/* loaded from: classes9.dex */
public final class PMO implements Runnable {
    public final /* synthetic */ IgTintColorPicker A00;

    public PMO(IgTintColorPicker igTintColorPicker) {
        this.A00 = igTintColorPicker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A08.A03();
    }
}
