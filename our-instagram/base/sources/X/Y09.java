package X;

import com.facebook.R;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes12.dex */
public final class Y09 {
    public boolean A00;
    public final C13270mD A01;
    public final C72737Xm9 A02;
    public final Queue A03 = new LinkedList();

    public static final void A00(C72737Xm9 c72737Xm9, Y09 y09, Queue queue) {
        if (!y09.A00) {
            int i = c72737Xm9.A00;
            for (int size = queue.size(); size < i; size++) {
                y09.A01.A00(new C73458YEb(y09), R.layout.sponsored_content_server_rendered_layout);
            }
        }
    }

    public Y09(C13270mD c13270mD, C72737Xm9 c72737Xm9) {
        this.A02 = c72737Xm9;
        this.A01 = c13270mD;
    }
}
