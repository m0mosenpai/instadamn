package X;

import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.3N9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3N9 implements C3N6 {
    public int A00;
    public int A01;
    public final C3N8 A02;
    public final InterfaceC08830cm A03;

    @Override // X.C3N6
    public final String Ary() {
        int i = this.A00 + 1;
        this.A00 = i;
        if (i > this.A02.A00) {
            this.A01++;
            this.A00 = 0;
        }
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%d&%s&%d", 1, this.A03.get(), Integer.valueOf(this.A01));
        if (!C14360o3.A0K(formatStrLocaleSafe, AbstractC123905j4.A00)) {
            AbstractC123905j4.A00 = formatStrLocaleSafe;
        }
        C14360o3.A0A(formatStrLocaleSafe);
        return formatStrLocaleSafe;
    }

    public C3N9(C3N8 c3n8, InterfaceC08830cm interfaceC08830cm) {
        this.A03 = interfaceC08830cm;
        this.A02 = c3n8;
    }
}
