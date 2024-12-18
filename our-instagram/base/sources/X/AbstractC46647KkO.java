package X;

import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.KkO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46647KkO {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C44423JkJ c44423JkJ;
        C102884kP c102884kP = (C102884kP) c6fw.A00.get(0);
        if (c102884kP != null) {
            int i = c102884kP.A05;
            if (i == 13616) {
                IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) c102884kP.A05(c6fq.A03);
                if (igdsInlineSearchBox != null) {
                    igdsInlineSearchBox.A04();
                    return null;
                }
                return null;
            }
            if (i != 13697 || (c44423JkJ = (C44423JkJ) c102884kP.A05(c6fq.A03)) == null) {
                return null;
            }
            c44423JkJ.getEditText().requestFocus();
            c44423JkJ.getEditText().A06();
            return null;
        }
        return null;
    }
}
