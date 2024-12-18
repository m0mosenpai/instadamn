package X;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;

/* loaded from: classes5.dex */
public final class D86 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final boolean A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D86(boolean z, int i) {
        super(0);
        this.A00 = i;
        this.A01 = z;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 1:
            case 5:
                return AbstractC25230BEn.A0U(Boolean.valueOf(this.A01));
            case 2:
                int i = 0;
                if (this.A01) {
                    i = 60;
                }
                return new C119145aW(i);
            case 3:
            case 4:
            case 6:
            case 9:
            default:
                return Boolean.valueOf(this.A01);
            case 7:
            case 10:
                int i2 = 0;
                if (this.A01) {
                    i2 = 12;
                }
                return Integer.valueOf(i2);
            case 8:
                if (this.A01) {
                    return new AbstractC61802rh() { // from class: X.9V8
                        public AbstractC70763Fo A00;
                        public final int A01 = 2;
                        public final int A02 = 2;
                        public final int A03 = 4;

                        @Override // X.AbstractC61802rh
                        public final int A02(AbstractC70663Fe abstractC70663Fe, int i3, int i4) {
                            View A03;
                            int A0C;
                            C14360o3.A0B(abstractC70663Fe, 0);
                            if (!(abstractC70663Fe instanceof GridLayoutManager) || (A03 = A03(abstractC70663Fe)) == null || (A0C = AbstractC70663Fe.A0C(A03)) == -1) {
                                return -1;
                            }
                            int A0U = abstractC70663Fe.A0U();
                            int i5 = this.A03;
                            int i6 = A0C / i5;
                            int i7 = ((A0U + i5) - 1) / i5;
                            if (i3 > 0) {
                                i6++;
                                int i8 = i7 - 1;
                                if (i6 > i8) {
                                    i6 = i8;
                                }
                            } else if (i3 < 0 && i6 - 1 < 0) {
                                i6 = 0;
                            }
                            return i6 * i5;
                        }

                        @Override // X.AbstractC61802rh
                        public final View A03(AbstractC70663Fe abstractC70663Fe) {
                            int abs;
                            C14360o3.A0B(abstractC70663Fe, 0);
                            AbstractC70763Fo abstractC70763Fo = this.A00;
                            if (abstractC70763Fo == null || !C14360o3.A0K(abstractC70763Fo.A02, abstractC70663Fe)) {
                                abstractC70763Fo = new C70773Fp(abstractC70663Fe);
                                this.A00 = abstractC70763Fo;
                            }
                            int A0T = abstractC70663Fe.A0T();
                            View view = null;
                            if (A0T != 0) {
                                int i3 = Integer.MAX_VALUE;
                                int i4 = this.A01 * this.A02;
                                for (int i5 = 0; i5 < A0T; i5++) {
                                    View A0e = abstractC70663Fe.A0e(i5);
                                    if (A0e != null && AbstractC70663Fe.A0C(A0e) % i4 == 0 && (abs = Math.abs(abstractC70763Fo.A0D(A0e) - abstractC70763Fo.A06())) < i3) {
                                        view = A0e;
                                        i3 = abs;
                                    }
                                }
                            }
                            return view;
                        }

                        @Override // X.AbstractC61802rh
                        public final int[] A09(View view, AbstractC70663Fe abstractC70663Fe) {
                            AbstractC167007dF.A1K(abstractC70663Fe, view);
                            AbstractC70763Fo abstractC70763Fo = this.A00;
                            if (abstractC70763Fo == null || !C14360o3.A0K(abstractC70763Fo.A02, abstractC70663Fe)) {
                                abstractC70763Fo = new C70773Fp(abstractC70663Fe);
                                this.A00 = abstractC70763Fo;
                            }
                            return new int[]{abstractC70763Fo.A0D(view) - abstractC70763Fo.A06(), 0};
                        }
                    };
                }
                return null;
        }
    }
}
