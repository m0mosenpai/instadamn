package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.GifUrlImpl;

/* loaded from: classes8.dex */
public abstract class LJL {
    public static final void A00(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1GL c1gl, GifUrlImpl gifUrlImpl, Integer num, Integer num2, String str, String str2, String str3, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        EnumC46295KeR enumC46295KeR;
        String str4;
        AbstractC167017dG.A1O(userSession, str);
        AbstractC167007dF.A1J(num2, 4, interfaceC11380iw);
        if (str.length() == 0) {
            str4 = "saveSticker - stickerId is empty";
        } else {
            Integer num3 = C05F.A00;
            boolean A1X = AbstractC167007dF.A1X(num, num3);
            if (num2 == num3) {
                if (gifUrlImpl != null && c1gl != null) {
                    C45026JwH A00 = AbstractC47066KrN.A00(gifUrlImpl, str, str2);
                    AbstractC47995LLh.A0G(new EU0(1, interfaceC16820sZ2, context, A00, userSession, A1X), userSession, c1gl, A00);
                    return;
                }
                str4 = "saveGif - url unexpected null pointer ";
            } else {
                Boolean bool = (Boolean) interfaceC16820sZ.invoke();
                if (bool == null) {
                    return;
                }
                boolean booleanValue = bool.booleanValue();
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "direct_save_favorite_sticker");
                if (A0f.isSampled()) {
                    AbstractC31175DnJ.A1A(A0f, false);
                    int intValue = num2.intValue();
                    if (intValue != 4) {
                        if (intValue != 3) {
                            if (intValue != 1) {
                                enumC46295KeR = EnumC46295KeR.CUSTOM;
                            } else {
                                enumC46295KeR = EnumC46295KeR.REGULAR;
                            }
                        } else {
                            enumC46295KeR = EnumC46295KeR.PAIR_AI_GENERATED;
                        }
                    } else {
                        enumC46295KeR = EnumC46295KeR.AVATAR;
                    }
                    A0f.A8R(enumC46295KeR, "sticker_type");
                    A0f.AAP("bottom_sheet_session_id", str3);
                    A0f.Cht();
                }
                if (!booleanValue) {
                    return;
                }
                A01(context, interfaceC16820sZ2, A1X);
                C48505Lcw c48505Lcw = (C48505Lcw) userSession.A01(C48505Lcw.class, C50202MFj.A00);
                synchronized (c48505Lcw) {
                    java.util.Set set = c48505Lcw.A01;
                    if (set.size() < 100) {
                        set.add(str);
                    }
                }
                return;
            }
        }
        AbstractC166987dD.A1T(C18950wb.A01, str4, 20134884);
    }

    public static final void A01(Context context, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        C146106i8 A0K = AbstractC31171DnF.A0K();
        AbstractC25226BEj.A1N(context, A0K, 2131960397);
        if (z && interfaceC16820sZ != null) {
            AbstractC31175DnJ.A0l(context, A0K, 2131960398);
            A0K.A0A(new C49490Lu3(interfaceC16820sZ, 7));
            A0K.A0L = true;
        }
        AbstractC31178DnM.A1S(A0K);
    }

    public static final void A02(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1GL c1gl, GifUrlImpl gifUrlImpl, Integer num, String str, String str2, String str3, InterfaceC16820sZ interfaceC16820sZ) {
        EnumC46295KeR enumC46295KeR;
        String str4;
        AbstractC167017dG.A1N(userSession, str);
        C14360o3.A0B(interfaceC11380iw, 6);
        if (str.length() == 0) {
            str4 = "unsaveSticker - stickerId is empty";
        } else if (num == C05F.A00) {
            if (gifUrlImpl != null && c1gl != null) {
                C45026JwH A00 = AbstractC47066KrN.A00(gifUrlImpl, str, str2);
                AbstractC47995LLh.A0H(new C45543KEi(8, A00, userSession), userSession, c1gl, A00);
                return;
            }
            str4 = "unsaveGif - url unexpected null pointer";
        } else {
            Boolean bool = (Boolean) interfaceC16820sZ.invoke();
            if (bool == null) {
                return;
            }
            boolean booleanValue = bool.booleanValue();
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "direct_unsave_favorite_sticker");
            if (A0f.isSampled()) {
                AbstractC31175DnJ.A1A(A0f, false);
                int intValue = num.intValue();
                if (intValue != 4) {
                    if (intValue != 3) {
                        if (intValue != 1) {
                            enumC46295KeR = EnumC46295KeR.CUSTOM;
                        } else {
                            enumC46295KeR = EnumC46295KeR.REGULAR;
                        }
                    } else {
                        enumC46295KeR = EnumC46295KeR.PAIR_AI_GENERATED;
                    }
                } else {
                    enumC46295KeR = EnumC46295KeR.AVATAR;
                }
                A0f.A8R(enumC46295KeR, "sticker_type");
                A0f.AAP("bottom_sheet_session_id", str3);
                A0f.Cht();
            }
            if (!booleanValue) {
                return;
            }
            C48505Lcw c48505Lcw = (C48505Lcw) userSession.A01(C48505Lcw.class, C50202MFj.A00);
            synchronized (c48505Lcw) {
                c48505Lcw.A01.remove(str);
            }
            return;
        }
        AbstractC166987dD.A1T(C18950wb.A01, str4, 20134884);
    }

    public static final boolean A03(UserSession userSession, String str) {
        boolean z;
        boolean contains;
        AbstractC167017dG.A1N(userSession, str);
        Object A01 = userSession.A01(C48505Lcw.class, C50202MFj.A00);
        C48505Lcw c48505Lcw = (C48505Lcw) A01;
        synchronized (A01) {
            z = c48505Lcw.A00;
        }
        if (z) {
            synchronized (A01) {
                contains = c48505Lcw.A01.contains(str);
            }
            if (contains) {
                return true;
            }
        }
        return false;
    }
}
