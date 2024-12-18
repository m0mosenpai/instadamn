package X;

import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.InstagramMidcardType;
import java.util.Locale;

/* renamed from: X.Cf7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28348Cf7 {
    public static String A00;

    public static final EnumC39629HiK A00(ClipsMidCardSubtype clipsMidCardSubtype) {
        C14360o3.A0B(clipsMidCardSubtype, 0);
        try {
            return EnumC39629HiK.valueOf(AbstractC166997dE.A10(Locale.ROOT, clipsMidCardSubtype.A00));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final EnumC72417XdN A01(InstagramMidcardType instagramMidcardType) {
        C14360o3.A0B(instagramMidcardType, 0);
        try {
            return EnumC72417XdN.valueOf(AbstractC166997dE.A10(Locale.ROOT, instagramMidcardType.A00));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static void A02(InterfaceC02590Ai interfaceC02590Ai, ClipsMidCardSubtype clipsMidCardSubtype, InstagramMidcardType instagramMidcardType, C37604Ggz c37604Ggz) {
        interfaceC02590Ai.AAP("chaining_session_id", c37604Ggz.A00);
        interfaceC02590Ai.AAk(AbstractC111324zv.A00(2877), null);
        interfaceC02590Ai.A8R(A01(instagramMidcardType), "midcard_type");
        interfaceC02590Ai.A8R(A00(clipsMidCardSubtype), "midcard_subtype");
        interfaceC02590Ai.Cht();
    }
}
