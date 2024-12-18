package com.instagram.debug.devoptions.signalsplayground.adapter;

import X.AbstractC166987dD;
import X.AbstractC25226BEj;
import X.AbstractC25231BEo;
import X.C0f9;
import X.C14360o3;
import X.C2UU;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalsQueryResponse;
import com.instagram.debug.devoptions.signalsplayground.view.CreatorInspirationSignalsPlaygroundSignalRowViewHolder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class CreatorInspirationSignalsPlaygroundSignalsAdapter extends C2UU {
    public final CreatorInspirationSignalsPlaygroundSignalRowViewHolder.Delegate delegate;
    public final ArrayList signals;

    public CreatorInspirationSignalsPlaygroundSignalsAdapter(CreatorInspirationSignalsPlaygroundSignalRowViewHolder.Delegate delegate) {
        C14360o3.A0B(delegate, 1);
        this.delegate = delegate;
        this.signals = AbstractC166987dD.A1E();
    }

    @Override // X.C2UU
    public void onBindViewHolder(CreatorInspirationSignalsPlaygroundSignalRowViewHolder creatorInspirationSignalsPlaygroundSignalRowViewHolder, int i) {
        C14360o3.A0B(creatorInspirationSignalsPlaygroundSignalRowViewHolder, 0);
        Object obj = this.signals.get(i);
        C14360o3.A07(obj);
        creatorInspirationSignalsPlaygroundSignalRowViewHolder.bind((CreatorInspirationSignalsPlaygroundSignalsQueryResponse.XdtGetCreatorsSignalPlayground.Signals) obj);
    }

    @Override // X.C2UU
    public CreatorInspirationSignalsPlaygroundSignalRowViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new CreatorInspirationSignalsPlaygroundSignalRowViewHolder(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.creator_inspiration_signals_playground_signal_row_item, false), this.delegate);
    }

    public final void setSignals(List list) {
        C14360o3.A0B(list, 0);
        ArrayList arrayList = this.signals;
        arrayList.clear();
        arrayList.addAll(list);
        notifyItemRangeChanged(0, list.size());
    }

    @Override // X.C2UU
    public int getItemCount() {
        int A03 = C0f9.A03(-1315865076);
        int size = this.signals.size();
        C0f9.A0A(685069504, A03);
        return size;
    }
}
