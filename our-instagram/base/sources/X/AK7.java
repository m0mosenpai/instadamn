package X;

import android.content.Context;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class AK7 {
    public final Context A00;
    public final InteractiveDrawableContainer A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;

    public AK7(View view, AbstractC59962oe abstractC59962oe, C1810281e c1810281e, InteractiveDrawableContainer interactiveDrawableContainer) {
        AbstractC167027dH.A0a(1, interactiveDrawableContainer, abstractC59962oe, view, c1810281e);
        this.A01 = interactiveDrawableContainer;
        this.A00 = view.getContext();
        B8T b8t = new B8T(c1810281e, 22);
        InterfaceC09390do A01 = B8T.A01(new B8T(abstractC59962oe, 19), EnumC09460dv.A02, 20);
        this.A07 = new C60842q8(new B8T(A01, 21), b8t, new B61(23, null, A01), new C0YZ(C186238Nr.class));
        this.A04 = C1XM.A00(new B8T(view, 16));
        this.A06 = C1XM.A00(new B8T(this, 18));
        this.A05 = C1XM.A00(new B8T(this, 17));
        this.A03 = C1XM.A00(new B8T(this, 15));
        this.A02 = C1XM.A00(new B8T(this, 14));
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57160PZe(viewLifecycleOwner, c07s, this, (InterfaceC23621Ds) null, 1), C07Y.A00(viewLifecycleOwner));
    }

    public static final C191048d0 A00(AK7 ak7, int i) {
        C191048d0 c191048d0;
        BEd A0N = ak7.A01.A0N(i);
        Drawable drawable = null;
        if (A0N != null) {
            drawable = ((C9LJ) A0N).A0B;
        }
        if ((drawable instanceof C191048d0) && (c191048d0 = (C191048d0) drawable) != null) {
            return c191048d0;
        }
        throw AbstractC166987dD.A14("Drawable not found");
    }

    public static final void A01(AK7 ak7) {
        C8P8 c8p8;
        Object obj;
        Object obj2;
        Object A0J = AbstractC001800i.A0J(ak7.A01.A0R(C23537Abr.A00));
        if (A0J instanceof C8P8) {
            c8p8 = (C8P8) A0J;
        } else {
            c8p8 = null;
        }
        int i = 1;
        if (c8p8 != null) {
            PromptStickerModel BUK = c8p8.BUK();
            if (!BUK.A0M() || BUK.A0L()) {
                return;
            }
        }
        C186238Nr c186238Nr = (C186238Nr) ak7.A07.getValue();
        C8OJ c8oj = c186238Nr.A00;
        Iterator it = c8oj.A04.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C37669Gi2) obj).A00 == c8oj.A00) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C37669Gi2 c37669Gi2 = (C37669Gi2) obj;
        if (c37669Gi2 != null) {
            List list = c8oj.A05;
            Object A0e = AbstractC167007dF.A0e(list, list.indexOf(c37669Gi2.A01) + 1);
            C14360o3.A0B(A0e, 0);
            c37669Gi2.A01 = A0e;
            if (A0e == c8oj.A02) {
                obj2 = c37669Gi2.A02;
            } else {
                obj2 = c8oj.A03.get(A0e);
            }
            C186238Nr.A00(new C218339l5((Path) obj2), c186238Nr);
        }
        int i2 = Build.VERSION.SDK_INT;
        View A0L = AbstractC167007dF.A0L(ak7.A06);
        if (i2 >= 30) {
            i = 16;
        }
        A0L.performHapticFeedback(i);
    }
}
