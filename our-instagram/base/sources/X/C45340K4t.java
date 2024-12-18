package X;

import android.animation.Animator;
import android.view.ViewGroup;

/* renamed from: X.K4t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45340K4t extends C668630d {
    public final int A00;
    public final Object A01;

    public C45340K4t(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        Integer num;
        switch (this.A00) {
            case 0:
                if (c55982hj.A01 != 0.0d) {
                    return;
                }
                ViewGroup viewGroup = ((LIC) this.A01).A03;
                viewGroup.getClass();
                viewGroup.setVisibility(8);
                return;
            case 1:
                if (c55982hj.A01 != 0.0d) {
                    return;
                }
                LIC lic = (LIC) this.A01;
                Integer num2 = lic.A07;
                num2.getClass();
                int intValue = num2.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue != 2) {
                            return;
                        }
                        lic.A0A.A06(0.0d);
                        return;
                    }
                    num = C05F.A0C;
                } else {
                    num = C05F.A01;
                }
                LIC.A00(lic, num);
                lic.A0B.A03();
                return;
            case 2:
            default:
                super.Dnk(c55982hj);
                return;
            case 3:
                C14360o3.A0B(c55982hj, 0);
                if (c55982hj.A09.A00 == 1.0d) {
                    C44358Jix c44358Jix = (C44358Jix) this.A01;
                    if (c44358Jix.A0H) {
                        c44358Jix.A01();
                        return;
                    }
                }
                C44358Jix c44358Jix2 = (C44358Jix) this.A01;
                if (!c44358Jix2.A0I) {
                    return;
                }
                ((Animator) c44358Jix2.A0D.getValue()).start();
                return;
        }
    }

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
        C55942hf c55942hf;
        if (3 - this.A00 != 0) {
            super.Dnl(c55982hj);
            return;
        }
        C14360o3.A0B(c55982hj, 0);
        double d = c55982hj.A01;
        C44358Jix c44358Jix = (C44358Jix) this.A01;
        if (d == 1.0d) {
            c55942hf = c44358Jix.A06;
        } else {
            c55942hf = c44358Jix.A07;
        }
        c55982hj.A09(c55942hf);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
    
        if (r11 > 270.0f) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r2 == false) goto L21;
     */
    @Override // X.C668630d, X.InterfaceC55932he
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dnm(X.C55982hj r14) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45340K4t.Dnm(X.2hj):void");
    }
}
