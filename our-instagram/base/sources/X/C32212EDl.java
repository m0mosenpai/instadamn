package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.List;

/* renamed from: X.EDl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32212EDl extends C40781ul implements InterfaceC168867gL {
    public String A00;
    public List A01;
    public boolean A02;

    @Override // X.InterfaceC168867gL
    public final Object B3l() {
        return null;
    }

    @Override // X.InterfaceC168867gL
    public final String Bk6() {
        return null;
    }

    @Override // X.InterfaceC168867gL
    public final Integer BmK() {
        return null;
    }

    @Override // X.InterfaceC168867gL
    public final String Bo9() {
        return null;
    }

    @Override // X.InterfaceC168867gL
    public final List Bri() {
        return null;
    }

    @Override // X.InterfaceC168867gL
    public final List getItems() {
        List list = this.A01;
        if (list != null) {
            return list;
        }
        C14360o3.A0F(DialogModule.KEY_ITEMS);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC168867gL
    public final /* bridge */ /* synthetic */ boolean CLI() {
        return this.A02;
    }

    @Override // X.InterfaceC168867gL, X.InterfaceC74303Vl
    public final String getNextMaxId() {
        return this.A00;
    }
}
