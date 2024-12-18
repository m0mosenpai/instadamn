package X;

import android.text.Layout;
import android.text.SpannableString;
import java.util.List;

/* loaded from: classes11.dex */
public final class X6D extends C0YY implements InterfaceC16600sD {
    public final /* synthetic */ float A00;
    public final /* synthetic */ Layout A01;
    public final /* synthetic */ OIJ A02;
    public final /* synthetic */ List A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X6D(Layout layout, OIJ oij, List list, float f) {
        super(4);
        this.A01 = layout;
        this.A02 = oij;
        this.A00 = f;
        this.A03 = list;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        SpannableString spannableString = (SpannableString) obj;
        C09530e4 c09530e4 = (C09530e4) obj2;
        C09530e4 c09530e42 = (C09530e4) obj3;
        int intValue = ((Number) obj4).intValue();
        AbstractC167017dG.A1N(spannableString, c09530e4);
        Layout layout = this.A01;
        C14360o3.A0A(layout);
        Number number = (Number) c09530e4.A00;
        int intValue2 = number.intValue();
        Number number2 = (Number) c09530e4.A01;
        CharSequence subSequence = spannableString.subSequence(intValue2, number2.intValue());
        C14360o3.A07(subSequence);
        U9f u9f = new U9f(layout, this.A02, subSequence, this.A00, intValue);
        List list = this.A03;
        C09530e4 c09530e43 = c09530e42;
        if (c09530e42 == null) {
            c09530e43 = c09530e4;
        }
        int intValue3 = ((Number) c09530e43.A00).intValue();
        if (c09530e42 == null) {
            c09530e42 = c09530e4;
        }
        list.add(new UQ7(intValue3, ((Number) c09530e42.A01).intValue(), u9f.A01.getWidth(), intValue, 4));
        spannableString.setSpan(u9f, number.intValue(), number2.intValue(), 33);
        return C0eB.A00;
    }
}
