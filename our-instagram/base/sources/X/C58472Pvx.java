package X;

import java.util.regex.Pattern;

/* renamed from: X.Pvx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58472Pvx extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final int A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58472Pvx(int i, int i2) {
        super(0);
        this.A00 = i2;
        this.A01 = i;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                return new C28729CmL(this.A01);
            case 1:
                return String.valueOf(this.A01);
            case 2:
                Integer num = C05F.A1F;
                Pattern compile = Pattern.compile("(?<=[\\s*_~'\"(]|^)(`)(\\S(?:.*?\\S)??)(`)(?=[\\s\\w*_~,.;:!?'\")]|$)");
                C14360o3.A07(compile);
                return new Py9(Py9.A06, new C58587PyE(this.A01), num, compile, false, true);
            case 3:
                return new C8MN(this.A01);
            default:
                return Integer.valueOf(this.A01);
        }
    }
}
