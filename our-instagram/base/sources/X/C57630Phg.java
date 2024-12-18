package X;

import com.instagram.model.people.PeopleTag;
import java.io.StringWriter;

/* renamed from: X.Phg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57630Phg extends C0YY implements InterfaceC16660sJ {
    public static final C57630Phg A00 = new C57630Phg();

    public C57630Phg() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        PeopleTag peopleTag = (PeopleTag) obj;
        StringWriter A0f = MSZ.A0f(peopleTag);
        C17z A0O = MSW.A0O(A0f);
        IR0.A00(A0O, peopleTag);
        return MSY.A0e(A0O, A0f);
    }
}
