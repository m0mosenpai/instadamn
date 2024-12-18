package X;

import java.util.regex.Pattern;

/* renamed from: X.PyD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58586PyD extends C0YY implements InterfaceC16820sZ {
    public static final C58586PyD A00 = new C58586PyD();

    public C58586PyD() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Integer num = C05F.A1I;
        Pattern compile = Pattern.compile("(^``` ?)((.|(\\r\\n)|\\r|\\n)*?\\S(.|(\\r\\n)|\\r|\\n)*?)(^```)\\s*?", 8);
        C14360o3.A07(compile);
        return new Py9(Py9.A06, C58649PzM.A00, num, compile, false, true);
    }
}
