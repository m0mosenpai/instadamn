package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public final class ESH extends AbstractC65632xz {
    public final Context A00;
    public final CharSequence A01;
    public final String A02;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ESH(Context context, CharSequence charSequence, String str) {
        this.A00 = context;
        this.A02 = str;
        this.A01 = charSequence;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        C0f9.A0A(1194273579, C0f9.A03(-1731603856));
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(517910725);
        View A00 = F0I.A00(this.A00, viewGroup, this.A01, this.A02);
        C0f9.A0A(172057248, A03);
        return A00;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = C0f9.A03(818097147);
        if (view == null) {
            view = F0I.A00(this.A00, viewGroup, this.A01, this.A02);
        }
        C0f9.A0A(-902283417, A03);
        return view;
    }

    public ESH(Context context, String str, String str2) {
        this.A00 = context;
        this.A01 = str2;
        this.A02 = str;
    }
}
