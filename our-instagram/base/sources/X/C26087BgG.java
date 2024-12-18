package X;

import com.facebook.rsys.mediasync.gen.MediaSyncState;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.BgG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26087BgG extends C0T6 {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public static boolean A01(Object obj, int i) {
        if ((obj instanceof C26087BgG) && ((C26087BgG) obj).A04 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26087BgG.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final int hashCode() {
        String A00;
        int A0G;
        int A0I;
        int intValue;
        String str;
        int A0M;
        int hashCode;
        Object obj;
        int A0J;
        Object obj2;
        String str2;
        switch (this.A04) {
            case 0:
                A0G = (((AbstractC166987dD.A0G(this.A01) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31;
                A0I = AbstractC166997dE.A0I(this.A00);
                return A0G + A0I;
            case 1:
                A0I = AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0J(this.A03)));
                A0G = this.A01.hashCode();
                return A0G + A0I;
            case 2:
                A0G = ((((AbstractC167017dG.A0O(this.A03) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31;
                A0I = AbstractC166997dE.A0I(this.A02);
                return A0G + A0I;
            case 3:
                Number number = (Number) this.A01;
                if (number == null) {
                    intValue = 0;
                } else {
                    intValue = (-90105677) + number.intValue();
                }
                A0G = ((((intValue * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31;
                A0I = AbstractC166997dE.A0I(this.A02);
                return A0G + A0I;
            case 4:
                A0G = (AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0G(this.A01)) + AbstractC167017dG.A0M(this.A02)) * 31;
                A0I = AbstractC166997dE.A0I(this.A00);
                return A0G + A0I;
            case 5:
                int A0J2 = AbstractC166987dD.A0J(this.A03);
                int A0H = AbstractC166987dD.A0H(this.A02);
                switch (A0H) {
                    case 1:
                        A00 = "SUGGESTION";
                        break;
                    case 2:
                        A00 = "USER_ENTERED_FLASH_PROMPT";
                        break;
                    case 3:
                        A00 = "MIMICRY";
                        break;
                    case 4:
                        A00 = AbstractC43591JPw.A00(240);
                        break;
                    default:
                        A00 = "USER_ENTERED_FULL_PROMPT";
                        break;
                }
                return (AbstractC25231BEo.A0H(A00, A0H, A0J2) + AbstractC167017dG.A0M(this.A01)) * 31;
            case 6:
                A0I = AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0G(this.A01)));
                int A0H2 = AbstractC166987dD.A0H(this.A02);
                switch (A0H2) {
                    case 1:
                        str = "Loading";
                        break;
                    case 2:
                        str = "Loaded";
                        break;
                    case 3:
                        str = "Error";
                        break;
                    default:
                        str = "Uninitialized";
                        break;
                }
                A0G = AbstractC25226BEj.A02(str, A0H2);
                return A0G + A0I;
            case 7:
                A0I = AbstractC166997dE.A0J(this.A00, (AbstractC166987dD.A0G(this.A02) + AbstractC167017dG.A0M(this.A01)) * 31);
                A0G = this.A03.hashCode();
                return A0G + A0I;
            case 8:
                A0M = ((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A03)) * 31;
                Object obj3 = this.A01;
                if (obj3 != null) {
                    hashCode = obj3.hashCode();
                    A0G = (A0M + hashCode) * 31;
                    obj = this.A02;
                    A0I = AbstractC166997dE.A0I(obj);
                    return A0G + A0I;
                }
                hashCode = 0;
                A0G = (A0M + hashCode) * 31;
                obj = this.A02;
                A0I = AbstractC166997dE.A0I(obj);
                return A0G + A0I;
            case 9:
                A0G = (AbstractC166997dE.A0K(this.A03, AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0M(this.A00)) * 31;
                A0I = AbstractC166997dE.A0I(this.A01);
                return A0G + A0I;
            case 10:
                A0G = ((((AbstractC167017dG.A0O(this.A03) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31;
                obj = this.A00;
                A0I = AbstractC166997dE.A0I(obj);
                return A0G + A0I;
            case 11:
                A0M = ((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31;
                String str3 = this.A03;
                if (str3 != null) {
                    hashCode = str3.hashCode();
                    A0G = (A0M + hashCode) * 31;
                    obj = this.A02;
                    A0I = AbstractC166997dE.A0I(obj);
                    return A0G + A0I;
                }
                hashCode = 0;
                A0G = (A0M + hashCode) * 31;
                obj = this.A02;
                A0I = AbstractC166997dE.A0I(obj);
                return A0G + A0I;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A0J = AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A01));
                obj2 = this.A00;
                A0G = (A0J + AbstractC167017dG.A0M(obj2)) * 31;
                A0I = AbstractC25227BEk.A07(this.A03);
                return A0G + A0I;
            default:
                int A0H3 = AbstractC166987dD.A0H(this.A00);
                switch (A0H3) {
                    case 1:
                        str2 = "CREATOR_VIEWER_INSIGHT";
                        break;
                    case 2:
                        str2 = "RECIPE_SHEET_INSIGHT";
                        break;
                    case 3:
                        str2 = "RECIPE_SHEET_NUX";
                        break;
                    default:
                        str2 = "MEDIA_SOCIAL_CONTEXT";
                        break;
                }
                A0J = (AbstractC25228BEl.A0F(str2, A0H3) + AbstractC167017dG.A0M(this.A01)) * 31;
                obj2 = this.A02;
                A0G = (A0J + AbstractC167017dG.A0M(obj2)) * 31;
                A0I = AbstractC25227BEk.A07(this.A03);
                return A0G + A0I;
        }
    }

    public final String toString() {
        StringBuilder A1C;
        switch (this.A04) {
            case 9:
                A1C = AbstractC166987dD.A1C();
                A1C.append("MediaSyncStateHolder(state=");
                A1C.append(this.A02);
                A1C.append(", viewerSessionId=");
                A1C.append(this.A03);
                A1C.append(MSV.A00(618));
                A1C.append(this.A00);
                A1C.append(", mediaSyncState=");
                A1C.append(this.A01);
                break;
            case 10:
            case 11:
            default:
                return super.toString();
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A1C = AbstractC166987dD.A1C();
                A1C.append("IgLiveUserPaySupportersInfo(supportersInComments=");
                A1C.append(this.A01);
                A1C.append(", supportersInCommentsV2=");
                A1C.append(this.A02);
                A1C.append(", newSupporterComments=");
                A1C.append(this.A00);
                A1C.append(", nextSupportersNextMinId=");
                A1C.append(this.A03);
                break;
        }
        return AbstractC167017dG.A0p(A1C);
    }

    public static final C26087BgG A00(Integer num, String str, List list, List list2) {
        AbstractC167017dG.A1O(list, str);
        return new C26087BgG(num, str, list, list2);
    }

    public C26087BgG(JLM jlm, JMS jms, Integer num, String str, int i) {
        this.A04 = 13;
        jlm = (i & 2) != 0 ? null : jlm;
        jms = (i & 4) != 0 ? null : jms;
        str = (i & 8) != 0 ? null : str;
        this.A04 = 13;
        this.A00 = num;
        this.A01 = jlm;
        this.A02 = jms;
        this.A03 = str;
    }

    public C26087BgG(C51757Mtg c51757Mtg, InterfaceC31095Dld interfaceC31095Dld, String str, InterfaceC16820sZ interfaceC16820sZ, int i) {
        this.A04 = 4;
        interfaceC16820sZ = (i & 4) != 0 ? null : interfaceC16820sZ;
        c51757Mtg = (i & 8) != 0 ? null : c51757Mtg;
        this.A04 = 4;
        this.A01 = interfaceC31095Dld;
        this.A03 = str;
        this.A02 = interfaceC16820sZ;
        this.A00 = c51757Mtg;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26087BgG(MWW mww, InterfaceC678133v interfaceC678133v, User user, String str, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this((Object) null, (Object) null, (Object) null, (String) null, 8);
        this.A04 = 8;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26087BgG(Boolean bool, Boolean bool2, String str, List list, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this((Object) null, (Object) null, (Object) null, (String) null, 11);
        this.A04 = 11;
    }

    public C26087BgG(C5QE c5qe, C5QE c5qe2, ImageUrl imageUrl, String str) {
        this.A04 = 1;
        C14360o3.A0B(str, 1);
        this.A03 = str;
        this.A02 = c5qe;
        this.A00 = c5qe2;
        this.A01 = imageUrl;
    }

    public C26087BgG(MediaSyncState mediaSyncState, C51630MrN c51630MrN, RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments, String str) {
        this.A04 = 9;
        C14360o3.A0B(str, 2);
        this.A02 = mediaSyncState;
        this.A03 = str;
        this.A00 = rtcStartCoWatchPlaybackArguments;
        this.A01 = c51630MrN;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26087BgG(MediaSyncState mediaSyncState, RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments, String str, int i) {
        this((i & 1) != 0 ? null : mediaSyncState, (C51630MrN) null, (i & 4) != 0 ? null : rtcStartCoWatchPlaybackArguments, (i & 2) != 0 ? "" : str);
        this.A04 = 9;
    }

    public C26087BgG(EnumC33350Eoj enumC33350Eoj, User user, String str, List list) {
        this.A04 = 7;
        AbstractC25233BEq.A0w(1, list, enumC33350Eoj, str);
        this.A02 = list;
        this.A01 = user;
        this.A00 = enumC33350Eoj;
        this.A03 = str;
    }

    public C26087BgG(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A03 = str;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public C26087BgG(Integer num, String str, List list, List list2) {
        this.A04 = 6;
        this.A01 = list;
        this.A00 = list2;
        this.A03 = str;
        this.A02 = num;
    }

    public C26087BgG(EnumC27358C5n enumC27358C5n, SimpleImageUrl simpleImageUrl, Integer num, String str) {
        this.A04 = 0;
        this.A01 = enumC27358C5n;
        this.A03 = str;
        this.A02 = num;
        this.A00 = simpleImageUrl;
    }

    public C26087BgG(Integer num) {
        this.A04 = 5;
        this.A03 = "";
        this.A02 = num;
        this.A01 = null;
        this.A00 = null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26087BgG(EnumC27358C5n enumC27358C5n, Integer num) {
        this(enumC27358C5n, (SimpleImageUrl) null, num, (String) null);
        this.A04 = 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26087BgG(Integer num, List list) {
        this(num, "", C16930sl.A00, list);
        this.A04 = 6;
    }

    public C26087BgG() {
        this.A04 = 12;
        this.A04 = 12;
        HashMap A1G = AbstractC166987dD.A1G();
        HashMap A1G2 = AbstractC166987dD.A1G();
        this.A04 = 12;
        this.A01 = A1G;
        this.A02 = A1G2;
        this.A00 = null;
        this.A03 = null;
    }
}
