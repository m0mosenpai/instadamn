package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.7Rd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC162927Rd extends AbstractC66422zJ {
    public final C7RX A00;
    public final C7QC A01;

    @Override // X.AbstractC66422zJ
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public C7SP createViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.A00.A00(layoutInflater, viewGroup, this.A01.ANU(layoutInflater, viewGroup));
    }

    @Override // X.AbstractC66422zJ
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public void bind(InterfaceC66482zP interfaceC66482zP, C7SP c7sp) {
        InterfaceC162797Qq interfaceC162797Qq = (InterfaceC162797Qq) interfaceC66482zP;
        this.A01.ADy(c7sp.A0M, interfaceC162797Qq.ArC());
        this.A00.A02(c7sp, interfaceC162797Qq.Apt());
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        C7SP c7sp = (C7SP) c3oo;
        this.A01.F91(c7sp.A0M);
        C7RX c7rx = this.A00;
        C162957Rg c162957Rg = c7sp.A0F;
        c162957Rg.A0A.A01();
        c162957Rg.A06 = null;
        C7S0 c7s0 = c7sp.A0P;
        if (c7s0 != null && c7rx.A04 != null) {
            c7s0.A02();
        }
        C7S9 c7s9 = c7sp.A0B;
        if (c7s9 != null && c7rx.A00 != null) {
            c7s9.A01.A03(8);
        }
        c7sp.A09.A00 = null;
    }

    public AbstractC162927Rd(C7RX c7rx, C7QC c7qc) {
        this.A01 = c7qc;
        this.A00 = c7rx;
    }
}
