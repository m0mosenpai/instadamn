package X;

import com.instagram.api.schemas.NotePogVideoDict;

/* loaded from: classes8.dex */
public final class ML1 extends C0YY implements InterfaceC16660sJ {
    public static final ML1 A00 = new ML1();

    public ML1() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        NotePogVideoDict notePogVideoDict;
        C45128JyU c45128JyU = (C45128JyU) obj;
        C14360o3.A0B(c45128JyU, 0);
        String A002 = C45128JyU.A00(c45128JyU);
        C4F5 c4f5 = c45128JyU.A05;
        if (c4f5 != null && (notePogVideoDict = c4f5.A08) != null) {
            str = notePogVideoDict.A01;
        } else {
            str = null;
        }
        return AnonymousClass001.A0T(A002, str, '_');
    }
}
