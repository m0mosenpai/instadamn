package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.WZw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70515WZw implements InterfaceC72024XFm {
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C70515WZw) {
                C70515WZw c70515WZw = (C70515WZw) obj;
                if (!C14360o3.A0K(this.A01, c70515WZw.A01) || !C14360o3.A0K(this.A00, c70515WZw.A00) || !C14360o3.A0K(this.A02, c70515WZw.A02) || !C14360o3.A0K(this.A03, c70515WZw.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    private final Drawable A00(Context context) {
        Integer num;
        Drawable drawable;
        Integer num2 = this.A01;
        if (num2 != null && (num = this.A00) != null && this.A02 != null && this.A03 != null) {
            C69509Vpi A07 = C2FP.A02().A07();
            int intValue = num2.intValue();
            int intValue2 = num.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue == 4) {
                            drawable = context.getDrawable(R.drawable.instagram_chevron_right_pano_outline_16);
                            if (drawable == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw AbstractC25230BEn.A0n("Invalid icon type: ", intValue);
                        }
                    } else {
                        drawable = context.getDrawable(R.drawable.instagram_x_pano_outline_16);
                        if (drawable == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                } else {
                    drawable = context.getDrawable(R.drawable.instagram_error_pano_filled_24);
                    if (drawable == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            } else {
                drawable = context.getDrawable(R.drawable.instagram_circle_check_filled_16);
                if (drawable == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            drawable.setTint(A07.A00(context, intValue2));
            return drawable;
        }
        return null;
    }

    public final int hashCode() {
        int i = 0;
        int A0M = ((((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31;
        Integer num = this.A03;
        if (num != null) {
            i = num.hashCode();
        }
        return A0M + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ThemedImageResource(iconName=");
        sb.append(this.A01);
        sb.append(", colorType=");
        sb.append(this.A00);
        sb.append(AbstractC111324zv.A00(1420));
        sb.append(this.A02);
        sb.append(AbstractC111324zv.A00(1421));
        return AbstractC167017dG.A0o(this.A03, sb);
    }

    public C70515WZw(Integer num, Integer num2, Integer num3, Integer num4) {
        this.A01 = num;
        this.A00 = num2;
        this.A02 = num3;
        this.A03 = num4;
    }

    @Override // X.InterfaceC72024XFm
    public final void ChW(ImageView imageView) {
        Drawable A00 = A00(AbstractC166997dE.A0L(imageView));
        if (A00 != null) {
            imageView.setImageDrawable(A00);
        }
    }

    @Override // X.InterfaceC72024XFm
    public final void EPs(View view) {
        Drawable A00 = A00(AbstractC166997dE.A0L(view));
        if (A00 != null) {
            view.setBackground(A00);
        }
    }
}
