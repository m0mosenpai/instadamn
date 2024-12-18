package X;

import java.util.HashSet;

/* renamed from: X.4LM, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4LM {
    public static final C4LM A02 = new C4LM(null);
    public final C1GL A00;
    public final HashSet A01;

    public static C1ON A00(AbstractC12990ll abstractC12990ll, String str) {
        C25621Ms c25621Ms = new C25621Ms(abstractC12990ll);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A0L(AbstractC111324zv.A00(3283), str);
        c25621Ms.A0S(EC7.class, C34857FXr.class);
        return c25621Ms.A0N();
    }

    public final void A01(C1P1 c1p1, AbstractC12990ll abstractC12990ll, String str) {
        C25621Ms c25621Ms = new C25621Ms(abstractC12990ll);
        c25621Ms.A06();
        c25621Ms.A0B("video_call/user/");
        c25621Ms.A9s("user_fbid", str);
        c25621Ms.A0S(EC7.class, C34857FXr.class);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = c1p1;
        C1GL c1gl = this.A00;
        if (c1gl != null) {
            c1gl.schedule(A0N);
        } else {
            C1GJ.A03(A0N);
        }
    }

    public final void A02(AbstractC12990ll abstractC12990ll, C7K9 c7k9, String str) {
        if (this.A01.add(str)) {
            C1ON A00 = A00(abstractC12990ll, str);
            A00.A00 = new C32519ETv(abstractC12990ll, c7k9, this, str);
            C1GL c1gl = this.A00;
            if (c1gl != null) {
                c1gl.schedule(A00);
            } else {
                C1GJ.A03(A00);
            }
        }
    }

    public C4LM(C1GL c1gl) {
        this.A01 = new HashSet();
        this.A00 = c1gl;
    }

    public C4LM() {
        this(null);
    }
}
