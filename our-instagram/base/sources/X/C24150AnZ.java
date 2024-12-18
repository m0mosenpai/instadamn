package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.Iterator;

/* renamed from: X.AnZ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24150AnZ implements InterfaceC1829489p {
    public C9S3 A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final Context A05;
    public final C55942hf A06;
    public final InterfaceC186218Np A07;
    public final InteractiveDrawableContainer A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final float A0G;

    public C24150AnZ(View view, AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC186218Np interfaceC186218Np, InteractiveDrawableContainer interactiveDrawableContainer) {
        this.A08 = interactiveDrawableContainer;
        this.A07 = interfaceC186218Np;
        Context requireContext = abstractC59962oe.requireContext();
        this.A05 = requireContext;
        B61 b61 = new B61(32, userSession, this);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new B8R(new B8R(abstractC59962oe, 9), 10));
        this.A0F = new C60842q8(new B8R(A00, 11), b61, new B61(31, null, A00), new C0YZ(C9U2.class));
        this.A0D = B8R.A01(view, 7);
        this.A0B = B8R.A01(this, 5);
        this.A0C = B8R.A01(this, 6);
        this.A0E = B8R.A01(this, 8);
        this.A09 = B8R.A01(this, 3);
        this.A0A = B8R.A01(this, 4);
        this.A06 = C55942hf.A03(6.0d, 40.0d);
        this.A04 = AbstractC167017dG.A09(requireContext);
        this.A03 = AbstractC167017dG.A06(requireContext);
        this.A01 = AbstractC166987dD.A04(requireContext.getResources(), R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        this.A02 = AbstractC166997dE.A04(requireContext, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        this.A0G = AbstractC167017dG.A03(requireContext);
        C25024B5f.A02(this, AbstractC57302k5.A00(abstractC59962oe.getLifecycle()), 11);
        AbstractC18560vj.A03(AbstractC57302k5.A00(abstractC59962oe.getLifecycle()), new C15340po(new B5g(this, null, 36), ((C9U2) this.A0F.getValue()).A09));
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cud(Drawable drawable) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cuq() {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cur() {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cvp(Drawable drawable, int i) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DCJ(Drawable drawable, int i) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DCK(float f, float f2) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DCL(Drawable drawable) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DQa(Drawable drawable, int i, float f, float f2) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DQk() {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Dep(Drawable drawable, int i, boolean z) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Dmk(Drawable drawable, int i, float f, float f2) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Dmm(Drawable drawable, float f, float f2, float f3, float f4, int i) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DuD() {
    }

    public static final void A00(Drawable drawable, C24150AnZ c24150AnZ, boolean z) {
        int i;
        if (z) {
            i = AbstractC53242c7.A0H(c24150AnZ.A05, R.attr.igds_color_icon_on_white);
        } else {
            i = R.color.audio_bar_action_color_enabled;
        }
        drawable.setColorFilter(AbstractC46530KiV.A00(C05F.A0j, c24150AnZ.A05.getResources().getColor(i, null)));
    }

    public static final void A01(View view, C24150AnZ c24150AnZ, boolean z) {
        int i;
        GradientDrawable gradientDrawable = new GradientDrawable();
        float f = c24150AnZ.A02;
        int i2 = (int) f;
        gradientDrawable.setSize(i2, i2);
        gradientDrawable.setShape(0);
        Context context = view.getContext();
        if (z) {
            i = AbstractC53242c7.A0H(context, R.attr.igds_color_primary_button_on_media);
        } else {
            i = R.color.igds_secondary_button_on_media_panavision_updated;
        }
        gradientDrawable.setColor(context.getColor(i));
        gradientDrawable.setCornerRadius(AbstractC13880nE.A00(context, f));
        view.setBackground(gradientDrawable);
    }

    public static final void A02(C24150AnZ c24150AnZ) {
        if (Build.VERSION.SDK_INT >= 30) {
            AbstractC166987dD.A0d(c24150AnZ.A0D).performHapticFeedback(17);
        }
    }

    public static final void A03(C24150AnZ c24150AnZ) {
        int i = Build.VERSION.SDK_INT;
        View A0d = AbstractC166987dD.A0d(c24150AnZ.A0D);
        int i2 = 1;
        if (i >= 30) {
            i2 = 16;
        }
        A0d.performHapticFeedback(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0091, code lost:
    
        r3 = r2.getValue();
        r8 = r1.A03;
        r6 = r0.A00;
        r7 = r0.A01;
        r9 = r0.A03;
        r10 = r0.A07;
        r12 = r0.A04;
        r13 = r0.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ac, code lost:
    
        if (r2.AIi(r3, new X.C218449lG(r6, r7, r8, r9, r10, r11, r12, r13)) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ae, code lost:
    
        X.C9U2.A00(new X.C218479lJ(r6, !r13), r1);
        r6 = X.AnonymousClass229.A01(r1.A07);
        r5 = ((X.C22F) r6).A04.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c2, code lost:
    
        if (r13 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c4, code lost:
    
        r3 = "LAYER_UNLOCK";
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c6, code lost:
    
        r6.A1R(r5, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0108, code lost:
    
        r3 = "LAYER_LOCK";
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c9, code lost:
    
        r12 = r0.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00cb, code lost:
    
        if (r12 != true) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cd, code lost:
    
        r3 = r2.getValue();
        r8 = r1.A03;
        r6 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e6, code lost:
    
        if (r2.AIi(r3, new X.C218449lG(r6, r0.A01, r8, r0.A03, r0.A07, r11, r12, r0.A06)) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e8, code lost:
    
        r4 = X.AnonymousClass229.A01(r1.A07);
        r4.A1R(((X.C22F) r4).A04.A0C, "LAYER_COLOR");
        X.C9U2.A00(new X.C218469lI(r6), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x008f, code lost:
    
        if (r11 == true) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05() {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24150AnZ.A05():void");
    }

    public final void A06(float f, float f2, int i, boolean z) {
        int i2;
        int i3;
        InteractiveDrawableContainer interactiveDrawableContainer = this.A08;
        int size = interactiveDrawableContainer.getAllDrawables().size();
        BEd A0N = interactiveDrawableContainer.A0N(i);
        if (A0N != null) {
            i2 = 0;
            Iterator it = InteractiveDrawableContainer.A03(interactiveDrawableContainer, ((C9LJ) A0N).A08).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                int i4 = i2 + 1;
                if (i2 < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                if (next == A0N) {
                    break;
                } else {
                    i2 = i4;
                }
            }
        }
        i2 = -1;
        int A0H = interactiveDrawableContainer.A0H(i);
        boolean z2 = !interactiveDrawableContainer.A0z(i);
        boolean z3 = !interactiveDrawableContainer.A0y(i);
        BEd A0N2 = interactiveDrawableContainer.A0N(i);
        boolean z4 = true;
        if (A0N2 == null || !((C9LJ) A0N2).A0M) {
            z4 = false;
        }
        Context context = this.A05;
        interactiveDrawableContainer.setBackgroundColor(context.getColor(R.color.black_60_transparent));
        interactiveDrawableContainer.A0v(this);
        interactiveDrawableContainer.A0Y();
        AbstractC166987dD.A0d(this.A0A).setVisibility(0);
        AbstractC166987dD.A0d(this.A0D).setVisibility(0);
        AbstractC167017dG.A1W(this.A0E, 0);
        if (z) {
            AbstractC167017dG.A1W(this.A09, 0);
        }
        InterfaceC09390do interfaceC09390do = this.A0C;
        AbstractC167007dF.A0L(interfaceC09390do).setVisibility(0);
        AbstractC167007dF.A0L(interfaceC09390do).setTranslationX(this.A02 + this.A03);
        AbstractC125325le A01 = AbstractC125325le.A01(AbstractC167007dF.A0L(interfaceC09390do), 0);
        A01.A0G();
        C55942hf c55942hf = this.A06;
        AbstractC125325le A0F = A01.A0E(c55942hf).A0F(false);
        A0F.A0J(0.0f);
        A0F.A0H();
        this.A00 = new C9S3(context, size, A0H);
        InterfaceC09390do interfaceC09390do2 = this.A0B;
        ((ImageView) AbstractC166987dD.A17(interfaceC09390do2)).setImageDrawable(this.A00);
        AbstractC167007dF.A0L(interfaceC09390do2).setTranslationX(-(this.A04 + r13));
        AbstractC167017dG.A1W(interfaceC09390do2, 0);
        AbstractC125325le A012 = AbstractC125325le.A01(AbstractC167007dF.A0L(interfaceC09390do2), 0);
        A012.A0G();
        AbstractC125325le A0F2 = A012.A0E(c55942hf).A0F(false);
        A0F2.A0J(0.0f);
        A0F2.A0H();
        interactiveDrawableContainer.A0G = true;
        interactiveDrawableContainer.A0H = true;
        C9U2 c9u2 = (C9U2) this.A0F.getValue();
        BEd A0N3 = interactiveDrawableContainer.A0N(i);
        if (A0N3 != null) {
            i3 = InteractiveDrawableContainer.A03(interactiveDrawableContainer, ((C9LJ) A0N3).A08).size();
        } else {
            i3 = 0;
        }
        c9u2.A04 = z2;
        c9u2.A05 = z3;
        c9u2.A02 = i3 - 1;
        c9u2.A03 = i2;
        float[] fArr = {c9u2.A06, (f2 - f) / (i3 - i2), f / i2};
        int i5 = 1;
        float f3 = fArr[0];
        do {
            f3 = Math.min(f3, fArr[i5]);
            i5++;
        } while (i5 < 3);
        c9u2.A01 = f3;
        c9u2.A0A.Egh(new C218449lG(i, A0H, i2, size, false, false, false, z4));
        UserSession userSession = c9u2.A07;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        AbstractC167007dF.A1L(A00, A00.A20, C23031Ai.A8c, 458, true);
        C22C A013 = AnonymousClass229.A01(userSession);
        A013.A1R(((C22F) A013).A04.A0C, "LAYER_SELECT");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0066, code lost:
    
        if ((r5 instanceof X.C218449lG) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0068, code lost:
    
        r5 = (X.C218449lG) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006a, code lost:
    
        if (r5 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006c, code lost:
    
        r4 = r5.A02;
        r1 = "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.layering.viewmodel.LayeringToolViewModel.UiState.LayeringToolOpen";
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0072, code lost:
    
        if (r4 < r0.A02) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        if (r0.A04 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        if (r5.A07 != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        r5 = X.AnonymousClass229.A01(r0.A07);
        r4 = ((X.C22F) r5).A04.A0C;
        r3 = "LAYER_UP_FAIL";
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
    
        r5.A1R(r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
    
        r4 = r2.getValue();
        r3 = (X.AbstractC223789uN) r4;
        X.C14360o3.A0C(r3, r1);
        r3 = (X.C218449lG) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00af, code lost:
    
        if (r2.AIi(r4, new X.C218449lG(r3.A00, r3.A01, r3.A02, r3.A03, true, r3.A05, r3.A04, r3.A06)) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b1, code lost:
    
        r1 = X.C218489lK.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b3, code lost:
    
        X.C9U2.A00(r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x002a, code lost:
    
        if ((r2.getValue() instanceof X.C218449lG) != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x011a, code lost:
    
        r6 = r2.getValue();
        r7 = (X.AbstractC223789uN) r6;
        X.C14360o3.A0C(r7, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.layering.viewmodel.LayeringToolViewModel.UiState.LayeringToolOpen");
        r7 = (X.C218449lG) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0140, code lost:
    
        if (r2.AIi(r6, new X.C218449lG(r7.A00, r5.A01 + 1, r4 + 1, r7.A03, false, r7.A05, r7.A04, r7.A06)) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0142, code lost:
    
        r3 = X.AnonymousClass229.A01(r0.A07);
        r2 = ((X.C22F) r3).A04.A0C;
        r1 = "LAYER_UP";
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x014e, code lost:
    
        r3.A1R(r2, r1);
        r1 = X.C218499lL.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x002c, code lost:
    
        r4 = r2.getValue();
        r3 = (X.AbstractC223789uN) r4;
        X.C14360o3.A0C(r3, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.layering.viewmodel.LayeringToolViewModel.UiState.LayeringToolOpen");
        r3 = (X.C218449lG) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ba, code lost:
    
        if ((-r5) < r4) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bc, code lost:
    
        r0.A00 = 0.0f;
        r4 = r2.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
    
        if ((r4 instanceof X.C218449lG) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c6, code lost:
    
        r4 = (X.C218449lG) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c8, code lost:
    
        if (r4 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ca, code lost:
    
        r5 = r4.A02;
        r1 = "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.layering.viewmodel.LayeringToolViewModel.UiState.LayeringToolOpen";
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
    
        if (r5 > 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d2, code lost:
    
        if (r0.A05 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x004f, code lost:
    
        if (r2.AIi(r4, new X.C218449lG(r3.A00, r3.A01, r3.A02, r3.A03, r3.A07, r11, r12, r3.A06)) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d6, code lost:
    
        if (r4.A07 != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d8, code lost:
    
        r5 = X.AnonymousClass229.A01(r0.A07);
        r4 = ((X.C22F) r5).A04.A0C;
        r3 = "LAYER_DOWN_FAIL";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e5, code lost:
    
        r6 = r2.getValue();
        r7 = (X.AbstractC223789uN) r6;
        X.C14360o3.A0C(r7, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.layering.viewmodel.LayeringToolViewModel.UiState.LayeringToolOpen");
        r7 = (X.C218449lG) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010b, code lost:
    
        if (r2.AIi(r6, new X.C218449lG(r7.A00, r4.A01 - 1, r5 - 1, r7.A03, false, r7.A05, r7.A04, r7.A06)) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010d, code lost:
    
        r3 = X.AnonymousClass229.A01(r0.A07);
        r2 = ((X.C22F) r3).A04.A0C;
        r1 = "LAYER_DOWN";
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0051, code lost:
    
        r5 = r0.A00 + r19;
        r0.A00 = r5;
        r4 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005c, code lost:
    
        if (r5 < r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005e, code lost:
    
        r0.A00 = 0.0f;
        r5 = r2.getValue();
     */
    @Override // X.InterfaceC1829489p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Din(android.graphics.drawable.Drawable r17, float r18, float r19, float r20, float r21) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24150AnZ.Din(android.graphics.drawable.Drawable, float, float, float, float):void");
    }

    private final boolean A04(View view, float f, float f2) {
        if (view.getVisibility() == 8) {
            return false;
        }
        Rect A0U = AbstractC166987dD.A0U();
        int[] iArr = new int[2];
        view.getDrawingRect(A0U);
        view.getLocationOnScreen(iArr);
        A0U.offset(iArr[0], iArr[1]);
        int i = (int) (-this.A0G);
        A0U.inset(i, i);
        return A0U.contains((int) f, (int) f2);
    }
}
