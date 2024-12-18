package X;

import android.view.ActionMode;

/* renamed from: X.MCj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C50135MCj extends C03E implements InterfaceC16660sJ {
    public C50135MCj(Object obj) {
        super(1, obj, C1576575z.class, "onClick", "onClick(Landroid/view/ActionMode;)Z", 0);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ActionMode actionMode = (ActionMode) obj;
        C14360o3.A0B(actionMode, 0);
        C1576575z c1576575z = (C1576575z) this.receiver;
        InterfaceC16820sZ interfaceC16820sZ = c1576575z.A06;
        long length = ((CharSequence) interfaceC16820sZ.invoke()).length();
        C7F3 c7f3 = c1576575z.A04;
        boolean z = c1576575z.A09;
        boolean z2 = c1576575z.A08;
        String str = c1576575z.A05;
        C25531Mh A0H = AbstractC31172DnG.A0H(c7f3);
        EnumC72433Xdd A00 = C7F3.A00(z2, z);
        if (AbstractC25226BEj.A1Z(A0H)) {
            A0H.A0Z(24);
            A0H.A0R("selected_item", AbstractC111324zv.A00(5591));
            A0H.A0X(0);
            A0H.A0Q("text_length", Long.valueOf(length));
            JQ0.A15(A00, A0H, str, z2);
            A0H.Cht();
        }
        c1576575z.A00((String) interfaceC16820sZ.invoke(), c1576575z.A07, false);
        actionMode.finish();
        return AbstractC166997dE.A0b();
    }
}
