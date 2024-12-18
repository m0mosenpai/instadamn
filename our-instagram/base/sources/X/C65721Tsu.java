package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.ui.widget.loadmore.LoadMoreButton;

/* renamed from: X.Tsu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65721Tsu extends AbstractC66412zI {
    public final int A00;
    public final InterfaceC62602sz A01;
    public final InterfaceC64472w6 A02;
    public final InterfaceC71961XCn A03;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C37384GdQ c37384GdQ = (C37384GdQ) interfaceC66482zP;
        C65912TwJ c65912TwJ = (C65912TwJ) c3oo;
        c65912TwJ.A00.A04(this.A01, this.A02);
        InterfaceC71961XCn interfaceC71961XCn = this.A03;
        if (interfaceC71961XCn != null) {
            interfaceC71961XCn.CzO(c65912TwJ, c37384GdQ);
        }
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C65912TwJ(LoadMoreButton.A00(viewGroup.getContext(), this.A00, viewGroup));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C37384GdQ.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        InterfaceC71961XCn interfaceC71961XCn = this.A03;
        if (interfaceC71961XCn != null) {
            interfaceC71961XCn.Dw4(c3oo);
        }
    }

    public C65721Tsu(InterfaceC62602sz interfaceC62602sz, InterfaceC64472w6 interfaceC64472w6, InterfaceC71961XCn interfaceC71961XCn, int i) {
        this.A00 = i;
        this.A01 = interfaceC62602sz;
        this.A03 = interfaceC71961XCn;
        this.A02 = interfaceC64472w6;
    }
}
