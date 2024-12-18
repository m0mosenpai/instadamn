package X;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Iterator;

/* renamed from: X.WOd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70258WOd implements AdapterView.OnItemClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C70258WOd(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (this.A00) {
            case 0:
                C69487VoA c69487VoA = (C69487VoA) this.A01;
                DialogInterface.OnClickListener onClickListener = c69487VoA.A03;
                UD5 ud5 = ((W9C) this.A02).A0V;
                onClickListener.onClick(ud5, i);
                if (!c69487VoA.A0I) {
                    ud5.dismiss();
                    return;
                }
                return;
            case 1:
                UDs uDs = (UDs) this.A01;
                UCx uCx = uDs.A04;
                uCx.setSelection(i);
                if (uCx.getOnItemClickListener() != null) {
                    uCx.performItemClick(view, i, uDs.A01.getItemId(i));
                }
                uDs.dismiss();
                return;
            default:
                MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) this.A02;
                if (i >= materialCalendarGridView.A00().A04.A00() && i <= (r2.A00() + r2.A01) - 1) {
                    X83 x83 = ((UGn) this.A01).A04;
                    long longValue = materialCalendarGridView.A00().getItem(i).longValue();
                    UEx uEx = ((WcR) x83).A00;
                    if (uEx.A04.A03.CfP(longValue)) {
                        uEx.A06.EMp(longValue);
                        Iterator it = uEx.A0A.iterator();
                        if (it.hasNext()) {
                            it.next();
                            throw new NullPointerException("onSelectionChanged");
                        }
                        uEx.A02.A0A.notifyDataSetChanged();
                        RecyclerView recyclerView = uEx.A03;
                        if (recyclerView != null) {
                            recyclerView.A0A.notifyDataSetChanged();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
