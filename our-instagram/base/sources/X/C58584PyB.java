package X;

import java.util.regex.Pattern;

/* renamed from: X.PyB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58584PyB extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58584PyB(Py8 py8, int i, int i2, int i3, int i4) {
        super(0);
        this.A00 = i4;
        this.A04 = py8;
        this.A03 = i;
        this.A02 = i2;
        this.A01 = i3;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            Integer num = C05F.A03;
            Pattern compile = Pattern.compile("(^>>> ?)((.|(\\r\\n)|\\r|\\n)*?\\S(.|(\\r\\n)|\\r|\\n)*?)(^<<<)\\s*?", 8);
            C14360o3.A07(compile);
            return new Py9(Py9.A06, new T2F(((Py8) this.A04).A02, this.A03, this.A02, this.A01), num, compile, true, true);
        }
        Integer num2 = C05F.A02;
        Pattern compile2 = Pattern.compile("((^> )(.*\\S.*)((\\r\\n)|\\r|\\n)?)(^> ?(.*)((\\r\\n)|\\r|\\n)?)*", 8);
        C14360o3.A07(compile2);
        return new Py9(new C58525Pwt(4), new T2F(((Py8) this.A04).A02, this.A03, this.A02, this.A01), num2, compile2, true, false);
    }
}
