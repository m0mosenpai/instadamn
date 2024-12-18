package X;

import android.widget.TextView;

/* loaded from: classes8.dex */
public final class M6T implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ TextView A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ String A03;

    public M6T(TextView textView, Integer num, String str, float f) {
        this.A01 = textView;
        this.A02 = num;
        this.A00 = f;
        this.A03 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView = this.A01;
        AbstractC125325le A0Z = JQ0.A0Z(textView);
        A0Z.A04 = 0;
        A0Z.A0I(0.0f);
        Integer num = this.A02;
        Integer num2 = C05F.A00;
        float f = this.A00;
        if (num == num2) {
            f = -f;
        }
        A0Z.A0K(f);
        A0Z.A05 = new C49605Lvy(textView, num, this.A03, f);
        A0Z.A0H();
    }
}
