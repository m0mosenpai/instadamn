package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.CqA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28959CqA implements InterfaceC77833eB {
    public static final C28959CqA A00 = new Object();

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        TextView textView;
        View view = (View) obj;
        C80333iN c80333iN = (C80333iN) obj2;
        AbstractC167017dG.A1P(view, c80333iN);
        if ((view instanceof TextView) && (textView = (TextView) view) != null) {
            c80333iN.A00 = textView;
            return C0eB.A00;
        }
        throw AbstractC166987dD.A14("expected TextView");
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        C80333iN c80333iN = (C80333iN) obj2;
        C14360o3.A0B(c80333iN, 2);
        c80333iN.A00 = null;
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ Class CBk() {
        return getClass();
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ String getDescription() {
        return AbstractC25228BEl.A1B(this);
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
        return false;
    }
}
