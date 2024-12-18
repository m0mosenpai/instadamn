package X;

/* renamed from: X.8Py, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C186818Py extends C0YY implements InterfaceC16620sF {
    public static final C186818Py A00 = new C186818Py();

    public C186818Py() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        int i2 = ((C84823qW) obj).A09;
        int i3 = ((C84823qW) obj2).A09;
        if (i2 < i3) {
            i = -1;
        } else {
            i = 1;
            if (i2 == i3) {
                i = 0;
            }
        }
        return Integer.valueOf(i);
    }
}
