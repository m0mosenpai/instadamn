package X;

import android.webkit.MimeTypeMap;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Locale;

/* renamed from: X.NoW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53681NoW {
    public static String A00(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        if (mimeTypeFromExtension == null) {
            String lowerCase = fileExtensionFromUrl.toLowerCase(Locale.ROOT);
            char c = 65535;
            switch (lowerCase.hashCode()) {
                case 3711:
                    if (lowerCase.equals("ts")) {
                        c = 0;
                        break;
                    }
                    break;
                case 96323:
                    if (lowerCase.equals("aac")) {
                        c = 1;
                        break;
                    }
                    break;
                case 97669:
                    if (lowerCase.equals("bmp")) {
                        c = 2;
                        break;
                    }
                    break;
                case 102340:
                    if (lowerCase.equals("gif")) {
                        c = 3;
                        break;
                    }
                    break;
                case 105441:
                    if (lowerCase.equals("jpg")) {
                        c = 4;
                        break;
                    }
                    break;
                case 106415:
                    if (lowerCase.equals("m2t")) {
                        c = 5;
                        break;
                    }
                    break;
                case 106458:
                    if (lowerCase.equals("m4a")) {
                        c = 6;
                        break;
                    }
                    break;
                case 108272:
                    if (lowerCase.equals("mp3")) {
                        c = 7;
                        break;
                    }
                    break;
                case 108273:
                    if (lowerCase.equals("mp4")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 109967:
                    if (lowerCase.equals("ogg")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 110834:
                    if (lowerCase.equals("pdf")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 111145:
                    if (lowerCase.equals("png")) {
                        c = 11;
                        break;
                    }
                    break;
                case 117484:
                    if (lowerCase.equals("wav")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 3268712:
                    if (lowerCase.equals("jpeg")) {
                        c = '\r';
                        break;
                    }
                    break;
                case 3358085:
                    if (lowerCase.equals("mpeg")) {
                        c = 14;
                        break;
                    }
                    break;
                case 3418175:
                    if (lowerCase.equals("opus")) {
                        c = 15;
                        break;
                    }
                    break;
                case 3559925:
                    if (lowerCase.equals("tiff")) {
                        c = 16;
                        break;
                    }
                    break;
                case 3645337:
                    if (lowerCase.equals("webm")) {
                        c = 17;
                        break;
                    }
                    break;
                case 3645340:
                    if (lowerCase.equals("webp")) {
                        c = 18;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 5:
                    return "video/mp2t";
                case 1:
                    return "audio/aac";
                case 2:
                    return "image/x-ms-bmp";
                case 3:
                    return "image/gif";
                case 4:
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    return "image/jpeg";
                case 6:
                    return "audio/m4a";
                case 7:
                    return "audio/mp3";
                case '\b':
                    return "video/mp4";
                case '\t':
                    return "audio/ogg";
                case '\n':
                    return "application/pdf";
                case 11:
                    return "image/png";
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    return "audio/wav";
                case 14:
                    return "video/mpeg";
                case Process.SIGTERM /* 15 */:
                    return "audio/opus";
                case 16:
                    return "image/tiff";
                case 17:
                    return "audio/webm";
                case 18:
                    return "image/webp";
                default:
                    return AbstractC58317Pt9.A00(9);
            }
        }
        return mimeTypeFromExtension;
    }
}
