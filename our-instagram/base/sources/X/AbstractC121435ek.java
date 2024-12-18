package X;

import com.instagram.direct.model.thread.ChannelsContextLine;
import java.io.IOException;

/* renamed from: X.5ek, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC121435ek {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.instagram.direct.model.thread.ChannelsContextLine] */
    public static ChannelsContextLine parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("primary_channel_context_line_channels_tab".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("primary_channel_context_line_search".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("secondary_channel_context_line_search".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            obj.A01 = str;
            obj.A00 = str2;
            obj.A02 = str3;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
