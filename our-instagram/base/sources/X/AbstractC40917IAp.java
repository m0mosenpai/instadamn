package X;

import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioType;
import com.instagram.user.model.User;

/* renamed from: X.IAp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40917IAp {
    public static final boolean A00(UserSession userSession, C38321qM c38321qM, C37716Gir c37716Gir) {
        C4GI BZr;
        AudioType audioType;
        String BZi;
        int i;
        EnumC141996bI enumC141996bI;
        String str;
        Integer num;
        User BFU;
        boolean A1b = AbstractC25233BEq.A1b(c38321qM, c37716Gir, userSession);
        if (!AbstractC76643c9.A0H(userSession, c38321qM)) {
            C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
            if (A0u != null) {
                OriginalSoundDataIntf BZw = A0u.BZw();
                if (BZw != null && AbstractC166997dE.A1Z(BZw.Cc7(), A1b)) {
                    i = 2131955955;
                } else {
                    if (A0u.BZw() != null) {
                        OriginalSoundDataIntf BZw2 = A0u.BZw();
                        if (BZw2 != null && (BFU = BZw2.BFU()) != null) {
                            num = BFU.A0M();
                        } else {
                            num = null;
                        }
                        if (num != C05F.A01) {
                            i = 2131955672;
                            if (AbstractC117245Sj.A00(A0u) == OriginalAudioSubtype.A06) {
                                i = 2131955671;
                            }
                        }
                    }
                    if (!AbstractC76643c9.A0J(userSession, c38321qM, c38321qM.A1x())) {
                        i = 2131955699;
                        if (c38321qM.A1x() == EnumC76383bi.A04) {
                            i = 2131955368;
                        }
                    } else {
                        InterfaceC84163p3 A1P = c38321qM.A1P();
                        InterfaceC88553xD A01 = AbstractC117245Sj.A01(A0u);
                        if (A1P != null && (BZr = A1P.BZr()) != null && AbstractC40562Hyi.A00(BZr) == A1b) {
                            String str2 = null;
                            if (A01 != null) {
                                audioType = A01.Ae7();
                            } else {
                                audioType = null;
                            }
                            if (audioType == AudioType.A04 && (BZi = A01.BZi()) != null) {
                                C4GI BZr2 = A1P.BZr();
                                if (BZr2 != null) {
                                    str2 = BZr2.getPk();
                                }
                                if (BZi.equals(str2)) {
                                    i = 2131955520;
                                    enumC141996bI = EnumC141996bI.A05;
                                    str = "clips_feed_remix_original_audio_notice";
                                    C146106i8 A0K = AbstractC31171DnF.A0K();
                                    A0K.A0C = enumC141996bI;
                                    A0K.A0H = str;
                                    AbstractC25226BEj.A1N(c37716Gir.A02, A0K, i);
                                    A0K.A06();
                                    AbstractC25233BEq.A1F(A0K);
                                }
                            }
                        }
                    }
                }
                enumC141996bI = EnumC141996bI.A04;
                str = "";
                C146106i8 A0K2 = AbstractC31171DnF.A0K();
                A0K2.A0C = enumC141996bI;
                A0K2.A0H = str;
                AbstractC25226BEj.A1N(c37716Gir.A02, A0K2, i);
                A0K2.A06();
                AbstractC25233BEq.A1F(A0K2);
            }
            return false;
        }
        return A1b;
    }
}
