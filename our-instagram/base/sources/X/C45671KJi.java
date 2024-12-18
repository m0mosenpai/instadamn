package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.KJi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45671KJi extends AbstractC66422zJ {
    public boolean A00;
    public final int A01;
    public final Integer A02;
    public final Integer A03;
    public final InterfaceC16820sZ A04;
    public final InterfaceC16820sZ A05;
    public final InterfaceC16660sJ A06;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new Jp2(new IgdsBanner(AbstractC31176DnK.A04(viewGroup), null, 0));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String str;
        LZQ lzq = (LZQ) interfaceC66482zP;
        Jp2 jp2 = (Jp2) c3oo;
        boolean A1a = AbstractC167017dG.A1a(lzq, jp2);
        if (!this.A00) {
            this.A06.invoke(lzq.A00);
            this.A00 = A1a;
        }
        IgdsBanner igdsBanner = jp2.A00;
        Context A0L = AbstractC166997dE.A0L(igdsBanner);
        AbstractC46382Kg4 abstractC46382Kg4 = lzq.A01;
        if (abstractC46382Kg4 instanceof KA9) {
            str = ((KA9) abstractC46382Kg4).A00;
        } else {
            str = null;
        }
        int i = this.A01;
        Integer num = this.A03;
        Integer num2 = this.A02;
        EnumC46209Kcl enumC46209Kcl = lzq.A00;
        AbstractC33783Ew9.A00(A0L, igdsBanner, num2, num, str, this.A04, this.A05, i, enumC46209Kcl.A01, enumC46209Kcl.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return LZQ.class;
    }

    public C45671KJi(Integer num, Integer num2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, int i) {
        this.A01 = i;
        this.A02 = num;
        this.A03 = num2;
        this.A04 = interfaceC16820sZ;
        this.A05 = interfaceC16820sZ2;
        this.A06 = interfaceC16660sJ;
    }
}
