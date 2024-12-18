package X;

import android.os.Parcelable;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.hashtag.HashtagFollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3mR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC82633mR {
    public static final Long A05(UserSession userSession, C38321qM c38321qM) {
        int size = C77403dQ.A00.A06(userSession, c38321qM).size();
        if (C77153d1.A00(userSession, c38321qM)) {
            return null;
        }
        return Long.valueOf(Math.max(0, c38321qM.A0w() - size));
    }

    public static final String A0F(C38321qM c38321qM) {
        if (c38321qM.A5M() && (c38321qM = c38321qM.A1e(0)) == null) {
            return null;
        }
        return c38321qM.A0C.AZ3();
    }

    public static final String A0G(C38321qM c38321qM, int i) {
        C38321qM A1e;
        if (!c38321qM.A5M() || i == -1 || (A1e = c38321qM.A1e(0)) == null) {
            return null;
        }
        return A1e.getId();
    }

    public static final EnumC39643HiY A01(C38321qM c38321qM) {
        C88543xC A1Q;
        MusicMuteAudioReason BvC;
        InterfaceC88553xD A01;
        C3x9 clipsMetadata = c38321qM.A0C.getClipsMetadata();
        if ((clipsMetadata != null && (A01 = AbstractC117245Sj.A01(clipsMetadata)) != null && (BvC = A01.BvC()) != null) || ((A1Q = c38321qM.A1Q()) != null && (BvC = A1Q.BvC()) != null)) {
            int ordinal = BvC.ordinal();
            if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        if (ordinal == 1) {
                            return EnumC39643HiY.LABEL_GO_DARK;
                        }
                    } else {
                        return EnumC39643HiY.SONG_NOT_AVAILABLE;
                    }
                } else {
                    return EnumC39643HiY.OUTSIDE_TERRITORY;
                }
            } else {
                return EnumC39643HiY.ORIGINAL_AUDIO_MUTED;
            }
        }
        return null;
    }

    public static final Long A02(C11520jB c11520jB) {
        String str;
        if (c11520jB != null && (str = (String) c11520jB.A01(AbstractC128995sK.A01)) != null) {
            return AbstractC003100w.A0k(10, str);
        }
        return null;
    }

    public static final Long A03(C11520jB c11520jB) {
        String str;
        if (c11520jB != null && (str = (String) c11520jB.A01(AbstractC128995sK.A03)) != null) {
            return AbstractC003100w.A0k(10, str);
        }
        return null;
    }

    public static final Long A04(C11520jB c11520jB, C38321qM c38321qM) {
        String id;
        String str;
        Long A0k;
        if (c11520jB == null || (str = (String) c11520jB.A01(AbstractC129005sL.A02)) == null || (A0k = AbstractC003100w.A0k(10, str)) == null) {
            Hashtag B7K = c38321qM.A0C.B7K();
            if (B7K != null && (id = B7K.getId()) != null) {
                return AbstractC003100w.A0k(10, id);
            }
            return null;
        }
        return A0k;
    }

    public static final String A0A(C11520jB c11520jB, C30W c30w) {
        String str;
        if (c11520jB == null || (str = (String) c11520jB.A01(C5I8.A83)) == null) {
            C1M1 c1m1 = c30w.A01;
            if (c1m1 != null) {
                return c1m1.getSessionId();
            }
            return null;
        }
        return str;
    }

    public static final String A0B(C11520jB c11520jB, C38321qM c38321qM) {
        String str;
        if (c11520jB != null && (str = (String) c11520jB.A01(AbstractC129005sL.A01)) != null) {
            return str;
        }
        if (c38321qM.A0C.B7K() != null) {
            return HashtagFollowStatus.A04.A00;
        }
        return null;
    }

    public static final String A0C(C11520jB c11520jB, C38321qM c38321qM) {
        String str;
        if (c11520jB == null || (str = (String) c11520jB.A01(AbstractC129005sL.A03)) == null) {
            Hashtag B7K = c38321qM.A0C.B7K();
            if (B7K != null) {
                return B7K.getName();
            }
            return null;
        }
        return str;
    }

    public static final long A00(C38321qM c38321qM, C75113Zb c75113Zb) {
        C38321qM c38321qM2;
        Integer num;
        if (c38321qM.A5M()) {
            c38321qM2 = c38321qM.A1e(c75113Zb.A03);
        } else {
            c38321qM2 = c38321qM;
        }
        if (c38321qM2 == null) {
            C0f5 AEp = C18950wb.A01.AEp("Media#CarouselIndex", 817899586);
            StringBuilder sb = new StringBuilder();
            sb.append("Loading media progress: Invalid carousel index for carousel media. Index = ");
            sb.append(c75113Zb.A03);
            sb.append(", Size = ");
            List AmB = c38321qM.A0C.AmB();
            if (AmB != null) {
                num = Integer.valueOf(AmB.size());
            } else {
                num = null;
            }
            sb.append(num);
            AEp.ABW(DialogModule.KEY_MESSAGE, sb.toString());
            AEp.report();
        } else {
            if (c38321qM2.Cff() && c38321qM2.A1C() > 0) {
                return (long) ((c75113Zb.A05 / c38321qM2.A1C()) * 100.0d);
            }
            if (c38321qM2.A5x()) {
                return c75113Zb.A02();
            }
        }
        return -1L;
    }

    public static final Long A06(UserSession userSession, C38321qM c38321qM) {
        if (c38321qM.CdW()) {
            return Long.valueOf(C77403dQ.A00.A06(userSession, c38321qM).size());
        }
        return null;
    }

    public static final Long A07(C38321qM c38321qM, int i) {
        if (c38321qM.A5M() && i != -1) {
            return Long.valueOf(i);
        }
        return null;
    }

    public static final Long A08(C38321qM c38321qM, int i) {
        C38321qM A1e;
        if (!c38321qM.A5M() || i == -1 || (A1e = c38321qM.A1e(i)) == null) {
            return null;
        }
        return Long.valueOf(A1e.BRp().A00);
    }

    public static final Long A09(C38321qM c38321qM, int i) {
        if (c38321qM.A5M() && i != -1) {
            return Long.valueOf(c38321qM.A0p());
        }
        return null;
    }

    public static final String A0D(UserSession userSession, C38321qM c38321qM) {
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            Parcelable.Creator creator = User.CREATOR;
            return AbstractC38851rI.A06(A2E.B7L());
        }
        return null;
    }

    public static final String A0E(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS) {
        if (AbstractC75423a9.A02(c38321qM, interfaceC60442pS)) {
            return AbstractC41071vF.A0F(userSession, c38321qM);
        }
        return c38321qM.A0C.getOrganicTrackingToken();
    }

    public static final String A0H(C38321qM c38321qM, int i) {
        C38321qM A1e;
        if (!c38321qM.A5M() || i == -1 || (A1e = c38321qM.A1e(i)) == null) {
            return null;
        }
        return A1e.getId();
    }

    public static final String A0I(C38321qM c38321qM, int i) {
        if (c38321qM.A5M() && i != -1) {
            return c38321qM.A0C.BPW();
        }
        return null;
    }

    public static final List A0J(C38321qM c38321qM) {
        Long A0k;
        ArrayList A3M = c38321qM.A3M();
        ArrayList arrayList = null;
        if (A3M != null && (!A3M.isEmpty())) {
            arrayList = new ArrayList();
            Iterator it = A3M.iterator();
            while (it.hasNext()) {
                String id = ((com.instagram.tagging.model.Tag) it.next()).getId();
                if (id != null && (A0k = AbstractC003100w.A0k(10, id)) != null) {
                    arrayList.add(A0k);
                }
            }
        }
        return arrayList;
    }
}
