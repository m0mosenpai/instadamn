package X;

import com.instagram.api.schemas.REPETITION_UI_TYPE;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3vM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC87543vM {
    public static H2C parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            REPETITION_UI_TYPE repetition_ui_type = null;
            String str2 = null;
            C106344qo c106344qo = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (AbstractC111324zv.A00(2286).equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("questions".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C106364qq parseFromJson = AbstractC106324qm.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (AbstractC111324zv.A00(3013).equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    repetition_ui_type = (REPETITION_UI_TYPE) REPETITION_UI_TYPE.A01.get(A1P);
                    if (repetition_ui_type == null) {
                        repetition_ui_type = REPETITION_UI_TYPE.A06;
                    }
                } else if (AbstractC111324zv.A00(3014).equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("undo_button".equals(A0q)) {
                    c106344qo = AbstractC106334qn.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new H2C(c106344qo, repetition_ui_type, str, str2, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
