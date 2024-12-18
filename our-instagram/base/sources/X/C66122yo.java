package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.Map;

/* renamed from: X.2yo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66122yo implements InterfaceC66092yl {
    public static final void A00(InterfaceC55362gb interfaceC55362gb, C4NJ c4nj, C81383k8 c81383k8, Map map) {
        C62862tP c62862tP;
        C14360o3.A0B(c81383k8, 0);
        if ((interfaceC55362gb instanceof C64842wi) && (c62862tP = (C62862tP) ((C64842wi) interfaceC55362gb).A02.getValue()) != null) {
            Context context = c81383k8.A01.getContext();
            C14360o3.A07(context);
            c62862tP.A01.put(R.id.bloks_action_listener, new C69244VkC(context, c62862tP, interfaceC55362gb, c4nj, c81383k8, map));
        }
    }

    @Override // X.InterfaceC66092yl
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void ADw(InterfaceC55362gb interfaceC55362gb, C4NJ c4nj, C81383k8 c81383k8) {
        C14360o3.A0B(c81383k8, 0);
        C14360o3.A0B(c4nj, 2);
        A00(interfaceC55362gb, c4nj, c81383k8, null);
    }

    @Override // X.InterfaceC66092yl
    public final View Csl(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.bloks_megaphone, viewGroup, false);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0A(inflate);
        inflate.setTag(new C81383k8(inflate));
        return inflate;
    }

    @Override // X.InterfaceC66092yl
    public final /* bridge */ /* synthetic */ void AE0(C3OO c3oo, InterfaceC55362gb interfaceC55362gb, C4NJ c4nj, Map map) {
        A00(interfaceC55362gb, c4nj, (C81383k8) c3oo, map);
    }
}
