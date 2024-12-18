package com.instagram.debug.devoptions.section.localinjection;

import X.AbstractC001800i;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25227BEk;
import X.AbstractC31177DnL;
import X.C01T;
import X.C0f9;
import X.C0fQ;
import X.C14360o3;
import X.C2UU;
import X.C3OO;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.debug.devoptions.section.localinjection.InjectionMediaSelectionAdapter;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalInjectionUnit;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes11.dex */
public final class InjectionMediaSelectionAdapter extends C2UU {
    public final Delegate delegate;
    public final List mediaInjectionsList;
    public final Set savedMediaInjections;

    /* loaded from: classes11.dex */
    public interface Delegate {
        void onItemSelectionChanged(Set set);
    }

    /* loaded from: classes11.dex */
    public final class InjectionMediaViewHolder extends C3OO {
        public View injectedMediaRow;
        public IgdsSwitch injectedMediaSwitch;
        public TextView injectedMediaText;
        public final /* synthetic */ InjectionMediaSelectionAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InjectionMediaViewHolder(InjectionMediaSelectionAdapter injectionMediaSelectionAdapter, View view) {
            super(view);
            C14360o3.A0B(view, 2);
            this.this$0 = injectionMediaSelectionAdapter;
            this.injectedMediaSwitch = (IgdsSwitch) view.findViewById(R.id.inject_media_toggle_switch);
            this.injectedMediaText = (TextView) view.findViewById(R.id.inject_media_toggle_text);
            this.injectedMediaRow = view;
        }

        public final void setInjectedMediaRow(View view) {
            C14360o3.A0B(view, 0);
            this.injectedMediaRow = view;
        }

        public final void setInjectedMediaSwitch(IgdsSwitch igdsSwitch) {
            C14360o3.A0B(igdsSwitch, 0);
            this.injectedMediaSwitch = igdsSwitch;
        }

        public final void setInjectedMediaText(TextView textView) {
            C14360o3.A0B(textView, 0);
            this.injectedMediaText = textView;
        }

        public final void bindView(int i) {
            final LocalInjectionUnit localInjectionUnit = (LocalInjectionUnit) this.this$0.mediaInjectionsList.get(i);
            this.injectedMediaText.setText(localInjectionUnit.unitName);
            IgdsSwitch igdsSwitch = this.injectedMediaSwitch;
            final InjectionMediaSelectionAdapter injectionMediaSelectionAdapter = this.this$0;
            igdsSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.devoptions.section.localinjection.InjectionMediaSelectionAdapter$InjectionMediaViewHolder$bindView$1
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    Set set = InjectionMediaSelectionAdapter.this.savedMediaInjections;
                    String str = localInjectionUnit.unitId;
                    if (z) {
                        set.add(str);
                    } else {
                        set.remove(str);
                    }
                    InjectionMediaSelectionAdapter injectionMediaSelectionAdapter2 = InjectionMediaSelectionAdapter.this;
                    injectionMediaSelectionAdapter2.delegate.onItemSelectionChanged(injectionMediaSelectionAdapter2.savedMediaInjections);
                }
            });
            this.injectedMediaSwitch.setChecked(this.this$0.savedMediaInjections.contains(localInjectionUnit.unitId));
            C0fQ.A00(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.localinjection.InjectionMediaSelectionAdapter$InjectionMediaViewHolder$bindView$2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int A05 = C0f9.A05(89826728);
                    InjectionMediaSelectionAdapter.InjectionMediaViewHolder.this.injectedMediaSwitch.setCheckedAnimated(!r1.isChecked());
                    C0f9.A0C(-384689608, A05);
                }
            }, this.injectedMediaRow);
        }

        public final View getInjectedMediaRow() {
            return this.injectedMediaRow;
        }

        public final IgdsSwitch getInjectedMediaSwitch() {
            return this.injectedMediaSwitch;
        }

        public final TextView getInjectedMediaText() {
            return this.injectedMediaText;
        }
    }

    @Override // X.C2UU
    public void onBindViewHolder(InjectionMediaViewHolder injectionMediaViewHolder, int i) {
        C14360o3.A0B(injectionMediaViewHolder, 0);
        injectionMediaViewHolder.bindView(i);
    }

    @Override // X.C2UU
    public InjectionMediaViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new InjectionMediaViewHolder(this, AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.media_injection_toggle_row, false));
    }

    public final void updateList(List list) {
        C14360o3.A0B(list, 0);
        List list2 = this.mediaInjectionsList;
        list2.clear();
        list2.addAll(list);
        C01T.A1C(list2);
        notifyDataSetChanged();
    }

    public InjectionMediaSelectionAdapter(Delegate delegate, List list, Set set) {
        AbstractC167027dH.A13(delegate, list, set);
        this.delegate = delegate;
        ArrayList arrayList = new ArrayList(list);
        C01T.A1C(arrayList);
        this.mediaInjectionsList = arrayList;
        this.savedMediaInjections = AbstractC001800i.A0j(set);
    }

    @Override // X.C2UU
    public int getItemCount() {
        int A03 = C0f9.A03(526402155);
        int size = this.mediaInjectionsList.size();
        C0f9.A0A(-1454723962, A03);
        return size;
    }

    public final void setMediaInjectionsList(List list, Set set) {
        AbstractC167017dG.A1N(list, set);
        List list2 = this.mediaInjectionsList;
        list2.clear();
        list2.addAll(list);
        C01T.A1C(list2);
        Set set2 = this.savedMediaInjections;
        set2.clear();
        set2.addAll(set);
        notifyDataSetChanged();
    }
}
