package X;

import com.instagram.igsignals.core.IgSignalsFeature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.LuK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49507LuK implements InterfaceC57950Pmw {
    public final C18920wW A00;

    /* JADX WARN: Multi-variable type inference failed */
    public C49507LuK() {
        this(null, 0 == true ? 1 : 0, 1);
    }

    public /* synthetic */ C49507LuK(C18920wW c18920wW, DefaultConstructorMarker defaultConstructorMarker, int i) {
        C18920wW A00 = new C12210kP(AbstractC12960li.A00).A00();
        C14360o3.A0B(A00, 1);
        this.A00 = A00;
    }

    @Override // X.InterfaceC57950Pmw
    public final void AIQ(C52C c52c, L0G l0g, List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1E.add(String.valueOf(((IgSignalsFeature) it.next()).A00));
        }
        Iterator it2 = c52c.A05.iterator();
        while (it2.hasNext()) {
            A1E.add(String.valueOf(((IgSignalsFeature) it2.next()).A00));
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "ig_signals_android_commit");
        A0f.AAP("product", l0g.A01);
        A0f.AAP("product_identifier", l0g.A00);
        A0f.AAP("model_state", AbstractC31175DnJ.A0a(";", A1E));
        A0f.AAP("model_identifier", c52c.A04);
        A0f.A8I(MSV.A00(231), Double.valueOf(c52c.A02));
        A0f.A8I("commit_time", Double.valueOf(System.currentTimeMillis()));
        A0f.Cht();
    }
}
