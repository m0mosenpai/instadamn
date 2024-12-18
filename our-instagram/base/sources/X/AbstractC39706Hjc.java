package X;

import com.facebook.pando.TreeJNI;
import java.util.List;

/* renamed from: X.Hjc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39706Hjc {
    public static final Object A00(C6FW c6fw) {
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type com.facebook.pando.IPandoTree");
        TreeJNI treeJNI = (TreeJNI) A01;
        List list = c6fw.A00;
        int size = list.size() - 2;
        if (1 <= size) {
            int i = 1;
            while (true) {
                Object A03 = c6fw.A03(i);
                C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.String");
                Object field_UNTYPED = treeJNI.getField_UNTYPED((String) A03);
                C14360o3.A0C(field_UNTYPED, "null cannot be cast to non-null type com.facebook.pando.IPandoTree");
                treeJNI = (TreeJNI) field_UNTYPED;
                if (i == size) {
                    break;
                }
                i++;
            }
        }
        Object A032 = c6fw.A03(AbstractC31172DnG.A03(list, 1));
        C14360o3.A0C(A032, "null cannot be cast to non-null type kotlin.String");
        Object field_UNTYPED2 = treeJNI.getField_UNTYPED((String) A032);
        if (field_UNTYPED2 != null) {
            return field_UNTYPED2;
        }
        throw AbstractC166997dE.A0g();
    }
}
