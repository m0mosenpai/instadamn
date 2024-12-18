package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.direct.stickerstore.DirectStoreStickerResponseItem;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class LF6 {
    public C206409Bx A00;
    public C1575375n A01;
    public C7QR A02;
    public C7QP A03;
    public C101864hx A04;
    public C101584hT A05;
    public C4G2 A06;
    public C67640Utv A07;
    public L93 A08;
    public C38321qM A09;
    public C2EY A0A;
    public C1120954b A0B;
    public DirectStoreStickerResponseItem A0C;
    public Boolean A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public List A0H;
    public Map A0I;
    public final C2EY A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;

    public LF6(C2EY c2ey, C2EY c2ey2, Object obj, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.A0L = str;
        this.A0E = str2;
        this.A0K = str3;
        this.A0J = c2ey;
        this.A0M = str4;
        this.A0F = str5;
        this.A0D = Boolean.valueOf(z);
        if (obj != null) {
            try {
                AnonymousClass443 anonymousClass443 = AnonymousClass443.$redex_init_class;
                switch (c2ey.ordinal()) {
                    case 2:
                        this.A0G = (String) obj;
                        return;
                    case 3:
                        this.A09 = (C38321qM) obj;
                        return;
                    case 4:
                        this.A05 = (C101584hT) obj;
                        return;
                    case 11:
                        this.A00 = (C206409Bx) obj;
                        return;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        if (obj instanceof DirectAnimatedMedia) {
                            DirectAnimatedMedia directAnimatedMedia = (DirectAnimatedMedia) obj;
                            C14360o3.A0B(directAnimatedMedia, 1);
                            String str7 = directAnimatedMedia.A05;
                            this.A0B = new C1120954b(new C9BH(directAnimatedMedia.A02), directAnimatedMedia.A01, directAnimatedMedia.A04, directAnimatedMedia.A03, str7, directAnimatedMedia.A06);
                            return;
                        }
                        if (obj instanceof C1120954b) {
                            this.A0B = (C1120954b) obj;
                            return;
                        } else {
                            A00(c2ey, obj, "Unable to process ANIMATED_MEDIA");
                            return;
                        }
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        if (obj instanceof DirectStoreStickerResponseItem) {
                            this.A0C = (DirectStoreStickerResponseItem) obj;
                            return;
                        } else {
                            A00(c2ey, obj, "Unable to process STORE_STICKER");
                            return;
                        }
                    case 14:
                        this.A06 = (C4G2) obj;
                        return;
                    case 22:
                        this.A02 = (C7QR) obj;
                        return;
                    case 28:
                        this.A03 = (C7QP) obj;
                        return;
                    case 36:
                        this.A04 = (C101864hx) obj;
                        return;
                    case 45:
                        this.A08 = (L93) obj;
                        return;
                    case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                        this.A01 = (C1575375n) obj;
                        return;
                    case 49:
                    case 57:
                    case 81:
                    case 82:
                        break;
                    case 98:
                        if (str6 != null) {
                            this.A0G = str6;
                            break;
                        }
                        break;
                    default:
                        A00(c2ey, obj, "Encountered unexpected reply type");
                        return;
                }
                if (obj instanceof List) {
                    List list = (List) obj;
                    if (list.size() >= 1 && (AbstractC166987dD.A16(list) instanceof C910143t)) {
                        this.A0H = list;
                        if (c2ey2 != null && str6 != null) {
                            this.A0A = c2ey2;
                            this.A0G = str6;
                            return;
                        }
                        return;
                    }
                }
                A00(c2ey, obj, "Unable to process XMA reply");
            } catch (ClassCastException unused) {
                String obj2 = c2ey.toString();
                String obj3 = obj.getClass().toString();
                C0f5 AEp = C18950wb.A01.AEp(AnonymousClass001.A0R("DirectRepliedToMessage ", "Class cast error when processing reply"), 20134884);
                AEp.ABW(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, obj2);
                AEp.ABW("class", obj3);
                AEp.report();
            }
        }
    }

    public static void A00(Object obj, Object obj2, String str) {
        String obj3 = obj.toString();
        String obj4 = obj2.getClass().toString();
        C0f5 AEp = C18950wb.A01.AEp(AnonymousClass001.A0R("DirectRepliedToMessage ", str), 20134884);
        AEp.ABW(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, obj3);
        AEp.ABW("class", obj4);
        AEp.report();
    }
}
