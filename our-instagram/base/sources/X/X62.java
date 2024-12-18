package X;

import com.instagram.api.schemas.StoryJoinChatStatus;

/* loaded from: classes11.dex */
public final class X62 extends C0YY implements InterfaceC16660sJ {
    public static final X62 A00 = new X62();

    public X62() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = StoryJoinChatStatus.A01.get(obj);
        if (obj2 == null) {
            return StoryJoinChatStatus.A09;
        }
        return obj2;
    }
}
