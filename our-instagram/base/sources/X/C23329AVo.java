package X;

/* renamed from: X.AVo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23329AVo implements InterfaceC178837wv {
    public final int A00;
    public final Object A01;

    public static void A00(AbstractC223559ty abstractC223559ty, C23329AVo c23329AVo) {
        C14360o3.A0B(abstractC223559ty, 0);
        ((InterfaceC178837wv) c23329AVo.A01).DRi(abstractC223559ty);
    }

    public C23329AVo(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC178837wv
    public final void DRi(AbstractC223559ty abstractC223559ty) {
        C18950wb c18950wb;
        int i;
        String str;
        switch (this.A00) {
            case 0:
                A00(abstractC223559ty, this);
                c18950wb = C18950wb.A01;
                i = 817896864;
                str = "ClipsArFrameLiteRendererCallback Media Graph Error";
                break;
            case 1:
                A00(abstractC223559ty, this);
                c18950wb = C18950wb.A01;
                i = 817896864;
                str = "IgArFrameLiteRendererCallback Media Graph Error";
                break;
            case 2:
                A00(abstractC223559ty, this);
                c18950wb = C18950wb.A01;
                i = 817896842;
                str = "IgFeedArFrameLiteRendererCallback Media Graph Error";
                break;
            case 3:
                A00(abstractC223559ty, this);
                c18950wb = C18950wb.A01;
                i = 817896842;
                str = "IgStoriesArFrameLiteRendererCallback Media Graph Error";
                break;
            case 4:
                A00(abstractC223559ty, this);
                c18950wb = C18950wb.A01;
                i = 817896842;
                str = "StoriesArFrameLiteRendererCallback Media Graph Error";
                break;
            case 5:
                C9P2 c9p2 = (C9P2) this.A01;
                Object obj = c9p2.A0M;
                synchronized (obj) {
                    c9p2.A0Y = abstractC223559ty;
                    c9p2.A00--;
                    obj.notifyAll();
                }
                return;
            case 6:
                A00(abstractC223559ty, this);
                c18950wb = C18950wb.A01;
                i = 817892945;
                str = "IgOneCameraServiceFactory Media Graph Error";
                break;
            default:
                InterfaceC178837wv interfaceC178837wv = ((AGP) this.A01).A00;
                if (interfaceC178837wv != null) {
                    interfaceC178837wv.DRi(abstractC223559ty);
                    return;
                }
                return;
        }
        AbstractC167017dG.A1J(c18950wb, str, abstractC223559ty, i);
    }
}
