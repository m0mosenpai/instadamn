package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.facebook.dsp.core.ColorData;
import com.meta.foa.cds.CdsBottomSheetDimmingBehaviour;
import com.meta.foa.cds.CdsBottomSheetTopSpan;
import com.meta.foa.cds.CdsOpenScreenConfig$BottomSheetMargins;
import com.meta.foa.cds.CdsOpenScreenDismissCallback;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.U4a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66204U4a implements X7D {
    public int A00;
    public InterfaceC71883X8q A01;
    public U4W A02;
    public C66206U4c A03;
    public W2o A04;
    public U56 A05;
    public U55 A06;
    public DialogC51582Yg A07;
    public C66207U4d A08;
    public U6H A09;
    public C6FH A0A;
    public Integer A0B;
    public Runnable A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final Deque A0G;
    public final List A0H;
    public final C68716Vas A0I;

    public final void A0D(Context context, InterfaceC72001XEp interfaceC72001XEp, U50 u50) {
        Integer num;
        int i;
        XBX xbx;
        boolean z;
        Boolean valueOf;
        U6H u6h;
        String str;
        C66212U4i c66212U4i = (C66212U4i) this.A0G.peek();
        if (c66212U4i == null) {
            str = "Cannot push to an empty bottom sheet. Please call open() to show new Screen content in the bottom sheet.";
        } else if (this.A0F) {
            str = "Attempting to push to a dismissing sheet. The content will not be displayed properly";
        } else {
            c66212U4i.A03.stop();
            boolean z2 = u50 instanceof C68109VBs;
            if (z2) {
                num = ((C68109VBs) u50).A00;
            } else if (u50 instanceof VBp) {
                num = ((VBp) u50).A03;
            } else if (u50 instanceof C68110VBt) {
                num = ((C68110VBt) u50).A00;
            } else if (u50 instanceof C68108VBr) {
                num = ((C68108VBr) u50).A00;
            } else {
                if (u50 instanceof VBq) {
                    num = ((VBq) u50).A00;
                }
                throw C00O.createAndThrow();
            }
            if (z2) {
                i = 32;
            } else if (u50 instanceof VBp) {
                i = ((VBp) u50).A00;
            } else if (u50 instanceof U5A) {
                i = ((U5A) u50).A00;
            } else {
                if (u50 instanceof C68111VBu) {
                    i = ((C68111VBu) u50).A00;
                }
                throw C00O.createAndThrow();
            }
            Integer valueOf2 = Integer.valueOf(i);
            valueOf2.getClass();
            int intValue = valueOf2.intValue();
            if (z2) {
                xbx = null;
            } else if (u50 instanceof VBp) {
                xbx = ((VBp) u50).A02;
            } else if (u50 instanceof U5A) {
                xbx = ((U5A) u50).A01;
            } else {
                if (u50 instanceof C68111VBu) {
                    xbx = ((C68111VBu) u50).A01;
                }
                throw C00O.createAndThrow();
            }
            if (z2) {
                valueOf = AbstractC166997dE.A0a();
            } else {
                if (u50 instanceof VBp) {
                    z = ((VBp) u50).A04;
                } else if (u50 instanceof U5A) {
                    z = ((U5A) u50).A02;
                } else {
                    if (u50 instanceof C68111VBu) {
                        z = ((C68111VBu) u50).A02;
                    }
                    throw C00O.createAndThrow();
                }
                valueOf = Boolean.valueOf(z);
            }
            valueOf.getClass();
            boolean booleanValue = valueOf.booleanValue();
            if (u50 instanceof VBp) {
                u6h = ((VBp) u50).A01;
            } else {
                u6h = u50.A00;
            }
            A00(context, this, interfaceC72001XEp, u6h, xbx, num, intValue, booleanValue);
            return;
        }
        AbstractC25241Le.A02("CDSBloksBottomSheetDelegate", str);
    }

    public static void A00(Context context, final C66204U4a c66204U4a, InterfaceC72001XEp interfaceC72001XEp, final U6H u6h, XBX xbx, Integer num, int i, boolean z) {
        int i2;
        if (c66204U4a.A02 != null) {
            c66204U4a.A03(interfaceC72001XEp);
            View ArB = interfaceC72001XEp.ArB(context);
            U4W u4w = c66204U4a.A02;
            if (u4w != null) {
                C66211U4h.A02(ArB, u4w.getContentPager(), num, true);
                View BDI = interfaceC72001XEp.BDI();
                U4W u4w2 = c66204U4a.A02;
                if (u4w2 != null) {
                    ViewGroup headerContainer = u4w2.getHeaderContainer();
                    headerContainer.removeAllViews();
                    headerContainer.addView(BDI);
                }
                interfaceC72001XEp.E0O();
                Runnable runnable = new Runnable() { // from class: X.U4Z
                    @Override // java.lang.Runnable
                    public final void run() {
                        C66204U4a.this.A0H(null, u6h);
                    }
                };
                if (ArB != null) {
                    if (ArB.isLaidOut()) {
                        runnable.run();
                    } else {
                        ViewTreeObserver viewTreeObserver = ArB.getViewTreeObserver();
                        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC66229U4z(0, ArB, viewTreeObserver, runnable));
                    }
                    Deque deque = c66204U4a.A0G;
                    if (!deque.isEmpty()) {
                        c66204U4a.A02(interfaceC72001XEp);
                    }
                    deque.push(new C66212U4i(ArB, interfaceC72001XEp, xbx, i, z));
                    c66204U4a.A04(z);
                    C66212U4i c66212U4i = (C66212U4i) deque.peek();
                    if (c66212U4i == null) {
                        AbstractC25241Le.A02("CDSBloksBottomSheetDelegate", "Attempting to check the current keyboard soft input mode but found null.");
                        i2 = 32;
                    } else {
                        i2 = c66212U4i.A02;
                    }
                    Window A06 = c66204U4a.A06(context);
                    if (A06 != null) {
                        A06.setSoftInputMode(i2);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Given null view.");
            }
            throw new IllegalStateException("Cannot show Screen content without initializing the CDS bottom sheet. Please call onCreateDialog() and onCreateView().");
        }
        throw new IllegalStateException("Cannot push Screen content without initializing the CDS bottom sheet. Please call onCreateDialog() and onCreateView().");
    }

    private void A01(Context context, Integer num) {
        boolean z;
        int i;
        Deque deque = this.A0G;
        C66212U4i c66212U4i = (C66212U4i) deque.pop();
        C66212U4i c66212U4i2 = (C66212U4i) deque.peek();
        if (c66212U4i2 == null) {
            AbstractC25241Le.A02("CDSBloksBottomSheetDelegate", "Attempting to check the current limited theme setting but found null.");
            z = false;
        } else {
            z = c66212U4i2.A04;
        }
        A04(z);
        C66212U4i c66212U4i3 = (C66212U4i) deque.peek();
        if (c66212U4i3 == null) {
            AbstractC25241Le.A02("CDSBloksBottomSheetDelegate", "Attempting to check the current keyboard soft input mode but found null.");
            i = 32;
        } else {
            i = c66212U4i3.A02;
        }
        Window A06 = A06(context);
        if (A06 != null) {
            A06.setSoftInputMode(i);
        }
        if (this.A02 != null) {
            c66212U4i.A03.stop();
            this.A0H.add(c66212U4i);
            C66212U4i c66212U4i4 = (C66212U4i) deque.peek();
            if (c66212U4i4 != null) {
                if (this.A02 != null) {
                    U55 u55 = this.A06;
                    if (u55 != null) {
                        u55.A02.post(new RunnableC66233U5d(u55));
                    }
                    U56 u56 = this.A05;
                    if (u56 != null) {
                        u56.A02.post(new RunnableC71234WqP(u56));
                    }
                    InterfaceC72001XEp interfaceC72001XEp = c66212U4i4.A03;
                    A03(interfaceC72001XEp);
                    View view = c66212U4i4.A00;
                    if (view == null) {
                        view = interfaceC72001XEp.ArB(context);
                    }
                    c66212U4i4.A00 = view;
                    C66211U4h.A02(view, this.A02.getContentPager(), num, false);
                    View BDI = interfaceC72001XEp.BDI();
                    U4W u4w = this.A02;
                    if (u4w != null) {
                        ViewGroup headerContainer = u4w.getHeaderContainer();
                        headerContainer.removeAllViews();
                        headerContainer.addView(BDI);
                    }
                    interfaceC72001XEp.E0O();
                    A02(interfaceC72001XEp);
                    return;
                }
                throw new IllegalStateException("Cannot pop Screen content without initializing the CDS bottom sheet. Please call onCreateDialog() and onCreateView().");
            }
            throw new IllegalStateException("Cannot pop Screen content with an empty CDS bottom sheet or full screen.");
        }
        throw new IllegalStateException("Cannot pop Screen content without initializing the CDS bottom sheet. Please call onCreateDialog() and onCreateView().");
    }

    private void A02(InterfaceC72001XEp interfaceC72001XEp) {
        String Abe;
        C68716Vas c68716Vas = this.A0I;
        if (c68716Vas != null && (Abe = interfaceC72001XEp.Abe()) != null && !Abe.isEmpty()) {
            c68716Vas.A00.A0D("not_activity_or_fragment", new C66241U5l(Abe));
        }
    }

    private void A03(InterfaceC72001XEp interfaceC72001XEp) {
        String str;
        W2o w2o = this.A04;
        if (w2o != null) {
            EnumC68125VCj Bdl = interfaceC72001XEp.Bdl();
            C14360o3.A0B(Bdl, 0);
            EnumC68125VCj enumC68125VCj = w2o.A02;
            if (enumC68125VCj == null) {
                str = "currentType";
            } else if (enumC68125VCj != Bdl) {
                w2o.A02 = Bdl;
                C07S A07 = w2o.A03.mLifecycleRegistry.A07();
                C07S c07s = C07S.RESUMED;
                if (A07.A00(c07s)) {
                    C0eR c0eR = w2o.A00;
                    str = "lifecycle";
                    if (c0eR != null) {
                        c0eR.A0C(C07S.STARTED);
                        C09530e4 c09530e4 = (C09530e4) w2o.A04.get(Bdl);
                        if (c09530e4 == null) {
                            c09530e4 = W2o.A00(null, w2o, Bdl);
                        }
                        XBU xbu = (XBU) c09530e4.A00;
                        C0eR c0eR2 = ((C70300WQf) c09530e4.A01).A00;
                        w2o.A00 = c0eR2;
                        w2o.A01 = xbu;
                        if (c0eR2 != null) {
                            c0eR2.A0C(c07s);
                            return;
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    private void A04(boolean z) {
        boolean z2;
        boolean z3 = this.A0E;
        Float valueOf = Float.valueOf(0.0f);
        if (!z3) {
            if (z) {
                EnumC72394Xcg enumC72394Xcg = EnumC72394Xcg.A2M;
                EnumC191908em C73 = AbstractC25291Lj.A00.C73();
                C14360o3.A0B(C73, 0);
                A0I(XPC.A00(C73).AIU(enumC72394Xcg), valueOf);
                z2 = true;
            } else {
                return;
            }
        } else {
            if (z) {
                return;
            }
            C66206U4c c66206U4c = this.A03;
            if (c66206U4c != null) {
                ColorData colorData = new ColorData(16777215, 16777215);
                C6FH c6fh = this.A0A;
                c6fh.getClass();
                c66206U4c.A01(colorData, c6fh, 0.0f);
            }
            z2 = false;
        }
        this.A0E = z2;
    }

    public final View A05(String str) {
        Iterator it = this.A0G.iterator();
        while (it.hasNext()) {
            InterfaceC72001XEp interfaceC72001XEp = ((C66212U4i) it.next()).A03;
            if (interfaceC72001XEp.Aga().equals(str)) {
                return interfaceC72001XEp.BDI();
            }
        }
        return null;
    }

    public final Window A06(Context context) {
        Context context2;
        Activity activity;
        C66212U4i c66212U4i = (C66212U4i) this.A0G.peek();
        Window window = null;
        if (c66212U4i != null) {
            context2 = c66212U4i.A03.getContext();
            window = null;
        } else {
            context2 = null;
        }
        DialogC51582Yg dialogC51582Yg = this.A07;
        if (dialogC51582Yg != null) {
            return dialogC51582Yg.getWindow();
        }
        if (context2 instanceof Activity) {
            activity = (Activity) context2;
        } else {
            if (!(context instanceof Activity)) {
                return window;
            }
            activity = (Activity) context;
        }
        return activity.getWindow();
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [android.widget.FrameLayout, android.view.View, X.U4W, android.view.ViewGroup] */
    public final C66206U4c A07(Context context, InterfaceC71883X8q interfaceC71883X8q, C65981Txa c65981Txa, boolean z) {
        Activity A00;
        this.A01 = interfaceC71883X8q;
        this.A0A = new U51(context, c65981Txa.A0F);
        XBV xbv = new XBV() { // from class: X.U53
            @Override // X.XBV
            public final void onCancel() {
                InterfaceC71883X8q interfaceC71883X8q2;
                C66204U4a c66204U4a = C66204U4a.this;
                if (c66204U4a.A09 == U6H.A07 && (interfaceC71883X8q2 = c66204U4a.A01) != null) {
                    interfaceC71883X8q2.DAz();
                } else {
                    DialogC51582Yg dialogC51582Yg = c66204U4a.A07;
                    if (dialogC51582Yg != null) {
                        dialogC51582Yg.dismiss();
                    }
                }
                c66204U4a.A00 = 6;
            }
        };
        InterfaceC71884X8r interfaceC71884X8r = new InterfaceC71884X8r() { // from class: X.U54
            @Override // X.InterfaceC71884X8r
            public final void DeM() {
                C66212U4i c66212U4i = (C66212U4i) C66204U4a.this.A0G.peek();
                if (c66212U4i != null) {
                    c66212U4i.A03.ECn();
                }
            }
        };
        EnumC191908em C73 = AbstractC25291Lj.A00.C73();
        this.A06 = new U55(context, c65981Txa.A04, xbv, this.A0A, c65981Txa.A0I);
        this.A05 = new U56(context, interfaceC71884X8r, C73, xbv, this.A0A);
        this.A09 = c65981Txa.A0E;
        if (!z && (A00 = C66224U4u.A00(context)) != null) {
            this.A0B = Integer.valueOf(A00.getRequestedOrientation());
            AbstractC917648y.A00(A00, 1);
        }
        U6H u6h = this.A09;
        C14360o3.A0B(u6h, 2);
        ?? frameLayout = new FrameLayout(context);
        frameLayout.A02 = u6h;
        Context context2 = frameLayout.getContext();
        frameLayout.A00 = new FrameLayout(context2);
        frameLayout.A01 = new C66211U4h(context2);
        frameLayout.getContentPager().A01 = frameLayout.A02.A01;
        frameLayout.getContentPager().setImportantForAccessibility(1);
        frameLayout.addView(frameLayout.getContentPager());
        frameLayout.addView(frameLayout.getHeaderContainer());
        this.A02 = frameLayout;
        frameLayout.getContentPager().A00 = this;
        C6FH c6fh = this.A0A;
        U4W u4w = this.A02;
        boolean z2 = this.A0D;
        C14360o3.A0B(c6fh, 1);
        AbstractC167007dF.A1F(u4w, 2, C73);
        this.A03 = new C66206U4c(context, u4w, C73, c65981Txa, c6fh, z2);
        C66212U4i c66212U4i = (C66212U4i) this.A0G.peek();
        if (c66212U4i != null) {
            InterfaceC72001XEp interfaceC72001XEp = c66212U4i.A03;
            A03(interfaceC72001XEp);
            if (c66212U4i.A00 == null) {
                View ArB = interfaceC72001XEp.ArB(context);
                c66212U4i.A00 = ArB;
                C66211U4h.A02(ArB, this.A02.getContentPager(), C05F.A00, false);
                View BDI = interfaceC72001XEp.BDI();
                U4W u4w2 = this.A02;
                if (u4w2 != null) {
                    ViewGroup headerContainer = u4w2.getHeaderContainer();
                    headerContainer.removeAllViews();
                    headerContainer.addView(BDI);
                }
                interfaceC72001XEp.E0O();
            } else {
                throw new IllegalStateException("NavStack entry should have no view associated at Fragment's view creation");
            }
        }
        return this.A03;
    }

    public final DialogC51582Yg A08(final Context context, Fragment fragment, C65981Txa c65981Txa) {
        float f;
        C50686MZe c50686MZe;
        C6FH c6fh;
        int i;
        U6H BUG;
        U6H u6h;
        U6H u6h2;
        Fragment fragment2;
        U6H u6h3 = c65981Txa.A0E;
        this.A09 = u6h3;
        Integer num = c65981Txa.A0F;
        this.A0A = new U51(context, num);
        U6H u6h4 = U6H.A07;
        if (u6h3 != u6h4) {
            this.A09 = u6h3;
            DialogC51582Yg dialogC51582Yg = new DialogC51582Yg(context);
            EnumC68201VFt enumC68201VFt = c65981Txa.A0C;
            AbstractC68278VKq abstractC68278VKq = AbstractC68278VKq.$redex_init_class;
            int ordinal = enumC68201VFt.ordinal();
            if (ordinal != -1) {
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            dialogC51582Yg.setCanceledOnTouchOutside(false);
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        dialogC51582Yg.setCanceledOnTouchOutside(true);
                    }
                }
            } else {
                AbstractC25241Le.A02("CDSBloksBottomSheetDialogHelper", AbstractC167017dG.A0n(enumC68201VFt, "Invalid enum value for DimmedBackgroundTapToDismiss: ", new StringBuilder()));
            }
            Integer num2 = c65981Txa.A02;
            Integer num3 = C05F.A0C;
            if (num2 == num3) {
                dialogC51582Yg.A0E = true;
            }
            if (c65981Txa.A01 == num3) {
                dialogC51582Yg.A0G = true;
            }
            CdsOpenScreenConfig$BottomSheetMargins cdsOpenScreenConfig$BottomSheetMargins = c65981Txa.A0A;
            if (cdsOpenScreenConfig$BottomSheetMargins != null) {
                dialogC51582Yg.A04.setPadding(cdsOpenScreenConfig$BottomSheetMargins.A01, cdsOpenScreenConfig$BottomSheetMargins.A03, cdsOpenScreenConfig$BottomSheetMargins.A02, cdsOpenScreenConfig$BottomSheetMargins.A00);
            } else if (c65981Txa.A0B == EnumC68200VFs.A05 && AbstractC68607VXi.A00()) {
                if (AbstractC86593tX.A0j()) {
                    f = (float) C1AD.A00(C06090Tz.A05, 19159136142885470L);
                } else {
                    f = 0.0f;
                }
                dialogC51582Yg.A04.setPadding(0, (int) U5C.A00(context, f), 0, 0);
            } else {
                int A00 = (int) U5C.A00(context, 4.0f);
                dialogC51582Yg.A04.setPadding(A00, A00, A00, A00);
            }
            CdsBottomSheetTopSpan cdsBottomSheetTopSpan = c65981Txa.A08;
            float A002 = AbstractC68279VKr.A00(u6h3);
            if (!u6h3.A01) {
                c50686MZe = new C50686MZe(context, cdsBottomSheetTopSpan, A002);
                dialogC51582Yg.A05(c50686MZe);
            } else {
                dialogC51582Yg.A05(new C55597Omb(cdsBottomSheetTopSpan, A002));
                c50686MZe = null;
            }
            dialogC51582Yg.A07 = c50686MZe;
            C66242U5m c66242U5m = dialogC51582Yg.A09;
            c66242U5m.A03(DialogC51582Yg.A02(dialogC51582Yg.A08, c50686MZe), dialogC51582Yg.isShowing());
            if (dialogC51582Yg.A0H) {
                dialogC51582Yg.A0H = false;
            }
            if (!dialogC51582Yg.A0B) {
                dialogC51582Yg.A0B = true;
                DialogC51582Yg.A01(dialogC51582Yg, dialogC51582Yg.A00);
            }
            c66242U5m.A09 = true;
            U6G u6g = c65981Txa.A0D;
            if (u6g != U6G.A04 ? u6g == U6G.A05 : u6h3 == U6H.A08) {
                C70004VzO c70004VzO = C70004VzO.A00;
                c66242U5m.A06 = Collections.singletonList(DialogC51582Yg.A0M);
                c66242U5m.A02 = c70004VzO;
            }
            U51 u51 = new U51(context, num);
            CdsBottomSheetDimmingBehaviour cdsBottomSheetDimmingBehaviour = c65981Txa.A07;
            int A003 = VMD.A00(context, EnumC72397Xck.A0p, u51);
            if (dialogC51582Yg.A02 != A003) {
                dialogC51582Yg.A02 = A003;
                DialogC51582Yg.A01(dialogC51582Yg, dialogC51582Yg.A00);
            }
            dialogC51582Yg.A04(Color.alpha(A003) / 255.0f);
            if (!C14360o3.A0K(cdsBottomSheetDimmingBehaviour, CdsBottomSheetDimmingBehaviour.Default.A00)) {
                if (cdsBottomSheetDimmingBehaviour instanceof CdsBottomSheetDimmingBehaviour.FixedAlpha) {
                    float f2 = ((CdsBottomSheetDimmingBehaviour.FixedAlpha) cdsBottomSheetDimmingBehaviour).A00;
                    Float f3 = dialogC51582Yg.A0A;
                    if (f3 == null || f3.floatValue() != f2) {
                        dialogC51582Yg.A0A = Float.valueOf(f2);
                        DialogC51582Yg.A01(dialogC51582Yg, dialogC51582Yg.A00);
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            Window window = dialogC51582Yg.getWindow();
            if (window != null) {
                window.setStatusBarColor(0);
            }
            this.A07 = dialogC51582Yg;
            dialogC51582Yg.A06 = new InterfaceC71885X8s() { // from class: X.WTK
                @Override // X.InterfaceC71885X8s
                public final boolean D1l(Integer num4) {
                    int i2;
                    C66204U4a c66204U4a = this;
                    Context context2 = context;
                    if (num4 != C05F.A01) {
                        int intValue = num4.intValue();
                        if (intValue != 0) {
                            if (intValue != 2) {
                                if (intValue == 3) {
                                    i2 = 5;
                                }
                                return true;
                            }
                            i2 = 4;
                            c66204U4a.A00 = i2;
                            return true;
                        }
                        c66204U4a.A00 = 3;
                        return true;
                    }
                    c66204U4a.A0B(context2);
                    c66204U4a.A00 = 2;
                    return false;
                }
            };
            if (u6h3 == U6H.A0A) {
                C25949Bdt c25949Bdt = new C25949Bdt(context);
                this.A0A.getClass();
                this.A07.setOnShowListener(new DialogInterfaceOnShowListenerC48027LMw(c25949Bdt, 0));
            }
            DialogC51582Yg dialogC51582Yg2 = this.A07;
            Activity A004 = C66224U4u.A00(context);
            if (A004 != null) {
                List A03 = C66224U4u.A03(A004);
                Fragment fragment3 = null;
                if (A03 != null && !A03.isEmpty()) {
                    Iterator it = A03.iterator();
                    while (it.hasNext() && (fragment2 = (Fragment) it.next()) != fragment) {
                        fragment3 = fragment2;
                    }
                }
                boolean z = true;
                if (AbstractC25291Lj.A00.EpP() && (fragment3 instanceof InterfaceC72040XGi) && ((BUG = ((InterfaceC72040XGi) fragment3).BUG()) == (u6h = U6H.A08) || BUG == u6h4 || ((u6h2 = this.A09) != u6h && u6h2 != u6h4))) {
                    z = false;
                }
                this.A0D = z;
                if (fragment3 instanceof C66207U4d) {
                    C66207U4d c66207U4d = (C66207U4d) fragment3;
                    this.A08 = c66207U4d;
                    ColorData colorData = c65981Txa.A06;
                    if (colorData != null) {
                        c66207U4d.A0N(colorData);
                    }
                    dialogC51582Yg2.A04(0.0f);
                    dialogC51582Yg2.A05 = new C68658VZr(this);
                } else {
                    ColorData colorData2 = c65981Txa.A06;
                    if (colorData2 != null && (c6fh = this.A0A) != null) {
                        if (c6fh.CSL()) {
                            i = colorData2.A00;
                        } else {
                            i = colorData2.A01;
                        }
                        if (i == 0) {
                            dialogC51582Yg2.A04(0.0f);
                            return dialogC51582Yg2;
                        }
                    }
                }
                return dialogC51582Yg2;
            }
            throw new IllegalStateException(AbstractC111324zv.A00(293));
        }
        throw new UnsupportedOperationException("onFragmentCreateDialog() is not supported for CDS full screen.");
    }

    public final String A09() {
        C66212U4i c66212U4i;
        Deque deque = this.A0G;
        if (deque.isEmpty() || (c66212U4i = (C66212U4i) deque.peek()) == null) {
            return null;
        }
        return c66212U4i.A03.Abe();
    }

    public final void A0A() {
        C66206U4c c66206U4c;
        C66207U4d c66207U4d = this.A08;
        if (c66207U4d != null && (c66206U4c = C66207U4d.A01(c66207U4d).A03) != null && c66206U4c.A08 != null) {
            c66206U4c.setForeground(null);
        }
        U4W u4w = this.A02;
        if (u4w != null) {
            u4w.getHeaderContainer().removeAllViews();
        }
        Deque<C66212U4i> deque = this.A0G;
        for (C66212U4i c66212U4i : deque) {
            if (c66212U4i.A00 != null) {
                if (c66212U4i == deque.peek()) {
                    c66212U4i.A03.stop();
                }
                c66212U4i.A03.AP7();
                c66212U4i.A00 = null;
            }
        }
        U55 u55 = this.A06;
        if (u55 != null) {
            u55.A00 = null;
            this.A06 = null;
        }
        U56 u56 = this.A05;
        if (u56 != null) {
            u56.A00 = null;
            this.A05 = null;
        }
    }

    public final void A0B(Context context) {
        InterfaceC71883X8q interfaceC71883X8q;
        XBX xbx;
        U4W u4w = this.A02;
        if (u4w != null && u4w.getVisibility() != 0) {
            this.A02.setVisibility(0);
        }
        Deque deque = this.A0G;
        C66212U4i c66212U4i = (C66212U4i) deque.peek();
        if (c66212U4i != null && (xbx = c66212U4i.A01) != null && xbx.Cyt()) {
            return;
        }
        if (deque.size() > 1) {
            A01(context, null);
            return;
        }
        if (this.A09 == U6H.A07 && (interfaceC71883X8q = this.A01) != null) {
            interfaceC71883X8q.DAz();
            return;
        }
        DialogC51582Yg dialogC51582Yg = this.A07;
        if (dialogC51582Yg == null) {
            return;
        }
        dialogC51582Yg.dismiss();
    }

    public final void A0C(Context context) {
        Activity A00;
        Deque deque = this.A0G;
        Iterator it = deque.iterator();
        while (it.hasNext()) {
            ((C66212U4i) it.next()).A03.destroy();
        }
        deque.clear();
        if (this.A0B != null && (A00 = C66224U4u.A00(context)) != null) {
            AbstractC917648y.A00(A00, this.A0B.intValue());
            this.A0B = null;
        }
        this.A08 = null;
    }

    public final void A0E(Context context, InterfaceC72001XEp interfaceC72001XEp, C68109VBs c68109VBs, String str) {
        String str2;
        Deque deque = this.A0G;
        if (!deque.isEmpty() && this.A02 != null) {
            C66212U4i c66212U4i = (C66212U4i) deque.peekFirst();
            if (c66212U4i == null) {
                str2 = "Invalid screen state. Cannot have a null screen.";
            } else if (str != null && !str.equals(c66212U4i.A03.Aga())) {
                if (deque.isEmpty()) {
                    str2 = "Attempting to replace a Screen when the stack is empty. The new screen was not added.";
                } else {
                    A03(interfaceC72001XEp);
                    Iterator it = deque.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        if (str.equals(((C66212U4i) it.next()).A03.Aga())) {
                            ArrayList arrayList = new ArrayList(deque);
                            arrayList.set(i, new C66212U4i(null, interfaceC72001XEp, null, 32, false));
                            deque.clear();
                            deque.addAll(arrayList);
                            return;
                        }
                        i++;
                    }
                    str2 = "Attempting to replace a Screen with an invalid screen ID. The new screen was not added.";
                }
            } else {
                A0D(context, interfaceC72001XEp, c68109VBs);
                A0N(c66212U4i.A03.Aga());
                return;
            }
        } else {
            str2 = "Cannot replace from an empty bottom sheet.";
        }
        AbstractC25241Le.A02("CDSBloksBottomSheetDelegate", str2);
    }

    public final void A0F(Context context, C68108VBr c68108VBr, String str) {
        String str2;
        Deque deque = this.A0G;
        if (!deque.isEmpty() && this.A02 != null) {
            if (deque.size() == 1) {
                str2 = "Attempting to pop to the root screen in the CDS bottom sheet or full screen, so no pop action was performed. This is a no-op.";
            } else if (str == null) {
                A01(context, c68108VBr.A00);
                return;
            } else {
                A0G(context, null, str);
                return;
            }
        } else {
            str2 = "Cannot pop from an empty bottom sheet.";
        }
        AbstractC25241Le.A02("CDSBloksBottomSheetDelegate", str2);
    }

    public final void A0G(Context context, Integer num, String str) {
        String str2;
        Deque deque = this.A0G;
        C66212U4i c66212U4i = (C66212U4i) deque.peekFirst();
        if (c66212U4i != null && !str.equals(c66212U4i.A03.Aga())) {
            Iterator it = deque.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (!str.equals(((C66212U4i) it.next()).A03.Aga())) {
                    i++;
                } else {
                    for (int i2 = 0; i2 < i; i2++) {
                        A01(context, num);
                    }
                    return;
                }
            }
            str2 = "No screen found with target ID, so no screens were popped.";
        } else {
            str2 = "Attempting to pop to the current screen in the CDS bottom sheet, so no pop action was performed. This is a no-op.";
        }
        AbstractC25241Le.A02("CDSBloksBottomSheetDelegate", str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0016, code lost:
    
        if (r10 == r1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        if (r2 != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        if (r0 != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
    
        r5 = X.U6H.A07;
        r0 = X.AbstractC167007dF.A1X(r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
    
        if (r10 == r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
    
        if (r0 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
    
        if (r3 != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        r7 = r8.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        if (r7 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0030, code lost:
    
        r0 = "Bottom sheet should not be null when we try to update it";
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
    
        X.AbstractC25241Le.A02("CDSBloksBottomSheetDelegate", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0036, code lost:
    
        if (r10 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0038, code lost:
    
        if (r6 == r10) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003c, code lost:
    
        if (r8.A03 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003e, code lost:
    
        r6.getClass();
        r3 = r8.A03;
        X.C14360o3.A0B(r3, 3);
        r0 = r6.A01;
        r2 = r10.A01;
        r1 = X.AbstractC167007dF.A1P(r0 ? 1 : 0, r2 ? 1 : 0);
        r0 = X.AbstractC68279VKr.A00(r6);
        r6 = X.AbstractC68279VKr.A00(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        if (r1 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005b, code lost:
    
        if (r0 != r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005d, code lost:
    
        r8.A09 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
    
        if (r2 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006a, code lost:
    
        r1 = new X.C55597Omb(null, r6);
        r7.A08 = r1;
        r7.A07 = null;
        r6 = r7.A09;
        r1 = new X.InterfaceC51602Yi[]{X.DialogC51582Yg.A0M, r1};
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007c, code lost:
    
        r6.A03(r1, r7.isShowing());
        r7.A09.A0H.add(new X.WTQ(r3, r7));
        r3.A0A = r10;
        r0 = r3.A0H;
        r0.A02 = r10;
        r0.getContentPager().A01 = r2;
        r0 = X.C65981Txa.A0O;
        r2 = r3.A0J.A0D;
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a4, code lost:
    
        if (r2 != X.U6G.A04) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
    
        if (r10 == X.U6H.A08) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00aa, code lost:
    
        if (r10 != r5) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ac, code lost:
    
        r3.A0B = !r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b3, code lost:
    
        if (r2 != X.U6G.A05) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b8, code lost:
    
        r1 = new X.WTN(r6);
        r7.A08 = r1;
        r7.A07 = r1;
        r6 = r7.A09;
        r1 = new X.InterfaceC51602Yi[]{X.DialogC51582Yg.A0M, r1, r1};
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x005f, code lost:
    
        if (r9 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0061, code lost:
    
        r0 = r8.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0063, code lost:
    
        if (r0 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0065, code lost:
    
        r0 = "Overlaying bottom sheet drag listener should not be null when we try to override the background color";
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ce, code lost:
    
        r0.A0N(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ca, code lost:
    
        r0 = "Invalid operation - it is not possible to update the bottom sheet from full screen to one of the sheet variants";
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0018, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x000f, code lost:
    
        if (r6 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        if (r10 == r0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        r1 = X.U6H.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (r6 == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0H(com.facebook.dsp.core.ColorData r9, X.U6H r10) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66204U4a.A0H(com.facebook.dsp.core.ColorData, X.U6H):void");
    }

    public final void A0I(ColorData colorData, Float f) {
        C66206U4c c66206U4c = this.A03;
        if (c66206U4c != null) {
            float floatValue = f.floatValue();
            C6FH c6fh = this.A0A;
            c6fh.getClass();
            c66206U4c.A01(colorData, c6fh, floatValue);
        }
    }

    public final void A0J(InterfaceC72001XEp interfaceC72001XEp, C68111VBu c68111VBu, String str) {
        String str2;
        Deque deque = this.A0G;
        if (deque.isEmpty()) {
            str2 = "Attempting to insert a new Screen when the stack is empty. The new screen was not added.";
        } else {
            C66212U4i c66212U4i = (C66212U4i) deque.peekLast();
            if (c66212U4i != null && str.equals(c66212U4i.A03.Aga())) {
                str2 = "Attempting to insert a new Screen insert before the root screen in the stack. The new screen was not added.";
            } else {
                Iterator it = deque.iterator();
                int i = 0;
                while (it.hasNext()) {
                    i++;
                    if (str.equals(((C66212U4i) it.next()).A03.Aga())) {
                        ArrayList arrayList = new ArrayList(deque);
                        arrayList.add(i, new C66212U4i(null, interfaceC72001XEp, c68111VBu.A01, c68111VBu.A00, c68111VBu.A02));
                        deque.clear();
                        deque.addAll(arrayList);
                        return;
                    }
                }
                str2 = "Attempting to insert a new Screen insert before with an invalid screen ID. The new screen was not added.";
            }
        }
        AbstractC25241Le.A02("CDSBloksBottomSheetDelegate", str2);
    }

    public final void A0K(VBq vBq, Runnable runnable) {
        this.A0C = runnable;
        if (this.A09 == U6H.A07) {
            this.A0F = true;
            this.A00 = 1;
            return;
        }
        DialogC51582Yg dialogC51582Yg = this.A07;
        if (dialogC51582Yg == null) {
            return;
        }
        this.A0F = true;
        this.A00 = 1;
        if (vBq.A00 == C05F.A0C) {
            dialogC51582Yg.A03();
        } else {
            dialogC51582Yg.dismiss();
        }
    }

    public final void A0L(C65981Txa c65981Txa) {
        CdsOpenScreenDismissCallback cdsOpenScreenDismissCallback = c65981Txa.A00;
        if (cdsOpenScreenDismissCallback != null) {
            cdsOpenScreenDismissCallback.DAh(this.A00);
        }
        Runnable runnable = this.A0C;
        if (runnable != null) {
            runnable.run();
        }
        this.A03 = null;
        this.A02 = null;
        this.A07 = null;
        this.A0C = null;
        this.A01 = null;
    }

    public final void A0M(C65981Txa c65981Txa) {
        C66206U4c c66206U4c;
        C66213U4j c66213U4j;
        if (c65981Txa != null && !c65981Txa.A0J && (c66206U4c = this.A03) != null && AbstractC25291Lj.A00.EpP() && c66206U4c.A04 == null && (c66213U4j = c66206U4c.A06) != null && c66213U4j.getAlpha() != 0.0f) {
            if (c66213U4j.getVisibility() != 0 && c66213U4j.getAlpha() != 0.0f) {
                c66213U4j.setAlpha(0.0f);
                return;
            }
            ViewPropertyAnimator animate = c66213U4j.animate();
            animate.setDuration(600L);
            animate.setStartDelay(500L);
            animate.setInterpolator(new PathInterpolator(0.0f, 0.0f, 1.0f, 1.0f));
            animate.alpha(0.0f);
            animate.withEndAction(new U6K(c66213U4j, c66206U4c));
            animate.start();
            c66206U4c.A04 = animate;
        }
    }

    public final void A0N(String str) {
        String str2;
        Deque deque = this.A0G;
        C66212U4i c66212U4i = (C66212U4i) deque.peekFirst();
        if (c66212U4i != null && !str.equals(c66212U4i.A03.Aga())) {
            Iterator it = deque.iterator();
            while (it.hasNext()) {
                C66212U4i c66212U4i2 = (C66212U4i) it.next();
                InterfaceC72001XEp interfaceC72001XEp = c66212U4i2.A03;
                if (str.equals(interfaceC72001XEp.Aga())) {
                    if (c66212U4i2.A00 != null) {
                        interfaceC72001XEp.AP7();
                        c66212U4i2.A00 = null;
                    }
                    interfaceC72001XEp.destroy();
                    it.remove();
                    return;
                }
            }
            str2 = "No screen found with target ID, so the screen was not removed.";
        } else {
            str2 = "Attempting to remove the current or only screen in the CDS bottom sheet, so the screen was not removed. Please use pop or dismiss instead.";
        }
        AbstractC25241Le.A02("CDSBloksBottomSheetDelegate", str2);
    }

    public C66204U4a(C68716Vas c68716Vas) {
        this.A0G = new ArrayDeque();
        this.A0H = new ArrayList();
        this.A0E = false;
        this.A0F = false;
        this.A0D = true;
        this.A0I = c68716Vas;
    }

    public C66204U4a() {
        this(null);
    }
}
