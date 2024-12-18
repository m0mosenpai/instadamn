package X;

import android.graphics.Bitmap;
import android.view.View;
import com.facebook.forker.Process;
import com.instagram.api.schemas.ClipsTemplatesStickerType;
import com.instagram.api.schemas.ISOCountryCode;
import com.instagram.api.schemas.StickerTraySectionCTAType;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.reactions.model.ReactionViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Jxw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45127Jxw extends C0T6 {
    public Object A00;
    public String A01;
    public final int A02;

    public static ReactionViewModel A00(C45127Jxw c45127Jxw, UserSession userSession) {
        User user = (User) c45127Jxw.A00;
        String str = c45127Jxw.A01;
        boolean A0K = C14360o3.A0K(C17060sy.A01.A01(userSession), user);
        C14360o3.A0B(user, 1);
        return AbstractC101894i2.A00(userSession, null, user, str, A0K, true, false);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r4) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45127Jxw.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45127Jxw.hashCode():int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final String toString() {
        StringBuilder A1C;
        String str;
        String str2;
        char c;
        switch (this.A02) {
            case 4:
                A1C = AbstractC166987dD.A1C();
                A1C.append("KeyboardInputMethod(name=");
                A1C.append(this.A01);
                A1C.append(", languages=");
                A1C.append(this.A00);
                c = ')';
                A1C.append(c);
                return A1C.toString();
            case 16:
                A1C = AbstractC166987dD.A1C();
                A1C.append("AIStickerContextualSuggestionItem(sticker=");
                A1C.append(this.A00);
                str = ", context=";
                A1C.append(str);
                A1C.append(this.A01);
                c = ')';
                A1C.append(c);
                return A1C.toString();
            case 27:
                String str3 = this.A01;
                A1C = AbstractC166987dD.A1C();
                A1C.append('[');
                switch (AbstractC166987dD.A0H(this.A00)) {
                    case 1:
                        str2 = "loading_exception";
                        break;
                    case 2:
                        str2 = "draft_does_not_exist";
                        break;
                    case 3:
                        str2 = "no_video_segments";
                        break;
                    case 4:
                        str2 = "missing_video_files";
                        break;
                    default:
                        str2 = "drafts_v1_exception";
                        break;
                }
                if (str3 == null) {
                    A1C.append(str2);
                    c = ']';
                    A1C.append(c);
                    return A1C.toString();
                }
                A1C.append(str2);
                A1C.append("] ");
                A1C.append(str3);
                return A1C.toString();
            case 34:
                A1C = AbstractC166987dD.A1C();
                A1C.append("DirectAggregatedMediaViewerViewpointData(media=");
                A1C.append(this.A00);
                str = MSV.A00(136);
                A1C.append(str);
                A1C.append(this.A01);
                c = ')';
                A1C.append(c);
                return A1C.toString();
            default:
                return super.toString();
        }
    }

    public C45127Jxw(C3LX c3lx, String str) {
        this.A02 = 35;
        this.A01 = str;
        this.A00 = c3lx;
    }

    public C45127Jxw(EnumC193878i8 enumC193878i8, String str) {
        this.A02 = 29;
        this.A01 = str;
        this.A00 = enumC193878i8;
    }

    public C45127Jxw(C45127Jxw c45127Jxw, String str) {
        this.A02 = 25;
        this.A01 = str;
        this.A00 = c45127Jxw;
    }

    public C45127Jxw(C47429KxK c47429KxK, String str) {
        this.A02 = 46;
        this.A01 = str;
        this.A00 = c47429KxK;
    }

    public C45127Jxw(C66246U5q c66246U5q, String str) {
        this.A02 = 1;
        this.A00 = c66246U5q;
        this.A01 = str;
    }

    public C45127Jxw(C38321qM c38321qM, String str) {
        this.A02 = 34;
        this.A00 = c38321qM;
        this.A01 = str;
    }

    public C45127Jxw(StickerTraySectionCTAType stickerTraySectionCTAType, String str) {
        this.A02 = 24;
        this.A00 = stickerTraySectionCTAType;
        this.A01 = str;
    }

    public C45127Jxw(AudioOverlayTrack audioOverlayTrack, String str) {
        this.A02 = 39;
        this.A00 = audioOverlayTrack;
        this.A01 = str;
    }

    public C45127Jxw(String str, InterfaceC16820sZ interfaceC16820sZ) {
        this.A02 = 47;
        this.A01 = str;
        this.A00 = interfaceC16820sZ;
    }

    public C45127Jxw(String str, View.OnClickListener onClickListener) {
        this.A02 = 48;
        this.A01 = str;
        this.A00 = onClickListener;
    }

    public C45127Jxw(C5QE c5qe, String str) {
        this.A02 = 14;
        C14360o3.A0B(str, 2);
        this.A00 = c5qe;
        this.A01 = str;
    }

    public C45127Jxw(C5QE c5qe, String str, int i) {
        this.A02 = 33;
        C14360o3.A0B(c5qe, 2);
        this.A01 = str;
        this.A00 = c5qe;
    }

    public C45127Jxw(Bitmap bitmap, String str) {
        this.A02 = 23;
        C14360o3.A0B(str, 2);
        this.A00 = bitmap;
        this.A01 = str;
    }

    public C45127Jxw(ISOCountryCode iSOCountryCode, String str) {
        this.A02 = 13;
        C14360o3.A0B(iSOCountryCode, 1);
        this.A00 = iSOCountryCode;
        this.A01 = str;
    }

    public C45127Jxw(AbstractC193598he abstractC193598he, String str) {
        this.A02 = 26;
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = abstractC193598he;
    }

    public C45127Jxw(ClipsTemplatesStickerType clipsTemplatesStickerType, String str) {
        this.A02 = 9;
        AbstractC167017dG.A1P(str, clipsTemplatesStickerType);
        this.A01 = str;
        this.A00 = clipsTemplatesStickerType;
    }

    public C45127Jxw(C50627MWo c50627MWo, String str) {
        this.A02 = 12;
        AbstractC167017dG.A1P(c50627MWo, str);
        this.A00 = c50627MWo;
        this.A01 = str;
    }

    public C45127Jxw(String str, InterfaceC16660sJ interfaceC16660sJ) {
        this.A02 = 28;
        AbstractC167017dG.A1P(str, interfaceC16660sJ);
        this.A01 = str;
        this.A00 = interfaceC16660sJ;
    }

    public C45127Jxw(User user, String str, int i) {
        this.A02 = i;
        AbstractC167017dG.A1P(user, str);
        this.A00 = user;
        this.A01 = str;
    }

    public C45127Jxw(String str, Integer num, int i) {
        this.A02 = i;
        AbstractC167017dG.A1P(str, num);
        this.A01 = str;
        this.A00 = num;
    }

    public C45127Jxw(List list, String str, int i) {
        this.A02 = i;
        if (11 - i != 0) {
            AbstractC167017dG.A1P(list, str);
        }
        this.A00 = list;
        this.A01 = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C45127Jxw(Integer num, String str, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this("", C05F.A01, 6);
        this.A02 = 6;
    }

    public C45127Jxw(List list, int i, String str) {
        this.A02 = i;
        switch (i) {
            case 4:
            case 7:
            case Process.SIGTERM /* 15 */:
            case 40:
                C14360o3.A0B(str, 1);
                break;
            case 17:
            case 18:
            case Process.SIGSTOP /* 19 */:
            case 31:
                C14360o3.A0B(str, 1);
            default:
                C14360o3.A0B(list, 2);
                break;
        }
        this.A01 = str;
        this.A00 = list;
    }

    public C45127Jxw(String str, int i, Integer num) {
        this.A02 = i;
        if (27 - i != 0) {
            AbstractC167017dG.A1P(num, str);
        } else {
            C14360o3.A0B(num, 1);
        }
        this.A00 = num;
        this.A01 = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C45127Jxw() {
        this("", 37, C05F.A00);
        this.A02 = 37;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C45127Jxw(Throwable th) {
        this((String) null, th, 3);
        this.A02 = 3;
    }

    public C45127Jxw(String str, Object obj, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    public C45127Jxw(String str, Map map, int i) {
        this.A02 = i;
        this.A01 = str;
        this.A00 = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C45127Jxw(int r3) {
        /*
            r2 = this;
            r2.A02 = r3
            r1 = 0
            int r3 = 42 - r3
            if (r3 == 0) goto Lf
            r0 = 44
        L9:
            r2.A02 = r0
            r2.<init>(r1, r1, r0)
            return
        Lf:
            r0 = 42
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45127Jxw.<init>(int):void");
    }
}
