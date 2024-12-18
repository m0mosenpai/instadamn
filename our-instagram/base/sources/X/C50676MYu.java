package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;

/* renamed from: X.MYu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50676MYu {
    public int A00;
    public int A01;
    public int A02;
    public String A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final float A07;
    public final int A08;
    public final int A09;
    public final View.OnClickListener A0A;

    public C50676MYu(Context context, View.OnClickListener onClickListener, int i) {
        C14360o3.A0B(onClickListener, 3);
        this.A01 = 1;
        this.A05 = true;
        this.A02 = i;
        this.A0A = onClickListener;
        this.A08 = AbstractC53242c7.A07(context);
        this.A07 = 1.0f;
        this.A09 = 0;
    }

    public C50676MYu(View.OnClickListener onClickListener, String str, float f, int i, int i2, int i3) {
        this.A01 = 1;
        this.A05 = true;
        this.A04 = str;
        this.A0A = onClickListener;
        this.A08 = i;
        this.A07 = f;
        this.A00 = i2;
        this.A09 = i3;
    }

    public C50676MYu(View.OnClickListener onClickListener, float f, int i, int i2) {
        this.A01 = 1;
        this.A05 = true;
        this.A02 = i;
        this.A0A = onClickListener;
        this.A08 = i2;
        this.A07 = f;
        this.A09 = 0;
    }

    public C50676MYu(View.OnClickListener onClickListener, String str, float f, int i) {
        this.A01 = 1;
        this.A05 = true;
        this.A04 = str;
        this.A0A = onClickListener;
        this.A08 = i;
        this.A07 = f;
        this.A09 = 0;
    }

    public C50676MYu(View.OnClickListener onClickListener, String str, int i, int i2) {
        this.A05 = true;
        this.A04 = str;
        this.A0A = onClickListener;
        this.A08 = i;
        this.A07 = 1.0f;
        this.A00 = 0;
        this.A01 = i2;
        this.A09 = 0;
    }

    public C50676MYu(View.OnClickListener onClickListener, String str, int i) {
        this.A01 = 1;
        this.A05 = true;
        this.A04 = str;
        this.A0A = onClickListener;
        this.A08 = i;
        this.A07 = 1.0f;
        this.A00 = R.drawable.instagram_promote_pano_outline_24;
        this.A09 = 0;
    }

    public C50676MYu(Context context, View.OnClickListener onClickListener, String str) {
        this.A01 = 1;
        this.A05 = true;
        this.A04 = str;
        this.A0A = onClickListener;
        this.A08 = AbstractC53242c7.A07(context);
        this.A07 = 1.0f;
        this.A09 = 0;
    }
}
