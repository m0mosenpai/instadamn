package X;

import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.dictionary.data.DictionaryRepository;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.Jme, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44534Jme extends AbstractC52922bZ {
    public final DictionaryRepository A04;
    public final L8S A05;
    public final C12W A06;
    public final C19L A07;
    public final C2GS A01 = new C2GT(AbstractC166997dE.A0a());
    public final C2GS A03 = new C2GS();
    public final C2GS A02 = new C2GS();
    public int A00 = -1;

    public static final ArrayList A00(C44534Jme c44534Jme) {
        Collection collection = (Collection) c44534Jme.A03.A02();
        if (collection == null) {
            collection = C16930sl.A00;
        }
        return AbstractC001800i.A0U(collection);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2GT, X.2GS] */
    public C44534Jme(DictionaryRepository dictionaryRepository, L8S l8s, C12W c12w, C19L c19l) {
        this.A04 = dictionaryRepository;
        this.A06 = c12w;
        this.A07 = c19l;
        this.A05 = l8s;
        MCO.A03(this, c12w, AbstractC141776au.A00(this), 48);
    }
}
