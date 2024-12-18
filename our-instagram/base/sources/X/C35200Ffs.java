package X;

import android.view.View;

/* renamed from: X.Ffs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C35200Ffs {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public CharSequence A08;
    public CharSequence A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public final View.OnClickListener A0D;
    public final String A0E;

    public C35200Ffs(View.OnClickListener onClickListener, int i) {
        this(onClickListener, (String) null, i, 0);
    }

    public C35200Ffs(View.OnClickListener onClickListener, CharSequence charSequence, CharSequence charSequence2, String str) {
        this.A00 = 1.0f;
        this.A09 = charSequence;
        this.A08 = charSequence2;
        this.A0B = false;
        this.A0E = str;
        this.A0D = onClickListener;
    }

    public C35200Ffs(View.OnClickListener onClickListener, String str, int i, int i2) {
        this.A00 = 1.0f;
        this.A06 = i;
        this.A0D = onClickListener;
        this.A04 = i2;
        this.A0B = false;
        this.A0E = str;
    }

    public C35200Ffs(View.OnClickListener onClickListener, CharSequence charSequence, String str, boolean z) {
        C14360o3.A0B(charSequence, 1);
        this.A00 = 1.0f;
        this.A09 = charSequence;
        this.A0B = z;
        this.A0E = str;
        this.A0D = onClickListener;
    }
}
