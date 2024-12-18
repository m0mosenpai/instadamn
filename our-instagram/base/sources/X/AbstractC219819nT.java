package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import java.util.List;

/* renamed from: X.9nT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC219819nT extends AbstractC23475Aao {
    public final BE6 A01(Context context, Drawable drawable, Drawable drawable2, UserSession userSession, String str) {
        BE6 c9sz;
        if (this instanceof C219809nS) {
            C219809nS c219809nS = (C219809nS) this;
            c219809nS.A01 = drawable;
            C1816283r c1816283r = c219809nS.A0A;
            C22923A8t c22923A8t = new C22923A8t(c1816283r.A02, c1816283r.A05, c219809nS.A0C, c219809nS.A04());
            int ordinal = c22923A8t.A01.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    int ordinal2 = c1816283r.A00.ordinal();
                    if (ordinal2 != 0 && ordinal2 != 4) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2 && ordinal2 != 3) {
                                throw B4Z.A00();
                            }
                            throw AbstractC166987dD.A12("Visual Reply unsupported for creation state");
                        }
                        if (drawable != null) {
                            c9sz = new C9SX(context, drawable, c219809nS.A08, c22923A8t);
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else if (drawable != null) {
                        InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) c219809nS.A08).A0K;
                        c9sz = new C9SY(context, drawable, c22923A8t, interfaceC1812882f.getWidth(), interfaceC1812882f.getHeight());
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw B4Z.A00();
                }
            } else if (drawable != null) {
                c9sz = new C9SZ(context, drawable, drawable2, userSession, c22923A8t, str);
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
            c219809nS.A02 = c9sz;
            return c9sz;
        }
        C14360o3.A0A(drawable);
        return new C9SZ(context, drawable, drawable2, userSession, null, str);
    }

    public final AbstractC172157lk A02() {
        InterfaceC09390do interfaceC09390do;
        if (this instanceof C219799nR) {
            interfaceC09390do = ((C219799nR) this).A02;
        } else {
            interfaceC09390do = ((C219809nS) this).A0E;
        }
        return (AbstractC172157lk) interfaceC09390do.getValue();
    }

    public final List A03(AbstractC172157lk abstractC172157lk, String str) {
        String str2;
        String str3;
        if (this instanceof C219809nS) {
            C14360o3.A0B(abstractC172157lk, 0);
            int ordinal = ((C219809nS) this).A0A.A02.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    if (abstractC172157lk instanceof C172147lj) {
                        str3 = "clips_remix_side_by_side";
                        return AbstractC166987dD.A1J(str3);
                    }
                } else {
                    throw B4Z.A00();
                }
            }
            C148276lx c148276lx = C148276lx.A0a;
            if (str != null) {
                str3 = AnonymousClass001.A0R("reel_mention_post_", str);
            } else {
                str3 = "mention_reshare_music_sticker_id";
            }
            return AbstractC166987dD.A1J(str3);
        }
        C148276lx c148276lx2 = C148276lx.A0a;
        if (str != null) {
            str2 = AnonymousClass001.A0R("reel_mention_post_", str);
        } else {
            str2 = "mention_reshare_music_sticker_id";
        }
        return AbstractC166987dD.A1J(str2);
    }
}
