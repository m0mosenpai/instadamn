package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.VkC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69244VkC {
    public final C62862tP A00;
    public final C4NL A01;
    public final InterfaceC55362gb A02;
    public final Map A03;

    public C69244VkC(Context context, C62862tP c62862tP, InterfaceC55362gb interfaceC55362gb, C4NJ c4nj, InterfaceC81393k9 interfaceC81393k9, Map map) {
        AbstractC167017dG.A1R(interfaceC55362gb, c4nj);
        this.A00 = c62862tP;
        this.A02 = interfaceC55362gb;
        this.A01 = c4nj;
        this.A03 = map;
        C102824kJ A00 = c4nj.A08.A00();
        if (A00 == null) {
            String A002 = AbstractC111324zv.A00(1513);
            C0w9.A03("bloks_qp_presenter", A002);
            interfaceC81393k9.DPm(A002);
            return;
        }
        interfaceC81393k9.DKx(C6T7.A00(context, C1338462s.A02(null, A00), this.A00).A00(), this);
    }
}
