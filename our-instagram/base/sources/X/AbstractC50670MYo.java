package X;

import android.media.MediaFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: X.MYo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50670MYo {
    public static C50671MYp A00(InterfaceC58194Pr0 interfaceC58194Pr0) {
        ArrayList A03 = A03(interfaceC58194Pr0, "video/");
        if (!A03.isEmpty()) {
            Iterator it = A03.iterator();
            while (it.hasNext()) {
                C50671MYp c50671MYp = (C50671MYp) it.next();
                if (U7T.A04(c50671MYp.A02)) {
                    if (A03.size() > 1) {
                        A02(A03);
                    }
                    return c50671MYp;
                }
            }
            throw new Exception(AnonymousClass001.A0R("Unsupported video codec. Contained ", A02(A03)));
        }
        throw new Exception(AnonymousClass001.A0R("No video track exception. Track Info List: ", A02(A03(interfaceC58194Pr0, ""))));
    }

    public static C50671MYp A01(InterfaceC58194Pr0 interfaceC58194Pr0, boolean z) {
        ArrayList A03 = A03(interfaceC58194Pr0, "audio/");
        if (A03.isEmpty()) {
            return null;
        }
        Iterator it = A03.iterator();
        while (it.hasNext()) {
            C50671MYp c50671MYp = (C50671MYp) it.next();
            String str = c50671MYp.A02;
            MediaFormat mediaFormat = c50671MYp.A01;
            if ((z && str.startsWith("audio/raw") && mediaFormat.containsKey("channel-count") && mediaFormat.getInteger("channel-count") == 1 && mediaFormat.containsKey("pcm-encoding") && mediaFormat.getInteger("pcm-encoding") == 2) || str.startsWith("audio/mp4a") || str.startsWith("audio/mpeg")) {
                if (A03.size() <= 1) {
                    return c50671MYp;
                }
                A02(A03);
                return c50671MYp;
            }
        }
        throw new Exception(AnonymousClass001.A0R("Unsupported audio codec. Contained ", A02(A03)));
    }

    public static String A02(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1E.add(((C50671MYp) it.next()).A02);
        }
        int size = list.size();
        Iterator it2 = A1E.iterator();
        StringBuilder A1C = AbstractC166987dD.A1C();
        if (it2.hasNext()) {
            while (true) {
                A1C.append(it2.next());
                if (!it2.hasNext()) {
                    break;
                }
                A1C.append(", ");
            }
        } else {
            A1C.append("null, input is empty");
        }
        return AnonymousClass001.A05(size, "", " tracks: ", A1C.toString());
    }

    public static ArrayList A03(InterfaceC58194Pr0 interfaceC58194Pr0, String str) {
        ArrayList A1E = AbstractC166987dD.A1E();
        int CA9 = interfaceC58194Pr0.CA9();
        for (int i = 0; i < CA9; i++) {
            MediaFormat CAD = interfaceC58194Pr0.CAD(i);
            String string = CAD.getString("mime");
            if (string != null && string.startsWith(str)) {
                A1E.add(new C50671MYp(CAD, string, i));
            }
        }
        return A1E;
    }

    public static JSONObject A04(InterfaceC58194Pr0 interfaceC58194Pr0) {
        JSONObject A0q = AbstractC31171DnF.A0q();
        try {
            A0q.put("sample-track-index", interfaceC58194Pr0.Bq9());
            A0q.put("track-count", interfaceC58194Pr0.CA9());
            for (int i = 0; i < interfaceC58194Pr0.CA9(); i++) {
                A0q.put(String.format(Locale.ROOT, "track-%d", Integer.valueOf(i)), interfaceC58194Pr0.CAD(i).toString());
            }
        } catch (Exception unused) {
        }
        return A0q;
    }
}
