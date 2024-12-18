package X;

import com.instagram.common.recyclerview.ViewModelListUpdate;

/* renamed from: X.JXo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43775JXo implements InterfaceC42241xE {
    public final /* synthetic */ JR2 A00;

    public C43775JXo(JR2 jr2) {
        this.A00 = jr2;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        ViewModelListUpdate viewModelListUpdate = (ViewModelListUpdate) obj;
        JR2 jr2 = this.A00;
        C14360o3.A0A(viewModelListUpdate);
        boolean A06 = C18U.A06(C06090Tz.A05, jr2.A0p(), 36329638003556818L);
        if (!A06) {
            ((JXU) jr2.A1e.getValue()).A00(viewModelListUpdate);
            return;
        }
        if (jr2.A0u == null) {
            jr2.A0u = AbstractC31173DnH.A0g();
        }
        AbstractC60912qF.A01(jr2.A0p(), jr2.A0u, new C50170MDx(17, viewModelListUpdate, jr2), new BQB(12, jr2, viewModelListUpdate, A06), A06);
    }
}
