package X;

import java.util.List;

/* renamed from: X.Wjg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70887Wjg implements InterfaceC71978XDn {
    public final /* synthetic */ AbstractC67878V0j A00;

    @Override // X.InterfaceC71978XDn
    public final void Dax(C38657Gyy c38657Gyy) {
        XFN xfn;
        String str;
        AbstractC67878V0j abstractC67878V0j = this.A00;
        List list = c38657Gyy.A0B;
        if (list != null && (xfn = (XFN) list.get(0)) != null && (str = ((URD) xfn).A01) != null) {
            AbstractC67878V0j.A01(c38657Gyy, abstractC67878V0j, str, true);
            return;
        }
        throw new IllegalStateException("action key should not be null");
    }

    public C70887Wjg(AbstractC67878V0j abstractC67878V0j) {
        this.A00 = abstractC67878V0j;
    }

    @Override // X.InterfaceC71978XDn
    public final void DjY(C38657Gyy c38657Gyy) {
        AbstractC67878V0j abstractC67878V0j = this.A00;
        C18920wW c18920wW = abstractC67878V0j.A02;
        if (c18920wW == null) {
            C14360o3.A0F("typedLogger");
            throw C00O.createAndThrow();
        }
        C25531Mh A0H = C25531Mh.A0H(c18920wW);
        if (((AbstractC02600Aj) A0H).A00.isSampled()) {
            AbstractC65702TsY.A1G(A0H, c38657Gyy, c38657Gyy.A05);
            AbstractC65703TsZ.A1L(A0H, abstractC67878V0j);
        }
        C51042Mgs A07 = abstractC67878V0j.A07();
        C55168OdW.A03(A07.A0C, A07.A0F, A07.A0G, C57708Pix.A00);
    }

    @Override // X.InterfaceC71978XDn
    public final boolean Ejj(C38657Gyy c38657Gyy) {
        return this.A00.A07().A05();
    }

    @Override // X.InterfaceC71978XDn
    public final void DM1(UR1 ur1, C38657Gyy c38657Gyy) {
        boolean A1Y = AbstractC25229BEm.A1Y(ur1);
        AbstractC67878V0j abstractC67878V0j = this.A00;
        C18920wW c18920wW = abstractC67878V0j.A02;
        if (c18920wW == null) {
            C14360o3.A0F("typedLogger");
            throw C00O.createAndThrow();
        }
        C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "instagram_inform_module_action_button_click"), 293);
        String valueOf = String.valueOf(c38657Gyy.A05);
        String str = c38657Gyy.A06;
        if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
            c25531Mh.A0R("category_id", valueOf);
            c25531Mh.A0R("category_name", str);
            c25531Mh.A0Q("inform_module_id", AbstractC25231BEo.A0j(A1Y ? 1 : 0, valueOf));
            c25531Mh.A0R("inform_module_name", str);
            c25531Mh.A0R("action_button_name", ur1.A02);
            AbstractC65703TsZ.A1L(c25531Mh, abstractC67878V0j);
        }
        AbstractC67878V0j.A01(null, abstractC67878V0j, ur1.A00, A1Y);
    }
}
