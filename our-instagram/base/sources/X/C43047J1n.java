package X;

import android.content.Context;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.J1n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43047J1n implements GZV {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ C41551w4 A02;
    public final /* synthetic */ C145176gc A03;

    public C43047J1n(Context context, AbstractC59962oe abstractC59962oe, C41551w4 c41551w4, C145176gc c145176gc) {
        this.A01 = abstractC59962oe;
        this.A03 = c145176gc;
        this.A00 = context;
        this.A02 = c41551w4;
    }

    @Override // X.GZV
    public final void Dxy(String str) {
        if (this.A01.isAdded()) {
            Context context = this.A00;
            C9GR.A03(context, context.getString(2131968098), MSV.A00(233), 0);
        }
    }

    @Override // X.GZV
    public final void Dy0(boolean z, boolean z2) {
        AbstractC59962oe abstractC59962oe = this.A01;
        if (abstractC59962oe.isAdded()) {
            C145176gc c145176gc = this.A03;
            InterfaceC1118853a interfaceC1118853a = c145176gc.A18;
            interfaceC1118853a.De0();
            Context context = this.A00;
            if (c145176gc.A09 == null) {
                AbstractC31171DnF.A0y();
                throw C00O.createAndThrow();
            }
            AbstractC34859FXt.A01(context, C05F.A0C, z, z2);
            InterfaceC147266kB interfaceC147266kB = ((ReelViewerFragment) interfaceC1118853a).mViewPager;
            if (interfaceC147266kB != null) {
                ((C147256kA) interfaceC147266kB).A02.postDelayed(new RunnableC43141J5e(abstractC59962oe, this.A02, c145176gc), 750L);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
