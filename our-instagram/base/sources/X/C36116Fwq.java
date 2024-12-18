package X;

import com.instagram.save.model.SavedCollection;
import java.util.List;

/* renamed from: X.Fwq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36116Fwq implements InterfaceC41141vN {
    public final String A00;
    public final List A01;

    public static void A00(C25671My c25671My, SavedCollection savedCollection, List list) {
        c25671My.E4s(new C36116Fwq(savedCollection.A07, savedCollection.A0F, list));
    }

    public C36116Fwq(EnumC33416Epn enumC33416Epn, String str, List list) {
        AbstractC167017dG.A1Q(list, enumC33416Epn);
        this.A01 = list;
        this.A00 = str;
    }
}
