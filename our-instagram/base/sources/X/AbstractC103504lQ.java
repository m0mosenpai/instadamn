package X;

import com.instagram.api.schemas.NoteActivationType;
import com.instagram.api.schemas.NoteCustomThemeImpl;
import java.io.IOException;

/* renamed from: X.4lQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC103504lQ {
    public static NoteCustomThemeImpl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            NoteActivationType noteActivationType = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("activation_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    noteActivationType = (NoteActivationType) NoteActivationType.A01.get(A1P);
                    if (noteActivationType == null) {
                        noteActivationType = NoteActivationType.A08;
                    }
                } else if (AbstractC111324zv.A00(349).equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("custom_emoji".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("stroke_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("text_color_hex".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new NoteCustomThemeImpl(noteActivationType, str, str2, str3, str4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, NoteCustomThemeImpl noteCustomThemeImpl) {
        anonymousClass182.A0d();
        NoteActivationType noteActivationType = noteCustomThemeImpl.A00;
        if (noteActivationType != null) {
            anonymousClass182.A0S("activation_type", noteActivationType.A00);
        }
        String str = noteCustomThemeImpl.A01;
        if (str != null) {
            anonymousClass182.A0S(AbstractC111324zv.A00(349), str);
        }
        String str2 = noteCustomThemeImpl.A02;
        if (str2 != null) {
            anonymousClass182.A0S("custom_emoji", str2);
        }
        String str3 = noteCustomThemeImpl.A03;
        if (str3 != null) {
            anonymousClass182.A0S("stroke_color", str3);
        }
        String str4 = noteCustomThemeImpl.A04;
        if (str4 != null) {
            anonymousClass182.A0S("text_color_hex", str4);
        }
        anonymousClass182.A0a();
    }
}
