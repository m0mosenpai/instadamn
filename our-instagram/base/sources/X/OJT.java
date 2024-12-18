package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes9.dex */
public final class OJT {
    public int A00;
    public View A01;
    public C189478aR A02;
    public final C54842OMn A03;
    public final N53 A04;
    public final C189448aO A05;

    public final void A00(Context context) {
        C189448aO c189448aO = this.A05;
        C54842OMn c54842OMn = this.A03;
        c189448aO.A0d = c54842OMn.A02;
        C189478aR A00 = c189448aO.A00();
        this.A02 = A00;
        N53 n53 = this.A04;
        A00.A03(context, n53);
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.addAll(c54842OMn.A07);
        A1E.addAll(c54842OMn.A06);
        SpannableStringBuilder spannableStringBuilder = c54842OMn.A00;
        List list = n53.A08;
        list.clear();
        list.addAll(A1E);
        n53.A00 = spannableStringBuilder;
        N53.A00(n53);
        LinkedList linkedList = c54842OMn.A05;
        C51145Mio c51145Mio = n53.A07;
        C14360o3.A0B(linkedList, 0);
        AbstractC31175DnJ.A0x(c51145Mio, linkedList, c51145Mio.A02);
    }

    public OJT(C54842OMn c54842OMn) {
        this.A03 = c54842OMn;
        N53 n53 = new N53();
        this.A04 = n53;
        C189448aO A0y = AbstractC25225BEi.A0y(c54842OMn.A04);
        A0y.A17 = false;
        A0y.A0Z = false;
        A0y.A07 = 1;
        A0y.A1O = c54842OMn.A03;
        A0y.A0T = c54842OMn.A01;
        C56766PHj.A00(A0y, this, 6);
        this.A05 = A0y;
        this.A00 = -1;
        n53.A07.A00 = new OH0(this);
        n53.A02 = false;
    }
}
