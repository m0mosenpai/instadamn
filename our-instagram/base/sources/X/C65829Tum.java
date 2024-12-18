package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Tum, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65829Tum extends AbstractC70653Fc {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final C6B0 A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C65829Tum) {
                C65829Tum c65829Tum = (C65829Tum) obj;
                if (Float.compare(this.A01, c65829Tum.A01) != 0 || Float.compare(this.A02, c65829Tum.A02) != 0 || Float.compare(this.A00, c65829Tum.A00) != 0 || this.A03 != c65829Tum.A03 || this.A04 != c65829Tum.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A00(AbstractC166997dE.A00(Float.floatToIntBits(this.A01) * 31, this.A02), this.A00) + this.A03) * 31) + this.A04.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ItemDecoration(spacingBefore=");
        sb.append(this.A01);
        sb.append(", spacingBetween=");
        sb.append(this.A02);
        sb.append(", spacingAfter=");
        sb.append(this.A00);
        sb.append(AbstractC111324zv.A00(281));
        sb.append(this.A03);
        sb.append(", alignItems=");
        return AbstractC167017dG.A0o(this.A04, sb);
    }

    public C65829Tum(C6B0 c6b0, float f, float f2, float f3, int i) {
        this.A01 = f;
        this.A02 = f2;
        this.A00 = f3;
        this.A03 = i;
        this.A04 = c6b0;
    }

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        AbstractC65828Tul abstractC65828Tul;
        int height;
        int A00;
        boolean A1a = AbstractC167017dG.A1a(rect, view);
        C14360o3.A0B(recyclerView, 2);
        C2UU c2uu = recyclerView.A0A;
        String str = null;
        if ((c2uu instanceof AbstractC65828Tul) && (abstractC65828Tul = (AbstractC65828Tul) c2uu) != null) {
            int A02 = RecyclerView.A02(view);
            int itemCount = abstractC65828Tul.getItemCount();
            if (A02 != -1 && A02 < itemCount) {
                AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
                C14360o3.A0C(abstractC70663Fe, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                int layoutDirection = abstractC70663Fe.A07.getLayoutDirection();
                int i = 0;
                boolean A1P = AbstractC167007dF.A1P(layoutDirection, A1a ? 1 : 0);
                C102884kP c102884kP = ((U48) abstractC65828Tul.A03.get(A02)).A01;
                C14360o3.A0C(c102884kP, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
                C102884kP A08 = c102884kP.A08(132);
                if (A08 != null) {
                    str = A08.A0H();
                }
                C6B0 A002 = AbstractC65985Txe.A00(this.A04, str);
                int i2 = this.A03;
                if (i2 == A1a) {
                    height = recyclerView.getWidth();
                } else {
                    height = recyclerView.getHeight();
                }
                C135266Ab A01 = ((U48) abstractC65828Tul.A03.get(A02)).A00.A01();
                if (A01 != null) {
                    C79243gV c79243gV = A01.A01;
                    if (i2 == A1a) {
                        A00 = c79243gV.A01();
                    } else {
                        A00 = c79243gV.A00();
                    }
                    int i3 = height - A00;
                    int ordinal = A002.ordinal();
                    if (ordinal != A1a) {
                        if (ordinal == 2) {
                            i = i3;
                        }
                    } else {
                        i = C1H4.A00(i3 / 2.0d);
                    }
                    if (i2 == A1a) {
                        if (A1P) {
                            rect.right = i;
                        } else {
                            rect.left = i;
                        }
                    } else {
                        rect.top = i;
                    }
                }
                if (A02 == 0) {
                    int i4 = (int) this.A01;
                    if (i2 == A1a) {
                        rect.top = i4;
                    } else if (A1P) {
                        rect.right = i4;
                    } else {
                        rect.left = i4;
                    }
                }
                int i5 = itemCount - (A1a ? 1 : 0);
                if (A02 < i5) {
                    int i6 = (int) this.A02;
                    if (i2 == A1a) {
                        rect.bottom = i6;
                    } else if (A1P) {
                        rect.left = i6;
                    } else {
                        rect.right = i6;
                    }
                }
                if (A02 == i5) {
                    int i7 = (int) this.A00;
                    if (i2 == A1a) {
                        rect.bottom = i7;
                    } else if (A1P) {
                        rect.left = i7;
                    } else {
                        rect.right = i7;
                    }
                }
            }
        }
    }
}
