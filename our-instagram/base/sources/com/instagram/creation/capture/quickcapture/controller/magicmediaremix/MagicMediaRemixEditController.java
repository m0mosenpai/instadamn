package com.instagram.creation.capture.quickcapture.controller.magicmediaremix;

import X.AbstractC09440dt;
import X.AbstractC16960so;
import X.AbstractC23641Du;
import X.AbstractC46790Kml;
import X.AbstractC66422zJ;
import X.AnonymousClass191;
import X.B8T;
import X.C05F;
import X.C07X;
import X.C07Y;
import X.C14360o3;
import X.C183688Ct;
import X.C194808jg;
import X.C220819p5;
import X.C221509qF;
import X.C25023B5e;
import X.C25030B6d;
import X.C43901JbB;
import X.C66362zD;
import X.C66392zG;
import X.C81J;
import X.C89G;
import X.C8D0;
import X.C8DK;
import X.C8FC;
import X.C8FD;
import X.C8LZ;
import X.C8NW;
import X.C8Q5;
import X.C8RZ;
import X.InterfaceC09390do;
import X.InterfaceC23621Ds;
import X.InterfaceC25211BDj;
import X.KZD;
import X.RunnableC24628AvO;
import android.app.Activity;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class MagicMediaRemixEditController {
    public int A00;
    public final int A01;
    public final Activity A02;
    public final Context A03;
    public final View A04;
    public final C07X A05;
    public final C66362zD A06;
    public final UserSession A07;
    public final C8RZ A08;
    public final C8LZ A09;
    public final C183688Ct A0A;
    public final C81J A0B;
    public final C8DK A0C;
    public final KZD A0D;
    public final C43901JbB A0E;
    public final List A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final View A0I;
    public final View A0J;
    public final C8DK A0K;

    public MagicMediaRemixEditController(Activity activity, Context context, View view, View view2, C07X c07x, UserSession userSession, C8RZ c8rz, C8LZ c8lz, C183688Ct c183688Ct, C81J c81j, C8DK c8dk, C8DK c8dk2, C43901JbB c43901JbB) {
        C14360o3.A0B(view, 1);
        C14360o3.A0B(view2, 2);
        C14360o3.A0B(context, 3);
        C14360o3.A0B(activity, 6);
        C14360o3.A0B(userSession, 7);
        C14360o3.A0B(c43901JbB, 12);
        this.A03 = context;
        this.A0B = c81j;
        this.A0C = c8dk;
        this.A02 = activity;
        this.A07 = userSession;
        this.A0A = c183688Ct;
        this.A09 = c8lz;
        this.A08 = c8rz;
        this.A0K = c8dk2;
        this.A0E = c43901JbB;
        this.A05 = c07x;
        this.A0D = AbstractC46790Kml.A00(userSession);
        View requireViewById = view2.requireViewById(R.id.post_capture_texture_view_container);
        C14360o3.A07(requireViewById);
        this.A04 = requireViewById;
        View requireViewById2 = view.requireViewById(R.id.post_capture_interactive_contents_container);
        C14360o3.A07(requireViewById2);
        this.A0J = requireViewById2;
        View requireViewById3 = requireViewById.requireViewById(R.id.camera_photo_texture_view);
        C14360o3.A07(requireViewById3);
        this.A0I = requireViewById3;
        C66392zG A00 = C66362zD.A00(view2.getContext());
        A00.A01(new AbstractC66422zJ(this) { // from class: X.9gs
            public final MagicMediaRemixEditController A00;

            @Override // X.AbstractC66422zJ
            public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
                AbstractC167007dF.A1K(viewGroup, layoutInflater);
                View inflate = layoutInflater.inflate(R.layout.magic_media_remix_media_selector_item_layout, viewGroup, false);
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                Context A0L = AbstractC166997dE.A0L(viewGroup);
                C14360o3.A0A(inflate);
                return new C210929Up(A0L, inflate, this.A00);
            }

            @Override // X.AbstractC66422zJ
            public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
                int A04;
                C23633AdS c23633AdS = (C23633AdS) interfaceC66482zP;
                C210929Up c210929Up = (C210929Up) c3oo;
                AbstractC167017dG.A1N(c23633AdS, c210929Up);
                int i = 0;
                RoundedCornerImageView roundedCornerImageView = c210929Up.A01;
                roundedCornerImageView.setImageBitmap(c23633AdS.A00);
                roundedCornerImageView.setVisibility(0);
                ViewOnClickListenerC23248ASj.A00(roundedCornerImageView, 17, c23633AdS, c210929Up);
                if (c23633AdS.A02) {
                    Context context2 = c210929Up.A00;
                    i = AbstractC167007dF.A09(context2, R.attr.igds_color_gradient_yellow);
                    roundedCornerImageView.setAlpha(1.0f);
                    A04 = AbstractC166997dE.A04(context2, R.dimen.feed_delayed_skip_toast_countdown_ring_width);
                } else {
                    roundedCornerImageView.setAlpha(0.3f);
                    A04 = AbstractC166997dE.A04(c210929Up.A00, R.dimen.abc_control_corner_material);
                }
                roundedCornerImageView.setStrokeWidth(A04);
                roundedCornerImageView.setStrokeColor(i);
            }

            @Override // X.AbstractC66422zJ
            public final Class modelClass() {
                return C23633AdS.class;
            }

            {
                this.A00 = this;
            }
        });
        this.A06 = A00.A00();
        this.A0G = AbstractC09440dt.A01(new B8T(this, 0));
        this.A0F = new ArrayList();
        this.A0H = AbstractC09440dt.A01(C25030B6d.A00);
        this.A01 = context.getResources().getDisplayMetrics().widthPixels;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004e -> B:11:0x002c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0075 -> B:10:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController r8, java.util.List r9, X.InterfaceC23621Ds r10) {
        /*
            r4 = 41
            boolean r0 = X.MAO.A02(r10, r4)
            if (r0 == 0) goto L86
            r3 = r10
            X.MAO r3 = (X.MAO) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L86
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r6 = r3.A03
            X.1JX r4 = X.C1JX.A02
            int r0 = r3.A00
            r2 = 1
            if (r0 == 0) goto L7c
            if (r0 != r2) goto L8c
            java.lang.Object r5 = r3.A02
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r8 = r3.A01
            X.AbstractC09560e7.A00(r6)
        L2a:
            android.graphics.drawable.Drawable r6 = (android.graphics.drawable.Drawable) r6
        L2c:
            int r7 = r6.getIntrinsicWidth()
            int r1 = r6.getIntrinsicHeight()
            r0 = 0
            r6.setBounds(r0, r0, r7, r1)
        L38:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L94
            java.lang.Object r0 = r5.next()
            X.BD4 r0 = (X.BD4) r0
            X.9LJ r0 = (X.C9LJ) r0
            android.graphics.drawable.Drawable r6 = r0.A0B
            boolean r0 = r6 instanceof X.InterfaceC25211BDj
            if (r0 == 0) goto L38
            boolean r0 = r6 instanceof X.C220819p5
            if (r0 == 0) goto L2c
            X.9p5 r6 = (X.C220819p5) r6
            r3.A01 = r8
            r3.A02 = r5
            r3.A00 = r2
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C89563yw.A01
            X.1Ds r0 = X.C1E2.A02(r3)
            X.3yw r1 = new X.3yw
            r1.<init>(r0)
            X.8xq r0 = r6.A00
            android.graphics.Bitmap r0 = r0.A01
            if (r0 != 0) goto L78
            X.Ae2 r0 = new X.Ae2
            r0.<init>(r6, r1)
            r6.A9I(r0)
        L71:
            java.lang.Object r6 = r1.A00()
            if (r6 != r4) goto L2a
            return r4
        L78:
            r1.resumeWith(r6)
            goto L71
        L7c:
            X.AbstractC09560e7.A00(r6)
            if (r9 == 0) goto L94
            java.util.Iterator r5 = r9.iterator()
            goto L38
        L86:
            X.MAO r3 = new X.MAO
            r3.<init>(r8, r10, r4)
            goto L16
        L8c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L94:
            X.0eB r4 = X.C0eB.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController.A00(com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController, java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A02(MagicMediaRemixEditController magicMediaRemixEditController, boolean z) {
        float dimensionPixelSize;
        float f;
        ViewOutlineProvider viewOutlineProvider;
        int height;
        float f2;
        Float valueOf;
        final float f3 = 0.5f;
        if (!z) {
            f3 = 2.0f;
        }
        View view = magicMediaRemixEditController.A0I;
        int width = (int) (view.getWidth() * f3);
        int height2 = (int) (view.getHeight() * f3);
        if (!z) {
            dimensionPixelSize = 0.0f;
            f = 0.0f;
        } else {
            dimensionPixelSize = magicMediaRemixEditController.A03.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
            f = (magicMediaRemixEditController.A01 - width) / 2.0f;
        }
        magicMediaRemixEditController.A01(view, f, dimensionPixelSize, width, height2);
        C183688Ct c183688Ct = magicMediaRemixEditController.A0A;
        String str = magicMediaRemixEditController.A0B.A2X;
        C8NW c8nw = (C8NW) c183688Ct.A1h.get();
        C14360o3.A0B(str, 1);
        boolean z2 = false;
        if (f3 >= 1.0f) {
            z2 = true;
        }
        final InteractiveDrawableContainer interactiveDrawableContainer = c8nw.A1l;
        int width2 = interactiveDrawableContainer.getWidth();
        Context context = c8nw.A0f;
        final float dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        float f4 = 0.0f;
        if (dimensionPixelSize2 > 0.0f) {
            viewOutlineProvider = new ViewOutlineProvider() { // from class: X.9TY
                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view2, Outline outline) {
                    if (view2 != null && outline != null) {
                        InteractiveDrawableContainer interactiveDrawableContainer2 = InteractiveDrawableContainer.this;
                        int left = interactiveDrawableContainer2.getLeft();
                        int top = interactiveDrawableContainer2.getTop();
                        float A07 = AbstractC166987dD.A07(view2);
                        float f5 = f3;
                        outline.setRoundRect(left, top, (int) (A07 * f5), (int) (AbstractC166987dD.A08(view2) * f5), dimensionPixelSize2);
                    }
                }
            };
        } else {
            viewOutlineProvider = null;
        }
        interactiveDrawableContainer.setOutlineProvider(viewOutlineProvider);
        boolean z3 = false;
        if (dimensionPixelSize2 > 0.0f) {
            z3 = true;
        }
        interactiveDrawableContainer.setClipToOutline(z3);
        float dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        if (z2) {
            dimensionPixelSize3 = 0.0f;
        } else {
            f4 = width2 / 4;
        }
        interactiveDrawableContainer.animate().translationY(dimensionPixelSize3).translationX(f4).setDuration(150L);
        int width3 = interactiveDrawableContainer.getWidth();
        if (z2) {
            height = interactiveDrawableContainer.getHeight();
        } else {
            width3 = (int) (width3 * f3);
            height = (int) (interactiveDrawableContainer.getHeight() * f3);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(interactiveDrawableContainer.A0T(C220819p5.class));
        arrayList.addAll(interactiveDrawableContainer.A0T(C194808jg.class));
        arrayList.addAll(interactiveDrawableContainer.A0T(C221509qF.class));
        interactiveDrawableContainer.A0Z();
        if (width3 != 0 && height != 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Drawable drawable = (Drawable) it.next();
                if (!(drawable instanceof InterfaceC25211BDj)) {
                    break;
                }
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                InterfaceC25211BDj interfaceC25211BDj = (InterfaceC25211BDj) drawable;
                double d = width3;
                double Btf = interfaceC25211BDj.Btf() * d;
                double d2 = height;
                double Btg = interfaceC25211BDj.Btg() * d2;
                if (f3 < 1.0f) {
                    valueOf = Float.valueOf(((float) (Btf - ((intrinsicWidth * f3) / (intrinsicWidth / d)))) + ((float) ((d / 2.0d) * (-1.0d))));
                    f2 = ((float) (Btg - ((intrinsicHeight * f3) / (intrinsicHeight / d2)))) + ((float) ((-1.0d) * (d2 / 2.0d)));
                } else {
                    f2 = (float) (Btg - (intrinsicHeight / 2));
                    valueOf = Float.valueOf((float) (Btf - (intrinsicWidth / 2)));
                }
                Float valueOf2 = Float.valueOf(f2);
                float floatValue = valueOf.floatValue();
                float floatValue2 = valueOf2.floatValue();
                boolean z4 = !(drawable instanceof C194808jg);
                interactiveDrawableContainer.A0J(drawable, new C8FC((C8D0) null, (C8FD) null, (C89G) null, C05F.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) new ArrayList(AbstractC16960so.A1Q(Float.valueOf(floatValue), Float.valueOf(floatValue2))), -1.0f, 1.0f, f3, -1.0f, -1.0f, z4 ? 1 : 0, true, false, z4, true, false, false, true, true, true, true, true, true, false, false), false, false, true);
            }
        }
        Iterator it2 = interactiveDrawableContainer.A0T(C221509qF.class).iterator();
        while (it2.hasNext()) {
            interactiveDrawableContainer.A0m((Drawable) it2.next(), f3);
        }
        ((C8Q5) c183688Ct.A1g.get()).EYd(z);
        magicMediaRemixEditController.A01(magicMediaRemixEditController.A0J, f, dimensionPixelSize, width, height2);
        if (!z) {
            AbstractC23641Du.A05(AnonymousClass191.A00, new C25023B5e(magicMediaRemixEditController, (InterfaceC23621Ds) null, 12), C07Y.A00(magicMediaRemixEditController.A05));
        }
    }

    private final void A01(View view, float f, float f2, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
        view.animate().translationY(f2).translationX(f).withEndAction(new RunnableC24628AvO(view, this)).setDuration(150L);
    }
}
