package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.io.IOException;

/* renamed from: X.Kq4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46985Kq4 {
    /* JADX WARN: Type inference failed for: r0v7, types: [X.Jvj, java.lang.Object] */
    public static C44993Jvj parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            ExtendedImageUrl extendedImageUrl = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("note_igid".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("subtitle".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("profile_pic_url".equals(A0s)) {
                    extendedImageUrl = C17Y.parseFromJson(c16l);
                } else if ("attachment_idx".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("waveform_data".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("sampling_frequency_hz".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("message_item_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("note_igid", c16l, "NoteAudioReply");
            } else if (str2 != null || !(c16l instanceof C07950bF)) {
                if (str3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("subtitle", c16l, "NoteAudioReply");
                } else if (str7 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("message_item_type", c16l, "NoteAudioReply");
                } else {
                    AbstractC167027dH.A13(str, str2, str3);
                    C14360o3.A0B(str7, 8);
                    ?? obj = new Object();
                    obj.A03 = str;
                    obj.A06 = str2;
                    obj.A05 = str3;
                    obj.A00 = extendedImageUrl;
                    obj.A01 = str4;
                    obj.A07 = str5;
                    obj.A04 = str6;
                    obj.A02 = str7;
                    return obj;
                }
            } else {
                AbstractC166997dE.A1V(DialogModule.KEY_TITLE, c16l, "NoteAudioReply");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
