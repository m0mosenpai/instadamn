package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.webkit.MimeTypeMap;
import com.instagram.common.typedurl.ImageCacheKey;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.1Vs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C27651Vs {
    public final C25761Ni A00;
    public final boolean A02;
    public final boolean A04;
    public final boolean A05;
    public final NullPointerException A03 = new NullPointerException("No image URI was specified!");
    public final C27681Vw A01 = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.7UR] */
    /* JADX WARN: Type inference failed for: r8v5, types: [X.UMJ, X.74M] */
    public final C1W1 A01(C2nP c2nP, Object obj) {
        ImageUrl imageUrl;
        C59162nH c59162nH;
        C59472nq c59472nq;
        Object obj2;
        InterfaceC59172nI interfaceC59172nI = c2nP.A02;
        boolean z = interfaceC59172nI instanceof C59462np;
        if (z) {
            imageUrl = new SimpleImageUrl(((C59462np) interfaceC59172nI).A01.toString());
        } else if (interfaceC59172nI instanceof C59162nH) {
            imageUrl = ((C59162nH) interfaceC59172nI).A05;
        } else {
            if (interfaceC59172nI instanceof C135586Bj) {
                NullPointerException nullPointerException = this.A03;
                C1W1 c1w1 = new C1W1();
                c1w1.A0A(nullPointerException);
                return c1w1;
            }
            throw new IllegalArgumentException("Unsupported image source!");
        }
        if (obj != null) {
            if (z) {
                java.util.Set set = AbstractC131705x6.A00;
                C59462np c59462np = (C59462np) interfaceC59172nI;
                Map map = c59462np.A02;
                if (map != null) {
                    obj2 = map.get("image_format");
                } else {
                    obj2 = null;
                }
                Object obj3 = null;
                if (obj2 instanceof String) {
                    obj3 = obj2;
                }
                if (AbstractC001800i.A0u(set, obj3)) {
                    ?? umj = new UMJ();
                    C7UR c7ur = C7UR.A0A;
                    Context context = AbstractC12290kX.A00;
                    C14360o3.A07(context);
                    C7US.A00(context).A06(umj, c59462np.A01.toString(), true, false, false);
                    c59472nq = umj;
                    return c59472nq;
                }
                C14360o3.A0B(imageUrl, 0);
                if (C14360o3.A0K(MimeTypeMap.getFileExtensionFromUrl(imageUrl.getUrl()), "kf")) {
                    C58632mM c58632mM = C58632mM.A00;
                    android.net.Uri uri = c59462np.A01;
                    String A03 = AnonymousClass001.A03(uri.hashCode(), ".kf");
                    return new JYB(new C3LW(new C3LV(A03, uri.toString()), A03), new WVD(), c58632mM);
                }
            }
            C27681Vw c27681Vw = this.A01;
            C27771Wf c27771Wf = c2nP.A01;
            C5FF c5ff = c27771Wf.A0O;
            boolean z2 = interfaceC59172nI instanceof C59162nH;
            InterfaceC59142nF interfaceC59142nF = null;
            if (z2 && (c59162nH = (C59162nH) interfaceC59172nI) != null) {
                interfaceC59142nF = c59162nH.A06;
            }
            C59472nq c59472nq2 = new C59472nq(c27681Vw, c5ff, interfaceC59142nF);
            C1OG A0J = C25821No.A00().A0J(imageUrl, obj.toString());
            A0J.A02(c59472nq2);
            boolean z3 = false;
            A0J.A0I = false;
            if (z2) {
                C59162nH c59162nH2 = (C59162nH) interfaceC59172nI;
                A0J.A01 = c59162nH2.A01;
                A0J.A00 = c59162nH2.A00;
                A0J.A0M = c59162nH2.A09;
                A0J.A0E = c59162nH2.A08;
                A0J.A09 = c59162nH2.A07;
                A0J.A02 = c59162nH2.A02;
                A0J.A0C = new WeakReference(c59472nq2);
                if (C14360o3.A0K(c27771Wf.A0P, true)) {
                    C80673iw c80673iw = c59162nH2.A04;
                    if (c80673iw == null) {
                        c80673iw = new C80673iw();
                    }
                    A0J.A04 = c80673iw;
                    A0J.A0D = new WeakReference(c59472nq2);
                }
                if (this.A00 != null && this.A02) {
                    z3 = true;
                }
                A0J.A0N = z3;
                A0J.A0O = c59162nH2.A0B;
                A0J.A0L = c59162nH2.A0A;
            }
            A0J.A0J = true;
            A0J.A00().E7X();
            c59472nq = c59472nq2;
            return c59472nq;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0R("No caller context set to fetch image ", imageUrl.getUrl()));
    }

    public final C2nP A02(Resources resources, C27771Wf c27771Wf, InterfaceC59172nI interfaceC59172nI, boolean z) {
        C14360o3.A0B(resources, 0);
        C14360o3.A0B(interfaceC59172nI, 1);
        if (c27771Wf == null) {
            c27771Wf = C27771Wf.A0b;
        }
        return new C2nP(resources, c27771Wf, interfaceC59172nI, z);
    }

    public final C1VO A00(C2nP c2nP) {
        C25761Ni c25761Ni;
        C61292qr A03;
        EnumC59482nr enumC59482nr;
        C27681Vw c27681Vw;
        C5FF c5ff;
        Bitmap bitmap;
        C25761Ni c25761Ni2;
        int i;
        InterfaceC59172nI interfaceC59172nI = c2nP.A02;
        InterfaceC59142nF interfaceC59142nF = null;
        if ((interfaceC59172nI instanceof C59162nH) && (c25761Ni2 = this.A00) != null) {
            C59162nH c59162nH = (C59162nH) interfaceC59172nI;
            ImageUrl imageUrl = c59162nH.A05;
            Object AjX = imageUrl.AjX();
            C14360o3.A07(AjX);
            int i2 = c59162nH.A01;
            float f = c59162nH.A00;
            C14360o3.A07(imageUrl.getUrl());
            A03 = c25761Ni2.A03((ImageCacheKey) AjX, f, i2);
            if (A03 != null) {
                i = A03.A01;
                if (i == -1 || i >= 6) {
                    enumC59482nr = EnumC59482nr.A03;
                    c27681Vw = this.A01;
                    c5ff = c2nP.A01.A0O;
                    interfaceC59142nF = c59162nH.A06;
                }
            } else {
                i = 0;
            }
            if (!this.A05 || i <= 0 || A03 == null) {
                return null;
            }
            enumC59482nr = EnumC59482nr.A06;
            c27681Vw = this.A01;
            c5ff = c2nP.A01.A0O;
            interfaceC59142nF = c59162nH.A06;
        } else {
            if (!this.A04 || !(interfaceC59172nI instanceof C59462np) || (c25761Ni = this.A00) == null) {
                return null;
            }
            SimpleImageUrl simpleImageUrl = new SimpleImageUrl(((C59462np) interfaceC59172nI).A01.toString());
            Object AjX2 = simpleImageUrl.AjX();
            C14360o3.A07(AjX2);
            C14360o3.A07(simpleImageUrl.A02);
            A03 = c25761Ni.A03((ImageCacheKey) AjX2, -1.0f, 1);
            if (A03 == null) {
                return null;
            }
            enumC59482nr = EnumC59482nr.A03;
            c27681Vw = this.A01;
            c5ff = c2nP.A01.A0O;
        }
        C14360o3.A0B(c27681Vw, 2);
        if (c5ff == null || (bitmap = (Bitmap) c5ff.A00(A03.A02, c27681Vw).A04()) == null) {
            bitmap = A03.A02;
            if (interfaceC59142nF != null) {
                bitmap = interfaceC59142nF.renderImage(bitmap);
            }
        }
        C1VO A00 = C1VO.A00(C1VO.A05, C1VO.A06, new C3Q8(bitmap, enumC59482nr, "memory", A03.A01, A03.A00));
        C14360o3.A07(A00);
        return A00;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1Vw, java.lang.Object] */
    public C27651Vs(C25761Ni c25761Ni, boolean z, boolean z2, boolean z3) {
        this.A00 = c25761Ni;
        this.A02 = z;
        this.A04 = z2;
        this.A05 = z3;
    }
}
