package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo;
import com.instagram.direct.groupinvites.models.InviteLinkShareInfo;
import com.instagram.model.direct.DirectIfyXma;
import com.instagram.user.model.User;

/* renamed from: X.FcH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35044FcH {
    public int A00;
    public Long A02;
    public final int A04;
    public final C2EY A05;
    public final Object A06;
    public final String A07;
    public final String A08;
    public Long A01 = null;
    public String A03 = null;

    public AbstractC35044FcH(C2EY c2ey, Object obj, String str, int i, int i2) {
        this.A05 = c2ey;
        this.A06 = obj;
        this.A07 = A01(c2ey, obj);
        this.A08 = str;
        this.A04 = i;
        this.A00 = i2;
    }

    public static String A01(C2EY c2ey, Object obj) {
        Long l;
        F4Z f4z = F4Z.$redex_init_class;
        switch (c2ey.ordinal()) {
            case Process.SIGTERM /* 15 */:
            case 16:
            case 17:
                return AbstractC31171DnF.A0g(obj);
            case Process.SIGSTOP /* 19 */:
                return ((User) obj).A03.Aae();
            case 20:
            case 37:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
            case 49:
                return ((C38321qM) obj).getId();
            case 28:
            case 32:
                return ((C41181vS) obj).A0j;
            case 47:
                return ((C32775Ebf) obj).A02;
            case 58:
            case 59:
            case 89:
                return (String) obj;
            case 91:
                return ((C32744EbA) obj).A00;
            case 99:
            case 103:
                return ((InviteLinkShareInfo) obj).A07;
            case 100:
                return ((ChannelChallengeShareInfo) obj).Amu();
            case 104:
                return ((C32772Ebc) obj).A00;
            case 109:
                DirectIfyXma directIfyXma = ((C32756EbM) obj).A00;
                if (directIfyXma == null || (l = directIfyXma.A02) == null) {
                    return null;
                }
                return l.toString();
            default:
                throw AbstractC166987dD.A12(AbstractC167017dG.A0n(c2ey, "Unsupported content type: ", AbstractC166987dD.A1C()));
        }
    }

    public final String A02() {
        if (this instanceof C32859Ed1) {
            return "user_sms";
        }
        if (this instanceof C32858Ed0) {
            return "system_share_sheet";
        }
        if (this instanceof C32845Ecn) {
            return "twitter";
        }
        if (this instanceof C32844Ecm) {
            return "whatsapp";
        }
        if (this instanceof C32843Ecl) {
            return "barcelona";
        }
        if (this instanceof C32842Eck) {
            return "snapchat";
        }
        if (this instanceof C32841Ecj) {
            return "messenger";
        }
        if (this instanceof C32846Eco) {
            return "facebook";
        }
        if (this instanceof C32860Ed2) {
            return "copy_link";
        }
        return null;
    }

    public final String A03() {
        Object obj = this.A06;
        if (obj instanceof C38321qM) {
            return AbstractC25226BEj.A1G((C38321qM) obj);
        }
        return null;
    }

    public final String A04() {
        int i;
        F4Z f4z = F4Z.$redex_init_class;
        int ordinal = this.A05.ordinal();
        if (ordinal != 15) {
            if (ordinal != 37) {
                if (ordinal != 46) {
                    if (ordinal != 28) {
                        if (ordinal != 32) {
                            return "direct_share_sheet";
                        }
                        return "live_action_sheet";
                    }
                    if (((C41181vS) this.A06).A1K()) {
                        i = 3155;
                    } else {
                        i = 3148;
                    }
                } else {
                    i = 2062;
                }
            } else {
                i = 2384;
            }
        } else {
            i = 2918;
        }
        return AbstractC111324zv.A00(i);
    }

    public final String A05() {
        String Aae;
        if (this.A05 == C2EY.A0H && (Aae = ((User) this.A06).A03.Aae()) != null) {
            return AnonymousClass001.A0R("https://aistudio.instagram.com/ai/", Aae);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:243:0x0929, code lost:
    
        if (((X.C38321qM) r0).A0C.BAo() != null) goto L224;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:140:0x05d9. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:73:0x0369. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0030. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A06(android.view.View r32) {
        /*
            Method dump skipped, instructions count: 3190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35044FcH.A06(android.view.View):void");
    }

    public final void A07(InterfaceC74953Yl interfaceC74953Yl, InterfaceC74953Yl interfaceC74953Yl2, C64770TTe c64770TTe) {
        if (this instanceof C32862Ed4) {
            C32862Ed4 c32862Ed4 = (C32862Ed4) this;
            AbstractC167027dH.A12(interfaceC74953Yl, interfaceC74953Yl2, c64770TTe);
            AbstractC35271Fh6.A08(c32862Ed4.A00, new C32541EUr(3, interfaceC74953Yl, interfaceC74953Yl2, c32862Ed4, c64770TTe), c32862Ed4.A01, c32862Ed4.A02, null);
            C32862Ed4.A00(interfaceC74953Yl, interfaceC74953Yl2, c64770TTe, c32862Ed4);
        }
    }

    public final boolean A08() {
        if (this instanceof C32862Ed4) {
            return true;
        }
        return false;
    }
}
