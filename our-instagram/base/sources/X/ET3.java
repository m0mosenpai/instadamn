package X;

import com.instagram.igds.components.form.IgFormField;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class ET3 extends C1P1 {
    public final String A00;
    public final InterfaceC16820sZ A01;

    public ET3(String str, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A01 = interfaceC16820sZ;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(570072867);
        FEU.A01.put(this.A00, EnumC33340EoZ.A03);
        ((IgFormField) this.A01.invoke()).A0E();
        C0f9.A0A(-2035310048, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        EnumC33340EoZ enumC33340EoZ;
        int A03 = C0f9.A03(-702614929);
        C32200ECv c32200ECv = (C32200ECv) obj;
        int A0N = AbstractC167017dG.A0N(c32200ECv, 1496274299);
        HashMap hashMap = FEU.A01;
        String str = this.A00;
        if (c32200ECv.A02) {
            enumC33340EoZ = EnumC33340EoZ.A02;
        } else {
            enumC33340EoZ = EnumC33340EoZ.A04;
        }
        hashMap.put(str, enumC33340EoZ);
        ((IgFormField) this.A01.invoke()).A0E();
        C0f9.A0A(-49854259, A0N);
        C0f9.A0A(1674408060, A03);
    }
}
