package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;

/* loaded from: classes11.dex */
public final class U1Y implements InterfaceC57142jp {
    public final /* synthetic */ View A00;
    public final /* synthetic */ U28 A01;

    public U1Y(View view, U28 u28) {
        this.A00 = view;
        this.A01 = u28;
    }

    @Override // X.InterfaceC57142jp
    public final void Ao7(Rect rect) {
        Context context = this.A00.getContext();
        C14360o3.A07(context);
        rect.set(Integer.MIN_VALUE, AbstractC13880nE.A09(context) - this.A01.A00, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }
}
