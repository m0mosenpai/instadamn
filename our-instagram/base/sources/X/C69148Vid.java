package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vid, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69148Vid {
    public ArrayList A00;
    public ArrayList A01;
    public final X8S A02;

    public C69148Vid(X8S x8s, List list) {
        ImageUrl A1S;
        this.A02 = x8s;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C38321qM c38321qM = (C38321qM) AbstractC001800i.A0O(list, i);
                if (c38321qM != null && (A1S = c38321qM.A1S()) != null) {
                    long A18 = c38321qM.A18();
                    arrayList.add(A1S);
                    AbstractC166997dE.A1X(arrayList2, A18);
                }
            }
            this.A01 = arrayList;
            this.A00 = arrayList2;
        }
    }
}
