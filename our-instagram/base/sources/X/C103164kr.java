package X;

import android.content.Context;
import android.os.Handler;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.R;
import com.facebook.primitive.textinput.TextInputView;
import com.facebook.rendercore.text.RCTextView;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4kr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C103164kr {
    public static final C103164kr A00 = new Object();

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    public final void A02(C6FG c6fg, C102884kP c102884kP, C102884kP c102884kP2, Object obj) {
        Handler handler;
        Runnable runnable;
        int i;
        C1I2 c1i2;
        String str;
        Runnable runnable2;
        C9QP c9qp;
        BX7 bx7;
        C9QP c9qp2;
        int i2 = c102884kP.A05;
        if (AbstractC86593tX.A0l(i2)) {
            View view = (View) obj;
            switch (i2) {
                case 13313:
                    C131745xA c131745xA = (C131745xA) AnonymousClass634.A06(c6fg, c102884kP);
                    if (c131745xA != null) {
                        c131745xA.A02 = view.isFocused();
                        AbstractC010103p.A0B(view, null);
                        view.setImportantForAccessibility(c131745xA.A00.intValue());
                        view.setFocusable(c131745xA.A01);
                        AbstractC65825Tui.A00(c6fg, c102884kP2, c102884kP.A0O(45));
                        return;
                    }
                    return;
                case 13337:
                    C28585CjQ c28585CjQ = (C28585CjQ) AnonymousClass634.A06(c6fg, c102884kP);
                    if (c28585CjQ != null) {
                        c28585CjQ.A00 = null;
                        BX7 bx72 = (BX7) AnonymousClass634.A06(c6fg, c102884kP2);
                        if (bx72 != null) {
                            bx72.A05(c28585CjQ);
                            return;
                        }
                        return;
                    }
                    return;
                case 13383:
                    InterfaceC61352qx interfaceC61352qx = (InterfaceC61352qx) InterfaceC61352qx.class.cast(((SparseArray) c6fg.A00(R.id.bloks_ig_object_store_deprecated)).get(R.id.main_feed_scroll_listenable));
                    C40934IBh c40934IBh = (C40934IBh) AnonymousClass634.A06(c6fg, c102884kP);
                    if (interfaceC61352qx != null && c40934IBh != null && (c1i2 = c40934IBh.A00) != null) {
                        interfaceC61352qx.F9f(c1i2);
                        c40934IBh.A00 = null;
                        return;
                    }
                    return;
                case 13394:
                    C14360o3.A0B(view, 0);
                    if (AnonymousClass634.A06(c6fg, c102884kP) != null) {
                        C003501a c003501a = C131655x1.A00;
                        long j = c102884kP2.A04;
                        java.util.Set set = (java.util.Set) c003501a.A05(j);
                        if (set != null) {
                            set.remove(c102884kP);
                            if (set.isEmpty()) {
                                c003501a.A08(j);
                                C57112jm A0D = C6BQ.A0D(c6fg);
                                if (A0D != null) {
                                    A0D.A05(view, C59062n7.A07);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    throw new RuntimeException("Extension defines a controller but none was found");
                case 13538:
                    C14360o3.A0B(view, 0);
                    C65934Twf c65934Twf = (C65934Twf) AnonymousClass634.A06(c6fg, c102884kP);
                    if (c65934Twf != null) {
                        int i3 = c102884kP2.A04;
                        SparseArray sparseArray = c65934Twf.A01;
                        java.util.Set set2 = (java.util.Set) sparseArray.get(i3);
                        if (set2 != null) {
                            c65934Twf.A00.get(i3);
                            if (set2.size() == 1) {
                                C57112jm A0D2 = C6BQ.A0D(c6fg);
                                if (A0D2 != null) {
                                    C57212jw c57212jw = A0D2.A01;
                                    if (c57212jw != null && c57212jw.A02.A01) {
                                        RunnableC65948Twt runnableC65948Twt = new RunnableC65948Twt(view, c65934Twf, c102884kP, A0D2, set2, i3);
                                        LinkedHashMap linkedHashMap = A0D2.A03;
                                        synchronized (linkedHashMap) {
                                            linkedHashMap.put(Integer.valueOf(i3), runnableC65948Twt);
                                        }
                                        return;
                                    }
                                    A0D2.A05(view, C59062n7.A07);
                                }
                                set2.remove(c102884kP);
                                sparseArray.remove(i3);
                                return;
                            }
                            set2.remove(c102884kP);
                            return;
                        }
                        return;
                    }
                    throw new RuntimeException("Extension defines a controller but none was found");
                case 13565:
                case 13748:
                case 15909:
                case 16375:
                case 16493:
                case 16807:
                    return;
                case 13566:
                    i = R.id.testing_id_view_tag_key;
                    view.setTag(i, null);
                    return;
                case 13615:
                    CSR csr = (CSR) AnonymousClass634.A06(c6fg, c102884kP);
                    if (csr != null) {
                        TextWatcher textWatcher = csr.A02;
                        if (textWatcher != null) {
                            Object A06 = AnonymousClass634.A06(c6fg, c102884kP2);
                            if (A06 instanceof BX7) {
                                ((BX7) A06).A05(textWatcher);
                            } else {
                                if (A06 != null) {
                                    Class<?> cls = A06.getClass();
                                    Map map = C0YZ.A03;
                                    C14360o3.A0B(cls, 1);
                                    str = AnonymousClass001.A0R("Unrecognized controller type: ", AbstractC13230m9.A01(cls));
                                } else {
                                    str = "Missing text input controller";
                                }
                                AbstractC25241Le.A00(c6fg, AbstractC111324zv.A00(694), str, null);
                            }
                        }
                        csr.A03 = null;
                        csr.A04 = null;
                        return;
                    }
                    throw new RuntimeException("TextInputCurrencyFormatterExtensionBinder defines a controller but none was found");
                case 13627:
                    C42277Io1 c42277Io1 = (C42277Io1) AnonymousClass634.A06(c6fg, c102884kP);
                    c42277Io1.getClass();
                    C6BQ.A0J(c6fg, c42277Io1);
                    C41635IbQ c41635IbQ = c42277Io1.A03;
                    if (c41635IbQ != null) {
                        c41635IbQ.A01();
                        c42277Io1.A03 = null;
                    }
                    InterfaceC42271xH interfaceC42271xH = c42277Io1.A01;
                    if (interfaceC42271xH != null) {
                        AbstractC25651Mw.A00(C6BQ.A0A(c6fg)).A02(interfaceC42271xH, C36094FwU.class);
                        c42277Io1.A01 = null;
                        return;
                    }
                    return;
                case 13638:
                    AbstractC28038CXn.A01(view, c6fg, c102884kP);
                    return;
                case 13656:
                    C14360o3.A0B(view, 0);
                    runnable2 = (Runnable) view.getTag(R.id.render_lifecycle_extension_runnable);
                    if ((runnable2 instanceof C9QP) && (c9qp = (C9QP) runnable2) != null) {
                        c9qp.A00 = true;
                        return;
                    }
                    view.removeCallbacks(runnable2);
                    return;
                case 13688:
                    C6W1 c6w1 = (C6W1) AnonymousClass634.A06(c6fg, c102884kP);
                    if (c6w1 == null) {
                        AbstractC25241Le.A02("ViewTransformsExtensionBinderUtils", "Null controller while binding ViewTransformsExtension");
                        return;
                    }
                    c6w1.A0E = false;
                    view.getViewTreeObserver().removeOnPreDrawListener(c6w1.A0C);
                    c6w1.A0B = null;
                    view.setAlpha(1.0f);
                    view.setRotation(0.0f);
                    view.setRotationX(0.0f);
                    view.setRotationY(0.0f);
                    view.setCameraDistance(C6W3.A00(c6fg.A00, 1280.0f));
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                    if (c6w1.A0F) {
                        view.resetPivot();
                        return;
                    }
                    return;
                case 13712:
                    view.setOnTouchListener(null);
                    Object A062 = AnonymousClass634.A06(c6fg, c102884kP);
                    A062.getClass();
                    C51622Yk c51622Yk = ((C47257KuU) A062).A00;
                    if (c51622Yk != null) {
                        c51622Yk.dismiss();
                        return;
                    }
                    return;
                case 13713:
                    CSS css = (CSS) AnonymousClass634.A06(c6fg, c102884kP);
                    if (css != null) {
                        if (css.A02 != null && (bx7 = (BX7) AnonymousClass634.A06(c6fg, c102884kP2)) != null) {
                            TextWatcher textWatcher2 = css.A02;
                            if (textWatcher2 != null) {
                                bx7.A05(textWatcher2);
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        css.A03 = null;
                        css.A04 = null;
                        return;
                    }
                    throw new RuntimeException("TextInputNumberFormatterExtensionBinder defines a controller but none was found");
                case 13762:
                    C14360o3.A0B(view, 0);
                    COR cor = (COR) AnonymousClass634.A06(c6fg, c102884kP);
                    if (cor != null) {
                        view.removeOnLayoutChangeListener(cor.A00);
                        view.setScaleX(1.0f);
                        view.setScaleY(1.0f);
                        view.setTranslationY(0.0f);
                        return;
                    }
                    return;
                case 13768:
                    WKe wKe = (WKe) AnonymousClass634.A06(c6fg, c102884kP);
                    if (wKe != null) {
                        BX7 bx73 = (BX7) AnonymousClass634.A06(c6fg, c102884kP2);
                        if (bx73 != null) {
                            bx73.A05(wKe);
                        }
                        wKe.A02 = null;
                        wKe.A00 = null;
                        wKe.A03 = null;
                        wKe.A01 = null;
                        return;
                    }
                    return;
                case 13774:
                    U6J u6j = (U6J) AnonymousClass634.A06(c6fg, c102884kP);
                    if (u6j != null) {
                        ViewTreeObserverOnGlobalLayoutListenerC66252U5w viewTreeObserverOnGlobalLayoutListenerC66252U5w = u6j.A00;
                        if (viewTreeObserverOnGlobalLayoutListenerC66252U5w == null) {
                            u6j.A01 = false;
                            return;
                        }
                        u6j.A01 = viewTreeObserverOnGlobalLayoutListenerC66252U5w.A00;
                        viewTreeObserverOnGlobalLayoutListenerC66252U5w.A03.clear();
                        ViewTreeObserver viewTreeObserver = viewTreeObserverOnGlobalLayoutListenerC66252U5w.A02.getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC66252U5w);
                        }
                        u6j.A00 = null;
                        return;
                    }
                    return;
                case 13914:
                    InterfaceC103384lE A0B = c102884kP.A0B(43);
                    if (A0B != null) {
                        C6FX c6fx = new C6FX();
                        c6fx.A01(c102884kP2);
                        C6FP.A03(c6fg, c102884kP, c6fx.A00(), A0B);
                        return;
                    }
                    return;
                case 13981:
                    view.setOnTouchListener(null);
                    view.setOnKeyListener(null);
                    return;
                case 14001:
                    C72811XnZ c72811XnZ = (C72811XnZ) AnonymousClass634.A06(c6fg, c102884kP);
                    if (c72811XnZ != null) {
                        AbstractC010103p.A0B(view, null);
                        view.setContentDescription(c72811XnZ.A03);
                        view.setImportantForAccessibility(c72811XnZ.A00.intValue());
                        view.setAccessibilityLiveRegion(c72811XnZ.A01.intValue());
                        view.setFocusable(c72811XnZ.A05);
                        view.setSelected(c72811XnZ.A08);
                        view.setEnabled(c72811XnZ.A04);
                        AbstractC010103p.A0I(view, c72811XnZ.A06);
                        AbstractC010103p.A0J(view, c72811XnZ.A07);
                        if (c72811XnZ.A09) {
                            view.setOnLongClickListener(null);
                        }
                        AbstractC65825Tui.A00(c6fg, c102884kP2, c102884kP.A0O(56));
                        view.setLabelFor(-1);
                        return;
                    }
                    return;
                case 15833:
                    view.setOnTouchListener(null);
                    view.setOnKeyListener(null);
                    Object A063 = AnonymousClass634.A06(c6fg, c102884kP);
                    A063.getClass();
                    C139916Uv c139916Uv = (C139916Uv) A063;
                    ScaleGestureDetectorOnScaleGestureListenerC139956Uz scaleGestureDetectorOnScaleGestureListenerC139956Uz = c139916Uv.A01;
                    if (scaleGestureDetectorOnScaleGestureListenerC139956Uz != null) {
                        scaleGestureDetectorOnScaleGestureListenerC139956Uz.A01 = null;
                    }
                    handler = AbstractC139946Uy.A00;
                    runnable = c139916Uv.A03;
                    handler.post(runnable);
                    return;
                case 16123:
                    A4N a4n = (A4N) AnonymousClass634.A06(c6fg, c102884kP);
                    if (a4n != null) {
                        a4n.A00.A0A(null);
                    }
                    AbstractC68226VIm.A02 = null;
                    return;
                case 16310:
                    Object A064 = AnonymousClass634.A06(c6fg, c102884kP);
                    A064.getClass();
                    handler = C9QX.A00;
                    runnable = ((U5Z) A064).A02;
                    handler.post(runnable);
                    return;
                case 16409:
                    Object A065 = AnonymousClass634.A06(c6fg, c102884kP);
                    A065.getClass();
                    ((CAX) A065).A01();
                    return;
                case 16485:
                    C14360o3.A0B(view, 0);
                    AbstractC12990ll abstractC12990ll = ((C62862tP) c6fg.A02).A06;
                    C14360o3.A07(abstractC12990ll);
                    C71313Hs A002 = C71313Hs.A00(abstractC12990ll);
                    C14360o3.A07(A002);
                    A002.A04(view);
                    return;
                case 16515:
                    C14360o3.A0B(view, 0);
                    i = R.id.bk_extension_viewtag_int;
                    view.setTag(i, null);
                    return;
                case 16529:
                    C14360o3.A0B(view, 0);
                    Object A066 = AnonymousClass634.A06(c6fg, c102884kP);
                    A066.getClass();
                    runnable2 = ((C27858CPv) A066).A00;
                    if ((runnable2 instanceof C9QP) && (c9qp2 = (C9QP) runnable2) != null) {
                        c9qp2.A00 = true;
                        return;
                    }
                    view.removeCallbacks(runnable2);
                    return;
                case 16792:
                    L4P l4p = (L4P) AnonymousClass634.A06(c6fg, c102884kP);
                    if (l4p != null) {
                        l4p.A02 = AbstractC23641Du.A04(AnonymousClass191.A00, new MCH(l4p, (InterfaceC23621Ds) null, 4), l4p.A06);
                        l4p.A01 = null;
                        return;
                    }
                    return;
                case 16906:
                    Object A067 = AnonymousClass634.A06(c6fg, c102884kP);
                    A067.getClass();
                    handler = A3I.A00;
                    runnable = ((C69265VkZ) A067).A03;
                    handler.post(runnable);
                    return;
                case 16913:
                    C14360o3.A0B(view, 0);
                    if (c102884kP.A0U(true) && (view instanceof Tg0)) {
                        TextInputView textInputView = (TextInputView) ((Tg0) view);
                        textInputView.A02 = null;
                        textInputView.A00 = null;
                        return;
                    }
                    return;
                case 16932:
                    C14360o3.A0B(view, 0);
                    if (view instanceof RCTextView) {
                        i = R.id.bk_context_key_render_validation_key;
                        view.setTag(i, null);
                        return;
                    }
                    return;
                case 16952:
                    C14360o3.A0B(view, 0);
                    view.setTag(R.id.bk_context_key_render_validation_key, null);
                    view.setTag(R.id.bk_context_key_render_validation_extra_data, null);
                    return;
                default:
                    throw new IllegalArgumentException(String.format("No implementation bound to key: %s", Integer.valueOf(i2)));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.VPe] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.VPf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, X.Xkj] */
    /* JADX WARN: Type inference failed for: r2v24, types: [X.6W1, java.lang.Object] */
    public final Object A00(C6FG c6fg, C102884kP c102884kP) {
        int i = c102884kP.A05;
        if (AbstractC86593tX.A0l(i)) {
            switch (i) {
                case 13313:
                    return new Object();
                case 13337:
                    String A0E = c102884kP.A0E();
                    if (A0E == null || A0E.length() <= 0) {
                        return null;
                    }
                    return new C28585CjQ(A0E);
                case 13383:
                    return new Object();
                case 13394:
                    return C131655x1.A01;
                case 13538:
                    C65934Twf c65934Twf = AbstractC68222VIi.A00;
                    if (c65934Twf == null) {
                        C65934Twf c65934Twf2 = new C65934Twf(new Object(), new Object());
                        AbstractC68222VIi.A00 = c65934Twf2;
                        return c65934Twf2;
                    }
                    return c65934Twf;
                case 13565:
                case 13566:
                case 13656:
                case 15909:
                case 16375:
                case 16485:
                case 16493:
                case 16515:
                case 16913:
                case 16932:
                case 16952:
                    return null;
                case 13615:
                    return new CSR();
                case 13627:
                    return new C42277Io1(c6fg, c102884kP, AbstractC03270Dk.A01(C6BQ.A0A(c6fg)));
                case 13638:
                    return new Object();
                case 13688:
                    ?? obj = new Object();
                    C6W1.A00(c102884kP, obj);
                    return obj;
                case 13712:
                    return new Object();
                case 13713:
                    return new CSS();
                case 13748:
                    InterfaceC103384lE A0B = c102884kP.A0B(35);
                    if (A0B != null) {
                        return new HH4(c6fg, c102884kP, A0B);
                    }
                    AbstractC25241Le.A02("IgShopsScreenLifecycleExtensionBinderUtils", "Expected onExit expression in this extension");
                    return null;
                case 13762:
                    return new Object();
                case 13768:
                    return new Object();
                case 13774:
                    return new U6J();
                case 13914:
                    ?? obj2 = new Object();
                    obj2.A00 = false;
                    return obj2;
                case 13981:
                    return new C25687BWx();
                case 14001:
                    return new Object();
                case 15833:
                    return new C139916Uv();
                case 16123:
                    return new A4N(new C8SB(new UGM(c6fg, c102884kP)));
                case 16310:
                    return new U5Z(c6fg, c102884kP);
                case 16409:
                    AbstractC12990ll A0A = C6BQ.A0A(c6fg);
                    Context context = c6fg.A00;
                    C48498Lcp c48498Lcp = new C48498Lcp(c6fg, c102884kP);
                    if (A0A != null) {
                        return new C27070Bwt(context, c48498Lcp, A0A);
                    }
                    return new Object();
                case 16529:
                    return new Object();
                case 16792:
                    C54772OIl c54772OIl = C54772OIl.A03;
                    if (c54772OIl == null) {
                        c54772OIl = new C54772OIl();
                        C54772OIl.A03 = c54772OIl;
                    }
                    return new L4P(c54772OIl, AbstractC24771Iv.A01(1749652546, 3));
                case 16807:
                    return new C27856CPt(c6fg.A00);
                case 16906:
                    return new C69265VkZ((C6FC) c6fg.A01.get(R.id.bloks_ig_scrollable_navigation_helper), c6fg);
                default:
                    throw new IllegalArgumentException(String.format("No implementation bound to key: %s", Integer.valueOf(i)));
            }
        }
        return null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0012. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0af8  */
    /* JADX WARN: Removed duplicated region for block: B:296:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0870  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x088c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(final X.C6FG r22, final X.C102884kP r23, final X.C102884kP r24, java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 3382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C103164kr.A01(X.6FG, X.4kP, X.4kP, java.lang.Object):void");
    }
}
