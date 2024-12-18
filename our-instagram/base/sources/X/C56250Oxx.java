package X;

import com.instagram.creation.fragment.AlbumEditFragment;

/* renamed from: X.Oxx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56250Oxx implements InterfaceC184728Hn {
    public final int A00;
    public final Object A01;

    public C56250Oxx(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC184728Hn
    public final boolean D3S() {
        switch (this.A00) {
            case 0:
                ((AlbumEditFragment) this.A01).A0M();
                return true;
            case 1:
                ((C8XO) ((N6Q) this.A01).A03.getValue()).A00(C8XI.A04);
                return true;
            case 2:
                N6Q.A00((N6Q) this.A01);
                return true;
            case 3:
                AbstractC31176DnK.A1Y(this.A01);
                return true;
            default:
                N5T.A02((N5T) this.A01);
                return true;
        }
    }
}
