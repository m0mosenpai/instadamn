package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import java.util.ArrayList;

/* renamed from: X.7mS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C172587mS extends AbstractC65632xz {
    public final float A00 = 1.0f;
    public final UserSession A01;
    public final C1810981l A02;
    public final InterfaceC186078Nb A03;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C14360o3.A0B(anonymousClass306, 0);
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C172587mS(UserSession userSession, C1810981l c1810981l, InterfaceC186078Nb interfaceC186078Nb) {
        this.A01 = userSession;
        this.A02 = c1810981l;
        this.A03 = interfaceC186078Nb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        C55U c55u;
        C5RP c5rp;
        int A03 = C0f9.A03(1172673205);
        C14360o3.A0B(view, 1);
        C14360o3.A0B(obj, 2);
        C14360o3.A0B(obj2, 3);
        UserSession userSession = this.A01;
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.SquareStickerRedesignGridRowViewBinder.Holder");
        C22871A6r c22871A6r = (C22871A6r) tag;
        C153126ug c153126ug = (C153126ug) obj;
        C153336v2 c153336v2 = (C153336v2) obj2;
        C1810981l c1810981l = this.A02;
        InterfaceC186078Nb interfaceC186078Nb = this.A03;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c22871A6r, 1);
        C14360o3.A0B(c153126ug, 2);
        C14360o3.A0B(c153336v2, 3);
        C14360o3.A0B(interfaceC186078Nb, 5);
        View view2 = c22871A6r.A00;
        Resources resources = view2.getResources();
        boolean z = c153336v2.A04;
        int i2 = R.dimen.abc_edit_text_inset_top_material;
        if (z) {
            i2 = R.dimen.asset_picker_static_sticker_last_row_padding;
        }
        AbstractC13880nE.A0Y(view2, resources.getDimensionPixelSize(i2));
        ArrayList arrayList = c22871A6r.A01;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj3 = arrayList.get(i3);
            C14360o3.A07(obj3);
            Object tag2 = ((View) obj3).getTag();
            C14360o3.A0C(tag2, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.SquareStickerRedesignItemViewBinder.Holder");
            C210949Ur c210949Ur = (C210949Ur) tag2;
            long j = c153336v2.A01 + i3 + 1;
            if (i3 < c153126ug.A01()) {
                C148276lx c148276lx = (C148276lx) c153126ug.A02(i3);
                Long valueOf = Long.valueOf(j);
                RectF rectF = AbstractC23078AFk.A01;
                C14360o3.A0B(c210949Ur, 1);
                C14360o3.A0B(c148276lx, 2);
                C447324d c447324d = AnonymousClass229.A01(userSession).A01;
                C14360o3.A07(c447324d);
                c447324d.A02(c148276lx.A0Z, c148276lx.A00().name());
                ConstrainedImageView constrainedImageView = c210949Ur.A03;
                Context context = constrainedImageView.getContext();
                C14360o3.A07(context);
                if (c1810981l != null) {
                    c55u = (C55U) c1810981l.A08.A00;
                } else {
                    c55u = null;
                }
                C209809Pq A01 = AbstractC209799Pp.A01(context, userSession, c55u, interfaceC186078Nb, c148276lx);
                c210949Ur.A02.A02();
                constrainedImageView.setVisibility(0);
                Drawable drawable = A01.A00;
                constrainedImageView.setImageDrawable(drawable);
                constrainedImageView.setContentDescription(A01.A02);
                c210949Ur.A00 = new A9N(userSession, c210949Ur, interfaceC186078Nb, c148276lx, valueOf);
                Object drawable2 = constrainedImageView.getDrawable();
                if (!C14360o3.A0K(drawable2, drawable)) {
                    if (drawable2 instanceof C5RP) {
                        ((C5RP) drawable2).AHq();
                    } else if (drawable2 instanceof C9S2) {
                        C9S2 c9s2 = (C9S2) drawable2;
                        if (c9s2.A00) {
                            c9s2.A00 = false;
                        }
                    } else if (drawable2 instanceof C9S4) {
                        C9S4 c9s4 = (C9S4) drawable2;
                        if (c9s4.A00) {
                            c9s4.A00 = false;
                        }
                    } else if (drawable2 instanceof C68000V5s) {
                        C68000V5s c68000V5s = (C68000V5s) drawable2;
                        if (c68000V5s.A00) {
                            c68000V5s.A00 = false;
                        }
                    } else if (drawable2 instanceof C221499qE) {
                        ((C221499qE) drawable2).A00 = false;
                    } else if (drawable2 instanceof C9S9) {
                        ((C9S9) drawable2).A00 = false;
                    }
                }
                int ordinal = c148276lx.A00().ordinal();
                if (ordinal != 104 && ordinal != 37 && ordinal != 65) {
                    if (ordinal != 38 && ordinal != 64) {
                        constrainedImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        constrainedImageView.A01 = null;
                    } else {
                        constrainedImageView.setImageMatrix(null);
                        constrainedImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        constrainedImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        constrainedImageView.A01 = null;
                    }
                } else {
                    Drawable drawable3 = constrainedImageView.getDrawable();
                    if ((drawable3 instanceof C5RP) && (c5rp = (C5RP) drawable3) != null && c5rp.isLoading()) {
                        constrainedImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        constrainedImageView.A01 = null;
                        C14360o3.A0C(drawable3, "null cannot be cast to non-null type com.instagram.common.ui.drawables.LoadingDrawable");
                        c5rp.A9I(new C23674Ae9(drawable3, c5rp, c210949Ur, c148276lx));
                    } else {
                        constrainedImageView.setScaleType(ImageView.ScaleType.MATRIX);
                        constrainedImageView.A01 = new C23690AeP(drawable3, c210949Ur, c148276lx);
                    }
                }
                new C66049Tym(constrainedImageView, new B61(6, c148276lx, c447324d), AbstractC209779Pn.A00(userSession)).A00();
                AnonymousClass229.A01(userSession).A1k(valueOf, c148276lx.A0Z, AHR.A02(c148276lx, false), AHR.A00(c148276lx));
            } else {
                RectF rectF2 = AbstractC23078AFk.A01;
                C14360o3.A0B(c210949Ur, 0);
                c210949Ur.A02.A02();
                c210949Ur.A00 = null;
                c210949Ur.A03.setVisibility(4);
            }
        }
        C0f9.A0A(518447040, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(855837473);
        C14360o3.A0B(viewGroup, 1);
        float f = this.A00;
        UserSession userSession = this.A01;
        C14360o3.A0B(userSession, 2);
        Context context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_horizontal_container, viewGroup, false);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(4));
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        C14360o3.A0A(context);
        C14360o3.A0B(context, 0);
        int dimensionPixelSize = (int) (context.getResources().getDimensionPixelSize(R.dimen.achievements_only_you_top_margin) * AbstractC172687md.A00(userSession));
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        viewGroup2.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        C22871A6r c22871A6r = new C22871A6r(viewGroup2);
        int i2 = 0;
        while (true) {
            boolean z = true;
            do {
                RectF rectF = AbstractC23078AFk.A01;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(context.getResources().getDimensionPixelSize(R.dimen.ad_stories_more_info_footer_width), -2, 1.0f);
                ConstrainedImageView constrainedImageView = new ConstrainedImageView(context);
                if (z) {
                    layoutParams.setMarginEnd(context.getResources().getDimensionPixelSize(R.dimen.asset_picker_cell_margin));
                }
                constrainedImageView.setLayoutParams(layoutParams);
                constrainedImageView.A00 = f;
                constrainedImageView.setFocusable(true);
                constrainedImageView.setTag(new C210949Ur(constrainedImageView));
                c22871A6r.A01.add(constrainedImageView);
                viewGroup2.addView(constrainedImageView);
                i2++;
                if (i2 < 4) {
                    z = false;
                } else {
                    viewGroup2.setTag(c22871A6r);
                    C0f9.A0A(1366202751, A03);
                    return viewGroup2;
                }
            } while (i2 >= 3);
        }
    }
}
