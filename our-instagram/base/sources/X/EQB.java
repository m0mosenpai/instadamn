package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class EQB extends C2US implements InterfaceC65242xM {
    public ESH A00;
    public C32456ERi A01;
    public C168737g7 A02;

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public final void A00(List list) {
        clear();
        addModel(null, null, this.A00);
        addModel(C31335Dq0.A00(2131959380), new Object(), this.A02);
        for (int i = 0; i < list.size(); i++) {
            addModel(((C33627Etd) list.get(i)).A00, ((C33627Etd) list.get(i)).A01, this.A01);
        }
        notifyDataSetChangedSmart();
    }
}
