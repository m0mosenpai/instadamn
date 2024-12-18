package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import java.util.ArrayList;

/* renamed from: X.7mR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C172577mR extends AbstractC65632xz {
    public final UserSession A02;
    public final C1810981l A03;
    public final InterfaceC186078Nb A04;
    public final boolean A05;
    public final int A01 = 3;
    public final float A00 = 1.0f;

    public C172577mR(UserSession userSession, C1810981l c1810981l, InterfaceC186078Nb interfaceC186078Nb, boolean z) {
        this.A02 = userSession;
        this.A03 = c1810981l;
        this.A04 = interfaceC186078Nb;
        this.A05 = z;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C14360o3.A0B(anonymousClass306, 0);
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1428692424);
        C14360o3.A0B(view, 1);
        C14360o3.A0B(obj, 2);
        C14360o3.A0B(obj2, 3);
        UserSession userSession = this.A02;
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.StaticStickerGridRowViewBinder.Holder");
        C22872A6s c22872A6s = (C22872A6s) tag;
        C153126ug c153126ug = (C153126ug) obj;
        C153336v2 c153336v2 = (C153336v2) obj2;
        C1810981l c1810981l = this.A03;
        InterfaceC186078Nb interfaceC186078Nb = this.A04;
        boolean z = this.A05;
        ABE abe = A3T.A00;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c22872A6s, 1);
        C14360o3.A0B(c153126ug, 2);
        C14360o3.A0B(c153336v2, 3);
        C14360o3.A0B(interfaceC186078Nb, 5);
        boolean z2 = false;
        if (c153336v2.A00 == 0) {
            z2 = true;
        }
        if (z && z2) {
            ABE abe2 = A3T.A00;
            abe2.A00.cancel();
            abe2.A00 = new AnimatorSet();
            abe2.A01 = new ArrayList();
        }
        View view2 = c22872A6s.A00;
        Resources resources = view2.getResources();
        boolean z3 = c153336v2.A04;
        int i2 = R.dimen.abc_edit_text_inset_top_material;
        if (z3) {
            i2 = R.dimen.asset_picker_static_sticker_last_row_padding;
        }
        AbstractC13880nE.A0Y(view2, resources.getDimensionPixelSize(i2));
        ArrayList arrayList = c22872A6s.A01;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj3 = arrayList.get(i3);
            C14360o3.A07(obj3);
            View view3 = (View) obj3;
            Object tag2 = view3.getTag();
            C14360o3.A0C(tag2, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.StickerSheetItemViewBinder.Holder");
            C210959Us c210959Us = (C210959Us) tag2;
            long j = c153336v2.A01 + i3 + 1;
            if (i3 < c153126ug.A01()) {
                C148276lx c148276lx = (C148276lx) c153126ug.A02(i3);
                Long valueOf = Long.valueOf(j);
                ALo.A02(userSession, c1810981l, interfaceC186078Nb, c210959Us, c148276lx, valueOf);
                if (z) {
                    view3.setVisibility(4);
                    A3T.A00.A00(view3, c153336v2, i3);
                }
                AnonymousClass229.A01(userSession).A1k(valueOf, c148276lx.A0Z, AHR.A02(c148276lx, false), AHR.A00(c148276lx));
            } else {
                RectF rectF = ALo.A01;
                C14360o3.A0B(c210959Us, 0);
                c210959Us.A02.A02();
                c210959Us.A00 = null;
                c210959Us.A03.setVisibility(4);
            }
        }
        if (z && c153336v2.A04) {
            ABE abe3 = A3T.A00;
            AnimatorSet animatorSet = abe3.A00;
            animatorSet.playSequentially(abe3.A01);
            animatorSet.start();
        }
        C0f9.A0A(-1842899096, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1765967555);
        C14360o3.A0B(viewGroup, 1);
        int i2 = this.A01;
        float f = this.A00;
        ABE abe = A3T.A00;
        Context context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_horizontal_container, viewGroup, false);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(4));
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        viewGroup2.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        C22872A6s c22872A6s = new C22872A6s(viewGroup2);
        for (int i3 = 0; i3 < i2; i3++) {
            boolean z = false;
            if (i3 < i2 - 1) {
                z = true;
            }
            ConstrainedImageView A00 = ALo.A00(context, f, z);
            c22872A6s.A01.add(A00);
            viewGroup2.addView(A00);
        }
        viewGroup2.setTag(c22872A6s);
        C0f9.A0A(-1845303968, A03);
        return viewGroup2;
    }
}
