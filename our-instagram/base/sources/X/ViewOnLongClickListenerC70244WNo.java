package X;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.WNo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnLongClickListenerC70244WNo implements View.OnLongClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ViewOnLongClickListenerC70244WNo(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.A00) {
            case 0:
                C149686oL c149686oL = new C149686oL(2131972995);
                UGe uGe = (UGe) this.A01;
                C5SU c5su = new C5SU((Activity) uGe.A02, c149686oL);
                ImageView imageView = ((C66438UHo) this.A02).A00;
                imageView.getClass();
                c5su.A03(imageView);
                c5su.A02();
                c5su.A07(C5SV.A06);
                c5su.A04 = new EfP(this, 1);
                c5su.A00().A07(uGe.A03);
                return true;
            case 1:
                C68247VJj c68247VJj = (C68247VJj) this.A01;
                C70998WmF c70998WmF = (C70998WmF) this.A02;
                String str = c68247VJj.A02;
                if (str == null) {
                    return false;
                }
                Context context = c70998WmF.A06.getContext();
                C14360o3.A0B(context, 0);
                String A0b = AbstractC31177DnL.A0b(context, str, 2131967864);
                C193328hC c193328hC = new C193328hC(context);
                c193328hC.A05 = A0b;
                c193328hC.A0H(null, 2131968948);
                AbstractC166987dD.A1W(c193328hC);
                return true;
            case 2:
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                Object obj = this.A01;
                C14360o3.A0A(obj);
                C1GJ.A03(new KK2(3, obj, this.A02));
                return true;
            default:
                Context context2 = ((C66413UGh) this.A02).A01;
                Object systemService = context2.getSystemService("clipboard");
                C14360o3.A0C(systemService, AbstractC111324zv.A00(68));
                VAO vao = (VAO) this.A01;
                String str2 = vao.A01;
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(str2, vao.A00));
                C9GR.A09(context2, AnonymousClass001.A0R("Copied ", str2));
                return true;
        }
    }
}
