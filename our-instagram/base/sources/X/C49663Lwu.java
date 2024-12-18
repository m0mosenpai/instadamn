package X;

import com.facebook.common.dextricks.DexStore;

/* renamed from: X.Lwu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49663Lwu implements InterfaceC71293Hq {
    public final int A00;
    public final Object A01;

    public C49663Lwu(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC71293Hq
    public final void DeM() {
        if (this.A00 != 0) {
            ((EOJ) this.A01).A0E().A08();
            return;
        }
        AbstractC43842Ja5 abstractC43842Ja5 = (AbstractC43842Ja5) this.A01;
        L5K l5k = abstractC43842Ja5.config;
        if (l5k == null) {
            C14360o3.A0F(DexStore.CONFIG_FILENAME);
            throw C00O.createAndThrow();
        }
        InterfaceC16820sZ interfaceC16820sZ = l5k.A06;
        C14360o3.A0A(interfaceC16820sZ);
        if (AbstractC25231BEo.A1b(interfaceC16820sZ)) {
            return;
        }
        abstractC43842Ja5.getRecyclerView().postDelayed(new RunnableC49842Lzn(abstractC43842Ja5), 500L);
    }
}
