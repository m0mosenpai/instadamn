package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ALp {
    public static final List A00;
    public static final List A01;

    public static final Drawable A00(Context context, UserSession userSession, C24024AlG c24024AlG, boolean z) {
        Drawable c210509Sp;
        int ordinal = c24024AlG.A03.ordinal();
        if (ordinal != 7) {
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 8) {
                        c210509Sp = new C210519Sq(context, userSession, c24024AlG.BVf(), c24024AlG.A00, z);
                    } else {
                        throw AbstractC166987dD.A14("Unsupported music overlay sticker display type");
                    }
                } else {
                    c210509Sp = A01(context, userSession, c24024AlG.BVf(), c24024AlG.A00, z);
                }
            } else {
                c210509Sp = A02(context, userSession, c24024AlG.BVf(), c24024AlG.A00, z);
            }
        } else {
            c210509Sp = new C210509Sp(context, c24024AlG.BVf(), c24024AlG.A00);
        }
        return c210509Sp;
    }

    static {
        EnumC138556Pl enumC138556Pl = EnumC138556Pl.A0D;
        EnumC138556Pl enumC138556Pl2 = EnumC138556Pl.A09;
        EnumC138556Pl enumC138556Pl3 = EnumC138556Pl.A0C;
        EnumC138556Pl enumC138556Pl4 = EnumC138556Pl.A0A;
        EnumC138556Pl enumC138556Pl5 = EnumC138556Pl.A08;
        EnumC138556Pl enumC138556Pl6 = EnumC138556Pl.A0F;
        EnumC138556Pl enumC138556Pl7 = EnumC138556Pl.A0E;
        EnumC138556Pl enumC138556Pl8 = EnumC138556Pl.A0G;
        A00 = AbstractC16960so.A1Q(enumC138556Pl, enumC138556Pl2, enumC138556Pl3, enumC138556Pl4, enumC138556Pl5, enumC138556Pl6, enumC138556Pl7, enumC138556Pl8);
        A01 = AbstractC16960so.A1Q(enumC138556Pl, enumC138556Pl7, enumC138556Pl6, enumC138556Pl8, enumC138556Pl2, enumC138556Pl5, enumC138556Pl4, enumC138556Pl3);
    }

    public static final C210499So A01(Context context, UserSession userSession, MusicOverlayStickerModel musicOverlayStickerModel, int i, boolean z) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36323165487508529L) && !C18U.A06(c06090Tz, userSession, 36320953579545617L)) {
            return new C210499So(context, userSession, musicOverlayStickerModel, i, z, true);
        }
        return new C210499So(context, userSession, musicOverlayStickerModel, i, z, true);
    }

    public static final C210489Sn A02(Context context, UserSession userSession, MusicOverlayStickerModel musicOverlayStickerModel, int i, boolean z) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36323165487508529L) && !C18U.A06(c06090Tz, userSession, 36320953579545617L)) {
            return new C210489Sn(context, userSession, musicOverlayStickerModel, i, z);
        }
        return new C210489Sn(context, userSession, musicOverlayStickerModel, i, z);
    }
}
