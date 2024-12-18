package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.DtV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31545DtV extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return Integer.MIN_VALUE;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C31545DtV(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1562320019);
        C33603EtF c33603EtF = (C33603EtF) AbstractC31172DnG.A0x(view);
        C14360o3.A0B(c33603EtF, 0);
        c33603EtF.A01.setText((String) obj);
        C0f9.A0A(62889538, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-498597925);
        View A00 = FC2.A00(LayoutInflater.from(this.A00), viewGroup);
        C0f9.A0A(1804700960, A03);
        return A00;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        return obj.hashCode();
    }
}
