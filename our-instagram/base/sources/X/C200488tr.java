package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import java.util.List;

/* renamed from: X.8tr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200488tr extends C2UU {
    public final Context A00;
    public final C8QJ A01;
    public final List A02;
    public final boolean A03;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        int i2 = R.layout.context_menu_item;
        if (i == 2) {
            i2 = R.layout.context_menu_item_secondary;
        }
        View inflate = from.inflate(i2, viewGroup, false);
        int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0A(inflate);
        return new C211019Uy(inflate, this);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Drawable drawable;
        C211019Uy c211019Uy = (C211019Uy) c3oo;
        C14360o3.A0B(c211019Uy, 0);
        List list = this.A02;
        C199928sw c199928sw = (C199928sw) AbstractC001800i.A0O(list, i);
        if (c199928sw != null) {
            Context context = this.A00;
            Drawable drawable2 = context.getDrawable(R.drawable.instagram_check_pano_outline_24);
            TextView textView = c211019Uy.A07;
            String str = c199928sw.A08;
            textView.setText(str);
            UQ7 uq7 = c199928sw.A05;
            if (uq7 != null && (drawable = context.getDrawable(uq7.A00)) != null) {
                drawable.setColorFilter(C3DY.A00(textView.getCurrentTextColor()));
                drawable.setBounds(0, 0, (int) textView.getTextSize(), (int) textView.getTextSize());
                SpannableString spannableString = new SpannableString(str);
                spannableString.setSpan(new C85973sR(drawable), uq7.A03, uq7.A01, uq7.A02);
                textView.setText(spannableString);
            }
            int i2 = c199928sw.A01;
            if (i2 != 0) {
                textView.setMinWidth(i2);
            }
            if (c199928sw.A09) {
                textView.setSingleLine(false);
            }
            Drawable drawable3 = c199928sw.A04;
            if (drawable3 != null) {
                ImageView imageView = c211019Uy.A05;
                imageView.setImageDrawable(drawable3);
                imageView.setVisibility(0);
                int i3 = c199928sw.A02;
                if (i3 != 0) {
                    imageView.getLayoutParams().height = i3;
                    imageView.getLayoutParams().width = i3;
                }
                imageView.setColorFilter(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_icon)));
            }
            boolean z = c199928sw.A0E;
            if (!z) {
                drawable2 = c199928sw.A03;
            }
            ImageView imageView2 = c211019Uy.A04;
            if (drawable2 != null) {
                imageView2.setImageDrawable(drawable2);
                imageView2.setVisibility(0);
                int i4 = c199928sw.A00;
                if (i4 != 0) {
                    imageView2.getLayoutParams().height = i4;
                    imageView2.getLayoutParams().width = i4;
                }
                imageView2.setColorFilter(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_icon)));
            } else {
                ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.setMarginStart(0);
                }
            }
            if (c199928sw.A0F) {
                TextView textView2 = c211019Uy.A06;
                textView2.setVisibility(0);
                AbstractC14680og.A01(textView2, C05F.A00, false);
            }
            if (this.A03) {
                int color = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_text_on_color));
                int color2 = context.getColor(R.color.gradient_dark);
                int color3 = context.getColor(R.color.badge_color);
                int color4 = context.getColor(R.color.grey_4);
                if (z) {
                    color = color3;
                } else if (c199928sw.A0D) {
                    color = color4;
                }
                textView.setTextColor(color);
                if (drawable3 != null) {
                    c211019Uy.A05.setColorFilter(color);
                }
                if (c199928sw.A03 != null) {
                    imageView2.setColorFilter(color);
                }
                c211019Uy.A01.setBackgroundColor(color2);
            }
            Integer num = c199928sw.A07;
            if (num != null) {
                int color5 = context.getColor(num.intValue());
                c211019Uy.A05.setColorFilter(color5);
                imageView2.setColorFilter(color5);
                textView.setTextColor(color5);
            }
            View view = c211019Uy.A00;
            C0fQ.A00(new ViewOnClickListenerC23232ARq(c199928sw, this), view);
            view.setOnTouchListener(new ATJ(c199928sw));
            view.setContentDescription(str);
            boolean z2 = c199928sw.A0C;
            if (z2) {
                AbstractC56952jT.A04(view, C05F.A01);
            }
            if (i == list.size() - 1 || !c199928sw.A0A) {
                c211019Uy.A01.setVisibility(8);
            }
            boolean z3 = c199928sw.A0B;
            View view2 = c211019Uy.A02;
            if (z3) {
                view2.setVisibility(0);
            } else {
                view2.setVisibility(8);
            }
            view.setAlpha(1.0f);
            view.setClickable(z2);
        }
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onViewRecycled(C3OO c3oo) {
        C211019Uy c211019Uy = (C211019Uy) c3oo;
        C14360o3.A0B(c211019Uy, 0);
        FrameLayout frameLayout = c211019Uy.A03;
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
            frameLayout.setVisibility(8);
        }
    }

    public C200488tr(Context context, C8QJ c8qj, List list, boolean z) {
        this.A00 = context;
        this.A02 = list;
        this.A01 = c8qj;
        this.A03 = z;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(2063400805);
        int size = this.A02.size();
        C0f9.A0A(-900510729, A03);
        return size;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r2 == false) goto L6;
     */
    @Override // X.C2UU, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getItemViewType(int r5) {
        /*
            r4 = this;
            r0 = 864652947(0x33898e93, float:6.405494E-8)
            int r3 = X.C0f9.A03(r0)
            java.util.List r0 = r4.A02
            java.lang.Object r0 = X.AbstractC001800i.A0O(r0, r5)
            X.8sw r0 = (X.C199928sw) r0
            if (r0 == 0) goto L19
            boolean r2 = r0.A0D
            r1 = 2
            r0 = -717482917(0xffffffffd53c145b, float:-1.2924726E13)
            if (r2 != 0) goto L1d
        L19:
            r1 = 1
            r0 = -1861165941(0xffffffff9110dc8b, float:-1.1427557E-28)
        L1d:
            X.C0f9.A0A(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200488tr.getItemViewType(int):int");
    }
}
