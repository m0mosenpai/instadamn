package X;

import com.instagram.api.schemas.NoteReactionType;

/* loaded from: classes7.dex */
public final class JAN extends C0YY implements InterfaceC16660sJ {
    public static final JAN A00 = new JAN();

    public JAN() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = NoteReactionType.A01.get(obj);
        if (obj2 == null) {
            return NoteReactionType.A07;
        }
        return obj2;
    }
}
