package X;

import android.view.ViewStub;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class Wb5 implements InterfaceC71898X9i {
    public final int A00;

    @Override // X.InterfaceC71898X9i
    public final AbstractC69697Vts D8X(ViewStub viewStub) {
        C14360o3.A0B(viewStub, 0);
        viewStub.setLayoutResource(R.layout.cell_item_component_text);
        return new AbstractC69697Vts(viewStub, this.A00);
    }

    public Wb5(int i) {
        this.A00 = i;
    }

    public Wb5() {
        this(0);
    }
}