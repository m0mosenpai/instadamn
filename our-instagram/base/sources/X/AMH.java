package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.List;
import kotlin.Deprecated;

/* loaded from: classes4.dex */
public abstract class AMH {
    public static final Drawable A01(Context context, UserSession userSession, C5NL c5nl, String str) {
        return A00(context, userSession, null, null, c5nl, null, null, str, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x004d, code lost:
    
        if (X.C18U.A06(r4, r9, 36323075293916074L) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r9, 36323075293326241L) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004f, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C6RB A02(android.content.Context r8, com.instagram.common.session.UserSession r9, X.C55U r10, X.C5QK r11) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AMH.A02(android.content.Context, com.instagram.common.session.UserSession, X.55U, X.5QK):X.6RB");
    }

    @Deprecated(message = "")
    public static final C8FC A04(Context context, UserSession userSession, C8D0 c8d0, Integer num, Integer num2, String str, boolean z, boolean z2, boolean z3) {
        int i;
        Integer num3;
        C14360o3.A0B(context, 1);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36323165487508529L) && !C18U.A06(c06090Tz, userSession, 36320953579545617L)) {
            i = 4;
            if (z3) {
                i = 1;
            }
        } else {
            i = 5;
        }
        C8D0 c221639qS = new C221639qS(17, 0.0f, 0.0f);
        if (c8d0 != null) {
            c221639qS = c8d0;
        }
        String string = context.getString(2131967983);
        if (z) {
            num3 = C05F.A01;
        } else {
            num3 = C05F.A00;
        }
        boolean z4 = !z;
        return new C8FC(c221639qS, (C8FD) null, (C89G) null, num3, num, num2, (Object) str, string, (List) null, 0.3f, -1.0f, -1.0f, -1.0f, -1.0f, i, z4, false, z2, z4, false, false, false, true, true, true, true, true, false, false);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0061. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0064. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0067. Please report as an issue. */
    public static final C8FC A03(Context context, UserSession userSession, C55U c55u, C5NL c5nl, C8D0 c8d0, String str, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int intValue;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(c55u, 7);
        float f = 1.0f;
        if ((c55u instanceof C81V) && ((intValue = c5nl.CBq().intValue()) == 36 || intValue == 33 || intValue == 25)) {
            f = 0.8f;
        }
        C23108AGw c23108AGw = new C23108AGw();
        c23108AGw.A0F = true;
        c23108AGw.A0H = true;
        c23108AGw.A04 = f;
        c23108AGw.A00 = 1.5f;
        c23108AGw.A01 = 0.25f;
        c23108AGw.A06 = c8d0;
        c23108AGw.A0C = str;
        int intValue2 = c5nl.CBq().intValue();
        if (intValue2 != 21 && intValue2 != 18) {
            if (intValue2 != 16) {
                if (intValue2 != 9) {
                    if (intValue2 != 38) {
                        if (intValue2 != 51) {
                            switch (intValue2) {
                                case 8:
                                    i3 = 2131956877;
                                    c23108AGw.A0D = context.getString(i3);
                                    c23108AGw.A05 = 7;
                                    return new C8FC(c23108AGw);
                                case 10:
                                    String str2 = ((AlB) c5nl).A00.A06;
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    boolean equals = "I_DONATED".equals(str2);
                                    c23108AGw.A0D = context.getString(2131963003);
                                    c23108AGw.A0Q = !equals;
                                    c23108AGw.A05 = 7;
                                    return new C8FC(c23108AGw);
                                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                                    c23108AGw = new C23108AGw();
                                    c23108AGw.A0F = true;
                                    c23108AGw.A00 = 8.0f;
                                    i2 = 2131963456;
                                    c23108AGw.A0D = context.getString(i2);
                                    break;
                                case 20:
                                    int[] iArr = AbstractC202818xz.A02;
                                    c23108AGw = new C23108AGw();
                                    c23108AGw.A0F = true;
                                    c23108AGw.A00 = 5.0f;
                                    c23108AGw.A01 = 0.425f;
                                    i2 = 2131966303;
                                    c23108AGw.A0D = context.getString(i2);
                                    break;
                                case 31:
                                case 32:
                                    i3 = 2131971247;
                                    c23108AGw.A0D = context.getString(i3);
                                    c23108AGw.A05 = 7;
                                    return new C8FC(c23108AGw);
                                case 33:
                                    i3 = 2131971441;
                                    c23108AGw.A0D = context.getString(i3);
                                    c23108AGw.A05 = 7;
                                    return new C8FC(c23108AGw);
                                case 36:
                                    i3 = 2131974205;
                                    c23108AGw.A0D = context.getString(i3);
                                    c23108AGw.A05 = 7;
                                    return new C8FC(c23108AGw);
                                default:
                                    switch (intValue2) {
                                        case 2:
                                            i3 = 2131964689;
                                            c23108AGw.A0D = context.getString(i3);
                                            c23108AGw.A05 = 7;
                                            return new C8FC(c23108AGw);
                                        case 3:
                                            i3 = 2131974810;
                                            c23108AGw.A0D = context.getString(i3);
                                            c23108AGw.A05 = 7;
                                            return new C8FC(c23108AGw);
                                        case 25:
                                        case 26:
                                            i3 = 2131969747;
                                            c23108AGw.A0D = context.getString(i3);
                                            c23108AGw.A05 = 7;
                                            return new C8FC(c23108AGw);
                                        case 40:
                                            i = 2131976241;
                                            break;
                                        default:
                                            switch (intValue2) {
                                                case 23:
                                                case 34:
                                                case 44:
                                                case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                                                case 62:
                                                case 64:
                                                case 65:
                                                case 74:
                                                case 75:
                                                    break;
                                                case 28:
                                                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                                                case 30:
                                                case 68:
                                                case 69:
                                                    c23108AGw.A0D = context.getString(2131971085);
                                                    c23108AGw.A05 = 7;
                                                    PromptStickerModel promptStickerModel = (PromptStickerModel) c5nl;
                                                    if (promptStickerModel.A07) {
                                                        c23108AGw.A01 = 0.8f;
                                                    }
                                                    if (promptStickerModel.A0G()) {
                                                        c23108AGw.A0C = "BeforeAndAfterSticker";
                                                        c23108AGw.A0G = true;
                                                        c23108AGw.A0S = true;
                                                        if (!AbstractC001900j.A0T(promptStickerModel.A03)) {
                                                            c23108AGw.A0Q = false;
                                                        }
                                                        c23108AGw.A06 = new C183748Cz(0.5f, 0.9f);
                                                    }
                                                    return new C8FC(c23108AGw);
                                                case 45:
                                                    i = 2131963681;
                                                    break;
                                                case 47:
                                                    i3 = 2131971511;
                                                    c23108AGw.A0D = context.getString(i3);
                                                    c23108AGw.A05 = 7;
                                                    return new C8FC(c23108AGw);
                                                case 48:
                                                    i3 = 2131974840;
                                                    c23108AGw.A0D = context.getString(i3);
                                                    c23108AGw.A05 = 7;
                                                    return new C8FC(c23108AGw);
                                                case 52:
                                                    boolean z3 = ((SharePlatformStickerClientModel) c5nl).A0B;
                                                    c23108AGw = C23108AGw.A00();
                                                    c23108AGw.A0Q = false;
                                                    c23108AGw.A0O = z3;
                                                    c23108AGw.A01 = 0.5f;
                                                    c23108AGw.A0F = false;
                                                    return new C8FC(c23108AGw);
                                                case 56:
                                                    C24011Akp c24011Akp = (C24011Akp) c5nl;
                                                    C14360o3.A0B(c24011Akp, 0);
                                                    c23108AGw = new C23108AGw();
                                                    c23108AGw.A0F = true;
                                                    c23108AGw.A0H = true;
                                                    c23108AGw.A0D = context.getString(2131953790);
                                                    c23108AGw.A0R = true;
                                                    c23108AGw.A04 = 0.5f;
                                                    c23108AGw.A0C = "BeforeAndAfterSticker";
                                                    c23108AGw.A0G = true;
                                                    float f2 = 0.75f;
                                                    if (AbstractC166997dE.A1Z(Boolean.valueOf(AbstractC167007dF.A1T(c24011Akp.A00.A00)), true)) {
                                                        f2 = 0.25f;
                                                    }
                                                    c23108AGw.A06 = new C183748Cz(0.5f, f2);
                                                    String str3 = c24011Akp.A00.A03;
                                                    if (str3 != null && !AbstractC001900j.A0T(str3)) {
                                                        c23108AGw.A0Q = false;
                                                    }
                                                    return new C8FC(c23108AGw);
                                                case 58:
                                                    i = 2131963349;
                                                    break;
                                                case StringTreeSet.PAYLOAD_MASK /* 63 */:
                                                    c23108AGw.A0D = context.getString(2131971085);
                                                    c23108AGw.A06 = c8d0;
                                                    c23108AGw.A0Q = !((PromptStickerModel) c5nl).A0F();
                                                    return new C8FC(c23108AGw);
                                                case 70:
                                                    c23108AGw.A0D = context.getString(2131964307);
                                                    c23108AGw.A06 = new C183748Cz(0.5f, 0.8f);
                                                    c23108AGw.A0Q = true;
                                                    c23108AGw.A05 = 7;
                                                    return new C8FC(c23108AGw);
                                                default:
                                                    throw AbstractC167007dF.A0c("Unsupported Sticker Model of Type: ", c5nl.getClass().getName());
                                            }
                                    }
                            }
                        } else {
                            c23108AGw.A04 = AbstractC166987dD.A04(context.getResources(), R.dimen.ad_not_delivering_thumbnail_height) / AbstractC166987dD.A06(((Al0) c5nl).A01);
                            c23108AGw.A0F = false;
                            c23108AGw.A0I = false;
                            i = 2131953534;
                        }
                        c23108AGw.A0D = context.getString(i);
                        return new C8FC(c23108AGw);
                    }
                    i = 2131968671;
                    c23108AGw.A0D = context.getString(i);
                    return new C8FC(c23108AGw);
                }
                c23108AGw = new C23108AGw();
                c23108AGw.A0D = context.getString(2131975598);
                c23108AGw.A0A = C05F.A01;
                c23108AGw.A0F = true;
                c23108AGw.A06 = new C183748Cz(0.5f, 0.75f);
                c23108AGw.A0H = true;
            } else {
                c23108AGw = new C23108AGw();
                c23108AGw.A06 = new C221639qS(8388659, AbstractC166987dD.A0C(context, 24), AbstractC166987dD.A0C(context, 100));
            }
            c23108AGw.A0C = str;
            return new C8FC(c23108AGw);
        }
        boolean z4 = false;
        if (((C8GD) c5nl).BVp() != EnumC138556Pl.A0D) {
            z4 = true;
        }
        return A04(context, userSession, c8d0, null, null, str, z, z4, z2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0021. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v5, types: [X.8xB, java.lang.Object, X.6RB] */
    /* JADX WARN: Type inference failed for: r4v10, types: [com.instagram.model.venue.Venue, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.drawable.Drawable A00(android.content.Context r26, com.instagram.common.session.UserSession r27, X.C55U r28, X.C75B r29, X.C5NL r30, java.lang.Integer r31, java.lang.Integer r32, java.lang.String r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 2280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AMH.A00(android.content.Context, com.instagram.common.session.UserSession, X.55U, X.75B, X.5NL, java.lang.Integer, java.lang.Integer, java.lang.String, boolean):android.graphics.drawable.Drawable");
    }
}
