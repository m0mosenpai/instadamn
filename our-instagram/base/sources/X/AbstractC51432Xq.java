package X;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* renamed from: X.2Xq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC51432Xq {
    public static final Interpolator A00;
    public static final InterfaceC89793zL A01;
    public static final InterfaceC89793zL A02;
    public static final InterfaceC89793zL A03;
    public static final EnumC76913cd A04;

    static {
        final C89773zJ c89773zJ = C89773zJ.A02;
        InterfaceC89793zL interfaceC89793zL = new InterfaceC89793zL(c89773zJ) { // from class: X.3zK
            public final C89773zJ A00;

            @Override // X.InterfaceC89793zL
            public final AbstractC107464sr ALd(final C107444sp c107444sp) {
                final C89773zJ c89773zJ2 = this.A00;
                return new AbstractC107464sr(c107444sp, c89773zJ2) { // from class: X.5is
                    public final C107444sp A00;
                    public final C89773zJ A01;

                    @Override // X.AbstractC107474ss
                    public final void A0A(ArrayList arrayList) {
                        arrayList.add(this.A00);
                    }

                    @Override // X.AbstractC107464sr
                    public final void A0C(C42Q c42q) {
                        C52t c52t = new C52t(this.A01);
                        C107444sp c107444sp2 = this.A00;
                        C107434so c107434so = c107444sp2.A01;
                        C107624t7 c107624t7 = new C107624t7(c42q.Aur(c107434so));
                        C107624t7 c107624t72 = new C107624t7(c107444sp2.A00);
                        C107534sy c107534sy = ((AbstractC107464sr) this).A00;
                        c107534sy.A01(c107624t7, c52t, "initial");
                        c107534sy.A01(c107624t72, c52t, "end");
                        c107534sy.A01(c52t, c42q.Abp(c107434so), "default_input");
                    }

                    {
                        this.A00 = c107444sp;
                        this.A01 = c89773zJ2;
                    }
                };
            }

            {
                this.A00 = c89773zJ;
            }
        };
        A03 = interfaceC89793zL;
        final C89773zJ c89773zJ2 = C89773zJ.A03;
        A02 = new InterfaceC89793zL(c89773zJ2) { // from class: X.3zK
            public final C89773zJ A00;

            @Override // X.InterfaceC89793zL
            public final AbstractC107464sr ALd(final C107444sp c107444sp) {
                final C89773zJ c89773zJ22 = this.A00;
                return new AbstractC107464sr(c107444sp, c89773zJ22) { // from class: X.5is
                    public final C107444sp A00;
                    public final C89773zJ A01;

                    @Override // X.AbstractC107474ss
                    public final void A0A(ArrayList arrayList) {
                        arrayList.add(this.A00);
                    }

                    @Override // X.AbstractC107464sr
                    public final void A0C(C42Q c42q) {
                        C52t c52t = new C52t(this.A01);
                        C107444sp c107444sp2 = this.A00;
                        C107434so c107434so = c107444sp2.A01;
                        C107624t7 c107624t7 = new C107624t7(c42q.Aur(c107434so));
                        C107624t7 c107624t72 = new C107624t7(c107444sp2.A00);
                        C107534sy c107534sy = ((AbstractC107464sr) this).A00;
                        c107534sy.A01(c107624t7, c52t, "initial");
                        c107534sy.A01(c107624t72, c52t, "end");
                        c107534sy.A01(c52t, c42q.Abp(c107434so), "default_input");
                    }

                    {
                        this.A00 = c107444sp;
                        this.A01 = c89773zJ22;
                    }
                };
            }

            {
                this.A00 = c89773zJ2;
            }
        };
        A04 = EnumC76913cd.LOCAL;
        A01 = interfaceC89793zL;
        A00 = new AccelerateDecelerateInterpolator();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.3zN, X.3zO] */
    public static C89813zN A00(EnumC76913cd enumC76913cd, String str) {
        Integer num;
        if (enumC76913cd == EnumC76913cd.GLOBAL) {
            num = C05F.A0N;
        } else if (enumC76913cd == EnumC76913cd.LOCAL) {
            num = C05F.A01;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unhandled TransitionKeyType ");
            sb.append(enumC76913cd);
            throw new RuntimeException(sb.toString());
        }
        ?? abstractC89823zO = new AbstractC89823zO();
        abstractC89823zO.A00 = new C89833zP(num, str);
        return abstractC89823zO;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.3zN, X.3zO] */
    public static C89813zN A01(EnumC76913cd enumC76913cd, String... strArr) {
        Integer num;
        if (enumC76913cd == EnumC76913cd.GLOBAL) {
            num = C05F.A0Y;
        } else if (enumC76913cd == EnumC76913cd.LOCAL) {
            num = C05F.A0C;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unhandled TransitionKeyType ");
            sb.append(enumC76913cd);
            throw new RuntimeException(sb.toString());
        }
        ?? abstractC89823zO = new AbstractC89823zO();
        abstractC89823zO.A00 = new C89833zP(num, strArr);
        return abstractC89823zO;
    }
}
