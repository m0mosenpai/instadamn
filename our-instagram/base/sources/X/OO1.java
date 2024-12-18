package X;

import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes9.dex */
public abstract class OO1 {
    public static final boolean A00(android.net.Uri uri) {
        C14360o3.A0B(uri, 0);
        String scheme = uri.getScheme();
        if (scheme != null && scheme.length() != 0) {
            if (!C14360o3.A0K(uri.getScheme(), "file")) {
                return true;
            }
            List A1Q = AbstractC16960so.A1Q(AbstractC23881Ey.A00().AXd(null, 195432639), AbstractC23881Ey.A00().AXd(null, 1307688829), AbstractC23881Ey.A00().AXd(null, 1253461911));
            if (!(A1Q instanceof Collection) || !A1Q.isEmpty()) {
                Iterator it = A1Q.iterator();
                while (it.hasNext()) {
                    try {
                        C17050sx A01 = AbstractC09440dt.A01(new D8B(((File) it.next()).getCanonicalPath(), 4));
                        try {
                            C54846OMr c54846OMr = new C54846OMr();
                            c54846OMr.A04((C11N) A01.getValue(), AbstractC53645Nnq.A00(uri), false);
                            c54846OMr.A00();
                        } catch (SecurityException unused) {
                            return false;
                        }
                    } catch (IOException unused2) {
                        return true;
                    }
                }
            }
            return true;
        }
        throw AbstractC166987dD.A12("URI scheme is required, relative URIs are not supported");
    }

    public static final boolean A01(android.net.Uri uri, InterfaceC02550Ad interfaceC02550Ad) {
        String path;
        String mimeTypeFromExtension;
        C06090Tz A0j = AbstractC25225BEi.A0j(uri, 0);
        C14360o3.A08(A0j);
        if (C1AD.A06(A0j, 18312984635980331L)) {
            String A19 = AbstractC166987dD.A19(uri);
            String A0h = AbstractC167007dF.A0h(A19);
            C14360o3.A0B("content://", 1);
            if (!A0h.startsWith("content://")) {
                C54846OMr c54846OMr = new C54846OMr();
                c54846OMr.A06(A19);
                c54846OMr.A00 = interfaceC02550Ad;
                ArrayList A17 = AbstractC25225BEi.A17(2);
                AbstractC15480q3.A00(AbstractC54336Nzu.A00, A17);
                A17.add("application/pdf");
                c54846OMr.A07((String[]) A17.toArray(new String[A17.size()]));
                c54846OMr.A00();
                return true;
            }
            return false;
        }
        String scheme = uri.getScheme();
        if (scheme != null && scheme.length() != 0) {
            if (C14360o3.A0K(uri.getScheme(), "file") && (path = uri.getPath()) != null) {
                StringBuilder A1C = AbstractC166987dD.A1C();
                int length = path.length();
                for (int i = 0; i < length; i++) {
                    char charAt = path.charAt(i);
                    if (!C11K.A01(charAt)) {
                        A1C.append(charAt);
                    }
                }
                String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(AbstractC166987dD.A19(A1C));
                if (fileExtensionFromUrl != null && (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl)) != null && MimeTypeMap.getSingleton().hasMimeType(mimeTypeFromExtension)) {
                    if (AbstractC001900j.A0a(mimeTypeFromExtension, MediaStreamTrack.VIDEO_TRACK_KIND, false) || AbstractC001900j.A0a(mimeTypeFromExtension, "image", false) || AbstractC001900j.A0a(mimeTypeFromExtension, MediaStreamTrack.AUDIO_TRACK_KIND, false)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        throw AbstractC166987dD.A12("URI scheme is required, relative URIs are not supported");
    }
}
