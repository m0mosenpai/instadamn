package X;

import android.widget.TextView;

/* renamed from: X.Lvy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49605Lvy implements InterfaceC125355lh {
    public final /* synthetic */ float A00;
    public final /* synthetic */ TextView A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ String A03;

    public C49605Lvy(TextView textView, Integer num, String str, float f) {
        this.A01 = textView;
        this.A03 = str;
        this.A02 = num;
        this.A00 = f;
    }

    @Override // X.InterfaceC125355lh
    public final void onFinish() {
        TextView textView = this.A01;
        textView.setText(this.A03);
        Integer num = this.A02;
        Integer num2 = C05F.A00;
        float f = this.A00;
        if (num != num2) {
            f = -f;
        }
        textView.setTranslationY(f);
        AbstractC125325le A0Z = JQ0.A0Z(textView);
        A0Z.A0I(1.0f);
        A0Z.A0K(0.0f);
        A0Z.A0H();
    }
}
