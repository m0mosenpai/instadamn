package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class ERX extends AbstractC65632xz {
    public final Context A00;
    public final GWU A01;
    public final InterfaceC11380iw A02;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ERX(Context context, GWU gwu, InterfaceC11380iw interfaceC11380iw) {
        this.A00 = context;
        this.A02 = interfaceC11380iw;
        this.A01 = gwu;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        C0f9.A03(-789990505);
        view.getTag().getClass();
        throw AbstractC166987dD.A15("getProfilePicUri");
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-589075642);
        View A07 = AbstractC31175DnJ.A07(LayoutInflater.from(this.A00), viewGroup, R.layout.row_page, false);
        A07.setTag(new C34592FMb(A07));
        C0f9.A0A(-8086513, A03);
        return A07;
    }
}
