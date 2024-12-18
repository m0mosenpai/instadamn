package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;

/* loaded from: classes11.dex */
public final class WPU implements XEV, AdapterView.OnItemClickListener {
    public int A00;
    public Context A01;
    public LayoutInflater A02;
    public ExpandedMenuView A03;
    public UBB A04;
    public WQH A05;
    public InterfaceC71933XBi A06;

    @Override // X.XEV
    public final boolean AIM(WQH wqh, WQJ wqj) {
        return false;
    }

    @Override // X.XEV
    public final boolean ATp(WQH wqh, WQJ wqj) {
        return false;
    }

    @Override // X.XEV
    public final boolean AVx() {
        return false;
    }

    @Override // X.XEV
    public final void CNw(Context context, WQH wqh) {
        if (this.A01 != null) {
            this.A01 = context;
            if (this.A02 == null) {
                this.A02 = LayoutInflater.from(context);
            }
        }
        this.A05 = wqh;
        UBB ubb = this.A04;
        if (ubb != null) {
            C0fA.A00(ubb, -31315371);
        }
    }

    @Override // X.XEV
    public final void D5e(WQH wqh, boolean z) {
        InterfaceC71933XBi interfaceC71933XBi = this.A06;
        if (interfaceC71933XBi != null) {
            interfaceC71933XBi.D5e(wqh, z);
        }
    }

    @Override // X.XEV
    public final void FBO(boolean z) {
        UBB ubb = this.A04;
        if (ubb != null) {
            C0fA.A00(ubb, 397662761);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.A05.A0I(this.A04.getItem(i), this, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.WPU, java.lang.Object, X.XEV] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.DialogInterface$OnClickListener, android.content.DialogInterface$OnKeyListener, X.WIA, X.XBi, java.lang.Object, android.content.DialogInterface$OnDismissListener] */
    @Override // X.XEV
    public final boolean DpV(UDI udi) {
        if (!udi.hasVisibleItems()) {
            return false;
        }
        ?? obj = new Object();
        obj.A02 = udi;
        Context context = udi.A0M;
        C69797Vvh c69797Vvh = new C69797Vvh(context);
        C69487VoA c69487VoA = c69797Vvh.A01;
        Context context2 = c69487VoA.A0L;
        ?? obj2 = new Object();
        obj2.A00 = R.layout.abc_list_menu_item_layout;
        obj2.A01 = context2;
        obj2.A02 = LayoutInflater.from(context2);
        obj.A01 = obj2;
        obj2.A06 = obj;
        udi.A07(context, obj2);
        WPU wpu = obj.A01;
        UBB ubb = wpu.A04;
        if (ubb == null) {
            ubb = new UBB(wpu);
            wpu.A04 = ubb;
        }
        c69487VoA.A0B = ubb;
        c69487VoA.A03 = obj;
        View view = udi.A02;
        if (view != null) {
            c69487VoA.A09 = view;
        } else {
            c69487VoA.A08 = ((WQH) udi).A01;
            c69797Vvh.A08(udi.A05);
        }
        c69487VoA.A06 = obj;
        UD9 A00 = c69797Vvh.A00();
        obj.A00 = A00;
        A00.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.A00.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
        C0fJ.A00(obj.A00);
        InterfaceC71933XBi interfaceC71933XBi = this.A06;
        if (interfaceC71933XBi != null) {
            interfaceC71933XBi.DWt(udi);
            return true;
        }
        return true;
    }

    @Override // X.XEV
    public final void EQl(InterfaceC71933XBi interfaceC71933XBi) {
        this.A06 = interfaceC71933XBi;
    }
}
