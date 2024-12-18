package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextSwitcher;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.4Ce, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C92474Ce {
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC92464Cd A02;
    public final C92494Cg A03;
    public final InterfaceC60442pS A04;
    public final boolean A05;

    public C92474Ce(Context context, UserSession userSession, InterfaceC92464Cd interfaceC92464Cd, InterfaceC60442pS interfaceC60442pS, boolean z) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
        this.A04 = interfaceC60442pS;
        this.A05 = z;
        this.A02 = interfaceC92464Cd;
        this.A03 = AbstractC92484Cf.A00(userSession);
    }

    public final View A00(Context context, ViewGroup viewGroup, final UserSession userSession, InterfaceC76813cT interfaceC76813cT) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        View inflate = LayoutInflater.from(context).inflate(R.layout.row_feed_cta, viewGroup, false);
        InterfaceC60442pS interfaceC60442pS = this.A04;
        C14360o3.A0A(inflate);
        final C81373k7 A01 = A01(context, inflate, viewGroup, userSession, interfaceC76813cT, interfaceC60442pS);
        inflate.setTag(A01);
        A01.A0J.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.4Cl
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
            
                if (r5.A0A == false) goto L8;
             */
            @Override // android.view.View.OnAttachStateChangeListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onViewAttachedToWindow(android.view.View r7) {
                /*
                    r6 = this;
                    X.3k7 r5 = r2
                    X.3Zb r4 = r5.A09
                    long r0 = r5.A00
                    java.lang.Long r3 = java.lang.Long.valueOf(r0)
                    com.instagram.common.session.UserSession r2 = r1
                    boolean r0 = r5.A0B
                    if (r0 != 0) goto L19
                    boolean r0 = r5.A0C
                    if (r0 == 0) goto L19
                    boolean r1 = r5.A0A
                    r0 = 1
                    if (r1 != 0) goto L1a
                L19:
                    r0 = 0
                L1a:
                    X.AbstractC115685Le.A00(r2, r4, r3, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.ViewOnAttachStateChangeListenerC92544Cl.onViewAttachedToWindow(android.view.View):void");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                C81373k7 c81373k7 = A01;
                if (c81373k7.A0E) {
                    C123625ib A00 = AbstractC123605iZ.A00(userSession);
                    C75113Zb c75113Zb = c81373k7.A09;
                    if (c75113Zb != null) {
                        A00.A01(c75113Zb);
                        C115725Li A002 = AbstractC115715Lh.A00();
                        C75113Zb c75113Zb2 = c81373k7.A09;
                        if (c75113Zb2 != null) {
                            A002.A00(c75113Zb2);
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (c81373k7.A0D) {
                    UserSession userSession2 = userSession;
                    C115645La c115645La = (C115645La) userSession2.A01(C115645La.class, new J7S(userSession2, 29));
                    C75113Zb c75113Zb3 = c81373k7.A09;
                    if (c75113Zb3 != null) {
                        c115645La.A00(c75113Zb3);
                    }
                }
            }
        });
        return inflate;
    }

    public final C81373k7 A01(Context context, View view, ViewGroup viewGroup, UserSession userSession, InterfaceC76813cT interfaceC76813cT, InterfaceC60442pS interfaceC60442pS) {
        MediaFrameLayout mediaFrameLayout;
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(view, 3);
        if (viewGroup != null) {
            mediaFrameLayout = (MediaFrameLayout) viewGroup.findViewById(R.id.collection_main_media_group);
        } else {
            mediaFrameLayout = null;
        }
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        InterfaceC92464Cd interfaceC92464Cd = this.A02;
        View requireViewById = view.requireViewById(R.id.row_feed_cta);
        C14360o3.A07(requireViewById);
        View requireViewById2 = view.requireViewById(R.id.row_feed_cta_overlay);
        C14360o3.A07(requireViewById2);
        View requireViewById3 = view.requireViewById(R.id.cta_text);
        C14360o3.A07(requireViewById3);
        View requireViewById4 = view.requireViewById(R.id.cta_text_2_line_alternate);
        C14360o3.A07(requireViewById4);
        View requireViewById5 = view.requireViewById(R.id.cta_text_wa_icon);
        C14360o3.A07(requireViewById5);
        View requireViewById6 = view.requireViewById(R.id.cta_motion_text_switcher);
        C14360o3.A07(requireViewById6);
        TextSwitcher textSwitcher = (TextSwitcher) requireViewById6;
        View requireViewById7 = view.requireViewById(R.id.link_secondary_texts);
        C14360o3.A07(requireViewById7);
        View requireViewById8 = view.requireViewById(R.id.link_secondary_texts_2_line_alternate);
        C14360o3.A07(requireViewById8);
        C57012jc c57012jc = new C57012jc((ViewStub) view.requireViewById(R.id.link_texts_divider_stub));
        View requireViewById9 = view.requireViewById(R.id.cta_metadata);
        C14360o3.A07(requireViewById9);
        TextView textView = (TextView) requireViewById9;
        View requireViewById10 = view.requireViewById(R.id.cta_chevron);
        C14360o3.A07(requireViewById10);
        View requireViewById11 = view.requireViewById(R.id.cta_spinner);
        C14360o3.A07(requireViewById11);
        View requireViewById12 = view.requireViewById(R.id.cta_delete);
        C14360o3.A07(requireViewById12);
        IgSimpleImageView igSimpleImageView = (IgSimpleImageView) requireViewById12;
        View requireViewById13 = view.requireViewById(R.id.divider_view);
        C14360o3.A07(requireViewById13);
        View requireViewById14 = view.requireViewById(R.id.leftaccessory);
        C14360o3.A07(requireViewById14);
        IgSimpleImageView igSimpleImageView2 = (IgSimpleImageView) requireViewById14;
        View requireViewById15 = view.requireViewById(R.id.rightaccessory);
        C14360o3.A07(requireViewById15);
        IgSimpleImageView igSimpleImageView3 = (IgSimpleImageView) requireViewById15;
        C908843f c908843f = new C908843f(view);
        return new C81373k7(context, view, requireViewById2, requireViewById13, (ViewGroup) requireViewById, textSwitcher, (TextView) requireViewById3, (TextView) requireViewById4, (TextView) requireViewById5, textView, userSession, igSimpleImageView, igSimpleImageView2, igSimpleImageView3, (IgTextView) requireViewById7, (IgTextView) requireViewById8, (ColorFilterAlphaImageView) requireViewById10, c57012jc, interfaceC76813cT, interfaceC92464Cd, this.A03, interfaceC60442pS, c908843f, mediaFrameLayout, (SpinnerImageView) requireViewById11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x01aa, code lost:
    
        if (r33.A01(r8, r34) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01d5, code lost:
    
        if (r33.A01(r8, r34) != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.C5LT r32, X.C81373k7 r33, X.C75113Zb r34) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92474Ce.A02(X.5LT, X.3k7, X.3Zb):void");
    }
}
