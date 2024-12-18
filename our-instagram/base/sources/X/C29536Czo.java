package X;

/* renamed from: X.Czo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29536Czo implements InterfaceC42241xE {
    public final int A00;
    public final Object A01;

    public C29536Czo(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C05A c05a;
        Object obj2;
        C05A c05a2;
        switch (this.A00) {
            case 0:
                if (C14360o3.A0K(obj, C27190Bz9.A00)) {
                    ((InterfaceC31037Dkb) this.A01).onSuccess();
                    return;
                } else if (obj instanceof C45786KOn) {
                    ((InterfaceC31037Dkb) this.A01).onFailure();
                    return;
                } else {
                    if (!C14360o3.A0K(obj, C27189Bz8.A00)) {
                        return;
                    }
                    ((InterfaceC31037Dkb) this.A01).DVx();
                    return;
                }
            case 1:
            default:
                c05a2 = ((C25804BbL) this.A01).A06;
                c05a2.Egh(obj);
                return;
            case 2:
                if (C14360o3.A0K(obj, C27191BzA.A00)) {
                    c05a = (C05A) this.A01;
                    obj2 = C27195BzE.A00;
                    break;
                } else if (obj instanceof C27192BzB) {
                    c05a = (C05A) this.A01;
                    obj2 = C27194BzD.A00;
                    break;
                } else {
                    throw B4Z.A00();
                }
            case 3:
                c05a2 = ((C25804BbL) this.A01).A05;
                c05a2.Egh(obj);
                return;
            case 4:
                AbstractC46423Kgj abstractC46423Kgj = (AbstractC46423Kgj) obj;
                c05a = ((C25804BbL) this.A01).A05;
                if (C14360o3.A0K(abstractC46423Kgj, C45790KOv.A00)) {
                    obj2 = C27200BzJ.A00;
                    break;
                } else if (C14360o3.A0K(abstractC46423Kgj, C45792KOx.A00)) {
                    obj2 = new C27201BzK(null);
                    break;
                } else if (abstractC46423Kgj instanceof KOt) {
                    obj2 = new C27196BzF(((KOt) abstractC46423Kgj).A00);
                    break;
                } else if (abstractC46423Kgj instanceof KOu) {
                    obj2 = C27199BzI.A00;
                    break;
                } else {
                    obj2 = new C27196BzF(AbstractC43591JPw.A00(54));
                    break;
                }
        }
        c05a.Egh(obj2);
    }
}
