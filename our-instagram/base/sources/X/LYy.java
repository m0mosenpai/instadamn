package X;

import java.util.List;

/* loaded from: classes8.dex */
public final class LYy implements C5GZ {
    public final /* synthetic */ C7IX A00;

    public LYy(C7IX c7ix) {
        this.A00 = c7ix;
    }

    @Override // X.C5GZ
    public final void E0N(C3OO c3oo) {
        C7IX c7ix;
        C66362zD c66362zD;
        List AuX;
        InterfaceC66482zP interfaceC66482zP;
        C14360o3.A0B(c3oo, 0);
        int bindingAdapterPosition = c3oo.getBindingAdapterPosition();
        if (bindingAdapterPosition >= 0 && (c66362zD = (c7ix = this.A00).A00) != null && (AuX = c66362zD.A04.AuX()) != null && (interfaceC66482zP = (InterfaceC66482zP) AuX.get(bindingAdapterPosition)) != null) {
            C163547Tr c163547Tr = c7ix.A02;
            if (c163547Tr == null) {
                C14360o3.A0F("messageStore");
                throw C00O.createAndThrow();
            }
            c7ix.A0C.A00(AbstractC31171DnF.A06(c3oo), c163547Tr.BT7(interfaceC66482zP.getKey().toString()), AbstractC31172DnG.A00(c7ix.A0D));
        }
    }
}
