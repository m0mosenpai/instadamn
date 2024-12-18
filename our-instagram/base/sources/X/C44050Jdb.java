package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.mediapicker.view.GalleryPickerMediaOverlayView;

/* renamed from: X.Jdb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44050Jdb extends AbstractC66422zJ {
    public final C206279Bk A00;
    public final C8SF A01;
    public final UserSession A02;
    public final InterfaceC16660sJ A03;
    public final InterfaceC16660sJ A04;

    public C44050Jdb(C206279Bk c206279Bk, C8SF c8sf, UserSession userSession, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        C14360o3.A0B(c206279Bk, 2);
        this.A01 = c8sf;
        this.A00 = c206279Bk;
        this.A04 = interfaceC16660sJ;
        this.A03 = interfaceC16660sJ2;
        this.A02 = userSession;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        C206279Bk c206279Bk = this.A00;
        C14360o3.A0B(c206279Bk, 1);
        Context context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.gallery_picker_grid_item, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        View findViewById = constraintLayout.findViewById(R.id.gallery_picker_grid_item_background);
        C14360o3.A07(findViewById);
        View findViewById2 = constraintLayout.findViewById(R.id.gallery_picker_item_overlay);
        C14360o3.A07(findViewById2);
        C14360o3.A0A(context);
        C177967vV A00 = C206019Ah.A00((IgImageView) findViewById);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C177977vW c177977vW = new C177977vW(constraintLayout, new C44297Jho((GalleryPickerMediaOverlayView) findViewById2), A00);
        String A04 = AbstractC188868Yc.A04((Integer) c206279Bk.A05);
        ViewGroup.LayoutParams layoutParams = c177977vW.A03.A07.getLayoutParams();
        C14360o3.A0C(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((C56302iJ) layoutParams).A0z = A04;
        return c177977vW;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014d  */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r34, X.C3OO r35) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44050Jdb.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C195598kz.class;
    }
}
