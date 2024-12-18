package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.login.api.AssistAccountRecoveryResponse$UhlAccount;
import java.util.List;

/* renamed from: X.DxN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31766DxN extends BaseAdapter {
    public Context A00;
    public EJ9 A01;
    public List A02;
    public final InterfaceC11380iw A03;

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A02.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.A02.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return this.A02.get(i).hashCode();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.uhl_multiple_account_row_item);
            view.setTag(new FM8(view));
        }
        FM8 fm8 = (FM8) AbstractC31172DnG.A0x(view);
        AssistAccountRecoveryResponse$UhlAccount assistAccountRecoveryResponse$UhlAccount = (AssistAccountRecoveryResponse$UhlAccount) this.A02.get(i);
        EJ9 ej9 = this.A01;
        InterfaceC11380iw interfaceC11380iw = this.A03;
        ViewOnClickListenerC31591DuJ.A00(fm8.A00, 53, assistAccountRecoveryResponse$UhlAccount, ej9);
        fm8.A03.setUrl(assistAccountRecoveryResponse$UhlAccount.A00, interfaceC11380iw);
        boolean isEmpty = TextUtils.isEmpty(assistAccountRecoveryResponse$UhlAccount.A01);
        TextView textView = fm8.A01;
        if (!isEmpty) {
            textView.setVisibility(0);
            textView.setText(assistAccountRecoveryResponse$UhlAccount.A01);
        } else {
            textView.setVisibility(8);
        }
        fm8.A02.setText(assistAccountRecoveryResponse$UhlAccount.A03);
        return view;
    }

    public C31766DxN(Context context, InterfaceC11380iw interfaceC11380iw, EJ9 ej9, List list) {
        this.A02 = list;
        this.A00 = context;
        this.A01 = ej9;
        this.A03 = interfaceC11380iw;
    }
}
