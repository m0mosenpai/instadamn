package X;

import android.view.View;

/* renamed from: X.MmT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC51368MmT extends C3OO {
    public Integer A00;
    public C51752Mtb A01;
    public final View A02;
    public final C51752Mtb[] A03;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC51368MmT(android.view.View r4, boolean r5) {
        /*
            r3 = this;
            if (r5 == 0) goto L28
            android.content.Context r0 = r4.getContext()
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r0)
            r1 = -1
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r1, r1)
            r2.addView(r4, r0)
        L14:
            r3.<init>(r2)
            r3.A02 = r4
            r0 = 3
            java.lang.Integer[] r0 = X.C05F.A00(r0)
            int r0 = r0.length
            X.Mtb[] r0 = new X.C51752Mtb[r0]
            r3.A03 = r0
            java.lang.Integer r0 = X.C05F.A0C
            r3.A00 = r0
            return
        L28:
            r2 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC51368MmT.<init>(android.view.View, boolean):void");
    }

    private final void A00() {
        int i;
        Integer num;
        U8J u8j;
        C50794McB c50794McB;
        int i2;
        AbstractC09800fd.A01("GridItemViewHolder.updateRoundedCorner", 725901927);
        try {
            C51752Mtb[] c51752MtbArr = this.A03;
            int length = c51752MtbArr.length - 1;
            int i3 = length;
            int i4 = 0;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    C51752Mtb c51752Mtb = c51752MtbArr[length];
                    if (c51752Mtb != null) {
                        i = c51752Mtb.A00;
                        num = (Integer) c51752Mtb.A02;
                        while (true) {
                            int i6 = i3 - 1;
                            C51752Mtb c51752Mtb2 = c51752MtbArr[i3];
                            if (c51752Mtb2 == null || (i2 = c51752Mtb2.A01) == -1) {
                                if (i6 < 0) {
                                    break;
                                } else {
                                    i3 = i6;
                                }
                            } else {
                                i4 = i2;
                                break;
                            }
                        }
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            i = -1;
            num = C05F.A0C;
            C51752Mtb c51752Mtb3 = new C51752Mtb(num, i4, i, 2);
            if (!c51752Mtb3.equals(this.A01)) {
                this.A01 = c51752Mtb3;
                Integer num2 = (Integer) c51752Mtb3.A02;
                int i7 = c51752Mtb3.A01;
                int i8 = c51752Mtb3.A00;
                N0H n0h = (N0H) this;
                C14360o3.A0B(num2, 0);
                if (n0h.A02) {
                    View view = n0h.A01.A03;
                    if (num2 == C05F.A01) {
                        float f = i7;
                        if (f > 0.0f) {
                            U8J u8j2 = n0h.A00;
                            if (u8j2 == null || u8j2.A01 != i7) {
                                view.setForeground(null);
                                n0h.A00 = null;
                            }
                            if (f == 0.0f) {
                                c50794McB = null;
                            } else {
                                c50794McB = new C50794McB(f, 1);
                            }
                            view.setOutlineProvider(c50794McB);
                            view.setClipToOutline(true);
                        }
                    }
                    if (num2 == C05F.A00 && i7 > 0.0f) {
                        view.setOutlineProvider(null);
                        view.setClipToOutline(false);
                        if (i8 != -1 && ((u8j = n0h.A00) == null || u8j.A01 != i7 || u8j.A00 != i8)) {
                            U8J u8j3 = new U8J(i7, i8);
                            n0h.A00 = u8j3;
                            view.setForeground(u8j3);
                        }
                    } else {
                        if (n0h.A00 != null) {
                            n0h.A00 = null;
                            view.setForeground(null);
                        }
                        if (view.getOutlineProvider() != null) {
                            view.setOutlineProvider(null);
                            view.setClipToOutline(false);
                        }
                    }
                }
            }
            AbstractC09800fd.A00(-583837356);
        } catch (Throwable th) {
            AbstractC09800fd.A00(-259116533);
            throw th;
        }
    }

    public final void A01(Integer num) {
        AbstractC09800fd.A01("GridItemViewHolder.unApplyRoundedCorner", -2080576701);
        try {
            C51752Mtb[] c51752MtbArr = this.A03;
            int A03 = AbstractC50522MSa.A03(num.intValue());
            if (c51752MtbArr[A03] != null) {
                c51752MtbArr[A03] = null;
                A00();
            }
            AbstractC09800fd.A00(-1264568696);
        } catch (Throwable th) {
            AbstractC09800fd.A00(1925666905);
            throw th;
        }
    }

    public final void A02(Integer num, Integer num2, int i, int i2) {
        AbstractC09800fd.A01("GridItemViewHolder.applyRoundedCorner", -759206031);
        try {
            C51752Mtb[] c51752MtbArr = this.A03;
            int A03 = AbstractC50522MSa.A03(num2.intValue());
            C51752Mtb c51752Mtb = c51752MtbArr[A03];
            if (c51752Mtb == null || ((Integer) c51752Mtb.A02) != num || c51752Mtb.A01 != i || c51752Mtb.A00 != i2) {
                c51752MtbArr[A03] = new C51752Mtb(num, i, i2, 2);
                A00();
            }
            AbstractC09800fd.A00(1878834303);
        } catch (Throwable th) {
            AbstractC09800fd.A00(625592737);
            throw th;
        }
    }
}
