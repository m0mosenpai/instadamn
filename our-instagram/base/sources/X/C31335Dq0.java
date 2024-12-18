package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.AbstractCollection;

/* renamed from: X.Dq0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31335Dq0 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Drawable A08;
    public View.OnClickListener A09;
    public ImageUrl A0A;
    public ImageUrl A0B;
    public EnumC31337Dq2 A0C;
    public CharSequence A0D;
    public CharSequence A0E;
    public CharSequence A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;

    public static void A02(C31335Dq0 c31335Dq0) {
        c31335Dq0.A0K = true;
        c31335Dq0.A00 = -1;
        c31335Dq0.A0C = EnumC31337Dq2.A05;
        c31335Dq0.A04 = -1;
        c31335Dq0.A0L = true;
        c31335Dq0.A01 = R.id.row_header_action;
    }

    public final void A04(TextView textView) {
        C14360o3.A0B(textView, 0);
        CharSequence charSequence = this.A0E;
        if (charSequence != null && String.valueOf(charSequence).length() != 0) {
            textView.setText(this.A0E);
        } else {
            int i = this.A05;
            if (i != 0) {
                textView.setText(i);
            }
        }
        AbstractC010103p.A0B(textView, new UEI(textView, 2));
    }

    public final void A05(TextView textView, TextView textView2, TextView textView3) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3 = this.A0E;
        if ((charSequence3 != null && charSequence3.length() != 0) || this.A05 != -1) {
            A04(textView);
            textView.setVisibility(0);
            textView.setFocusable(true);
            AbstractC010103p.A0B(textView, new UEI(textView, 3));
            int i = this.A04;
            if (i != -1) {
                textView.setTextAppearance(i);
            }
        }
        if (textView2 != null && (charSequence2 = this.A0F) != null && charSequence2.length() != 0) {
            textView2.setText(this.A0F);
            textView2.setVisibility(0);
            if (textView.getVisibility() == 8) {
                AbstractC13880nE.A0f(textView2, 0);
            }
        }
        if (textView3 != null && (charSequence = this.A0D) != null && charSequence.length() != 0) {
            textView3.setText(charSequence);
            textView3.setVisibility(0);
        }
    }

    public static C31335Dq0 A00(int i) {
        return new C31335Dq0(i);
    }

    public static void A03(AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new C31335Dq0(i));
    }

    public C31335Dq0(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.A05 = -1;
        A02(this);
        this.A0E = charSequence;
        this.A0F = charSequence2;
        this.A0D = charSequence3;
    }

    public static C31335Dq0 A01(Context context, int i) {
        return new C31335Dq0(context.getString(i));
    }

    public C31335Dq0(int i) {
        this.A05 = -1;
        A02(this);
        this.A05 = i;
    }

    public C31335Dq0(CharSequence charSequence) {
        this.A05 = -1;
        A02(this);
        this.A0E = charSequence;
    }
}
