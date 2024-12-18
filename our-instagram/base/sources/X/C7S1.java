package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7S1, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7S1 implements C7QD {
    public Drawable A00;
    public LayerDrawable A01;
    public LinearLayout A02;
    public LinearLayout A03;
    public LinearLayout A04;
    public LinearLayout A05;
    public TextView A06;
    public C7RB A07;
    public C7AS A08;
    public AnonymousClass441 A09;
    public final C57012jc A0A;
    public final List A0B;

    public void A01() {
        C7S0 c7s0 = (C7S0) this;
        InterfaceC165337aM interfaceC165337aM = c7s0.A01;
        if (!((InterfaceC165507ad) interfaceC165337aM).CQu()) {
            ((InterfaceC165297aI) interfaceC165337aM).DDJ(c7s0.A00, true);
        }
    }

    public boolean A06(C7AS c7as) {
        C7S0 c7s0 = (C7S0) this;
        C14360o3.A0B(c7as, 0);
        MessageIdentifier messageIdentifier = c7s0.A00;
        boolean z = true;
        if (messageIdentifier == null || !messageIdentifier.equals(c7as.A0A)) {
            z = false;
        }
        c7s0.A00 = c7as.A0A;
        return z;
    }

    public final LinearLayout A00() {
        LinearLayout linearLayout = this.A04;
        if (linearLayout != null) {
            return linearLayout;
        }
        C14360o3.A0F("reactionsMessagePill");
        throw C00O.createAndThrow();
    }

    public final void A02() {
        List<View> list = this.A0B;
        for (View view : list) {
            C14360o3.A0B(view, 0);
            AbstractC125325le A01 = AbstractC125325le.A01(view, 1);
            C14360o3.A07(A01);
            if (A01.A0W()) {
                A01.A0G();
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationY(0.0f);
            }
        }
        if (this.A0A.A00 != null) {
            A00().setOnClickListener(null);
        }
        list.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        if (r8 != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
    
        if (r17.A0A.A00 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
    
        r0 = r17.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009a, code lost:
    
        if (r0 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009c, code lost:
    
        r3 = r0.getChildCount();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a0, code lost:
    
        if (r14 >= r3) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a2, code lost:
    
        r0 = r17.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a4, code lost:
    
        if (r0 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a6, code lost:
    
        r0.getChildAt(r14).setVisibility(8);
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r8 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(X.InterfaceC11380iw r18, final X.C7AS r19) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7S1.A03(X.0iw, X.7AS):void");
    }

    public final void A04(AnonymousClass441 anonymousClass441, C7AS c7as) {
        if (this instanceof C7S0) {
            ((C7XX) ((C7S0) this).A01).EnH(null, c7as.A0A, anonymousClass441.A02);
        }
    }

    public void A05(C2EY c2ey, MessageIdentifier messageIdentifier, String str, long j, boolean z) {
        ((InterfaceC165347aN) ((C7S0) this).A01).EkI(c2ey, messageIdentifier, "quick_emoji_tray", j, true);
    }

    @Override // X.C7QD
    public final View BKF() {
        C57012jc c57012jc = this.A0A;
        if (c57012jc.A00 != null) {
            View A01 = c57012jc.A01();
            C14360o3.A07(A01);
            return A01;
        }
        ViewStub viewStub = c57012jc.A01;
        if (viewStub != null) {
            return viewStub;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C7S1(C57012jc c57012jc) {
        this.A0A = c57012jc;
        c57012jc.A02 = new InterfaceC69513Al() { // from class: X.7S2
            @Override // X.InterfaceC69513Al
            public final void DLu(View view) {
                Drawable findDrawableByLayerId;
                C14360o3.A0B(view, 0);
                C7S1 c7s1 = C7S1.this;
                LinearLayout linearLayout = (LinearLayout) view.requireViewById(R.id.message_reactions_pill_container);
                C14360o3.A0B(linearLayout, 0);
                c7s1.A04 = linearLayout;
                Drawable background = c7s1.A00().getBackground();
                if (background != null) {
                    LayerDrawable layerDrawable = (LayerDrawable) background;
                    c7s1.A01 = layerDrawable;
                    if (layerDrawable != null && (findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.message_reactions_pill_shadow_layer)) != null) {
                        c7s1.A00 = findDrawableByLayerId;
                        Context context = c7s1.A00().getContext();
                        if (context != null) {
                            LayerDrawable layerDrawable2 = c7s1.A01;
                            if (layerDrawable2 != null) {
                                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.message_reactions_pill_background_layer);
                                if (findDrawableByLayerId2 != null) {
                                    findDrawableByLayerId2.setColorFilter(C3DY.A00(AbstractC53242c7.A0F(context, R.attr.reactionsMessagePillBackgroundColor)));
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        LinearLayout linearLayout2 = (LinearLayout) view.requireViewById(R.id.reactions);
                        C14360o3.A0B(linearLayout2, 0);
                        c7s1.A03 = linearLayout2;
                        LinearLayout linearLayout3 = (LinearLayout) view.requireViewById(R.id.reactors);
                        C14360o3.A0B(linearLayout3, 0);
                        c7s1.A05 = linearLayout3;
                        TextView textView = (TextView) view.requireViewById(R.id.reactors_number);
                        C14360o3.A0B(textView, 0);
                        c7s1.A06 = textView;
                        LinearLayout linearLayout4 = (LinearLayout) view.requireViewById(R.id.reaction_add);
                        C14360o3.A0B(linearLayout4, 0);
                        c7s1.A02 = linearLayout4;
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
        };
        this.A0B = new ArrayList();
    }
}
