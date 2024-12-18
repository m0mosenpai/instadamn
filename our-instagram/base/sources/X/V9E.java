package X;

/* loaded from: classes11.dex */
public final class V9E extends WlZ {
    public final int A00;
    public final Object A01;
    public final String A02;

    public V9E(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // X.InterfaceC71983XDs
    public final void Dat() {
        if (this.A00 != 0) {
            C4I8 c4i8 = AbstractC68641VYw.A00;
            AbstractC67878V0j abstractC67878V0j = (AbstractC67878V0j) this.A01;
            C4I7 c4i7 = abstractC67878V0j.A0A;
            if (c4i7 == null) {
                C14360o3.A0F("devicePermissionKitLogger");
                throw C00O.createAndThrow();
            }
            c4i8.A04(abstractC67878V0j.getSession(), c4i7, "SEARCH_NEARBY", this.A02);
            return;
        }
        C70684Wf5 c70684Wf5 = (C70684Wf5) ((C44325JiI) this.A01).A01;
        C4I7 c4i72 = c70684Wf5.A03;
        if (c4i72 != null) {
            AbstractC68641VYw.A00.A04(c70684Wf5.A0H, c4i72, "DISCOVERY_MAP", this.A02);
        }
    }

    @Override // X.InterfaceC71983XDs
    public final void onCancel() {
        if (this.A00 != 0) {
            C4I8 c4i8 = AbstractC68641VYw.A00;
            AbstractC67878V0j abstractC67878V0j = (AbstractC67878V0j) this.A01;
            C4I7 c4i7 = abstractC67878V0j.A0A;
            if (c4i7 == null) {
                C14360o3.A0F("devicePermissionKitLogger");
                throw C00O.createAndThrow();
            }
            c4i8.A02(abstractC67878V0j.getSession(), c4i7, "SEARCH_NEARBY", this.A02);
            return;
        }
        C70684Wf5 c70684Wf5 = (C70684Wf5) ((C44325JiI) this.A01).A01;
        C4I7 c4i72 = c70684Wf5.A03;
        if (c4i72 != null) {
            AbstractC68641VYw.A00.A02(c70684Wf5.A0H, c4i72, "DISCOVERY_MAP", this.A02);
        }
    }
}
