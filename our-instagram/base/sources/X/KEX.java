package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KEX extends AbstractC168697g3 {
    public final C43838Ja1 A00 = new C43838Ja1(C05F.A01);

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1950173984);
        if (view == null) {
            int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
            view = AbstractC31177DnL.A0E(viewGroup, 0).inflate(R.layout.gallery_header, viewGroup, false);
            AbstractC43592JPx.A1H(view, -1, -2);
            Resources resources = viewGroup.getResources();
            view.setPadding(view.getPaddingLeft(), resources.getDimensionPixelSize(R.dimen.direct_composer_redesign_background_height), view.getPaddingRight(), AbstractC166997dE.A06(resources));
            C14360o3.A0A(view);
            view.setTag(new C44756Jrd(view));
        }
        ((C44756Jrd) AbstractC31172DnG.A0x(view)).A00(this.A00.A00, null);
        C0f9.A0A(2071582438, A03);
        return view;
    }
}
