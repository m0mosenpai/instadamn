package X;

import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.WOb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70256WOb implements AdapterView.OnItemClickListener {
    public final int A00;
    public final Object A01;

    /* JADX WARN: Type inference failed for: r2v2, types: [X.V1i, androidx.fragment.app.Fragment, X.53Z] */
    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        String str;
        long j2 = j;
        int i2 = i;
        View view2 = view;
        switch (this.A00) {
            case 0:
                ((SearchView) this.A01).A0D(i);
                return;
            case 1:
                AdapterView.OnItemClickListener onItemClickListener = (AdapterView.OnItemClickListener) this.A01;
                if (onItemClickListener != null) {
                    onItemClickListener.onItemClick(adapterView, view2, i2, j2);
                    return;
                }
                return;
            case 2:
                UDN udn = (UDN) this.A01;
                if (i < 0) {
                    WPW wpw = udn.A02;
                    if (!wpw.A09.isShowing()) {
                        item = null;
                    } else {
                        item = wpw.A0A.getSelectedItem();
                    }
                } else {
                    item = udn.getAdapter().getItem(i);
                }
                UDN.A00(udn, item);
                AdapterView.OnItemClickListener onItemClickListener2 = udn.getOnItemClickListener();
                if (onItemClickListener2 != null) {
                    if (view == null || i < 0) {
                        WPW wpw2 = udn.A02;
                        PopupWindow popupWindow = wpw2.A09;
                        if (!popupWindow.isShowing()) {
                            view2 = null;
                        } else {
                            view2 = wpw2.A0A.getSelectedView();
                        }
                        if (!popupWindow.isShowing()) {
                            i2 = -1;
                        } else {
                            i2 = wpw2.A0A.getSelectedItemPosition();
                        }
                        if (!popupWindow.isShowing()) {
                            j2 = Long.MIN_VALUE;
                        } else {
                            j2 = wpw2.A0A.getSelectedItemId();
                        }
                    }
                    onItemClickListener2.onItemClick(udn.A02.A0A, view2, i2, j2);
                }
                udn.A02.dismiss();
                return;
            default:
                V1V v1v = (V1V) this.A01;
                C70267WOw c70267WOw = v1v.A01;
                if (c70267WOw == null) {
                    str = "adapter";
                } else {
                    C69703Vty c69703Vty = (C69703Vty) c70267WOw.getItem(i);
                    ?? c53z = new C53Z();
                    c53z.A00 = c69703Vty;
                    FragmentActivity requireActivity = v1v.requireActivity();
                    UserSession userSession = v1v.A00;
                    if (userSession == null) {
                        str = "userSession";
                    } else {
                        AbstractC31177DnL.A16(c53z, requireActivity, userSession);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
        }
    }

    public C70256WOb(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
