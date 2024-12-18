package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.56z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1126956z {
    public static AnonymousClass570 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            AnonymousClass570 anonymousClass570 = new AnonymousClass570();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                if ("message_static".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    anonymousClass570.A02 = str;
                } else if ("details".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    anonymousClass570.A00 = str;
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    anonymousClass570.A03 = str;
                } else if (DialogModule.KEY_MESSAGE.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    anonymousClass570.A01 = str;
                } else if ("is_linked".equals(A0q)) {
                    anonymousClass570.A04 = c16l.A0d();
                }
                c16l.A0z();
            }
            return anonymousClass570;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
