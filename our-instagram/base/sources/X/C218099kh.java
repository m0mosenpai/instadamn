package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.9kh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218099kh extends ACt implements C1NJ {
    public Bitmap A00;
    public Drawable A01;
    public C148276lx A02;
    public List A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Context A07;
    public final UserSession A08;
    public final C89F A09;
    public final TargetViewSizeProvider A0A;
    public final C88Y A0B;
    public final ABX A0C;
    public final C23108AGw A0D;

    public static final void A03(C218099kh c218099kh, List list, int i) {
        C88Y c88y = c218099kh.A0B;
        Drawable drawable = c218099kh.A01;
        C23108AGw c23108AGw = c218099kh.A0D;
        c23108AGw.A0N = false;
        c88y.A0C(drawable, new C8FC(c23108AGw), true);
        if (i == list.size()) {
            C88E c88e = c88y.A00;
            c88e.A05();
            c218099kh.A06 = false;
            List list2 = c218099kh.A03;
            c88e.A01.A00();
            A00(c218099kh);
            c88y.A0G(c88e.A01.A01.A08(), list2);
            return;
        }
        C38321qM c38321qM = (C38321qM) list.get(i);
        if (c38321qM.A63()) {
            C121275eQ A00 = AbstractC50633MWu.A00(c218099kh.A07, c218099kh.A08, c38321qM, "CanvasEndOfYearController");
            A00.A00 = new C215919h7(i, 2, c38321qM, c218099kh, list);
            C1GJ.A03(A00);
            return;
        }
        C5GJ c5gj = C5GJ.CREATE_MODE_USER_SEARCH;
        C8FC A02 = AMV.A02(c218099kh.A07, c218099kh.A0A, c38321qM);
        C88E c88e2 = c88y.A00;
        c88e2.A01.A00();
        C194808jg A0Q = c88e2.A01.A03.A0Q(c5gj, c38321qM, A02);
        Drawable drawable2 = c218099kh.A01;
        c23108AGw.A0N = false;
        C88Y.A01(drawable2, c88y, c23108AGw, false);
        A0Q.A9I(new C23677AeC(A0Q, c218099kh, c38321qM, list, i, 2));
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        boolean A1R = AbstractC167007dF.A1R(0, interfaceC59502nt, c73033Pe);
        Object C4x = interfaceC59502nt.C4x();
        if (C4x != null) {
            if (C4x.equals(0)) {
                C88Y c88y = this.A0B;
                if (c88y.A0L(this)) {
                    c88y.A07();
                    Bitmap bitmap = c73033Pe.A01;
                    if (bitmap != null) {
                        this.A00 = AbstractC226439z0.A00(bitmap, this.A0A);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(this.A07.getResources(), this.A00);
                        this.A01 = bitmapDrawable;
                        C23108AGw c23108AGw = this.A0D;
                        c23108AGw.A0N = A1R;
                        C88Y.A01(bitmapDrawable, c88y, c23108AGw, A1R);
                        A01(this);
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                return;
            }
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    public static final void A00(C218099kh c218099kh) {
        C148276lx c148276lx = c218099kh.A02;
        if (c148276lx != null) {
            C194808jg A01 = C194808jg.A01(c218099kh.A07, c218099kh.A08, c148276lx);
            c218099kh.A0B.A0B(A01, C5GJ.CREATE_MODE_DIAL_SELECTION, c148276lx, new C8FC((C8D0) new C183748Cz(0.5f, 0.9f), (C8FD) null, (C89G) null, C05F.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, -2, false, false, true, true, false, false, true, true, true, true, true, true, false, false), false, false);
        }
    }

    public static final void A01(C218099kh c218099kh) {
        ABX abx;
        String str;
        Reel A0M;
        if (c218099kh.A01 != null && !c218099kh.A05 && (str = (abx = c218099kh.A0C).A01) != null && (A0M = abx.A03.A0M(str)) != null) {
            List A0K = A0M.A0K();
            C14360o3.A07(A0K);
            java.util.Set A0Q = A0M.A0Q();
            C14360o3.A07(A0Q);
            List A0g = AbstractC001800i.A0g(A0Q, new C50585MUv(A0K, 7));
            if (A0g != null) {
                A03(c218099kh, A0g, 0);
            }
        }
    }

    public static final void A02(C218099kh c218099kh) {
        ABX abx = c218099kh.A0C;
        String str = abx.A02;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        C6C0.A01(new C207879Ht(c218099kh, 8), c218099kh.A08, str);
        String str3 = abx.A00;
        if (str3 != null) {
            str2 = str3;
        }
        c218099kh.A00 = null;
        C1OG A0J = C25821No.A00().A0J(new SimpleImageUrl(str2), null);
        A0J.A02(c218099kh);
        A0J.A08 = 0;
        A0J.A01();
    }

    public C218099kh(Context context, UserSession userSession, C89F c89f, TargetViewSizeProvider targetViewSizeProvider, C88Y c88y) {
        AbstractC167017dG.A1P(c88y, c89f);
        C14360o3.A0B(userSession, 4);
        C14360o3.A0B(targetViewSizeProvider, 6);
        this.A0B = c88y;
        this.A09 = c89f;
        this.A07 = context;
        this.A08 = userSession;
        this.A0A = targetViewSizeProvider;
        this.A03 = AbstractC166987dD.A1E();
        C23108AGw c23108AGw = new C23108AGw();
        c23108AGw.A0R = false;
        this.A0D = c23108AGw;
        this.A0C = (ABX) userSession.A01(ABX.class, new C50151MDe(userSession, 29));
    }
}
