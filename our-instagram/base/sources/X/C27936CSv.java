package X;

import android.content.Context;
import com.facebook.R;

/* renamed from: X.CSv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27936CSv {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final C7IM A06;

    public C27936CSv(Context context, C7IM c7im) {
        C14360o3.A0B(c7im, 2);
        this.A06 = c7im;
        int A0F = AbstractC53242c7.A0F(context, R.attr.messageFromOthersGrayBackground);
        this.A01 = A0F;
        int A0F2 = AbstractC53242c7.A0F(context, R.attr.igds_color_separator);
        int i = c7im.A03.A04;
        this.A00 = i;
        this.A04 = c7im.A06.A04;
        C7IH c7ih = c7im.A04;
        this.A02 = c7ih.A0K;
        int i2 = c7ih.A07;
        this.A03 = i2;
        if (i != i2 && i != A0F) {
            A0F2 = i;
        }
        this.A05 = A0F2;
    }
}
